package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.Intent;
import com.yandex.metrica.push.YandexMetricaPush;

/* renamed from: com.yandex.metrica.push.impl.az */
public class C4342az implements C4340ax {
    /* renamed from: a */
    public void mo41965a(Context context, C4402o oVar) {
        Intent intent = new Intent(context.getPackageName() + ".action.ymp.SILENT_PUSH_RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.putExtra(YandexMetricaPush.EXTRA_PAYLOAD, oVar.mo42123d());
        context.sendBroadcast(intent);
        boolean z = C4389f.m6484a(context).mo42031f().mo42044g().f5415e;
        if (!C4380cb.m6473b(oVar.mo42121b()) && z) {
            C4389f.m6484a(context).mo42031f().mo42043f().mo41975f(oVar.mo42121b());
        }
    }
}
