package p042cz.msebera.android.httpclient.client.protocol;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.auth.AuthState;
import p042cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import p042cz.msebera.android.httpclient.protocol.HttpContext;
import p042cz.msebera.android.httpclient.util.Args;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.client.protocol.RequestTargetAuthentication */
public class RequestTargetAuthentication extends RequestAuthenticationBase {
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        Args.notNull(httpRequest, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        if (!httpRequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT") && !httpRequest.containsHeader("Authorization")) {
            AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
            if (authState == null) {
                this.log.debug("Target auth state not set in the context");
                return;
            }
            if (this.log.isDebugEnabled()) {
                HttpClientAndroidLog httpClientAndroidLog = this.log;
                httpClientAndroidLog.debug("Target auth state: " + authState.getState());
            }
            process(authState, httpRequest, httpContext);
        }
    }
}
