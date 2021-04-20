package p042cz.msebera.android.httpclient.impl.client.cache;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import p042cz.msebera.android.httpclient.client.cache.Resource;

/* renamed from: cz.msebera.android.httpclient.impl.client.cache.HeapResource */
public class HeapResource implements Resource {
    private static final long serialVersionUID = -2078599905620463394L;

    /* renamed from: b */
    private final byte[] f5695b;

    public void dispose() {
    }

    public HeapResource(byte[] bArr) {
        this.f5695b = bArr;
    }

    /* access modifiers changed from: package-private */
    public byte[] getByteArray() {
        return this.f5695b;
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(this.f5695b);
    }

    public long length() {
        return (long) this.f5695b.length;
    }
}
