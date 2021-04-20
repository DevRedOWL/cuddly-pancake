package org.linphone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class OutgoingCallReceiver extends BroadcastReceiver {
    private static final String TAG = "CallHandler";
    private final String ACTION_CALL_LINPHONE = "org.linphone.intent.action.CallLaunched";
    private LinphonePreferences mPrefs;

    public void onReceive(Context context, Intent intent) {
        this.mPrefs = LinphonePreferences.instance();
        Log.e(TAG, "===>>>> Linphone OutgoingCallReceiver ");
        if (intent.getAction().equals("android.intent.action.NEW_OUTGOING_CALL")) {
            Log.e(TAG, "===>>>> Linphone OutgoingCallReceiver : ACTION_NEW_OUTGOING_CALL");
            String stringExtra = intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
            if (this.mPrefs.getConfig() != null && this.mPrefs.getNativeDialerCall()) {
                abortBroadcast();
                setResultData((String) null);
                Intent intent2 = new Intent("org.linphone.intent.action.CallLaunched");
                intent2.setFlags(268435456);
                intent2.putExtra("StartCall", true);
                intent2.putExtra("NumberToCall", stringExtra);
                context.startActivity(intent2);
            }
        }
    }
}
