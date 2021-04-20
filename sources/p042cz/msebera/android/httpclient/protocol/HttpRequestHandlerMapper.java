package p042cz.msebera.android.httpclient.protocol;

import p042cz.msebera.android.httpclient.HttpRequest;

/* renamed from: cz.msebera.android.httpclient.protocol.HttpRequestHandlerMapper */
public interface HttpRequestHandlerMapper {
    HttpRequestHandler lookup(HttpRequest httpRequest);
}
