package p042cz.msebera.android.httpclient.impl.client;

import p042cz.msebera.android.httpclient.conn.HttpClientConnectionManager;
import p042cz.msebera.android.httpclient.impl.conn.PoolingHttpClientConnectionManager;

/* renamed from: cz.msebera.android.httpclient.impl.client.HttpClients */
public class HttpClients {
    private HttpClients() {
    }

    public static HttpClientBuilder custom() {
        return HttpClientBuilder.create();
    }

    public static CloseableHttpClient createDefault() {
        return HttpClientBuilder.create().build();
    }

    public static CloseableHttpClient createSystem() {
        return HttpClientBuilder.create().useSystemProperties().build();
    }

    public static CloseableHttpClient createMinimal() {
        return new MinimalHttpClient(new PoolingHttpClientConnectionManager());
    }

    public static CloseableHttpClient createMinimal(HttpClientConnectionManager httpClientConnectionManager) {
        return new MinimalHttpClient(httpClientConnectionManager);
    }
}
