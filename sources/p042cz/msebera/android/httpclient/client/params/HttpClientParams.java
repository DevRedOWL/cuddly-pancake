package p042cz.msebera.android.httpclient.client.params;

import p042cz.msebera.android.httpclient.params.HttpConnectionParams;
import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.util.Args;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.client.params.HttpClientParams */
public class HttpClientParams {
    private HttpClientParams() {
    }

    public static boolean isRedirecting(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(ClientPNames.HANDLE_REDIRECTS, true);
    }

    public static void setRedirecting(HttpParams httpParams, boolean z) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, z);
    }

    public static boolean isAuthenticating(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        return httpParams.getBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, true);
    }

    public static void setAuthenticating(HttpParams httpParams, boolean z) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, z);
    }

    public static String getCookiePolicy(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        String str = (String) httpParams.getParameter(ClientPNames.COOKIE_POLICY);
        return str == null ? "best-match" : str;
    }

    public static void setCookiePolicy(HttpParams httpParams, String str) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setParameter(ClientPNames.COOKIE_POLICY, str);
    }

    public static void setConnectionManagerTimeout(HttpParams httpParams, long j) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setLongParameter("http.conn-manager.timeout", j);
    }

    public static long getConnectionManagerTimeout(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        Long l = (Long) httpParams.getParameter("http.conn-manager.timeout");
        if (l != null) {
            return l.longValue();
        }
        return (long) HttpConnectionParams.getConnectionTimeout(httpParams);
    }
}
