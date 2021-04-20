package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.hs */
public class C3504hs extends C3489hd {
    public C3504hs(C3391en enVar) {
        super(enVar);
    }

    /* renamed from: a */
    public boolean mo40170a(C4217w wVar) {
        if (!m3437b(wVar)) {
            return false;
        }
        mo40176a().mo40017a(wVar.mo41741l());
        return false;
    }

    /* renamed from: b */
    private boolean m3437b(C4217w wVar) {
        return !TextUtils.isEmpty(wVar.mo41741l()) && TextUtils.isEmpty(mo40176a().mo40024h());
    }
}
