package p033co.infinum.goldeneye;

import android.view.TextureView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.models.CameraState;
import p033co.infinum.goldeneye.sessions.SessionsManager;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/TextureView;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye2Impl$startPreview$1 */
/* compiled from: GoldenEye2Impl.kt */
final class GoldenEye2Impl$startPreview$1 extends Lambda implements Function1<TextureView, Unit> {
    final /* synthetic */ InitCallback $callback;
    final /* synthetic */ GoldenEye2Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GoldenEye2Impl$startPreview$1(GoldenEye2Impl goldenEye2Impl, InitCallback initCallback) {
        super(1);
        this.this$0 = goldenEye2Impl;
        this.$callback = initCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TextureView) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(TextureView textureView) {
        Intrinsics.checkParameterIsNotNull(textureView, "it");
        SessionsManager access$getSessionsManager$p = this.this$0.sessionsManager;
        if (access$getSessionsManager$p != null) {
            access$getSessionsManager$p.startPreview(new InitCallback(this) {
                final /* synthetic */ GoldenEye2Impl$startPreview$1 this$0;

                {
                    this.this$0 = r1;
                }

                public void onActive() {
                    BaseGoldenEye.Companion.setState(CameraState.ACTIVE);
                    this.this$0.$callback.onActive();
                }

                public void onError(Throwable th) {
                    Intrinsics.checkParameterIsNotNull(th, "t");
                    this.this$0.this$0.releaseInternal();
                    this.this$0.$callback.onError(th);
                }
            });
        }
    }
}
