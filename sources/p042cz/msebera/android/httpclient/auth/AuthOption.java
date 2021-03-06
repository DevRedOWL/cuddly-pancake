package p042cz.msebera.android.httpclient.auth;

import p042cz.msebera.android.httpclient.util.Args;

/* renamed from: cz.msebera.android.httpclient.auth.AuthOption */
public final class AuthOption {
    private final AuthScheme authScheme;
    private final Credentials creds;

    public AuthOption(AuthScheme authScheme2, Credentials credentials) {
        Args.notNull(authScheme2, "Auth scheme");
        Args.notNull(credentials, "User credentials");
        this.authScheme = authScheme2;
        this.creds = credentials;
    }

    public AuthScheme getAuthScheme() {
        return this.authScheme;
    }

    public Credentials getCredentials() {
        return this.creds;
    }

    public String toString() {
        return this.authScheme.toString();
    }
}
