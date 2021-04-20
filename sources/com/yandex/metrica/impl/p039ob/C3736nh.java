package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3929rr;

/* renamed from: com.yandex.metrica.impl.ob.nh */
public class C3736nh implements C3718mv<C4107tt, C3929rr.C3930a.C3933b> {

    /* renamed from: a */
    private final C3740nl f3852a;

    /* renamed from: b */
    private final C3739nk f3853b;

    public C3736nh() {
        this(new C3740nl(), new C3739nk());
    }

    /* renamed from: a */
    public C3929rr.C3930a.C3933b mo40225b(C4107tt ttVar) {
        C3929rr.C3930a.C3933b bVar = new C3929rr.C3930a.C3933b();
        bVar.f4472b = this.f3852a.mo40225b(ttVar.f4954a);
        bVar.f4473c = this.f3853b.mo40225b(ttVar.f4955b);
        bVar.f4474d = ttVar.f4956c;
        bVar.f4475e = ttVar.f4957d;
        return bVar;
    }

    /* renamed from: a */
    public C4107tt mo40224a(C3929rr.C3930a.C3933b bVar) {
        return new C4107tt(this.f3852a.mo40224a(bVar.f4472b), this.f3853b.mo40224a(bVar.f4473c), bVar.f4474d, bVar.f4475e);
    }

    C3736nh(C3740nl nlVar, C3739nk nkVar) {
        this.f3852a = nlVar;
        this.f3853b = nkVar;
    }
}
