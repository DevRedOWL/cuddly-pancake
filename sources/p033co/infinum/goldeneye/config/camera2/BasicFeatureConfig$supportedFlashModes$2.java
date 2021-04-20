package p033co.infinum.goldeneye.config.camera2;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.models.FlashMode;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "Lco/infinum/goldeneye/models/FlashMode;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.BasicFeatureConfig$supportedFlashModes$2 */
/* compiled from: BasicFeatureConfig.kt */
final class BasicFeatureConfig$supportedFlashModes$2 extends Lambda implements Function0<List<? extends FlashMode>> {
    final /* synthetic */ BasicFeatureConfig this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicFeatureConfig$supportedFlashModes$2(BasicFeatureConfig basicFeatureConfig) {
        super(0);
        this.this$0 = basicFeatureConfig;
    }

    public final List<FlashMode> invoke() {
        List<FlashMode> list;
        if (Intrinsics.areEqual((Object) (Boolean) ((CameraCharacteristics) this.this$0.getCharacteristics()).get(CameraCharacteristics.FLASH_INFO_AVAILABLE), (Object) false)) {
            return CollectionsKt.emptyList();
        }
        int[] iArr = (int[]) ((CameraCharacteristics) this.this$0.getCharacteristics()).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr != null) {
            Collection arrayList = new ArrayList(iArr.length);
            for (int valueOf : iArr) {
                arrayList.add(FlashMode.Companion.fromCamera2(Integer.valueOf(valueOf)));
            }
            Collection arrayList2 = new ArrayList();
            for (Object next : (List) arrayList) {
                if (((FlashMode) next) != FlashMode.UNKNOWN) {
                    arrayList2.add(next);
                }
            }
            list = CollectionsKt.toMutableList((List) arrayList2);
        } else {
            list = null;
        }
        if (list != null) {
            list.add(FlashMode.TORCH);
        }
        return list != null ? list : CollectionsKt.emptyList();
    }
}
