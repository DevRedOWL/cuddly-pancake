package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3877rg;

/* renamed from: com.yandex.metrica.impl.ob.km */
public class C3606km implements C3713mq<C3599kg, C3877rg.C3878a> {

    /* renamed from: a */
    private C3611kr f3560a;

    public C3606km(C3611kr krVar) {
        this.f3560a = krVar;
    }

    /* renamed from: a */
    public C3877rg.C3878a mo40225b(C3599kg kgVar) {
        C3877rg.C3878a aVar = new C3877rg.C3878a();
        aVar.f4219b = this.f3560a.mo40225b(kgVar.f3541a);
        aVar.f4220c = new C3877rg.C3882e[kgVar.f3542b.size()];
        int i = 0;
        for (C3604kk a : kgVar.f3542b) {
            aVar.f4220c[i] = this.f3560a.mo40225b(a);
            i++;
        }
        return aVar;
    }

    /* renamed from: a */
    public C3599kg mo40224a(C3877rg.C3878a aVar) {
        throw new UnsupportedOperationException();
    }
}
