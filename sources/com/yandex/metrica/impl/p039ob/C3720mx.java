package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3929rr;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.mx */
public class C3720mx implements C3719mw<C3835pu, C3929rr.C3930a.C3942f> {
    /* renamed from: a */
    public C3929rr.C3930a.C3942f[] mo40225b(List<C3835pu> list) {
        C3929rr.C3930a.C3942f[] fVarArr = new C3929rr.C3930a.C3942f[list.size()];
        for (int i = 0; i < list.size(); i++) {
            fVarArr[i] = m4141a(list.get(i));
        }
        return fVarArr;
    }

    /* renamed from: a */
    public List<C3835pu> mo40224a(C3929rr.C3930a.C3942f[] fVarArr) {
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (C3929rr.C3930a.C3942f a : fVarArr) {
            arrayList.add(m4140a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private C3929rr.C3930a.C3942f m4141a(C3835pu puVar) {
        C3929rr.C3930a.C3942f fVar = new C3929rr.C3930a.C3942f();
        fVar.f4522b = puVar.f4082a;
        fVar.f4523c = puVar.f4083b;
        return fVar;
    }

    /* renamed from: a */
    private C3835pu m4140a(C3929rr.C3930a.C3942f fVar) {
        return new C3835pu(fVar.f4522b, fVar.f4523c);
    }
}
