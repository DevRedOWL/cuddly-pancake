package org.linphone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.linphone.mediastream.Log;

public class HookReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (isOrderedBroadcast()) {
            abortBroadcast();
        }
        if (intent.getExtras().getBoolean("hookoff")) {
            Log.m6905i(" ======>>>>>> HookReceiver - handset ON");
            LinphoneManager.getLc().enableSpeaker(false);
            if (!LinphoneManager.getInstance().isHansetModeOn()) {
                LinphoneManager.getInstance().setHandsetMode(true);
                return;
            }
            return;
        }
        Log.m6905i(" ======>>>>>> HookReceiver - handset OFF");
        LinphoneManager.getLc().enableSpeaker(true);
        LinphoneManager.getInstance().setHandsetMode(false);
    }
}
