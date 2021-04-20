package p042cz.msebera.android.httpclient.impl.auth;

import p042cz.msebera.android.httpclient.auth.AuthScheme;
import p042cz.msebera.android.httpclient.auth.AuthSchemeFactory;
import p042cz.msebera.android.httpclient.auth.AuthSchemeProvider;
import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.protocol.HttpContext;

/* renamed from: cz.msebera.android.httpclient.impl.auth.NTLMSchemeFactory */
public class NTLMSchemeFactory implements AuthSchemeFactory, AuthSchemeProvider {
    public AuthScheme newInstance(HttpParams httpParams) {
        return new NTLMScheme();
    }

    public AuthScheme create(HttpContext httpContext) {
        return new NTLMScheme();
    }
}
