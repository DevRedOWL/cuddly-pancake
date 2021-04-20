package p033co.infinum.goldeneye.recorders;

import com.facebook.common.util.UriUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.VideoCallback;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "callback", "Lco/infinum/goldeneye/VideoCallback;", "file", "Ljava/io/File;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.recorders.VideoRecorder$stopRecording$1 */
/* compiled from: VideoRecorder.kt */
final class VideoRecorder$stopRecording$1 extends Lambda implements Function2<VideoCallback, File, Unit> {
    public static final VideoRecorder$stopRecording$1 INSTANCE = new VideoRecorder$stopRecording$1();

    VideoRecorder$stopRecording$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((VideoCallback) obj, (File) obj2);
        return Unit.INSTANCE;
    }

    public final void invoke(VideoCallback videoCallback, File file) {
        Intrinsics.checkParameterIsNotNull(videoCallback, "callback");
        Intrinsics.checkParameterIsNotNull(file, UriUtil.LOCAL_FILE_SCHEME);
        videoCallback.onVideoRecorded(file);
    }
}
