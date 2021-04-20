package com.yandex.metrica.push.impl;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationManagerCompat;
import com.yandex.metrica.push.impl.C4386e;

/* renamed from: com.yandex.metrica.push.impl.an */
class C4329an implements C4386e {

    /* renamed from: a */
    private final NotificationManager f5434a;

    /* renamed from: b */
    private final NotificationManagerCompat f5435b;

    public C4329an(Context context) {
        this((NotificationManager) context.getSystemService("notification"), NotificationManagerCompat.from(context));
    }

    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        String str;
        NotificationChannelGroup notificationChannelGroup;
        C4403p e = oVar.mo42124e();
        String str2 = null;
        if (e == null) {
            str = null;
        } else {
            str = e.mo42132E();
        }
        if (TextUtils.isEmpty(str)) {
            str = "yandex_metrica_push_v2";
        }
        if (!this.f5435b.areNotificationsEnabled()) {
            return C4386e.C4387a.m6483a("Disabled system notification", "Disabled all notifications");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = this.f5434a.getNotificationChannel(str);
            if (notificationChannel == null || notificationChannel.getImportance() != 0) {
                if (notificationChannel != null) {
                    str2 = notificationChannel.getGroup();
                }
                if (Build.VERSION.SDK_INT >= 28 && (notificationChannelGroup = this.f5434a.getNotificationChannelGroup(str2)) != null && notificationChannelGroup.isBlocked()) {
                    return C4386e.C4387a.m6483a("Disabled system notification", String.format("Disabled notifications for \"%s\" group", new Object[]{str2}));
                }
            } else {
                return C4386e.C4387a.m6483a("Disabled system notification", String.format("Disabled notifications for \"%s\" channel", new Object[]{str}));
            }
        }
        return C4386e.C4387a.m6482a();
    }

    C4329an(NotificationManager notificationManager, NotificationManagerCompat notificationManagerCompat) {
        this.f5434a = notificationManager;
        this.f5435b = notificationManagerCompat;
    }
}
