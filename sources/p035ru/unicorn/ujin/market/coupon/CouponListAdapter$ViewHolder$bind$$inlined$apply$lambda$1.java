package p035ru.unicorn.ujin.market.coupon;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;
import p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode;
import p035ru.unicorn.ujin.market.coupon.CouponListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/coupon/CouponListAdapter$ViewHolder$bind$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.coupon.CouponListAdapter$ViewHolder$bind$$inlined$apply$lambda$1 */
/* compiled from: CouponListAdapter.kt */
final class CouponListAdapter$ViewHolder$bind$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ Coupon $coupon$inlined;
    final /* synthetic */ CouponListAdapter.ViewHolder this$0;

    CouponListAdapter$ViewHolder$bind$$inlined$apply$lambda$1(CouponListAdapter.ViewHolder viewHolder, Coupon coupon) {
        this.this$0 = viewHolder;
        this.$coupon$inlined = coupon;
    }

    public final void onClick(View view) {
        String str;
        Function1<String, Unit> onCopyCouponClickListener = this.this$0.this$0.getOnCopyCouponClickListener();
        RedeemedCode redeemedCode = this.$coupon$inlined.getRedeemedCode();
        if (redeemedCode == null || (str = redeemedCode.getText()) == null) {
            str = "";
        }
        onCopyCouponClickListener.invoke(str);
    }
}
