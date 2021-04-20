package p033co.infinum.goldeneye;

import android.graphics.Bitmap;
import android.hardware.Camera;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.models.CameraState;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0002¨\u0006\n"}, mo51343d2 = {"co/infinum/goldeneye/GoldenEye1Impl$takePicture$1", "Lco/infinum/goldeneye/PictureCallback;", "onError", "", "t", "", "onPictureTaken", "picture", "Landroid/graphics/Bitmap;", "resetCameraPreview", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye1Impl$takePicture$1 */
/* compiled from: GoldenEye1Impl.kt */
public final class GoldenEye1Impl$takePicture$1 extends PictureCallback {
    final /* synthetic */ PictureCallback $callback;
    final /* synthetic */ GoldenEye1Impl this$0;

    GoldenEye1Impl$takePicture$1(GoldenEye1Impl goldenEye1Impl, PictureCallback pictureCallback) {
        this.this$0 = goldenEye1Impl;
        this.$callback = pictureCallback;
    }

    public void onPictureTaken(Bitmap bitmap) {
        Intrinsics.checkParameterIsNotNull(bitmap, "picture");
        resetCameraPreview();
        this.$callback.onPictureTaken(bitmap);
    }

    public void onError(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        resetCameraPreview();
        this.$callback.onError(th);
    }

    private final void resetCameraPreview() {
        BaseGoldenEye.Companion.setState(CameraState.ACTIVE);
        Camera access$getCamera$p = this.this$0.camera;
        if (access$getCamera$p != null) {
            access$getCamera$p.startPreview();
        }
    }
}
