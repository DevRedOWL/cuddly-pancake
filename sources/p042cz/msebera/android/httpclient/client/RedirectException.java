package p042cz.msebera.android.httpclient.client;

import p042cz.msebera.android.httpclient.ProtocolException;

/* renamed from: cz.msebera.android.httpclient.client.RedirectException */
public class RedirectException extends ProtocolException {
    private static final long serialVersionUID = 4418824536372559326L;

    public RedirectException() {
    }

    public RedirectException(String str) {
        super(str);
    }

    public RedirectException(String str, Throwable th) {
        super(str, th);
    }
}
