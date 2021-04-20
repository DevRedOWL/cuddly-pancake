package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.aw */
public final class C3150aw {

    /* renamed from: a */
    private static volatile C3150aw f2601a;

    /* renamed from: b */
    private static final Object f2602b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f2603c;

    /* renamed from: a */
    public static C3150aw m2072a(Context context) {
        if (f2601a == null) {
            synchronized (f2602b) {
                if (f2601a == null) {
                    f2601a = new C3150aw(context.getApplicationContext());
                }
            }
        }
        return f2601a;
    }

    private C3150aw(Context context) {
        this.f2603c = C3213bt.m2393a(context.getResources().getConfiguration().locale);
        C3350dr.m3043a().mo39930a(this, C3364dz.class, C3358dv.m3057a(new C3357du<C3364dz>() {
            /* renamed from: a */
            public void mo39399a(C3364dz dzVar) {
                String unused = C3150aw.this.f2603c = dzVar.f3092a;
            }
        }).mo39939a());
    }

    /* renamed from: a */
    public String mo39530a() {
        return this.f2603c;
    }
}
