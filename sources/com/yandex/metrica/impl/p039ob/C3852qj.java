package com.yandex.metrica.impl.p039ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qj */
public class C3852qj extends C3846qd {

    /* renamed from: d */
    private C3853qk f4190d;

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo40896f() {
        return "_serviceproviderspreferences";
    }

    public C3852qj(Context context) {
        this(context, (String) null);
    }

    public C3852qj(Context context, String str) {
        super(context, str);
        this.f4190d = new C3853qk("LOCATION_TRACKING_ENABLED");
    }

    /* renamed from: a */
    public boolean mo40887a() {
        return this.f4105c.getBoolean(this.f4190d.mo40947b(), false);
    }

    /* renamed from: b */
    public void mo40944b() {
        mo40900h(this.f4190d.mo40947b()).mo40902j();
    }
}
