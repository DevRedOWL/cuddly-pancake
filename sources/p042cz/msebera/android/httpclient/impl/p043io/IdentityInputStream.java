package p042cz.msebera.android.httpclient.impl.p043io;

import java.io.IOException;
import java.io.InputStream;
import p042cz.msebera.android.httpclient.p044io.BufferInfo;
import p042cz.msebera.android.httpclient.p044io.SessionInputBuffer;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.io.IdentityInputStream */
public class IdentityInputStream extends InputStream {
    private boolean closed = false;

    /* renamed from: in */
    private final SessionInputBuffer f5704in;

    public IdentityInputStream(SessionInputBuffer sessionInputBuffer) {
        this.f5704in = (SessionInputBuffer) Args.notNull(sessionInputBuffer, "Session input buffer");
    }

    public int available() throws IOException {
        SessionInputBuffer sessionInputBuffer = this.f5704in;
        if (sessionInputBuffer instanceof BufferInfo) {
            return ((BufferInfo) sessionInputBuffer).length();
        }
        return 0;
    }

    public void close() throws IOException {
        this.closed = true;
    }

    public int read() throws IOException {
        if (this.closed) {
            return -1;
        }
        return this.f5704in.read();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            return -1;
        }
        return this.f5704in.read(bArr, i, i2);
    }
}
