package com.yandex.metrica.impl.p039ob;

import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.metrica.impl.ob.rh */
public interface C3884rh {

    /* renamed from: com.yandex.metrica.impl.ob.rh$c */
    public static final class C3889c extends C3365e {

        /* renamed from: b */
        public C3895e[] f4279b;

        /* renamed from: c */
        public C3893d f4280c;

        /* renamed from: d */
        public C3890a[] f4281d;

        /* renamed from: e */
        public C3892c[] f4282e;

        /* renamed from: f */
        public String[] f4283f;

        /* renamed from: g */
        public C3901f[] f4284g;

        /* renamed from: h */
        public String[] f4285h;

        /* renamed from: com.yandex.metrica.impl.ob.rh$c$g */
        public static final class C3902g extends C3365e {

            /* renamed from: b */
            public long f4358b;

            /* renamed from: c */
            public int f4359c;

            /* renamed from: d */
            public long f4360d;

            /* renamed from: e */
            public boolean f4361e;

            public C3902g() {
                mo41024d();
            }

            /* renamed from: d */
            public C3902g mo41024d() {
                this.f4358b = 0;
                this.f4359c = 0;
                this.f4360d = 0;
                this.f4361e = false;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39552a(1, this.f4358b);
                bVar.mo39569c(2, this.f4359c);
                long j = this.f4360d;
                if (j != 0) {
                    bVar.mo39565b(3, j);
                }
                boolean z = this.f4361e;
                if (z) {
                    bVar.mo39555a(4, z);
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c() + C3157b.m2115d(1, this.f4358b) + C3157b.m2122f(2, this.f4359c);
                long j = this.f4360d;
                if (j != 0) {
                    c += C3157b.m2119e(3, j);
                }
                boolean z = this.f4361e;
                return z ? c + C3157b.m2107b(4, z) : c;
            }

            /* renamed from: b */
            public C3902g mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4358b = aVar.mo39424e();
                    } else if (a == 16) {
                        this.f4359c = aVar.mo39435l();
                    } else if (a == 24) {
                        this.f4360d = aVar.mo39426f();
                    } else if (a == 32) {
                        this.f4361e = aVar.mo39431h();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rh$c$b */
        public static final class C3891b extends C3365e {

            /* renamed from: b */
            public double f4289b;

            /* renamed from: c */
            public double f4290c;

            /* renamed from: d */
            public long f4291d;

            /* renamed from: e */
            public int f4292e;

            /* renamed from: f */
            public int f4293f;

            /* renamed from: g */
            public int f4294g;

            /* renamed from: h */
            public int f4295h;

            /* renamed from: i */
            public int f4296i;

            /* renamed from: j */
            public String f4297j;

            public C3891b() {
                mo41002d();
            }

            /* renamed from: d */
            public C3891b mo41002d() {
                this.f4289b = Utils.DOUBLE_EPSILON;
                this.f4290c = Utils.DOUBLE_EPSILON;
                this.f4291d = 0;
                this.f4292e = 0;
                this.f4293f = 0;
                this.f4294g = 0;
                this.f4295h = 0;
                this.f4296i = 0;
                this.f4297j = "";
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39549a(1, this.f4289b);
                bVar.mo39549a(2, this.f4290c);
                long j = this.f4291d;
                if (j != 0) {
                    bVar.mo39552a(3, j);
                }
                int i = this.f4292e;
                if (i != 0) {
                    bVar.mo39564b(4, i);
                }
                int i2 = this.f4293f;
                if (i2 != 0) {
                    bVar.mo39564b(5, i2);
                }
                int i3 = this.f4294g;
                if (i3 != 0) {
                    bVar.mo39564b(6, i3);
                }
                int i4 = this.f4295h;
                if (i4 != 0) {
                    bVar.mo39551a(7, i4);
                }
                int i5 = this.f4296i;
                if (i5 != 0) {
                    bVar.mo39551a(8, i5);
                }
                if (!this.f4297j.equals("")) {
                    bVar.mo39554a(9, this.f4297j);
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c() + C3157b.m2103b(1, this.f4289b) + C3157b.m2103b(2, this.f4290c);
                long j = this.f4291d;
                if (j != 0) {
                    c += C3157b.m2115d(3, j);
                }
                int i = this.f4292e;
                if (i != 0) {
                    c += C3157b.m2118e(4, i);
                }
                int i2 = this.f4293f;
                if (i2 != 0) {
                    c += C3157b.m2118e(5, i2);
                }
                int i3 = this.f4294g;
                if (i3 != 0) {
                    c += C3157b.m2118e(6, i3);
                }
                int i4 = this.f4295h;
                if (i4 != 0) {
                    c += C3157b.m2114d(7, i4);
                }
                int i5 = this.f4296i;
                if (i5 != 0) {
                    c += C3157b.m2114d(8, i5);
                }
                return !this.f4297j.equals("") ? c + C3157b.m2106b(9, this.f4297j) : c;
            }

            /* renamed from: b */
            public C3891b mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 9) {
                        this.f4289b = aVar.mo39421c();
                    } else if (a == 17) {
                        this.f4290c = aVar.mo39421c();
                    } else if (a == 24) {
                        this.f4291d = aVar.mo39424e();
                    } else if (a == 32) {
                        this.f4292e = aVar.mo39434k();
                    } else if (a == 40) {
                        this.f4293f = aVar.mo39434k();
                    } else if (a == 48) {
                        this.f4294g = aVar.mo39434k();
                    } else if (a == 56) {
                        this.f4295h = aVar.mo39428g();
                    } else if (a == 64) {
                        int g = aVar.mo39428g();
                        if (g == 0 || g == 1 || g == 2) {
                            this.f4296i = g;
                        }
                    } else if (a == 74) {
                        this.f4297j = aVar.mo39432i();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rh$c$e */
        public static final class C3895e extends C3365e {

            /* renamed from: e */
            private static volatile C3895e[] f4318e;

            /* renamed from: b */
            public long f4319b;

            /* renamed from: c */
            public C3900b f4320c;

            /* renamed from: d */
            public C3896a[] f4321d;

            /* renamed from: com.yandex.metrica.impl.ob.rh$c$e$b */
            public static final class C3900b extends C3365e {

                /* renamed from: b */
                public C3902g f4349b;

                /* renamed from: c */
                public String f4350c;

                /* renamed from: d */
                public int f4351d;

                public C3900b() {
                    mo41020d();
                }

                /* renamed from: d */
                public C3900b mo41020d() {
                    this.f4349b = null;
                    this.f4350c = "";
                    this.f4351d = 0;
                    this.f3093a = -1;
                    return this;
                }

                /* renamed from: a */
                public void mo39942a(C3157b bVar) throws IOException {
                    C3902g gVar = this.f4349b;
                    if (gVar != null) {
                        bVar.mo39553a(1, (C3365e) gVar);
                    }
                    bVar.mo39554a(2, this.f4350c);
                    int i = this.f4351d;
                    if (i != 0) {
                        bVar.mo39551a(5, i);
                    }
                    super.mo39942a(bVar);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public int mo39944c() {
                    int c = super.mo39944c();
                    C3902g gVar = this.f4349b;
                    if (gVar != null) {
                        c += C3157b.m2105b(1, (C3365e) gVar);
                    }
                    int b = c + C3157b.m2106b(2, this.f4350c);
                    int i = this.f4351d;
                    return i != 0 ? b + C3157b.m2114d(5, i) : b;
                }

                /* renamed from: b */
                public C3900b mo39941a(C3115a aVar) throws IOException {
                    while (true) {
                        int a = aVar.mo39416a();
                        if (a == 0) {
                            return this;
                        }
                        if (a == 10) {
                            if (this.f4349b == null) {
                                this.f4349b = new C3902g();
                            }
                            aVar.mo39418a((C3365e) this.f4349b);
                        } else if (a == 18) {
                            this.f4350c = aVar.mo39432i();
                        } else if (a == 40) {
                            int g = aVar.mo39428g();
                            if (g == 0 || g == 1 || g == 2) {
                                this.f4351d = g;
                            }
                        } else if (!C3442g.m3331a(aVar, a)) {
                            return this;
                        }
                    }
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.rh$c$e$a */
            public static final class C3896a extends C3365e {

                /* renamed from: r */
                private static volatile C3896a[] f4322r;

                /* renamed from: b */
                public long f4323b;

                /* renamed from: c */
                public long f4324c;

                /* renamed from: d */
                public int f4325d;

                /* renamed from: e */
                public String f4326e;

                /* renamed from: f */
                public byte[] f4327f;

                /* renamed from: g */
                public C3891b f4328g;

                /* renamed from: h */
                public C3898b f4329h;

                /* renamed from: i */
                public String f4330i;

                /* renamed from: j */
                public C3897a f4331j;

                /* renamed from: k */
                public int f4332k;

                /* renamed from: l */
                public int f4333l;

                /* renamed from: m */
                public int f4334m;

                /* renamed from: n */
                public byte[] f4335n;

                /* renamed from: o */
                public int f4336o;

                /* renamed from: p */
                public long f4337p;

                /* renamed from: q */
                public long f4338q;

                /* renamed from: com.yandex.metrica.impl.ob.rh$c$e$a$b */
                public static final class C3898b extends C3365e {

                    /* renamed from: b */
                    public C3885a[] f4342b;

                    /* renamed from: c */
                    public C3903d[] f4343c;

                    /* renamed from: d */
                    public int f4344d;

                    /* renamed from: e */
                    public String f4345e;

                    /* renamed from: f */
                    public C3899a f4346f;

                    /* renamed from: com.yandex.metrica.impl.ob.rh$c$e$a$b$a */
                    public static final class C3899a extends C3365e {

                        /* renamed from: b */
                        public String f4347b;

                        /* renamed from: c */
                        public int f4348c;

                        public C3899a() {
                            mo41018d();
                        }

                        /* renamed from: d */
                        public C3899a mo41018d() {
                            this.f4347b = "";
                            this.f4348c = 0;
                            this.f3093a = -1;
                            return this;
                        }

                        /* renamed from: a */
                        public void mo39942a(C3157b bVar) throws IOException {
                            bVar.mo39554a(1, this.f4347b);
                            int i = this.f4348c;
                            if (i != 0) {
                                bVar.mo39551a(2, i);
                            }
                            super.mo39942a(bVar);
                        }

                        /* access modifiers changed from: protected */
                        /* renamed from: c */
                        public int mo39944c() {
                            int c = super.mo39944c() + C3157b.m2106b(1, this.f4347b);
                            int i = this.f4348c;
                            return i != 0 ? c + C3157b.m2114d(2, i) : c;
                        }

                        /* renamed from: b */
                        public C3899a mo39941a(C3115a aVar) throws IOException {
                            while (true) {
                                int a = aVar.mo39416a();
                                if (a == 0) {
                                    return this;
                                }
                                if (a == 10) {
                                    this.f4347b = aVar.mo39432i();
                                } else if (a == 16) {
                                    int g = aVar.mo39428g();
                                    if (g == 0 || g == 1 || g == 2) {
                                        this.f4348c = g;
                                    }
                                } else if (!C3442g.m3331a(aVar, a)) {
                                    return this;
                                }
                            }
                        }
                    }

                    public C3898b() {
                        mo41016d();
                    }

                    /* renamed from: d */
                    public C3898b mo41016d() {
                        this.f4342b = C3885a.m4731d();
                        this.f4343c = C3903d.m4830d();
                        this.f4344d = 2;
                        this.f4345e = "";
                        this.f4346f = null;
                        this.f3093a = -1;
                        return this;
                    }

                    /* renamed from: a */
                    public void mo39942a(C3157b bVar) throws IOException {
                        C3885a[] aVarArr = this.f4342b;
                        int i = 0;
                        if (aVarArr != null && aVarArr.length > 0) {
                            int i2 = 0;
                            while (true) {
                                C3885a[] aVarArr2 = this.f4342b;
                                if (i2 >= aVarArr2.length) {
                                    break;
                                }
                                C3885a aVar = aVarArr2[i2];
                                if (aVar != null) {
                                    bVar.mo39553a(1, (C3365e) aVar);
                                }
                                i2++;
                            }
                        }
                        C3903d[] dVarArr = this.f4343c;
                        if (dVarArr != null && dVarArr.length > 0) {
                            while (true) {
                                C3903d[] dVarArr2 = this.f4343c;
                                if (i >= dVarArr2.length) {
                                    break;
                                }
                                C3903d dVar = dVarArr2[i];
                                if (dVar != null) {
                                    bVar.mo39553a(2, (C3365e) dVar);
                                }
                                i++;
                            }
                        }
                        int i3 = this.f4344d;
                        if (i3 != 2) {
                            bVar.mo39551a(3, i3);
                        }
                        if (!this.f4345e.equals("")) {
                            bVar.mo39554a(4, this.f4345e);
                        }
                        C3899a aVar2 = this.f4346f;
                        if (aVar2 != null) {
                            bVar.mo39553a(5, (C3365e) aVar2);
                        }
                        super.mo39942a(bVar);
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: c */
                    public int mo39944c() {
                        int c = super.mo39944c();
                        C3885a[] aVarArr = this.f4342b;
                        int i = 0;
                        if (aVarArr != null && aVarArr.length > 0) {
                            int i2 = c;
                            int i3 = 0;
                            while (true) {
                                C3885a[] aVarArr2 = this.f4342b;
                                if (i3 >= aVarArr2.length) {
                                    break;
                                }
                                C3885a aVar = aVarArr2[i3];
                                if (aVar != null) {
                                    i2 += C3157b.m2105b(1, (C3365e) aVar);
                                }
                                i3++;
                            }
                            c = i2;
                        }
                        C3903d[] dVarArr = this.f4343c;
                        if (dVarArr != null && dVarArr.length > 0) {
                            while (true) {
                                C3903d[] dVarArr2 = this.f4343c;
                                if (i >= dVarArr2.length) {
                                    break;
                                }
                                C3903d dVar = dVarArr2[i];
                                if (dVar != null) {
                                    c += C3157b.m2105b(2, (C3365e) dVar);
                                }
                                i++;
                            }
                        }
                        int i4 = this.f4344d;
                        if (i4 != 2) {
                            c += C3157b.m2114d(3, i4);
                        }
                        if (!this.f4345e.equals("")) {
                            c += C3157b.m2106b(4, this.f4345e);
                        }
                        C3899a aVar2 = this.f4346f;
                        return aVar2 != null ? c + C3157b.m2105b(5, (C3365e) aVar2) : c;
                    }

                    /* renamed from: b */
                    public C3898b mo39941a(C3115a aVar) throws IOException {
                        while (true) {
                            int a = aVar.mo39416a();
                            if (a == 0) {
                                return this;
                            }
                            if (a == 10) {
                                int b = C3442g.m3333b(aVar, 10);
                                C3885a[] aVarArr = this.f4342b;
                                int length = aVarArr == null ? 0 : aVarArr.length;
                                C3885a[] aVarArr2 = new C3885a[(b + length)];
                                if (length != 0) {
                                    System.arraycopy(this.f4342b, 0, aVarArr2, 0, length);
                                }
                                while (length < aVarArr2.length - 1) {
                                    aVarArr2[length] = new C3885a();
                                    aVar.mo39418a((C3365e) aVarArr2[length]);
                                    aVar.mo39416a();
                                    length++;
                                }
                                aVarArr2[length] = new C3885a();
                                aVar.mo39418a((C3365e) aVarArr2[length]);
                                this.f4342b = aVarArr2;
                            } else if (a != 18) {
                                if (a == 24) {
                                    int g = aVar.mo39428g();
                                    switch (g) {
                                        case 0:
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                            this.f4344d = g;
                                            break;
                                    }
                                } else if (a == 34) {
                                    this.f4345e = aVar.mo39432i();
                                } else if (a == 42) {
                                    if (this.f4346f == null) {
                                        this.f4346f = new C3899a();
                                    }
                                    aVar.mo39418a((C3365e) this.f4346f);
                                } else if (!C3442g.m3331a(aVar, a)) {
                                    return this;
                                }
                            } else {
                                int b2 = C3442g.m3333b(aVar, 18);
                                C3903d[] dVarArr = this.f4343c;
                                int length2 = dVarArr == null ? 0 : dVarArr.length;
                                C3903d[] dVarArr2 = new C3903d[(b2 + length2)];
                                if (length2 != 0) {
                                    System.arraycopy(this.f4343c, 0, dVarArr2, 0, length2);
                                }
                                while (length2 < dVarArr2.length - 1) {
                                    dVarArr2[length2] = new C3903d();
                                    aVar.mo39418a((C3365e) dVarArr2[length2]);
                                    aVar.mo39416a();
                                    length2++;
                                }
                                dVarArr2[length2] = new C3903d();
                                aVar.mo39418a((C3365e) dVarArr2[length2]);
                                this.f4343c = dVarArr2;
                            }
                        }
                    }
                }

                /* renamed from: com.yandex.metrica.impl.ob.rh$c$e$a$a */
                public static final class C3897a extends C3365e {

                    /* renamed from: b */
                    public String f4339b;

                    /* renamed from: c */
                    public String f4340c;

                    /* renamed from: d */
                    public String f4341d;

                    public C3897a() {
                        mo41014d();
                    }

                    /* renamed from: d */
                    public C3897a mo41014d() {
                        this.f4339b = "";
                        this.f4340c = "";
                        this.f4341d = "";
                        this.f3093a = -1;
                        return this;
                    }

                    /* renamed from: a */
                    public void mo39942a(C3157b bVar) throws IOException {
                        bVar.mo39554a(1, this.f4339b);
                        if (!this.f4340c.equals("")) {
                            bVar.mo39554a(2, this.f4340c);
                        }
                        if (!this.f4341d.equals("")) {
                            bVar.mo39554a(3, this.f4341d);
                        }
                        super.mo39942a(bVar);
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: c */
                    public int mo39944c() {
                        int c = super.mo39944c() + C3157b.m2106b(1, this.f4339b);
                        if (!this.f4340c.equals("")) {
                            c += C3157b.m2106b(2, this.f4340c);
                        }
                        return !this.f4341d.equals("") ? c + C3157b.m2106b(3, this.f4341d) : c;
                    }

                    /* renamed from: b */
                    public C3897a mo39941a(C3115a aVar) throws IOException {
                        while (true) {
                            int a = aVar.mo39416a();
                            if (a == 0) {
                                return this;
                            }
                            if (a == 10) {
                                this.f4339b = aVar.mo39432i();
                            } else if (a == 18) {
                                this.f4340c = aVar.mo39432i();
                            } else if (a == 26) {
                                this.f4341d = aVar.mo39432i();
                            } else if (!C3442g.m3331a(aVar, a)) {
                                return this;
                            }
                        }
                    }
                }

                /* renamed from: d */
                public static C3896a[] m4793d() {
                    if (f4322r == null) {
                        synchronized (C3246c.f2825a) {
                            if (f4322r == null) {
                                f4322r = new C3896a[0];
                            }
                        }
                    }
                    return f4322r;
                }

                public C3896a() {
                    mo41012e();
                }

                /* renamed from: e */
                public C3896a mo41012e() {
                    this.f4323b = 0;
                    this.f4324c = 0;
                    this.f4325d = 0;
                    this.f4326e = "";
                    this.f4327f = C3442g.f3280h;
                    this.f4328g = null;
                    this.f4329h = null;
                    this.f4330i = "";
                    this.f4331j = null;
                    this.f4332k = 0;
                    this.f4333l = 0;
                    this.f4334m = -1;
                    this.f4335n = C3442g.f3280h;
                    this.f4336o = -1;
                    this.f4337p = 0;
                    this.f4338q = 0;
                    this.f3093a = -1;
                    return this;
                }

                /* renamed from: a */
                public void mo39942a(C3157b bVar) throws IOException {
                    bVar.mo39552a(1, this.f4323b);
                    bVar.mo39552a(2, this.f4324c);
                    bVar.mo39564b(3, this.f4325d);
                    if (!this.f4326e.equals("")) {
                        bVar.mo39554a(4, this.f4326e);
                    }
                    if (!Arrays.equals(this.f4327f, C3442g.f3280h)) {
                        bVar.mo39556a(5, this.f4327f);
                    }
                    C3891b bVar2 = this.f4328g;
                    if (bVar2 != null) {
                        bVar.mo39553a(6, (C3365e) bVar2);
                    }
                    C3898b bVar3 = this.f4329h;
                    if (bVar3 != null) {
                        bVar.mo39553a(7, (C3365e) bVar3);
                    }
                    if (!this.f4330i.equals("")) {
                        bVar.mo39554a(8, this.f4330i);
                    }
                    C3897a aVar = this.f4331j;
                    if (aVar != null) {
                        bVar.mo39553a(9, (C3365e) aVar);
                    }
                    int i = this.f4332k;
                    if (i != 0) {
                        bVar.mo39564b(10, i);
                    }
                    int i2 = this.f4333l;
                    if (i2 != 0) {
                        bVar.mo39551a(12, i2);
                    }
                    int i3 = this.f4334m;
                    if (i3 != -1) {
                        bVar.mo39551a(13, i3);
                    }
                    if (!Arrays.equals(this.f4335n, C3442g.f3280h)) {
                        bVar.mo39556a(14, this.f4335n);
                    }
                    int i4 = this.f4336o;
                    if (i4 != -1) {
                        bVar.mo39551a(15, i4);
                    }
                    long j = this.f4337p;
                    if (j != 0) {
                        bVar.mo39552a(16, j);
                    }
                    long j2 = this.f4338q;
                    if (j2 != 0) {
                        bVar.mo39552a(17, j2);
                    }
                    super.mo39942a(bVar);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public int mo39944c() {
                    int c = super.mo39944c() + C3157b.m2115d(1, this.f4323b) + C3157b.m2115d(2, this.f4324c) + C3157b.m2118e(3, this.f4325d);
                    if (!this.f4326e.equals("")) {
                        c += C3157b.m2106b(4, this.f4326e);
                    }
                    if (!Arrays.equals(this.f4327f, C3442g.f3280h)) {
                        c += C3157b.m2108b(5, this.f4327f);
                    }
                    C3891b bVar = this.f4328g;
                    if (bVar != null) {
                        c += C3157b.m2105b(6, (C3365e) bVar);
                    }
                    C3898b bVar2 = this.f4329h;
                    if (bVar2 != null) {
                        c += C3157b.m2105b(7, (C3365e) bVar2);
                    }
                    if (!this.f4330i.equals("")) {
                        c += C3157b.m2106b(8, this.f4330i);
                    }
                    C3897a aVar = this.f4331j;
                    if (aVar != null) {
                        c += C3157b.m2105b(9, (C3365e) aVar);
                    }
                    int i = this.f4332k;
                    if (i != 0) {
                        c += C3157b.m2118e(10, i);
                    }
                    int i2 = this.f4333l;
                    if (i2 != 0) {
                        c += C3157b.m2114d(12, i2);
                    }
                    int i3 = this.f4334m;
                    if (i3 != -1) {
                        c += C3157b.m2114d(13, i3);
                    }
                    if (!Arrays.equals(this.f4335n, C3442g.f3280h)) {
                        c += C3157b.m2108b(14, this.f4335n);
                    }
                    int i4 = this.f4336o;
                    if (i4 != -1) {
                        c += C3157b.m2114d(15, i4);
                    }
                    long j = this.f4337p;
                    if (j != 0) {
                        c += C3157b.m2115d(16, j);
                    }
                    long j2 = this.f4338q;
                    return j2 != 0 ? c + C3157b.m2115d(17, j2) : c;
                }

                /* renamed from: b */
                public C3896a mo39941a(C3115a aVar) throws IOException {
                    while (true) {
                        int a = aVar.mo39416a();
                        switch (a) {
                            case 0:
                                return this;
                            case 8:
                                this.f4323b = aVar.mo39424e();
                                break;
                            case 16:
                                this.f4324c = aVar.mo39424e();
                                break;
                            case 24:
                                this.f4325d = aVar.mo39434k();
                                break;
                            case 34:
                                this.f4326e = aVar.mo39432i();
                                break;
                            case 42:
                                this.f4327f = aVar.mo39433j();
                                break;
                            case 50:
                                if (this.f4328g == null) {
                                    this.f4328g = new C3891b();
                                }
                                aVar.mo39418a((C3365e) this.f4328g);
                                break;
                            case 58:
                                if (this.f4329h == null) {
                                    this.f4329h = new C3898b();
                                }
                                aVar.mo39418a((C3365e) this.f4329h);
                                break;
                            case 66:
                                this.f4330i = aVar.mo39432i();
                                break;
                            case 74:
                                if (this.f4331j == null) {
                                    this.f4331j = new C3897a();
                                }
                                aVar.mo39418a((C3365e) this.f4331j);
                                break;
                            case 80:
                                this.f4332k = aVar.mo39434k();
                                break;
                            case 96:
                                int g = aVar.mo39428g();
                                if (g != 0 && g != 1) {
                                    break;
                                } else {
                                    this.f4333l = g;
                                    break;
                                }
                            case 104:
                                int g2 = aVar.mo39428g();
                                if (g2 != -1 && g2 != 0 && g2 != 1) {
                                    break;
                                } else {
                                    this.f4334m = g2;
                                    break;
                                }
                            case 114:
                                this.f4335n = aVar.mo39433j();
                                break;
                            case 120:
                                int g3 = aVar.mo39428g();
                                if (g3 != -1 && g3 != 0 && g3 != 1) {
                                    break;
                                } else {
                                    this.f4336o = g3;
                                    break;
                                }
                            case 128:
                                this.f4337p = aVar.mo39424e();
                                break;
                            case 136:
                                this.f4338q = aVar.mo39424e();
                                break;
                            default:
                                if (C3442g.m3331a(aVar, a)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            /* renamed from: d */
            public static C3895e[] m4787d() {
                if (f4318e == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4318e == null) {
                            f4318e = new C3895e[0];
                        }
                    }
                }
                return f4318e;
            }

            public C3895e() {
                mo41010e();
            }

            /* renamed from: e */
            public C3895e mo41010e() {
                this.f4319b = 0;
                this.f4320c = null;
                this.f4321d = C3896a.m4793d();
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39552a(1, this.f4319b);
                C3900b bVar2 = this.f4320c;
                if (bVar2 != null) {
                    bVar.mo39553a(2, (C3365e) bVar2);
                }
                C3896a[] aVarArr = this.f4321d;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        C3896a[] aVarArr2 = this.f4321d;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        C3896a aVar = aVarArr2[i];
                        if (aVar != null) {
                            bVar.mo39553a(3, (C3365e) aVar);
                        }
                        i++;
                    }
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c() + C3157b.m2115d(1, this.f4319b);
                C3900b bVar = this.f4320c;
                if (bVar != null) {
                    c += C3157b.m2105b(2, (C3365e) bVar);
                }
                C3896a[] aVarArr = this.f4321d;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        C3896a[] aVarArr2 = this.f4321d;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        C3896a aVar = aVarArr2[i];
                        if (aVar != null) {
                            c += C3157b.m2105b(3, (C3365e) aVar);
                        }
                        i++;
                    }
                }
                return c;
            }

            /* renamed from: b */
            public C3895e mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4319b = aVar.mo39424e();
                    } else if (a == 18) {
                        if (this.f4320c == null) {
                            this.f4320c = new C3900b();
                        }
                        aVar.mo39418a((C3365e) this.f4320c);
                    } else if (a == 26) {
                        int b = C3442g.m3333b(aVar, 26);
                        C3896a[] aVarArr = this.f4321d;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        C3896a[] aVarArr2 = new C3896a[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f4321d, 0, aVarArr2, 0, length);
                        }
                        while (length < aVarArr2.length - 1) {
                            aVarArr2[length] = new C3896a();
                            aVar.mo39418a((C3365e) aVarArr2[length]);
                            aVar.mo39416a();
                            length++;
                        }
                        aVarArr2[length] = new C3896a();
                        aVar.mo39418a((C3365e) aVarArr2[length]);
                        this.f4321d = aVarArr2;
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rh$c$d */
        public static final class C3893d extends C3365e {

            /* renamed from: b */
            public String f4301b;

            /* renamed from: c */
            public String f4302c;

            /* renamed from: d */
            public String f4303d;

            /* renamed from: e */
            public int f4304e;

            /* renamed from: f */
            public String f4305f;

            /* renamed from: g */
            public String f4306g;

            /* renamed from: h */
            public boolean f4307h;

            /* renamed from: i */
            public int f4308i;

            /* renamed from: j */
            public String f4309j;

            /* renamed from: k */
            public String f4310k;

            /* renamed from: l */
            public String f4311l;

            /* renamed from: m */
            public int f4312m;

            /* renamed from: n */
            public C3894a[] f4313n;

            /* renamed from: o */
            public String f4314o;

            /* renamed from: com.yandex.metrica.impl.ob.rh$c$d$a */
            public static final class C3894a extends C3365e {

                /* renamed from: d */
                private static volatile C3894a[] f4315d;

                /* renamed from: b */
                public String f4316b;

                /* renamed from: c */
                public long f4317c;

                /* renamed from: d */
                public static C3894a[] m4781d() {
                    if (f4315d == null) {
                        synchronized (C3246c.f2825a) {
                            if (f4315d == null) {
                                f4315d = new C3894a[0];
                            }
                        }
                    }
                    return f4315d;
                }

                public C3894a() {
                    mo41008e();
                }

                /* renamed from: e */
                public C3894a mo41008e() {
                    this.f4316b = "";
                    this.f4317c = 0;
                    this.f3093a = -1;
                    return this;
                }

                /* renamed from: a */
                public void mo39942a(C3157b bVar) throws IOException {
                    bVar.mo39554a(1, this.f4316b);
                    bVar.mo39552a(2, this.f4317c);
                    super.mo39942a(bVar);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public int mo39944c() {
                    return super.mo39944c() + C3157b.m2106b(1, this.f4316b) + C3157b.m2115d(2, this.f4317c);
                }

                /* renamed from: b */
                public C3894a mo39941a(C3115a aVar) throws IOException {
                    while (true) {
                        int a = aVar.mo39416a();
                        if (a == 0) {
                            return this;
                        }
                        if (a == 10) {
                            this.f4316b = aVar.mo39432i();
                        } else if (a == 16) {
                            this.f4317c = aVar.mo39424e();
                        } else if (!C3442g.m3331a(aVar, a)) {
                            return this;
                        }
                    }
                }
            }

            public C3893d() {
                mo41006d();
            }

            /* renamed from: d */
            public C3893d mo41006d() {
                this.f4301b = "";
                this.f4302c = "";
                this.f4303d = "";
                this.f4304e = 0;
                this.f4305f = "";
                this.f4306g = "";
                this.f4307h = false;
                this.f4308i = 0;
                this.f4309j = "";
                this.f4310k = "";
                this.f4311l = "";
                this.f4312m = 0;
                this.f4313n = C3894a.m4781d();
                this.f4314o = "";
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                if (!this.f4301b.equals("")) {
                    bVar.mo39554a(1, this.f4301b);
                }
                if (!this.f4302c.equals("")) {
                    bVar.mo39554a(2, this.f4302c);
                }
                if (!this.f4303d.equals("")) {
                    bVar.mo39554a(4, this.f4303d);
                }
                int i = this.f4304e;
                if (i != 0) {
                    bVar.mo39564b(5, i);
                }
                if (!this.f4305f.equals("")) {
                    bVar.mo39554a(10, this.f4305f);
                }
                if (!this.f4306g.equals("")) {
                    bVar.mo39554a(15, this.f4306g);
                }
                boolean z = this.f4307h;
                if (z) {
                    bVar.mo39555a(17, z);
                }
                int i2 = this.f4308i;
                if (i2 != 0) {
                    bVar.mo39564b(18, i2);
                }
                if (!this.f4309j.equals("")) {
                    bVar.mo39554a(19, this.f4309j);
                }
                if (!this.f4310k.equals("")) {
                    bVar.mo39554a(20, this.f4310k);
                }
                if (!this.f4311l.equals("")) {
                    bVar.mo39554a(21, this.f4311l);
                }
                int i3 = this.f4312m;
                if (i3 != 0) {
                    bVar.mo39564b(22, i3);
                }
                C3894a[] aVarArr = this.f4313n;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i4 = 0;
                    while (true) {
                        C3894a[] aVarArr2 = this.f4313n;
                        if (i4 >= aVarArr2.length) {
                            break;
                        }
                        C3894a aVar = aVarArr2[i4];
                        if (aVar != null) {
                            bVar.mo39553a(23, (C3365e) aVar);
                        }
                        i4++;
                    }
                }
                if (!this.f4314o.equals("")) {
                    bVar.mo39554a(24, this.f4314o);
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c();
                if (!this.f4301b.equals("")) {
                    c += C3157b.m2106b(1, this.f4301b);
                }
                if (!this.f4302c.equals("")) {
                    c += C3157b.m2106b(2, this.f4302c);
                }
                if (!this.f4303d.equals("")) {
                    c += C3157b.m2106b(4, this.f4303d);
                }
                int i = this.f4304e;
                if (i != 0) {
                    c += C3157b.m2118e(5, i);
                }
                if (!this.f4305f.equals("")) {
                    c += C3157b.m2106b(10, this.f4305f);
                }
                if (!this.f4306g.equals("")) {
                    c += C3157b.m2106b(15, this.f4306g);
                }
                boolean z = this.f4307h;
                if (z) {
                    c += C3157b.m2107b(17, z);
                }
                int i2 = this.f4308i;
                if (i2 != 0) {
                    c += C3157b.m2118e(18, i2);
                }
                if (!this.f4309j.equals("")) {
                    c += C3157b.m2106b(19, this.f4309j);
                }
                if (!this.f4310k.equals("")) {
                    c += C3157b.m2106b(20, this.f4310k);
                }
                if (!this.f4311l.equals("")) {
                    c += C3157b.m2106b(21, this.f4311l);
                }
                int i3 = this.f4312m;
                if (i3 != 0) {
                    c += C3157b.m2118e(22, i3);
                }
                C3894a[] aVarArr = this.f4313n;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i4 = 0;
                    while (true) {
                        C3894a[] aVarArr2 = this.f4313n;
                        if (i4 >= aVarArr2.length) {
                            break;
                        }
                        C3894a aVar = aVarArr2[i4];
                        if (aVar != null) {
                            c += C3157b.m2105b(23, (C3365e) aVar);
                        }
                        i4++;
                    }
                }
                return !this.f4314o.equals("") ? c + C3157b.m2106b(24, this.f4314o) : c;
            }

            /* renamed from: b */
            public C3893d mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    switch (a) {
                        case 0:
                            return this;
                        case 10:
                            this.f4301b = aVar.mo39432i();
                            break;
                        case 18:
                            this.f4302c = aVar.mo39432i();
                            break;
                        case 34:
                            this.f4303d = aVar.mo39432i();
                            break;
                        case 40:
                            this.f4304e = aVar.mo39434k();
                            break;
                        case 82:
                            this.f4305f = aVar.mo39432i();
                            break;
                        case 122:
                            this.f4306g = aVar.mo39432i();
                            break;
                        case 136:
                            this.f4307h = aVar.mo39431h();
                            break;
                        case 144:
                            this.f4308i = aVar.mo39434k();
                            break;
                        case 154:
                            this.f4309j = aVar.mo39432i();
                            break;
                        case 162:
                            this.f4310k = aVar.mo39432i();
                            break;
                        case 170:
                            this.f4311l = aVar.mo39432i();
                            break;
                        case 176:
                            this.f4312m = aVar.mo39434k();
                            break;
                        case 186:
                            int b = C3442g.m3333b(aVar, 186);
                            C3894a[] aVarArr = this.f4313n;
                            int length = aVarArr == null ? 0 : aVarArr.length;
                            C3894a[] aVarArr2 = new C3894a[(b + length)];
                            if (length != 0) {
                                System.arraycopy(this.f4313n, 0, aVarArr2, 0, length);
                            }
                            while (length < aVarArr2.length - 1) {
                                aVarArr2[length] = new C3894a();
                                aVar.mo39418a((C3365e) aVarArr2[length]);
                                aVar.mo39416a();
                                length++;
                            }
                            aVarArr2[length] = new C3894a();
                            aVar.mo39418a((C3365e) aVarArr2[length]);
                            this.f4313n = aVarArr2;
                            break;
                        case 194:
                            this.f4314o = aVar.mo39432i();
                            break;
                        default:
                            if (C3442g.m3331a(aVar, a)) {
                                break;
                            } else {
                                return this;
                            }
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rh$c$a */
        public static final class C3890a extends C3365e {

            /* renamed from: d */
            private static volatile C3890a[] f4286d;

            /* renamed from: b */
            public String f4287b;

            /* renamed from: c */
            public String f4288c;

            /* renamed from: d */
            public static C3890a[] m4759d() {
                if (f4286d == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4286d == null) {
                            f4286d = new C3890a[0];
                        }
                    }
                }
                return f4286d;
            }

            public C3890a() {
                mo41000e();
            }

            /* renamed from: e */
            public C3890a mo41000e() {
                this.f4287b = "";
                this.f4288c = "";
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39554a(1, this.f4287b);
                bVar.mo39554a(2, this.f4288c);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2106b(1, this.f4287b) + C3157b.m2106b(2, this.f4288c);
            }

            /* renamed from: b */
            public C3890a mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        this.f4287b = aVar.mo39432i();
                    } else if (a == 18) {
                        this.f4288c = aVar.mo39432i();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rh$c$c */
        public static final class C3892c extends C3365e {

            /* renamed from: d */
            private static volatile C3892c[] f4298d;

            /* renamed from: b */
            public String f4299b;

            /* renamed from: c */
            public String f4300c;

            /* renamed from: d */
            public static C3892c[] m4770d() {
                if (f4298d == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4298d == null) {
                            f4298d = new C3892c[0];
                        }
                    }
                }
                return f4298d;
            }

            public C3892c() {
                mo41004e();
            }

            /* renamed from: e */
            public C3892c mo41004e() {
                this.f4299b = "";
                this.f4300c = "";
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39554a(1, this.f4299b);
                bVar.mo39554a(2, this.f4300c);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2106b(1, this.f4299b) + C3157b.m2106b(2, this.f4300c);
            }

            /* renamed from: b */
            public C3892c mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        this.f4299b = aVar.mo39432i();
                    } else if (a == 18) {
                        this.f4300c = aVar.mo39432i();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rh$c$f */
        public static final class C3901f extends C3365e {

            /* renamed from: g */
            private static volatile C3901f[] f4352g;

            /* renamed from: b */
            public int f4353b;

            /* renamed from: c */
            public int f4354c;

            /* renamed from: d */
            public String f4355d;

            /* renamed from: e */
            public boolean f4356e;

            /* renamed from: f */
            public String f4357f;

            /* renamed from: d */
            public static C3901f[] m4819d() {
                if (f4352g == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4352g == null) {
                            f4352g = new C3901f[0];
                        }
                    }
                }
                return f4352g;
            }

            public C3901f() {
                mo41022e();
            }

            /* renamed from: e */
            public C3901f mo41022e() {
                this.f4353b = 0;
                this.f4354c = 0;
                this.f4355d = "";
                this.f4356e = false;
                this.f4357f = "";
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                int i = this.f4353b;
                if (i != 0) {
                    bVar.mo39564b(1, i);
                }
                int i2 = this.f4354c;
                if (i2 != 0) {
                    bVar.mo39564b(2, i2);
                }
                if (!this.f4355d.equals("")) {
                    bVar.mo39554a(3, this.f4355d);
                }
                boolean z = this.f4356e;
                if (z) {
                    bVar.mo39555a(4, z);
                }
                if (!this.f4357f.equals("")) {
                    bVar.mo39554a(5, this.f4357f);
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c();
                int i = this.f4353b;
                if (i != 0) {
                    c += C3157b.m2118e(1, i);
                }
                int i2 = this.f4354c;
                if (i2 != 0) {
                    c += C3157b.m2118e(2, i2);
                }
                if (!this.f4355d.equals("")) {
                    c += C3157b.m2106b(3, this.f4355d);
                }
                boolean z = this.f4356e;
                if (z) {
                    c += C3157b.m2107b(4, z);
                }
                return !this.f4357f.equals("") ? c + C3157b.m2106b(5, this.f4357f) : c;
            }

            /* renamed from: b */
            public C3901f mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4353b = aVar.mo39434k();
                    } else if (a == 16) {
                        this.f4354c = aVar.mo39434k();
                    } else if (a == 26) {
                        this.f4355d = aVar.mo39432i();
                    } else if (a == 32) {
                        this.f4356e = aVar.mo39431h();
                    } else if (a == 42) {
                        this.f4357f = aVar.mo39432i();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        public C3889c() {
            mo40998d();
        }

        /* renamed from: d */
        public C3889c mo40998d() {
            this.f4279b = C3895e.m4787d();
            this.f4280c = null;
            this.f4281d = C3890a.m4759d();
            this.f4282e = C3892c.m4770d();
            this.f4283f = C3442g.f3278f;
            this.f4284g = C3901f.m4819d();
            this.f4285h = C3442g.f3278f;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            C3895e[] eVarArr = this.f4279b;
            int i = 0;
            if (eVarArr != null && eVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C3895e[] eVarArr2 = this.f4279b;
                    if (i2 >= eVarArr2.length) {
                        break;
                    }
                    C3895e eVar = eVarArr2[i2];
                    if (eVar != null) {
                        bVar.mo39553a(3, (C3365e) eVar);
                    }
                    i2++;
                }
            }
            C3893d dVar = this.f4280c;
            if (dVar != null) {
                bVar.mo39553a(4, (C3365e) dVar);
            }
            C3890a[] aVarArr = this.f4281d;
            if (aVarArr != null && aVarArr.length > 0) {
                int i3 = 0;
                while (true) {
                    C3890a[] aVarArr2 = this.f4281d;
                    if (i3 >= aVarArr2.length) {
                        break;
                    }
                    C3890a aVar = aVarArr2[i3];
                    if (aVar != null) {
                        bVar.mo39553a(7, (C3365e) aVar);
                    }
                    i3++;
                }
            }
            C3892c[] cVarArr = this.f4282e;
            if (cVarArr != null && cVarArr.length > 0) {
                int i4 = 0;
                while (true) {
                    C3892c[] cVarArr2 = this.f4282e;
                    if (i4 >= cVarArr2.length) {
                        break;
                    }
                    C3892c cVar = cVarArr2[i4];
                    if (cVar != null) {
                        bVar.mo39553a(8, (C3365e) cVar);
                    }
                    i4++;
                }
            }
            String[] strArr = this.f4283f;
            if (strArr != null && strArr.length > 0) {
                int i5 = 0;
                while (true) {
                    String[] strArr2 = this.f4283f;
                    if (i5 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i5];
                    if (str != null) {
                        bVar.mo39554a(9, str);
                    }
                    i5++;
                }
            }
            C3901f[] fVarArr = this.f4284g;
            if (fVarArr != null && fVarArr.length > 0) {
                int i6 = 0;
                while (true) {
                    C3901f[] fVarArr2 = this.f4284g;
                    if (i6 >= fVarArr2.length) {
                        break;
                    }
                    C3901f fVar = fVarArr2[i6];
                    if (fVar != null) {
                        bVar.mo39553a(10, (C3365e) fVar);
                    }
                    i6++;
                }
            }
            String[] strArr3 = this.f4285h;
            if (strArr3 != null && strArr3.length > 0) {
                while (true) {
                    String[] strArr4 = this.f4285h;
                    if (i >= strArr4.length) {
                        break;
                    }
                    String str2 = strArr4[i];
                    if (str2 != null) {
                        bVar.mo39554a(11, str2);
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
            C3895e[] eVarArr = this.f4279b;
            int i = 0;
            if (eVarArr != null && eVarArr.length > 0) {
                int i2 = c;
                int i3 = 0;
                while (true) {
                    C3895e[] eVarArr2 = this.f4279b;
                    if (i3 >= eVarArr2.length) {
                        break;
                    }
                    C3895e eVar = eVarArr2[i3];
                    if (eVar != null) {
                        i2 += C3157b.m2105b(3, (C3365e) eVar);
                    }
                    i3++;
                }
                c = i2;
            }
            C3893d dVar = this.f4280c;
            if (dVar != null) {
                c += C3157b.m2105b(4, (C3365e) dVar);
            }
            C3890a[] aVarArr = this.f4281d;
            if (aVarArr != null && aVarArr.length > 0) {
                int i4 = c;
                int i5 = 0;
                while (true) {
                    C3890a[] aVarArr2 = this.f4281d;
                    if (i5 >= aVarArr2.length) {
                        break;
                    }
                    C3890a aVar = aVarArr2[i5];
                    if (aVar != null) {
                        i4 += C3157b.m2105b(7, (C3365e) aVar);
                    }
                    i5++;
                }
                c = i4;
            }
            C3892c[] cVarArr = this.f4282e;
            if (cVarArr != null && cVarArr.length > 0) {
                int i6 = c;
                int i7 = 0;
                while (true) {
                    C3892c[] cVarArr2 = this.f4282e;
                    if (i7 >= cVarArr2.length) {
                        break;
                    }
                    C3892c cVar = cVarArr2[i7];
                    if (cVar != null) {
                        i6 += C3157b.m2105b(8, (C3365e) cVar);
                    }
                    i7++;
                }
                c = i6;
            }
            String[] strArr = this.f4283f;
            if (strArr != null && strArr.length > 0) {
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    String[] strArr2 = this.f4283f;
                    if (i8 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i8];
                    if (str != null) {
                        i10++;
                        i9 += C3157b.m2110b(str);
                    }
                    i8++;
                }
                c = c + i9 + (i10 * 1);
            }
            C3901f[] fVarArr = this.f4284g;
            if (fVarArr != null && fVarArr.length > 0) {
                int i11 = c;
                int i12 = 0;
                while (true) {
                    C3901f[] fVarArr2 = this.f4284g;
                    if (i12 >= fVarArr2.length) {
                        break;
                    }
                    C3901f fVar = fVarArr2[i12];
                    if (fVar != null) {
                        i11 += C3157b.m2105b(10, (C3365e) fVar);
                    }
                    i12++;
                }
                c = i11;
            }
            String[] strArr3 = this.f4285h;
            if (strArr3 == null || strArr3.length <= 0) {
                return c;
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                String[] strArr4 = this.f4285h;
                if (i >= strArr4.length) {
                    return c + i13 + (i14 * 1);
                }
                String str2 = strArr4[i];
                if (str2 != null) {
                    i14++;
                    i13 += C3157b.m2110b(str2);
                }
                i++;
            }
        }

        /* renamed from: b */
        public C3889c mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 26) {
                    int b = C3442g.m3333b(aVar, 26);
                    C3895e[] eVarArr = this.f4279b;
                    int length = eVarArr == null ? 0 : eVarArr.length;
                    C3895e[] eVarArr2 = new C3895e[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4279b, 0, eVarArr2, 0, length);
                    }
                    while (length < eVarArr2.length - 1) {
                        eVarArr2[length] = new C3895e();
                        aVar.mo39418a((C3365e) eVarArr2[length]);
                        aVar.mo39416a();
                        length++;
                    }
                    eVarArr2[length] = new C3895e();
                    aVar.mo39418a((C3365e) eVarArr2[length]);
                    this.f4279b = eVarArr2;
                } else if (a == 34) {
                    if (this.f4280c == null) {
                        this.f4280c = new C3893d();
                    }
                    aVar.mo39418a((C3365e) this.f4280c);
                } else if (a == 58) {
                    int b2 = C3442g.m3333b(aVar, 58);
                    C3890a[] aVarArr = this.f4281d;
                    int length2 = aVarArr == null ? 0 : aVarArr.length;
                    C3890a[] aVarArr2 = new C3890a[(b2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f4281d, 0, aVarArr2, 0, length2);
                    }
                    while (length2 < aVarArr2.length - 1) {
                        aVarArr2[length2] = new C3890a();
                        aVar.mo39418a((C3365e) aVarArr2[length2]);
                        aVar.mo39416a();
                        length2++;
                    }
                    aVarArr2[length2] = new C3890a();
                    aVar.mo39418a((C3365e) aVarArr2[length2]);
                    this.f4281d = aVarArr2;
                } else if (a == 66) {
                    int b3 = C3442g.m3333b(aVar, 66);
                    C3892c[] cVarArr = this.f4282e;
                    int length3 = cVarArr == null ? 0 : cVarArr.length;
                    C3892c[] cVarArr2 = new C3892c[(b3 + length3)];
                    if (length3 != 0) {
                        System.arraycopy(this.f4282e, 0, cVarArr2, 0, length3);
                    }
                    while (length3 < cVarArr2.length - 1) {
                        cVarArr2[length3] = new C3892c();
                        aVar.mo39418a((C3365e) cVarArr2[length3]);
                        aVar.mo39416a();
                        length3++;
                    }
                    cVarArr2[length3] = new C3892c();
                    aVar.mo39418a((C3365e) cVarArr2[length3]);
                    this.f4282e = cVarArr2;
                } else if (a == 74) {
                    int b4 = C3442g.m3333b(aVar, 74);
                    String[] strArr = this.f4283f;
                    int length4 = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(b4 + length4)];
                    if (length4 != 0) {
                        System.arraycopy(this.f4283f, 0, strArr2, 0, length4);
                    }
                    while (length4 < strArr2.length - 1) {
                        strArr2[length4] = aVar.mo39432i();
                        aVar.mo39416a();
                        length4++;
                    }
                    strArr2[length4] = aVar.mo39432i();
                    this.f4283f = strArr2;
                } else if (a == 82) {
                    int b5 = C3442g.m3333b(aVar, 82);
                    C3901f[] fVarArr = this.f4284g;
                    int length5 = fVarArr == null ? 0 : fVarArr.length;
                    C3901f[] fVarArr2 = new C3901f[(b5 + length5)];
                    if (length5 != 0) {
                        System.arraycopy(this.f4284g, 0, fVarArr2, 0, length5);
                    }
                    while (length5 < fVarArr2.length - 1) {
                        fVarArr2[length5] = new C3901f();
                        aVar.mo39418a((C3365e) fVarArr2[length5]);
                        aVar.mo39416a();
                        length5++;
                    }
                    fVarArr2[length5] = new C3901f();
                    aVar.mo39418a((C3365e) fVarArr2[length5]);
                    this.f4284g = fVarArr2;
                } else if (a == 90) {
                    int b6 = C3442g.m3333b(aVar, 90);
                    String[] strArr3 = this.f4285h;
                    int length6 = strArr3 == null ? 0 : strArr3.length;
                    String[] strArr4 = new String[(b6 + length6)];
                    if (length6 != 0) {
                        System.arraycopy(this.f4285h, 0, strArr4, 0, length6);
                    }
                    while (length6 < strArr4.length - 1) {
                        strArr4[length6] = aVar.mo39432i();
                        aVar.mo39416a();
                        length6++;
                    }
                    strArr4[length6] = aVar.mo39432i();
                    this.f4285h = strArr4;
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rh$b */
    public static final class C3886b extends C3365e {

        /* renamed from: b */
        public C3888b[] f4258b;

        /* renamed from: c */
        public C3887a[] f4259c;

        /* renamed from: com.yandex.metrica.impl.ob.rh$b$b */
        public static final class C3888b extends C3365e {

            /* renamed from: n */
            private static volatile C3888b[] f4266n;

            /* renamed from: b */
            public long f4267b;

            /* renamed from: c */
            public long f4268c;

            /* renamed from: d */
            public long f4269d;

            /* renamed from: e */
            public double f4270e;

            /* renamed from: f */
            public double f4271f;

            /* renamed from: g */
            public int f4272g;

            /* renamed from: h */
            public int f4273h;

            /* renamed from: i */
            public int f4274i;

            /* renamed from: j */
            public int f4275j;

            /* renamed from: k */
            public int f4276k;

            /* renamed from: l */
            public int f4277l;

            /* renamed from: m */
            public long f4278m;

            /* renamed from: d */
            public static C3888b[] m4748d() {
                if (f4266n == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4266n == null) {
                            f4266n = new C3888b[0];
                        }
                    }
                }
                return f4266n;
            }

            public C3888b() {
                mo40996e();
            }

            /* renamed from: e */
            public C3888b mo40996e() {
                this.f4267b = 0;
                this.f4268c = 0;
                this.f4269d = 0;
                this.f4270e = Utils.DOUBLE_EPSILON;
                this.f4271f = Utils.DOUBLE_EPSILON;
                this.f4272g = 0;
                this.f4273h = 0;
                this.f4274i = 0;
                this.f4275j = 0;
                this.f4276k = 0;
                this.f4277l = 0;
                this.f4278m = 0;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39552a(1, this.f4267b);
                bVar.mo39552a(2, this.f4268c);
                long j = this.f4269d;
                if (j != 0) {
                    bVar.mo39552a(3, j);
                }
                bVar.mo39549a(4, this.f4270e);
                bVar.mo39549a(5, this.f4271f);
                int i = this.f4272g;
                if (i != 0) {
                    bVar.mo39564b(6, i);
                }
                int i2 = this.f4273h;
                if (i2 != 0) {
                    bVar.mo39564b(7, i2);
                }
                int i3 = this.f4274i;
                if (i3 != 0) {
                    bVar.mo39564b(8, i3);
                }
                int i4 = this.f4275j;
                if (i4 != 0) {
                    bVar.mo39551a(9, i4);
                }
                int i5 = this.f4276k;
                if (i5 != 0) {
                    bVar.mo39551a(10, i5);
                }
                int i6 = this.f4277l;
                if (i6 != 0) {
                    bVar.mo39551a(11, i6);
                }
                long j2 = this.f4278m;
                if (j2 != 0) {
                    bVar.mo39552a(12, j2);
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c() + C3157b.m2115d(1, this.f4267b) + C3157b.m2115d(2, this.f4268c);
                long j = this.f4269d;
                if (j != 0) {
                    c += C3157b.m2115d(3, j);
                }
                int b = c + C3157b.m2103b(4, this.f4270e) + C3157b.m2103b(5, this.f4271f);
                int i = this.f4272g;
                if (i != 0) {
                    b += C3157b.m2118e(6, i);
                }
                int i2 = this.f4273h;
                if (i2 != 0) {
                    b += C3157b.m2118e(7, i2);
                }
                int i3 = this.f4274i;
                if (i3 != 0) {
                    b += C3157b.m2118e(8, i3);
                }
                int i4 = this.f4275j;
                if (i4 != 0) {
                    b += C3157b.m2114d(9, i4);
                }
                int i5 = this.f4276k;
                if (i5 != 0) {
                    b += C3157b.m2114d(10, i5);
                }
                int i6 = this.f4277l;
                if (i6 != 0) {
                    b += C3157b.m2114d(11, i6);
                }
                long j2 = this.f4278m;
                return j2 != 0 ? b + C3157b.m2115d(12, j2) : b;
            }

            /* renamed from: b */
            public C3888b mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    switch (a) {
                        case 0:
                            return this;
                        case 8:
                            this.f4267b = aVar.mo39424e();
                            break;
                        case 16:
                            this.f4268c = aVar.mo39424e();
                            break;
                        case 24:
                            this.f4269d = aVar.mo39424e();
                            break;
                        case 33:
                            this.f4270e = aVar.mo39421c();
                            break;
                        case 41:
                            this.f4271f = aVar.mo39421c();
                            break;
                        case 48:
                            this.f4272g = aVar.mo39434k();
                            break;
                        case 56:
                            this.f4273h = aVar.mo39434k();
                            break;
                        case 64:
                            this.f4274i = aVar.mo39434k();
                            break;
                        case 72:
                            this.f4275j = aVar.mo39428g();
                            break;
                        case 80:
                            int g = aVar.mo39428g();
                            if (g != 0 && g != 1 && g != 2) {
                                break;
                            } else {
                                this.f4276k = g;
                                break;
                            }
                        case 88:
                            int g2 = aVar.mo39428g();
                            if (g2 != 0 && g2 != 1) {
                                break;
                            } else {
                                this.f4277l = g2;
                                break;
                            }
                        case 96:
                            this.f4278m = aVar.mo39424e();
                            break;
                        default:
                            if (C3442g.m3331a(aVar, a)) {
                                break;
                            } else {
                                return this;
                            }
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rh$b$a */
        public static final class C3887a extends C3365e {

            /* renamed from: g */
            private static volatile C3887a[] f4260g;

            /* renamed from: b */
            public long f4261b;

            /* renamed from: c */
            public long f4262c;

            /* renamed from: d */
            public C3885a[] f4263d;

            /* renamed from: e */
            public C3903d[] f4264e;

            /* renamed from: f */
            public long f4265f;

            /* renamed from: d */
            public static C3887a[] m4742d() {
                if (f4260g == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4260g == null) {
                            f4260g = new C3887a[0];
                        }
                    }
                }
                return f4260g;
            }

            public C3887a() {
                mo40994e();
            }

            /* renamed from: e */
            public C3887a mo40994e() {
                this.f4261b = 0;
                this.f4262c = 0;
                this.f4263d = C3885a.m4731d();
                this.f4264e = C3903d.m4830d();
                this.f4265f = 0;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39552a(1, this.f4261b);
                bVar.mo39552a(2, this.f4262c);
                C3885a[] aVarArr = this.f4263d;
                int i = 0;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        C3885a[] aVarArr2 = this.f4263d;
                        if (i2 >= aVarArr2.length) {
                            break;
                        }
                        C3885a aVar = aVarArr2[i2];
                        if (aVar != null) {
                            bVar.mo39553a(3, (C3365e) aVar);
                        }
                        i2++;
                    }
                }
                C3903d[] dVarArr = this.f4264e;
                if (dVarArr != null && dVarArr.length > 0) {
                    while (true) {
                        C3903d[] dVarArr2 = this.f4264e;
                        if (i >= dVarArr2.length) {
                            break;
                        }
                        C3903d dVar = dVarArr2[i];
                        if (dVar != null) {
                            bVar.mo39553a(4, (C3365e) dVar);
                        }
                        i++;
                    }
                }
                long j = this.f4265f;
                if (j != 0) {
                    bVar.mo39552a(5, j);
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c() + C3157b.m2115d(1, this.f4261b) + C3157b.m2115d(2, this.f4262c);
                C3885a[] aVarArr = this.f4263d;
                int i = 0;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i2 = c;
                    int i3 = 0;
                    while (true) {
                        C3885a[] aVarArr2 = this.f4263d;
                        if (i3 >= aVarArr2.length) {
                            break;
                        }
                        C3885a aVar = aVarArr2[i3];
                        if (aVar != null) {
                            i2 += C3157b.m2105b(3, (C3365e) aVar);
                        }
                        i3++;
                    }
                    c = i2;
                }
                C3903d[] dVarArr = this.f4264e;
                if (dVarArr != null && dVarArr.length > 0) {
                    while (true) {
                        C3903d[] dVarArr2 = this.f4264e;
                        if (i >= dVarArr2.length) {
                            break;
                        }
                        C3903d dVar = dVarArr2[i];
                        if (dVar != null) {
                            c += C3157b.m2105b(4, (C3365e) dVar);
                        }
                        i++;
                    }
                }
                long j = this.f4265f;
                return j != 0 ? c + C3157b.m2115d(5, j) : c;
            }

            /* renamed from: b */
            public C3887a mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4261b = aVar.mo39424e();
                    } else if (a == 16) {
                        this.f4262c = aVar.mo39424e();
                    } else if (a == 26) {
                        int b = C3442g.m3333b(aVar, 26);
                        C3885a[] aVarArr = this.f4263d;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        C3885a[] aVarArr2 = new C3885a[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f4263d, 0, aVarArr2, 0, length);
                        }
                        while (length < aVarArr2.length - 1) {
                            aVarArr2[length] = new C3885a();
                            aVar.mo39418a((C3365e) aVarArr2[length]);
                            aVar.mo39416a();
                            length++;
                        }
                        aVarArr2[length] = new C3885a();
                        aVar.mo39418a((C3365e) aVarArr2[length]);
                        this.f4263d = aVarArr2;
                    } else if (a == 34) {
                        int b2 = C3442g.m3333b(aVar, 34);
                        C3903d[] dVarArr = this.f4264e;
                        int length2 = dVarArr == null ? 0 : dVarArr.length;
                        C3903d[] dVarArr2 = new C3903d[(b2 + length2)];
                        if (length2 != 0) {
                            System.arraycopy(this.f4264e, 0, dVarArr2, 0, length2);
                        }
                        while (length2 < dVarArr2.length - 1) {
                            dVarArr2[length2] = new C3903d();
                            aVar.mo39418a((C3365e) dVarArr2[length2]);
                            aVar.mo39416a();
                            length2++;
                        }
                        dVarArr2[length2] = new C3903d();
                        aVar.mo39418a((C3365e) dVarArr2[length2]);
                        this.f4264e = dVarArr2;
                    } else if (a == 40) {
                        this.f4265f = aVar.mo39424e();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        public C3886b() {
            mo40992d();
        }

        /* renamed from: d */
        public C3886b mo40992d() {
            this.f4258b = C3888b.m4748d();
            this.f4259c = C3887a.m4742d();
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            C3888b[] bVarArr = this.f4258b;
            int i = 0;
            if (bVarArr != null && bVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C3888b[] bVarArr2 = this.f4258b;
                    if (i2 >= bVarArr2.length) {
                        break;
                    }
                    C3888b bVar2 = bVarArr2[i2];
                    if (bVar2 != null) {
                        bVar.mo39553a(1, (C3365e) bVar2);
                    }
                    i2++;
                }
            }
            C3887a[] aVarArr = this.f4259c;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    C3887a[] aVarArr2 = this.f4259c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3887a aVar = aVarArr2[i];
                    if (aVar != null) {
                        bVar.mo39553a(2, (C3365e) aVar);
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
            C3888b[] bVarArr = this.f4258b;
            int i = 0;
            if (bVarArr != null && bVarArr.length > 0) {
                int i2 = c;
                int i3 = 0;
                while (true) {
                    C3888b[] bVarArr2 = this.f4258b;
                    if (i3 >= bVarArr2.length) {
                        break;
                    }
                    C3888b bVar = bVarArr2[i3];
                    if (bVar != null) {
                        i2 += C3157b.m2105b(1, (C3365e) bVar);
                    }
                    i3++;
                }
                c = i2;
            }
            C3887a[] aVarArr = this.f4259c;
            if (aVarArr != null && aVarArr.length > 0) {
                while (true) {
                    C3887a[] aVarArr2 = this.f4259c;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3887a aVar = aVarArr2[i];
                    if (aVar != null) {
                        c += C3157b.m2105b(2, (C3365e) aVar);
                    }
                    i++;
                }
            }
            return c;
        }

        /* renamed from: b */
        public C3886b mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    int b = C3442g.m3333b(aVar, 10);
                    C3888b[] bVarArr = this.f4258b;
                    int length = bVarArr == null ? 0 : bVarArr.length;
                    C3888b[] bVarArr2 = new C3888b[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4258b, 0, bVarArr2, 0, length);
                    }
                    while (length < bVarArr2.length - 1) {
                        bVarArr2[length] = new C3888b();
                        aVar.mo39418a((C3365e) bVarArr2[length]);
                        aVar.mo39416a();
                        length++;
                    }
                    bVarArr2[length] = new C3888b();
                    aVar.mo39418a((C3365e) bVarArr2[length]);
                    this.f4258b = bVarArr2;
                } else if (a == 18) {
                    int b2 = C3442g.m3333b(aVar, 18);
                    C3887a[] aVarArr = this.f4259c;
                    int length2 = aVarArr == null ? 0 : aVarArr.length;
                    C3887a[] aVarArr2 = new C3887a[(b2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f4259c, 0, aVarArr2, 0, length2);
                    }
                    while (length2 < aVarArr2.length - 1) {
                        aVarArr2[length2] = new C3887a();
                        aVar.mo39418a((C3365e) aVarArr2[length2]);
                        aVar.mo39416a();
                        length2++;
                    }
                    aVarArr2[length2] = new C3887a();
                    aVar.mo39418a((C3365e) aVarArr2[length2]);
                    this.f4259c = aVarArr2;
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rh$a */
    public static final class C3885a extends C3365e {

        /* renamed from: l */
        private static volatile C3885a[] f4247l;

        /* renamed from: b */
        public int f4248b;

        /* renamed from: c */
        public int f4249c;

        /* renamed from: d */
        public int f4250d;

        /* renamed from: e */
        public int f4251e;

        /* renamed from: f */
        public int f4252f;

        /* renamed from: g */
        public String f4253g;

        /* renamed from: h */
        public boolean f4254h;

        /* renamed from: i */
        public int f4255i;

        /* renamed from: j */
        public int f4256j;

        /* renamed from: k */
        public long f4257k;

        /* renamed from: d */
        public static C3885a[] m4731d() {
            if (f4247l == null) {
                synchronized (C3246c.f2825a) {
                    if (f4247l == null) {
                        f4247l = new C3885a[0];
                    }
                }
            }
            return f4247l;
        }

        public C3885a() {
            mo40990e();
        }

        /* renamed from: e */
        public C3885a mo40990e() {
            this.f4248b = -1;
            this.f4249c = 0;
            this.f4250d = -1;
            this.f4251e = -1;
            this.f4252f = -1;
            this.f4253g = "";
            this.f4254h = false;
            this.f4255i = 0;
            this.f4256j = -1;
            this.f4257k = 0;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            int i = this.f4248b;
            if (i != -1) {
                bVar.mo39564b(1, i);
            }
            int i2 = this.f4249c;
            if (i2 != 0) {
                bVar.mo39569c(2, i2);
            }
            int i3 = this.f4250d;
            if (i3 != -1) {
                bVar.mo39564b(3, i3);
            }
            int i4 = this.f4251e;
            if (i4 != -1) {
                bVar.mo39564b(4, i4);
            }
            int i5 = this.f4252f;
            if (i5 != -1) {
                bVar.mo39564b(5, i5);
            }
            if (!this.f4253g.equals("")) {
                bVar.mo39554a(6, this.f4253g);
            }
            boolean z = this.f4254h;
            if (z) {
                bVar.mo39555a(7, z);
            }
            int i6 = this.f4255i;
            if (i6 != 0) {
                bVar.mo39551a(8, i6);
            }
            int i7 = this.f4256j;
            if (i7 != -1) {
                bVar.mo39564b(9, i7);
            }
            long j = this.f4257k;
            if (j != 0) {
                bVar.mo39552a(10, j);
            }
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c();
            int i = this.f4248b;
            if (i != -1) {
                c += C3157b.m2118e(1, i);
            }
            int i2 = this.f4249c;
            if (i2 != 0) {
                c += C3157b.m2122f(2, i2);
            }
            int i3 = this.f4250d;
            if (i3 != -1) {
                c += C3157b.m2118e(3, i3);
            }
            int i4 = this.f4251e;
            if (i4 != -1) {
                c += C3157b.m2118e(4, i4);
            }
            int i5 = this.f4252f;
            if (i5 != -1) {
                c += C3157b.m2118e(5, i5);
            }
            if (!this.f4253g.equals("")) {
                c += C3157b.m2106b(6, this.f4253g);
            }
            boolean z = this.f4254h;
            if (z) {
                c += C3157b.m2107b(7, z);
            }
            int i6 = this.f4255i;
            if (i6 != 0) {
                c += C3157b.m2114d(8, i6);
            }
            int i7 = this.f4256j;
            if (i7 != -1) {
                c += C3157b.m2118e(9, i7);
            }
            long j = this.f4257k;
            return j != 0 ? c + C3157b.m2115d(10, j) : c;
        }

        /* renamed from: b */
        public C3885a mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                switch (a) {
                    case 0:
                        return this;
                    case 8:
                        this.f4248b = aVar.mo39434k();
                        break;
                    case 16:
                        this.f4249c = aVar.mo39435l();
                        break;
                    case 24:
                        this.f4250d = aVar.mo39434k();
                        break;
                    case 32:
                        this.f4251e = aVar.mo39434k();
                        break;
                    case 40:
                        this.f4252f = aVar.mo39434k();
                        break;
                    case 50:
                        this.f4253g = aVar.mo39432i();
                        break;
                    case 56:
                        this.f4254h = aVar.mo39431h();
                        break;
                    case 64:
                        int g = aVar.mo39428g();
                        if (g != 0 && g != 1 && g != 2 && g != 3 && g != 4) {
                            break;
                        } else {
                            this.f4255i = g;
                            break;
                        }
                        break;
                    case 72:
                        this.f4256j = aVar.mo39434k();
                        break;
                    case 80:
                        this.f4257k = aVar.mo39424e();
                        break;
                    default:
                        if (C3442g.m3331a(aVar, a)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rh$d */
    public static final class C3903d extends C3365e {

        /* renamed from: g */
        private static volatile C3903d[] f4362g;

        /* renamed from: b */
        public String f4363b;

        /* renamed from: c */
        public int f4364c;

        /* renamed from: d */
        public String f4365d;

        /* renamed from: e */
        public boolean f4366e;

        /* renamed from: f */
        public long f4367f;

        /* renamed from: d */
        public static C3903d[] m4830d() {
            if (f4362g == null) {
                synchronized (C3246c.f2825a) {
                    if (f4362g == null) {
                        f4362g = new C3903d[0];
                    }
                }
            }
            return f4362g;
        }

        public C3903d() {
            mo41026e();
        }

        /* renamed from: e */
        public C3903d mo41026e() {
            this.f4363b = "";
            this.f4364c = 0;
            this.f4365d = "";
            this.f4366e = false;
            this.f4367f = 0;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            bVar.mo39554a(1, this.f4363b);
            int i = this.f4364c;
            if (i != 0) {
                bVar.mo39569c(2, i);
            }
            if (!this.f4365d.equals("")) {
                bVar.mo39554a(3, this.f4365d);
            }
            boolean z = this.f4366e;
            if (z) {
                bVar.mo39555a(4, z);
            }
            long j = this.f4367f;
            if (j != 0) {
                bVar.mo39552a(5, j);
            }
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c() + C3157b.m2106b(1, this.f4363b);
            int i = this.f4364c;
            if (i != 0) {
                c += C3157b.m2122f(2, i);
            }
            if (!this.f4365d.equals("")) {
                c += C3157b.m2106b(3, this.f4365d);
            }
            boolean z = this.f4366e;
            if (z) {
                c += C3157b.m2107b(4, z);
            }
            long j = this.f4367f;
            return j != 0 ? c + C3157b.m2115d(5, j) : c;
        }

        /* renamed from: b */
        public C3903d mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    this.f4363b = aVar.mo39432i();
                } else if (a == 16) {
                    this.f4364c = aVar.mo39435l();
                } else if (a == 26) {
                    this.f4365d = aVar.mo39432i();
                } else if (a == 32) {
                    this.f4366e = aVar.mo39431h();
                } else if (a == 40) {
                    this.f4367f = aVar.mo39424e();
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }
}
