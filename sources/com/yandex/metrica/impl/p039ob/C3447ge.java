package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p039ob.C3373eg;
import com.yandex.metrica.impl.p039ob.C3455gi;
import java.io.Closeable;

/* renamed from: com.yandex.metrica.impl.ob.ge */
public class C3447ge implements C3402et, C3403eu, C3458gj {

    /* renamed from: a */
    private final Context f3282a;

    /* renamed from: b */
    private final C3379ek f3283b;

    /* renamed from: c */
    private final C3120ac f3284c;

    /* renamed from: d */
    private C3450gf f3285d;

    /* renamed from: e */
    private C3424fk f3286e;

    /* renamed from: f */
    private final CounterConfiguration.C3075a f3287f;

    /* renamed from: a */
    public void mo39982a(C4134ue ueVar, C4143uk ukVar) {
    }

    /* renamed from: com.yandex.metrica.impl.ob.ge$b */
    static class C3449b {
        C3449b() {
        }

        /* renamed from: a */
        public C3120ac<C3447ge> mo40136a(C3447ge geVar, C4148un unVar, C3203bl blVar, C3459gk gkVar, C3688lw lwVar) {
            return new C3120ac(geVar, unVar.mo41613a(), blVar, gkVar, lwVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ge$a */
    static class C3448a {
        C3448a() {
        }

        /* renamed from: a */
        public C3450gf mo40135a(Context context, C3379ek ekVar, C4143uk ukVar, C3455gi.C3456a aVar) {
            return new C3450gf(new C3455gi.C3457b(context, ekVar.mo39994b()), ukVar, aVar);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3447ge(android.content.Context r14, com.yandex.metrica.impl.p039ob.C3379ek r15, com.yandex.metrica.impl.p039ob.C3203bl r16, com.yandex.metrica.impl.p039ob.C3373eg.C3374a r17, com.yandex.metrica.impl.p039ob.C4143uk r18, com.yandex.metrica.impl.p039ob.C4148un r19, com.yandex.metrica.CounterConfiguration.C3075a r20) {
        /*
            r13 = this;
            r2 = r15
            com.yandex.metrica.impl.ob.gk r8 = new com.yandex.metrica.impl.ob.gk
            r8.<init>()
            com.yandex.metrica.impl.ob.ge$b r9 = new com.yandex.metrica.impl.ob.ge$b
            r9.<init>()
            com.yandex.metrica.impl.ob.ge$a r10 = new com.yandex.metrica.impl.ob.ge$a
            r10.<init>()
            com.yandex.metrica.impl.ob.fk r11 = new com.yandex.metrica.impl.ob.fk
            r1 = r14
            r11.<init>(r14, r15)
            com.yandex.metrica.impl.ob.lw r12 = new com.yandex.metrica.impl.ob.lw
            com.yandex.metrica.impl.ob.ld r0 = com.yandex.metrica.impl.p039ob.C3628ld.m3815a((android.content.Context) r14)
            com.yandex.metrica.impl.ob.lf r0 = r0.mo40439b((com.yandex.metrica.impl.p039ob.C3379ek) r15)
            r12.<init>(r0)
            r0 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3447ge.<init>(android.content.Context, com.yandex.metrica.impl.ob.ek, com.yandex.metrica.impl.ob.bl, com.yandex.metrica.impl.ob.eg$a, com.yandex.metrica.impl.ob.uk, com.yandex.metrica.impl.ob.un, com.yandex.metrica.CounterConfiguration$a):void");
    }

    public C3447ge(Context context, C3379ek ekVar, C3203bl blVar, C3373eg.C3374a aVar, C4143uk ukVar, C4148un unVar, CounterConfiguration.C3075a aVar2, C3459gk gkVar, C3449b bVar, C3448a aVar3, C3424fk fkVar, C3688lw lwVar) {
        C4143uk ukVar2 = ukVar;
        this.f3282a = context;
        this.f3283b = ekVar;
        this.f3286e = fkVar;
        this.f3287f = aVar2;
        this.f3284c = bVar.mo40136a(this, unVar, blVar, gkVar, lwVar);
        synchronized (this) {
            this.f3286e.mo40099a(ukVar2.f5111y);
            C3373eg.C3374a aVar4 = aVar;
            this.f3285d = aVar3.mo40135a(context, ekVar, ukVar, new C3455gi.C3456a(aVar));
        }
    }

    /* renamed from: b */
    public C3379ek mo39985b() {
        return this.f3283b;
    }

    /* renamed from: a */
    public void mo39979a(C3373eg.C3374a aVar) {
        this.f3285d.mo41321a(aVar);
    }

    /* renamed from: a */
    public void mo40016a(C4217w wVar) {
        this.f3284c.mo39456a(wVar);
    }

    /* renamed from: a */
    public void mo40070a() {
        if (this.f3286e.mo40100a(((C3455gi) this.f3285d.mo41327d()).mo40144c())) {
            mo40016a(C3125af.m1938a());
            this.f3286e.mo40098a();
        }
    }

    /* renamed from: a */
    public synchronized void mo39983a(C4143uk ukVar) {
        this.f3285d.mo41324a(ukVar);
        this.f3286e.mo40099a(ukVar.f5111y);
    }

    /* renamed from: d */
    public C3455gi mo40134d() {
        return (C3455gi) this.f3285d.mo41327d();
    }

    /* renamed from: c */
    public void mo39987c() {
        C3306cx.m2855a((Closeable) this.f3284c);
    }
}
