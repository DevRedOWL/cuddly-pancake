package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.is */
public class C3532is {

    /* renamed from: a */
    private final C3530iq f3397a;

    /* renamed from: b */
    private final C3531ir f3398b;

    /* renamed from: c */
    private final C3617kx f3399c;

    /* renamed from: d */
    private final String f3400d;

    public C3532is(Context context, C3379ek ekVar) {
        this(new C3531ir(), new C3530iq(), C3628ld.m3815a(context).mo40440c(ekVar), "event_hashes");
    }

    C3532is(C3531ir irVar, C3530iq iqVar, C3617kx kxVar, String str) {
        this.f3398b = irVar;
        this.f3397a = iqVar;
        this.f3399c = kxVar;
        this.f3400d = str;
    }

    /* renamed from: a */
    public C3529ip mo40231a() {
        try {
            byte[] a = this.f3399c.mo40395a(this.f3400d);
            if (C3306cx.m2863a(a)) {
                return this.f3397a.mo40224a(this.f3398b.mo40230c());
            }
            return this.f3397a.mo40224a(this.f3398b.mo40229b(a));
        } catch (Throwable unused) {
            return this.f3397a.mo40224a(this.f3398b.mo40230c());
        }
    }

    /* renamed from: a */
    public void mo40232a(C3529ip ipVar) {
        this.f3399c.mo40394a(this.f3400d, this.f3398b.mo40621a(this.f3397a.mo40225b(ipVar)));
    }
}
