package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.hg */
public class C3492hg extends C3489hd {

    /* renamed from: a */
    private C3686lu f3348a;

    /* renamed from: b */
    private C4222wd f3349b;

    public C3492hg(C3391en enVar) {
        this(enVar, enVar.mo40037u(), C4222wd.m6001a());
    }

    C3492hg(C3391en enVar, C3686lu luVar, C4222wd wdVar) {
        super(enVar);
        this.f3348a = luVar;
        this.f3349b = wdVar;
    }

    /* renamed from: a */
    public boolean mo40170a(C4217w wVar) {
        C3391en a = mo40176a();
        C4051st i = a.mo40025i();
        if (this.f3348a.mo40487d()) {
            return false;
        }
        if (!this.f3348a.mo40485c()) {
            if (i.mo41342P()) {
                this.f3349b.mo41761c();
            }
            String e = wVar.mo41734e();
            this.f3348a.mo40484c(e);
            a.mo40021e().mo40084a(C4217w.m5957e(wVar).mo40970c(e));
            this.f3348a.mo40480a(i.mo41343Q());
            mo40176a().mo40042z().mo40213a();
        }
        this.f3348a.mo40482b();
        return false;
    }
}
