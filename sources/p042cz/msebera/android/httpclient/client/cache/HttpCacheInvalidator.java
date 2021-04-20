package p042cz.msebera.android.httpclient.client.cache;

import p042cz.msebera.android.httpclient.HttpHost;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpResponse;

/* renamed from: cz.msebera.android.httpclient.client.cache.HttpCacheInvalidator */
public interface HttpCacheInvalidator {
    void flushInvalidatedCacheEntries(HttpHost httpHost, HttpRequest httpRequest);

    void flushInvalidatedCacheEntries(HttpHost httpHost, HttpRequest httpRequest, HttpResponse httpResponse);
}
