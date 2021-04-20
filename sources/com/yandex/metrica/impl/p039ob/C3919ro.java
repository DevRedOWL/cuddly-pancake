package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.ro */
public interface C3919ro {

    /* renamed from: com.yandex.metrica.impl.ob.ro$a */
    public static final class C3920a extends C3365e {

        /* renamed from: b */
        public C3921a[] f4407b;

        /* renamed from: com.yandex.metrica.impl.ob.ro$a$a */
        public static final class C3921a extends C3365e {

            /* renamed from: d */
            private static volatile C3921a[] f4408d;

            /* renamed from: b */
            public String f4409b;

            /* renamed from: c */
            public boolean f4410c;

            /* renamed from: d */
            public static C3921a[] m4907d() {
                if (f4408d == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4408d == null) {
                            f4408d = new C3921a[0];
                        }
                    }
                }
                return f4408d;
            }

            public C3921a() {
                mo41054e();
            }

            /* renamed from: e */
            public C3921a mo41054e() {
                this.f4409b = "";
                this.f4410c = false;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39554a(1, this.f4409b);
                bVar.mo39555a(2, this.f4410c);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2106b(1, this.f4409b) + C3157b.m2107b(2, this.f4410c);
            }

            /* renamed from: b */
            public C3921a mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        this.f4409b = aVar.mo39432i();
                    } else if (a == 16) {
                        this.f4410c = aVar.mo39431h();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        public C3920a() {
            mo41052d();
        }

        /* renamed from: d */
        public C3920a mo41052d() {
            this.f4407b = C3921a.m4907d();
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            C3921a[] aVarArr = this.f4407b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3921a[] aVarArr2 = this.f4407b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3921a aVar = aVarArr2[i];
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
            C3921a[] aVarArr = this.f4407b;
            if (aVarArr != null && aVarArr.length > 0) {
                int i = 0;
                while (true) {
                    C3921a[] aVarArr2 = this.f4407b;
                    if (i >= aVarArr2.length) {
                        break;
                    }
                    C3921a aVar = aVarArr2[i];
                    if (aVar != null) {
                        c += C3157b.m2105b(1, (C3365e) aVar);
                    }
                    i++;
                }
            }
            return c;
        }

        /* renamed from: b */
        public C3920a mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 10) {
                    int b = C3442g.m3333b(aVar, 10);
                    C3921a[] aVarArr = this.f4407b;
                    int length = aVarArr == null ? 0 : aVarArr.length;
                    C3921a[] aVarArr2 = new C3921a[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4407b, 0, aVarArr2, 0, length);
                    }
                    while (length < aVarArr2.length - 1) {
                        aVarArr2[length] = new C3921a();
                        aVar.mo39418a((C3365e) aVarArr2[length]);
                        aVar.mo39416a();
                        length++;
                    }
                    aVarArr2[length] = new C3921a();
                    aVar.mo39418a((C3365e) aVarArr2[length]);
                    this.f4407b = aVarArr2;
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public static C3920a m4901a(byte[] bArr) throws C3318d {
            return (C3920a) C3365e.m3062a(new C3920a(), bArr);
        }
    }
}
