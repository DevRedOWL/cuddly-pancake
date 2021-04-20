package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.g */
public final class C3442g {

    /* renamed from: a */
    public static final int[] f3273a = new int[0];

    /* renamed from: b */
    public static final long[] f3274b = new long[0];

    /* renamed from: c */
    public static final float[] f3275c = new float[0];

    /* renamed from: d */
    public static final double[] f3276d = new double[0];

    /* renamed from: e */
    public static final boolean[] f3277e = new boolean[0];

    /* renamed from: f */
    public static final String[] f3278f = new String[0];

    /* renamed from: g */
    public static final byte[][] f3279g = new byte[0][];

    /* renamed from: h */
    public static final byte[] f3280h = new byte[0];

    /* renamed from: a */
    static int m3329a(int i) {
        return i & 7;
    }

    /* renamed from: a */
    static int m3330a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: b */
    public static int m3332b(int i) {
        return i >>> 3;
    }

    /* renamed from: a */
    public static boolean m3331a(C3115a aVar, int i) throws IOException {
        return aVar.mo39420b(i);
    }

    /* renamed from: b */
    public static final int m3333b(C3115a aVar, int i) throws IOException {
        int t = aVar.mo39443t();
        aVar.mo39420b(i);
        int i2 = 1;
        while (aVar.mo39416a() == i) {
            aVar.mo39420b(i);
            i2++;
        }
        aVar.mo39427f(t);
        return i2;
    }
}
