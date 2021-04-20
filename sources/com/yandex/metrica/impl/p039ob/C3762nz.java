package com.yandex.metrica.impl.p039ob;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.yandex.metrica.impl.ob.nz */
public class C3762nz implements C3758nv, C3759nw {

    /* renamed from: a */
    private final C3417fe f3896a;

    /* renamed from: b */
    private AtomicLong f3897b;

    public C3762nz(C3621kz kzVar, C3417fe feVar) {
        this.f3896a = feVar;
        this.f3897b = new AtomicLong(kzVar.mo40408b());
        kzVar.mo40405a((C3759nw) this);
    }

    /* renamed from: a */
    public boolean mo40727a() {
        return this.f3897b.get() >= ((long) ((C4051st) this.f3896a.mo41327d()).mo41347U());
    }

    /* renamed from: a */
    public void mo40726a(List<Integer> list) {
        this.f3897b.addAndGet((long) list.size());
    }

    /* renamed from: b */
    public void mo40728b(List<Integer> list) {
        this.f3897b.addAndGet((long) (-list.size()));
    }
}
