package p033co.infinum.goldeneye.config.camera2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.VideoConfigImpl$supportedVideoStabilizationModes$2 */
/* compiled from: VideoConfigImpl.kt */
final class VideoConfigImpl$supportedVideoStabilizationModes$2 extends Lambda implements Function0<List<? extends Integer>> {
    final /* synthetic */ VideoConfigImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoConfigImpl$supportedVideoStabilizationModes$2(VideoConfigImpl videoConfigImpl) {
        super(0);
        this.this$0 = videoConfigImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = kotlin.collections.ArraysKt.toList(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Integer> invoke() {
        /*
            r2 = this;
            co.infinum.goldeneye.config.camera2.VideoConfigImpl r0 = r2.this$0
            java.lang.Object r0 = r0.getCharacteristics()
            android.hardware.camera2.CameraCharacteristics r0 = (android.hardware.camera2.CameraCharacteristics) r0
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
            java.lang.Object r0 = r0.get(r1)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L_0x0019
            java.util.List r0 = kotlin.collections.ArraysKt.toList((int[]) r0)
            if (r0 == 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p033co.infinum.goldeneye.config.camera2.VideoConfigImpl$supportedVideoStabilizationModes$2.invoke():java.util.List");
    }
}
