package p042cz.msebera.android.httpclient.protocol;

import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpResponse;

/* renamed from: cz.msebera.android.httpclient.protocol.HttpExpectationVerifier */
public interface HttpExpectationVerifier {
    void verify(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) throws HttpException;
}
