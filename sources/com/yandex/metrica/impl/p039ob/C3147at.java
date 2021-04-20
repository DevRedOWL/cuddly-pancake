package com.yandex.metrica.impl.p039ob;

import android.os.Handler;
import android.os.SystemClock;

/* renamed from: com.yandex.metrica.impl.ob.at */
class C3147at {

    /* renamed from: a */
    private final Handler f2594a;

    /* renamed from: b */
    private final C3723n f2595b;

    /* renamed from: c */
    private final C3148au f2596c;

    C3147at(Handler handler, C3723n nVar) {
        this.f2594a = handler;
        this.f2595b = nVar;
        this.f2596c = new C3148au(handler, nVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39525a() {
        m2065b(this.f2594a, this.f2595b, this.f2596c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo39526b() {
        m2063a(this.f2594a, this.f2595b, this.f2596c);
    }

    /* renamed from: a */
    static void m2063a(Handler handler, C3723n nVar, Runnable runnable) {
        m2065b(handler, nVar, runnable);
        handler.postAtTime(runnable, m2064b(nVar), m2062a(nVar));
    }

    /* renamed from: a */
    private static long m2062a(C3723n nVar) {
        return SystemClock.uptimeMillis() + ((long) m2066c(nVar));
    }

    /* renamed from: b */
    private static void m2065b(Handler handler, C3723n nVar, Runnable runnable) {
        handler.removeCallbacks(runnable, m2064b(nVar));
    }

    /* renamed from: b */
    private static String m2064b(C3723n nVar) {
        return nVar.mo40667d().mo39947h().mo39242e();
    }

    /* renamed from: c */
    private static int m2066c(C3723n nVar) {
        return C4232wk.m6035a(nVar.mo40667d().mo39947h().mo39233c(), 10) * 500;
    }
}
