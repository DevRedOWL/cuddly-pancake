package com.yandex.metrica.push.impl;

import android.text.TextUtils;
import com.yandex.metrica.push.impl.C4386e;

/* renamed from: com.yandex.metrica.push.impl.am */
public class C4328am implements C4386e {

    /* renamed from: a */
    private final C4389f f5433a;

    public C4328am(C4389f fVar) {
        this.f5433a = fVar;
    }

    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        int i;
        C4397m g = oVar.mo42126g();
        Integer d = g == null ? null : g.mo42092d();
        if (d != null) {
            i = d.intValue();
        } else {
            i = 3;
        }
        int i2 = i & 1;
        if (i2 != 0 && (i & 2) != 0) {
            return C4386e.C4387a.m6482a();
        }
        C4385d j = this.f5433a.mo42035j();
        if (j == null) {
            return C4386e.C4387a.m6483a("Not found passport uid provider", (String) null);
        }
        String a = j.mo42023a();
        if (i2 != 0) {
            if (TextUtils.isEmpty(a)) {
                return C4386e.C4387a.m6483a("No current account", (String) null);
            }
            return C4386e.C4387a.m6482a();
        } else if ((i & 2) == 0) {
            return C4386e.C4387a.m6483a("Filter type is set to 'do not show to anyone'", (String) null);
        } else {
            if (TextUtils.isEmpty(a)) {
                return C4386e.C4387a.m6482a();
            }
            return C4386e.C4387a.m6483a("Has current account", (String) null);
        }
    }
}
