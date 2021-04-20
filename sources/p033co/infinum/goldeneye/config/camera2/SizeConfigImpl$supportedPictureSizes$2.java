package p033co.infinum.goldeneye.config.camera2;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.models.Size;
import p033co.infinum.goldeneye.models.SizeKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "Lco/infinum/goldeneye/models/Size;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.SizeConfigImpl$supportedPictureSizes$2 */
/* compiled from: SizeConfigImpl.kt */
final class SizeConfigImpl$supportedPictureSizes$2 extends Lambda implements Function0<List<? extends Size>> {
    final /* synthetic */ SizeConfigImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SizeConfigImpl$supportedPictureSizes$2(SizeConfigImpl sizeConfigImpl) {
        super(0);
        this.this$0 = sizeConfigImpl;
    }

    public final List<Size> invoke() {
        android.util.Size[] outputSizes;
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((CameraCharacteristics) this.this$0.getCharacteristics()).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (!(streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(256)) == null)) {
            Collection arrayList = new ArrayList(outputSizes.length);
            for (android.util.Size size : outputSizes) {
                Intrinsics.checkExpressionValueIsNotNull(size, "it");
                arrayList.add(SizeKt.toInternalSize(size));
            }
            List<Size> sorted = CollectionsKt.sorted((List) arrayList);
            if (sorted != null) {
                return sorted;
            }
        }
        return CollectionsKt.emptyList();
    }
}
