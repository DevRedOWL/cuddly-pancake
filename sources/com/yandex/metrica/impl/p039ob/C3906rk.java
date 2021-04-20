package com.yandex.metrica.impl.p039ob;

import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.rk */
public final class C3906rk extends C3365e {

    /* renamed from: b */
    public int f4374b;

    /* renamed from: c */
    public double f4375c;

    /* renamed from: d */
    public byte[] f4376d;

    /* renamed from: e */
    public byte[] f4377e;

    /* renamed from: f */
    public byte[] f4378f;

    /* renamed from: g */
    public C3907a f4379g;

    /* renamed from: h */
    public long f4380h;

    /* renamed from: com.yandex.metrica.impl.ob.rk$a */
    public static final class C3907a extends C3365e {

        /* renamed from: b */
        public byte[] f4381b;

        /* renamed from: c */
        public byte[] f4382c;

        public C3907a() {
            mo41034d();
        }

        /* renamed from: d */
        public C3907a mo41034d() {
            this.f4381b = C3442g.f3280h;
            this.f4382c = C3442g.f3280h;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            if (!Arrays.equals(this.f4381b, C3442g.f3280h)) {
                bVar.mo39556a(1, this.f4381b);
            }
            if (!Arrays.equals(this.f4382c, C3442g.f3280h)) {
                bVar.mo39556a(2, this.f4382c);
            }
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c();
            if (!Arrays.equals(this.f4381b, C3442g.f3280h)) {
                c += C3157b.m2108b(1, this.f4381b);
            }
            return !Arrays.equals(this.f4382c, C3442g.f3280h) ? c + C3157b.m2108b(2, this.f4382c) : c;
        }

        /* renamed from: b */
        public C3907a mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    this.f4381b = aVar.mo39433j();
                } else if (a == 18) {
                    this.f4382c = aVar.mo39433j();
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }

    public C3906rk() {
        mo41032d();
    }

    /* renamed from: d */
    public C3906rk mo41032d() {
        this.f4374b = 1;
        this.f4375c = Utils.DOUBLE_EPSILON;
        this.f4376d = C3442g.f3280h;
        this.f4377e = C3442g.f3280h;
        this.f4378f = C3442g.f3280h;
        this.f4379g = null;
        this.f4380h = 0;
        this.f3093a = -1;
        return this;
    }

    /* renamed from: a */
    public void mo39942a(C3157b bVar) throws IOException {
        int i = this.f4374b;
        if (i != 1) {
            bVar.mo39564b(1, i);
        }
        if (Double.doubleToLongBits(this.f4375c) != Double.doubleToLongBits(Utils.DOUBLE_EPSILON)) {
            bVar.mo39549a(2, this.f4375c);
        }
        bVar.mo39556a(3, this.f4376d);
        if (!Arrays.equals(this.f4377e, C3442g.f3280h)) {
            bVar.mo39556a(4, this.f4377e);
        }
        if (!Arrays.equals(this.f4378f, C3442g.f3280h)) {
            bVar.mo39556a(5, this.f4378f);
        }
        C3907a aVar = this.f4379g;
        if (aVar != null) {
            bVar.mo39553a(6, (C3365e) aVar);
        }
        long j = this.f4380h;
        if (j != 0) {
            bVar.mo39565b(7, j);
        }
        super.mo39942a(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo39944c() {
        int c = super.mo39944c();
        int i = this.f4374b;
        if (i != 1) {
            c += C3157b.m2118e(1, i);
        }
        if (Double.doubleToLongBits(this.f4375c) != Double.doubleToLongBits(Utils.DOUBLE_EPSILON)) {
            c += C3157b.m2103b(2, this.f4375c);
        }
        int b = c + C3157b.m2108b(3, this.f4376d);
        if (!Arrays.equals(this.f4377e, C3442g.f3280h)) {
            b += C3157b.m2108b(4, this.f4377e);
        }
        if (!Arrays.equals(this.f4378f, C3442g.f3280h)) {
            b += C3157b.m2108b(5, this.f4378f);
        }
        C3907a aVar = this.f4379g;
        if (aVar != null) {
            b += C3157b.m2105b(6, (C3365e) aVar);
        }
        long j = this.f4380h;
        return j != 0 ? b + C3157b.m2119e(7, j) : b;
    }

    /* renamed from: b */
    public C3906rk mo39941a(C3115a aVar) throws IOException {
        while (true) {
            int a = aVar.mo39416a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f4374b = aVar.mo39434k();
            } else if (a == 17) {
                this.f4375c = aVar.mo39421c();
            } else if (a == 26) {
                this.f4376d = aVar.mo39433j();
            } else if (a == 34) {
                this.f4377e = aVar.mo39433j();
            } else if (a == 42) {
                this.f4378f = aVar.mo39433j();
            } else if (a == 50) {
                if (this.f4379g == null) {
                    this.f4379g = new C3907a();
                }
                aVar.mo39418a((C3365e) this.f4379g);
            } else if (a == 56) {
                this.f4380h = aVar.mo39426f();
            } else if (!C3442g.m3331a(aVar, a)) {
                return this;
            }
        }
    }
}
