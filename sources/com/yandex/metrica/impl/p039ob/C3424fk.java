package com.yandex.metrica.impl.p039ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.fk */
public class C3424fk {

    /* renamed from: a */
    private final C3688lw f3243a;

    /* renamed from: b */
    private final C4228wh f3244b;

    /* renamed from: c */
    private final C3305cw f3245c;

    /* renamed from: d */
    private C4147um f3246d;

    /* renamed from: e */
    private long f3247e;

    public C3424fk(Context context, C3379ek ekVar) {
        this(new C3688lw(C3628ld.m3815a(context).mo40439b(ekVar)), new C4227wg(), new C3305cw());
    }

    public C3424fk(C3688lw lwVar, C4228wh whVar, C3305cw cwVar) {
        this.f3243a = lwVar;
        this.f3244b = whVar;
        this.f3245c = cwVar;
        this.f3247e = this.f3243a.mo40548k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r7 = r6.f3246d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo40100a(java.lang.Boolean r7) {
        /*
            r6 = this;
            boolean r7 = com.yandex.metrica.impl.p039ob.C4196vi.m5863c(r7)
            if (r7 == 0) goto L_0x001a
            com.yandex.metrica.impl.ob.um r7 = r6.f3246d
            if (r7 == 0) goto L_0x001a
            com.yandex.metrica.impl.ob.cw r0 = r6.f3245c
            long r1 = r6.f3247e
            long r3 = r7.f5152a
            java.lang.String r5 = "should report diagnostic"
            boolean r7 = r0.mo39866b(r1, r3, r5)
            if (r7 == 0) goto L_0x001a
            r7 = 1
            goto L_0x001b
        L_0x001a:
            r7 = 0
        L_0x001b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3424fk.mo40100a(java.lang.Boolean):boolean");
    }

    /* renamed from: a */
    public void mo40098a() {
        this.f3247e = this.f3244b.mo41768a();
        this.f3243a.mo40542f(this.f3247e).mo40567q();
    }

    /* renamed from: a */
    public void mo40099a(C4147um umVar) {
        this.f3246d = umVar;
    }
}
