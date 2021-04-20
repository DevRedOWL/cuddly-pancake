package p035ru.unicorn.ujin.market.offer;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "kotlin.jvm.PlatformType", "onChanged", "ru/unicorn/ujin/market/offer/OfferListFragment$onViewCreated$1$onToCartClicked$2$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferListFragment$onViewCreated$1$onToCartClicked$$inlined$let$lambda$2 */
/* compiled from: OfferListFragment.kt */
final class C5761xaa098137<T> implements Observer<Resource<CartResponse>> {
    final /* synthetic */ int $count$inlined;
    final /* synthetic */ OfferListFragment$onViewCreated$1 this$0;

    C5761xaa098137(OfferListFragment$onViewCreated$1 offerListFragment$onViewCreated$1, int i) {
        this.this$0 = offerListFragment$onViewCreated$1;
        this.$count$inlined = i;
    }

    public final void onChanged(Resource<CartResponse> resource) {
        this.this$0.this$0.handleSetCartEvent(resource);
    }
}
