package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.rm */
public interface C3913rm {

    /* renamed from: com.yandex.metrica.impl.ob.rm$a */
    public static final class C3914a extends C3365e {

        /* renamed from: b */
        public C3916b[] f4395b;

        /* renamed from: c */
        public C3915a f4396c;

        /* renamed from: d */
        public String[] f4397d;

        /* renamed from: com.yandex.metrica.impl.ob.rm$a$b */
        public static final class C3916b extends C3365e {

            /* renamed from: d */
            private static volatile C3916b[] f4400d;

            /* renamed from: b */
            public String f4401b;

            /* renamed from: c */
            public boolean f4402c;

            /* renamed from: d */
            public static C3916b[] m4889d() {
                if (f4400d == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4400d == null) {
                            f4400d = new C3916b[0];
                        }
                    }
                }
                return f4400d;
            }

            public C3916b() {
                mo41048e();
            }

            /* renamed from: e */
            public C3916b mo41048e() {
                this.f4401b = "";
                this.f4402c = false;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39554a(1, this.f4401b);
                bVar.mo39555a(2, this.f4402c);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2106b(1, this.f4401b) + C3157b.m2107b(2, this.f4402c);
            }

            /* renamed from: b */
            public C3916b mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        this.f4401b = aVar.mo39432i();
                    } else if (a == 16) {
                        this.f4402c = aVar.mo39431h();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rm$a$a */
        public static final class C3915a extends C3365e {

            /* renamed from: b */
            public int f4398b;

            /* renamed from: c */
            public int f4399c;

            public C3915a() {
                mo41046d();
            }

            /* renamed from: d */
            public C3915a mo41046d() {
                this.f4398b = 0;
                this.f4399c = -1;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39551a(2, this.f4398b);
                bVar.mo39551a(3, this.f4399c);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2114d(2, this.f4398b) + C3157b.m2114d(3, this.f4399c);
            }

            /* renamed from: b */
            public C3915a mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 16) {
                        int g = aVar.mo39428g();
                        if (g == 0 || g == 1 || g == 2 || g == 3 || g == 4) {
                            this.f4398b = g;
                        }
                    } else if (a == 24) {
                        int g2 = aVar.mo39428g();
                        if (g2 == -1 || g2 == 0 || g2 == 1) {
                            this.f4399c = g2;
                        }
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        public C3914a() {
            mo41044d();
        }

        /* renamed from: d */
        public C3914a mo41044d() {
            this.f4395b = C3916b.m4889d();
            this.f4396c = null;
            this.f4397d = C3442g.f3278f;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            C3916b[] bVarArr = this.f4395b;
            int i = 0;
            if (bVarArr != null && bVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C3916b[] bVarArr2 = this.f4395b;
                    if (i2 >= bVarArr2.length) {
                        break;
                    }
                    C3916b bVar2 = bVarArr2[i2];
                    if (bVar2 != null) {
                        bVar.mo39553a(1, (C3365e) bVar2);
                    }
                    i2++;
                }
            }
            C3915a aVar = this.f4396c;
            if (aVar != null) {
                bVar.mo39553a(2, (C3365e) aVar);
            }
            String[] strArr = this.f4397d;
            if (strArr != null && strArr.length > 0) {
                while (true) {
                    String[] strArr2 = this.f4397d;
                    if (i >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i];
                    if (str != null) {
                        bVar.mo39554a(3, str);
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
            C3916b[] bVarArr = this.f4395b;
            int i = 0;
            if (bVarArr != null && bVarArr.length > 0) {
                int i2 = c;
                int i3 = 0;
                while (true) {
                    C3916b[] bVarArr2 = this.f4395b;
                    if (i3 >= bVarArr2.length) {
                        break;
                    }
                    C3916b bVar = bVarArr2[i3];
                    if (bVar != null) {
                        i2 += C3157b.m2105b(1, (C3365e) bVar);
                    }
                    i3++;
                }
                c = i2;
            }
            C3915a aVar = this.f4396c;
            if (aVar != null) {
                c += C3157b.m2105b(2, (C3365e) aVar);
            }
            String[] strArr = this.f4397d;
            if (strArr == null || strArr.length <= 0) {
                return c;
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f4397d;
                if (i >= strArr2.length) {
                    return c + i4 + (i5 * 1);
                }
                String str = strArr2[i];
                if (str != null) {
                    i5++;
                    i4 += C3157b.m2110b(str);
                }
                i++;
            }
        }

        /* renamed from: b */
        public C3914a mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    int b = C3442g.m3333b(aVar, 10);
                    C3916b[] bVarArr = this.f4395b;
                    int length = bVarArr == null ? 0 : bVarArr.length;
                    C3916b[] bVarArr2 = new C3916b[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4395b, 0, bVarArr2, 0, length);
                    }
                    while (length < bVarArr2.length - 1) {
                        bVarArr2[length] = new C3916b();
                        aVar.mo39418a((C3365e) bVarArr2[length]);
                        aVar.mo39416a();
                        length++;
                    }
                    bVarArr2[length] = new C3916b();
                    aVar.mo39418a((C3365e) bVarArr2[length]);
                    this.f4395b = bVarArr2;
                } else if (a == 18) {
                    if (this.f4396c == null) {
                        this.f4396c = new C3915a();
                    }
                    aVar.mo39418a((C3365e) this.f4396c);
                } else if (a == 26) {
                    int b2 = C3442g.m3333b(aVar, 26);
                    String[] strArr = this.f4397d;
                    int length2 = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(b2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f4397d, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = aVar.mo39432i();
                        aVar.mo39416a();
                        length2++;
                    }
                    strArr2[length2] = aVar.mo39432i();
                    this.f4397d = strArr2;
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public static C3914a m4878a(byte[] bArr) throws C3318d {
            return (C3914a) C3365e.m3062a(new C3914a(), bArr);
        }
    }
}
