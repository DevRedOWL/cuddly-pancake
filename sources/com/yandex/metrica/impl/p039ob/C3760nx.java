package com.yandex.metrica.impl.p039ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.nx */
public class C3760nx {

    /* renamed from: a */
    private final List<C3758nv> f3893a;

    /* renamed from: b */
    private final C3761ny f3894b;

    /* renamed from: c */
    private final AtomicBoolean f3895c = new AtomicBoolean(true);

    public C3760nx(List<C3758nv> list, C3761ny nyVar) {
        this.f3893a = list;
        this.f3894b = nyVar;
    }

    /* renamed from: a */
    public void mo40729a() {
        if (this.f3895c.get()) {
            m4301d();
        }
    }

    /* renamed from: b */
    public void mo40730b() {
        this.f3895c.set(true);
    }

    /* renamed from: c */
    public void mo40731c() {
        this.f3895c.set(false);
    }

    /* renamed from: d */
    private void m4301d() {
        if (this.f3893a.isEmpty()) {
            m4302e();
            return;
        }
        boolean z = false;
        for (C3758nv a : this.f3893a) {
            z |= a.mo40727a();
        }
        if (z) {
            m4302e();
        }
    }

    /* renamed from: e */
    private void m4302e() {
        this.f3894b.mo40023g();
    }
}
