package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.ag */
public class C3127ag {

    /* renamed from: a */
    private final C3302ct f2549a;

    /* renamed from: b */
    private final C3763o f2550b;

    public C3127ag(Context context) {
        this(new C3302ct(context, "com.yandex.android.appmetrica.build_id"), new C3763o(context, "com.yandex.android.appmetrica.is_offline"));
    }

    C3127ag(C3302ct ctVar, C3763o oVar) {
        this.f2549a = ctVar;
        this.f2550b = oVar;
    }

    /* renamed from: a */
    public String mo39464a() {
        return (String) this.f2549a.mo39806a();
    }

    /* renamed from: b */
    public Boolean mo39465b() {
        return (Boolean) this.f2550b.mo39806a();
    }
}
