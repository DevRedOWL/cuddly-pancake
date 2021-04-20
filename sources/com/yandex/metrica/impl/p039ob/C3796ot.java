package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

/* renamed from: com.yandex.metrica.impl.ob.ot */
class C3796ot {

    /* renamed from: a */
    private final C3791oq f4004a;

    /* renamed from: b */
    private final C3780ol f4005b;

    /* renamed from: c */
    private final C3802ow f4006c;

    /* renamed from: d */
    private final C3770od f4007d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3796ot(android.content.Context r14, com.yandex.metrica.impl.p039ob.C4143uk r15, com.yandex.metrica.impl.p039ob.C4258xi r16, com.yandex.metrica.impl.p039ob.C3774oh r17, com.yandex.metrica.impl.p039ob.C3633lh r18, com.yandex.metrica.impl.p039ob.C3632lg r19, com.yandex.metrica.impl.p039ob.C3832pr r20) {
        /*
            r13 = this;
            java.lang.String r0 = "location"
            r8 = r14
            java.lang.Object r0 = r14.getSystemService(r0)
            android.location.LocationManager r0 = (android.location.LocationManager) r0
            com.yandex.metrica.impl.ob.cy r9 = com.yandex.metrica.impl.p039ob.C3307cy.m2873a((android.content.Context) r14)
            com.yandex.metrica.impl.ob.al r1 = com.yandex.metrica.impl.p039ob.C3136al.m1993a()
            com.yandex.metrica.impl.ob.vd r10 = r1.mo39496k()
            com.yandex.metrica.impl.ob.ow r11 = new com.yandex.metrica.impl.ob.ow
            r1 = r11
            r2 = r14
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.yandex.metrica.impl.ob.od r12 = new com.yandex.metrica.impl.ob.od
            r7 = r17
            r1 = r18
            r2 = r19
            r12.<init>(r7, r1, r2)
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r0
            r5 = r9
            r6 = r10
            r8 = r11
            r9 = r12
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3796ot.<init>(android.content.Context, com.yandex.metrica.impl.ob.uk, com.yandex.metrica.impl.ob.xi, com.yandex.metrica.impl.ob.oh, com.yandex.metrica.impl.ob.lh, com.yandex.metrica.impl.ob.lg, com.yandex.metrica.impl.ob.pr):void");
    }

    private C3796ot(Context context, C4258xi xiVar, LocationManager locationManager, C3307cy cyVar, C4191vd vdVar, C3774oh ohVar, C3802ow owVar, C3770od odVar, C3832pr prVar) {
        this(new C3791oq(context, xiVar.mo41811b(), locationManager, ohVar, owVar, odVar, prVar), new C3780ol(context, cyVar, vdVar, owVar, odVar, xiVar, ohVar), owVar, odVar);
    }

    /* renamed from: a */
    public void mo40803a() {
        this.f4004a.mo40785a();
        this.f4005b.mo40759d();
    }

    /* renamed from: b */
    public Location mo40805b() {
        return this.f4004a.mo40787b();
    }

    /* renamed from: c */
    public Location mo40806c() {
        return this.f4004a.mo40788c();
    }

    /* renamed from: d */
    public void mo40807d() {
        this.f4006c.mo40816a();
    }

    /* renamed from: e */
    public void mo40808e() {
        this.f4004a.mo40789d();
        this.f4005b.mo40755a();
    }

    /* renamed from: f */
    public void mo40809f() {
        this.f4004a.mo40790e();
        this.f4005b.mo40757b();
    }

    C3796ot(C3791oq oqVar, C3780ol olVar, C3802ow owVar, C3770od odVar) {
        this.f4004a = oqVar;
        this.f4005b = olVar;
        this.f4006c = owVar;
        this.f4007d = odVar;
    }

    /* renamed from: a */
    public void mo40804a(C4143uk ukVar, C3774oh ohVar) {
        this.f4006c.mo40817a(ukVar, ohVar);
        this.f4007d.mo40742a(ohVar);
        this.f4004a.mo40786a(ohVar);
        this.f4005b.mo40756a(ohVar);
    }
}
