package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.play.core.assetpacks.au */
final class C2139au extends InputStream {

    /* renamed from: a */
    private final InputStream f1565a;

    /* renamed from: b */
    private long f1566b;

    C2139au(InputStream inputStream, long j) {
        this.f1565a = inputStream;
        this.f1566b = j;
    }

    public final void close() throws IOException {
        super.close();
        this.f1565a.close();
        this.f1566b = 0;
    }

    public final int read() throws IOException {
        long j = this.f1566b;
        if (j <= 0) {
            return -1;
        }
        this.f1566b = j - 1;
        return this.f1565a.read();
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f1566b;
        if (j <= 0) {
            return -1;
        }
        int read = this.f1565a.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f1566b -= (long) read;
        }
        return read;
    }
}
