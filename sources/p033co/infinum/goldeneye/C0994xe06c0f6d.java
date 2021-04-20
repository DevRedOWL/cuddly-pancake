package p033co.infinum.goldeneye;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo51343d2 = {"co/infinum/goldeneye/GoldenEye$Builder$setOnZoomChangedCallback$1$1", "Lco/infinum/goldeneye/OnZoomChangedCallback;", "onZoomChanged", "", "zoom", "", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye$Builder$setOnZoomChangedCallback$$inlined$apply$lambda$1 */
/* compiled from: GoldenEye.kt */
public final class C0994xe06c0f6d implements OnZoomChangedCallback {
    final /* synthetic */ Function1 $onZoomChanged$inlined;

    C0994xe06c0f6d(Function1 function1) {
        this.$onZoomChanged$inlined = function1;
    }

    public void onZoomChanged(int i) {
        this.$onZoomChanged$inlined.invoke(Integer.valueOf(i));
    }
}
