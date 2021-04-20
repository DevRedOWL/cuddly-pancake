package p042cz.msebera.android.httpclient.impl.client;

import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.client.ConnectionBackoffStrategy;

/* renamed from: cz.msebera.android.httpclient.impl.client.NullBackoffStrategy */
public class NullBackoffStrategy implements ConnectionBackoffStrategy {
    public boolean shouldBackoff(HttpResponse httpResponse) {
        return false;
    }

    public boolean shouldBackoff(Throwable th) {
        return false;
    }
}
