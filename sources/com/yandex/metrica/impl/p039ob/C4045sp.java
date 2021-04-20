package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C4038sm;
import com.yandex.metrica.impl.p039ob.C4039sn;
import com.yandex.metrica.impl.p039ob.C4039sn.C4043d;

/* renamed from: com.yandex.metrica.impl.ob.sp */
public abstract class C4045sp<T extends C4039sn, IA, A extends C4038sm<IA, A>, L extends C4039sn.C4043d<T, C4039sn.C4042c<A>>> {

    /* renamed from: a */
    private T f4785a;

    /* renamed from: b */
    private L f4786b;

    /* renamed from: c */
    private C4039sn.C4042c<A> f4787c;

    public C4045sp(L l, C4143uk ukVar, A a) {
        this.f4786b = l;
        C3350dr.m3043a().mo39930a(this, C3364dz.class, C3358dv.m3057a(new C3357du<C3364dz>() {
            /* renamed from: a */
            public void mo39399a(C3364dz dzVar) {
                C4045sp.this.mo41322a();
            }
        }).mo39939a());
        mo41323a(new C4039sn.C4042c(ukVar, a));
    }

    /* renamed from: a */
    public synchronized void mo41322a() {
        this.f4785a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo41323a(C4039sn.C4042c<A> cVar) {
        this.f4787c = cVar;
    }

    /* renamed from: a */
    public synchronized void mo41321a(IA ia) {
        if (!((C4038sm) this.f4787c.f4784b).mo39972a(ia)) {
            mo41323a(new C4039sn.C4042c(mo41325b(), ((C4038sm) this.f4787c.f4784b).mo39973b(ia)));
            mo41322a();
        }
    }

    /* renamed from: a */
    public synchronized void mo41324a(C4143uk ukVar) {
        mo41323a(new C4039sn.C4042c(ukVar, mo41326c()));
        mo41322a();
    }

    /* renamed from: b */
    public synchronized C4143uk mo41325b() {
        return this.f4787c.f4783a;
    }

    /* renamed from: c */
    public synchronized A mo41326c() {
        return (C4038sm) this.f4787c.f4784b;
    }

    /* renamed from: d */
    public synchronized T mo41327d() {
        if (this.f4785a == null) {
            this.f4785a = this.f4786b.mo40150a(this.f4787c);
        }
        return this.f4785a;
    }
}
