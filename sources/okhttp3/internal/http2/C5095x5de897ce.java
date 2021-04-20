package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo51343d2 = {"<anonymous>", "", "run", "okhttp3/internal/Util$execute$1"}, mo51344k = 3, mo51345mv = {1, 1, 15})
/* renamed from: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$$inlined$execute$1 */
/* compiled from: Util.kt */
public final class C5095x5de897ce implements Runnable {
    final /* synthetic */ String $name;
    final /* synthetic */ Http2Connection.ReaderRunnable this$0;

    public C5095x5de897ce(String str, Http2Connection.ReaderRunnable readerRunnable) {
        this.$name = str;
        this.this$0 = readerRunnable;
    }

    public final void run() {
        String str = this.$name;
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkExpressionValueIsNotNull(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            this.this$0.this$0.getListener$okhttp().onSettings(this.this$0.this$0);
        } finally {
            currentThread.setName(name);
        }
    }
}
