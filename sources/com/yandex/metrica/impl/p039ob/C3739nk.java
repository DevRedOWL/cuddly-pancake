package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3929rr;
import com.yandex.metrica.impl.p039ob.C4107tt;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.nk */
public class C3739nk implements C3719mw<C4107tt.C4108a, C3929rr.C3930a.C3933b.C3934a> {

    /* renamed from: a */
    private final C3738nj f3857a;

    public C3739nk() {
        this(new C3738nj());
    }

    /* renamed from: a */
    public List<C4107tt.C4108a> mo40224a(C3929rr.C3930a.C3933b.C3934a[] aVarArr) {
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C3929rr.C3930a.C3933b.C3934a a : aVarArr) {
            arrayList.add(this.f3857a.mo40224a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C3929rr.C3930a.C3933b.C3934a[] mo40225b(List<C4107tt.C4108a> list) {
        C3929rr.C3930a.C3933b.C3934a[] aVarArr = new C3929rr.C3930a.C3933b.C3934a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            aVarArr[i] = this.f3857a.mo40225b(list.get(i));
        }
        return aVarArr;
    }

    C3739nk(C3738nj njVar) {
        this.f3857a = njVar;
    }
}
