package com.yandex.metrica.push.impl;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.yandex.metrica.push.impl.aa */
public class C4314aa extends C4421y {
    /* renamed from: a */
    public void mo41954a(Context context, Intent intent) {
        NotificationManager notificationManager;
        C4399n nVar = (C4399n) intent.getParcelableExtra("com.yandex.metrica.push.extra.ACTION_INFO");
        if (nVar != null) {
            boolean a = C4389f.m6484a(context).mo42031f().mo42044g().mo41952a(nVar.f5560e);
            String str = nVar.f5556a;
            if (!C4380cb.m6473b(str) && a) {
                C4389f.m6484a(context).mo42031f().mo42043f().mo41967a(str, nVar.f5560e);
            }
            if (!nVar.f5567l) {
                mo42227a(context, nVar);
            }
            if (nVar.f5563h) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
            if (nVar.f5564i && (notificationManager = (NotificationManager) context.getSystemService("notification")) != null) {
                notificationManager.cancel(nVar.f5561f, nVar.f5562g);
            }
        }
    }
}
