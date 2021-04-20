package p033co.infinum.goldeneye;

import android.view.TextureView;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye2Impl$initInternal$1 */
/* compiled from: GoldenEye2Impl.kt */
final class GoldenEye2Impl$initInternal$1 implements Runnable {
    final /* synthetic */ InitCallback $callback;
    final /* synthetic */ TextureView $textureView;
    final /* synthetic */ GoldenEye2Impl this$0;

    GoldenEye2Impl$initInternal$1(GoldenEye2Impl goldenEye2Impl, InitCallback initCallback, TextureView textureView) {
        this.this$0 = goldenEye2Impl;
        this.$callback = initCallback;
        this.$textureView = textureView;
    }

    public final void run() {
        this.$callback.onReady(GoldenEye2Impl.access$get_config$p(this.this$0));
        this.this$0.startPreview(this.$textureView, this.$callback);
    }
}
