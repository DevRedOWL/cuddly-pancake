package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.yandex.metrica.push.impl.ab */
public class C4315ab implements C4317ad {
    /* renamed from: a */
    public void mo41954a(Context context, Intent intent) {
        C4399n nVar = (C4399n) intent.getParcelableExtra("com.yandex.metrica.push.extra.ACTION_INFO");
        if (nVar != null) {
            boolean z = C4389f.m6484a(context).mo42031f().mo42044g().f5412b;
            if (!C4380cb.m6473b(nVar.f5556a) && z) {
                C4389f.m6484a(context).mo42031f().mo42043f().mo41973d(nVar.f5556a);
            }
        }
    }
}
