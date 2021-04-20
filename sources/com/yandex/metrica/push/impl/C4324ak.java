package com.yandex.metrica.push.impl;

import android.os.Build;
import com.yandex.metrica.push.impl.C4386e;
import java.util.Locale;

/* renamed from: com.yandex.metrica.push.impl.ak */
public class C4324ak implements C4386e {
    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        C4397m g = oVar.mo42126g();
        if (g == null) {
            return C4386e.C4387a.m6482a();
        }
        int i = Build.VERSION.SDK_INT;
        Integer k = g.mo42099k();
        Integer l = g.mo42100l();
        if ((k == null || i >= k.intValue()) && (l == null || i <= l.intValue())) {
            return C4386e.C4387a.m6482a();
        }
        return C4386e.C4387a.m6483a("Wrong android os version", String.format(Locale.US, "Got android os level [%d], allowed min [%d], allowed max [%d]", new Object[]{Integer.valueOf(i), k, l}));
    }
}
