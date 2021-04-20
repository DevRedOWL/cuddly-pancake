package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3125af;

/* renamed from: com.yandex.metrica.impl.ob.jd */
public class C3550jd {

    /* renamed from: a */
    private final C3391en f3450a;

    /* renamed from: b */
    private final C3549jc f3451b;

    /* renamed from: c */
    private final C3552a f3452c;

    /* renamed from: d */
    private final C3536iw<C3539iy> f3453d;

    /* renamed from: e */
    private final C3536iw<C3539iy> f3454e;

    /* renamed from: f */
    private C3537ix f3455f;

    /* renamed from: g */
    private C3553b f3456g;

    /* renamed from: com.yandex.metrica.impl.ob.jd$a */
    public interface C3552a {
        /* renamed from: a */
        void mo40043a(C4217w wVar, C3554je jeVar);
    }

    /* renamed from: com.yandex.metrica.impl.ob.jd$b */
    public enum C3553b {
        EMPTY,
        BACKGROUND,
        FOREGROUND
    }

    public C3550jd(C3391en enVar, C3549jc jcVar, C3552a aVar) {
        this(enVar, jcVar, aVar, new C3535iv(enVar, jcVar), new C3534iu(enVar, jcVar));
    }

    public C3550jd(C3391en enVar, C3549jc jcVar, C3552a aVar, C3536iw<C3539iy> iwVar, C3536iw<C3539iy> iwVar2) {
        this.f3456g = null;
        this.f3450a = enVar;
        this.f3452c = aVar;
        this.f3453d = iwVar;
        this.f3454e = iwVar2;
        this.f3451b = jcVar;
    }

    /* renamed from: com.yandex.metrica.impl.ob.jd$1 */
    static /* synthetic */ class C35511 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3457a = new int[C3553b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.yandex.metrica.impl.ob.jd$b[] r0 = com.yandex.metrica.impl.p039ob.C3550jd.C3553b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3457a = r0
                int[] r0 = f3457a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.yandex.metrica.impl.ob.jd$b r1 = com.yandex.metrica.impl.p039ob.C3550jd.C3553b.FOREGROUND     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f3457a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.yandex.metrica.impl.ob.jd$b r1 = com.yandex.metrica.impl.p039ob.C3550jd.C3553b.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f3457a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.yandex.metrica.impl.ob.jd$b r1 = com.yandex.metrica.impl.p039ob.C3550jd.C3553b.EMPTY     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3550jd.C35511.<clinit>():void");
        }
    }

    /* renamed from: a */
    public synchronized void mo40277a(C4217w wVar) {
        m3576g(wVar);
        int i = C35511.f3457a[this.f3456g.ordinal()];
        if (i != 1) {
            if (i == 2) {
                m3574c(this.f3455f, wVar);
                this.f3455f = m3575f(wVar);
            } else if (i == 3) {
                this.f3455f = m3575f(wVar);
            }
        } else if (m3572a(this.f3455f, wVar)) {
            this.f3455f.mo40242b(wVar.mo41747r());
        } else {
            this.f3455f = m3575f(wVar);
        }
    }

    /* renamed from: b */
    public synchronized void mo40278b(C4217w wVar) {
        mo40279c(wVar).mo40238a(false);
        if (this.f3456g != C3553b.EMPTY) {
            m3574c(this.f3455f, wVar);
        }
        this.f3456g = C3553b.EMPTY;
    }

    /* renamed from: c */
    public synchronized C3537ix mo40279c(C4217w wVar) {
        m3576g(wVar);
        if (this.f3456g != C3553b.EMPTY && !m3572a(this.f3455f, wVar)) {
            this.f3456g = C3553b.EMPTY;
            this.f3455f = null;
        }
        int i = C35511.f3457a[this.f3456g.ordinal()];
        if (i == 1) {
            return this.f3455f;
        } else if (i != 2) {
            this.f3455f = m3578i(wVar);
            return this.f3455f;
        } else {
            this.f3455f.mo40242b(wVar.mo41747r());
            return this.f3455f;
        }
    }

    /* renamed from: d */
    public C3554je mo40280d(C4217w wVar) {
        return m3571a(mo40279c(wVar), wVar.mo41747r());
    }

    /* renamed from: a */
    public synchronized long mo40275a() {
        return this.f3455f == null ? 10000000000L : this.f3455f.mo40243c() - 1;
    }

    /* renamed from: a */
    public C3554je mo40276a(long j) {
        long a = this.f3451b.mo40274a();
        this.f3450a.mo40026j().mo40403a(a, C3557jh.BACKGROUND, j);
        return new C3554je().mo40283a(a).mo40284a(C3557jh.BACKGROUND).mo40285b(0).mo40288c(0);
    }

    /* renamed from: f */
    private C3537ix m3575f(C4217w wVar) {
        long r = wVar.mo41747r();
        C3537ix a = this.f3453d.mo40235a(new C3539iy(r, wVar.mo41748s()));
        this.f3456g = C3553b.FOREGROUND;
        this.f3450a.mo40015C().mo40729a();
        this.f3452c.mo40043a(C4217w.m5953c(wVar), m3571a(a, r));
        return a;
    }

    /* renamed from: g */
    private void m3576g(C4217w wVar) {
        if (this.f3456g == null) {
            C3537ix a = this.f3453d.mo40233a();
            if (m3572a(a, wVar)) {
                this.f3455f = a;
                this.f3456g = C3553b.FOREGROUND;
                return;
            }
            C3537ix a2 = this.f3454e.mo40233a();
            if (m3572a(a2, wVar)) {
                this.f3455f = a2;
                this.f3456g = C3553b.BACKGROUND;
                return;
            }
            this.f3455f = null;
            this.f3456g = C3553b.EMPTY;
        }
    }

    /* renamed from: h */
    private C3537ix m3577h(C4217w wVar) {
        if (this.f3456g != null) {
            return this.f3455f;
        }
        C3537ix a = this.f3453d.mo40233a();
        if (!m3573b(a, wVar)) {
            return a;
        }
        C3537ix a2 = this.f3454e.mo40233a();
        if (!m3573b(a2, wVar)) {
            return a2;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m3572a(C3537ix ixVar, C4217w wVar) {
        if (ixVar == null) {
            return false;
        }
        if (ixVar.mo40239a(wVar.mo41747r())) {
            return true;
        }
        m3574c(ixVar, wVar);
        return false;
    }

    /* renamed from: b */
    private boolean m3573b(C3537ix ixVar, C4217w wVar) {
        if (ixVar == null) {
            return false;
        }
        return ixVar.mo40239a(wVar.mo41747r());
    }

    /* renamed from: c */
    private void m3574c(C3537ix ixVar, C4217w wVar) {
        if (ixVar.mo40249h()) {
            this.f3452c.mo40043a(C4217w.m5950b(wVar), m3570a(ixVar));
            ixVar.mo40238a(false);
        }
        ixVar.mo40246e();
    }

    /* renamed from: i */
    private C3537ix m3578i(C4217w wVar) {
        this.f3456g = C3553b.BACKGROUND;
        long r = wVar.mo41747r();
        C3537ix a = this.f3454e.mo40235a(new C3539iy(r, wVar.mo41748s()));
        if (this.f3450a.mo40037u().mo40487d()) {
            this.f3452c.mo40043a(C4217w.m5953c(wVar), m3571a(a, wVar.mo41747r()));
        } else if (wVar.mo41736g() == C3125af.C3126a.EVENT_TYPE_FIRST_ACTIVATION.mo39462a()) {
            this.f3452c.mo40043a(wVar, m3571a(a, r));
            this.f3452c.mo40043a(C4217w.m5953c(wVar), m3571a(a, r));
        }
        return a;
    }

    /* renamed from: a */
    private C3554je m3570a(C3537ix ixVar) {
        return new C3554je().mo40283a(ixVar.mo40243c()).mo40284a(ixVar.mo40237a()).mo40285b(ixVar.mo40248g()).mo40288c(ixVar.mo40245d());
    }

    /* renamed from: a */
    private C3554je m3571a(C3537ix ixVar, long j) {
        return new C3554je().mo40283a(ixVar.mo40243c()).mo40285b(ixVar.mo40248g()).mo40288c(ixVar.mo40244c(j)).mo40284a(ixVar.mo40237a());
    }

    /* renamed from: e */
    public C3554je mo40281e(C4217w wVar) {
        C3537ix h = m3577h(wVar);
        if (h != null) {
            return new C3554je().mo40283a(h.mo40243c()).mo40285b(h.mo40248g()).mo40288c(h.mo40247f()).mo40284a(h.mo40237a());
        }
        return mo40276a(wVar.mo41748s());
    }
}
