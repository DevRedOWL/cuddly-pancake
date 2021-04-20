package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.play.core.assetpacks.bm */
final class C2158bm extends OutputStream {

    /* renamed from: a */
    private final C2185cm f1661a = new C2185cm();

    /* renamed from: b */
    private final File f1662b;

    /* renamed from: c */
    private final C2198cz f1663c;

    /* renamed from: d */
    private long f1664d;

    /* renamed from: e */
    private long f1665e;

    /* renamed from: f */
    private FileOutputStream f1666f;

    /* renamed from: g */
    private C2204de f1667g;

    C2158bm(File file, C2198cz czVar) {
        this.f1662b = file;
        this.f1663c = czVar;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            if (this.f1664d == 0 && this.f1665e == 0) {
                int a = this.f1661a.mo33731a(bArr, i, i2);
                if (a != -1) {
                    i += a;
                    i2 -= a;
                    this.f1667g = this.f1661a.mo33732b();
                    if (this.f1667g.mo33773h()) {
                        this.f1664d = 0;
                        this.f1663c.mo33762m(this.f1667g.mo33775i(), this.f1667g.mo33775i().length);
                        this.f1665e = (long) this.f1667g.mo33775i().length;
                    } else if (!this.f1667g.mo33767c() || this.f1667g.mo33766b()) {
                        byte[] i4 = this.f1667g.mo33775i();
                        this.f1663c.mo33762m(i4, i4.length);
                        this.f1664d = this.f1667g.mo33769e();
                    } else {
                        this.f1663c.mo33756g(this.f1667g.mo33775i());
                        File file = new File(this.f1662b, this.f1667g.mo33768d());
                        file.getParentFile().mkdirs();
                        this.f1664d = this.f1667g.mo33769e();
                        this.f1666f = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f1667g.mo33766b()) {
                if (this.f1667g.mo33773h()) {
                    this.f1663c.mo33758i(this.f1665e, bArr, i, i2);
                    this.f1665e += (long) i2;
                    i3 = i2;
                } else if (this.f1667g.mo33767c()) {
                    i3 = (int) Math.min((long) i2, this.f1664d);
                    this.f1666f.write(bArr, i, i3);
                    long j = this.f1664d - ((long) i3);
                    this.f1664d = j;
                    if (j == 0) {
                        this.f1666f.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.f1664d);
                    int length = this.f1667g.mo33775i().length;
                    this.f1663c.mo33758i((((long) length) + this.f1667g.mo33769e()) - this.f1664d, bArr, i, i3);
                    this.f1664d -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
