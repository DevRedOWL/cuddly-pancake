package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* renamed from: com.google.android.play.core.assetpacks.cl */
public final class C2184cl extends InputStream {

    /* renamed from: a */
    private final Enumeration<File> f1747a;

    /* renamed from: b */
    private InputStream f1748b;

    public C2184cl(Enumeration<File> enumeration) throws IOException {
        this.f1747a = enumeration;
        mo33727a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo33727a() throws IOException {
        InputStream inputStream = this.f1748b;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f1748b = this.f1747a.hasMoreElements() ? new FileInputStream(this.f1747a.nextElement()) : null;
    }

    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f1748b;
        if (inputStream != null) {
            inputStream.close();
            this.f1748b = null;
        }
    }

    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f1748b;
            if (inputStream == null) {
                return -1;
            }
            int read = inputStream.read();
            if (read != -1) {
                return read;
            }
            mo33727a();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f1748b == null) {
            return -1;
        }
        if (bArr == null) {
            throw null;
        } else if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f1748b.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo33727a();
            } while (this.f1748b != null);
            return -1;
        }
    }
}
