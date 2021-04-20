package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.impl.C4386e;

/* renamed from: com.yandex.metrica.push.impl.au */
public class C4337au implements C4386e {
    /* renamed from: a */
    public C4386e.C4387a mo41961a(C4402o oVar) {
        String str;
        String str2;
        if (oVar.mo42122c()) {
            return C4386e.C4387a.m6482a();
        }
        if (oVar.mo42124e() == null) {
            str = null;
        } else {
            str = oVar.mo42124e().mo42139f();
        }
        if (oVar.mo42124e() == null) {
            str2 = null;
        } else {
            str2 = oVar.mo42124e().mo42141h();
        }
        if (!C4380cb.m6473b(str) && !C4380cb.m6473b(str2)) {
            return C4386e.C4387a.m6482a();
        }
        C4379ca.m6456c().mo42016a("Invalid push notification. Not all required fields was set", (Throwable) null);
        return C4386e.C4387a.m6483a("Push data format is invalid", "Not all required fields was set");
    }
}
