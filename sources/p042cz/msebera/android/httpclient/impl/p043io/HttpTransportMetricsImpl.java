package p042cz.msebera.android.httpclient.impl.p043io;

import p042cz.msebera.android.httpclient.p044io.HttpTransportMetrics;

/* renamed from: cz.msebera.android.httpclient.impl.io.HttpTransportMetricsImpl */
public class HttpTransportMetricsImpl implements HttpTransportMetrics {
    private long bytesTransferred = 0;

    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public void setBytesTransferred(long j) {
        this.bytesTransferred = j;
    }

    public void incrementBytesTransferred(long j) {
        this.bytesTransferred += j;
    }

    public void reset() {
        this.bytesTransferred = 0;
    }
}
