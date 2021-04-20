package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.rp */
public interface C3922rp {

    /* renamed from: com.yandex.metrica.impl.ob.rp$a */
    public static final class C3923a extends C3365e {

        /* renamed from: b */
        public C3924a[] f4411b;

        /* renamed from: c */
        public String[] f4412c;

        /* renamed from: com.yandex.metrica.impl.ob.rp$a$a */
        public static final class C3924a extends C3365e {

            /* renamed from: h */
            private static volatile C3924a[] f4413h;

            /* renamed from: b */
            public String f4414b;

            /* renamed from: c */
            public String f4415c;

            /* renamed from: d */
            public String f4416d;

            /* renamed from: e */
            public C3925a[] f4417e;

            /* renamed from: f */
            public long f4418f;

            /* renamed from: g */
            public int[] f4419g;

            /* renamed from: com.yandex.metrica.impl.ob.rp$a$a$a */
            public static final class C3925a extends C3365e {

                /* renamed from: d */
                private static volatile C3925a[] f4420d;

                /* renamed from: b */
                public String f4421b;

                /* renamed from: c */
                public String f4422c;

                /* renamed from: d */
                public static C3925a[] m4925d() {
                    if (f4420d == null) {
                        synchronized (C3246c.f2825a) {
                            if (f4420d == null) {
                                f4420d = new C3925a[0];
                            }
                        }
                    }
                    return f4420d;
                }

                public C3925a() {
                    mo41060e();
                }

                /* renamed from: e */
                public C3925a mo41060e() {
                    this.f4421b = "";
                    this.f4422c = "";
                    this.f3093a = -1;
                    return this;
                }

                /* renamed from: a */
                public void mo39942a(C3157b bVar) throws IOException {
                    bVar.mo39554a(1, this.f4421b);
                    bVar.mo39554a(2, this.f4422c);
                    super.mo39942a(bVar);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public int mo39944c() {
                    return super.mo39944c() + C3157b.m2106b(1, this.f4421b) + C3157b.m2106b(2, this.f4422c);
                }

                /* renamed from: b */
                public C3925a mo39941a(C3115a aVar) throws IOException {
                    while (true) {
                        int a = aVar.mo39416a();
                        if (a == 0) {
                            return this;
                        }
                        if (a == 10) {
                            this.f4421b = aVar.mo39432i();
                        } else if (a == 18) {
                            this.f4422c = aVar.mo39432i();
                        } else if (!C3442g.m3331a(aVar, a)) {
                            return this;
                        }
                    }
                }
            }

            /* renamed from: d */
            public static C3924a[] m4919d() {
                if (f4413h == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4413h == null) {
                            f4413h = new C3924a[0];
                        }
                    }
                }
                return f4413h;
            }

            public C3924a() {
                mo41058e();
            }

            /* renamed from: e */
            public C3924a mo41058e() {
                this.f4414b = "";
                this.f4415c = "";
                this.f4416d = "";
                this.f4417e = C3925a.m4925d();
                this.f4418f = 0;
                this.f4419g = C3442g.f3273a;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39554a(1, this.f4414b);
                bVar.mo39554a(2, this.f4415c);
                bVar.mo39554a(3, this.f4416d);
                C3925a[] aVarArr = this.f4417e;
                int i = 0;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        C3925a[] aVarArr2 = this.f4417e;
                        if (i2 >= aVarArr2.length) {
                            break;
                        }
                        C3925a aVar = aVarArr2[i2];
                        if (aVar != null) {
                            bVar.mo39553a(4, (C3365e) aVar);
                        }
                        i2++;
                    }
                }
                bVar.mo39552a(5, this.f4418f);
                int[] iArr = this.f4419g;
                if (iArr != null && iArr.length > 0) {
                    while (true) {
                        int[] iArr2 = this.f4419g;
                        if (i >= iArr2.length) {
                            break;
                        }
                        bVar.mo39551a(6, iArr2[i]);
                        i++;
                    }
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c() + C3157b.m2106b(1, this.f4414b) + C3157b.m2106b(2, this.f4415c) + C3157b.m2106b(3, this.f4416d);
                C3925a[] aVarArr = this.f4417e;
                int i = 0;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i2 = c;
                    int i3 = 0;
                    while (true) {
                        C3925a[] aVarArr2 = this.f4417e;
                        if (i3 >= aVarArr2.length) {
                            break;
                        }
                        C3925a aVar = aVarArr2[i3];
                        if (aVar != null) {
                            i2 += C3157b.m2105b(4, (C3365e) aVar);
                        }
                        i3++;
                    }
                    c = i2;
                }
                int d = c + C3157b.m2115d(5, this.f4418f);
                int[] iArr = this.f4419g;
                if (iArr == null || iArr.length <= 0) {
                    return d;
                }
                int i4 = 0;
                while (true) {
                    int[] iArr2 = this.f4419g;
                    if (i >= iArr2.length) {
                        return d + i4 + (iArr2.length * 1);
                    }
                    i4 += C3157b.m2113d(iArr2[i]);
                    i++;
                }
            }

            /* renamed from: b */
            public C3924a mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        this.f4414b = aVar.mo39432i();
                    } else if (a == 18) {
                        this.f4415c = aVar.mo39432i();
                    } else if (a == 26) {
                        this.f4416d = aVar.mo39432i();
                    } else if (a == 34) {
                        int b = C3442g.m3333b(aVar, 34);
                        C3925a[] aVarArr = this.f4417e;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        C3925a[] aVarArr2 = new C3925a[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f4417e, 0, aVarArr2, 0, length);
                        }
                        while (length < aVarArr2.length - 1) {
                            aVarArr2[length] = new C3925a();
                            aVar.mo39418a((C3365e) aVarArr2[length]);
                            aVar.mo39416a();
                            length++;
                        }
                        aVarArr2[length] = new C3925a();
                        aVar.mo39418a((C3365e) aVarArr2[length]);
                        this.f4417e = aVarArr2;
                    } else if (a == 40) {
                        this.f4418f = aVar.mo39424e();
                    } else if (a == 48) {
                        int b2 = C3442g.m3333b(aVar, 48);
                        int[] iArr = new int[b2];
                        int i = 0;
                        for (int i2 = 0; i2 < b2; i2++) {
                            if (i2 != 0) {
                                aVar.mo39416a();
                            }
                            int g = aVar.mo39428g();
                            if (g == 1 || g == 2) {
                                iArr[i] = g;
                                i++;
                            }
                        }
                        if (i != 0) {
                            int[] iArr2 = this.f4419g;
                            int length2 = iArr2 == null ? 0 : iArr2.length;
                            if (length2 == 0 && i == iArr.length) {
                                this.f4419g = iArr;
                            } else {
                                int[] iArr3 = new int[(length2 + i)];
                                if (length2 != 0) {
                                    System.arraycopy(this.f4419g, 0, iArr3, 0, length2);
                                }
                                System.arraycopy(iArr, 0, iArr3, length2, i);
                                this.f4419g = iArr3;
                            }
                        }
                    } else if (a == 50) {
                        int d = aVar.mo39423d(aVar.mo39437n());
                        int t = aVar.mo39443t();
                        int i3 = 0;
                        while (aVar.mo39441r() > 0) {
                            int g2 = aVar.mo39428g();
                            if (g2 == 1 || g2 == 2) {
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            aVar.mo39427f(t);
                            int[] iArr4 = this.f4419g;
                            int length3 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[(i3 + length3)];
                            if (length3 != 0) {
                                System.arraycopy(this.f4419g, 0, iArr5, 0, length3);
                            }
                            while (aVar.mo39441r() > 0) {
                                int g3 = aVar.mo39428g();
                                if (g3 == 1 || g3 == 2) {
                                    iArr5[length3] = g3;
                                    length3++;
                                }
                            }
                            this.f4419g = iArr5;
                        }
                        aVar.mo39425e(d);
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        public C3923a() {
            mo41056d();
        }

        /* renamed from: d */
        public C3923a mo41056d() {
            this.f4411b = C3924a.m4919d();
            this.f4412c = C3442g.f3278f;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            C3924a[] aVarArr = this.f4411b;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = 0;
                while (true) {
                    C3924a[] aVarArr2 = this.f4411b;
                    if (i2 >= aVarArr2.length) {
                        break;
                    }
                    C3924a aVar = aVarArr2[i2];
                    if (aVar != null) {
                        bVar.mo39553a(1, (C3365e) aVar);
                    }
                    i2++;
                }
            }
            String[] strArr = this.f4412c;
            if (strArr != null && strArr.length > 0) {
                while (true) {
                    String[] strArr2 = this.f4412c;
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
            int c = super.mo39944c();
            C3924a[] aVarArr = this.f4411b;
            int i = 0;
            if (aVarArr != null && aVarArr.length > 0) {
                int i2 = c;
                int i3 = 0;
                while (true) {
                    C3924a[] aVarArr2 = this.f4411b;
                    if (i3 >= aVarArr2.length) {
                        break;
                    }
                    C3924a aVar = aVarArr2[i3];
                    if (aVar != null) {
                        i2 += C3157b.m2105b(1, (C3365e) aVar);
                    }
                    i3++;
                }
                c = i2;
            }
            String[] strArr = this.f4412c;
            if (strArr == null || strArr.length <= 0) {
                return c;
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr2 = this.f4412c;
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
        public C3923a mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    int b = C3442g.m3333b(aVar, 10);
                    C3924a[] aVarArr = this.f4411b;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    C3924a[] aVarArr2 = new C3924a[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4411b, 0, aVarArr2, 0, length);
                    }
                    while (length < aVarArr2.length - 1) {
                        aVarArr2[length] = new C3924a();
                        aVar.mo39418a((C3365e) aVarArr2[length]);
                        aVar.mo39416a();
                        length++;
                    }
                    aVarArr2[length] = new C3924a();
                    aVar.mo39418a((C3365e) aVarArr2[length]);
                    this.f4411b = aVarArr2;
                } else if (a == 18) {
                    int b2 = C3442g.m3333b(aVar, 18);
                    String[] strArr = this.f4412c;
                    int length2 = strArr == null ? 0 : strArr.length;
                    String[] strArr2 = new String[(b2 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f4412c, 0, strArr2, 0, length2);
                    }
                    while (length2 < strArr2.length - 1) {
                        strArr2[length2] = aVar.mo39432i();
                        aVar.mo39416a();
                        length2++;
                    }
                    strArr2[length2] = aVar.mo39432i();
                    this.f4412c = strArr2;
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public static C3923a m4913a(byte[] bArr) throws C3318d {
            return (C3923a) C3365e.m3062a(new C3923a(), bArr);
        }
    }
}
