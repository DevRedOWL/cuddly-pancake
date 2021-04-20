package p042cz.msebera.android.httpclient.impl.client;

import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import p042cz.msebera.android.httpclient.HttpHost;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.HttpStatus;
import p042cz.msebera.android.httpclient.auth.AuthScheme;
import p042cz.msebera.android.httpclient.auth.MalformedChallengeException;
import p042cz.msebera.android.httpclient.client.config.RequestConfig;
import p042cz.msebera.android.httpclient.protocol.HttpContext;

/* renamed from: cz.msebera.android.httpclient.impl.client.TargetAuthenticationStrategy */
public class TargetAuthenticationStrategy extends AuthenticationStrategyImpl {
    public static final TargetAuthenticationStrategy INSTANCE = new TargetAuthenticationStrategy();

    public /* bridge */ /* synthetic */ void authFailed(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        super.authFailed(httpHost, authScheme, httpContext);
    }

    public /* bridge */ /* synthetic */ void authSucceeded(HttpHost httpHost, AuthScheme authScheme, HttpContext httpContext) {
        super.authSucceeded(httpHost, authScheme, httpContext);
    }

    public /* bridge */ /* synthetic */ Map getChallenges(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) throws MalformedChallengeException {
        return super.getChallenges(httpHost, httpResponse, httpContext);
    }

    public /* bridge */ /* synthetic */ boolean isAuthenticationRequested(HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) {
        return super.isAuthenticationRequested(httpHost, httpResponse, httpContext);
    }

    public /* bridge */ /* synthetic */ Queue select(Map map, HttpHost httpHost, HttpResponse httpResponse, HttpContext httpContext) throws MalformedChallengeException {
        return super.select(map, httpHost, httpResponse, httpContext);
    }

    public TargetAuthenticationStrategy() {
        super(HttpStatus.SC_UNAUTHORIZED, "WWW-Authenticate");
    }

    /* access modifiers changed from: package-private */
    public Collection<String> getPreferredAuthSchemes(RequestConfig requestConfig) {
        return requestConfig.getTargetPreferredAuthSchemes();
    }
}
