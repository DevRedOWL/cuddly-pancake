package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.impl.C4386e;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.aq */
class C4332aq implements C4386e {

    /* renamed from: a */
    private final C4392i f5438a;

    public C4332aq(C4392i iVar) {
        this.f5438a = iVar;
    }

    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        Integer num;
        C4397m g = oVar.mo42126g();
        String str = null;
        if (g == null) {
            num = null;
        } else {
            num = g.mo42089a();
        }
        if (num == null) {
            return C4386e.C4387a.m6482a();
        }
        C4403p e = oVar.mo42124e();
        if (e != null) {
            str = e.mo42132E();
        }
        List<Long> a = this.f5438a.mo42082a(str);
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        int i = 0;
        for (Long longValue : a) {
            instance.setTimeInMillis(longValue.longValue());
            if ((instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) && (i = i + 1) >= num.intValue()) {
                return C4386e.C4387a.m6483a("Reached max per day pushes for current topic", String.format(Locale.US, "Was shown [%d], max allowed [%d]", new Object[]{Integer.valueOf(i), num}));
            }
        }
        return C4386e.C4387a.m6482a();
    }
}
