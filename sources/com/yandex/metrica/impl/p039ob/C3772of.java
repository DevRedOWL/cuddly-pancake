package com.yandex.metrica.impl.p039ob;

import android.location.Location;

/* renamed from: com.yandex.metrica.impl.ob.of */
abstract class C3772of implements C3771oe {

    /* renamed from: a */
    private C3771oe f3908a;

    /* renamed from: b */
    public abstract void mo40744b(String str, Location location, C3774oh ohVar);

    public C3772of(C3771oe oeVar) {
        this.f3908a = oeVar;
    }

    /* renamed from: a */
    public void mo40743a(String str, Location location, C3774oh ohVar) {
        mo40744b(str, location, ohVar);
        C3771oe oeVar = this.f3908a;
        if (oeVar != null) {
            oeVar.mo40743a(str, location, ohVar);
        }
    }
}
