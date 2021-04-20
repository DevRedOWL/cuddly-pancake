package p033co.infinum.goldeneye;

import android.graphics.Point;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/graphics/Point;", "invoke"}, mo51344k = 3, mo51345mv = {1, 1, 13})
/* renamed from: co.infinum.goldeneye.GoldenEye1Impl$initGestureManager$focusHandler$1 */
/* compiled from: GoldenEye1Impl.kt */
final class GoldenEye1Impl$initGestureManager$focusHandler$1 extends Lambda implements Function1<Point, Unit> {
    final /* synthetic */ GoldenEye1Impl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GoldenEye1Impl$initGestureManager$focusHandler$1(GoldenEye1Impl goldenEye1Impl) {
        super(1);
        this.this$0 = goldenEye1Impl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Point) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Point point) {
        Intrinsics.checkParameterIsNotNull(point, "it");
        OnFocusChangedCallback access$getOnFocusChangedCallback$p = this.this$0.onFocusChangedCallback;
        if (access$getOnFocusChangedCallback$p != null) {
            access$getOnFocusChangedCallback$p.onFocusChanged(point);
        }
    }
}
