package p042cz.msebera.android.httpclient.client;

import p042cz.msebera.android.httpclient.conn.routing.HttpRoute;

/* renamed from: cz.msebera.android.httpclient.client.BackoffManager */
public interface BackoffManager {
    void backOff(HttpRoute httpRoute);

    void probe(HttpRoute httpRoute);
}
