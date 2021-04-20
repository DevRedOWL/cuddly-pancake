package org.linphone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class AccountEnableReceiver extends BroadcastReceiver {
    private static final String FIELD_ACTIVE = "active";
    private static final String FIELD_ID = "id";
    private static final String TAG = "AccountEnableReceiver";

    public void onReceive(Context context, Intent intent) {
        int longExtra = (int) intent.getLongExtra("id", -1);
        boolean booleanExtra = intent.getBooleanExtra("active", true);
        Log.i(TAG, "Received broadcast for index=" + Integer.toString(longExtra) + ",enable=" + Boolean.toString(booleanExtra));
        if (longExtra >= 0 && longExtra < LinphonePreferences.instance().getAccountCount()) {
            LinphonePreferences.instance().setAccountEnabled(longExtra, booleanExtra);
        }
    }
}
