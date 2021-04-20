package com.yandex.metrica.impl.p039ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qh */
public class C3850qh extends C3846qd {

    /* renamed from: d */
    private static final C3853qk f4166d = new C3853qk("PREF_KEY_OFFSET");

    /* renamed from: e */
    private C3853qk f4167e = new C3853qk(f4166d.mo40945a(), (String) null);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo40896f() {
        return "_servertimeoffset";
    }

    public C3850qh(Context context, String str) {
        super(context, str);
    }

    /* renamed from: a */
    public long mo40932a(int i) {
        return this.f4105c.getLong(this.f4167e.mo40947b(), (long) i);
    }

    /* renamed from: a */
    public void mo40887a() {
        mo40900h(this.f4167e.mo40947b()).mo40902j();
    }
}
