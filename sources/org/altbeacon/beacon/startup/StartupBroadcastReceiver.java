package org.altbeacon.beacon.startup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.logging.LogManager;
import org.altbeacon.beacon.service.ScanJobScheduler;

public class StartupBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "StartupBroadcastReceiver";

    public void onReceive(Context context, Intent intent) {
        LogManager.m6834d(TAG, "onReceive called in startup broadcast receiver", new Object[0]);
        if (Build.VERSION.SDK_INT < 18) {
            LogManager.m6842w(TAG, "Not starting up beacon service because we do not have API version 18 (Android 4.3).  We have: %s", Integer.valueOf(Build.VERSION.SDK_INT));
            return;
        }
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(context.getApplicationContext());
        if (instanceForApplication.isAnyConsumerBound() || instanceForApplication.getScheduledScanJobsEnabled()) {
            int intExtra = intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", -1);
            if (intExtra != -1) {
                LogManager.m6834d(TAG, "Passive background scan callback type: " + intExtra, new Object[0]);
                LogManager.m6834d(TAG, "got Android O background scan via intent", new Object[0]);
                int intExtra2 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", -1);
                if (intExtra2 != -1) {
                    LogManager.m6842w(TAG, "Passive background scan failed.  Code; " + intExtra2, new Object[0]);
                }
                ScanJobScheduler.getInstance().scheduleAfterBackgroundWakeup(context, intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT"));
            } else if (intent.getBooleanExtra("wakeup", false)) {
                LogManager.m6834d(TAG, "got wake up intent", new Object[0]);
            } else {
                LogManager.m6834d(TAG, "Already started.  Ignoring intent: %s of type: %s", intent, intent.getStringExtra("wakeup"));
            }
        } else {
            LogManager.m6834d(TAG, "No consumers are bound.  Ignoring broadcast receiver.", new Object[0]);
        }
    }
}
