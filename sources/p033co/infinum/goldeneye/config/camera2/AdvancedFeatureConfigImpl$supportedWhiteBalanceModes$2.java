package p033co.infinum.goldeneye.config.camera2;

import android.hardware.camera2.CameraCharacteristics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.models.WhiteBalanceMode;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "Lco/infinum/goldeneye/models/WhiteBalanceMode;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera2.AdvancedFeatureConfigImpl$supportedWhiteBalanceModes$2 */
/* compiled from: AdvancedFeatureConfigImpl.kt */
final class AdvancedFeatureConfigImpl$supportedWhiteBalanceModes$2 extends Lambda implements Function0<List<? extends WhiteBalanceMode>> {
    final /* synthetic */ AdvancedFeatureConfigImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AdvancedFeatureConfigImpl$supportedWhiteBalanceModes$2(AdvancedFeatureConfigImpl advancedFeatureConfigImpl) {
        super(0);
        this.this$0 = advancedFeatureConfigImpl;
    }

    public final List<WhiteBalanceMode> invoke() {
        int[] iArr = (int[]) ((CameraCharacteristics) this.this$0.getCharacteristics()).get(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return CollectionsKt.emptyList();
        }
        Collection arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(WhiteBalanceMode.Companion.fromCamera2(Integer.valueOf(valueOf)));
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : (List) arrayList) {
            if (((WhiteBalanceMode) next) != WhiteBalanceMode.UNKNOWN) {
                arrayList2.add(next);
            }
        }
        return (List) arrayList2;
    }
}
