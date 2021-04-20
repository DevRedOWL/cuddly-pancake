package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import com.facebook.react.modules.appstate.AppStateModule;
import com.yandex.metrica.impl.p039ob.C3512i;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.em */
public class C3381em {

    /* renamed from: a */
    private final C3391en f3143a;

    /* renamed from: b */
    private final C3843qb f3144b;

    /* renamed from: c */
    private List<C3389g> f3145c;

    /* renamed from: com.yandex.metrica.impl.ob.em$a */
    public static class C3383a {

        /* renamed from: a */
        private final C3391en f3146a;

        public C3383a(C3391en enVar) {
            this.f3146a = enVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3381em mo40003a(C3843qb qbVar) {
            return new C3381em(this.f3146a, qbVar);
        }
    }

    private C3381em(C3391en enVar, C3843qb qbVar) {
        this.f3143a = enVar;
        this.f3144b = qbVar;
        m3123b();
    }

    /* renamed from: b */
    private void m3123b() {
        this.f3145c = new LinkedList();
        this.f3145c.add(new C3385c(this.f3143a, this.f3144b));
        this.f3145c.add(new C3387e(this.f3143a, this.f3144b));
        List<C3389g> list = this.f3145c;
        C3391en enVar = this.f3143a;
        list.add(new C3386d(enVar, enVar.mo40038v()));
        this.f3145c.add(new C3384b(this.f3143a));
        this.f3145c.add(new C3388f(this.f3143a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo40002a() {
        if (!m3122a(this.f3143a.mo39985b().mo39993a())) {
            for (C3389g f : this.f3145c) {
                f.mo40011f();
            }
        }
    }

    /* renamed from: a */
    private boolean m3122a(String str) {
        return C3843qb.f4096a.values().contains(str);
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$f */
    static class C3388f extends C3389g {
        @Deprecated

        /* renamed from: a */
        static final C3853qk f3152a = new C3853qk("SESSION_SLEEP_START");
        @Deprecated

        /* renamed from: b */
        static final C3853qk f3153b = new C3853qk("SESSION_ID");
        @Deprecated

        /* renamed from: c */
        static final C3853qk f3154c = new C3853qk("SESSION_COUNTER_ID");
        @Deprecated

        /* renamed from: d */
        static final C3853qk f3155d = new C3853qk("SESSION_INIT_TIME");
        @Deprecated

        /* renamed from: e */
        static final C3853qk f3156e = new C3853qk("SESSION_IS_ALIVE_REPORT_NEEDED");
        @Deprecated

        /* renamed from: f */
        static final C3853qk f3157f = new C3853qk("BG_SESSION_ID");
        @Deprecated

        /* renamed from: g */
        static final C3853qk f3158g = new C3853qk("BG_SESSION_SLEEP_START");
        @Deprecated

        /* renamed from: h */
        static final C3853qk f3159h = new C3853qk("BG_SESSION_COUNTER_ID");
        @Deprecated

        /* renamed from: i */
        static final C3853qk f3160i = new C3853qk("BG_SESSION_INIT_TIME");
        @Deprecated

        /* renamed from: j */
        static final C3853qk f3161j = new C3853qk("BG_SESSION_IS_ALIVE_REPORT_NEEDED");

        /* renamed from: k */
        private final C3688lw f3162k;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo40004a() {
            return true;
        }

        C3388f(C3391en enVar) {
            super(enVar);
            this.f3162k = enVar.mo40041y();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo40005b() {
            mo40009d();
            mo40008c();
            m3137g();
        }

        /* renamed from: g */
        private void m3137g() {
            this.f3162k.mo40568r(f3152a.mo40947b());
            this.f3162k.mo40568r(f3153b.mo40947b());
            this.f3162k.mo40568r(f3154c.mo40947b());
            this.f3162k.mo40568r(f3155d.mo40947b());
            this.f3162k.mo40568r(f3156e.mo40947b());
            this.f3162k.mo40568r(f3157f.mo40947b());
            this.f3162k.mo40568r(f3158g.mo40947b());
            this.f3162k.mo40568r(f3159h.mo40947b());
            this.f3162k.mo40568r(f3160i.mo40947b());
            this.f3162k.mo40568r(f3161j.mo40947b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo40008c() {
            long b = this.f3162k.mo40559b(f3152a.mo40947b(), -2147483648L);
            if (b != -2147483648L) {
                C3556jg jgVar = new C3556jg(this.f3162k, "foreground");
                if (!jgVar.mo40304i()) {
                    if (b != 0) {
                        jgVar.mo40293b(b);
                    }
                    long b2 = this.f3162k.mo40559b(f3153b.mo40947b(), -1);
                    if (-1 != b2) {
                        jgVar.mo40297d(b2);
                    }
                    boolean b3 = this.f3162k.mo40562b(f3156e.mo40947b(), true);
                    if (b3) {
                        jgVar.mo40291a(b3);
                    }
                    long b4 = this.f3162k.mo40559b(f3155d.mo40947b(), Long.MIN_VALUE);
                    if (b4 != Long.MIN_VALUE) {
                        jgVar.mo40299e(b4);
                    }
                    long b5 = this.f3162k.mo40559b(f3154c.mo40947b(), 0);
                    if (b5 != 0) {
                        jgVar.mo40290a(b5);
                    }
                    jgVar.mo40303h();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo40009d() {
            long b = this.f3162k.mo40559b(f3158g.mo40947b(), -2147483648L);
            if (b != -2147483648L) {
                C3556jg jgVar = new C3556jg(this.f3162k, AppStateModule.APP_STATE_BACKGROUND);
                if (!jgVar.mo40304i()) {
                    if (b != 0) {
                        jgVar.mo40293b(b);
                    }
                    long b2 = this.f3162k.mo40559b(f3157f.mo40947b(), -1);
                    if (b2 != -1) {
                        jgVar.mo40297d(b2);
                    }
                    boolean b3 = this.f3162k.mo40562b(f3161j.mo40947b(), true);
                    if (b3) {
                        jgVar.mo40291a(b3);
                    }
                    long b4 = this.f3162k.mo40559b(f3160i.mo40947b(), Long.MIN_VALUE);
                    if (b4 != Long.MIN_VALUE) {
                        jgVar.mo40299e(b4);
                    }
                    long b5 = this.f3162k.mo40559b(f3159h.mo40947b(), 0);
                    if (b5 != 0) {
                        jgVar.mo40290a(b5);
                    }
                    jgVar.mo40303h();
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$b */
    static class C3384b extends C3389g {

        /* renamed from: a */
        private final C3848qf f3147a;

        /* renamed from: b */
        private final C3688lw f3148b;

        /* renamed from: c */
        private final C3690ly f3149c;

        C3384b(C3391en enVar) {
            super(enVar);
            this.f3147a = new C3848qf(enVar.mo40027k(), enVar.mo39985b().toString());
            this.f3148b = enVar.mo40041y();
            this.f3149c = enVar.f3165a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo40004a() {
            return this.f3147a.mo40924e();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo40005b() {
            mo40007d();
            mo40006c();
            m3126g();
            this.f3147a.mo40927g();
        }

        /* renamed from: g */
        private void m3126g() {
            C3512i.C3513a a = this.f3147a.mo40887a();
            if (a != null) {
                this.f3148b.mo40523a(a);
            }
            String a2 = this.f3147a.mo40915a((String) null);
            if (!TextUtils.isEmpty(a2) && TextUtils.isEmpty(this.f3148b.mo40543f())) {
                this.f3148b.mo40524a(a2);
            }
            long c = this.f3147a.mo40919c(Long.MIN_VALUE);
            if (c != Long.MIN_VALUE && this.f3148b.mo40521a(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.f3148b.mo40529b(c);
            }
            this.f3148b.mo40567q();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo40006c() {
            C3556jg jgVar = new C3556jg(this.f3148b, "foreground");
            if (!jgVar.mo40304i()) {
                long d = this.f3147a.mo40921d(-1);
                if (-1 != d) {
                    jgVar.mo40297d(d);
                }
                boolean booleanValue = this.f3147a.mo40914a(true).booleanValue();
                if (booleanValue) {
                    jgVar.mo40291a(booleanValue);
                }
                long a = this.f3147a.mo40912a(Long.MIN_VALUE);
                if (a != Long.MIN_VALUE) {
                    jgVar.mo40299e(a);
                }
                long f = this.f3147a.mo40925f(0);
                if (f != 0) {
                    jgVar.mo40290a(f);
                }
                long h = this.f3147a.mo40928h(0);
                if (h != 0) {
                    jgVar.mo40293b(h);
                }
                jgVar.mo40303h();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo40007d() {
            C3556jg jgVar = new C3556jg(this.f3148b, AppStateModule.APP_STATE_BACKGROUND);
            if (!jgVar.mo40304i()) {
                long e = this.f3147a.mo40923e(-1);
                if (e != -1) {
                    jgVar.mo40297d(e);
                }
                long b = this.f3147a.mo40916b(Long.MIN_VALUE);
                if (b != Long.MIN_VALUE) {
                    jgVar.mo40299e(b);
                }
                long g = this.f3147a.mo40926g(0);
                if (g != 0) {
                    jgVar.mo40290a(g);
                }
                long i = this.f3147a.mo40929i(0);
                if (i != 0) {
                    jgVar.mo40293b(i);
                }
                jgVar.mo40303h();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$d */
    static class C3386d extends C3389g {

        /* renamed from: a */
        private final C3845qc f3150a;

        /* renamed from: b */
        private final C3686lu f3151b;

        C3386d(C3391en enVar, C3845qc qcVar) {
            super(enVar);
            this.f3150a = qcVar;
            this.f3151b = enVar.mo40037u();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo40004a() {
            return "DONE".equals(this.f3150a.mo40890c((String) null)) || "DONE".equals(this.f3150a.mo40888b((String) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo40005b() {
            if ("DONE".equals(this.f3150a.mo40890c((String) null))) {
                this.f3151b.mo40482b();
            }
            String e = this.f3150a.mo40894e((String) null);
            if (!TextUtils.isEmpty(e)) {
                this.f3151b.mo40484c(e);
            }
            if ("DONE".equals(this.f3150a.mo40888b((String) null))) {
                this.f3151b.mo40479a();
            }
            this.f3150a.mo40892d();
            this.f3150a.mo40895e();
            this.f3150a.mo40891c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$e */
    static class C3387e extends C3390h {
        C3387e(C3391en enVar, C3843qb qbVar) {
            super(enVar, qbVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo40004a() {
            return mo40010e().mo40037u().mo40478a((String) null) == null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo40005b() {
            C3843qb c = mo40012c();
            if (mo40010e() instanceof C3408ez) {
                c.mo40880c();
            } else {
                c.mo40878b();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$c */
    static class C3385c extends C3390h {
        C3385c(C3391en enVar, C3843qb qbVar) {
            super(enVar, qbVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo40004a() {
            return mo40010e() instanceof C3408ez;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo40005b() {
            mo40012c().mo40876a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$h */
    private static abstract class C3390h extends C3389g {

        /* renamed from: a */
        private C3843qb f3164a;

        C3390h(C3391en enVar, C3843qb qbVar) {
            super(enVar);
            this.f3164a = qbVar;
        }

        /* renamed from: c */
        public C3843qb mo40012c() {
            return this.f3164a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.em$g */
    private static abstract class C3389g {

        /* renamed from: a */
        private final C3391en f3163a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo40004a();

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo40005b();

        C3389g(C3391en enVar) {
            this.f3163a = enVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C3391en mo40010e() {
            return this.f3163a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo40011f() {
            if (mo40004a()) {
                mo40005b();
            }
        }
    }
}
