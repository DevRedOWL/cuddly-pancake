package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.de */
public class C3329de {

    /* renamed from: a */
    private final C4123tw f3038a;

    /* renamed from: b */
    private final C3336dh f3039b;

    /* renamed from: c */
    private final C3325dc f3040c;

    /* renamed from: d */
    private Boolean f3041d;

    public C3329de(Context context, C3336dh dhVar) {
        this(dhVar, new C3325dc(context), new C4123tw());
    }

    /* renamed from: a */
    public void mo39898a(Context context) {
        C4143uk a = this.f3038a.mo41523a(context);
        C4107tt ttVar = a.f5086G;
        if (ttVar != null && this.f3040c.mo39893a(a, ttVar)) {
            if (!this.f3040c.mo39894b(a, ttVar)) {
                this.f3039b.mo39899a();
                this.f3041d = false;
            } else if (C4196vi.m5862b(this.f3041d)) {
                this.f3039b.mo39900a(a.f5086G);
                this.f3041d = true;
            }
        }
    }

    public C3329de(C3336dh dhVar, C3325dc dcVar, C4123tw twVar) {
        this.f3039b = dhVar;
        this.f3040c = dcVar;
        this.f3038a = twVar;
    }
}
