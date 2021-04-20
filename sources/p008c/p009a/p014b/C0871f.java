package p008c.p009a.p014b;

import java.util.Arrays;
import p008c.p009a.p014b.C0878g;
import p008c.p009a.p031f.C0985a;
import p008c.p009a.p031f.C0986b;

/* renamed from: c.a.b.f */
public interface C0871f {

    /* renamed from: c.a.b.f$a */
    public static abstract class C0872a {

        /* renamed from: a */
        public final int f840a;

        /* renamed from: b */
        public final int f841b;

        /* renamed from: c */
        public final int f842c;

        /* renamed from: d */
        public final C0876b f843d;

        /* renamed from: e */
        public byte[] f844e;

        /* renamed from: f */
        public int f845f;

        /* renamed from: g */
        public int f846g;

        /* renamed from: h */
        public int f847h;

        /* renamed from: i */
        public C0875c f848i;

        /* renamed from: j */
        public final C0875c f849j = new C0873a();

        /* renamed from: k */
        public final C0875c f850k = new C0874b();

        /* renamed from: c.a.b.f$a$a */
        public class C0873a implements C0875c {
            public C0873a() {
            }

            /* renamed from: a */
            public boolean mo12967a() {
                C0872a aVar = C0872a.this;
                byte[] bArr = aVar.f844e;
                int i = aVar.f846g;
                if (((C0878g.C0879a.C0881b) aVar) == null) {
                    throw null;
                } else if (16 > aVar.f842c) {
                    return false;
                } else {
                    aVar.f847h = aVar.f840a + 16;
                    aVar.f848i = aVar.f850k;
                    "Header found, expect " + String.valueOf(C0872a.this.f847h) + " bytes";
                    return true;
                }
            }
        }

        /* renamed from: c.a.b.f$a$b */
        public class C0874b implements C0875c {
            public C0874b() {
            }

            /* renamed from: a */
            public boolean mo12967a() {
                byte b;
                C0872a aVar = C0872a.this;
                byte[] bArr = aVar.f844e;
                int i = aVar.f846g;
                if (((C0878g.C0879a.C0881b) aVar) != null) {
                    boolean z = i >= 18 && (C0985a.f1121b.mo13041a(bArr, 0, 16) & 255) == (bArr[17] & 255);
                    if (z) {
                        C0872a aVar2 = C0872a.this;
                        C0876b bVar = aVar2.f843d;
                        byte[] bArr2 = aVar2.f844e;
                        int i2 = aVar2.f846g;
                        C0878g.C0879a.C0880a aVar3 = (C0878g.C0879a.C0880a) bVar;
                        if (C0878g.C0879a.this.f856b != null && i2 - 0 >= 18) {
                            byte[] bArr3 = new byte[16];
                            System.arraycopy(bArr2, 1, bArr3, 0, 16);
                            byte[] a = C0986b.m580a(C0878g.C0879a.this.f855a, bArr3);
                            if (a.length == 16 && (b = a[1] & 255) <= 16) {
                                byte a2 = C0985a.f1121b.mo13041a(a, 2, b + 1) & 255;
                                int i3 = b + 2;
                                if (a2 == (a[i3] & 255)) {
                                    C0878g.C0879a.this.f856b.mo12949a(Arrays.copyOfRange(a, 2, i3));
                                }
                            }
                        }
                        C0872a.this.mo12965a();
                    }
                    return z;
                }
                throw null;
            }
        }

        /* renamed from: c.a.b.f$a$c */
        public interface C0875c {
            /* renamed from: a */
            boolean mo12967a();
        }

        public C0872a(byte b, int i, int i2, int i3, C0876b bVar) {
            this.f843d = bVar;
            this.f841b = i;
            this.f840a = i2;
            this.f842c = i3;
            this.f845f = 1024;
            byte[] bArr = new byte[1024];
            this.f844e = bArr;
            bArr[0] = b;
            mo12965a();
        }

        /* renamed from: a */
        public final void mo12965a() {
            this.f846g = 0;
            this.f847h = this.f841b - 1;
            this.f848i = this.f849j;
        }

        /* renamed from: a */
        public final void mo12966a(byte[] bArr, int i, int i2) {
            "parse: " + String.valueOf(i2) + ", " + String.valueOf(i2);
            if (i2 != 0) {
                if (this.f846g == 0) {
                    byte b = this.f844e[0];
                    int i3 = i + i2;
                    int i4 = i;
                    while (i4 < i3 && bArr[i4] != b) {
                        i4++;
                    }
                    int i5 = i4 - i;
                    if (i5 != 0 && ((C0878g.C0879a.C0880a) this.f843d) == null) {
                        throw null;
                    } else if (i5 != i2) {
                        this.f846g++;
                        mo12966a(bArr, i4 + 1, (i2 - i5) - 1);
                    }
                } else {
                    int min = Math.min(i2, this.f847h);
                    int i6 = this.f846g + min;
                    int i7 = this.f845f;
                    if (i6 > i7) {
                        int max = Math.max(i7 * 2, i6);
                        this.f845f = max;
                        this.f844e = new byte[max];
                    }
                    System.arraycopy(bArr, i, this.f844e, this.f846g, min);
                    this.f846g += min;
                    int i8 = this.f847h - min;
                    this.f847h = i8;
                    if (i8 == 0 && !this.f848i.mo12967a()) {
                        if (((C0878g.C0879a.C0880a) this.f843d) != null) {
                            int i9 = this.f846g;
                            mo12965a();
                            mo12966a(this.f844e, 1, i9 - 1);
                        } else {
                            throw null;
                        }
                    }
                    mo12966a(bArr, i + min, i2 - min);
                }
            }
        }
    }

    /* renamed from: c.a.b.f$b */
    public interface C0876b {
    }

    /* renamed from: c.a.b.f$c */
    public interface C0877c {
        /* renamed from: a */
        void mo12949a(byte[] bArr);
    }
}
