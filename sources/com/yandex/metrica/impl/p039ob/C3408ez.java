package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p039ob.C3125af;
import com.yandex.metrica.impl.p039ob.C3373eg;
import com.yandex.metrica.impl.p039ob.C3391en;
import com.yandex.metrica.impl.p039ob.C4030si;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.ez */
public class C3408ez extends C3391en {

    /* renamed from: b */
    private final C4030si f3208b;

    /* renamed from: c */
    private final C3411a f3209c;

    /* renamed from: d */
    private final C3299cs f3210d;

    /* renamed from: e */
    private final C3198bj f3211e;

    /* renamed from: f */
    private final C3614ku f3212f;

    /* renamed from: g */
    private final C3202bk f3213g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3408ez(android.content.Context r18, com.yandex.metrica.impl.p039ob.C4143uk r19, com.yandex.metrica.impl.p039ob.C3203bl r20, com.yandex.metrica.impl.p039ob.C3379ek r21, com.yandex.metrica.impl.p039ob.C3373eg.C3374a r22, com.yandex.metrica.impl.p039ob.C4030si r23, com.yandex.metrica.impl.p039ob.C3299cs r24, com.yandex.metrica.impl.p039ob.C4148un r25) {
        /*
            r17 = this;
            com.yandex.metrica.impl.ob.en$a r3 = new com.yandex.metrica.impl.ob.en$a
            r3.<init>()
            com.yandex.metrica.impl.ob.cw r4 = new com.yandex.metrica.impl.ob.cw
            r4.<init>()
            com.yandex.metrica.impl.ob.ah r5 = new com.yandex.metrica.impl.ob.ah
            r5.<init>()
            com.yandex.metrica.impl.ob.fa r16 = new com.yandex.metrica.impl.ob.fa
            com.yandex.metrica.impl.ob.ey r12 = new com.yandex.metrica.impl.ob.ey
            r2 = r24
            r12.<init>(r2)
            com.yandex.metrica.impl.ob.al r0 = com.yandex.metrica.impl.p039ob.C3136al.m1993a()
            com.yandex.metrica.impl.ob.xo r0 = r0.mo39495j()
            com.yandex.metrica.impl.ob.xh r14 = r0.mo41835g()
            java.lang.String r0 = r21.mo39994b()
            r1 = r18
            int r15 = com.yandex.metrica.impl.p039ob.C3306cx.m2872c(r1, r0)
            r6 = r16
            r7 = r18
            r8 = r21
            r9 = r22
            r10 = r25
            r11 = r19
            r13 = r20
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r22
            java.lang.Boolean r9 = r0.f3123q
            r0 = r17
            r2 = r21
            r7 = r23
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3408ez.<init>(android.content.Context, com.yandex.metrica.impl.ob.uk, com.yandex.metrica.impl.ob.bl, com.yandex.metrica.impl.ob.ek, com.yandex.metrica.impl.ob.eg$a, com.yandex.metrica.impl.ob.si, com.yandex.metrica.impl.ob.cs, com.yandex.metrica.impl.ob.un):void");
    }

    C3408ez(Context context, C3379ek ekVar, C3391en.C3393a aVar, C3305cw cwVar, C3128ah ahVar, C3413fa faVar, C4030si siVar, C3299cs csVar, Boolean bool) {
        super(context, ekVar, aVar, cwVar, faVar);
        this.f3208b = siVar;
        C3467gp f = mo40022f();
        f.mo40161a(C3125af.C3126a.EVENT_TYPE_REGULAR, new C3518ie(f.mo40160a()));
        this.f3209c = faVar.mo40074a(this);
        this.f3208b.mo41268a((C4030si.C4032a) this.f3209c);
        this.f3210d = csVar;
        this.f3213g = faVar.mo40076b(this);
        this.f3211e = faVar.mo40073a(this.f3213g, mo40041y());
        this.f3212f = faVar.mo40075a(ahVar, (C4234wm<File>) new C4234wm<File>() {
            /* renamed from: a */
            public void mo39609a(File file) {
                C3408ez.this.m3223a(file);
            }
        });
        if (Boolean.TRUE.equals(bool)) {
            this.f3212f.mo40368a();
            this.f3211e.mo39633a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ez$a */
    public class C3411a implements C4030si.C4032a {
        public C3411a() {
        }

        /* renamed from: a */
        public boolean mo39990a(C4034sj sjVar) {
            C3408ez.this.mo40016a(new C4217w().mo40967a(sjVar.mo41271a()).mo41723a(C3125af.C3126a.EVENT_TYPE_SEND_REFERRER.mo39462a()));
            return true;
        }
    }

    /* renamed from: a */
    public synchronized void mo39979a(C3373eg.C3374a aVar) {
        super.mo39979a(aVar);
        m3221D();
        this.f3210d.mo39853a(aVar.f3119m);
    }

    /* renamed from: D */
    private void m3221D() {
        this.f3165a.mo40575a(mo40025i().mo41344R()).mo40567q();
    }

    /* renamed from: c */
    public void mo39987c() {
        this.f3212f.mo40369b();
        super.mo39987c();
    }

    /* renamed from: a */
    public CounterConfiguration.C3075a mo39970a() {
        return CounterConfiguration.C3075a.MAIN;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3223a(File file) {
        this.f3211e.mo39634a(file.getAbsolutePath(), new C4234wm<Boolean>() {
            /* renamed from: a */
            public void mo39609a(Boolean bool) {
            }
        }, true);
    }
}
