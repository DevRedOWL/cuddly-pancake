package com.yandex.metrica.impl.p039ob;

import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.ak */
class C3135ak {

    /* renamed from: a */
    private long f2565a = (SystemClock.elapsedRealtime() - 2000000);

    /* renamed from: b */
    private boolean f2566b = true;

    C3135ak() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo39482a() {
        boolean z = this.f2566b;
        this.f2566b = false;
        return m1989a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39483b() {
        this.f2566b = true;
        this.f2565a = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    private boolean m1989a(boolean z) {
        return z && SystemClock.elapsedRealtime() - this.f2565a > 1000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo39484c() {
        return this.f2566b;
    }
}
