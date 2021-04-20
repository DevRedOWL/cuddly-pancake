package okhttp3.internal.p053ws;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin._Assertions;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.RealCall;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.p053ws.WebSocketReader;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import p042cz.msebera.android.httpclient.HttpHeaders;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0006[\\]^_`B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020#2\u0006\u00101\u001a\u000202J\b\u00103\u001a\u00020/H\u0016J\u001f\u00104\u001a\u00020/2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0002\b9J\u001a\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u00010\u0017H\u0016J \u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u00010\u00172\u0006\u0010=\u001a\u00020\nJ\u000e\u0010>\u001a\u00020/2\u0006\u0010?\u001a\u00020@J\u001c\u0010A\u001a\u00020/2\n\u0010B\u001a\u00060Cj\u0002`D2\b\u00105\u001a\u0004\u0018\u000106J\u0016\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)J\u0006\u0010G\u001a\u00020/J\u0018\u0010H\u001a\u00020/2\u0006\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020\u0017H\u0016J\u0010\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020\u0017H\u0016J\u0010\u0010I\u001a\u00020/2\u0006\u0010K\u001a\u00020\u001eH\u0016J\u0010\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020\u001eH\u0016J\u0010\u0010N\u001a\u00020/2\u0006\u0010M\u001a\u00020\u001eH\u0016J\u000e\u0010O\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u001eJ\u0006\u0010P\u001a\u00020\rJ\b\u0010\u001f\u001a\u00020\nH\u0016J\u0006\u0010%\u001a\u00020#J\u0006\u0010&\u001a\u00020#J\b\u0010Q\u001a\u00020\u0004H\u0016J\b\u0010R\u001a\u00020/H\u0002J\u0010\u0010S\u001a\u00020\r2\u0006\u0010J\u001a\u00020\u0017H\u0016J\u0010\u0010S\u001a\u00020\r2\u0006\u0010K\u001a\u00020\u001eH\u0016J\u0018\u0010S\u001a\u00020\r2\u0006\u0010T\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020#H\u0002J\u0006\u0010'\u001a\u00020#J\u0006\u0010V\u001a\u00020/J\r\u0010W\u001a\u00020\rH\u0000¢\u0006\u0002\bXJ\r\u0010Y\u001a\u00020/H\u0000¢\u0006\u0002\bZR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0004¢\u0006\u0002\n\u0000¨\u0006a"}, mo51343d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "originalRequest", "Lokhttp3/Request;", "listener", "Lokhttp3/WebSocketListener;", "random", "Ljava/util/Random;", "pingIntervalMillis", "", "(Lokhttp3/Request;Lokhttp3/WebSocketListener;Ljava/util/Random;J)V", "awaitingPong", "", "call", "Lokhttp3/Call;", "cancelFuture", "Ljava/util/concurrent/ScheduledFuture;", "enqueuedClose", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "failed", "key", "", "getListener$okhttp", "()Lokhttp3/WebSocketListener;", "messageAndCloseQueue", "Ljava/util/ArrayDeque;", "", "pongQueue", "Lokio/ByteString;", "queueSize", "reader", "Lokhttp3/internal/ws/WebSocketReader;", "receivedCloseCode", "", "receivedCloseReason", "receivedPingCount", "receivedPongCount", "sentPingCount", "streams", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "writer", "Lokhttp3/internal/ws/WebSocketWriter;", "writerRunnable", "Ljava/lang/Runnable;", "awaitTermination", "", "timeout", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "cancel", "checkUpgradeSuccess", "response", "Lokhttp3/Response;", "exchange", "Lokhttp3/internal/connection/Exchange;", "checkUpgradeSuccess$okhttp", "close", "code", "reason", "cancelAfterCloseMillis", "connect", "client", "Lokhttp3/OkHttpClient;", "failWebSocket", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initReaderAndWriter", "name", "loopReader", "onReadClose", "onReadMessage", "text", "bytes", "onReadPing", "payload", "onReadPong", "pong", "processNextFrame", "request", "runWriter", "send", "data", "formatOpcode", "tearDown", "writeOneFrame", "writeOneFrame$okhttp", "writePingFrame", "writePingFrame$okhttp", "CancelRunnable", "Close", "Companion", "Message", "PingRunnable", "Streams", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
/* renamed from: okhttp3.internal.ws.RealWebSocket */
/* compiled from: RealWebSocket.kt */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    private static final long CANCEL_AFTER_CLOSE_MILLIS = 60000;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long MAX_QUEUE_SIZE = 16777216;
    private static final List<Protocol> ONLY_HTTP1 = CollectionsKt.listOf(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    private final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<ByteString> pongQueue = new ArrayDeque<>();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random2, long j) {
        Intrinsics.checkParameterIsNotNull(request, "originalRequest");
        Intrinsics.checkParameterIsNotNull(webSocketListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Intrinsics.checkParameterIsNotNull(random2, "random");
        this.originalRequest = request;
        this.listener = webSocketListener;
        this.random = random2;
        this.pingIntervalMillis = j;
        if (Intrinsics.areEqual((Object) "GET", (Object) this.originalRequest.method())) {
            ByteString.Companion companion = ByteString.Companion;
            byte[] bArr = new byte[16];
            this.random.nextBytes(bArr);
            this.key = ByteString.Companion.of$default(companion, bArr, 0, 0, 3, (Object) null).base64();
            this.writerRunnable = new Runnable(this) {
                final /* synthetic */ RealWebSocket this$0;

                {
                    this.this$0 = r1;
                }

                public final void run() {
                    do {
                        try {
                        } catch (IOException e) {
                            this.this$0.failWebSocket(e, (Response) null);
                            return;
                        }
                    } while (this.this$0.writeOneFrame$okhttp());
                }
            };
            return;
        }
        throw new IllegalArgumentException(("Request must be GET: " + this.originalRequest.method()).toString());
    }

    public final WebSocketListener getListener$okhttp() {
        return this.listener;
    }

    public Request request() {
        return this.originalRequest;
    }

    public synchronized long queueSize() {
        return this.queueSize;
    }

    public void cancel() {
        Call call2 = this.call;
        if (call2 == null) {
            Intrinsics.throwNpe();
        }
        call2.cancel();
    }

    public final void connect(OkHttpClient okHttpClient) {
        Intrinsics.checkParameterIsNotNull(okHttpClient, "client");
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        Request build2 = this.originalRequest.newBuilder().header(HttpHeaders.UPGRADE, "websocket").header("Connection", HttpHeaders.UPGRADE).header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        this.call = RealCall.Companion.newRealCall(build, build2, true);
        Call call2 = this.call;
        if (call2 == null) {
            Intrinsics.throwNpe();
        }
        call2.enqueue(new RealWebSocket$connect$1(this, build2));
    }

    public final void checkUpgradeSuccess$okhttp(Response response, Exchange exchange) throws IOException {
        Intrinsics.checkParameterIsNotNull(response, "response");
        if (response.code() == 101) {
            String header$default = Response.header$default(response, "Connection", (String) null, 2, (Object) null);
            if (StringsKt.equals(HttpHeaders.UPGRADE, header$default, true)) {
                String header$default2 = Response.header$default(response, HttpHeaders.UPGRADE, (String) null, 2, (Object) null);
                if (StringsKt.equals("websocket", header$default2, true)) {
                    String header$default3 = Response.header$default(response, "Sec-WebSocket-Accept", (String) null, 2, (Object) null);
                    ByteString.Companion companion = ByteString.Companion;
                    String base64 = companion.encodeUtf8(this.key + WebSocketProtocol.ACCEPT_MAGIC).sha1().base64();
                    if (!Intrinsics.areEqual((Object) base64, (Object) header$default3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header$default3 + '\'');
                    } else if (exchange == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header$default2 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header$default + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + ' ' + response.message() + '\'');
        }
    }

    public final void initReaderAndWriter(String str, Streams streams2) throws IOException {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(streams2, "streams");
        synchronized (this) {
            this.streams = streams2;
            this.writer = new WebSocketWriter(streams2.getClient(), streams2.getSink(), this.random);
            this.executor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
            if (this.pingIntervalMillis != 0) {
                ScheduledExecutorService scheduledExecutorService = this.executor;
                if (scheduledExecutorService == null) {
                    Intrinsics.throwNpe();
                }
                scheduledExecutorService.scheduleAtFixedRate(new PingRunnable(), this.pingIntervalMillis, this.pingIntervalMillis, TimeUnit.MILLISECONDS);
            }
            if (!this.messageAndCloseQueue.isEmpty()) {
                runWriter();
            }
            Unit unit = Unit.INSTANCE;
        }
        this.reader = new WebSocketReader(streams2.getClient(), streams2.getSource(), this);
    }

    public final void loopReader() throws IOException {
        while (this.receivedCloseCode == -1) {
            WebSocketReader webSocketReader = this.reader;
            if (webSocketReader == null) {
                Intrinsics.throwNpe();
            }
            webSocketReader.processNextFrame();
        }
    }

    public final boolean processNextFrame() throws IOException {
        try {
            WebSocketReader webSocketReader = this.reader;
            if (webSocketReader == null) {
                Intrinsics.throwNpe();
            }
            webSocketReader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                return true;
            }
            return false;
        } catch (Exception e) {
            failWebSocket(e, (Response) null);
            return false;
        }
    }

    public final void awaitTermination(int i, TimeUnit timeUnit) throws InterruptedException {
        Intrinsics.checkParameterIsNotNull(timeUnit, "timeUnit");
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService == null) {
            Intrinsics.throwNpe();
        }
        scheduledExecutorService.awaitTermination((long) i, timeUnit);
    }

    public final void tearDown() throws InterruptedException {
        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            if (scheduledFuture == null) {
                Intrinsics.throwNpe();
            }
            scheduledFuture.cancel(false);
        }
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService == null) {
            Intrinsics.throwNpe();
        }
        scheduledExecutorService.shutdown();
        ScheduledExecutorService scheduledExecutorService2 = this.executor;
        if (scheduledExecutorService2 == null) {
            Intrinsics.throwNpe();
        }
        scheduledExecutorService2.awaitTermination(10, TimeUnit.SECONDS);
    }

    public final synchronized int sentPingCount() {
        return this.sentPingCount;
    }

    public final synchronized int receivedPingCount() {
        return this.receivedPingCount;
    }

    public final synchronized int receivedPongCount() {
        return this.receivedPongCount;
    }

    public void onReadMessage(String str) throws IOException {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.listener.onMessage((WebSocket) this, str);
    }

    public void onReadMessage(ByteString byteString) throws IOException {
        Intrinsics.checkParameterIsNotNull(byteString, "bytes");
        this.listener.onMessage((WebSocket) this, byteString);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onReadPing(okio.ByteString r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)     // Catch:{ all -> 0x0029 }
            boolean r0 = r1.failed     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r1.enqueuedClose     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            java.util.ArrayDeque<java.lang.Object> r0 = r1.messageAndCloseQueue     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            goto L_0x0027
        L_0x0017:
            java.util.ArrayDeque<okio.ByteString> r0 = r1.pongQueue     // Catch:{ all -> 0x0029 }
            r0.add(r2)     // Catch:{ all -> 0x0029 }
            r1.runWriter()     // Catch:{ all -> 0x0029 }
            int r2 = r1.receivedPingCount     // Catch:{ all -> 0x0029 }
            int r2 = r2 + 1
            r1.receivedPingCount = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p053ws.RealWebSocket.onReadPing(okio.ByteString):void");
    }

    public synchronized void onReadPong(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "payload");
        this.receivedPongCount++;
        this.awaitingPong = false;
    }

    public void onReadClose(int i, String str) {
        Intrinsics.checkParameterIsNotNull(str, "reason");
        boolean z = true;
        if (i != -1) {
            Streams streams2 = null;
            synchronized (this) {
                if (this.receivedCloseCode != -1) {
                    z = false;
                }
                if (z) {
                    this.receivedCloseCode = i;
                    this.receivedCloseReason = str;
                    if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                        streams2 = this.streams;
                        this.streams = null;
                        if (this.cancelFuture != null) {
                            ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                            if (scheduledFuture == null) {
                                Intrinsics.throwNpe();
                            }
                            scheduledFuture.cancel(false);
                        }
                        ScheduledExecutorService scheduledExecutorService = this.executor;
                        if (scheduledExecutorService == null) {
                            Intrinsics.throwNpe();
                        }
                        scheduledExecutorService.shutdown();
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("already closed".toString());
                }
            }
            try {
                this.listener.onClosing(this, i, str);
                if (streams2 != null) {
                    this.listener.onClosed(this, i, str);
                }
            } finally {
                if (streams2 != null) {
                    Util.closeQuietly((Closeable) streams2);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public boolean send(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        return send(ByteString.Companion.encodeUtf8(str), 1);
    }

    public boolean send(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "bytes");
        return send(byteString, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean send(okio.ByteString r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.failed     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.enqueuedClose     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r0 = r7.size()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.queueSize     // Catch:{ all -> 0x003e }
            int r2 = r7.size()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.queueSize = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.messageAndCloseQueue     // Catch:{ all -> 0x003e }
            okhttp3.internal.ws.RealWebSocket$Message r1 = new okhttp3.internal.ws.RealWebSocket$Message     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.runWriter()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p053ws.RealWebSocket.send(okio.ByteString, int):boolean");
    }

    public final synchronized boolean pong(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "payload");
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(byteString);
                runWriter();
                return true;
            }
        }
        return false;
    }

    public boolean close(int i, String str) {
        return close(i, str, 60000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean close(int r9, java.lang.String r10, long r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            okhttp3.internal.ws.WebSocketProtocol r0 = okhttp3.internal.p053ws.WebSocketProtocol.INSTANCE     // Catch:{ all -> 0x005d }
            r0.validateCloseCode(r9)     // Catch:{ all -> 0x005d }
            r0 = 0
            okio.ByteString r0 = (okio.ByteString) r0     // Catch:{ all -> 0x005d }
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L_0x0041
            okio.ByteString$Companion r0 = okio.ByteString.Companion     // Catch:{ all -> 0x005d }
            okio.ByteString r0 = r0.encodeUtf8(r10)     // Catch:{ all -> 0x005d }
            int r3 = r0.size()     // Catch:{ all -> 0x005d }
            long r3 = (long) r3     // Catch:{ all -> 0x005d }
            r5 = 123(0x7b, double:6.1E-322)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r3 == 0) goto L_0x0024
            goto L_0x0041
        L_0x0024:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r9.<init>()     // Catch:{ all -> 0x005d }
            java.lang.String r11 = "reason.size() > 123: "
            r9.append(r11)     // Catch:{ all -> 0x005d }
            r9.append(r10)     // Catch:{ all -> 0x005d }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x005d }
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x005d }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x005d }
            r10.<init>(r9)     // Catch:{ all -> 0x005d }
            java.lang.Throwable r10 = (java.lang.Throwable) r10     // Catch:{ all -> 0x005d }
            throw r10     // Catch:{ all -> 0x005d }
        L_0x0041:
            boolean r10 = r8.failed     // Catch:{ all -> 0x005d }
            if (r10 != 0) goto L_0x005b
            boolean r10 = r8.enqueuedClose     // Catch:{ all -> 0x005d }
            if (r10 == 0) goto L_0x004a
            goto L_0x005b
        L_0x004a:
            r8.enqueuedClose = r2     // Catch:{ all -> 0x005d }
            java.util.ArrayDeque<java.lang.Object> r10 = r8.messageAndCloseQueue     // Catch:{ all -> 0x005d }
            okhttp3.internal.ws.RealWebSocket$Close r1 = new okhttp3.internal.ws.RealWebSocket$Close     // Catch:{ all -> 0x005d }
            r1.<init>(r9, r0, r11)     // Catch:{ all -> 0x005d }
            r10.add(r1)     // Catch:{ all -> 0x005d }
            r8.runWriter()     // Catch:{ all -> 0x005d }
            monitor-exit(r8)
            return r2
        L_0x005b:
            monitor-exit(r8)
            return r1
        L_0x005d:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p053ws.RealWebSocket.close(int, java.lang.String, long):boolean");
    }

    private final void runWriter() {
        boolean holdsLock = Thread.holdsLock(this);
        if (!_Assertions.ENABLED || holdsLock) {
            ScheduledExecutorService scheduledExecutorService = this.executor;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.execute(this.writerRunnable);
                return;
            }
            return;
        }
        throw new AssertionError("Assertion failed");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (r5 == null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r3 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        r3.writePong(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0072, code lost:
        if ((r7 instanceof okhttp3.internal.p053ws.RealWebSocket.Message) == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0074, code lost:
        r0 = ((okhttp3.internal.p053ws.RealWebSocket.Message) r7).getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007b, code lost:
        if (r3 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007d, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0080, code lost:
        r1 = okio.Okio.buffer(r3.newMessageSink(((okhttp3.internal.p053ws.RealWebSocket.Message) r7).getFormatOpcode(), (long) r0.size()));
        r1.write(r0);
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r11.queueSize -= (long) r0.size();
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ad, code lost:
        if ((r7 instanceof okhttp3.internal.p053ws.RealWebSocket.Close) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00af, code lost:
        r7 = (okhttp3.internal.p053ws.RealWebSocket.Close) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b1, code lost:
        if (r3 != null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b3, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b6, code lost:
        r3.writeClose(r7.getCode(), r7.getReason());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c1, code lost:
        if (r2 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c3, code lost:
        r0 = r11.listener;
        r3 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c8, code lost:
        if (r4 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ca, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cd, code lost:
        r0.onClosed(r3, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d1, code lost:
        if (r2 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d3, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d8, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e0, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e2, code lost:
        if (r2 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e4, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e9, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean writeOneFrame$okhttp() throws java.io.IOException {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            r2 = r0
            okhttp3.internal.ws.RealWebSocket$Streams r2 = (okhttp3.internal.p053ws.RealWebSocket.Streams) r2
            monitor-enter(r11)
            boolean r3 = r11.failed     // Catch:{ all -> 0x00ea }
            r4 = 0
            if (r3 == 0) goto L_0x000f
            monitor-exit(r11)
            return r4
        L_0x000f:
            okhttp3.internal.ws.WebSocketWriter r3 = r11.writer     // Catch:{ all -> 0x00ea }
            java.util.ArrayDeque<okio.ByteString> r5 = r11.pongQueue     // Catch:{ all -> 0x00ea }
            java.lang.Object r5 = r5.poll()     // Catch:{ all -> 0x00ea }
            okio.ByteString r5 = (okio.ByteString) r5     // Catch:{ all -> 0x00ea }
            r6 = -1
            if (r5 != 0) goto L_0x005f
            java.util.ArrayDeque<java.lang.Object> r7 = r11.messageAndCloseQueue     // Catch:{ all -> 0x00ea }
            java.lang.Object r7 = r7.poll()     // Catch:{ all -> 0x00ea }
            boolean r8 = r7 instanceof okhttp3.internal.p053ws.RealWebSocket.Close     // Catch:{ all -> 0x00ea }
            if (r8 == 0) goto L_0x005b
            int r1 = r11.receivedCloseCode     // Catch:{ all -> 0x00ea }
            java.lang.String r4 = r11.receivedCloseReason     // Catch:{ all -> 0x00ea }
            if (r1 == r6) goto L_0x003d
            okhttp3.internal.ws.RealWebSocket$Streams r2 = r11.streams     // Catch:{ all -> 0x00ea }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = (okhttp3.internal.p053ws.RealWebSocket.Streams) r0     // Catch:{ all -> 0x00ea }
            r11.streams = r0     // Catch:{ all -> 0x00ea }
            java.util.concurrent.ScheduledExecutorService r0 = r11.executor     // Catch:{ all -> 0x00ea }
            if (r0 != 0) goto L_0x0039
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x00ea }
        L_0x0039:
            r0.shutdown()     // Catch:{ all -> 0x00ea }
            goto L_0x0062
        L_0x003d:
            java.util.concurrent.ScheduledExecutorService r0 = r11.executor     // Catch:{ all -> 0x00ea }
            if (r0 != 0) goto L_0x0044
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x00ea }
        L_0x0044:
            okhttp3.internal.ws.RealWebSocket$CancelRunnable r6 = new okhttp3.internal.ws.RealWebSocket$CancelRunnable     // Catch:{ all -> 0x00ea }
            r6.<init>()     // Catch:{ all -> 0x00ea }
            java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch:{ all -> 0x00ea }
            r8 = r7
            okhttp3.internal.ws.RealWebSocket$Close r8 = (okhttp3.internal.p053ws.RealWebSocket.Close) r8     // Catch:{ all -> 0x00ea }
            long r8 = r8.getCancelAfterCloseMillis()     // Catch:{ all -> 0x00ea }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00ea }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r6, r8, r10)     // Catch:{ all -> 0x00ea }
            r11.cancelFuture = r0     // Catch:{ all -> 0x00ea }
            goto L_0x0062
        L_0x005b:
            if (r7 != 0) goto L_0x0060
            monitor-exit(r11)
            return r4
        L_0x005f:
            r7 = r0
        L_0x0060:
            r4 = r1
            r1 = -1
        L_0x0062:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00ea }
            monitor-exit(r11)
            if (r5 == 0) goto L_0x0070
            if (r3 != 0) goto L_0x006c
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x00e1 }
        L_0x006c:
            r3.writePong(r5)     // Catch:{ all -> 0x00e1 }
            goto L_0x00d0
        L_0x0070:
            boolean r0 = r7 instanceof okhttp3.internal.p053ws.RealWebSocket.Message     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00ab
            r0 = r7
            okhttp3.internal.ws.RealWebSocket$Message r0 = (okhttp3.internal.p053ws.RealWebSocket.Message) r0     // Catch:{ all -> 0x00e1 }
            okio.ByteString r0 = r0.getData()     // Catch:{ all -> 0x00e1 }
            if (r3 != 0) goto L_0x0080
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x00e1 }
        L_0x0080:
            okhttp3.internal.ws.RealWebSocket$Message r7 = (okhttp3.internal.p053ws.RealWebSocket.Message) r7     // Catch:{ all -> 0x00e1 }
            int r1 = r7.getFormatOpcode()     // Catch:{ all -> 0x00e1 }
            int r4 = r0.size()     // Catch:{ all -> 0x00e1 }
            long r4 = (long) r4     // Catch:{ all -> 0x00e1 }
            okio.Sink r1 = r3.newMessageSink(r1, r4)     // Catch:{ all -> 0x00e1 }
            okio.BufferedSink r1 = okio.Okio.buffer((okio.Sink) r1)     // Catch:{ all -> 0x00e1 }
            r1.write((okio.ByteString) r0)     // Catch:{ all -> 0x00e1 }
            r1.close()     // Catch:{ all -> 0x00e1 }
            monitor-enter(r11)     // Catch:{ all -> 0x00e1 }
            long r3 = r11.queueSize     // Catch:{ all -> 0x00a8 }
            int r0 = r0.size()     // Catch:{ all -> 0x00a8 }
            long r0 = (long) r0     // Catch:{ all -> 0x00a8 }
            long r3 = r3 - r0
            r11.queueSize = r3     // Catch:{ all -> 0x00a8 }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00a8 }
            monitor-exit(r11)     // Catch:{ all -> 0x00e1 }
            goto L_0x00d0
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00ab:
            boolean r0 = r7 instanceof okhttp3.internal.p053ws.RealWebSocket.Close     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00d9
            okhttp3.internal.ws.RealWebSocket$Close r7 = (okhttp3.internal.p053ws.RealWebSocket.Close) r7     // Catch:{ all -> 0x00e1 }
            if (r3 != 0) goto L_0x00b6
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x00e1 }
        L_0x00b6:
            int r0 = r7.getCode()     // Catch:{ all -> 0x00e1 }
            okio.ByteString r5 = r7.getReason()     // Catch:{ all -> 0x00e1 }
            r3.writeClose(r0, r5)     // Catch:{ all -> 0x00e1 }
            if (r2 == 0) goto L_0x00d0
            okhttp3.WebSocketListener r0 = r11.listener     // Catch:{ all -> 0x00e1 }
            r3 = r11
            okhttp3.WebSocket r3 = (okhttp3.WebSocket) r3     // Catch:{ all -> 0x00e1 }
            if (r4 != 0) goto L_0x00cd
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ all -> 0x00e1 }
        L_0x00cd:
            r0.onClosed(r3, r1, r4)     // Catch:{ all -> 0x00e1 }
        L_0x00d0:
            r0 = 1
            if (r2 == 0) goto L_0x00d8
            java.io.Closeable r2 = (java.io.Closeable) r2
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x00d8:
            return r0
        L_0x00d9:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00e1 }
            r0.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x00e1 }
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            r0 = move-exception
            if (r2 == 0) goto L_0x00e9
            java.io.Closeable r2 = (java.io.Closeable) r2
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r2)
        L_0x00e9:
            throw r0
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p053ws.RealWebSocket.writeOneFrame$okhttp():boolean");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo51343d2 = {"Lokhttp3/internal/ws/RealWebSocket$PingRunnable;", "Ljava/lang/Runnable;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "run", "", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$PingRunnable */
    /* compiled from: RealWebSocket.kt */
    private final class PingRunnable implements Runnable {
        public PingRunnable() {
        }

        public void run() {
            RealWebSocket.this.writePingFrame$okhttp();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r1 == -1) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        failWebSocket(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.pingIntervalMillis + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r0 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        kotlin.jvm.internal.Intrinsics.throwNpe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        r0.writePing(okio.ByteString.EMPTY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        failWebSocket(r0, (okhttp3.Response) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writePingFrame$okhttp() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.failed     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            okhttp3.internal.ws.WebSocketWriter r0 = r7.writer     // Catch:{ all -> 0x005e }
            boolean r1 = r7.awaitingPong     // Catch:{ all -> 0x005e }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r7.sentPingCount     // Catch:{ all -> 0x005e }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r7.sentPingCount     // Catch:{ all -> 0x005e }
            r4 = 1
            int r3 = r3 + r4
            r7.sentPingCount = r3     // Catch:{ all -> 0x005e }
            r7.awaitingPong = r4     // Catch:{ all -> 0x005e }
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x005e }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x004c
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.pingIntervalMillis
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            java.lang.Exception r0 = (java.lang.Exception) r0
            r7.failWebSocket(r0, r3)
            return
        L_0x004c:
            if (r0 != 0) goto L_0x0051
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ IOException -> 0x0057 }
        L_0x0051:
            okio.ByteString r1 = okio.ByteString.EMPTY     // Catch:{ IOException -> 0x0057 }
            r0.writePing(r1)     // Catch:{ IOException -> 0x0057 }
            goto L_0x005d
        L_0x0057:
            r0 = move-exception
            java.lang.Exception r0 = (java.lang.Exception) r0
            r7.failWebSocket(r0, r3)
        L_0x005d:
            return
        L_0x005e:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p053ws.RealWebSocket.writePingFrame$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.listener.onFailure(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r0 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void failWebSocket(java.lang.Exception r4, okhttp3.Response r5) {
        /*
            r3 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            monitor-enter(r3)
            boolean r0 = r3.failed     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)
            return
        L_0x000c:
            r0 = 1
            r3.failed = r0     // Catch:{ all -> 0x0043 }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r3.streams     // Catch:{ all -> 0x0043 }
            r1 = 0
            okhttp3.internal.ws.RealWebSocket$Streams r1 = (okhttp3.internal.p053ws.RealWebSocket.Streams) r1     // Catch:{ all -> 0x0043 }
            r3.streams = r1     // Catch:{ all -> 0x0043 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.cancelFuture     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x001e
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0043 }
        L_0x001e:
            java.util.concurrent.ScheduledExecutorService r1 = r3.executor     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0027
            r1.shutdown()     // Catch:{ all -> 0x0043 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0043 }
        L_0x0027:
            monitor-exit(r3)
            okhttp3.WebSocketListener r1 = r3.listener     // Catch:{ all -> 0x003a }
            r2 = r3
            okhttp3.WebSocket r2 = (okhttp3.WebSocket) r2     // Catch:{ all -> 0x003a }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x003a }
            r1.onFailure(r2, r4, r5)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0039
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x0039:
            return
        L_0x003a:
            r4 = move-exception
            if (r0 == 0) goto L_0x0042
            java.io.Closeable r0 = (java.io.Closeable) r0
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
        L_0x0042:
            throw r4
        L_0x0043:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p053ws.RealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo51343d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "formatOpcode", "", "data", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getData", "()Lokio/ByteString;", "getFormatOpcode", "()I", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Message */
    /* compiled from: RealWebSocket.kt */
    public static final class Message {
        private final ByteString data;
        private final int formatOpcode;

        public Message(int i, ByteString byteString) {
            Intrinsics.checkParameterIsNotNull(byteString, "data");
            this.formatOpcode = i;
            this.data = byteString;
        }

        public final int getFormatOpcode() {
            return this.formatOpcode;
        }

        public final ByteString getData() {
            return this.data;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "code", "", "reason", "Lokio/ByteString;", "cancelAfterCloseMillis", "", "(ILokio/ByteString;J)V", "getCancelAfterCloseMillis", "()J", "getCode", "()I", "getReason", "()Lokio/ByteString;", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Close */
    /* compiled from: RealWebSocket.kt */
    public static final class Close {
        private final long cancelAfterCloseMillis;
        private final int code;
        private final ByteString reason;

        public Close(int i, ByteString byteString, long j) {
            this.code = i;
            this.reason = byteString;
            this.cancelAfterCloseMillis = j;
        }

        public final int getCode() {
            return this.code;
        }

        public final ByteString getReason() {
            return this.reason;
        }

        public final long getCancelAfterCloseMillis() {
            return this.cancelAfterCloseMillis;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo51343d2 = {"Lokhttp3/internal/ws/RealWebSocket$Streams;", "Ljava/io/Closeable;", "client", "", "source", "Lokio/BufferedSource;", "sink", "Lokio/BufferedSink;", "(ZLokio/BufferedSource;Lokio/BufferedSink;)V", "getClient", "()Z", "getSink", "()Lokio/BufferedSink;", "getSource", "()Lokio/BufferedSource;", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Streams */
    /* compiled from: RealWebSocket.kt */
    public static abstract class Streams implements Closeable {
        private final boolean client;
        private final BufferedSink sink;
        private final BufferedSource source;

        public Streams(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            Intrinsics.checkParameterIsNotNull(bufferedSource, "source");
            Intrinsics.checkParameterIsNotNull(bufferedSink, "sink");
            this.client = z;
            this.source = bufferedSource;
            this.sink = bufferedSink;
        }

        public final boolean getClient() {
            return this.client;
        }

        public final BufferedSource getSource() {
            return this.source;
        }

        public final BufferedSink getSink() {
            return this.sink;
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, mo51343d2 = {"Lokhttp3/internal/ws/RealWebSocket$CancelRunnable;", "Ljava/lang/Runnable;", "(Lokhttp3/internal/ws/RealWebSocket;)V", "run", "", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$CancelRunnable */
    /* compiled from: RealWebSocket.kt */
    public final class CancelRunnable implements Runnable {
        public CancelRunnable() {
        }

        public void run() {
            RealWebSocket.this.cancel();
        }
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "()V", "CANCEL_AFTER_CLOSE_MILLIS", "", "MAX_QUEUE_SIZE", "ONLY_HTTP1", "", "Lokhttp3/Protocol;", "okhttp"}, mo51344k = 1, mo51345mv = {1, 1, 15})
    /* renamed from: okhttp3.internal.ws.RealWebSocket$Companion */
    /* compiled from: RealWebSocket.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
