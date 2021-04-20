package com.yandex.metrica.push.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.z */
public abstract class C4422z {

    /* renamed from: a */
    private String f5671a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract NotificationCompat.Builder mo42176a(Context context, C4402o oVar);

    /* renamed from: b */
    public void mo42229b(Context context, C4402o oVar) {
        Integer num;
        int i;
        String str = null;
        if (oVar.mo42124e() == null) {
            num = null;
        } else {
            num = oVar.mo42124e().mo42135b();
        }
        if (oVar.mo42124e() != null) {
            str = oVar.mo42124e().mo42134a();
        }
        this.f5671a = str;
        Notification c = mo42230c(context, oVar);
        if (c != null) {
            int i2 = 0;
            if (num == null) {
                i = 0;
            } else {
                i = num.intValue();
            }
            mo42228a(context, c, i);
            if (!C4380cb.m6473b(oVar.mo42121b())) {
                C4389f.m6484a(context).mo42031f().mo42043f().mo41976g(oVar.mo42121b());
                C4392i d = C4389f.m6484a(context).mo42029d();
                String b = oVar.mo42121b();
                if (num != null) {
                    i2 = num.intValue();
                }
                d.mo42084a(b, Integer.valueOf(i2), this.f5671a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Notification mo42230c(Context context, C4402o oVar) {
        NotificationCompat.Builder a = mo42176a(context, oVar);
        if (a == null) {
            return null;
        }
        return a.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42228a(Context context, Notification notification, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            try {
                notificationManager.notify(this.f5671a, i, notification);
            } catch (Throwable th) {
                C4379ca.m6456c().mo42016a(String.format(Locale.US, "Failed show notification with tag %s and id %d", new Object[]{this.f5671a, Integer.valueOf(i)}), th);
            }
        }
    }
}
