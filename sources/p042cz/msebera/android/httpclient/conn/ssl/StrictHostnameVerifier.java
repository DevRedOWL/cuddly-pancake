package p042cz.msebera.android.httpclient.conn.ssl;

import javax.net.ssl.SSLException;

/* renamed from: cz.msebera.android.httpclient.conn.ssl.StrictHostnameVerifier */
public class StrictHostnameVerifier extends AbstractVerifier {
    public final String toString() {
        return "STRICT";
    }

    public final void verify(String str, String[] strArr, String[] strArr2) throws SSLException {
        verify(str, strArr, strArr2, true);
    }
}
