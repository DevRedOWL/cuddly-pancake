package com.yandex.metrica.push.impl;

import android.text.TextUtils;
import com.yandex.metrica.push.impl.C4386e;

/* renamed from: com.yandex.metrica.push.impl.ap */
class C4331ap implements C4386e {

    /* renamed from: a */
    private final C4389f f5437a;

    public C4331ap(C4389f fVar) {
        this.f5437a = fVar;
    }

    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        String str;
        C4397m g = oVar.mo42126g();
        if (g == null) {
            str = null;
        } else {
            str = g.mo42091c();
        }
        if (TextUtils.isEmpty(str)) {
            return C4386e.C4387a.m6482a();
        }
        C4385d j = this.f5437a.mo42035j();
        if (j == null) {
            return C4386e.C4387a.m6483a("Not found passport uid provider", (String) null);
        }
        String a = j.mo42023a();
        if (TextUtils.isEmpty(a)) {
            return C4386e.C4387a.m6483a("No current account", (String) null);
        }
        if (TextUtils.equals(str, a)) {
            return C4386e.C4387a.m6482a();
        }
        return C4386e.C4387a.m6483a("Wrong account", String.format("Got account uid [%s], allowed [%s]", new Object[]{a, str}));
    }
}
