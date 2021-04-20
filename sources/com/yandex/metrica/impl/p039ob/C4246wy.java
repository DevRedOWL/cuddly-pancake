package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.impl.p039ob.C3125af;

/* renamed from: com.yandex.metrica.impl.ob.wy */
public class C4246wy {

    /* renamed from: a */
    private final C4213vw<C4247wz, C4245wx> f5290a;

    /* renamed from: b */
    private final C4213vw<C3125af.C3126a, C4245wx> f5291b;

    public C4246wy(Context context) {
        this(new C4243wv(), new C4250xa(), new C4240ws(context));
    }

    public C4246wy(C4245wx wxVar, C4245wx wxVar2, C4245wx wxVar3) {
        this.f5290a = new C4213vw<>(wxVar);
        this.f5290a.mo41713a(C4247wz.NONE, wxVar);
        this.f5290a.mo41713a(C4247wz.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, wxVar2);
        this.f5290a.mo41713a(C4247wz.AES_VALUE_ENCRYPTION, wxVar3);
        this.f5291b = new C4213vw<>(wxVar);
        this.f5291b.mo41713a(C3125af.C3126a.EVENT_TYPE_IDENTITY, wxVar3);
    }

    /* renamed from: a */
    public C4245wx mo41794a(C4247wz wzVar) {
        return this.f5290a.mo41711a(wzVar);
    }

    /* renamed from: a */
    public C4245wx mo41793a(C4217w wVar) {
        return m6072a(C3125af.C3126a.m1967a(wVar.mo41736g()));
    }

    /* renamed from: a */
    private C4245wx m6072a(C3125af.C3126a aVar) {
        return this.f5291b.mo41711a(aVar);
    }
}
