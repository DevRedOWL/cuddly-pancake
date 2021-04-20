package com.google.android.play.core.splitinstall;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitinstall.o */
public final class C2385o {

    /* renamed from: a */
    private static final AtomicReference<C2384n> f2118a = new AtomicReference<>((Object) null);

    /* renamed from: a */
    static C2384n m1536a() {
        return f2118a.get();
    }

    /* renamed from: b */
    public static void m1537b(C2384n nVar) {
        f2118a.compareAndSet((Object) null, nVar);
    }
}
