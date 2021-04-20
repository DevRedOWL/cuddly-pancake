package p033co.infinum.goldeneye;

import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye2Impl$initInternal$2 */
/* compiled from: GoldenEye2Impl.kt */
final class GoldenEye2Impl$initInternal$2 implements Runnable {
    final /* synthetic */ InitCallback $callback;

    /* renamed from: $t */
    final /* synthetic */ Throwable f1131$t;

    GoldenEye2Impl$initInternal$2(InitCallback initCallback, Throwable th) {
        this.$callback = initCallback;
        this.f1131$t = th;
    }

    public final void run() {
        this.$callback.onError(this.f1131$t);
    }
}
