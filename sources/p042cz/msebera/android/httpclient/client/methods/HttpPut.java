package p042cz.msebera.android.httpclient.client.methods;

import java.net.URI;

/* renamed from: cz.msebera.android.httpclient.client.methods.HttpPut */
public class HttpPut extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "PUT";

    public String getMethod() {
        return "PUT";
    }

    public HttpPut() {
    }

    public HttpPut(URI uri) {
        setURI(uri);
    }

    public HttpPut(String str) {
        setURI(URI.create(str));
    }
}
