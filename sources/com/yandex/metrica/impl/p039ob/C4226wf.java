package com.yandex.metrica.impl.p039ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.wf */
public class C4226wf {

    /* renamed from: a */
    private final C4227wg f5272a;

    public C4226wf() {
        this(new C4227wg());
    }

    public C4226wf(C4227wg wgVar) {
        this.f5272a = wgVar;
    }

    /* renamed from: a */
    public long mo41763a(long j, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(mo41764b(j, timeUnit));
    }

    /* renamed from: b */
    public long mo41764b(long j, TimeUnit timeUnit) {
        return this.f5272a.mo41770c() - timeUnit.toMillis(j);
    }

    /* renamed from: c */
    public long mo41765c(long j, TimeUnit timeUnit) {
        return this.f5272a.mo41771d() - timeUnit.toNanos(j);
    }

    /* renamed from: d */
    public long mo41766d(long j, TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(mo41765c(j, timeUnit));
    }

    /* renamed from: e */
    public long mo41767e(long j, TimeUnit timeUnit) {
        return this.f5272a.mo41769b() - timeUnit.toSeconds(j);
    }
}
