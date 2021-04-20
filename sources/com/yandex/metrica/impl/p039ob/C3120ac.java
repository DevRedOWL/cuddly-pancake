package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3447ge;

/* renamed from: com.yandex.metrica.impl.ob.ac */
public class C3120ac<C extends C3447ge> extends C3304cv<C> {

    /* renamed from: d */
    private final C3459gk f2486d;

    /* renamed from: e */
    private final C3688lw f2487e;

    /* renamed from: f */
    private boolean f2488f = false;

    public C3120ac(C c, C4151uq uqVar, C3203bl blVar, C3459gk gkVar, C3688lw lwVar) {
        super(c, uqVar, blVar);
        this.f2486d = gkVar;
        this.f2487e = lwVar;
    }

    /* renamed from: a */
    public void mo39456a(C4217w wVar) {
        if (!this.f2488f) {
            super.mo39863f();
            this.f2978b.mo39641a((C3208bo) new C3451gg((C3458gj) mo39864g(), wVar, this.f2486d, this.f2487e));
        }
    }

    public void close() {
        this.f2488f = true;
    }
}
