package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3929rr;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.mn */
public class C3708mn implements C3718mv<C3769oc, C3929rr.C3930a.C3931a> {

    /* renamed from: a */
    private final C3715ms f3822a;

    /* renamed from: b */
    private final C3717mu f3823b;

    public C3708mn() {
        this(new C3715ms(), new C3717mu());
    }

    /* renamed from: a */
    public C3929rr.C3930a.C3931a mo40225b(C3769oc ocVar) {
        C3929rr.C3930a.C3931a.C3932a[] aVarArr;
        C3929rr.C3930a.C3931a aVar = new C3929rr.C3930a.C3931a();
        aVar.f4464b = this.f3822a.mo40225b((C3774oh) ocVar);
        aVar.f4466d = ocVar.f3902b;
        aVar.f4465c = ocVar.f3901a;
        aVar.f4467e = ocVar.f3903c;
        if (ocVar.f3904d == null) {
            aVarArr = new C3929rr.C3930a.C3931a.C3932a[0];
        } else {
            aVarArr = this.f3823b.mo40225b(ocVar.f3904d);
        }
        aVar.f4468f = aVarArr;
        return aVar;
    }

    /* renamed from: a */
    public C3769oc mo40224a(C3929rr.C3930a.C3931a aVar) {
        List<C3778oj> list;
        C3929rr.C3930a.C3931a aVar2 = aVar;
        C3774oh a = this.f3822a.mo40224a(aVar2.f4464b);
        long j = a.f3910e;
        float f = a.f3911f;
        int i = a.f3912g;
        int i2 = a.f3913h;
        long j2 = a.f3914i;
        int i3 = a.f3915j;
        boolean z = a.f3916k;
        long j3 = aVar2.f4465c;
        long j4 = aVar2.f4466d;
        long j5 = a.f3917l;
        boolean z2 = a.f3918m;
        boolean z3 = aVar2.f4467e;
        if (C3306cx.m2864a((T[]) aVar2.f4468f)) {
            list = null;
        } else {
            list = this.f3823b.mo40224a(aVar2.f4468f);
        }
        List<C3778oj> list2 = list;
        boolean z4 = z3;
        return new C3769oc(j, f, i, i2, j2, i3, z, j3, j4, j5, z2, z4, list2);
    }

    C3708mn(C3715ms msVar, C3717mu muVar) {
        this.f3822a = msVar;
        this.f3823b = muVar;
    }
}
