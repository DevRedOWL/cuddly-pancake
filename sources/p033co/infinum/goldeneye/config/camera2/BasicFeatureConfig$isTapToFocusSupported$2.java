package p033co.infinum.goldeneye.config.camera2;

import android.hardware.camera2.CameraCharacteristics;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.BasicFeatureConfig$isTapToFocusSupported$2 */
/* compiled from: BasicFeatureConfig.kt */
final class BasicFeatureConfig$isTapToFocusSupported$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ BasicFeatureConfig this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicFeatureConfig$isTapToFocusSupported$2(BasicFeatureConfig basicFeatureConfig) {
        super(0);
        this.this$0 = basicFeatureConfig;
    }

    public final boolean invoke() {
        Integer num = (Integer) ((CameraCharacteristics) this.this$0.getCharacteristics()).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        return (num != null ? num.intValue() : 0) > 0;
    }
}
