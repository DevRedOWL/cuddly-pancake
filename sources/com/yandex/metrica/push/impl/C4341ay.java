package com.yandex.metrica.push.impl;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.yandex.metrica.push.impl.C4392i;
import java.util.List;

/* renamed from: com.yandex.metrica.push.impl.ay */
public class C4341ay implements C4340ax {
    /* renamed from: a */
    public void mo41965a(Context context, C4402o oVar) {
        if (!C4380cb.m6473b(oVar.mo42121b())) {
            C4392i d = C4389f.m6484a(context).mo42029d();
            List<C4392i.C4393a> a = d.mo42081a();
            String h = oVar.mo42127h();
            for (C4392i.C4393a next : a) {
                if (next.f5539a.equals(h)) {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        if (C4380cb.m6470a(23)) {
                            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                            int length = activeNotifications.length;
                            boolean z = false;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                StatusBarNotification statusBarNotification = activeNotifications[i];
                                if (statusBarNotification.getId() == next.f5540b.intValue()) {
                                    if (statusBarNotification.getTag() == null) {
                                        if (next.f5541c == null) {
                                            break;
                                        }
                                    } else if (statusBarNotification.getTag().equals(next.f5541c)) {
                                        break;
                                    }
                                }
                                i++;
                            }
                            z = true;
                            if (!z) {
                                C4389f.m6484a(context).mo42031f().mo42043f().mo41971b(oVar.mo42121b(), "Notification not found", "Removed by user");
                            }
                        }
                        notificationManager.cancel(next.f5541c, next.f5540b.intValue());
                        C4389f.m6484a(context).mo42031f().mo42043f().mo41971b(oVar.mo42121b(), "Ok", (String) null);
                        return;
                    }
                    return;
                }
            }
            if (d.mo42086b().contains(h)) {
                C4389f.m6484a(context).mo42031f().mo42043f().mo41971b(oVar.mo42121b(), "Notification not found", "Notification was replaced");
            } else {
                C4389f.m6484a(context).mo42031f().mo42043f().mo41971b(oVar.mo42121b(), "Notification not found", (String) null);
            }
        }
    }
}
