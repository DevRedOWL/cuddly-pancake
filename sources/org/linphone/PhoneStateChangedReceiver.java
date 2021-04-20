package org.linphone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

public class PhoneStateChangedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("state");
        if (LinphoneManager.isInstanciated()) {
            if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(stringExtra) || TelephonyManager.EXTRA_STATE_RINGING.equals(stringExtra)) {
                LinphoneManager.getInstance().setCallGsmON(true);
                LinphoneManager.getLc().pauseAllCalls();
            } else if (TelephonyManager.EXTRA_STATE_IDLE.equals(stringExtra)) {
                LinphoneManager.getInstance().setCallGsmON(false);
            }
        }
    }
}
