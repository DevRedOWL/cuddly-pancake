package com.yandex.metrica.impl.p039ob;

/* renamed from: com.yandex.metrica.impl.ob.vy */
public class C4215vy {
    /* renamed from: a */
    public static long m5929a(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: a */
    public static Long m5930a(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Float m5931b(String str) {
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Integer m5932c(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
