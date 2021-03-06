package p042cz.msebera.android.httpclient.protocol;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpEntity;
import p042cz.msebera.android.httpclient.HttpEntityEnclosingRequest;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpRequestInterceptor;
import p042cz.msebera.android.httpclient.HttpVersion;
import p042cz.msebera.android.httpclient.ProtocolVersion;
import p042cz.msebera.android.httpclient.params.CoreProtocolPNames;
import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.protocol.RequestExpectContinue */
public class RequestExpectContinue implements HttpRequestInterceptor {
    private final boolean activeByDefault;

    @Deprecated
    public RequestExpectContinue() {
        this(false);
    }

    public RequestExpectContinue(boolean z) {
        this.activeByDefault = z;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        Args.notNull(httpRequest, "HTTP request");
        if (!httpRequest.containsHeader("Expect") && (httpRequest instanceof HttpEntityEnclosingRequest)) {
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            HttpEntity entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity();
            if (entity != null && entity.getContentLength() != 0 && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0) && httpRequest.getParams().getBooleanParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, this.activeByDefault)) {
                httpRequest.addHeader("Expect", HTTP.EXPECT_CONTINUE);
            }
        }
    }
}
