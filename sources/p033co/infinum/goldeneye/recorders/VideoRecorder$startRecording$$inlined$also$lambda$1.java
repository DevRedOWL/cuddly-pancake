package p033co.infinum.goldeneye.recorders;

import android.media.MediaRecorder;
import kotlin.Metadata;
import p033co.infinum.goldeneye.MediaRecorderDeadException;
import p033co.infinum.goldeneye.VideoCallback;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b¨\u0006\t"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/media/MediaRecorder;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "onError", "co/infinum/goldeneye/recorders/VideoRecorder$startRecording$1$1"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.recorders.VideoRecorder$startRecording$$inlined$also$lambda$1 */
/* compiled from: VideoRecorder.kt */
final class VideoRecorder$startRecording$$inlined$also$lambda$1 implements MediaRecorder.OnErrorListener {
    final /* synthetic */ VideoRecorder this$0;

    VideoRecorder$startRecording$$inlined$also$lambda$1(VideoRecorder videoRecorder) {
        this.this$0 = videoRecorder;
    }

    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        VideoCallback access$getCallback$p = this.this$0.callback;
        if (access$getCallback$p != null) {
            access$getCallback$p.onError(MediaRecorderDeadException.INSTANCE);
        }
    }
}
