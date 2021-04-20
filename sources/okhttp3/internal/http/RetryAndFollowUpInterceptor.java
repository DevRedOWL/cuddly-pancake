package okhttp3.internal.http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Transmitter;
import p042cz.msebera.android.httpclient.HttpHeaders;
import p042cz.msebera.android.httpclient.HttpStatus;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo51343d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", "method", "", "followUpRequest", "route", "Lokhttp3/Route;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", "", "e", "Ljava/io/IOException;", "requestSendStarted", "recover", "transmitter", "Lokhttp3/internal/connection/Transmitter;", "userRequest", "requestIsOneShot", "retryAfter", "", "defaultDelay", "Companion", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* compiled from: RetryAndFollowUpInterceptor.kt */
public final class RetryAndFollowUpInterceptor implements Interceptor {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int MAX_FOLLOW_UPS = 20;
    private final OkHttpClient client;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        Intrinsics.checkParameterIsNotNull(okHttpClient, "client");
        this.client = okHttpClient;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r1.exchangeDoneDueToException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        r6 = r0.connection();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            okhttp3.Request r0 = r9.request()
            okhttp3.internal.http.RealInterceptorChain r9 = (okhttp3.internal.http.RealInterceptorChain) r9
            okhttp3.internal.connection.Transmitter r1 = r9.transmitter()
            r2 = 0
            r3 = r2
            okhttp3.Response r3 = (okhttp3.Response) r3
            r4 = 0
            r5 = 0
        L_0x0015:
            r1.prepareToConnect(r0)
            boolean r6 = r1.isCanceled()
            if (r6 != 0) goto L_0x00d4
            okhttp3.Response r0 = r9.proceed(r0, r1, r2)     // Catch:{ RouteException -> 0x00b9, IOException -> 0x00a7 }
            if (r3 == 0) goto L_0x003c
            okhttp3.Response$Builder r0 = r0.newBuilder()
            okhttp3.Response$Builder r3 = r3.newBuilder()
            okhttp3.Response$Builder r3 = r3.body(r2)
            okhttp3.Response r3 = r3.build()
            okhttp3.Response$Builder r0 = r0.priorResponse(r3)
            okhttp3.Response r0 = r0.build()
        L_0x003c:
            r3 = r0
            okhttp3.internal.connection.Exchange r0 = r3.exchange()
            if (r0 == 0) goto L_0x004e
            okhttp3.internal.connection.RealConnection r6 = r0.connection()
            if (r6 == 0) goto L_0x004e
            okhttp3.Route r6 = r6.route()
            goto L_0x004f
        L_0x004e:
            r6 = r2
        L_0x004f:
            okhttp3.Request r6 = r8.followUpRequest(r3, r6)
            if (r6 != 0) goto L_0x0061
            if (r0 == 0) goto L_0x0060
            boolean r9 = r0.isDuplex()
            if (r9 == 0) goto L_0x0060
            r1.timeoutEarlyExit()
        L_0x0060:
            return r3
        L_0x0061:
            okhttp3.RequestBody r7 = r6.body()
            if (r7 == 0) goto L_0x006e
            boolean r7 = r7.isOneShot()
            if (r7 == 0) goto L_0x006e
            return r3
        L_0x006e:
            okhttp3.ResponseBody r7 = r3.body()
            if (r7 == 0) goto L_0x0079
            java.io.Closeable r7 = (java.io.Closeable) r7
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r7)
        L_0x0079:
            boolean r7 = r1.hasExchange()
            if (r7 == 0) goto L_0x0084
            if (r0 == 0) goto L_0x0084
            r0.detachWithViolence()
        L_0x0084:
            int r5 = r5 + 1
            r0 = 20
            if (r5 > r0) goto L_0x008c
            r0 = r6
            goto L_0x0015
        L_0x008c:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Too many follow-up requests: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x00a5:
            r9 = move-exception
            goto L_0x00d0
        L_0x00a7:
            r6 = move-exception
            boolean r7 = r6 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x00a5 }
            if (r7 != 0) goto L_0x00ae
            r7 = 1
            goto L_0x00af
        L_0x00ae:
            r7 = 0
        L_0x00af:
            boolean r7 = r8.recover(r6, r1, r7, r0)     // Catch:{ all -> 0x00a5 }
            if (r7 == 0) goto L_0x00b6
            goto L_0x00c4
        L_0x00b6:
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00a5 }
            throw r6     // Catch:{ all -> 0x00a5 }
        L_0x00b9:
            r6 = move-exception
            java.io.IOException r7 = r6.getLastConnectException()     // Catch:{ all -> 0x00a5 }
            boolean r7 = r8.recover(r7, r1, r4, r0)     // Catch:{ all -> 0x00a5 }
            if (r7 == 0) goto L_0x00c9
        L_0x00c4:
            r1.exchangeDoneDueToException()
            goto L_0x0015
        L_0x00c9:
            java.io.IOException r9 = r6.getFirstConnectException()     // Catch:{ all -> 0x00a5 }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x00a5 }
            throw r9     // Catch:{ all -> 0x00a5 }
        L_0x00d0:
            r1.exchangeDoneDueToException()
            throw r9
        L_0x00d4:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r9.<init>(r0)
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    private final boolean recover(IOException iOException, Transmitter transmitter, boolean z, Request request) {
        if (!this.client.retryOnConnectionFailure()) {
            return false;
        }
        if ((!z || !requestIsOneShot(iOException, request)) && isRecoverable(iOException, z) && transmitter.canRetry()) {
            return true;
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException iOException, Request request) {
        RequestBody body = request.body();
        return (body != null && body.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    private final boolean isRecoverable(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    private final Request followUpRequest(Response response, Route route) throws IOException {
        int code = response.code();
        String method = response.request().method();
        if (code == 307 || code == 308) {
            if (!(!Intrinsics.areEqual((Object) method, (Object) "GET")) || !(!Intrinsics.areEqual((Object) method, (Object) "HEAD"))) {
                return buildRedirectRequest(response, method);
            }
            return null;
        } else if (code == 401) {
            return this.client.authenticator().authenticate(route, response);
        } else {
            if (code == 503) {
                Response priorResponse = response.priorResponse();
                if ((priorResponse == null || priorResponse.code() != 503) && retryAfter(response, Integer.MAX_VALUE) == 0) {
                    return response.request();
                }
                return null;
            } else if (code == 407) {
                if (route == null) {
                    Intrinsics.throwNpe();
                }
                if (route.proxy().type() == Proxy.Type.HTTP) {
                    return this.client.proxyAuthenticator().authenticate(route, response);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            } else if (code != 408) {
                switch (code) {
                    case 300:
                    case 301:
                    case HttpStatus.SC_MOVED_TEMPORARILY:
                    case HttpStatus.SC_SEE_OTHER:
                        return buildRedirectRequest(response, method);
                    default:
                        return null;
                }
            } else if (!this.client.retryOnConnectionFailure()) {
                return null;
            } else {
                RequestBody body = response.request().body();
                if (body != null && body.isOneShot()) {
                    return null;
                }
                Response priorResponse2 = response.priorResponse();
                if ((priorResponse2 == null || priorResponse2.code() != 408) && retryAfter(response, 0) <= 0) {
                    return response.request();
                }
                return null;
            }
        }
    }

    private final Request buildRedirectRequest(Response response, String str) {
        String header$default;
        HttpUrl resolve;
        RequestBody requestBody = null;
        if (!this.client.followRedirects() || (header$default = Response.header$default(response, HttpHeaders.LOCATION, (String) null, 2, (Object) null)) == null || (resolve = response.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!Intrinsics.areEqual((Object) resolve.scheme(), (Object) response.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        Request.Builder newBuilder = response.request().newBuilder();
        if (HttpMethod.permitsRequestBody(str)) {
            boolean redirectsWithBody = HttpMethod.INSTANCE.redirectsWithBody(str);
            if (HttpMethod.INSTANCE.redirectsToGet(str)) {
                newBuilder.method("GET", (RequestBody) null);
            } else {
                if (redirectsWithBody) {
                    requestBody = response.request().body();
                }
                newBuilder.method(str, requestBody);
            }
            if (!redirectsWithBody) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(response.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final int retryAfter(Response response, int i) {
        String header$default = Response.header$default(response, HttpHeaders.RETRY_AFTER, (String) null, 2, (Object) null);
        if (header$default == null) {
            return i;
        }
        if (!new Regex("\\d+").matches(header$default)) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(header$default);
        Intrinsics.checkExpressionValueIsNotNull(valueOf, "Integer.valueOf(header)");
        return valueOf.intValue();
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor$Companion;", "", "()V", "MAX_FOLLOW_UPS", "", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
    /* compiled from: RetryAndFollowUpInterceptor.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
