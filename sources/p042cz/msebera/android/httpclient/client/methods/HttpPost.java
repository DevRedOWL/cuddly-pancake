package p042cz.msebera.android.httpclient.client.methods;

import java.net.URI;

/* renamed from: cz.msebera.android.httpclient.client.methods.HttpPost */
public class HttpPost extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "POST";

    public String getMethod() {
        return METHOD_NAME;
    }

    public HttpPost() {
    }

    public HttpPost(URI uri) {
        setURI(uri);
    }

    public HttpPost(String str) {
        setURI(URI.create(str));
    }
}
