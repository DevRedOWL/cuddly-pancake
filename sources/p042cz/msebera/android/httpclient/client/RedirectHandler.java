package p042cz.msebera.android.httpclient.client;

import java.net.URI;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.ProtocolException;
import p042cz.msebera.android.httpclient.protocol.HttpContext;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.client.RedirectHandler */
public interface RedirectHandler {
    URI getLocationURI(HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException;

    boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext);
}
