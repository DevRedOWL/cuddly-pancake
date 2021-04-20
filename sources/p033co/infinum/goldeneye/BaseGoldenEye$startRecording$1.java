package p033co.infinum.goldeneye;

import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo51343d2 = {"co/infinum/goldeneye/BaseGoldenEye$startRecording$1", "Lco/infinum/goldeneye/VideoCallback;", "onError", "", "t", "", "onVideoRecorded", "file", "Ljava/io/File;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.BaseGoldenEye$startRecording$1 */
/* compiled from: BaseGoldenEye.kt */
public final class BaseGoldenEye$startRecording$1 implements VideoCallback {
    final /* synthetic */ Function1 $onError;
    final /* synthetic */ Function1 $onVideoRecorded;

    BaseGoldenEye$startRecording$1(Function1 function1, Function1 function12) {
        this.$onVideoRecorded = function1;
        this.$onError = function12;
    }

    public void onVideoRecorded(File file) {
        Intrinsics.checkParameterIsNotNull(file, UriUtil.LOCAL_FILE_SCHEME);
        this.$onVideoRecorded.invoke(file);
    }

    public void onError(Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "t");
        this.$onError.invoke(th);
    }
}
