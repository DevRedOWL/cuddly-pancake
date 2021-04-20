package com.yandex.metrica.impl.p039ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p039ob.C3373eg;
import com.yandex.metrica.impl.p039ob.C3381em;
import com.yandex.metrica.impl.p039ob.C3512i;
import com.yandex.metrica.impl.p039ob.C3550jd;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.en */
public class C3391en implements C3402et, C3405ew, C3761ny {

    /* renamed from: a */
    protected C3690ly f3165a;

    /* renamed from: b */
    private final Context f3166b;

    /* renamed from: c */
    private final C3379ek f3167c;

    /* renamed from: d */
    private final C3688lw f3168d;

    /* renamed from: e */
    private final C3686lu f3169e;

    /* renamed from: f */
    private final C3249cc f3170f;

    /* renamed from: g */
    private final C3621kz f3171g;

    /* renamed from: h */
    private final C3471gs f3172h;

    /* renamed from: i */
    private final C3467gp f3173i;

    /* renamed from: j */
    private final C3512i f3174j;

    /* renamed from: k */
    private final C3393a f3175k;

    /* renamed from: l */
    private volatile C3550jd f3176l;

    /* renamed from: m */
    private final C3417fe f3177m;

    /* renamed from: n */
    private final C3528io f3178n;

    /* renamed from: o */
    private final C4216vz f3179o;

    /* renamed from: p */
    private final C4203vp f3180p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C3418ff f3181q;

    /* renamed from: r */
    private final C3381em.C3383a f3182r;

    /* renamed from: s */
    private final C3760nx f3183s;

    /* renamed from: t */
    private final C3757nu f3184t;

    /* renamed from: u */
    private final C3762nz f3185u;

    /* renamed from: v */
    private final C3841q f3186v;

    /* renamed from: w */
    private final C3305cw f3187w;

    /* renamed from: d */
    public C3550jd mo40020d() {
        return this.f3176l;
    }

    /* renamed from: e */
    public C3418ff mo40021e() {
        return this.f3181q;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3391en(android.content.Context r17, com.yandex.metrica.impl.p039ob.C4143uk r18, com.yandex.metrica.impl.p039ob.C3203bl r19, com.yandex.metrica.impl.p039ob.C3379ek r20, com.yandex.metrica.impl.p039ob.C3373eg.C3374a r21, com.yandex.metrica.impl.p039ob.C4051st.C4055d r22, com.yandex.metrica.impl.p039ob.C4148un r23) {
        /*
            r16 = this;
            com.yandex.metrica.impl.ob.en$a r3 = new com.yandex.metrica.impl.ob.en$a
            r3.<init>()
            com.yandex.metrica.impl.ob.cw r4 = new com.yandex.metrica.impl.ob.cw
            r4.<init>()
            com.yandex.metrica.impl.ob.eo r15 = new com.yandex.metrica.impl.ob.eo
            com.yandex.metrica.impl.ob.al r0 = com.yandex.metrica.impl.p039ob.C3136al.m1993a()
            com.yandex.metrica.impl.ob.xo r0 = r0.mo39495j()
            com.yandex.metrica.impl.ob.xh r13 = r0.mo41835g()
            java.lang.String r0 = r20.mo39994b()
            r1 = r17
            int r14 = com.yandex.metrica.impl.p039ob.C3306cx.m2872c(r1, r0)
            r5 = r15
            r6 = r17
            r7 = r20
            r8 = r21
            r9 = r23
            r10 = r18
            r11 = r22
            r12 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r16
            r2 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3391en.<init>(android.content.Context, com.yandex.metrica.impl.ob.uk, com.yandex.metrica.impl.ob.bl, com.yandex.metrica.impl.ob.ek, com.yandex.metrica.impl.ob.eg$a, com.yandex.metrica.impl.ob.st$d, com.yandex.metrica.impl.ob.un):void");
    }

    C3391en(Context context, C3379ek ekVar, C3393a aVar, C3305cw cwVar, C3394eo eoVar) {
        this.f3166b = context.getApplicationContext();
        this.f3167c = ekVar;
        this.f3175k = aVar;
        this.f3187w = cwVar;
        this.f3179o = eoVar.mo40047a().mo40063a();
        this.f3180p = eoVar.mo40047a().mo40064b();
        this.f3168d = eoVar.mo40057b().mo40066b();
        this.f3169e = eoVar.mo40057b().mo40065a();
        this.f3165a = eoVar.mo40057b().mo40067c();
        this.f3174j = aVar.mo40044a(this.f3167c, this.f3179o, this.f3168d);
        this.f3178n = eoVar.mo40059c();
        this.f3171g = eoVar.mo40051a(this);
        this.f3170f = eoVar.mo40056b(this);
        this.f3177m = eoVar.mo40058c(this);
        this.f3182r = eoVar.mo40061e(this);
        this.f3185u = eoVar.mo40054a(this.f3171g, this.f3177m);
        this.f3184t = eoVar.mo40052a(this.f3171g);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f3185u);
        arrayList.add(this.f3184t);
        this.f3183s = eoVar.mo40053a((List<C3758nv>) arrayList, (C3761ny) this);
        m3147D();
        this.f3176l = eoVar.mo40050a(this, this.f3168d, new C3550jd.C3552a() {
            /* renamed from: a */
            public void mo40043a(C4217w wVar, C3554je jeVar) {
                C3391en.this.f3181q.mo40085a(wVar, jeVar);
            }
        });
        if (this.f3180p.mo41688c()) {
            this.f3180p.mo41681a("Read app environment for component %s. Value: %s", this.f3167c.toString(), this.f3174j.mo40190b().f3369a);
        }
        this.f3181q = eoVar.mo40048a(this.f3168d, this.f3176l, this.f3171g, this.f3174j, this.f3170f);
        this.f3173i = eoVar.mo40060d(this);
        this.f3172h = eoVar.mo40049a(this, this.f3173i);
        this.f3186v = eoVar.mo40055a(this.f3168d);
        this.f3171g.mo40401a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C3467gp mo40022f() {
        return this.f3173i;
    }

    /* renamed from: a */
    public void mo40016a(C4217w wVar) {
        if (this.f3179o.mo41688c()) {
            this.f3179o.mo41721a(wVar, "Event received on service");
        }
        if (C3306cx.m2860a(this.f3167c.mo39993a())) {
            this.f3172h.mo40162b(wVar);
        }
    }

    /* renamed from: a */
    public synchronized void mo39979a(C3373eg.C3374a aVar) {
        this.f3177m.mo41321a(aVar);
        m3149b(aVar);
    }

    /* renamed from: g */
    public synchronized void mo40023g() {
        this.f3170f.mo39862e();
    }

    /* renamed from: h */
    public String mo40024h() {
        return this.f3168d.mo40543f();
    }

    /* renamed from: i */
    public C4051st mo40025i() {
        return (C4051st) this.f3177m.mo41327d();
    }

    /* renamed from: j */
    public C3621kz mo40026j() {
        return this.f3171g;
    }

    /* renamed from: b */
    public C3379ek mo39985b() {
        return this.f3167c;
    }

    /* renamed from: a */
    public synchronized void mo39983a(C4143uk ukVar) {
        this.f3177m.mo41324a(ukVar);
        this.f3183s.mo40729a();
    }

    /* renamed from: a */
    public synchronized void mo39982a(C4134ue ueVar, C4143uk ukVar) {
    }

    /* renamed from: k */
    public Context mo40027k() {
        return this.f3166b;
    }

    /* renamed from: l */
    public C4216vz mo40028l() {
        return this.f3179o;
    }

    /* renamed from: m */
    public void mo40029m() {
        this.f3181q.mo40086b();
    }

    /* renamed from: b */
    public void mo40018b(C4217w wVar) {
        this.f3174j.mo40189a(wVar.mo41740k());
        C3512i.C3513a b = this.f3174j.mo40190b();
        if (this.f3175k.mo40045a(b, this.f3168d) && this.f3179o.mo41688c()) {
            this.f3179o.mo41681a("Save new app environment for %s. Value: %s", mo39985b(), b.f3369a);
        }
    }

    /* renamed from: n */
    public void mo40030n() {
        this.f3174j.mo40188a();
        this.f3175k.mo40046b(this.f3174j.mo40190b(), this.f3168d);
    }

    /* renamed from: a */
    public void mo40017a(String str) {
        this.f3168d.mo40524a(str).mo40567q();
    }

    /* renamed from: o */
    public void mo40031o() {
        this.f3168d.mo40536d(mo40032p() + 1).mo40567q();
        this.f3177m.mo41322a();
    }

    /* renamed from: p */
    public int mo40032p() {
        return this.f3168d.mo40546i();
    }

    /* renamed from: q */
    public boolean mo40033q() {
        return this.f3181q.mo40089c() && mo40025i().mo41291f();
    }

    /* renamed from: r */
    public boolean mo40034r() {
        C4051st i = mo40025i();
        return i.mo41334H() && i.mo41291f() && this.f3187w.mo39865a(this.f3181q.mo40090d(), i.mo41336J(), "need to check permissions");
    }

    /* renamed from: s */
    public boolean mo40035s() {
        C4051st i = mo40025i();
        return i.mo41334H() && this.f3187w.mo39865a(this.f3181q.mo40090d(), i.mo41337K(), "should force send permissions");
    }

    /* renamed from: t */
    public boolean mo40036t() {
        return this.f3181q.mo40093e() && mo40025i().mo41335I() && mo40025i().mo41291f();
    }

    /* renamed from: u */
    public C3686lu mo40037u() {
        return this.f3169e;
    }

    @Deprecated
    /* renamed from: v */
    public final C3845qc mo40038v() {
        return new C3845qc(this.f3166b, this.f3167c.mo39993a());
    }

    /* renamed from: w */
    public boolean mo40039w() {
        return this.f3165a.mo40576a();
    }

    /* renamed from: x */
    public boolean mo40040x() {
        boolean z = false;
        boolean b = this.f3169e.mo40483b(false);
        boolean z2 = this.f3177m.mo41325b().f5108v;
        if (b && z2) {
            z = true;
        }
        return !z;
    }

    /* renamed from: c */
    public void mo39987c() {
        C3306cx.m2855a((Closeable) this.f3170f);
        C3306cx.m2855a((Closeable) this.f3171g);
    }

    /* renamed from: D */
    private void m3147D() {
        long libraryApiLevel = (long) YandexMetrica.getLibraryApiLevel();
        if (this.f3168d.mo40544g() < libraryApiLevel) {
            this.f3182r.mo40003a(new C3843qb(mo40038v())).mo40002a();
            this.f3168d.mo40537d(libraryApiLevel).mo40567q();
        }
    }

    /* renamed from: b */
    private void m3149b(C3373eg.C3374a aVar) {
        if (C4196vi.m5861a(aVar.f3118l)) {
            this.f3179o.mo41677a();
        } else if (C4196vi.m5863c(aVar.f3118l)) {
            this.f3179o.mo41683b();
        }
    }

    /* renamed from: y */
    public C3688lw mo40041y() {
        return this.f3168d;
    }

    /* renamed from: b */
    public void mo40019b(String str) {
        this.f3168d.mo40538d(str).mo40567q();
    }

    /* renamed from: z */
    public C3528io mo40042z() {
        return this.f3178n;
    }

    /* renamed from: A */
    public C3841q mo40013A() {
        return this.f3186v;
    }

    /* renamed from: B */
    public String mo40014B() {
        return this.f3168d.mo40545h();
    }

    /* renamed from: C */
    public C3760nx mo40015C() {
        return this.f3183s;
    }

    /* renamed from: a */
    public CounterConfiguration.C3075a mo39970a() {
        return CounterConfiguration.C3075a.MANUAL;
    }

    /* renamed from: com.yandex.metrica.impl.ob.en$a */
    static class C3393a {

        /* renamed from: a */
        private final HashMap<String, C3512i> f3189a = new HashMap<>();

        C3393a() {
        }

        /* renamed from: a */
        public synchronized C3512i mo40044a(C3379ek ekVar, C4216vz vzVar, C3688lw lwVar) {
            C3512i iVar;
            iVar = this.f3189a.get(ekVar.toString());
            if (iVar == null) {
                C3512i.C3513a d = lwVar.mo40535d();
                iVar = new C3512i(d.f3369a, d.f3370b, vzVar);
                this.f3189a.put(ekVar.toString(), iVar);
            }
            return iVar;
        }

        /* renamed from: a */
        public synchronized boolean mo40045a(C3512i.C3513a aVar, C3688lw lwVar) {
            if (aVar.f3370b <= lwVar.mo40535d().f3370b) {
                return false;
            }
            lwVar.mo40523a(aVar).mo40567q();
            return true;
        }

        /* renamed from: b */
        public synchronized void mo40046b(C3512i.C3513a aVar, C3688lw lwVar) {
            lwVar.mo40523a(aVar).mo40567q();
        }
    }
}
