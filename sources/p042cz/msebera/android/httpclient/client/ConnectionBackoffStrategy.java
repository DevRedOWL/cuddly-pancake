package p042cz.msebera.android.httpclient.client;

import p042cz.msebera.android.httpclient.HttpResponse;

/* renamed from: cz.msebera.android.httpclient.client.ConnectionBackoffStrategy */
public interface ConnectionBackoffStrategy {
    boolean shouldBackoff(HttpResponse httpResponse);

    boolean shouldBackoff(Throwable th);
}
