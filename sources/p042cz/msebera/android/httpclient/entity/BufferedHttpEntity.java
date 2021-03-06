package p042cz.msebera.android.httpclient.entity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p042cz.msebera.android.httpclient.HttpEntity;
import p042cz.msebera.android.httpclient.util.Args;
import p042cz.msebera.android.httpclient.util.EntityUtils;

/* renamed from: cz.msebera.android.httpclient.entity.BufferedHttpEntity */
public class BufferedHttpEntity extends HttpEntityWrapper {
    private final byte[] buffer;

    public boolean isRepeatable() {
        return true;
    }

    public BufferedHttpEntity(HttpEntity httpEntity) throws IOException {
        super(httpEntity);
        if (!httpEntity.isRepeatable() || httpEntity.getContentLength() < 0) {
            this.buffer = EntityUtils.toByteArray(httpEntity);
        } else {
            this.buffer = null;
        }
    }

    public long getContentLength() {
        byte[] bArr = this.buffer;
        if (bArr != null) {
            return (long) bArr.length;
        }
        return super.getContentLength();
    }

    public InputStream getContent() throws IOException {
        byte[] bArr = this.buffer;
        if (bArr != null) {
            return new ByteArrayInputStream(bArr);
        }
        return super.getContent();
    }

    public boolean isChunked() {
        return this.buffer == null && super.isChunked();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        Args.notNull(outputStream, "Output stream");
        byte[] bArr = this.buffer;
        if (bArr != null) {
            outputStream.write(bArr);
        } else {
            super.writeTo(outputStream);
        }
    }

    public boolean isStreaming() {
        return this.buffer == null && super.isStreaming();
    }
}
