package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3929rr;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.mu */
public class C3717mu implements C3719mw<C3778oj, C3929rr.C3930a.C3931a.C3932a> {
    /* renamed from: a */
    public C3929rr.C3930a.C3931a.C3932a[] mo40225b(List<C3778oj> list) {
        C3929rr.C3930a.C3931a.C3932a[] aVarArr = new C3929rr.C3930a.C3931a.C3932a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            aVarArr[i] = m4135a(list.get(i));
        }
        return aVarArr;
    }

    /* renamed from: a */
    public List<C3778oj> mo40224a(C3929rr.C3930a.C3931a.C3932a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C3929rr.C3930a.C3931a.C3932a a : aVarArr) {
            arrayList.add(m4134a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private C3929rr.C3930a.C3931a.C3932a m4135a(C3778oj ojVar) {
        C3929rr.C3930a.C3931a.C3932a aVar = new C3929rr.C3930a.C3931a.C3932a();
        aVar.f4470b = ojVar.f3931a;
        aVar.f4471c = ojVar.f3932b;
        return aVar;
    }

    /* renamed from: a */
    private C3778oj m4134a(C3929rr.C3930a.C3931a.C3932a aVar) {
        return new C3778oj(aVar.f4470b, aVar.f4471c);
    }
}
