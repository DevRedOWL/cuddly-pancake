package com.yandex.metrica.impl.p039ob;

import com.yandex.metrica.impl.p039ob.C3481h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ai */
public class C3129ai {

    /* renamed from: a */
    private final List<C3133c> f2551a = new ArrayList();

    /* renamed from: com.yandex.metrica.impl.ob.ai$b */
    public static class C3132b {
        /* renamed from: a */
        public boolean mo39478a(long j, long j2, long j3) {
            return j2 - j >= j3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ai$a */
    public static class C3131a {

        /* renamed from: a */
        private boolean f2552a;

        /* renamed from: b */
        private long f2553b;

        /* renamed from: c */
        private long f2554c;

        /* renamed from: d */
        private long f2555d;

        /* renamed from: e */
        private C3132b f2556e;

        C3131a() {
            this(new C3132b());
        }

        public C3131a(C3132b bVar) {
            this.f2556e = bVar;
            this.f2552a = false;
            this.f2555d = Long.MAX_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo39476a() {
            if (this.f2552a) {
                return true;
            }
            return this.f2556e.mo39478a(this.f2554c, this.f2553b, this.f2555d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo39474a(long j, TimeUnit timeUnit) {
            this.f2555d = timeUnit.toMillis(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo39477b() {
            this.f2552a = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo39475a(C4143uk ukVar) {
            if (ukVar != null) {
                this.f2553b = TimeUnit.SECONDS.toMillis(ukVar.f5083D);
                this.f2554c = TimeUnit.SECONDS.toMillis(ukVar.f5084E);
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ai$c */
    public static class C3133c {

        /* renamed from: a */
        private C3131a f2557a;

        /* renamed from: b */
        private final C3481h.C3483a f2558b;

        /* renamed from: c */
        private final C4257xh f2559c;

        private C3133c(C4257xh xhVar, C3481h.C3483a aVar, C3131a aVar2) {
            this.f2558b = aVar;
            this.f2557a = aVar2;
            this.f2559c = xhVar;
        }

        /* renamed from: a */
        public void mo39480a(C4143uk ukVar) {
            this.f2557a.mo39475a(ukVar);
        }

        /* renamed from: a */
        public void mo39479a(long j) {
            this.f2557a.mo39474a(j, TimeUnit.SECONDS);
        }

        /* renamed from: a */
        public boolean mo39481a(int i) {
            if (!this.f2557a.mo39476a()) {
                return false;
            }
            this.f2558b.mo40174a(TimeUnit.SECONDS.toMillis((long) i), this.f2559c);
            this.f2557a.mo39477b();
            return true;
        }
    }

    /* renamed from: a */
    public C3133c mo39472a(Runnable runnable, C4257xh xhVar) {
        return mo39471a(xhVar, new C3481h.C3483a(runnable), new C3131a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C3133c mo39471a(C4257xh xhVar, C3481h.C3483a aVar, C3131a aVar2) {
        C3133c cVar = new C3133c(xhVar, aVar, aVar2);
        this.f2551a.add(cVar);
        return cVar;
    }

    /* renamed from: a */
    public void mo39473a(C4143uk ukVar) {
        for (C3133c a : this.f2551a) {
            a.mo39480a(ukVar);
        }
    }
}
