package org.altbeacon.beacon.powersave;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.logging.LogManager;

public class BackgroundPowerSaver implements Application.ActivityLifecycleCallbacks {
    private static final String TAG = "BackgroundPowerSaver";
    private int activeActivityCount;
    private final BeaconManager beaconManager;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    @Deprecated
    public BackgroundPowerSaver(Context context, boolean z) {
        this(context);
    }

    public BackgroundPowerSaver(Context context) {
        this.activeActivityCount = 0;
        if (Build.VERSION.SDK_INT < 18) {
            LogManager.m6842w(TAG, "BackgroundPowerSaver requires API 18 or higher.", new Object[0]);
        }
        this.beaconManager = BeaconManager.getInstanceForApplication(context);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public void onActivityResumed(Activity activity) {
        this.activeActivityCount++;
        int i = this.activeActivityCount;
        if (i < 1) {
            LogManager.m6834d(TAG, "reset active activity count on resume.  It was %s", Integer.valueOf(i));
            this.activeActivityCount = 1;
        }
        this.beaconManager.setBackgroundMode(false);
        LogManager.m6834d(TAG, "activity resumed: %s active activities: %s", activity, Integer.valueOf(this.activeActivityCount));
    }

    public void onActivityPaused(Activity activity) {
        this.activeActivityCount--;
        LogManager.m6834d(TAG, "activity paused: %s active activities: %s", activity, Integer.valueOf(this.activeActivityCount));
        if (this.activeActivityCount < 1) {
            LogManager.m6834d(TAG, "setting background mode", new Object[0]);
            this.beaconManager.setBackgroundMode(true);
        }
    }
}
