package com.yandex.metrica.impl.p039ob;

import android.os.SystemClock;
import java.util.GregorianCalendar;

/* renamed from: com.yandex.metrica.impl.ob.wi */
public final class C4229wi {
    /* renamed from: a */
    public static final long m6028a() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public static long m6029b() {
        return System.currentTimeMillis() / 1000;
    }

    /* renamed from: c */
    public static long m6030c() {
        return C4222wd.m6001a().mo41760b();
    }

    /* renamed from: a */
    public static int m6027a(long j) {
        return ((GregorianCalendar) GregorianCalendar.getInstance()).getTimeZone().getOffset(j * 1000) / 1000;
    }

    /* renamed from: d */
    public static long m6031d() {
        return SystemClock.elapsedRealtime() / 1000;
    }
}
