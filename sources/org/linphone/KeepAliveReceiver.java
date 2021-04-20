package org.linphone;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import org.linphone.compatibility.Compatibility;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.mediastream.Log;

public class KeepAliveReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent intent2;
        Class<KeepAliveReceiver> cls = KeepAliveReceiver.class;
        if (LinphoneService.isReady()) {
            boolean isDebugEnabled = LinphonePreferences.instance().isDebugEnabled();
            LinphoneCoreFactory.instance().enableLogCollection(isDebugEnabled);
            LinphoneCoreFactory.instance().setDebugMode(isDebugEnabled, context.getString(C5321R.string.app_name));
            LinphoneCore lcIfManagerNotDestroyedOrNull = LinphoneManager.getLcIfManagerNotDestroyedOrNull();
            if (lcIfManagerNotDestroyedOrNull != null) {
                String action = intent.getAction();
                if (action == null) {
                    Log.m6905i("[KeepAlive] Refresh registers");
                    lcIfManagerNotDestroyedOrNull.refreshRegisters();
                    try {
                        Thread.sleep(2000);
                        intent2 = new Intent(context, cls);
                    } catch (InterruptedException e) {
                        Log.m6903e("Cannot sleep for 2s", e);
                        intent2 = new Intent(context, cls);
                    } catch (Throwable th) {
                        Compatibility.scheduleAlarm((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), 2, SystemClock.elapsedRealtime() + 600000, PendingIntent.getBroadcast(context, 0, new Intent(context, cls), BasicMeasure.EXACTLY));
                        throw th;
                    }
                    Compatibility.scheduleAlarm((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), 2, SystemClock.elapsedRealtime() + 600000, PendingIntent.getBroadcast(context, 0, intent2, BasicMeasure.EXACTLY));
                } else if (action.equalsIgnoreCase("android.intent.action.SCREEN_ON")) {
                    Log.m6905i("[KeepAlive] Screen is on, enable");
                    lcIfManagerNotDestroyedOrNull.enableKeepAlive(true);
                } else if (action.equalsIgnoreCase("android.intent.action.SCREEN_OFF")) {
                    Log.m6905i("[KeepAlive] Screen is off, disable");
                    lcIfManagerNotDestroyedOrNull.enableKeepAlive(false);
                }
            }
        }
    }
}
