package p042cz.msebera.android.httpclient.client.protocol;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpEntity;
import p042cz.msebera.android.httpclient.HttpEntityEnclosingRequest;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpRequestInterceptor;
import p042cz.msebera.android.httpclient.HttpVersion;
import p042cz.msebera.android.httpclient.ProtocolVersion;
import p042cz.msebera.android.httpclient.protocol.HTTP;
import p042cz.msebera.android.httpclient.protocol.HttpContext;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.client.protocol.RequestExpectContinue */
public class RequestExpectContinue implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        Args.notNull(httpRequest, "HTTP request");
        if (!httpRequest.containsHeader("Expect") && (httpRequest instanceof HttpEntityEnclosingRequest)) {
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            if (entity != null && entity.getContentLength() != 0 && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0) && HttpClientContext.adapt(httpContext).getRequestConfig().isExpectContinueEnabled()) {
                httpRequest.addHeader("Expect", HTTP.EXPECT_CONTINUE);
            }
        }
    }
}
