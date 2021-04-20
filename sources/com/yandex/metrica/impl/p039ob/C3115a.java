package com.yandex.metrica.impl.p039ob;

import java.io.IOException;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.yandex.metrica.impl.ob.a */
public final class C3115a {

    /* renamed from: a */
    private final byte[] f2466a;

    /* renamed from: b */
    private int f2467b;

    /* renamed from: c */
    private int f2468c;

    /* renamed from: d */
    private int f2469d;

    /* renamed from: e */
    private int f2470e;

    /* renamed from: f */
    private int f2471f;

    /* renamed from: g */
    private int f2472g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f2473h;

    /* renamed from: i */
    private int f2474i = 64;

    /* renamed from: j */
    private int f2475j = 67108864;

    /* renamed from: a */
    public static long m1878a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* renamed from: c */
    public static int m1880c(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* renamed from: a */
    public static C3115a m1879a(byte[] bArr, int i, int i2) {
        return new C3115a(bArr, i, i2);
    }

    /* renamed from: a */
    public int mo39416a() throws IOException {
        if (mo39442s()) {
            this.f2471f = 0;
            return 0;
        }
        this.f2471f = mo39437n();
        int i = this.f2471f;
        if (i != 0) {
            return i;
        }
        throw C3318d.m2918d();
    }

    /* renamed from: a */
    public void mo39417a(int i) throws C3318d {
        if (this.f2471f != i) {
            throw C3318d.m2919e();
        }
    }

    /* renamed from: b */
    public boolean mo39420b(int i) throws IOException {
        int a = C3442g.m3329a(i);
        if (a == 0) {
            mo39428g();
            return true;
        } else if (a == 1) {
            mo39440q();
            return true;
        } else if (a == 2) {
            mo39430h(mo39437n());
            return true;
        } else if (a == 3) {
            mo39419b();
            mo39417a(C3442g.m3330a(C3442g.m3332b(i), 4));
            return true;
        } else if (a == 4) {
            return false;
        } else {
            if (a == 5) {
                mo39439p();
                return true;
            }
            throw C3318d.m2920f();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public void mo39419b() throws java.io.IOException {
        /*
            r1 = this;
        L_0x0000:
            int r0 = r1.mo39416a()
            if (r0 == 0) goto L_0x000c
            boolean r0 = r1.mo39420b(r0)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p039ob.C3115a.mo39419b():void");
    }

    /* renamed from: c */
    public double mo39421c() throws IOException {
        return Double.longBitsToDouble(mo39440q());
    }

    /* renamed from: d */
    public float mo39422d() throws IOException {
        return Float.intBitsToFloat(mo39439p());
    }

    /* renamed from: e */
    public long mo39424e() throws IOException {
        return mo39438o();
    }

    /* renamed from: f */
    public long mo39426f() throws IOException {
        return mo39438o();
    }

    /* renamed from: g */
    public int mo39428g() throws IOException {
        return mo39437n();
    }

    /* renamed from: h */
    public boolean mo39431h() throws IOException {
        return mo39437n() != 0;
    }

    /* renamed from: i */
    public String mo39432i() throws IOException {
        int n = mo39437n();
        int i = this.f2468c;
        int i2 = this.f2470e;
        if (n > i - i2 || n <= 0) {
            return new String(mo39429g(n), "UTF-8");
        }
        String str = new String(this.f2466a, i2, n, "UTF-8");
        this.f2470e += n;
        return str;
    }

    /* renamed from: a */
    public void mo39418a(C3365e eVar) throws IOException {
        int n = mo39437n();
        if (this.f2473h < this.f2474i) {
            int d = mo39423d(n);
            this.f2473h++;
            eVar.mo39941a(this);
            mo39417a(0);
            this.f2473h--;
            mo39425e(d);
            return;
        }
        throw C3318d.m2921g();
    }

    /* renamed from: j */
    public byte[] mo39433j() throws IOException {
        int n = mo39437n();
        int i = this.f2468c;
        int i2 = this.f2470e;
        if (n > i - i2 || n <= 0) {
            return mo39429g(n);
        }
        byte[] bArr = new byte[n];
        System.arraycopy(this.f2466a, i2, bArr, 0, n);
        this.f2470e += n;
        return bArr;
    }

    /* renamed from: k */
    public int mo39434k() throws IOException {
        return mo39437n();
    }

    /* renamed from: l */
    public int mo39435l() throws IOException {
        return m1880c(mo39437n());
    }

    /* renamed from: m */
    public long mo39436m() throws IOException {
        return m1878a(mo39438o());
    }

    /* renamed from: n */
    public int mo39437n() throws IOException {
        int i;
        byte u = mo39444u();
        if (u >= 0) {
            return u;
        }
        byte b = u & ByteCompanionObject.MAX_VALUE;
        byte u2 = mo39444u();
        if (u2 >= 0) {
            i = u2 << 7;
        } else {
            b |= (u2 & ByteCompanionObject.MAX_VALUE) << 7;
            byte u3 = mo39444u();
            if (u3 >= 0) {
                i = u3 << 14;
            } else {
                b |= (u3 & ByteCompanionObject.MAX_VALUE) << 14;
                byte u4 = mo39444u();
                if (u4 >= 0) {
                    i = u4 << 21;
                } else {
                    byte b2 = b | ((u4 & ByteCompanionObject.MAX_VALUE) << 21);
                    byte u5 = mo39444u();
                    byte b3 = b2 | (u5 << 28);
                    if (u5 >= 0) {
                        return b3;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (mo39444u() >= 0) {
                            return b3;
                        }
                    }
                    throw C3318d.m2917c();
                }
            }
        }
        return b | i;
    }

    /* renamed from: o */
    public long mo39438o() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte u = mo39444u();
            j |= ((long) (u & ByteCompanionObject.MAX_VALUE)) << i;
            if ((u & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw C3318d.m2917c();
    }

    /* renamed from: p */
    public int mo39439p() throws IOException {
        return (mo39444u() & 255) | ((mo39444u() & 255) << 8) | ((mo39444u() & 255) << 16) | ((mo39444u() & 255) << 24);
    }

    /* renamed from: q */
    public long mo39440q() throws IOException {
        byte u = mo39444u();
        byte u2 = mo39444u();
        return ((((long) u2) & 255) << 8) | (((long) u) & 255) | ((((long) mo39444u()) & 255) << 16) | ((((long) mo39444u()) & 255) << 24) | ((((long) mo39444u()) & 255) << 32) | ((((long) mo39444u()) & 255) << 40) | ((((long) mo39444u()) & 255) << 48) | ((((long) mo39444u()) & 255) << 56);
    }

    private C3115a(byte[] bArr, int i, int i2) {
        this.f2466a = bArr;
        this.f2467b = i;
        this.f2468c = i2 + i;
        this.f2470e = i;
    }

    /* renamed from: d */
    public int mo39423d(int i) throws C3318d {
        if (i >= 0) {
            int i2 = i + this.f2470e;
            int i3 = this.f2472g;
            if (i2 <= i3) {
                this.f2472g = i2;
                m1881v();
                return i3;
            }
            throw C3318d.m2915a();
        }
        throw C3318d.m2916b();
    }

    /* renamed from: v */
    private void m1881v() {
        this.f2468c += this.f2469d;
        int i = this.f2468c;
        int i2 = this.f2472g;
        if (i > i2) {
            this.f2469d = i - i2;
            this.f2468c = i - this.f2469d;
            return;
        }
        this.f2469d = 0;
    }

    /* renamed from: e */
    public void mo39425e(int i) {
        this.f2472g = i;
        m1881v();
    }

    /* renamed from: r */
    public int mo39441r() {
        int i = this.f2472g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.f2470e;
    }

    /* renamed from: s */
    public boolean mo39442s() {
        return this.f2470e == this.f2468c;
    }

    /* renamed from: t */
    public int mo39443t() {
        return this.f2470e - this.f2467b;
    }

    /* renamed from: f */
    public void mo39427f(int i) {
        int i2 = this.f2470e;
        int i3 = this.f2467b;
        if (i > i2 - i3) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.f2470e - this.f2467b));
        } else if (i >= 0) {
            this.f2470e = i3 + i;
        } else {
            throw new IllegalArgumentException("Bad position " + i);
        }
    }

    /* renamed from: u */
    public byte mo39444u() throws IOException {
        int i = this.f2470e;
        if (i != this.f2468c) {
            byte[] bArr = this.f2466a;
            this.f2470e = i + 1;
            return bArr[i];
        }
        throw C3318d.m2915a();
    }

    /* renamed from: g */
    public byte[] mo39429g(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f2470e;
            int i3 = i2 + i;
            int i4 = this.f2472g;
            if (i3 > i4) {
                mo39430h(i4 - i2);
                throw C3318d.m2915a();
            } else if (i <= this.f2468c - i2) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.f2466a, i2, bArr, 0, i);
                this.f2470e += i;
                return bArr;
            } else {
                throw C3318d.m2915a();
            }
        } else {
            throw C3318d.m2916b();
        }
    }

    /* renamed from: h */
    public void mo39430h(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.f2470e;
            int i3 = i2 + i;
            int i4 = this.f2472g;
            if (i3 > i4) {
                mo39430h(i4 - i2);
                throw C3318d.m2915a();
            } else if (i <= this.f2468c - i2) {
                this.f2470e = i2 + i;
            } else {
                throw C3318d.m2915a();
            }
        } else {
            throw C3318d.m2916b();
        }
    }
}
