package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3919ro;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.my */
public class C3721my implements C3713mq<List<C3835pu>, C3919ro.C3920a> {
    /* renamed from: a */
    public C3919ro.C3920a mo40225b(List<C3835pu> list) {
        C3919ro.C3920a aVar = new C3919ro.C3920a();
        aVar.f4407b = new C3919ro.C3920a.C3921a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            aVar.f4407b[i] = m4147a(list.get(i));
        }
        return aVar;
    }

    /* renamed from: a */
    public List<C3835pu> mo40224a(C3919ro.C3920a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f4407b.length);
        for (C3919ro.C3920a.C3921a a : aVar.f4407b) {
            arrayList.add(m4146a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private C3919ro.C3920a.C3921a m4147a(C3835pu puVar) {
        C3919ro.C3920a.C3921a aVar = new C3919ro.C3920a.C3921a();
        aVar.f4409b = puVar.f4082a;
        aVar.f4410c = puVar.f4083b;
        return aVar;
    }

    /* renamed from: a */
    private C3835pu m4146a(C3919ro.C3920a.C3921a aVar) {
        return new C3835pu(aVar.f4409b, aVar.f4410c);
    }
}
