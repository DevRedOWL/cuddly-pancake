package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3877rg;

/* renamed from: com.yandex.metrica.impl.ob.kt */
public class C3613kt implements C3713mq<C3605kl, C3877rg.C3880c> {

    /* renamed from: a */
    private final C3612ks f3566a;

    /* renamed from: b */
    private final C3606km f3567b;

    /* renamed from: c */
    private final C3608ko f3568c;

    public C3613kt() {
        this(new C3612ks(), new C3606km(new C3611kr()), new C3608ko());
    }

    C3613kt(C3612ks ksVar, C3606km kmVar, C3608ko koVar) {
        this.f3567b = kmVar;
        this.f3566a = ksVar;
        this.f3568c = koVar;
    }

    /* renamed from: a */
    public C3877rg.C3880c mo40225b(C3605kl klVar) {
        C3877rg.C3880c cVar = new C3877rg.C3880c();
        if (klVar.f3556b != null) {
            cVar.f4224b = this.f3566a.mo40225b(klVar.f3556b);
        }
        if (klVar.f3557c != null) {
            cVar.f4225c = this.f3567b.mo40225b(klVar.f3557c);
        }
        if (klVar.f3558d != null) {
            cVar.f4226d = klVar.f3558d;
        }
        cVar.f4227e = this.f3568c.mo40357a(klVar.f3559e).intValue();
        return cVar;
    }

    /* renamed from: a */
    public C3605kl mo40224a(C3877rg.C3880c cVar) {
        throw new UnsupportedOperationException();
    }
}
