package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.hh */
public class C3493hh extends C3489hd {

    /* renamed from: a */
    private final C3528io f3350a;

    public C3493hh(C3391en enVar) {
        this(enVar, enVar.mo40042z());
    }

    /* renamed from: a */
    public boolean mo40170a(C4217w wVar) {
        if (TextUtils.isEmpty(wVar.mo41731d())) {
            return false;
        }
        wVar.mo41725a(this.f3350a.mo40212a(wVar.mo41731d()));
        return false;
    }

    C3493hh(C3391en enVar, C3528io ioVar) {
        super(enVar);
        this.f3350a = ioVar;
    }
}
