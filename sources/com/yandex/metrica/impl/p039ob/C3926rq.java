package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.rq */
public interface C3926rq {

    /* renamed from: com.yandex.metrica.impl.ob.rq$a */
    public static final class C3927a extends C3365e {

        /* renamed from: b */
        public C3928a[] f4423b;

        /* renamed from: c */
        public String f4424c;

        /* renamed from: d */
        public long f4425d;

        /* renamed from: e */
        public boolean f4426e;

        /* renamed from: f */
        public boolean f4427f;

        /* renamed from: com.yandex.metrica.impl.ob.rq$a$a */
        public static final class C3928a extends C3365e {

            /* renamed from: d */
            private static volatile C3928a[] f4428d;

            /* renamed from: b */
            public String f4429b;

            /* renamed from: c */
            public String[] f4430c;

            /* renamed from: d */
            public static C3928a[] m4937d() {
                if (f4428d == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4428d == null) {
                            f4428d = new C3928a[0];
                        }
                    }
                }
                return f4428d;
            }

            public C3928a() {
                mo41064e();
            }

            /* renamed from: e */
            public C3928a mo41064e() {
                this.f4429b = "";
                this.f4430c = C3442g.f3278f;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39554a(1, this.f4429b);
                String[] strArr = this.f4430c;
                if (strArr != null && strArr.length > 0) {
                    int i = 0;
                    while (true) {
                        String[] strArr2 = this.f4430c;
                        if (i >= strArr2.length) {
                            break;
                        }
                        String str = strArr2[i];
                        if (str != null) {
                            bVar.mo39554a(2, str);
                        }
                        i++;
                    }
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c() + C3157b.m2106b(1, this.f4429b);
                String[] strArr = this.f4430c;
                if (strArr == null || strArr.length <= 0) {
                    return c;
                }
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    String[] strArr2 = this.f4430c;
                    if (i >= strArr2.length) {
                        return c + i2 + (i3 * 1);
                    }
                    String str = strArr2[i];
                    if (str != null) {
                        i3++;
                        i2 += C3157b.m2110b(str);
                    }
                    i++;
                }
            }

            /* renamed from: b */
            public C3928a mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        this.f4429b = aVar.mo39432i();
                    } else if (a == 18) {
                        int b = C3442g.m3333b(aVar, 18);
                        String[] strArr = this.f4430c;
                        int length = strArr == null ? 0 : strArr.length;
                        String[] strArr2 = new String[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f4430c, 0, strArr2, 0, length);
                        }
                        while (length < strArr2.length - 1) {
                            strArr2[length] = aVar.mo39432i();
                            aVar.mo39416a();
                            length++;
                        }
                        strArr2[length] = aVar.mo39432i();
                        this.f4430c = strArr2;
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        public C3927a() {
            mo41062d();
        }

        /* renamed from: d */
        public C3927a mo41062d() {
            this.f4423b = C3928a.m4937d();
            this.f4424c = "";
            this.f4425d = 0;
            this.f4426e = false;
            this.f4427f = false;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            C3928a[] aVarArr = this.f4423b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3928a[] aVarArr2 = this.f4423b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3928a aVar = aVarArr2[i];
                    if (aVar != null) {
                        bVar.mo39553a(1, (C3365e) aVar);
                    }
                    i++;
                }
            }
            bVar.mo39554a(2, this.f4424c);
            bVar.mo39565b(3, this.f4425d);
            bVar.mo39555a(4, this.f4426e);
            bVar.mo39555a(5, this.f4427f);
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c();
            C3928a[] aVarArr = this.f4423b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3928a[] aVarArr2 = this.f4423b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3928a aVar = aVarArr2[i];
                    if (aVar != null) {
                        c += C3157b.m2105b(1, (C3365e) aVar);
                    }
                    i++;
                }
            }
            return c + C3157b.m2106b(2, this.f4424c) + C3157b.m2119e(3, this.f4425d) + C3157b.m2107b(4, this.f4426e) + C3157b.m2107b(5, this.f4427f);
        }

        /* renamed from: b */
        public C3927a mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    int b = C3442g.m3333b(aVar, 10);
                    C3928a[] aVarArr = this.f4423b;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    C3928a[] aVarArr2 = new C3928a[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4423b, 0, aVarArr2, 0, length);
                    }
                    while (length < aVarArr2.length - 1) {
                        aVarArr2[length] = new C3928a();
                        aVar.mo39418a((C3365e) aVarArr2[length]);
                        aVar.mo39416a();
                        length++;
                    }
                    aVarArr2[length] = new C3928a();
                    aVar.mo39418a((C3365e) aVarArr2[length]);
                    this.f4423b = aVarArr2;
                } else if (a == 18) {
                    this.f4424c = aVar.mo39432i();
                } else if (a == 24) {
                    this.f4425d = aVar.mo39426f();
                } else if (a == 32) {
                    this.f4426e = aVar.mo39431h();
                } else if (a == 40) {
                    this.f4427f = aVar.mo39431h();
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public static C3927a m4931a(byte[] bArr) throws C3318d {
            return (C3927a) C3365e.m3062a(new C3927a(), bArr);
        }
    }
}
