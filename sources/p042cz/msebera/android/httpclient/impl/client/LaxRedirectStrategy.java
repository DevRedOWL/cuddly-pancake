package p042cz.msebera.android.httpclient.impl.client;

import p042cz.msebera.android.httpclient.client.methods.HttpPost;

/* renamed from: cz.msebera.android.httpclient.impl.client.LaxRedirectStrategy */
public class LaxRedirectStrategy extends DefaultRedirectStrategy {
    private static final String[] REDIRECT_METHODS = {"GET", HttpPost.METHOD_NAME, "HEAD"};

    /* access modifiers changed from: protected */
    public boolean isRedirectable(String str) {
        for (String equalsIgnoreCase : REDIRECT_METHODS) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
