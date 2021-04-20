package p042cz.msebera.android.httpclient.impl.client;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.net.URI;
import java.net.URISyntaxException;
import p042cz.msebera.android.httpclient.Header;
import p042cz.msebera.android.httpclient.HttpHost;
import p042cz.msebera.android.httpclient.HttpRequest;
import p042cz.msebera.android.httpclient.HttpResponse;
import p042cz.msebera.android.httpclient.HttpStatus;
import p042cz.msebera.android.httpclient.ProtocolException;
import p042cz.msebera.android.httpclient.client.CircularRedirectException;
import p042cz.msebera.android.httpclient.client.RedirectHandler;
import p042cz.msebera.android.httpclient.client.params.ClientPNames;
import p042cz.msebera.android.httpclient.client.utils.URIUtils;
import p042cz.msebera.android.httpclient.extras.HttpClientAndroidLog;
import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.protocol.HttpContext;
import p042cz.msebera.android.httpclient.util.Args;
import p042cz.msebera.android.httpclient.util.Asserts;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.impl.client.DefaultRedirectHandler */
public class DefaultRedirectHandler implements RedirectHandler {
    private static final String REDIRECT_LOCATIONS = "http.protocol.redirect-locations";
    public HttpClientAndroidLog log = new HttpClientAndroidLog(getClass());

    public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
        Args.notNull(httpResponse, "HTTP response");
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode != 307) {
            switch (statusCode) {
                case 301:
                case HttpStatus.SC_MOVED_TEMPORARILY:
                    break;
                case HttpStatus.SC_SEE_OTHER:
                    return true;
                default:
                    return false;
            }
        }
        String method = ((HttpRequest) httpContext.getAttribute("http.request")).getRequestLine().getMethod();
        if (method.equalsIgnoreCase("GET") || method.equalsIgnoreCase("HEAD")) {
            return true;
        }
        return false;
    }

    public URI getLocationURI(HttpResponse httpResponse, HttpContext httpContext) throws ProtocolException {
        URI uri;
        Args.notNull(httpResponse, "HTTP response");
        Header firstHeader = httpResponse.getFirstHeader(FirebaseAnalytics.Param.LOCATION);
        if (firstHeader != null) {
            String value = firstHeader.getValue();
            if (this.log.isDebugEnabled()) {
                HttpClientAndroidLog httpClientAndroidLog = this.log;
                httpClientAndroidLog.debug("Redirect requested to location '" + value + "'");
            }
            try {
                URI uri2 = new URI(value);
                HttpParams params = httpResponse.getParams();
                if (!uri2.isAbsolute()) {
                    if (!params.isParameterTrue(ClientPNames.REJECT_RELATIVE_REDIRECT)) {
                        HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
                        Asserts.notNull(httpHost, "Target host");
                        try {
                            uri2 = URIUtils.resolve(URIUtils.rewriteURI(new URI(((HttpRequest) httpContext.getAttribute("http.request")).getRequestLine().getUri()), httpHost, true), uri2);
                        } catch (URISyntaxException e) {
                            throw new ProtocolException(e.getMessage(), e);
                        }
                    } else {
                        throw new ProtocolException("Relative redirect location '" + uri2 + "' not allowed");
                    }
                }
                if (params.isParameterFalse(ClientPNames.ALLOW_CIRCULAR_REDIRECTS)) {
                    RedirectLocations redirectLocations = (RedirectLocations) httpContext.getAttribute("http.protocol.redirect-locations");
                    if (redirectLocations == null) {
                        redirectLocations = new RedirectLocations();
                        httpContext.setAttribute("http.protocol.redirect-locations", redirectLocations);
                    }
                    if (uri2.getFragment() != null) {
                        try {
                            uri = URIUtils.rewriteURI(uri2, new HttpHost(uri2.getHost(), uri2.getPort(), uri2.getScheme()), true);
                        } catch (URISyntaxException e2) {
                            throw new ProtocolException(e2.getMessage(), e2);
                        }
                    } else {
                        uri = uri2;
                    }
                    if (!redirectLocations.contains(uri)) {
                        redirectLocations.add(uri);
                    } else {
                        throw new CircularRedirectException("Circular redirect to '" + uri + "'");
                    }
                }
                return uri2;
            } catch (URISyntaxException e3) {
                throw new ProtocolException("Invalid redirect URI: " + value, e3);
            }
        } else {
            throw new ProtocolException("Received redirect response " + httpResponse.getStatusLine() + " but no location header");
        }
    }
}
