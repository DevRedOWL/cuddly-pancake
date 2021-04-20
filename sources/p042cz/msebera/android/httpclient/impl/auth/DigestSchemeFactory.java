package p042cz.msebera.android.httpclient.impl.auth;

import java.nio.charset.Charset;
import p042cz.msebera.android.httpclient.auth.AuthScheme;
import p042cz.msebera.android.httpclient.auth.AuthSchemeFactory;
import p042cz.msebera.android.httpclient.auth.AuthSchemeProvider;
import p042cz.msebera.android.httpclient.params.HttpParams;
import p042cz.msebera.android.httpclient.protocol.HttpContext;

/* renamed from: cz.msebera.android.httpclient.impl.auth.DigestSchemeFactory */
public class DigestSchemeFactory implements AuthSchemeFactory, AuthSchemeProvider {
    private final Charset charset;

    public DigestSchemeFactory(Charset charset2) {
        this.charset = charset2;
    }

    public DigestSchemeFactory() {
        this((Charset) null);
    }

    public AuthScheme newInstance(HttpParams httpParams) {
        return new DigestScheme();
    }

    public AuthScheme create(HttpContext httpContext) {
        return new DigestScheme(this.charset);
    }
}
