package org.linphone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gcm.GCMConstants;
import org.linphone.core.LinphoneCoreFactory;

public class BootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        LinphonePreferences.instance().setContext(context);
        if (intent.getAction().equalsIgnoreCase("android.intent.action.ACTION_SHUTDOWN")) {
            Log.d("LinphoneBootReceiver", "Device is shutting down, destroying LinphoneCore to unregister");
            LinphoneManager.destroy();
            return;
        }
        boolean bool = LinphoneCoreFactory.instance().createLpConfig(context.getFilesDir().getAbsolutePath() + "/.linphonerc").getBool(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "auto_start", false);
        Log.i("LinphoneBootReceiver", "Device is starting, auto_start is " + bool);
    }
}
