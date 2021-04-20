package p042cz.msebera.android.httpclient.impl.execchain;

import java.io.IOException;
import p042cz.msebera.android.httpclient.HttpException;
import p042cz.msebera.android.httpclient.client.methods.CloseableHttpResponse;
import p042cz.msebera.android.httpclient.client.methods.HttpExecutionAware;
import p042cz.msebera.android.httpclient.client.methods.HttpRequestWrapper;
import p042cz.msebera.android.httpclient.client.protocol.HttpClientContext;
import p042cz.msebera.android.httpclient.conn.routing.HttpRoute;

/* renamed from: cz.msebera.android.httpclient.impl.execchain.ClientExecChain */
public interface ClientExecChain {
    CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws IOException, HttpException;
}
