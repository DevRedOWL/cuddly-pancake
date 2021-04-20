package p033co.infinum.goldeneye;

import android.graphics.Point;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo51343d2 = {"co/infinum/goldeneye/GoldenEye$Builder$setOnFocusChangedCallback$1$1", "Lco/infinum/goldeneye/OnFocusChangedCallback;", "onFocusChanged", "", "point", "Landroid/graphics/Point;", "goldeneye_release"}, mo51344k = 1, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye$Builder$setOnFocusChangedCallback$$inlined$apply$lambda$1 */
/* compiled from: GoldenEye.kt */
public final class C0993x685016c0 implements OnFocusChangedCallback {
    final /* synthetic */ Function1 $onFocusChanged$inlined;

    C0993x685016c0(Function1 function1) {
        this.$onFocusChanged$inlined = function1;
    }

    public void onFocusChanged(Point point) {
        Intrinsics.checkParameterIsNotNull(point, "point");
        this.$onFocusChanged$inlined.invoke(point);
    }
}
