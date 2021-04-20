package p035ru.unicorn.ujin.market.coupon;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CouponListResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CouponListResponseData;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.coupon.CouponListFragment$onViewCreated$4 */
/* compiled from: CouponListFragment.kt */
final class CouponListFragment$onViewCreated$4<T> implements Observer<Resource<CouponListResponseData>> {
    final /* synthetic */ CouponListFragment this$0;

    CouponListFragment$onViewCreated$4(CouponListFragment couponListFragment) {
        this.this$0 = couponListFragment;
    }

    public final void onChanged(Resource<CouponListResponseData> resource) {
        this.this$0.handleEvent(resource);
    }
}
