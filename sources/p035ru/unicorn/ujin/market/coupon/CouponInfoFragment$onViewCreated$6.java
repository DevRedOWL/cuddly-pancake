package p035ru.unicorn.ujin.market.coupon;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo51343d2 = {"ru/unicorn/ujin/market/coupon/CouponInfoFragment$onViewCreated$6", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.coupon.CouponInfoFragment$onViewCreated$6 */
/* compiled from: CouponInfoFragment.kt */
public final class CouponInfoFragment$onViewCreated$6 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ CouponInfoFragment this$0;

    CouponInfoFragment$onViewCreated$6(CouponInfoFragment couponInfoFragment) {
        this.this$0 = couponInfoFragment;
    }

    public void onGlobalLayout() {
        CouponInfoFragment couponInfoFragment = this.this$0;
        TextView textView = (TextView) couponInfoFragment._$_findCachedViewById(C5619R.C5622id.tvLongDescriptionTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "tvLongDescriptionTitle");
        couponInfoFragment.setObtainTitleHeight(textView.getMeasuredHeight());
        TextView textView2 = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvTermsOfObtainingTitle);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvTermsOfObtainingTitle");
        textView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
