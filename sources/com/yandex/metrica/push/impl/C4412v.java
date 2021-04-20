package com.yandex.metrica.push.impl;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

/* renamed from: com.yandex.metrica.push.impl.v */
public class C4412v {

    /* renamed from: a */
    private final NotificationManager f5650a;

    /* renamed from: b */
    private final NotificationChannel f5651b;

    public C4412v(Context context) {
        this.f5650a = (NotificationManager) context.getSystemService("notification");
        if (C4380cb.m6470a(26)) {
            NotificationChannel notificationChannel = this.f5650a.getNotificationChannel("yandex_metrica_push_v2");
            this.f5651b = notificationChannel == null ? new NotificationChannel("yandex_metrica_push_v2", "Default", 2) : notificationChannel;
            return;
        }
        this.f5651b = null;
    }

    /* renamed from: a */
    public NotificationChannel mo42214a() {
        return this.f5651b;
    }

    /* renamed from: b */
    public void mo42215b() {
        if (this.f5651b != null && C4380cb.m6470a(26)) {
            this.f5650a.createNotificationChannel(this.f5651b);
        }
    }

    /* renamed from: c */
    public void mo42216c() {
        if (this.f5651b != null && C4380cb.m6470a(26)) {
            this.f5650a.deleteNotificationChannel("yandex_metrica_push");
        }
    }
}
