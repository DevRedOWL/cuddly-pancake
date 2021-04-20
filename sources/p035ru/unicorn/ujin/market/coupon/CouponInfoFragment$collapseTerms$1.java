package p035ru.unicorn.ujin.market.coupon;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.coupon.CouponInfoFragment$collapseTerms$1 */
/* compiled from: CouponInfoFragment.kt */
final class CouponInfoFragment$collapseTerms$1 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ int $fullHeight;
    final /* synthetic */ View $view;

    CouponInfoFragment$collapseTerms$1(View view, int i) {
        this.$view = view;
        this.$fullHeight = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = this.$view.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(valueAnimator, "animation");
        layoutParams.height = (int) (((float) this.$fullHeight) * (((float) 1) - valueAnimator.getAnimatedFraction()));
        this.$view.setLayoutParams(layoutParams);
    }
}
