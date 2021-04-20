package com.yandex.metrica.impl.p039ob;

import androidx.work.WorkRequest;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import java.io.IOException;
import java.util.Arrays;
import org.apache.commons.lang3.time.DateUtils;
import org.jetbrains.anko.DimensionsKt;

/* renamed from: com.yandex.metrica.impl.ob.rr */
public interface C3929rr {

    /* renamed from: com.yandex.metrica.impl.ob.rr$a */
    public static final class C3930a extends C3365e {

        /* renamed from: A */
        public String f4431A;

        /* renamed from: B */
        public String f4432B;

        /* renamed from: C */
        public long f4433C;

        /* renamed from: D */
        public long f4434D;

        /* renamed from: E */
        public boolean f4435E;

        /* renamed from: F */
        public C3943g f4436F;

        /* renamed from: G */
        public C3940d f4437G;

        /* renamed from: H */
        public C3933b f4438H;

        /* renamed from: b */
        public String f4439b;

        /* renamed from: c */
        public long f4440c;

        /* renamed from: d */
        public String[] f4441d;

        /* renamed from: e */
        public String f4442e;

        /* renamed from: f */
        public String f4443f;

        /* renamed from: g */
        public String[] f4444g;

        /* renamed from: h */
        public String[] f4445h;

        /* renamed from: i */
        public String[] f4446i;

        /* renamed from: j */
        public C3939c f4447j;

        /* renamed from: k */
        public C3941e f4448k;

        /* renamed from: l */
        public C3931a f4449l;

        /* renamed from: m */
        public C3947j f4450m;

        /* renamed from: n */
        public C3944h[] f4451n;

        /* renamed from: o */
        public String f4452o;

        /* renamed from: p */
        public String f4453p;

        /* renamed from: q */
        public boolean f4454q;

        /* renamed from: r */
        public String f4455r;

        /* renamed from: s */
        public String f4456s;

        /* renamed from: t */
        public String[] f4457t;

        /* renamed from: u */
        public C3948k f4458u;

        /* renamed from: v */
        public boolean f4459v;

        /* renamed from: w */
        public C3942f[] f4460w;

        /* renamed from: x */
        public C3946i f4461x;

        /* renamed from: y */
        public String f4462y;

        /* renamed from: z */
        public String f4463z;

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$c */
        public static final class C3939c extends C3365e {

            /* renamed from: b */
            public boolean f4495b;

            /* renamed from: c */
            public boolean f4496c;

            /* renamed from: d */
            public boolean f4497d;

            /* renamed from: e */
            public boolean f4498e;

            /* renamed from: f */
            public boolean f4499f;

            /* renamed from: g */
            public boolean f4500g;

            /* renamed from: h */
            public boolean f4501h;

            /* renamed from: i */
            public boolean f4502i;

            /* renamed from: j */
            public boolean f4503j;

            /* renamed from: k */
            public boolean f4504k;

            /* renamed from: l */
            public boolean f4505l;

            /* renamed from: m */
            public boolean f4506m;

            /* renamed from: n */
            public boolean f4507n;

            /* renamed from: o */
            public boolean f4508o;

            /* renamed from: p */
            public boolean f4509p;

            /* renamed from: q */
            public boolean f4510q;

            public C3939c() {
                mo41084d();
            }

            /* renamed from: d */
            public C3939c mo41084d() {
                this.f4495b = false;
                this.f4496c = false;
                this.f4497d = false;
                this.f4498e = false;
                this.f4499f = false;
                this.f4500g = false;
                this.f4501h = false;
                this.f4502i = false;
                this.f4503j = false;
                this.f4504k = false;
                this.f4505l = false;
                this.f4506m = false;
                this.f4507n = false;
                this.f4508o = false;
                this.f4509p = true;
                this.f4510q = false;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39555a(1, this.f4495b);
                bVar.mo39555a(2, this.f4496c);
                bVar.mo39555a(3, this.f4497d);
                bVar.mo39555a(4, this.f4498e);
                bVar.mo39555a(5, this.f4499f);
                bVar.mo39555a(6, this.f4500g);
                bVar.mo39555a(8, this.f4501h);
                bVar.mo39555a(9, this.f4502i);
                bVar.mo39555a(10, this.f4503j);
                bVar.mo39555a(11, this.f4504k);
                bVar.mo39555a(12, this.f4505l);
                bVar.mo39555a(13, this.f4506m);
                bVar.mo39555a(14, this.f4507n);
                bVar.mo39555a(15, this.f4508o);
                bVar.mo39555a(16, this.f4509p);
                bVar.mo39555a(17, this.f4510q);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2107b(1, this.f4495b) + C3157b.m2107b(2, this.f4496c) + C3157b.m2107b(3, this.f4497d) + C3157b.m2107b(4, this.f4498e) + C3157b.m2107b(5, this.f4499f) + C3157b.m2107b(6, this.f4500g) + C3157b.m2107b(8, this.f4501h) + C3157b.m2107b(9, this.f4502i) + C3157b.m2107b(10, this.f4503j) + C3157b.m2107b(11, this.f4504k) + C3157b.m2107b(12, this.f4505l) + C3157b.m2107b(13, this.f4506m) + C3157b.m2107b(14, this.f4507n) + C3157b.m2107b(15, this.f4508o) + C3157b.m2107b(16, this.f4509p) + C3157b.m2107b(17, this.f4510q);
            }

            /* renamed from: b */
            public C3939c mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    switch (a) {
                        case 0:
                            return this;
                        case 8:
                            this.f4495b = aVar.mo39431h();
                            break;
                        case 16:
                            this.f4496c = aVar.mo39431h();
                            break;
                        case 24:
                            this.f4497d = aVar.mo39431h();
                            break;
                        case 32:
                            this.f4498e = aVar.mo39431h();
                            break;
                        case 40:
                            this.f4499f = aVar.mo39431h();
                            break;
                        case 48:
                            this.f4500g = aVar.mo39431h();
                            break;
                        case 64:
                            this.f4501h = aVar.mo39431h();
                            break;
                        case 72:
                            this.f4502i = aVar.mo39431h();
                            break;
                        case 80:
                            this.f4503j = aVar.mo39431h();
                            break;
                        case 88:
                            this.f4504k = aVar.mo39431h();
                            break;
                        case 96:
                            this.f4505l = aVar.mo39431h();
                            break;
                        case 104:
                            this.f4506m = aVar.mo39431h();
                            break;
                        case 112:
                            this.f4507n = aVar.mo39431h();
                            break;
                        case 120:
                            this.f4508o = aVar.mo39431h();
                            break;
                        case 128:
                            this.f4509p = aVar.mo39431h();
                            break;
                        case 136:
                            this.f4510q = aVar.mo39431h();
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

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$e */
        public static final class C3941e extends C3365e {

            /* renamed from: b */
            public long f4512b;

            /* renamed from: c */
            public float f4513c;

            /* renamed from: d */
            public int f4514d;

            /* renamed from: e */
            public int f4515e;

            /* renamed from: f */
            public long f4516f;

            /* renamed from: g */
            public int f4517g;

            /* renamed from: h */
            public boolean f4518h;

            /* renamed from: i */
            public boolean f4519i;

            /* renamed from: j */
            public long f4520j;

            public C3941e() {
                mo41088d();
            }

            /* renamed from: d */
            public C3941e mo41088d() {
                this.f4512b = 5000;
                this.f4513c = 10.0f;
                this.f4514d = 20;
                this.f4515e = 200;
                this.f4516f = DateUtils.MILLIS_PER_MINUTE;
                this.f4517g = 10000;
                this.f4518h = false;
                this.f4519i = false;
                this.f4520j = DateUtils.MILLIS_PER_MINUTE;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39565b(1, this.f4512b);
                bVar.mo39550a(2, this.f4513c);
                bVar.mo39551a(3, this.f4514d);
                bVar.mo39551a(4, this.f4515e);
                bVar.mo39565b(5, this.f4516f);
                bVar.mo39551a(6, this.f4517g);
                bVar.mo39555a(7, this.f4518h);
                bVar.mo39555a(8, this.f4519i);
                bVar.mo39565b(9, this.f4520j);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2119e(1, this.f4512b) + C3157b.m2104b(2, this.f4513c) + C3157b.m2114d(3, this.f4514d) + C3157b.m2114d(4, this.f4515e) + C3157b.m2119e(5, this.f4516f) + C3157b.m2114d(6, this.f4517g) + C3157b.m2107b(7, this.f4518h) + C3157b.m2107b(8, this.f4519i) + C3157b.m2119e(9, this.f4520j);
            }

            /* renamed from: b */
            public C3941e mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4512b = aVar.mo39426f();
                    } else if (a == 21) {
                        this.f4513c = aVar.mo39422d();
                    } else if (a == 24) {
                        this.f4514d = aVar.mo39428g();
                    } else if (a == 32) {
                        this.f4515e = aVar.mo39428g();
                    } else if (a == 40) {
                        this.f4516f = aVar.mo39426f();
                    } else if (a == 48) {
                        this.f4517g = aVar.mo39428g();
                    } else if (a == 56) {
                        this.f4518h = aVar.mo39431h();
                    } else if (a == 64) {
                        this.f4519i = aVar.mo39431h();
                    } else if (a == 72) {
                        this.f4520j = aVar.mo39426f();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$a */
        public static final class C3931a extends C3365e {

            /* renamed from: b */
            public C3941e f4464b;

            /* renamed from: c */
            public long f4465c;

            /* renamed from: d */
            public long f4466d;

            /* renamed from: e */
            public boolean f4467e;

            /* renamed from: f */
            public C3932a[] f4468f;

            /* renamed from: com.yandex.metrica.impl.ob.rr$a$a$a */
            public static final class C3932a extends C3365e {

                /* renamed from: d */
                private static volatile C3932a[] f4469d;

                /* renamed from: b */
                public long f4470b;

                /* renamed from: c */
                public long f4471c;

                /* renamed from: d */
                public static C3932a[] m4954d() {
                    if (f4469d == null) {
                        synchronized (C3246c.f2825a) {
                            if (f4469d == null) {
                                f4469d = new C3932a[0];
                            }
                        }
                    }
                    return f4469d;
                }

                public C3932a() {
                    mo41070e();
                }

                /* renamed from: e */
                public C3932a mo41070e() {
                    this.f4470b = 0;
                    this.f4471c = 0;
                    this.f3093a = -1;
                    return this;
                }

                /* renamed from: a */
                public void mo39942a(C3157b bVar) throws IOException {
                    bVar.mo39565b(1, this.f4470b);
                    bVar.mo39565b(2, this.f4471c);
                    super.mo39942a(bVar);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public int mo39944c() {
                    return super.mo39944c() + C3157b.m2119e(1, this.f4470b) + C3157b.m2119e(2, this.f4471c);
                }

                /* renamed from: b */
                public C3932a mo39941a(C3115a aVar) throws IOException {
                    while (true) {
                        int a = aVar.mo39416a();
                        if (a == 0) {
                            return this;
                        }
                        if (a == 8) {
                            this.f4470b = aVar.mo39426f();
                        } else if (a == 16) {
                            this.f4471c = aVar.mo39426f();
                        } else if (!C3442g.m3331a(aVar, a)) {
                            return this;
                        }
                    }
                }
            }

            public C3931a() {
                mo41068d();
            }

            /* renamed from: d */
            public C3931a mo41068d() {
                this.f4464b = null;
                this.f4465c = DateUtils.MILLIS_PER_MINUTE;
                this.f4466d = DateUtils.MILLIS_PER_HOUR;
                this.f4467e = false;
                this.f4468f = C3932a.m4954d();
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                C3941e eVar = this.f4464b;
                if (eVar != null) {
                    bVar.mo39553a(1, (C3365e) eVar);
                }
                bVar.mo39565b(2, this.f4465c);
                bVar.mo39565b(3, this.f4466d);
                bVar.mo39555a(4, this.f4467e);
                C3932a[] aVarArr = this.f4468f;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        C3932a[] aVarArr2 = this.f4468f;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        C3932a aVar = aVarArr2[i];
                        if (aVar != null) {
                            bVar.mo39553a(5, (C3365e) aVar);
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
                C3941e eVar = this.f4464b;
                if (eVar != null) {
                    c += C3157b.m2105b(1, (C3365e) eVar);
                }
                int e = c + C3157b.m2119e(2, this.f4465c) + C3157b.m2119e(3, this.f4466d) + C3157b.m2107b(4, this.f4467e);
                C3932a[] aVarArr = this.f4468f;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        C3932a[] aVarArr2 = this.f4468f;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        C3932a aVar = aVarArr2[i];
                        if (aVar != null) {
                            e += C3157b.m2105b(5, (C3365e) aVar);
                        }
                        i++;
                    }
                }
                return e;
            }

            /* renamed from: b */
            public C3931a mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        if (this.f4464b == null) {
                            this.f4464b = new C3941e();
                        }
                        aVar.mo39418a((C3365e) this.f4464b);
                    } else if (a == 16) {
                        this.f4465c = aVar.mo39426f();
                    } else if (a == 24) {
                        this.f4466d = aVar.mo39426f();
                    } else if (a == 32) {
                        this.f4467e = aVar.mo39431h();
                    } else if (a == 42) {
                        int b = C3442g.m3333b(aVar, 42);
                        C3932a[] aVarArr = this.f4468f;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        C3932a[] aVarArr2 = new C3932a[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f4468f, 0, aVarArr2, 0, length);
                        }
                        while (length < aVarArr2.length - 1) {
                            aVarArr2[length] = new C3932a();
                            aVar.mo39418a((C3365e) aVarArr2[length]);
                            aVar.mo39416a();
                            length++;
                        }
                        aVarArr2[length] = new C3932a();
                        aVar.mo39418a((C3365e) aVarArr2[length]);
                        this.f4468f = aVarArr2;
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$j */
        public static final class C3947j extends C3365e {

            /* renamed from: b */
            public long f4540b;

            /* renamed from: c */
            public String f4541c;

            /* renamed from: d */
            public int[] f4542d;

            /* renamed from: e */
            public long f4543e;

            /* renamed from: f */
            public int f4544f;

            public C3947j() {
                mo41100d();
            }

            /* renamed from: d */
            public C3947j mo41100d() {
                this.f4540b = 0;
                this.f4541c = "";
                this.f4542d = C3442g.f3273a;
                this.f4543e = 259200;
                this.f4544f = 10;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39565b(1, this.f4540b);
                bVar.mo39554a(2, this.f4541c);
                int[] iArr = this.f4542d;
                if (iArr != null && iArr.length > 0) {
                    int i = 0;
                    while (true) {
                        int[] iArr2 = this.f4542d;
                        if (i >= iArr2.length) {
                            break;
                        }
                        bVar.mo39551a(3, iArr2[i]);
                        i++;
                    }
                }
                bVar.mo39565b(4, this.f4543e);
                bVar.mo39551a(5, this.f4544f);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int[] iArr;
                int c = super.mo39944c() + C3157b.m2119e(1, this.f4540b) + C3157b.m2106b(2, this.f4541c);
                int[] iArr2 = this.f4542d;
                if (iArr2 != null && iArr2.length > 0) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        iArr = this.f4542d;
                        if (i >= iArr.length) {
                            break;
                        }
                        i2 += C3157b.m2113d(iArr[i]);
                        i++;
                    }
                    c = c + i2 + (iArr.length * 1);
                }
                return c + C3157b.m2119e(4, this.f4543e) + C3157b.m2114d(5, this.f4544f);
            }

            /* renamed from: b */
            public C3947j mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4540b = aVar.mo39426f();
                    } else if (a == 18) {
                        this.f4541c = aVar.mo39432i();
                    } else if (a == 24) {
                        int b = C3442g.m3333b(aVar, 24);
                        int[] iArr = this.f4542d;
                        int length = iArr == null ? 0 : iArr.length;
                        int[] iArr2 = new int[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f4542d, 0, iArr2, 0, length);
                        }
                        while (length < iArr2.length - 1) {
                            iArr2[length] = aVar.mo39428g();
                            aVar.mo39416a();
                            length++;
                        }
                        iArr2[length] = aVar.mo39428g();
                        this.f4542d = iArr2;
                    } else if (a == 26) {
                        int d = aVar.mo39423d(aVar.mo39437n());
                        int t = aVar.mo39443t();
                        int i = 0;
                        while (aVar.mo39441r() > 0) {
                            aVar.mo39428g();
                            i++;
                        }
                        aVar.mo39427f(t);
                        int[] iArr3 = this.f4542d;
                        int length2 = iArr3 == null ? 0 : iArr3.length;
                        int[] iArr4 = new int[(i + length2)];
                        if (length2 != 0) {
                            System.arraycopy(this.f4542d, 0, iArr4, 0, length2);
                        }
                        while (length2 < iArr4.length) {
                            iArr4[length2] = aVar.mo39428g();
                            length2++;
                        }
                        this.f4542d = iArr4;
                        aVar.mo39425e(d);
                    } else if (a == 32) {
                        this.f4543e = aVar.mo39426f();
                    } else if (a == 40) {
                        this.f4544f = aVar.mo39428g();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$g */
        public static final class C3943g extends C3365e {

            /* renamed from: b */
            public long f4524b;

            /* renamed from: c */
            public long f4525c;

            public C3943g() {
                mo41092d();
            }

            /* renamed from: d */
            public C3943g mo41092d() {
                this.f4524b = 86400;
                this.f4525c = 432000;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39565b(1, this.f4524b);
                bVar.mo39565b(2, this.f4525c);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2119e(1, this.f4524b) + C3157b.m2119e(2, this.f4525c);
            }

            /* renamed from: b */
            public C3943g mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4524b = aVar.mo39426f();
                    } else if (a == 16) {
                        this.f4525c = aVar.mo39426f();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$h */
        public static final class C3944h extends C3365e {

            /* renamed from: h */
            private static volatile C3944h[] f4526h;

            /* renamed from: b */
            public String f4527b;

            /* renamed from: c */
            public String f4528c;

            /* renamed from: d */
            public String f4529d;

            /* renamed from: e */
            public C3945a[] f4530e;

            /* renamed from: f */
            public long f4531f;

            /* renamed from: g */
            public int[] f4532g;

            /* renamed from: com.yandex.metrica.impl.ob.rr$a$h$a */
            public static final class C3945a extends C3365e {

                /* renamed from: d */
                private static volatile C3945a[] f4533d;

                /* renamed from: b */
                public String f4534b;

                /* renamed from: c */
                public String f4535c;

                /* renamed from: d */
                public static C3945a[] m5023d() {
                    if (f4533d == null) {
                        synchronized (C3246c.f2825a) {
                            if (f4533d == null) {
                                f4533d = new C3945a[0];
                            }
                        }
                    }
                    return f4533d;
                }

                public C3945a() {
                    mo41096e();
                }

                /* renamed from: e */
                public C3945a mo41096e() {
                    this.f4534b = "";
                    this.f4535c = "";
                    this.f3093a = -1;
                    return this;
                }

                /* renamed from: a */
                public void mo39942a(C3157b bVar) throws IOException {
                    bVar.mo39554a(1, this.f4534b);
                    bVar.mo39554a(2, this.f4535c);
                    super.mo39942a(bVar);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public int mo39944c() {
                    return super.mo39944c() + C3157b.m2106b(1, this.f4534b) + C3157b.m2106b(2, this.f4535c);
                }

                /* renamed from: b */
                public C3945a mo39941a(C3115a aVar) throws IOException {
                    while (true) {
                        int a = aVar.mo39416a();
                        if (a == 0) {
                            return this;
                        }
                        if (a == 10) {
                            this.f4534b = aVar.mo39432i();
                        } else if (a == 18) {
                            this.f4535c = aVar.mo39432i();
                        } else if (!C3442g.m3331a(aVar, a)) {
                            return this;
                        }
                    }
                }
            }

            /* renamed from: d */
            public static C3944h[] m5017d() {
                if (f4526h == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4526h == null) {
                            f4526h = new C3944h[0];
                        }
                    }
                }
                return f4526h;
            }

            public C3944h() {
                mo41094e();
            }

            /* renamed from: e */
            public C3944h mo41094e() {
                this.f4527b = "";
                this.f4528c = "";
                this.f4529d = "";
                this.f4530e = C3945a.m5023d();
                this.f4531f = 0;
                this.f4532g = C3442g.f3273a;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39554a(1, this.f4527b);
                bVar.mo39554a(2, this.f4528c);
                bVar.mo39554a(3, this.f4529d);
                C3945a[] aVarArr = this.f4530e;
                int i = 0;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        C3945a[] aVarArr2 = this.f4530e;
                        if (i2 >= aVarArr2.length) {
                            break;
                        }
                        C3945a aVar = aVarArr2[i2];
                        if (aVar != null) {
                            bVar.mo39553a(4, (C3365e) aVar);
                        }
                        i2++;
                    }
                }
                bVar.mo39565b(5, this.f4531f);
                int[] iArr = this.f4532g;
                if (iArr != null && iArr.length > 0) {
                    while (true) {
                        int[] iArr2 = this.f4532g;
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
                int c = super.mo39944c() + C3157b.m2106b(1, this.f4527b) + C3157b.m2106b(2, this.f4528c) + C3157b.m2106b(3, this.f4529d);
                C3945a[] aVarArr = this.f4530e;
                int i = 0;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i2 = c;
                    int i3 = 0;
                    while (true) {
                        C3945a[] aVarArr2 = this.f4530e;
                        if (i3 >= aVarArr2.length) {
                            break;
                        }
                        C3945a aVar = aVarArr2[i3];
                        if (aVar != null) {
                            i2 += C3157b.m2105b(4, (C3365e) aVar);
                        }
                        i3++;
                    }
                    c = i2;
                }
                int e = c + C3157b.m2119e(5, this.f4531f);
                int[] iArr = this.f4532g;
                if (iArr == null || iArr.length <= 0) {
                    return e;
                }
                int i4 = 0;
                while (true) {
                    int[] iArr2 = this.f4532g;
                    if (i >= iArr2.length) {
                        return e + i4 + (iArr2.length * 1);
                    }
                    i4 += C3157b.m2113d(iArr2[i]);
                    i++;
                }
            }

            /* renamed from: b */
            public C3944h mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        this.f4527b = aVar.mo39432i();
                    } else if (a == 18) {
                        this.f4528c = aVar.mo39432i();
                    } else if (a == 26) {
                        this.f4529d = aVar.mo39432i();
                    } else if (a == 34) {
                        int b = C3442g.m3333b(aVar, 34);
                        C3945a[] aVarArr = this.f4530e;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        C3945a[] aVarArr2 = new C3945a[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f4530e, 0, aVarArr2, 0, length);
                        }
                        while (length < aVarArr2.length - 1) {
                            aVarArr2[length] = new C3945a();
                            aVar.mo39418a((C3365e) aVarArr2[length]);
                            aVar.mo39416a();
                            length++;
                        }
                        aVarArr2[length] = new C3945a();
                        aVar.mo39418a((C3365e) aVarArr2[length]);
                        this.f4530e = aVarArr2;
                    } else if (a == 40) {
                        this.f4531f = aVar.mo39426f();
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
                            int[] iArr2 = this.f4532g;
                            int length2 = iArr2 == null ? 0 : iArr2.length;
                            if (length2 == 0 && i == iArr.length) {
                                this.f4532g = iArr;
                            } else {
                                int[] iArr3 = new int[(length2 + i)];
                                if (length2 != 0) {
                                    System.arraycopy(this.f4532g, 0, iArr3, 0, length2);
                                }
                                System.arraycopy(iArr, 0, iArr3, length2, i);
                                this.f4532g = iArr3;
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
                            int[] iArr4 = this.f4532g;
                            int length3 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[(i3 + length3)];
                            if (length3 != 0) {
                                System.arraycopy(this.f4532g, 0, iArr5, 0, length3);
                            }
                            while (aVar.mo39441r() > 0) {
                                int g3 = aVar.mo39428g();
                                if (g3 == 1 || g3 == 2) {
                                    iArr5[length3] = g3;
                                    length3++;
                                }
                            }
                            this.f4532g = iArr5;
                        }
                        aVar.mo39425e(d);
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$k */
        public static final class C3948k extends C3365e {

            /* renamed from: b */
            public long f4545b;

            public C3948k() {
                mo41102d();
            }

            /* renamed from: d */
            public C3948k mo41102d() {
                this.f4545b = WorkRequest.MAX_BACKOFF_MILLIS;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39565b(1, this.f4545b);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2119e(1, this.f4545b);
            }

            /* renamed from: b */
            public C3948k mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4545b = aVar.mo39426f();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$f */
        public static final class C3942f extends C3365e {

            /* renamed from: d */
            private static volatile C3942f[] f4521d;

            /* renamed from: b */
            public String f4522b;

            /* renamed from: c */
            public boolean f4523c;

            /* renamed from: d */
            public static C3942f[] m5006d() {
                if (f4521d == null) {
                    synchronized (C3246c.f2825a) {
                        if (f4521d == null) {
                            f4521d = new C3942f[0];
                        }
                    }
                }
                return f4521d;
            }

            public C3942f() {
                mo41090e();
            }

            /* renamed from: e */
            public C3942f mo41090e() {
                this.f4522b = "";
                this.f4523c = false;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39554a(1, this.f4522b);
                bVar.mo39555a(2, this.f4523c);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2106b(1, this.f4522b) + C3157b.m2107b(2, this.f4523c);
            }

            /* renamed from: b */
            public C3942f mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        this.f4522b = aVar.mo39432i();
                    } else if (a == 16) {
                        this.f4523c = aVar.mo39431h();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$i */
        public static final class C3946i extends C3365e {

            /* renamed from: b */
            public long f4536b;

            /* renamed from: c */
            public long f4537c;

            /* renamed from: d */
            public long f4538d;

            /* renamed from: e */
            public long f4539e;

            public C3946i() {
                mo41098d();
            }

            /* renamed from: d */
            public C3946i mo41098d() {
                this.f4536b = 432000000;
                this.f4537c = DateUtils.MILLIS_PER_DAY;
                this.f4538d = 10000;
                this.f4539e = DateUtils.MILLIS_PER_HOUR;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                long j = this.f4536b;
                if (j != 432000000) {
                    bVar.mo39565b(1, j);
                }
                long j2 = this.f4537c;
                if (j2 != DateUtils.MILLIS_PER_DAY) {
                    bVar.mo39565b(2, j2);
                }
                long j3 = this.f4538d;
                if (j3 != 10000) {
                    bVar.mo39565b(3, j3);
                }
                long j4 = this.f4539e;
                if (j4 != DateUtils.MILLIS_PER_HOUR) {
                    bVar.mo39565b(4, j4);
                }
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c();
                long j = this.f4536b;
                if (j != 432000000) {
                    c += C3157b.m2119e(1, j);
                }
                long j2 = this.f4537c;
                if (j2 != DateUtils.MILLIS_PER_DAY) {
                    c += C3157b.m2119e(2, j2);
                }
                long j3 = this.f4538d;
                if (j3 != 10000) {
                    c += C3157b.m2119e(3, j3);
                }
                long j4 = this.f4539e;
                return j4 != DateUtils.MILLIS_PER_HOUR ? c + C3157b.m2119e(4, j4) : c;
            }

            /* renamed from: b */
            public C3946i mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4536b = aVar.mo39426f();
                    } else if (a == 16) {
                        this.f4537c = aVar.mo39426f();
                    } else if (a == 24) {
                        this.f4538d = aVar.mo39426f();
                    } else if (a == 32) {
                        this.f4539e = aVar.mo39426f();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$d */
        public static final class C3940d extends C3365e {

            /* renamed from: b */
            public long f4511b;

            public C3940d() {
                mo41086d();
            }

            /* renamed from: d */
            public C3940d mo41086d() {
                this.f4511b = 900;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                bVar.mo39565b(1, this.f4511b);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                return super.mo39944c() + C3157b.m2119e(1, this.f4511b);
            }

            /* renamed from: b */
            public C3940d mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 8) {
                        this.f4511b = aVar.mo39426f();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.rr$a$b */
        public static final class C3933b extends C3365e {

            /* renamed from: b */
            public C3938b f4472b;

            /* renamed from: c */
            public C3934a[] f4473c;

            /* renamed from: d */
            public long f4474d;

            /* renamed from: e */
            public long f4475e;

            /* renamed from: com.yandex.metrica.impl.ob.rr$a$b$b */
            public static final class C3938b extends C3365e {

                /* renamed from: b */
                public int f4490b;

                /* renamed from: c */
                public int f4491c;

                /* renamed from: d */
                public int f4492d;

                /* renamed from: e */
                public int f4493e;

                /* renamed from: f */
                public long f4494f;

                public C3938b() {
                    mo41082d();
                }

                /* renamed from: d */
                public C3938b mo41082d() {
                    this.f4490b = 1;
                    this.f4491c = 2;
                    this.f4492d = 3;
                    this.f4493e = 1;
                    this.f4494f = 300000;
                    this.f3093a = -1;
                    return this;
                }

                /* renamed from: a */
                public void mo39942a(C3157b bVar) throws IOException {
                    int i = this.f4490b;
                    if (i != 1) {
                        bVar.mo39551a(1, i);
                    }
                    int i2 = this.f4491c;
                    if (i2 != 2) {
                        bVar.mo39551a(2, i2);
                    }
                    int i3 = this.f4492d;
                    if (i3 != 3) {
                        bVar.mo39551a(3, i3);
                    }
                    int i4 = this.f4493e;
                    if (i4 != 1) {
                        bVar.mo39551a(4, i4);
                    }
                    long j = this.f4494f;
                    if (j != 300000) {
                        bVar.mo39565b(5, j);
                    }
                    super.mo39942a(bVar);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public int mo39944c() {
                    int c = super.mo39944c();
                    int i = this.f4490b;
                    if (i != 1) {
                        c += C3157b.m2114d(1, i);
                    }
                    int i2 = this.f4491c;
                    if (i2 != 2) {
                        c += C3157b.m2114d(2, i2);
                    }
                    int i3 = this.f4492d;
                    if (i3 != 3) {
                        c += C3157b.m2114d(3, i3);
                    }
                    int i4 = this.f4493e;
                    if (i4 != 1) {
                        c += C3157b.m2114d(4, i4);
                    }
                    long j = this.f4494f;
                    return j != 300000 ? c + C3157b.m2119e(5, j) : c;
                }

                /* renamed from: b */
                public C3938b mo39941a(C3115a aVar) throws IOException {
                    while (true) {
                        int a = aVar.mo39416a();
                        if (a == 0) {
                            return this;
                        }
                        if (a == 8) {
                            int g = aVar.mo39428g();
                            if (g == 1 || g == 2 || g == 3) {
                                this.f4490b = g;
                            }
                        } else if (a == 16) {
                            int g2 = aVar.mo39428g();
                            if (g2 == 1 || g2 == 2) {
                                this.f4491c = g2;
                            }
                        } else if (a == 24) {
                            int g3 = aVar.mo39428g();
                            if (g3 == 1 || g3 == 2 || g3 == 3) {
                                this.f4492d = g3;
                            }
                        } else if (a == 32) {
                            int g4 = aVar.mo39428g();
                            if (g4 == 1 || g4 == 2 || g4 == 3) {
                                this.f4493e = g4;
                            }
                        } else if (a == 40) {
                            this.f4494f = aVar.mo39426f();
                        } else if (!C3442g.m3331a(aVar, a)) {
                            return this;
                        }
                    }
                }
            }

            /* renamed from: com.yandex.metrica.impl.ob.rr$a$b$a */
            public static final class C3934a extends C3365e {

                /* renamed from: g */
                private static volatile C3934a[] f4476g;

                /* renamed from: b */
                public String f4477b;

                /* renamed from: c */
                public String f4478c;

                /* renamed from: d */
                public C3935a f4479d;

                /* renamed from: e */
                public C3936b f4480e;

                /* renamed from: f */
                public C3937c f4481f;

                /* renamed from: com.yandex.metrica.impl.ob.rr$a$b$a$a */
                public static final class C3935a extends C3365e {

                    /* renamed from: b */
                    public int f4482b;

                    /* renamed from: c */
                    public byte[] f4483c;

                    /* renamed from: d */
                    public byte[] f4484d;

                    public C3935a() {
                        mo41076d();
                    }

                    /* renamed from: d */
                    public C3935a mo41076d() {
                        this.f4482b = 0;
                        this.f4483c = C3442g.f3280h;
                        this.f4484d = C3442g.f3280h;
                        this.f3093a = -1;
                        return this;
                    }

                    /* renamed from: a */
                    public void mo39942a(C3157b bVar) throws IOException {
                        bVar.mo39551a(1, this.f4482b);
                        if (!Arrays.equals(this.f4483c, C3442g.f3280h)) {
                            bVar.mo39556a(2, this.f4483c);
                        }
                        if (!Arrays.equals(this.f4484d, C3442g.f3280h)) {
                            bVar.mo39556a(3, this.f4484d);
                        }
                        super.mo39942a(bVar);
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: c */
                    public int mo39944c() {
                        int c = super.mo39944c() + C3157b.m2114d(1, this.f4482b);
                        if (!Arrays.equals(this.f4483c, C3442g.f3280h)) {
                            c += C3157b.m2108b(2, this.f4483c);
                        }
                        return !Arrays.equals(this.f4484d, C3442g.f3280h) ? c + C3157b.m2108b(3, this.f4484d) : c;
                    }

                    /* renamed from: b */
                    public C3935a mo39941a(C3115a aVar) throws IOException {
                        while (true) {
                            int a = aVar.mo39416a();
                            if (a == 0) {
                                return this;
                            }
                            if (a == 8) {
                                this.f4482b = aVar.mo39428g();
                            } else if (a == 18) {
                                this.f4483c = aVar.mo39433j();
                            } else if (a == 26) {
                                this.f4484d = aVar.mo39433j();
                            } else if (!C3442g.m3331a(aVar, a)) {
                                return this;
                            }
                        }
                    }
                }

                /* renamed from: com.yandex.metrica.impl.ob.rr$a$b$a$b */
                public static final class C3936b extends C3365e {

                    /* renamed from: b */
                    public String f4485b;

                    /* renamed from: c */
                    public byte[] f4486c;

                    /* renamed from: d */
                    public byte[] f4487d;

                    public C3936b() {
                        mo41078d();
                    }

                    /* renamed from: d */
                    public C3936b mo41078d() {
                        this.f4485b = "";
                        this.f4486c = C3442g.f3280h;
                        this.f4487d = C3442g.f3280h;
                        this.f3093a = -1;
                        return this;
                    }

                    /* renamed from: a */
                    public void mo39942a(C3157b bVar) throws IOException {
                        bVar.mo39554a(1, this.f4485b);
                        if (!Arrays.equals(this.f4486c, C3442g.f3280h)) {
                            bVar.mo39556a(2, this.f4486c);
                        }
                        if (!Arrays.equals(this.f4487d, C3442g.f3280h)) {
                            bVar.mo39556a(3, this.f4487d);
                        }
                        super.mo39942a(bVar);
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: c */
                    public int mo39944c() {
                        int c = super.mo39944c() + C3157b.m2106b(1, this.f4485b);
                        if (!Arrays.equals(this.f4486c, C3442g.f3280h)) {
                            c += C3157b.m2108b(2, this.f4486c);
                        }
                        return !Arrays.equals(this.f4487d, C3442g.f3280h) ? c + C3157b.m2108b(3, this.f4487d) : c;
                    }

                    /* renamed from: b */
                    public C3936b mo39941a(C3115a aVar) throws IOException {
                        while (true) {
                            int a = aVar.mo39416a();
                            if (a == 0) {
                                return this;
                            }
                            if (a == 10) {
                                this.f4485b = aVar.mo39432i();
                            } else if (a == 18) {
                                this.f4486c = aVar.mo39433j();
                            } else if (a == 26) {
                                this.f4487d = aVar.mo39433j();
                            } else if (!C3442g.m3331a(aVar, a)) {
                                return this;
                            }
                        }
                    }
                }

                /* renamed from: com.yandex.metrica.impl.ob.rr$a$b$a$c */
                public static final class C3937c extends C3365e {

                    /* renamed from: b */
                    public String f4488b;

                    /* renamed from: c */
                    public String f4489c;

                    public C3937c() {
                        mo41080d();
                    }

                    /* renamed from: d */
                    public C3937c mo41080d() {
                        this.f4488b = "";
                        this.f4489c = "";
                        this.f3093a = -1;
                        return this;
                    }

                    /* renamed from: a */
                    public void mo39942a(C3157b bVar) throws IOException {
                        bVar.mo39554a(1, this.f4488b);
                        if (!this.f4489c.equals("")) {
                            bVar.mo39554a(2, this.f4489c);
                        }
                        super.mo39942a(bVar);
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: c */
                    public int mo39944c() {
                        int c = super.mo39944c() + C3157b.m2106b(1, this.f4488b);
                        return !this.f4489c.equals("") ? c + C3157b.m2106b(2, this.f4489c) : c;
                    }

                    /* renamed from: b */
                    public C3937c mo39941a(C3115a aVar) throws IOException {
                        while (true) {
                            int a = aVar.mo39416a();
                            if (a == 0) {
                                return this;
                            }
                            if (a == 10) {
                                this.f4488b = aVar.mo39432i();
                            } else if (a == 18) {
                                this.f4489c = aVar.mo39432i();
                            } else if (!C3442g.m3331a(aVar, a)) {
                                return this;
                            }
                        }
                    }
                }

                /* renamed from: d */
                public static C3934a[] m4965d() {
                    if (f4476g == null) {
                        synchronized (C3246c.f2825a) {
                            if (f4476g == null) {
                                f4476g = new C3934a[0];
                            }
                        }
                    }
                    return f4476g;
                }

                public C3934a() {
                    mo41074e();
                }

                /* renamed from: e */
                public C3934a mo41074e() {
                    this.f4477b = "";
                    this.f4478c = "";
                    this.f4479d = null;
                    this.f4480e = null;
                    this.f4481f = null;
                    this.f3093a = -1;
                    return this;
                }

                /* renamed from: a */
                public void mo39942a(C3157b bVar) throws IOException {
                    if (!this.f4477b.equals("")) {
                        bVar.mo39554a(1, this.f4477b);
                    }
                    if (!this.f4478c.equals("")) {
                        bVar.mo39554a(2, this.f4478c);
                    }
                    C3935a aVar = this.f4479d;
                    if (aVar != null) {
                        bVar.mo39553a(3, (C3365e) aVar);
                    }
                    C3936b bVar2 = this.f4480e;
                    if (bVar2 != null) {
                        bVar.mo39553a(4, (C3365e) bVar2);
                    }
                    C3937c cVar = this.f4481f;
                    if (cVar != null) {
                        bVar.mo39553a(5, (C3365e) cVar);
                    }
                    super.mo39942a(bVar);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public int mo39944c() {
                    int c = super.mo39944c();
                    if (!this.f4477b.equals("")) {
                        c += C3157b.m2106b(1, this.f4477b);
                    }
                    if (!this.f4478c.equals("")) {
                        c += C3157b.m2106b(2, this.f4478c);
                    }
                    C3935a aVar = this.f4479d;
                    if (aVar != null) {
                        c += C3157b.m2105b(3, (C3365e) aVar);
                    }
                    C3936b bVar = this.f4480e;
                    if (bVar != null) {
                        c += C3157b.m2105b(4, (C3365e) bVar);
                    }
                    C3937c cVar = this.f4481f;
                    return cVar != null ? c + C3157b.m2105b(5, (C3365e) cVar) : c;
                }

                /* renamed from: b */
                public C3934a mo39941a(C3115a aVar) throws IOException {
                    while (true) {
                        int a = aVar.mo39416a();
                        if (a == 0) {
                            return this;
                        }
                        if (a == 10) {
                            this.f4477b = aVar.mo39432i();
                        } else if (a == 18) {
                            this.f4478c = aVar.mo39432i();
                        } else if (a == 26) {
                            if (this.f4479d == null) {
                                this.f4479d = new C3935a();
                            }
                            aVar.mo39418a((C3365e) this.f4479d);
                        } else if (a == 34) {
                            if (this.f4480e == null) {
                                this.f4480e = new C3936b();
                            }
                            aVar.mo39418a((C3365e) this.f4480e);
                        } else if (a == 42) {
                            if (this.f4481f == null) {
                                this.f4481f = new C3937c();
                            }
                            aVar.mo39418a((C3365e) this.f4481f);
                        } else if (!C3442g.m3331a(aVar, a)) {
                            return this;
                        }
                    }
                }
            }

            public C3933b() {
                mo41072d();
            }

            /* renamed from: d */
            public C3933b mo41072d() {
                this.f4472b = null;
                this.f4473c = C3934a.m4965d();
                this.f4474d = 1200000;
                this.f4475e = 259200000;
                this.f3093a = -1;
                return this;
            }

            /* renamed from: a */
            public void mo39942a(C3157b bVar) throws IOException {
                C3938b bVar2 = this.f4472b;
                if (bVar2 != null) {
                    bVar.mo39553a(1, (C3365e) bVar2);
                }
                C3934a[] aVarArr = this.f4473c;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        C3934a[] aVarArr2 = this.f4473c;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        C3934a aVar = aVarArr2[i];
                        if (aVar != null) {
                            bVar.mo39553a(2, (C3365e) aVar);
                        }
                        i++;
                    }
                }
                bVar.mo39565b(3, this.f4474d);
                bVar.mo39565b(4, this.f4475e);
                super.mo39942a(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public int mo39944c() {
                int c = super.mo39944c();
                C3938b bVar = this.f4472b;
                if (bVar != null) {
                    c += C3157b.m2105b(1, (C3365e) bVar);
                }
                C3934a[] aVarArr = this.f4473c;
                if (aVarArr != null && aVarArr.length > 0) {
                    int i = 0;
                    while (true) {
                        C3934a[] aVarArr2 = this.f4473c;
                        if (i >= aVarArr2.length) {
                            break;
                        }
                        C3934a aVar = aVarArr2[i];
                        if (aVar != null) {
                            c += C3157b.m2105b(2, (C3365e) aVar);
                        }
                        i++;
                    }
                }
                return c + C3157b.m2119e(3, this.f4474d) + C3157b.m2119e(4, this.f4475e);
            }

            /* renamed from: b */
            public C3933b mo39941a(C3115a aVar) throws IOException {
                while (true) {
                    int a = aVar.mo39416a();
                    if (a == 0) {
                        return this;
                    }
                    if (a == 10) {
                        if (this.f4472b == null) {
                            this.f4472b = new C3938b();
                        }
                        aVar.mo39418a((C3365e) this.f4472b);
                    } else if (a == 18) {
                        int b = C3442g.m3333b(aVar, 18);
                        C3934a[] aVarArr = this.f4473c;
                        int length = aVarArr == null ? 0 : aVarArr.length;
                        C3934a[] aVarArr2 = new C3934a[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f4473c, 0, aVarArr2, 0, length);
                        }
                        while (length < aVarArr2.length - 1) {
                            aVarArr2[length] = new C3934a();
                            aVar.mo39418a((C3365e) aVarArr2[length]);
                            aVar.mo39416a();
                            length++;
                        }
                        aVarArr2[length] = new C3934a();
                        aVar.mo39418a((C3365e) aVarArr2[length]);
                        this.f4473c = aVarArr2;
                    } else if (a == 24) {
                        this.f4474d = aVar.mo39426f();
                    } else if (a == 32) {
                        this.f4475e = aVar.mo39426f();
                    } else if (!C3442g.m3331a(aVar, a)) {
                        return this;
                    }
                }
            }
        }

        public C3930a() {
            mo41066d();
        }

        /* renamed from: d */
        public C3930a mo41066d() {
            this.f4439b = "";
            this.f4440c = 0;
            this.f4441d = C3442g.f3278f;
            this.f4442e = "";
            this.f4443f = "";
            this.f4444g = C3442g.f3278f;
            this.f4445h = C3442g.f3278f;
            this.f4446i = C3442g.f3278f;
            this.f4447j = null;
            this.f4448k = null;
            this.f4449l = null;
            this.f4450m = null;
            this.f4451n = C3944h.m5017d();
            this.f4452o = "";
            this.f4453p = "";
            this.f4454q = false;
            this.f4455r = "";
            this.f4456s = "";
            this.f4457t = C3442g.f3278f;
            this.f4458u = null;
            this.f4459v = false;
            this.f4460w = C3942f.m5006d();
            this.f4461x = null;
            this.f4462y = "";
            this.f4463z = "";
            this.f4431A = "";
            this.f4432B = "";
            this.f4433C = 0;
            this.f4434D = 0;
            this.f4435E = false;
            this.f4436F = null;
            this.f4437G = null;
            this.f4438H = null;
            this.f3093a = -1;
            return this;
        }

        /* renamed from: a */
        public void mo39942a(C3157b bVar) throws IOException {
            if (!this.f4439b.equals("")) {
                bVar.mo39554a(1, this.f4439b);
            }
            bVar.mo39565b(3, this.f4440c);
            String[] strArr = this.f4441d;
            int i = 0;
            if (strArr != null && strArr.length > 0) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.f4441d;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i2];
                    if (str != null) {
                        bVar.mo39554a(4, str);
                    }
                    i2++;
                }
            }
            if (!this.f4442e.equals("")) {
                bVar.mo39554a(5, this.f4442e);
            }
            if (!this.f4443f.equals("")) {
                bVar.mo39554a(6, this.f4443f);
            }
            String[] strArr3 = this.f4444g;
            if (strArr3 != null && strArr3.length > 0) {
                int i3 = 0;
                while (true) {
                    String[] strArr4 = this.f4444g;
                    if (i3 >= strArr4.length) {
                        break;
                    }
                    String str2 = strArr4[i3];
                    if (str2 != null) {
                        bVar.mo39554a(7, str2);
                    }
                    i3++;
                }
            }
            String[] strArr5 = this.f4445h;
            if (strArr5 != null && strArr5.length > 0) {
                int i4 = 0;
                while (true) {
                    String[] strArr6 = this.f4445h;
                    if (i4 >= strArr6.length) {
                        break;
                    }
                    String str3 = strArr6[i4];
                    if (str3 != null) {
                        bVar.mo39554a(8, str3);
                    }
                    i4++;
                }
            }
            String[] strArr7 = this.f4446i;
            if (strArr7 != null && strArr7.length > 0) {
                int i5 = 0;
                while (true) {
                    String[] strArr8 = this.f4446i;
                    if (i5 >= strArr8.length) {
                        break;
                    }
                    String str4 = strArr8[i5];
                    if (str4 != null) {
                        bVar.mo39554a(9, str4);
                    }
                    i5++;
                }
            }
            C3939c cVar = this.f4447j;
            if (cVar != null) {
                bVar.mo39553a(10, (C3365e) cVar);
            }
            C3941e eVar = this.f4448k;
            if (eVar != null) {
                bVar.mo39553a(11, (C3365e) eVar);
            }
            C3931a aVar = this.f4449l;
            if (aVar != null) {
                bVar.mo39553a(12, (C3365e) aVar);
            }
            C3947j jVar = this.f4450m;
            if (jVar != null) {
                bVar.mo39553a(13, (C3365e) jVar);
            }
            C3944h[] hVarArr = this.f4451n;
            if (hVarArr != null && hVarArr.length > 0) {
                int i6 = 0;
                while (true) {
                    C3944h[] hVarArr2 = this.f4451n;
                    if (i6 >= hVarArr2.length) {
                        break;
                    }
                    C3944h hVar = hVarArr2[i6];
                    if (hVar != null) {
                        bVar.mo39553a(14, (C3365e) hVar);
                    }
                    i6++;
                }
            }
            if (!this.f4452o.equals("")) {
                bVar.mo39554a(15, this.f4452o);
            }
            if (!this.f4453p.equals("")) {
                bVar.mo39554a(16, this.f4453p);
            }
            bVar.mo39555a(17, this.f4454q);
            if (!this.f4455r.equals("")) {
                bVar.mo39554a(18, this.f4455r);
            }
            if (!this.f4456s.equals("")) {
                bVar.mo39554a(19, this.f4456s);
            }
            String[] strArr9 = this.f4457t;
            if (strArr9 != null && strArr9.length > 0) {
                int i7 = 0;
                while (true) {
                    String[] strArr10 = this.f4457t;
                    if (i7 >= strArr10.length) {
                        break;
                    }
                    String str5 = strArr10[i7];
                    if (str5 != null) {
                        bVar.mo39554a(20, str5);
                    }
                    i7++;
                }
            }
            C3948k kVar = this.f4458u;
            if (kVar != null) {
                bVar.mo39553a(21, (C3365e) kVar);
            }
            boolean z = this.f4459v;
            if (z) {
                bVar.mo39555a(22, z);
            }
            C3942f[] fVarArr = this.f4460w;
            if (fVarArr != null && fVarArr.length > 0) {
                while (true) {
                    C3942f[] fVarArr2 = this.f4460w;
                    if (i >= fVarArr2.length) {
                        break;
                    }
                    C3942f fVar = fVarArr2[i];
                    if (fVar != null) {
                        bVar.mo39553a(23, (C3365e) fVar);
                    }
                    i++;
                }
            }
            C3946i iVar = this.f4461x;
            if (iVar != null) {
                bVar.mo39553a(24, (C3365e) iVar);
            }
            if (!this.f4462y.equals("")) {
                bVar.mo39554a(25, this.f4462y);
            }
            if (!this.f4463z.equals("")) {
                bVar.mo39554a(26, this.f4463z);
            }
            if (!this.f4432B.equals("")) {
                bVar.mo39554a(27, this.f4432B);
            }
            bVar.mo39565b(28, this.f4433C);
            bVar.mo39565b(29, this.f4434D);
            boolean z2 = this.f4435E;
            if (z2) {
                bVar.mo39555a(30, z2);
            }
            if (!this.f4431A.equals("")) {
                bVar.mo39554a(31, this.f4431A);
            }
            C3943g gVar = this.f4436F;
            if (gVar != null) {
                bVar.mo39553a(32, (C3365e) gVar);
            }
            C3940d dVar = this.f4437G;
            if (dVar != null) {
                bVar.mo39553a(33, (C3365e) dVar);
            }
            C3933b bVar2 = this.f4438H;
            if (bVar2 != null) {
                bVar.mo39553a(34, (C3365e) bVar2);
            }
            super.mo39942a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public int mo39944c() {
            int c = super.mo39944c();
            if (!this.f4439b.equals("")) {
                c += C3157b.m2106b(1, this.f4439b);
            }
            int e = c + C3157b.m2119e(3, this.f4440c);
            String[] strArr = this.f4441d;
            int i = 0;
            if (strArr != null && strArr.length > 0) {
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    String[] strArr2 = this.f4441d;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i2];
                    if (str != null) {
                        i4++;
                        i3 += C3157b.m2110b(str);
                    }
                    i2++;
                }
                e = e + i3 + (i4 * 1);
            }
            if (!this.f4442e.equals("")) {
                e += C3157b.m2106b(5, this.f4442e);
            }
            if (!this.f4443f.equals("")) {
                e += C3157b.m2106b(6, this.f4443f);
            }
            String[] strArr3 = this.f4444g;
            if (strArr3 != null && strArr3.length > 0) {
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    String[] strArr4 = this.f4444g;
                    if (i5 >= strArr4.length) {
                        break;
                    }
                    String str2 = strArr4[i5];
                    if (str2 != null) {
                        i7++;
                        i6 += C3157b.m2110b(str2);
                    }
                    i5++;
                }
                e = e + i6 + (i7 * 1);
            }
            String[] strArr5 = this.f4445h;
            if (strArr5 != null && strArr5.length > 0) {
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    String[] strArr6 = this.f4445h;
                    if (i8 >= strArr6.length) {
                        break;
                    }
                    String str3 = strArr6[i8];
                    if (str3 != null) {
                        i10++;
                        i9 += C3157b.m2110b(str3);
                    }
                    i8++;
                }
                e = e + i9 + (i10 * 1);
            }
            String[] strArr7 = this.f4446i;
            if (strArr7 != null && strArr7.length > 0) {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    String[] strArr8 = this.f4446i;
                    if (i11 >= strArr8.length) {
                        break;
                    }
                    String str4 = strArr8[i11];
                    if (str4 != null) {
                        i13++;
                        i12 += C3157b.m2110b(str4);
                    }
                    i11++;
                }
                e = e + i12 + (i13 * 1);
            }
            C3939c cVar = this.f4447j;
            if (cVar != null) {
                e += C3157b.m2105b(10, (C3365e) cVar);
            }
            C3941e eVar = this.f4448k;
            if (eVar != null) {
                e += C3157b.m2105b(11, (C3365e) eVar);
            }
            C3931a aVar = this.f4449l;
            if (aVar != null) {
                e += C3157b.m2105b(12, (C3365e) aVar);
            }
            C3947j jVar = this.f4450m;
            if (jVar != null) {
                e += C3157b.m2105b(13, (C3365e) jVar);
            }
            C3944h[] hVarArr = this.f4451n;
            if (hVarArr != null && hVarArr.length > 0) {
                int i14 = e;
                int i15 = 0;
                while (true) {
                    C3944h[] hVarArr2 = this.f4451n;
                    if (i15 >= hVarArr2.length) {
                        break;
                    }
                    C3944h hVar = hVarArr2[i15];
                    if (hVar != null) {
                        i14 += C3157b.m2105b(14, (C3365e) hVar);
                    }
                    i15++;
                }
                e = i14;
            }
            if (!this.f4452o.equals("")) {
                e += C3157b.m2106b(15, this.f4452o);
            }
            if (!this.f4453p.equals("")) {
                e += C3157b.m2106b(16, this.f4453p);
            }
            int b = e + C3157b.m2107b(17, this.f4454q);
            if (!this.f4455r.equals("")) {
                b += C3157b.m2106b(18, this.f4455r);
            }
            if (!this.f4456s.equals("")) {
                b += C3157b.m2106b(19, this.f4456s);
            }
            String[] strArr9 = this.f4457t;
            if (strArr9 != null && strArr9.length > 0) {
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    String[] strArr10 = this.f4457t;
                    if (i16 >= strArr10.length) {
                        break;
                    }
                    String str5 = strArr10[i16];
                    if (str5 != null) {
                        i18++;
                        i17 += C3157b.m2110b(str5);
                    }
                    i16++;
                }
                b = b + i17 + (i18 * 2);
            }
            C3948k kVar = this.f4458u;
            if (kVar != null) {
                b += C3157b.m2105b(21, (C3365e) kVar);
            }
            boolean z = this.f4459v;
            if (z) {
                b += C3157b.m2107b(22, z);
            }
            C3942f[] fVarArr = this.f4460w;
            if (fVarArr != null && fVarArr.length > 0) {
                while (true) {
                    C3942f[] fVarArr2 = this.f4460w;
                    if (i >= fVarArr2.length) {
                        break;
                    }
                    C3942f fVar = fVarArr2[i];
                    if (fVar != null) {
                        b += C3157b.m2105b(23, (C3365e) fVar);
                    }
                    i++;
                }
            }
            C3946i iVar = this.f4461x;
            if (iVar != null) {
                b += C3157b.m2105b(24, (C3365e) iVar);
            }
            if (!this.f4462y.equals("")) {
                b += C3157b.m2106b(25, this.f4462y);
            }
            if (!this.f4463z.equals("")) {
                b += C3157b.m2106b(26, this.f4463z);
            }
            if (!this.f4432B.equals("")) {
                b += C3157b.m2106b(27, this.f4432B);
            }
            int e2 = b + C3157b.m2119e(28, this.f4433C) + C3157b.m2119e(29, this.f4434D);
            boolean z2 = this.f4435E;
            if (z2) {
                e2 += C3157b.m2107b(30, z2);
            }
            if (!this.f4431A.equals("")) {
                e2 += C3157b.m2106b(31, this.f4431A);
            }
            C3943g gVar = this.f4436F;
            if (gVar != null) {
                e2 += C3157b.m2105b(32, (C3365e) gVar);
            }
            C3940d dVar = this.f4437G;
            if (dVar != null) {
                e2 += C3157b.m2105b(33, (C3365e) dVar);
            }
            C3933b bVar = this.f4438H;
            return bVar != null ? e2 + C3157b.m2105b(34, (C3365e) bVar) : e2;
        }

        /* renamed from: b */
        public C3930a mo39941a(C3115a aVar) throws IOException {
            while (true) {
                int a = aVar.mo39416a();
                switch (a) {
                    case 0:
                        return this;
                    case 10:
                        this.f4439b = aVar.mo39432i();
                        break;
                    case 24:
                        this.f4440c = aVar.mo39426f();
                        break;
                    case 34:
                        int b = C3442g.m3333b(aVar, 34);
                        String[] strArr = this.f4441d;
                        int length = strArr == null ? 0 : strArr.length;
                        String[] strArr2 = new String[(b + length)];
                        if (length != 0) {
                            System.arraycopy(this.f4441d, 0, strArr2, 0, length);
                        }
                        while (length < strArr2.length - 1) {
                            strArr2[length] = aVar.mo39432i();
                            aVar.mo39416a();
                            length++;
                        }
                        strArr2[length] = aVar.mo39432i();
                        this.f4441d = strArr2;
                        break;
                    case 42:
                        this.f4442e = aVar.mo39432i();
                        break;
                    case 50:
                        this.f4443f = aVar.mo39432i();
                        break;
                    case 58:
                        int b2 = C3442g.m3333b(aVar, 58);
                        String[] strArr3 = this.f4444g;
                        int length2 = strArr3 == null ? 0 : strArr3.length;
                        String[] strArr4 = new String[(b2 + length2)];
                        if (length2 != 0) {
                            System.arraycopy(this.f4444g, 0, strArr4, 0, length2);
                        }
                        while (length2 < strArr4.length - 1) {
                            strArr4[length2] = aVar.mo39432i();
                            aVar.mo39416a();
                            length2++;
                        }
                        strArr4[length2] = aVar.mo39432i();
                        this.f4444g = strArr4;
                        break;
                    case 66:
                        int b3 = C3442g.m3333b(aVar, 66);
                        String[] strArr5 = this.f4445h;
                        int length3 = strArr5 == null ? 0 : strArr5.length;
                        String[] strArr6 = new String[(b3 + length3)];
                        if (length3 != 0) {
                            System.arraycopy(this.f4445h, 0, strArr6, 0, length3);
                        }
                        while (length3 < strArr6.length - 1) {
                            strArr6[length3] = aVar.mo39432i();
                            aVar.mo39416a();
                            length3++;
                        }
                        strArr6[length3] = aVar.mo39432i();
                        this.f4445h = strArr6;
                        break;
                    case 74:
                        int b4 = C3442g.m3333b(aVar, 74);
                        String[] strArr7 = this.f4446i;
                        int length4 = strArr7 == null ? 0 : strArr7.length;
                        String[] strArr8 = new String[(b4 + length4)];
                        if (length4 != 0) {
                            System.arraycopy(this.f4446i, 0, strArr8, 0, length4);
                        }
                        while (length4 < strArr8.length - 1) {
                            strArr8[length4] = aVar.mo39432i();
                            aVar.mo39416a();
                            length4++;
                        }
                        strArr8[length4] = aVar.mo39432i();
                        this.f4446i = strArr8;
                        break;
                    case 82:
                        if (this.f4447j == null) {
                            this.f4447j = new C3939c();
                        }
                        aVar.mo39418a((C3365e) this.f4447j);
                        break;
                    case 90:
                        if (this.f4448k == null) {
                            this.f4448k = new C3941e();
                        }
                        aVar.mo39418a((C3365e) this.f4448k);
                        break;
                    case 98:
                        if (this.f4449l == null) {
                            this.f4449l = new C3931a();
                        }
                        aVar.mo39418a((C3365e) this.f4449l);
                        break;
                    case 106:
                        if (this.f4450m == null) {
                            this.f4450m = new C3947j();
                        }
                        aVar.mo39418a((C3365e) this.f4450m);
                        break;
                    case 114:
                        int b5 = C3442g.m3333b(aVar, 114);
                        C3944h[] hVarArr = this.f4451n;
                        int length5 = hVarArr == null ? 0 : hVarArr.length;
                        C3944h[] hVarArr2 = new C3944h[(b5 + length5)];
                        if (length5 != 0) {
                            System.arraycopy(this.f4451n, 0, hVarArr2, 0, length5);
                        }
                        while (length5 < hVarArr2.length - 1) {
                            hVarArr2[length5] = new C3944h();
                            aVar.mo39418a((C3365e) hVarArr2[length5]);
                            aVar.mo39416a();
                            length5++;
                        }
                        hVarArr2[length5] = new C3944h();
                        aVar.mo39418a((C3365e) hVarArr2[length5]);
                        this.f4451n = hVarArr2;
                        break;
                    case 122:
                        this.f4452o = aVar.mo39432i();
                        break;
                    case 130:
                        this.f4453p = aVar.mo39432i();
                        break;
                    case 136:
                        this.f4454q = aVar.mo39431h();
                        break;
                    case 146:
                        this.f4455r = aVar.mo39432i();
                        break;
                    case 154:
                        this.f4456s = aVar.mo39432i();
                        break;
                    case 162:
                        int b6 = C3442g.m3333b(aVar, 162);
                        String[] strArr9 = this.f4457t;
                        int length6 = strArr9 == null ? 0 : strArr9.length;
                        String[] strArr10 = new String[(b6 + length6)];
                        if (length6 != 0) {
                            System.arraycopy(this.f4457t, 0, strArr10, 0, length6);
                        }
                        while (length6 < strArr10.length - 1) {
                            strArr10[length6] = aVar.mo39432i();
                            aVar.mo39416a();
                            length6++;
                        }
                        strArr10[length6] = aVar.mo39432i();
                        this.f4457t = strArr10;
                        break;
                    case 170:
                        if (this.f4458u == null) {
                            this.f4458u = new C3948k();
                        }
                        aVar.mo39418a((C3365e) this.f4458u);
                        break;
                    case 176:
                        this.f4459v = aVar.mo39431h();
                        break;
                    case 186:
                        int b7 = C3442g.m3333b(aVar, 186);
                        C3942f[] fVarArr = this.f4460w;
                        int length7 = fVarArr == null ? 0 : fVarArr.length;
                        C3942f[] fVarArr2 = new C3942f[(b7 + length7)];
                        if (length7 != 0) {
                            System.arraycopy(this.f4460w, 0, fVarArr2, 0, length7);
                        }
                        while (length7 < fVarArr2.length - 1) {
                            fVarArr2[length7] = new C3942f();
                            aVar.mo39418a((C3365e) fVarArr2[length7]);
                            aVar.mo39416a();
                            length7++;
                        }
                        fVarArr2[length7] = new C3942f();
                        aVar.mo39418a((C3365e) fVarArr2[length7]);
                        this.f4460w = fVarArr2;
                        break;
                    case 194:
                        if (this.f4461x == null) {
                            this.f4461x = new C3946i();
                        }
                        aVar.mo39418a((C3365e) this.f4461x);
                        break;
                    case 202:
                        this.f4462y = aVar.mo39432i();
                        break;
                    case 210:
                        this.f4463z = aVar.mo39432i();
                        break;
                    case JfifUtil.MARKER_SOS:
                        this.f4432B = aVar.mo39432i();
                        break;
                    case CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY:
                        this.f4433C = aVar.mo39426f();
                        break;
                    case 232:
                        this.f4434D = aVar.mo39426f();
                        break;
                    case DimensionsKt.HDPI /*240*/:
                        this.f4435E = aVar.mo39431h();
                        break;
                    case 250:
                        this.f4431A = aVar.mo39432i();
                        break;
                    case 258:
                        if (this.f4436F == null) {
                            this.f4436F = new C3943g();
                        }
                        aVar.mo39418a((C3365e) this.f4436F);
                        break;
                    case 266:
                        if (this.f4437G == null) {
                            this.f4437G = new C3940d();
                        }
                        aVar.mo39418a((C3365e) this.f4437G);
                        break;
                    case 274:
                        if (this.f4438H == null) {
                            this.f4438H = new C3933b();
                        }
                        aVar.mo39418a((C3365e) this.f4438H);
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

        /* renamed from: a */
        public static C3930a m4943a(byte[] bArr) throws C3318d {
            return (C3930a) C3365e.m3062a(new C3930a(), bArr);
        }
    }
}
