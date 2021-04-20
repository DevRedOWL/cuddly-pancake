package com.google.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class GCMBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "GCMBroadcastReceiver";
    private static boolean mReceiverSet = false;

    public final void onReceive(Context context, Intent intent) {
        Log.v(TAG, "onReceive: " + intent.getAction());
        if (!mReceiverSet) {
            mReceiverSet = true;
            String name = getClass().getName();
            if (!name.equals(GCMBroadcastReceiver.class.getName())) {
                GCMRegistrar.setRetryReceiverClassName(name);
            }
        }
        String gCMIntentServiceClassName = getGCMIntentServiceClassName(context);
        Log.v(TAG, "GCM IntentService class: " + gCMIntentServiceClassName);
        GCMBaseIntentService.runIntentInService(context, intent, gCMIntentServiceClassName);
        setResult(-1, (String) null, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    public String getGCMIntentServiceClassName(Context context) {
        return getDefaultIntentServiceClassName(context);
    }

    static final String getDefaultIntentServiceClassName(Context context) {
        return context.getPackageName() + GCMConstants.DEFAULT_INTENT_SERVICE_CLASS_NAME;
    }
}
