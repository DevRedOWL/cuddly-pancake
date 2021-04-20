package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.yandex.metrica.push.impl.af */
public class C4319af extends C4421y {
    /* renamed from: a */
    public void mo41954a(Context context, Intent intent) {
        C4399n nVar = (C4399n) intent.getParcelableExtra("com.yandex.metrica.push.extra.ACTION_INFO");
        if (nVar != null) {
            String str = nVar.f5556a;
            boolean z = C4389f.m6484a(context).mo42031f().mo42044g().f5413c;
            if (!C4380cb.m6473b(str) && z) {
                C4389f.m6484a(context).mo42031f().mo42043f().mo41974e(str);
            }
            mo42227a(context, nVar);
        }
    }
}
