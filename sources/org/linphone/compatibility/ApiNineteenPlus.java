package org.linphone.compatibility;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

public class ApiNineteenPlus {
    public static void scheduleAlarm(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }
}
