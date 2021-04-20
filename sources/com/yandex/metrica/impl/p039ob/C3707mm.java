package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3913rm;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.mm */
public class C3707mm implements C3713mq<C3827pn, C3913rm.C3914a> {

    /* renamed from: a */
    private final C3709mo f3821a;

    public C3707mm() {
        this(new C3709mo());
    }

    C3707mm(C3709mo moVar) {
        this.f3821a = moVar;
    }

    /* renamed from: a */
    public C3913rm.C3914a mo40225b(C3827pn pnVar) {
        C3913rm.C3914a aVar = new C3913rm.C3914a();
        aVar.f4395b = new C3913rm.C3914a.C3916b[pnVar.f4073a.size()];
        int i = 0;
        int i2 = 0;
        for (C3835pu a : pnVar.f4073a) {
            aVar.f4395b[i2] = m4105a(a);
            i2++;
        }
        if (pnVar.f4074b != null) {
            aVar.f4396c = this.f3821a.mo40225b(pnVar.f4074b);
        }
        aVar.f4397d = new String[pnVar.f4075c.size()];
        for (String str : pnVar.f4075c) {
            aVar.f4397d[i] = str;
            i++;
        }
        return aVar;
    }

    /* renamed from: a */
    public C3827pn mo40224a(C3913rm.C3914a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C3913rm.C3914a.C3916b a : aVar.f4395b) {
            arrayList.add(m4104a(a));
        }
        C3623l lVar = null;
        if (aVar.f4396c != null) {
            lVar = this.f3821a.mo40224a(aVar.f4396c);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String add : aVar.f4397d) {
            arrayList2.add(add);
        }
        return new C3827pn(arrayList, lVar, arrayList2);
    }

    /* renamed from: a */
    private C3913rm.C3914a.C3916b m4105a(C3835pu puVar) {
        C3913rm.C3914a.C3916b bVar = new C3913rm.C3914a.C3916b();
        bVar.f4401b = puVar.f4082a;
        bVar.f4402c = puVar.f4083b;
        return bVar;
    }

    /* renamed from: a */
    private C3835pu m4104a(C3913rm.C3914a.C3916b bVar) {
        return new C3835pu(bVar.f4401b, bVar.f4402c);
    }
}
