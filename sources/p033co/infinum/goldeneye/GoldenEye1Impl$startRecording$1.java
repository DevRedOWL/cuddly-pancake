package p033co.infinum.goldeneye;

import android.view.TextureView;
import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.GoldenEye;
import p033co.infinum.goldeneye.models.CameraState;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0003H\u0003¨\u0006\n"}, mo51343d2 = {"co/infinum/goldeneye/GoldenEye1Impl$startRecording$1", "Lco/infinum/goldeneye/VideoCallback;", "onError", "", "t", "", "onVideoRecorded", "file", "Ljava/io/File;", "resetCameraPreview", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye1Impl$startRecording$1 */
/* compiled from: GoldenEye1Impl.kt */
public final class GoldenEye1Impl$startRecording$1 implements VideoCallback {
    final /* synthetic */ VideoCallback $callback;
    final /* synthetic */ GoldenEye1Impl this$0;

    GoldenEye1Impl$startRecording$1(GoldenEye1Impl goldenEye1Impl, VideoCallback videoCallback) {
        this.this$0 = goldenEye1Impl;
        this.$callback = videoCallback;
    }

    public void onVideoRecorded(File file) {
        Intrinsics.checkParameterIsNotNull(file, UriUtil.LOCAL_FILE_SCHEME);
        resetCameraPreview();
        this.$callback.onVideoRecorded(file);
    }

    public void onError(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        resetCameraPreview();
        this.$callback.onError(th);
    }

    private final void resetCameraPreview() {
        BaseGoldenEye.Companion.setState(CameraState.CLOSED);
        GoldenEye1Impl goldenEye1Impl = this.this$0;
        TextureView access$getTextureView$p = goldenEye1Impl.textureView;
        if (access$getTextureView$p == null) {
            Intrinsics.throwNpe();
        }
        GoldenEye.DefaultImpls.open$default(goldenEye1Impl, access$getTextureView$p, GoldenEye1Impl.access$get_config$p(this.this$0), (Function1) null, (Function0) null, GoldenEye1Impl$startRecording$1$resetCameraPreview$1.INSTANCE, 12, (Object) null);
    }
}
