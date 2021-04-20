package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.google.android.play.core.assetpacks.bc */
final class C2148bc extends FilterInputStream {

    /* renamed from: a */
    private final C2185cm f1591a = new C2185cm();

    /* renamed from: b */
    private byte[] f1592b = new byte[4096];

    /* renamed from: c */
    private long f1593c;

    /* renamed from: d */
    private boolean f1594d = false;

    /* renamed from: e */
    private boolean f1595e = false;

    C2148bc(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: e */
    private final boolean m938e(int i) throws IOException {
        int f = m939f(this.f1592b, 0, i);
        if (f != i) {
            int i2 = i - f;
            if (m939f(this.f1592b, f, i2) != i2) {
                this.f1591a.mo33731a(this.f1592b, 0, f);
                return false;
            }
        }
        this.f1591a.mo33731a(this.f1592b, 0, i);
        return true;
    }

    /* renamed from: f */
    private final int m939f(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2204de mo33680a() throws IOException {
        byte[] bArr;
        if (this.f1593c > 0) {
            do {
                bArr = this.f1592b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f1594d || this.f1595e) {
            return new C2204de((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!m938e(30)) {
            this.f1594d = true;
            return this.f1591a.mo33732b();
        }
        C2204de b = this.f1591a.mo33732b();
        if (b.mo33773h()) {
            this.f1595e = true;
            return b;
        } else if (b.mo33769e() != 4294967295L) {
            int c = this.f1591a.mo33733c() - 30;
            long j = (long) c;
            int length = this.f1592b.length;
            if (j > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j);
                this.f1592b = Arrays.copyOf(this.f1592b, length);
            }
            if (!m938e(c)) {
                this.f1594d = true;
                return this.f1591a.mo33732b();
            }
            C2204de b2 = this.f1591a.mo33732b();
            this.f1593c = b2.mo33769e();
            return b2;
        } else {
            throw new C2155bj("Files bigger than 4GiB are not supported.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo33681b() {
        return this.f1594d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo33682c() {
        return this.f1595e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final long mo33683d() {
        return this.f1593c;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f1593c;
        if (j <= 0 || this.f1594d) {
            return -1;
        }
        int f = m939f(bArr, i, (int) Math.min(j, (long) i2));
        this.f1593c -= (long) f;
        if (f != 0) {
            return f;
        }
        this.f1594d = true;
        return 0;
    }
}
