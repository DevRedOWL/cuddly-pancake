package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.wk */
public class C4232wk {
    /* renamed from: a */
    public static <T> T m6038a(T t, T t2) {
        return t == null ? t2 : t;
    }

    /* renamed from: b */
    private static <T> T m6041b(T t, T t2) {
        return t == null ? t2 : t;
    }

    /* renamed from: a */
    public static String m6039a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* renamed from: b */
    public static String m6042b(String str, String str2) {
        return (String) m6041b(str, str2);
    }

    /* renamed from: a */
    public static boolean m6040a(Boolean bool, boolean z) {
        return ((Boolean) m6041b(bool, Boolean.valueOf(z))).booleanValue();
    }

    /* renamed from: a */
    public static long m6036a(Long l, long j) {
        return ((Long) m6041b(l, Long.valueOf(j))).longValue();
    }

    /* renamed from: a */
    public static int m6035a(Integer num, int i) {
        return ((Integer) m6041b(num, Integer.valueOf(i))).intValue();
    }

    /* renamed from: a */
    public static float m6034a(Float f, float f2) {
        return ((Float) m6041b(f, Float.valueOf(f2))).floatValue();
    }

    /* renamed from: a */
    public static long m6037a(Long l, TimeUnit timeUnit, long j) {
        return l == null ? j : timeUnit.toMillis(l.longValue());
    }
}
