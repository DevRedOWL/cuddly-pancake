package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.cm */
final class C2185cm {

    /* renamed from: a */
    private byte[] f1749a = new byte[4096];

    /* renamed from: b */
    private int f1750b;

    /* renamed from: c */
    private long f1751c;

    /* renamed from: d */
    private long f1752d;

    /* renamed from: e */
    private int f1753e;

    /* renamed from: f */
    private int f1754f;

    /* renamed from: g */
    private int f1755g;

    /* renamed from: h */
    private boolean f1756h;

    /* renamed from: i */
    private String f1757i;

    public C2185cm() {
        mo33734d();
    }

    /* renamed from: e */
    private final int m1025e(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f1750b;
        if (i4 >= i) {
            return 0;
        }
        int min = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f1749a, this.f1750b, min);
        int i5 = this.f1750b + min;
        this.f1750b = i5;
        if (i5 < i) {
            return -1;
        }
        return min;
    }

    /* renamed from: a */
    public final int mo33731a(byte[] bArr, int i, int i2) {
        int e = m1025e(30, bArr, i, i2);
        if (e == -1) {
            return -1;
        }
        if (this.f1751c == -1) {
            long d = C2183ck.m1016d(this.f1749a, 0);
            this.f1751c = d;
            if (d == 67324752) {
                this.f1756h = false;
                this.f1752d = C2183ck.m1016d(this.f1749a, 18);
                this.f1755g = C2183ck.m1017e(this.f1749a, 8);
                this.f1753e = C2183ck.m1017e(this.f1749a, 26);
                int e2 = this.f1753e + 30 + C2183ck.m1017e(this.f1749a, 28);
                this.f1754f = e2;
                int length = this.f1749a.length;
                if (length < e2) {
                    do {
                        length += length;
                    } while (length < e2);
                    this.f1749a = Arrays.copyOf(this.f1749a, length);
                }
            } else {
                this.f1756h = true;
            }
        }
        int e3 = m1025e(this.f1754f, bArr, i + e, i2 - e);
        if (e3 == -1) {
            return -1;
        }
        int i3 = e + e3;
        if (!this.f1756h && this.f1757i == null) {
            this.f1757i = new String(this.f1749a, 30, this.f1753e);
        }
        return i3;
    }

    /* renamed from: b */
    public final C2204de mo33732b() {
        int i = this.f1750b;
        int i2 = this.f1754f;
        if (i < i2) {
            return C2204de.m1063a(this.f1757i, this.f1752d, this.f1755g, true, Arrays.copyOf(this.f1749a, i), this.f1756h);
        }
        C2204de a = C2204de.m1063a(this.f1757i, this.f1752d, this.f1755g, false, Arrays.copyOf(this.f1749a, i2), this.f1756h);
        mo33734d();
        return a;
    }

    /* renamed from: c */
    public final int mo33733c() {
        return this.f1754f;
    }

    /* renamed from: d */
    public final void mo33734d() {
        this.f1750b = 0;
        this.f1753e = -1;
        this.f1751c = -1;
        this.f1756h = false;
        this.f1754f = 30;
        this.f1752d = -1;
        this.f1755g = -1;
        this.f1757i = null;
    }
}
