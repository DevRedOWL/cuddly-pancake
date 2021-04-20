package p033co.infinum.goldeneye.config.camera2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.VideoConfigImpl$isVideoStabilizationSupported$2 */
/* compiled from: VideoConfigImpl.kt */
final class VideoConfigImpl$isVideoStabilizationSupported$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ VideoConfigImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoConfigImpl$isVideoStabilizationSupported$2(VideoConfigImpl videoConfigImpl) {
        super(0);
        this.this$0 = videoConfigImpl;
    }

    public final boolean invoke() {
        return this.this$0.getSupportedVideoStabilizationModes().size() > 1;
    }
}
