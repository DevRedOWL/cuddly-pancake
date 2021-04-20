package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.C3093f;
import com.yandex.metrica.C4297j;

/* renamed from: com.yandex.metrica.impl.ob.sc */
public class C4024sc {
    /* renamed from: a */
    public C4297j mo41251a(C4297j jVar) {
        return C3306cx.m2858a((Object) jVar.maxReportsInDatabaseCount) ? C4297j.m6213a(jVar).mo41906e(m5191a(jVar.maxReportsInDatabaseCount, jVar.apiKey)).mo41900b() : jVar;
    }

    /* renamed from: a */
    public C3093f mo41250a(C3093f fVar) {
        return C3306cx.m2858a((Object) fVar.maxReportsInDatabaseCount) ? C3093f.m1789a(fVar).mo39358d(m5191a(fVar.maxReportsInDatabaseCount, fVar.apiKey)).mo39356b() : fVar;
    }

    /* renamed from: a */
    private int m5191a(Integer num, String str) {
        if (num.intValue() < 100) {
            C4206vr.m5906a(str).mo41685b("Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to %d, but was: %d. Default value (%d) will be used", 100, num, 100);
            return 100;
        } else if (num.intValue() <= 10000) {
            return num.intValue();
        } else {
            C4206vr.m5906a(str).mo41685b("Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to %d, but was: %d. Default value (%d) will be used", 10000, num, 10000);
            return 10000;
        }
    }
}
