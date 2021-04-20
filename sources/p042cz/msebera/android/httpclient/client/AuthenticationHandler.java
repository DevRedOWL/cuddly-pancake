package p042cz.msebera.android.httpclient.client;

import java.util.Map;
import p042cz.msebera.android.httpclient.Header;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.auth.AuthScheme;
import p042cz.msebera.android.httpclient.auth.AuthenticationException;
import p042cz.msebera.android.httpclient.auth.MalformedChallengeException;
import p042cz.msebera.android.httpclient.protocol.HttpContext;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.client.AuthenticationHandler */
public interface AuthenticationHandler {
    Map<String, Header> getChallenges(HttpResponse httpResponse, HttpContext httpContext) throws MalformedChallengeException;

    boolean isAuthenticationRequested(HttpResponse httpResponse, HttpContext httpContext);

    AuthScheme selectScheme(Map<String, Header> map, HttpResponse httpResponse, HttpContext httpContext) throws AuthenticationException;
}
