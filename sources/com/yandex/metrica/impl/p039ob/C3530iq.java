package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3917rn;

/* renamed from: com.yandex.metrica.impl.ob.iq */
class C3530iq implements C3713mq<C3529ip, C3917rn.C3918a> {
    C3530iq() {
    }

    /* renamed from: a */
    public C3917rn.C3918a mo40225b(C3529ip ipVar) {
        C3917rn.C3918a aVar = new C3917rn.C3918a();
        aVar.f4406e = new int[ipVar.mo40219c().size()];
        int i = 0;
        for (Integer intValue : ipVar.mo40219c()) {
            aVar.f4406e[i] = intValue.intValue();
            i++;
        }
        aVar.f4405d = ipVar.mo40220d();
        aVar.f4404c = ipVar.mo40221e();
        aVar.f4403b = ipVar.mo40218b();
        return aVar;
    }

    /* renamed from: a */
    public C3529ip mo40224a(C3917rn.C3918a aVar) {
        return new C3529ip(aVar.f4403b, aVar.f4404c, aVar.f4405d, aVar.f4406e);
    }
}
