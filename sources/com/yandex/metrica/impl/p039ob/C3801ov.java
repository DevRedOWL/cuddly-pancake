package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.ov */
class C3801ov extends C3772of {

    /* renamed from: a */
    private C3633lh f4018a;

    /* renamed from: b */
    private C3773og f4019b;

    /* renamed from: c */
    private C4227wg f4020c;

    public C3801ov(Context context, C3771oe oeVar) {
        this(oeVar, C3628ld.m3815a(context).mo40445g(), new C3773og(context), new C4227wg());
    }

    /* renamed from: b */
    public void mo40744b(String str, Location location, C3774oh ohVar) {
        if (ohVar != null && location != null) {
            C3795os osVar = new C3795os(ohVar.mo40739a(), this.f4020c.mo41768a(), this.f4020c.mo41770c(), location);
            String a = this.f4019b.mo40747a(osVar);
            if (!TextUtils.isEmpty(a)) {
                this.f4018a.mo40387b(osVar.mo40799b(), a);
            }
        }
    }

    C3801ov(C3771oe oeVar, C3633lh lhVar, C3773og ogVar, C4227wg wgVar) {
        super(oeVar);
        this.f4018a = lhVar;
        this.f4019b = ogVar;
        this.f4020c = wgVar;
    }
}
