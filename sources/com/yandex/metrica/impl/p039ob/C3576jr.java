package com.yandex.metrica.impl.p039ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.jr */
public class C3576jr {

    /* renamed from: a */
    private final C4257xh f3501a;

    /* renamed from: com.yandex.metrica.impl.ob.jr$a */
    public static class C3577a implements Runnable {

        /* renamed from: a */
        private final C3590jy f3502a;

        /* renamed from: b */
        private final Bundle f3503b;

        /* renamed from: c */
        private final C3587jw f3504c;

        public C3577a(C3590jy jyVar, Bundle bundle) {
            this(jyVar, bundle, (C3587jw) null);
        }

        public C3577a(C3590jy jyVar, Bundle bundle, C3587jw jwVar) {
            this.f3502a = jyVar;
            this.f3503b = bundle;
            this.f3504c = jwVar;
        }

        public void run() {
            try {
                this.f3502a.mo40339a(this.f3503b, this.f3504c);
            } catch (Throwable unused) {
                C3587jw jwVar = this.f3504c;
                if (jwVar != null) {
                    jwVar.mo39216a();
                }
            }
        }
    }

    public C3576jr() {
        this(C3136al.m1993a().mo39495j().mo41834f());
    }

    C3576jr(C4257xh xhVar) {
        this.f3501a = xhVar;
    }

    /* renamed from: a */
    public void mo40323a(C3590jy jyVar, Bundle bundle) {
        this.f3501a.mo41808a((Runnable) new C3577a(jyVar, bundle));
    }

    /* renamed from: a */
    public void mo40324a(C3590jy jyVar, Bundle bundle, C3587jw jwVar) {
        this.f3501a.mo41808a((Runnable) new C3577a(jyVar, bundle, jwVar));
    }

    /* renamed from: a */
    public C4257xh mo40322a() {
        return this.f3501a;
    }
}
