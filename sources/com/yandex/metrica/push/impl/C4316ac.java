package com.yandex.metrica.push.impl;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.push.impl.ac */
public class C4316ac implements C4318ae {

    /* renamed from: a */
    private final Map<C4411u, C4317ad> f5423a = new HashMap();

    /* renamed from: a */
    public void mo41955a(Context context, Intent intent) {
        C4317ad adVar;
        C4399n nVar = (C4399n) intent.getParcelableExtra("com.yandex.metrica.push.extra.ACTION_INFO");
        if (nVar != null && (adVar = this.f5423a.get(nVar.f5559d)) != null) {
            adVar.mo41954a(context, intent);
        }
    }

    /* renamed from: a */
    public void mo41956a(C4317ad adVar) {
        this.f5423a.put(C4411u.CLEAR, adVar);
    }

    /* renamed from: b */
    public void mo41957b(C4317ad adVar) {
        this.f5423a.put(C4411u.CLICK, adVar);
    }

    /* renamed from: c */
    public void mo41958c(C4317ad adVar) {
        this.f5423a.put(C4411u.ADDITIONAL_ACTION, adVar);
    }
}
