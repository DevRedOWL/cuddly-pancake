package p042cz.msebera.android.httpclient.auth.params;

import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.protocol.HTTP;
import p042cz.msebera.android.httpclient.util.Args;

@Deprecated
/* renamed from: cz.msebera.android.httpclient.auth.params.AuthParams */
public final class AuthParams {
    private AuthParams() {
    }

    public static String getCredentialCharset(HttpParams httpParams) {
        Args.notNull(httpParams, "HTTP parameters");
        String str = (String) httpParams.getParameter(AuthPNames.CREDENTIAL_CHARSET);
        return str == null ? HTTP.DEF_PROTOCOL_CHARSET.name() : str;
    }

    public static void setCredentialCharset(HttpParams httpParams, String str) {
        Args.notNull(httpParams, "HTTP parameters");
        httpParams.setParameter(AuthPNames.CREDENTIAL_CHARSET, str);
    }
}
