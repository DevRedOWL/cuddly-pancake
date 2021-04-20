package p035ru.unicorn.ujin.market.coupon;

import kotlin.Metadata;
import p035ru.unicorn.ujin.market.coupon.CouponListAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo51343d2 = {"ru/unicorn/ujin/market/coupon/CouponListFragment$onViewCreated$1", "Lru/unicorn/ujin/market/coupon/CouponListAdapter$OnGetCouponListener;", "onGetCoupon", "", "id", "", "position", "(Ljava/lang/Integer;I)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.coupon.CouponListFragment$onViewCreated$1 */
/* compiled from: CouponListFragment.kt */
public final class CouponListFragment$onViewCreated$1 implements CouponListAdapter.OnGetCouponListener {
    final /* synthetic */ CouponListFragment this$0;

    CouponListFragment$onViewCreated$1(CouponListFragment couponListFragment) {
        this.this$0 = couponListFragment;
    }

    public void onGetCoupon(Integer num, int i) {
        this.this$0.getMarketViewModel().redeemCouponCode(num);
        this.this$0.getMarketViewModel().getRedeemCouponCodeLiveData().observe(this.this$0, new CouponListFragment$onViewCreated$1$onGetCoupon$1(this, num, i));
    }
}
