package p035ru.unicorn.ujin.market.model;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CouponListResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Coupon;
import p035ru.unicorn.ujin.market.repository.MarketLocalRepository;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CouponListResponseData;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.model.MarketViewModel$loadCouponList$2 */
/* compiled from: MarketViewModel.kt */
final class MarketViewModel$loadCouponList$2<T> implements Consumer<Resource<CouponListResponseData>> {
    final /* synthetic */ MarketViewModel this$0;

    MarketViewModel$loadCouponList$2(MarketViewModel marketViewModel) {
        this.this$0 = marketViewModel;
    }

    public final void accept(Resource<CouponListResponseData> resource) {
        if (resource != null && resource.getData() != null) {
            MarketLocalRepository access$getLocalRepository$p = this.this$0.localRepository;
            CouponListResponseData data = resource.getData();
            access$getLocalRepository$p.saveDataAsList(data != null ? data.getCoupons() : null, Coupon.class, true);
        }
    }
}
