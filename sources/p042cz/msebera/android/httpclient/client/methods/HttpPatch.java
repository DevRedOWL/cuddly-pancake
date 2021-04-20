package p042cz.msebera.android.httpclient.client.methods;

import java.net.URI;

/* renamed from: cz.msebera.android.httpclient.client.methods.HttpPatch */
public class HttpPatch extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "PATCH";

    public String getMethod() {
        return METHOD_NAME;
    }

    public HttpPatch() {
    }

    public HttpPatch(URI uri) {
        setURI(uri);
    }

    public HttpPatch(String str) {
        setURI(URI.create(str));
    }
}
