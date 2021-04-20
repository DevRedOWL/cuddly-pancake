package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.play.core.internal.C2241ag;

public class ExtractionForegroundService extends Service {

    /* renamed from: a */
    Context f1497a;

    /* renamed from: b */
    C2209i f1498b;

    /* renamed from: c */
    NotificationManager f1499c;

    /* renamed from: d */
    private final C2241ag f1500d = new C2241ag("ExtractionForegroundService");

    /* renamed from: a */
    private final synchronized void m823a(Intent intent) {
        String stringExtra = intent.getStringExtra("notification_title");
        String stringExtra2 = intent.getStringExtra("notification_subtext");
        long longExtra = intent.getLongExtra("notification_timeout", 1);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("notification_on_click_intent");
        Notification.Builder timeoutAfter = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(this.f1497a, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(longExtra) : new Notification.Builder(this.f1497a).setPriority(-2);
        if (pendingIntent != null) {
            timeoutAfter.setContentIntent(pendingIntent);
        }
        timeoutAfter.setSmallIcon(17301633).setOngoing(false).setContentTitle(stringExtra).setSubText(stringExtra2);
        if (Build.VERSION.SDK_INT >= 21) {
            timeoutAfter.setColor(intent.getIntExtra("notification_color", 0)).setVisibility(-1);
        }
        Notification build = timeoutAfter.build();
        this.f1500d.mo33811d("Starting foreground installation service.", new Object[0]);
        this.f1498b.mo33781a(true);
        if (Build.VERSION.SDK_INT >= 26) {
            m825c(intent.getStringExtra("notification_channel_name"));
        }
        startForeground(-1883842196, build);
    }

    /* renamed from: b */
    private final synchronized void m824b() {
        this.f1500d.mo33811d("Stopping service.", new Object[0]);
        this.f1498b.mo33781a(false);
        stopForeground(true);
        stopSelf();
    }

    /* renamed from: c */
    private final synchronized void m825c(String str) {
        this.f1499c.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", str, 2));
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        C2183ck.m1022j(getApplicationContext()).mo33599c(this);
        this.f1499c = (NotificationManager) this.f1497a.getSystemService("notification");
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int intExtra = intent.getIntExtra("action_type", 0);
        if (intExtra == 1) {
            m823a(intent);
        } else if (intExtra == 2) {
            m824b();
        } else {
            this.f1500d.mo33809b("Unknown action type received: %d", Integer.valueOf(intExtra));
        }
        return 2;
    }
}
