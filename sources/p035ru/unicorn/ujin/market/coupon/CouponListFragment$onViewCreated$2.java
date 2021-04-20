package p035ru.unicorn.ujin.market.coupon;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "position", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.coupon.CouponListFragment$onViewCreated$2 */
/* compiled from: CouponListFragment.kt */
final class CouponListFragment$onViewCreated$2 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ CouponListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CouponListFragment$onViewCreated$2(CouponListFragment couponListFragment) {
        super(1);
        this.this$0 = couponListFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        this.this$0.handleCouponClick(i);
    }
}
