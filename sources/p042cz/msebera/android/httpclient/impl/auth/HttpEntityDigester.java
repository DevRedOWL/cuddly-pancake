package p042cz.msebera.android.httpclient.impl.auth;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* renamed from: cz.msebera.android.httpclient.impl.auth.HttpEntityDigester */
class HttpEntityDigester extends OutputStream {
    private boolean closed;
    private byte[] digest;
    private final MessageDigest digester;

    HttpEntityDigester(MessageDigest messageDigest) {
        this.digester = messageDigest;
        this.digester.reset();
    }

    public void write(int i) throws IOException {
        if (!this.closed) {
            this.digester.update((byte) i);
            return;
        }
        throw new IOException("Stream has been already closed");
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.closed) {
            this.digester.update(bArr, i, i2);
            return;
        }
        throw new IOException("Stream has been already closed");
    }

    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.digest = this.digester.digest();
            super.close();
        }
    }

    public byte[] getDigest() {
        return this.digest;
    }
}
