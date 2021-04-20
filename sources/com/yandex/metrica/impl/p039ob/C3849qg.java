package com.yandex.metrica.impl.p039ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qg */
public class C3849qg extends C3846qd {

    /* renamed from: d */
    private static final C3853qk f4162d = new C3853qk("SERVICE_API_LEVEL");

    /* renamed from: e */
    private static final C3853qk f4163e = new C3853qk("CLIENT_API_LEVEL");

    /* renamed from: f */
    private C3853qk f4164f = new C3853qk(f4162d.mo40945a());

    /* renamed from: g */
    private C3853qk f4165g = new C3853qk(f4163e.mo40945a());

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo40896f() {
        return "_migrationpreferences";
    }

    public C3849qg(Context context) {
        super(context, (String) null);
    }

    /* renamed from: a */
    public int mo40887a() {
        return this.f4105c.getInt(this.f4164f.mo40947b(), -1);
    }

    /* renamed from: b */
    public C3849qg mo40930b() {
        mo40900h(this.f4164f.mo40947b());
        return this;
    }

    /* renamed from: c */
    public C3849qg mo40931c() {
        mo40900h(this.f4165g.mo40947b());
        return this;
    }
}
