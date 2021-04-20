package com.yandex.metrica.impl.p039ob;

import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.rl */
public interface C3908rl {

    /* renamed from: com.yandex.metrica.impl.ob.rl$a */
    public static final class C3909a extends C3365e {

        /* renamed from: b */
        public C3910a[] f4383b;

        /* renamed from: com.yandex.metrica.impl.ob.rl$a$b */
        public static final class C3911b extends C3365e {

            /* renamed from: b */
            public boolean f4389b;

            /* renamed from: c */
            public boolean f4390c;

            public C3911b() {
                mo41040d();
            }

            /* renamed from: d */
            public C3911b mo41040d() {
                this.f4389b = false;
                this.f4390c = false;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                boolean z = this.f4389b;
                if (z) {
                    bVar.mo39555a(1, z);
                }
                boolean z2 = this.f4390c;
                if (z2) {
                    bVar.mo39555a(2, z2);
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c();
                boolean z = this.f4389b;
                if (z) {
                    c += C3157b.m2107b(1, z);
                }
                boolean z2 = this.f4390c;
                return z2 ? c + C3157b.m2107b(2, z2) : c;
            }

            /* renamed from: b */
            public C3911b mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4389b = aVar.mo39431h();
                    } else if (a == 16) {
                        this.f4390c = aVar.mo39431h();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rl$a$c */
        public static final class C3912c extends C3365e {

            /* renamed from: b */
            public byte[] f4391b;

            /* renamed from: c */
            public double f4392c;

            /* renamed from: d */
            public double f4393d;

            /* renamed from: e */
            public boolean f4394e;

            public C3912c() {
                mo41042d();
            }

            /* renamed from: d */
            public C3912c mo41042d() {
                this.f4391b = C3442g.f3280h;
                this.f4392c = Utils.DOUBLE_EPSILON;
                this.f4393d = Utils.DOUBLE_EPSILON;
                this.f4394e = false;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                if (!Arrays.equals(this.f4391b, C3442g.f3280h)) {
                    bVar.mo39556a(1, this.f4391b);
                }
                if (Double.doubleToLongBits(this.f4392c) != Double.doubleToLongBits(Utils.DOUBLE_EPSILON)) {
                    bVar.mo39549a(2, this.f4392c);
                }
                if (Double.doubleToLongBits(this.f4393d) != Double.doubleToLongBits(Utils.DOUBLE_EPSILON)) {
                    bVar.mo39549a(3, this.f4393d);
                }
                boolean z = this.f4394e;
                if (z) {
                    bVar.mo39555a(4, z);
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c();
                if (!Arrays.equals(this.f4391b, C3442g.f3280h)) {
                    c += C3157b.m2108b(1, this.f4391b);
                }
                if (Double.doubleToLongBits(this.f4392c) != Double.doubleToLongBits(Utils.DOUBLE_EPSILON)) {
                    c += C3157b.m2103b(2, this.f4392c);
                }
                if (Double.doubleToLongBits(this.f4393d) != Double.doubleToLongBits(Utils.DOUBLE_EPSILON)) {
                    c += C3157b.m2103b(3, this.f4393d);
                }
                boolean z = this.f4394e;
                return z ? c + C3157b.m2107b(4, z) : c;
            }

            /* renamed from: b */
            public C3912c mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        this.f4391b = aVar.mo39433j();
                    } else if (a == 17) {
                        this.f4392c = aVar.mo39421c();
                    } else if (a == 25) {
                        this.f4393d = aVar.mo39421c();
                    } else if (a == 32) {
                        this.f4394e = aVar.mo39431h();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rl$a$a */
        public static final class C3910a extends C3365e {

            /* renamed from: f */
            private static volatile C3910a[] f4384f;

            /* renamed from: b */
            public byte[] f4385b;

            /* renamed from: c */
            public int f4386c;

            /* renamed from: d */
            public C3911b f4387d;

            /* renamed from: e */
            public C3912c f4388e;

            /* renamed from: d */
            public static C3910a[] m4862d() {
                if (f4384f == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4384f == null) {
                            f4384f = new C3910a[0];
                        }
                    }
                }
                return f4384f;
            }

            public C3910a() {
                mo41038e();
            }

            /* renamed from: e */
            public C3910a mo41038e() {
                this.f4385b = C3442g.f3280h;
                this.f4386c = 0;
                this.f4387d = null;
                this.f4388e = null;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39556a(1, this.f4385b);
                bVar.mo39551a(2, this.f4386c);
                C3911b bVar2 = this.f4387d;
                if (bVar2 != null) {
                    bVar.mo39553a(3, (C3365e) bVar2);
                }
                C3912c cVar = this.f4388e;
                if (cVar != null) {
                    bVar.mo39553a(4, (C3365e) cVar);
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c() + C3157b.m2108b(1, this.f4385b) + C3157b.m2114d(2, this.f4386c);
                C3911b bVar = this.f4387d;
                if (bVar != null) {
                    c += C3157b.m2105b(3, (C3365e) bVar);
                }
                C3912c cVar = this.f4388e;
                return cVar != null ? c + C3157b.m2105b(4, (C3365e) cVar) : c;
            }

            /* renamed from: b */
            public C3910a mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        this.f4385b = aVar.mo39433j();
                    } else if (a == 16) {
                        int g = aVar.mo39428g();
                        if (g == 0 || g == 1 || g == 2 || g == 3) {
                            this.f4386c = g;
                        }
                    } else if (a == 26) {
                        if (this.f4387d == null) {
                            this.f4387d = new C3911b();
                        }
                        aVar.mo39418a((C3365e) this.f4387d);
                    } else if (a == 34) {
                        if (this.f4388e == null) {
                            this.f4388e = new C3912c();
                        }
                        aVar.mo39418a((C3365e) this.f4388e);
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        public C3909a() {
            mo41036d();
        }

        /* renamed from: d */
        public C3909a mo41036d() {
            this.f4383b = C3910a.m4862d();
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            C3910a[] aVarArr = this.f4383b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3910a[] aVarArr2 = this.f4383b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3910a aVar = aVarArr2[i];
                    if (aVar != null) {
                        bVar.mo39553a(1, (C3365e) aVar);
                    }
                    i++;
                }
            }
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c();
            C3910a[] aVarArr = this.f4383b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3910a[] aVarArr2 = this.f4383b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3910a aVar = aVarArr2[i];
                    if (aVar != null) {
                        c += C3157b.m2105b(1, (C3365e) aVar);
                    }
                    i++;
                }
            }
            return c;
        }

        /* renamed from: b */
        public C3909a mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    int b = C3442g.m3333b(aVar, 10);
                    C3910a[] aVarArr = this.f4383b;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    C3910a[] aVarArr2 = new C3910a[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4383b, 0, aVarArr2, 0, length);
                    }
                    while (length < aVarArr2.length - 1) {
                        aVarArr2[length] = new C3910a();
                        aVar.mo39418a((C3365e) aVarArr2[length]);
                        aVar.mo39416a();
                        length++;
                    }
                    aVarArr2[length] = new C3910a();
                    aVar.mo39418a((C3365e) aVarArr2[length]);
                    this.f4383b = aVarArr2;
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }
}
