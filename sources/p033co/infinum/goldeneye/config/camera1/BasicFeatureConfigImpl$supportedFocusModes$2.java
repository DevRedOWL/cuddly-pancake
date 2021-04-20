package p033co.infinum.goldeneye.config.camera1;

import android.hardware.Camera;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p033co.infinum.goldeneye.models.FocusMode;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo51343d2 = {"<anonymous>", "", "Lco/infinum/goldeneye/models/FocusMode;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.config.camera1.BasicFeatureConfigImpl$supportedFocusModes$2 */
/* compiled from: BasicFeatureConfigImpl.kt */
final class BasicFeatureConfigImpl$supportedFocusModes$2 extends Lambda implements Function0<List<? extends FocusMode>> {
    final /* synthetic */ BasicFeatureConfigImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BasicFeatureConfigImpl$supportedFocusModes$2(BasicFeatureConfigImpl basicFeatureConfigImpl) {
        super(0);
        this.this$0 = basicFeatureConfigImpl;
    }

    public final List<FocusMode> invoke() {
        List<String> supportedFocusModes = ((Camera.Parameters) this.this$0.getCharacteristics()).getSupportedFocusModes();
        if (supportedFocusModes == null) {
            return CollectionsKt.emptyList();
        }
        Iterable<String> iterable = supportedFocusModes;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (String fromCamera1 : iterable) {
            arrayList.add(FocusMode.Companion.fromCamera1(fromCamera1));
        }
        Collection arrayList2 = new ArrayList();
        for (Object next : (List) arrayList) {
            if (((FocusMode) next) != FocusMode.UNKNOWN) {
                arrayList2.add(next);
            }
        }
        return (List) arrayList2;
    }
}
