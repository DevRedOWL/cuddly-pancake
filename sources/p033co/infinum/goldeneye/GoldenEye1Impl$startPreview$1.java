package p033co.infinum.goldeneye;

import android.hardware.Camera;
import android.view.TextureView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.models.CameraState;
import p033co.infinum.goldeneye.utils.CameraUtils;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "camera", "Landroid/hardware/Camera;", "textureView", "Landroid/view/TextureView;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye1Impl$startPreview$1 */
/* compiled from: GoldenEye1Impl.kt */
final class GoldenEye1Impl$startPreview$1 extends Lambda implements Function2<Camera, TextureView, Unit> {
    final /* synthetic */ InitCallback $initCallback;
    final /* synthetic */ GoldenEye1Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GoldenEye1Impl$startPreview$1(GoldenEye1Impl goldenEye1Impl, InitCallback initCallback) {
        super(2);
        this.this$0 = goldenEye1Impl;
        this.$initCallback = initCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Camera) obj, (TextureView) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(Camera camera, TextureView textureView) {
        Intrinsics.checkParameterIsNotNull(camera, "camera");
        Intrinsics.checkParameterIsNotNull(textureView, "textureView");
        camera.stopPreview();
        camera.setPreviewTexture(textureView.getSurfaceTexture());
        this.this$0.applyConfig();
        textureView.setTransform(CameraUtils.INSTANCE.calculateTextureMatrix(this.this$0.activity, textureView, GoldenEye1Impl.access$get_config$p(this.this$0)));
        camera.setDisplayOrientation(CameraUtils.INSTANCE.calculateDisplayOrientation(this.this$0.activity, GoldenEye1Impl.access$get_config$p(this.this$0)));
        camera.startPreview();
        BaseGoldenEye.Companion.setState(CameraState.ACTIVE);
        InitCallback initCallback = this.$initCallback;
        if (initCallback != null) {
            initCallback.onActive();
        }
    }
}
