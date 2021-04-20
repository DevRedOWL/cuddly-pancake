package org.linphone.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.linphone.CallIncomingActivity;

public class ScreenOnOff extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
            Intent intent2 = new Intent(context, CallIncomingActivity.class);
            intent2.addFlags(268435456);
            intent2.putExtra("close", false).addFlags(65536);
            context.startActivity(intent2);
        }
    }
}
