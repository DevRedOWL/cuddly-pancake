package com.yandex.metrica.impl.p039ob;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.yandex.metrica.impl.ob.xm */
public class C4262xm implements ThreadFactory {

    /* renamed from: a */
    private static final AtomicInteger f5311a = new AtomicInteger(0);

    /* renamed from: b */
    private final String f5312b;

    public C4262xm(String str) {
        this.f5312b = str;
    }

    /* renamed from: a */
    public C4261xl newThread(Runnable runnable) {
        return new C4261xl(runnable, m6115c());
    }

    /* renamed from: c */
    private String m6115c() {
        return m6113a(this.f5312b);
    }

    /* renamed from: a */
    public C4260xk mo41815a() {
        return new C4260xk(m6115c());
    }

    /* renamed from: a */
    public static C4261xl m6112a(String str, Runnable runnable) {
        return new C4262xm(str).newThread(runnable);
    }

    /* renamed from: a */
    public static String m6113a(String str) {
        return str + "-" + m6114b();
    }

    /* renamed from: b */
    public static int m6114b() {
        return f5311a.incrementAndGet();
    }
}
