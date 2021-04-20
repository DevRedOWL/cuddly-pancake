package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.impl.C4386e;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.push.impl.ao */
class C4330ao implements C4386e {

    /* renamed from: a */
    private final C4392i f5436a;

    public C4330ao(C4392i iVar) {
        this.f5436a = iVar;
    }

    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        Integer num;
        C4397m g = oVar.mo42126g();
        String str = null;
        if (g == null) {
            num = null;
        } else {
            num = g.mo42090b();
        }
        if (num == null) {
            return C4386e.C4387a.m6482a();
        }
        C4403p e = oVar.mo42124e();
        if (e != null) {
            str = e.mo42132E();
        }
        long b = this.f5436a.mo42085b(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (b > currentTimeMillis) {
            C4371bu.m6423a("%s Last push was shown in future", "[OnePushPerPeriodFilter]");
            return C4386e.C4387a.m6482a();
        }
        long j = currentTimeMillis - b;
        if (j >= TimeUnit.MINUTES.toMillis((long) num.intValue())) {
            return C4386e.C4387a.m6482a();
        }
        return C4386e.C4387a.m6483a("Already have shown push in this period", String.format(Locale.US, "Previous push was shown [%d] minutes ago, min period is [%d]", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j)), num}));
    }
}
