package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3877rg;

/* renamed from: com.yandex.metrica.impl.ob.kn */
public class C3607kn implements C3713mq<C3600kh, C3877rg.C3879b> {

    /* renamed from: a */
    private final C3606km f3561a;

    /* renamed from: b */
    private final C3608ko f3562b;

    public C3607kn() {
        this(new C3606km(new C3611kr()), new C3608ko());
    }

    C3607kn(C3606km kmVar, C3608ko koVar) {
        this.f3561a = kmVar;
        this.f3562b = koVar;
    }

    /* renamed from: a */
    public C3877rg.C3879b mo40225b(C3600kh khVar) {
        C3877rg.C3879b bVar = new C3877rg.C3879b();
        bVar.f4221b = this.f3561a.mo40225b(khVar.f3543a);
        if (khVar.f3544b != null) {
            bVar.f4222c = khVar.f3544b;
        }
        bVar.f4223d = this.f3562b.mo40357a(khVar.f3545c).intValue();
        return bVar;
    }

    /* renamed from: a */
    public C3600kh mo40224a(C3877rg.C3879b bVar) {
        throw new UnsupportedOperationException();
    }
}
