package p035ru.unicorn.ujin.market.offer;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;
import p035ru.unicorn.ujin.market.offer.BaseOfferViewHolder;
import p035ru.unicorn.ujin.market.order.OrderFormFragment;
import p035ru.unicorn.ujin.metrics.MetricsFacade;
import p035ru.unicorn.ujin.metrics.MetricsKeys;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, mo51343d2 = {"ru/unicorn/ujin/market/offer/OfferListFragment$onViewCreated$1", "Lru/unicorn/ujin/market/offer/BaseOfferViewHolder$OnOfferClickListener;", "onDescriptionClicked", "", "id", "", "onOrderClicked", "onToCartClicked", "count", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferListFragment$onViewCreated$1 */
/* compiled from: OfferListFragment.kt */
public final class OfferListFragment$onViewCreated$1 implements BaseOfferViewHolder.OnOfferClickListener {
    final /* synthetic */ OfferListFragment this$0;

    OfferListFragment$onViewCreated$1(OfferListFragment offerListFragment) {
        this.this$0 = offerListFragment;
    }

    public void onDescriptionClicked(String str) {
        this.this$0.showOfferFragment(str, MetricsKeys.product.getValue());
    }

    public void onToCartClicked(String str, int i) {
        String str2;
        Offer offer = this.this$0.getMarketViewModel().getOffer(str);
        MetricsFacade.Companion companion = MetricsFacade.Companion;
        String value = MetricsKeys.market.getValue();
        HashMap hashMap = new HashMap();
        String value2 = MetricsKeys.addToCart.getValue();
        if (offer == null || (str2 = offer.getTitle()) == null) {
            str2 = MetricsKeys.error.getValue();
        }
        hashMap.put(value2, str2);
        Unit unit = Unit.INSTANCE;
        companion.reportEvent(value, (HashMap<String, ? extends Object>) hashMap);
        if (str != null) {
            this.this$0.getMarketViewModel().getCartItemListLiveData().removeObserver(new C5760xaa098136(this, i));
            this.this$0.getMarketViewModel().setCart(str, this.this$0.getMarketViewModel().getCurrentOfferQuantity(str) + i);
            this.this$0.getMarketViewModel().getCartItemListLiveData().observe(this.this$0.getViewLifecycleOwner(), new C5761xaa098137(this, i));
        }
    }

    public void onOrderClicked(String str) {
        this.this$0.showOrderFormFragment(str, OrderFormFragment.OFFER_TYPE);
    }
}
