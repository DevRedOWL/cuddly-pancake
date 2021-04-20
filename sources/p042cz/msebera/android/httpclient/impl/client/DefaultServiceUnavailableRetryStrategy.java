package p042cz.msebera.android.httpclient.impl.client;

import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.client.ServiceUnavailableRetryStrategy;
import p042cz.msebera.android.httpclient.protocol.HttpContext;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.impl.client.DefaultServiceUnavailableRetryStrategy */
public class DefaultServiceUnavailableRetryStrategy implements ServiceUnavailableRetryStrategy {
    private final int maxRetries;
    private final long retryInterval;

    public DefaultServiceUnavailableRetryStrategy(int i, int i2) {
        Args.positive(i, "Max retries");
        Args.positive(i2, "Retry interval");
        this.maxRetries = i;
        this.retryInterval = (long) i2;
    }

    public DefaultServiceUnavailableRetryStrategy() {
        this(1, 1000);
    }

    public boolean retryRequest(HttpResponse httpResponse, int i, HttpContext httpContext) {
        return i <= this.maxRetries && httpResponse.getStatusLine().getStatusCode() == 503;
    }

    public long getRetryInterval() {
        return this.retryInterval;
    }
}
