package p042cz.msebera.android.httpclient.client.methods;

import java.net.URI;

/* renamed from: cz.msebera.android.httpclient.client.methods.HttpHead */
public class HttpHead extends HttpRequestBase {
    public static final String METHOD_NAME = "HEAD";

    public String getMethod() {
        return "HEAD";
    }

    public HttpHead() {
    }

    public HttpHead(URI uri) {
        setURI(uri);
    }

    public HttpHead(String str) {
        setURI(URI.create(str));
    }
}
