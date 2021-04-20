package org.linphone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.mediastream.Log;

public class DozeReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (LinphoneService.isReady()) {
            boolean isDebugEnabled = LinphonePreferences.instance().isDebugEnabled();
            LinphoneCoreFactory.instance().enableLogCollection(isDebugEnabled);
            LinphoneCoreFactory.instance().setDebugMode(isDebugEnabled, context.getString(C5321R.string.app_name));
            if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null) {
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (Build.VERSION.SDK_INT >= 23) {
                    boolean isDeviceIdleMode = powerManager.isDeviceIdleMode();
                    Log.m6905i("[DozeReceiver] Idle Mode: " + isDeviceIdleMode);
                    LinphoneManager.getInstance().setDozeModeEnabled(isDeviceIdleMode);
                    LinphoneManager.getInstance().updateNetworkReachability();
                }
            }
        }
    }
}
