package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.rg */
public interface C3877rg {

    /* renamed from: com.yandex.metrica.impl.ob.rg$d */
    public static final class C3881d extends C3365e {

        /* renamed from: g */
        private static volatile C3881d[] f4228g;

        /* renamed from: b */
        public String f4229b;

        /* renamed from: c */
        public String f4230c;

        /* renamed from: d */
        public int f4231d;

        /* renamed from: e */
        public String f4232e;

        /* renamed from: f */
        public boolean f4233f;

        /* renamed from: d */
        public static C3881d[] m4713d() {
            if (f4228g == null) {
                synchronized (C3246c.f2825a) {
                    if (f4228g == null) {
                        f4228g = new C3881d[0];
                    }
                }
            }
            return f4228g;
        }

        public C3881d() {
            mo40984e();
        }

        /* renamed from: e */
        public C3881d mo40984e() {
            this.f4229b = "";
            this.f4230c = "";
            this.f4231d = 0;
            this.f4232e = "";
            this.f4233f = false;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            bVar.mo39554a(1, this.f4229b);
            if (!this.f4230c.equals("")) {
                bVar.mo39554a(2, this.f4230c);
            }
            bVar.mo39569c(3, this.f4231d);
            bVar.mo39554a(4, this.f4232e);
            bVar.mo39555a(5, this.f4233f);
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c() + C3157b.m2106b(1, this.f4229b);
            if (!this.f4230c.equals("")) {
                c += C3157b.m2106b(2, this.f4230c);
            }
            return c + C3157b.m2122f(3, this.f4231d) + C3157b.m2106b(4, this.f4232e) + C3157b.m2107b(5, this.f4233f);
        }

        /* renamed from: b */
        public C3881d mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    this.f4229b = aVar.mo39432i();
                } else if (a == 18) {
                    this.f4230c = aVar.mo39432i();
                } else if (a == 24) {
                    this.f4231d = aVar.mo39435l();
                } else if (a == 34) {
                    this.f4232e = aVar.mo39432i();
                } else if (a == 40) {
                    this.f4233f = aVar.mo39431h();
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rg$e */
    public static final class C3882e extends C3365e {

        /* renamed from: h */
        private static volatile C3882e[] f4234h;

        /* renamed from: b */
        public String f4235b;

        /* renamed from: c */
        public int f4236c;

        /* renamed from: d */
        public long f4237d;

        /* renamed from: e */
        public String f4238e;

        /* renamed from: f */
        public int f4239f;

        /* renamed from: g */
        public C3881d[] f4240g;

        /* renamed from: d */
        public static C3882e[] m4719d() {
            if (f4234h == null) {
                synchronized (C3246c.f2825a) {
                    if (f4234h == null) {
                        f4234h = new C3882e[0];
                    }
                }
            }
            return f4234h;
        }

        public C3882e() {
            mo40986e();
        }

        /* renamed from: e */
        public C3882e mo40986e() {
            this.f4235b = "";
            this.f4236c = 0;
            this.f4237d = 0;
            this.f4238e = "";
            this.f4239f = 0;
            this.f4240g = C3881d.m4713d();
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            bVar.mo39554a(1, this.f4235b);
            bVar.mo39569c(2, this.f4236c);
            bVar.mo39570c(3, this.f4237d);
            if (!this.f4238e.equals("")) {
                bVar.mo39554a(4, this.f4238e);
            }
            int i = this.f4239f;
            if (i != 0) {
                bVar.mo39564b(5, i);
            }
            C3881d[] dVarArr = this.f4240g;
            if (dVarArr != null && dVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C3881d[] dVarArr2 = this.f4240g;
                    if (i2 >= dVarArr2.length) {
                        break;
                    }
                    C3881d dVar = dVarArr2[i2];
                    if (dVar != null) {
                        bVar.mo39553a(6, (C3365e) dVar);
                    }
                    i2++;
                }
            }
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c() + C3157b.m2106b(1, this.f4235b) + C3157b.m2122f(2, this.f4236c) + C3157b.m2123f(3, this.f4237d);
            if (!this.f4238e.equals("")) {
                c += C3157b.m2106b(4, this.f4238e);
            }
            int i = this.f4239f;
            if (i != 0) {
                c += C3157b.m2118e(5, i);
            }
            C3881d[] dVarArr = this.f4240g;
            if (dVarArr != null && dVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C3881d[] dVarArr2 = this.f4240g;
                    if (i2 >= dVarArr2.length) {
                        break;
                    }
                    C3881d dVar = dVarArr2[i2];
                    if (dVar != null) {
                        c += C3157b.m2105b(6, (C3365e) dVar);
                    }
                    i2++;
                }
            }
            return c;
        }

        /* renamed from: b */
        public C3882e mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    this.f4235b = aVar.mo39432i();
                } else if (a == 16) {
                    this.f4236c = aVar.mo39435l();
                } else if (a == 24) {
                    this.f4237d = aVar.mo39436m();
                } else if (a == 34) {
                    this.f4238e = aVar.mo39432i();
                } else if (a == 40) {
                    this.f4239f = aVar.mo39434k();
                } else if (a == 50) {
                    int b = C3442g.m3333b(aVar, 50);
                    C3881d[] dVarArr = this.f4240g;
                    int length = dVarArr == null ? 0 : dVarArr.length;
                    C3881d[] dVarArr2 = new C3881d[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4240g, 0, dVarArr2, 0, length);
                    }
                    while (length < dVarArr2.length - 1) {
                        dVarArr2[length] = new C3881d();
                        aVar.mo39418a((C3365e) dVarArr2[length]);
                        aVar.mo39416a();
                        length++;
                    }
                    dVarArr2[length] = new C3881d();
                    aVar.mo39418a((C3365e) dVarArr2[length]);
                    this.f4240g = dVarArr2;
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rg$a */
    public static final class C3878a extends C3365e {

        /* renamed from: b */
        public C3882e f4219b;

        /* renamed from: c */
        public C3882e[] f4220c;

        public C3878a() {
            mo40978d();
        }

        /* renamed from: d */
        public C3878a mo40978d() {
            this.f4219b = null;
            this.f4220c = C3882e.m4719d();
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            C3882e eVar = this.f4219b;
            if (eVar != null) {
                bVar.mo39553a(1, (C3365e) eVar);
            }
            C3882e[] eVarArr = this.f4220c;
            if (eVarArr != null && eVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3882e[] eVarArr2 = this.f4220c;
                    if (i >= eVarArr2.length) {
                        break;
                    }
                    C3882e eVar2 = eVarArr2[i];
                    if (eVar2 != null) {
                        bVar.mo39553a(2, (C3365e) eVar2);
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
            C3882e eVar = this.f4219b;
            if (eVar != null) {
                c += C3157b.m2105b(1, (C3365e) eVar);
            }
            C3882e[] eVarArr = this.f4220c;
            if (eVarArr != null && eVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3882e[] eVarArr2 = this.f4220c;
                    if (i >= eVarArr2.length) {
                        break;
                    }
                    C3882e eVar2 = eVarArr2[i];
                    if (eVar2 != null) {
                        c += C3157b.m2105b(2, (C3365e) eVar2);
                    }
                    i++;
                }
            }
            return c;
        }

        /* renamed from: b */
        public C3878a mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    if (this.f4219b == null) {
                        this.f4219b = new C3882e();
                    }
                    aVar.mo39418a((C3365e) this.f4219b);
                } else if (a == 18) {
                    int b = C3442g.m3333b(aVar, 18);
                    C3882e[] eVarArr = this.f4220c;
                    int length = eVarArr == null ? 0 : eVarArr.length;
                    C3882e[] eVarArr2 = new C3882e[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4220c, 0, eVarArr2, 0, length);
                    }
                    while (length < eVarArr2.length - 1) {
                        eVarArr2[length] = new C3882e();
                        aVar.mo39418a((C3365e) eVarArr2[length]);
                        aVar.mo39416a();
                        length++;
                    }
                    eVarArr2[length] = new C3882e();
                    aVar.mo39418a((C3365e) eVarArr2[length]);
                    this.f4220c = eVarArr2;
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rg$b */
    public static final class C3879b extends C3365e {

        /* renamed from: b */
        public C3878a f4221b;

        /* renamed from: c */
        public String f4222c;

        /* renamed from: d */
        public int f4223d;

        public C3879b() {
            mo40980d();
        }

        /* renamed from: d */
        public C3879b mo40980d() {
            this.f4221b = null;
            this.f4222c = "";
            this.f4223d = -1;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            C3878a aVar = this.f4221b;
            if (aVar != null) {
                bVar.mo39553a(1, (C3365e) aVar);
            }
            if (!this.f4222c.equals("")) {
                bVar.mo39554a(2, this.f4222c);
            }
            int i = this.f4223d;
            if (i != -1) {
                bVar.mo39551a(3, i);
            }
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c();
            C3878a aVar = this.f4221b;
            if (aVar != null) {
                c += C3157b.m2105b(1, (C3365e) aVar);
            }
            if (!this.f4222c.equals("")) {
                c += C3157b.m2106b(2, this.f4222c);
            }
            int i = this.f4223d;
            return i != -1 ? c + C3157b.m2114d(3, i) : c;
        }

        /* renamed from: b */
        public C3879b mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    if (this.f4221b == null) {
                        this.f4221b = new C3878a();
                    }
                    aVar.mo39418a((C3365e) this.f4221b);
                } else if (a == 18) {
                    this.f4222c = aVar.mo39432i();
                } else if (a == 24) {
                    int g = aVar.mo39428g();
                    if (g == -1 || g == 0 || g == 1) {
                        this.f4223d = g;
                    }
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rg$f */
    public static final class C3883f extends C3365e {

        /* renamed from: g */
        private static volatile C3883f[] f4241g;

        /* renamed from: b */
        public String f4242b;

        /* renamed from: c */
        public String f4243c;

        /* renamed from: d */
        public C3881d[] f4244d;

        /* renamed from: e */
        public C3883f f4245e;

        /* renamed from: f */
        public C3883f[] f4246f;

        /* renamed from: d */
        public static C3883f[] m4725d() {
            if (f4241g == null) {
                synchronized (C3246c.f2825a) {
                    if (f4241g == null) {
                        f4241g = new C3883f[0];
                    }
                }
            }
            return f4241g;
        }

        public C3883f() {
            mo40988e();
        }

        /* renamed from: e */
        public C3883f mo40988e() {
            this.f4242b = "";
            this.f4243c = "";
            this.f4244d = C3881d.m4713d();
            this.f4245e = null;
            this.f4246f = m4725d();
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            bVar.mo39554a(1, this.f4242b);
            if (!this.f4243c.equals("")) {
                bVar.mo39554a(2, this.f4243c);
            }
            C3881d[] dVarArr = this.f4244d;
            int i = 0;
            if (dVarArr != null && dVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C3881d[] dVarArr2 = this.f4244d;
                    if (i2 >= dVarArr2.length) {
                        break;
                    }
                    C3881d dVar = dVarArr2[i2];
                    if (dVar != null) {
                        bVar.mo39553a(3, (C3365e) dVar);
                    }
                    i2++;
                }
            }
            C3883f fVar = this.f4245e;
            if (fVar != null) {
                bVar.mo39553a(4, (C3365e) fVar);
            }
            C3883f[] fVarArr = this.f4246f;
            if (fVarArr != null && fVarArr.length > 0) {
                while (true) {
                    C3883f[] fVarArr2 = this.f4246f;
                    if (i >= fVarArr2.length) {
                        break;
                    }
                    C3883f fVar2 = fVarArr2[i];
                    if (fVar2 != null) {
                        bVar.mo39553a(5, (C3365e) fVar2);
                    }
                    i++;
                }
            }
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c() + C3157b.m2106b(1, this.f4242b);
            if (!this.f4243c.equals("")) {
                c += C3157b.m2106b(2, this.f4243c);
            }
            C3881d[] dVarArr = this.f4244d;
            int i = 0;
            if (dVarArr != null && dVarArr.length > 0) {
                int i2 = c;
                int i3 = 0;
                while (true) {
                    C3881d[] dVarArr2 = this.f4244d;
                    if (i3 >= dVarArr2.length) {
                        break;
                    }
                    C3881d dVar = dVarArr2[i3];
                    if (dVar != null) {
                        i2 += C3157b.m2105b(3, (C3365e) dVar);
                    }
                    i3++;
                }
                c = i2;
            }
            C3883f fVar = this.f4245e;
            if (fVar != null) {
                c += C3157b.m2105b(4, (C3365e) fVar);
            }
            C3883f[] fVarArr = this.f4246f;
            if (fVarArr != null && fVarArr.length > 0) {
                while (true) {
                    C3883f[] fVarArr2 = this.f4246f;
                    if (i >= fVarArr2.length) {
                        break;
                    }
                    C3883f fVar2 = fVarArr2[i];
                    if (fVar2 != null) {
                        c += C3157b.m2105b(5, (C3365e) fVar2);
                    }
                    i++;
                }
            }
            return c;
        }

        /* renamed from: b */
        public C3883f mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    this.f4242b = aVar.mo39432i();
                } else if (a == 18) {
                    this.f4243c = aVar.mo39432i();
                } else if (a == 26) {
                    int b = C3442g.m3333b(aVar, 26);
                    C3881d[] dVarArr = this.f4244d;
                    int length = dVarArr == null ? 0 : dVarArr.length;
                    C3881d[] dVarArr2 = new C3881d[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4244d, 0, dVarArr2, 0, length);
                    }
                    while (length < dVarArr2.length - 1) {
                        dVarArr2[length] = new C3881d();
                        aVar.mo39418a((C3365e) dVarArr2[length]);
                        aVar.mo39416a();
                        length++;
                    }
                    dVarArr2[length] = new C3881d();
                    aVar.mo39418a((C3365e) dVarArr2[length]);
                    this.f4244d = dVarArr2;
                } else if (a == 34) {
                    if (this.f4245e == null) {
                        this.f4245e = new C3883f();
                    }
                    aVar.mo39418a((C3365e) this.f4245e);
                } else if (a == 42) {
                    int b2 = C3442g.m3333b(aVar, 42);
                    C3883f[] fVarArr = this.f4246f;
                    int length2 = fVarArr == null ? 0 : fVarArr.length;
                    C3883f[] fVarArr2 = new C3883f[(b2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f4246f, 0, fVarArr2, 0, length2);
                    }
                    while (length2 < fVarArr2.length - 1) {
                        fVarArr2[length2] = new C3883f();
                        aVar.mo39418a((C3365e) fVarArr2[length2]);
                        aVar.mo39416a();
                        length2++;
                    }
                    fVarArr2[length2] = new C3883f();
                    aVar.mo39418a((C3365e) fVarArr2[length2]);
                    this.f4246f = fVarArr2;
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.rg$c */
    public static final class C3880c extends C3365e {

        /* renamed from: b */
        public C3883f f4224b;

        /* renamed from: c */
        public C3878a f4225c;

        /* renamed from: d */
        public String f4226d;

        /* renamed from: e */
        public int f4227e;

        public C3880c() {
            mo40982d();
        }

        /* renamed from: d */
        public C3880c mo40982d() {
            this.f4224b = null;
            this.f4225c = null;
            this.f4226d = "";
            this.f4227e = -1;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            C3883f fVar = this.f4224b;
            if (fVar != null) {
                bVar.mo39553a(1, (C3365e) fVar);
            }
            C3878a aVar = this.f4225c;
            if (aVar != null) {
                bVar.mo39553a(2, (C3365e) aVar);
            }
            if (!this.f4226d.equals("")) {
                bVar.mo39554a(3, this.f4226d);
            }
            int i = this.f4227e;
            if (i != -1) {
                bVar.mo39551a(4, i);
            }
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c();
            C3883f fVar = this.f4224b;
            if (fVar != null) {
                c += C3157b.m2105b(1, (C3365e) fVar);
            }
            C3878a aVar = this.f4225c;
            if (aVar != null) {
                c += C3157b.m2105b(2, (C3365e) aVar);
            }
            if (!this.f4226d.equals("")) {
                c += C3157b.m2106b(3, this.f4226d);
            }
            int i = this.f4227e;
            return i != -1 ? c + C3157b.m2114d(4, i) : c;
        }

        /* renamed from: b */
        public C3880c mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    if (this.f4224b == null) {
                        this.f4224b = new C3883f();
                    }
                    aVar.mo39418a((C3365e) this.f4224b);
                } else if (a == 18) {
                    if (this.f4225c == null) {
                        this.f4225c = new C3878a();
                    }
                    aVar.mo39418a((C3365e) this.f4225c);
                } else if (a == 26) {
                    this.f4226d = aVar.mo39432i();
                } else if (a == 32) {
                    int g = aVar.mo39428g();
                    if (g == -1 || g == 0 || g == 1) {
                        this.f4227e = g;
                    }
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }
    }
}
