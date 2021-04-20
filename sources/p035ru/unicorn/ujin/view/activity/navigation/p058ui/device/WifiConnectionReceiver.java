package p035ru.unicorn.ujin.view.activity.navigation.p058ui.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import androidx.lifecycle.MutableLiveData;
import p035ru.unicorn.ujin.view.activity.navigation.helper.InternetHelper;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.device.WifiConnectionReceiver */
public class WifiConnectionReceiver extends BroadcastReceiver {
    private final MutableLiveData<Boolean> hasWifiConnection = new MutableLiveData<>();

    public MutableLiveData<Boolean> getHasWifiConnection() {
        return this.hasWifiConnection;
    }

    public void onReceive(Context context, Intent intent) {
        Boolean valueOf = this.hasWifiConnection.getValue() == null ? Boolean.valueOf(InternetHelper.isWifiConnection(context)) : this.hasWifiConnection.getValue();
        if ((intent.getAction() != null ? intent.getAction() : "").equals("android.net.wifi.STATE_CHANGE")) {
            boolean isConnected = ((NetworkInfo) intent.getParcelableExtra("networkInfo")).isConnected();
            if (!valueOf.booleanValue() && isConnected) {
                this.hasWifiConnection.postValue(true);
            } else if (valueOf.booleanValue() && !isConnected) {
                this.hasWifiConnection.postValue(false);
            }
        }
    }
}
