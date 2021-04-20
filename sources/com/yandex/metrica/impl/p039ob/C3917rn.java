package com.yandex.metrica.impl.p039ob;

import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.rn */
public interface C3917rn {

    /* renamed from: com.yandex.metrica.impl.ob.rn$a */
    public static final class C3918a extends C3365e {

        /* renamed from: b */
        public boolean f4403b;

        /* renamed from: c */
        public int f4404c;

        /* renamed from: d */
        public int f4405d;

        /* renamed from: e */
        public int[] f4406e;

        public C3918a() {
            mo41050d();
        }

        /* renamed from: d */
        public C3918a mo41050d() {
            this.f4403b = false;
            this.f4404c = 0;
            this.f4405d = 0;
            this.f4406e = C3442g.f3273a;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            bVar.mo39555a(1, this.f4403b);
            bVar.mo39564b(2, this.f4404c);
            bVar.mo39564b(3, this.f4405d);
            int[] iArr = this.f4406e;
            if (iArr != null && iArr.length > 0) {
                int i = 0;
                while (true) {
                    int[] iArr2 = this.f4406e;
                    if (i >= iArr2.length) {
                        break;
                    }
                    bVar.mo39551a(4, iArr2[i]);
                    i++;
                }
            }
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c() + C3157b.m2107b(1, this.f4403b) + C3157b.m2118e(2, this.f4404c) + C3157b.m2118e(3, this.f4405d);
            int[] iArr = this.f4406e;
            if (iArr == null || iArr.length <= 0) {
                return c;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f4406e;
                if (i >= iArr2.length) {
                    return c + i2 + (iArr2.length * 1);
                }
                i2 += C3157b.m2113d(iArr2[i]);
                i++;
            }
        }

        /* renamed from: b */
        public C3918a mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                if (a == 0) {
                    return this;
                }
                if (a == 8) {
                    this.f4403b = aVar.mo39431h();
                } else if (a == 16) {
                    this.f4404c = aVar.mo39434k();
                } else if (a == 24) {
                    this.f4405d = aVar.mo39434k();
                } else if (a == 32) {
                    int b = C3442g.m3333b(aVar, 32);
                    int[] iArr = this.f4406e;
                    int length = iArr == null ? 0 : iArr.length;
                    int[] iArr2 = new int[(b + length)];
                    if (length != 0) {
                        System.arraycopy(this.f4406e, 0, iArr2, 0, length);
                    }
                    while (length < iArr2.length - 1) {
                        iArr2[length] = aVar.mo39428g();
                        aVar.mo39416a();
                        length++;
                    }
                    iArr2[length] = aVar.mo39428g();
                    this.f4406e = iArr2;
                } else if (a == 34) {
                    int d = aVar.mo39423d(aVar.mo39437n());
                    int t = aVar.mo39443t();
                    int i = 0;
                    while (aVar.mo39441r() > 0) {
                        aVar.mo39428g();
                        i++;
                    }
                    aVar.mo39427f(t);
                    int[] iArr3 = this.f4406e;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int[] iArr4 = new int[(i + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.f4406e, 0, iArr4, 0, length2);
                    }
                    while (length2 < iArr4.length) {
                        iArr4[length2] = aVar.mo39428g();
                        length2++;
                    }
                    this.f4406e = iArr4;
                    aVar.mo39425e(d);
                } else if (!C3442g.m3331a(aVar, a)) {
                    return this;
                }
            }
        }

        /* renamed from: a */
        public static C3918a m4895a(byte[] bArr) throws C3318d {
            return (C3918a) C3365e.m3062a(new C3918a(), bArr);
        }
    }
}
