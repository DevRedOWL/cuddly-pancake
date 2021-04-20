package com.yandex.metrica.impl.p039ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.h */
public class C3481h {

    /* renamed from: a */
    public static final long f3335a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private long f3336b;

    /* renamed from: c */
    private final C4227wg f3337c;

    /* renamed from: com.yandex.metrica.impl.ob.h$b */
    public interface C3485b {
        /* renamed from: a */
        void mo40175a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.h$a */
    public static class C3483a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f3340a;

        /* renamed from: b */
        private final C3485b f3341b;

        /* renamed from: c */
        private final C3481h f3342c;

        public C3483a(Runnable runnable) {
            this(runnable, C3136al.m1993a().mo39494i());
        }

        C3483a(final Runnable runnable, C3481h hVar) {
            this.f3340a = false;
            this.f3341b = new C3485b() {
                /* renamed from: a */
                public void mo40175a() {
                    boolean unused = C3483a.this.f3340a = true;
                    runnable.run();
                }
            };
            this.f3342c = hVar;
        }

        /* renamed from: a */
        public void mo40174a(long j, C4257xh xhVar) {
            if (!this.f3340a) {
                this.f3342c.mo40172a(j, xhVar, this.f3341b);
            }
        }
    }

    public C3481h() {
        this(new C4227wg());
    }

    C3481h(C4227wg wgVar) {
        this.f3337c = wgVar;
    }

    /* renamed from: a */
    public void mo40171a() {
        this.f3336b = this.f3337c.mo41768a();
    }

    /* renamed from: a */
    public void mo40172a(long j, C4257xh xhVar, final C3485b bVar) {
        xhVar.mo41809a(new Runnable() {
            public void run() {
                bVar.mo40175a();
            }
        }, Math.max(j - (this.f3337c.mo41768a() - this.f3336b), 0));
    }
}
