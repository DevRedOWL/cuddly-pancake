package p035ru.unicorn.ujin.data.service.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import p035ru.unicorn.ujin.data.realm.PushAction;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.UpdatePointsSession;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;

/* renamed from: ru.unicorn.ujin.data.service.location.HomeWifiConnection */
public class HomeWifiConnection extends BroadcastReceiver {
    LocalRepository localRepository;
    LocationRepository remoteRepository;

    public void onReceive(Context context, Intent intent) {
        WifiManager wifiManager;
        if (this.localRepository == null) {
            this.localRepository = LocalRepository.getInstance();
        }
        if (this.remoteRepository == null) {
            this.remoteRepository = new LocationRepository();
        }
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null && networkInfo.isConnected() && (wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi")) != null) {
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            String bssid = connectionInfo.getBSSID();
            connectionInfo.getSSID().replaceAll("\"", "");
            if (isHomeID(bssid)) {
                this.remoteRepository.updatePoints(LocationHelper.createPoint(context, wifiManager, (Location) null), (String) null).doOnNext($$Lambda$HomeWifiConnection$TDQksF1G8SKr2jX8EUcQhA4Yuo.INSTANCE).subscribe();
            }
        }
    }

    static /* synthetic */ void lambda$onReceive$0(Resource resource) throws Exception {
        if (resource.getData() != null && ((UpdatePointsSession) resource.getData()).getActionForPush() != null && ((UpdatePointsSession) resource.getData()).getActionForPush().getActionUrl() != null) {
            PushAction actionForPush = ((UpdatePointsSession) resource.getData()).getActionForPush();
            actionForPush.getPushTitle();
            actionForPush.getPushBody();
        }
    }

    private boolean isHomeID(String str) {
        return this.localRepository.isHomeID(str);
    }
}
