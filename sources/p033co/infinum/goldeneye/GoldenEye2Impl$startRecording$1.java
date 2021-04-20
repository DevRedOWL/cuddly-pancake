package p033co.infinum.goldeneye;

import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p033co.infinum.goldeneye.models.CameraState;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo51343d2 = {"co/infinum/goldeneye/GoldenEye2Impl$startRecording$1", "Lco/infinum/goldeneye/VideoCallback;", "onError", "", "t", "", "onVideoRecorded", "file", "Ljava/io/File;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye2Impl$startRecording$1 */
/* compiled from: GoldenEye2Impl.kt */
public final class GoldenEye2Impl$startRecording$1 implements VideoCallback {
    final /* synthetic */ VideoCallback $callback;

    GoldenEye2Impl$startRecording$1(VideoCallback videoCallback) {
        this.$callback = videoCallback;
    }

    public void onVideoRecorded(File file) {
        Intrinsics.checkParameterIsNotNull(file, UriUtil.LOCAL_FILE_SCHEME);
        BaseGoldenEye.Companion.setState(CameraState.ACTIVE);
        this.$callback.onVideoRecorded(file);
    }

    public void onError(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        BaseGoldenEye.Companion.setState(CameraState.ACTIVE);
        this.$callback.onError(th);
    }
}
