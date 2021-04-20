package com.yandex.metrica.impl.p039ob;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.b */
public final class C3157b {

    /* renamed from: a */
    private final byte[] f2621a;

    /* renamed from: b */
    private final int f2622b;

    /* renamed from: c */
    private int f2623c;

    /* renamed from: b */
    public static int m2101b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m2102b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m2111b(boolean z) {
        return 1;
    }

    /* renamed from: h */
    public static int m2126h(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: j */
    public static int m2127j(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: j */
    public static long m2128j(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: l */
    public static int m2129l(int i) {
        return (i >> 31) ^ (i << 1);
    }

    private C3157b(byte[] bArr, int i, int i2) {
        this.f2621a = bArr;
        this.f2623c = i;
        this.f2622b = i + i2;
    }

    /* renamed from: a */
    public static C3157b m2100a(byte[] bArr, int i, int i2) {
        return new C3157b(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo39549a(int i, double d) throws IOException {
        mo39574g(i, 1);
        mo39546a(d);
    }

    /* renamed from: a */
    public void mo39550a(int i, float f) throws IOException {
        mo39574g(i, 5);
        mo39547a(f);
    }

    /* renamed from: a */
    public void mo39552a(int i, long j) throws IOException {
        mo39574g(i, 0);
        mo39557a(j);
    }

    /* renamed from: b */
    public void mo39565b(int i, long j) throws IOException {
        mo39574g(i, 0);
        mo39566b(j);
    }

    /* renamed from: a */
    public void mo39551a(int i, int i2) throws IOException {
        mo39574g(i, 0);
        mo39548a(i2);
    }

    /* renamed from: a */
    public void mo39555a(int i, boolean z) throws IOException {
        mo39574g(i, 0);
        mo39560a(z);
    }

    /* renamed from: a */
    public void mo39554a(int i, String str) throws IOException {
        mo39574g(i, 2);
        mo39559a(str);
    }

    /* renamed from: a */
    public void mo39553a(int i, C3365e eVar) throws IOException {
        mo39574g(i, 2);
        mo39558a(eVar);
    }

    /* renamed from: a */
    public void mo39556a(int i, byte[] bArr) throws IOException {
        mo39574g(i, 2);
        mo39561a(bArr);
    }

    /* renamed from: b */
    public void mo39564b(int i, int i2) throws IOException {
        mo39574g(i, 0);
        mo39563b(i2);
    }

    /* renamed from: c */
    public void mo39569c(int i, int i2) throws IOException {
        mo39574g(i, 0);
        mo39568c(i2);
    }

    /* renamed from: c */
    public void mo39570c(int i, long j) throws IOException {
        mo39574g(i, 0);
        mo39571c(j);
    }

    /* renamed from: a */
    public void mo39546a(double d) throws IOException {
        mo39577i(Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public void mo39547a(float f) throws IOException {
        mo39578k(Float.floatToIntBits(f));
    }

    /* renamed from: a */
    public void mo39557a(long j) throws IOException {
        mo39575g(j);
    }

    /* renamed from: b */
    public void mo39566b(long j) throws IOException {
        mo39575g(j);
    }

    /* renamed from: a */
    public void mo39548a(int i) throws IOException {
        if (i >= 0) {
            mo39576i(i);
        } else {
            mo39575g((long) i);
        }
    }

    /* renamed from: a */
    public void mo39560a(boolean z) throws IOException {
        mo39573g(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo39559a(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        mo39576i(bytes.length);
        mo39572c(bytes);
    }

    /* renamed from: a */
    public void mo39558a(C3365e eVar) throws IOException {
        mo39576i(eVar.mo39940a());
        eVar.mo39942a(this);
    }

    /* renamed from: a */
    public void mo39561a(byte[] bArr) throws IOException {
        mo39576i(bArr.length);
        mo39572c(bArr);
    }

    /* renamed from: b */
    public void mo39563b(int i) throws IOException {
        mo39576i(i);
    }

    /* renamed from: c */
    public void mo39568c(int i) throws IOException {
        mo39576i(m2129l(i));
    }

    /* renamed from: c */
    public void mo39571c(long j) throws IOException {
        mo39575g(m2128j(j));
    }

    /* renamed from: b */
    public static int m2103b(int i, double d) {
        return m2125h(i) + m2101b(d);
    }

    /* renamed from: b */
    public static int m2104b(int i, float f) {
        return m2125h(i) + m2102b(f);
    }

    /* renamed from: d */
    public static int m2115d(int i, long j) {
        return m2125h(i) + m2116d(j);
    }

    /* renamed from: e */
    public static int m2119e(int i, long j) {
        return m2125h(i) + m2120e(j);
    }

    /* renamed from: d */
    public static int m2114d(int i, int i2) {
        return m2125h(i) + m2113d(i2);
    }

    /* renamed from: b */
    public static int m2107b(int i, boolean z) {
        return m2125h(i) + m2111b(z);
    }

    /* renamed from: b */
    public static int m2106b(int i, String str) {
        return m2125h(i) + m2110b(str);
    }

    /* renamed from: b */
    public static int m2105b(int i, C3365e eVar) {
        return m2125h(i) + m2109b(eVar);
    }

    /* renamed from: b */
    public static int m2108b(int i, byte[] bArr) {
        return m2125h(i) + m2112b(bArr);
    }

    /* renamed from: e */
    public static int m2118e(int i, int i2) {
        return m2125h(i) + m2117e(i2);
    }

    /* renamed from: f */
    public static int m2122f(int i, int i2) {
        return m2125h(i) + m2121f(i2);
    }

    /* renamed from: f */
    public static int m2123f(int i, long j) {
        return m2125h(i) + m2124f(j);
    }

    /* renamed from: d */
    public static int m2116d(long j) {
        return m2126h(j);
    }

    /* renamed from: e */
    public static int m2120e(long j) {
        return m2126h(j);
    }

    /* renamed from: d */
    public static int m2113d(int i) {
        if (i >= 0) {
            return m2127j(i);
        }
        return 10;
    }

    /* renamed from: b */
    public static int m2110b(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m2127j(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: b */
    public static int m2109b(C3365e eVar) {
        int b = eVar.mo39943b();
        return m2127j(b) + b;
    }

    /* renamed from: b */
    public static int m2112b(byte[] bArr) {
        return m2127j(bArr.length) + bArr.length;
    }

    /* renamed from: e */
    public static int m2117e(int i) {
        return m2127j(i);
    }

    /* renamed from: f */
    public static int m2121f(int i) {
        return m2127j(m2129l(i));
    }

    /* renamed from: f */
    public static int m2124f(long j) {
        return m2126h(m2128j(j));
    }

    /* renamed from: a */
    public int mo39544a() {
        return this.f2622b - this.f2623c;
    }

    /* renamed from: b */
    public void mo39562b() {
        if (mo39544a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.b$a */
    public static class C3158a extends IOException {
        C3158a(int i, int i2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i + " limit " + i2 + ").");
        }
    }

    /* renamed from: a */
    public void mo39545a(byte b) throws IOException {
        int i = this.f2623c;
        int i2 = this.f2622b;
        if (i != i2) {
            byte[] bArr = this.f2621a;
            this.f2623c = i + 1;
            bArr[i] = b;
            return;
        }
        throw new C3158a(i, i2);
    }

    /* renamed from: g */
    public void mo39573g(int i) throws IOException {
        mo39545a((byte) i);
    }

    /* renamed from: c */
    public void mo39572c(byte[] bArr) throws IOException {
        mo39567b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public void mo39567b(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f2622b;
        int i4 = this.f2623c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f2621a, i4, i2);
            this.f2623c += i2;
            return;
        }
        throw new C3158a(i4, i3);
    }

    /* renamed from: g */
    public void mo39574g(int i, int i2) throws IOException {
        mo39576i(C3442g.m3330a(i, i2));
    }

    /* renamed from: h */
    public static int m2125h(int i) {
        return m2127j(C3442g.m3330a(i, 0));
    }

    /* renamed from: i */
    public void mo39576i(int i) throws IOException {
        while ((i & -128) != 0) {
            mo39573g((i & 127) | 128);
            i >>>= 7;
        }
        mo39573g(i);
    }

    /* renamed from: g */
    public void mo39575g(long j) throws IOException {
        while ((-128 & j) != 0) {
            mo39573g((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo39573g((int) j);
    }

    /* renamed from: k */
    public void mo39578k(int i) throws IOException {
        mo39573g(i & 255);
        mo39573g((i >> 8) & 255);
        mo39573g((i >> 16) & 255);
        mo39573g((i >> 24) & 255);
    }

    /* renamed from: i */
    public void mo39577i(long j) throws IOException {
        mo39573g(((int) j) & 255);
        mo39573g(((int) (j >> 8)) & 255);
        mo39573g(((int) (j >> 16)) & 255);
        mo39573g(((int) (j >> 24)) & 255);
        mo39573g(((int) (j >> 32)) & 255);
        mo39573g(((int) (j >> 40)) & 255);
        mo39573g(((int) (j >> 48)) & 255);
        mo39573g(((int) (j >> 56)) & 255);
    }
}
