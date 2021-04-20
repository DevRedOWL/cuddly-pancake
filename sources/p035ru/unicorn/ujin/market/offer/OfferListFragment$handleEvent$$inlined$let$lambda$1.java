package p035ru.unicorn.ujin.market.offer;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Offer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo51343d2 = {"<anonymous>", "", "run", "ru/unicorn/ujin/market/offer/OfferListFragment$handleEvent$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferListFragment$handleEvent$$inlined$let$lambda$1 */
/* compiled from: OfferListFragment.kt */
final class OfferListFragment$handleEvent$$inlined$let$lambda$1 implements Runnable {
    final /* synthetic */ List $offerList;
    final /* synthetic */ Resource $resource$inlined;
    final /* synthetic */ OfferListFragment this$0;

    OfferListFragment$handleEvent$$inlined$let$lambda$1(List list, OfferListFragment offerListFragment, Resource resource) {
        this.$offerList = list;
        this.this$0 = offerListFragment;
        this.$resource$inlined = resource;
    }

    public final void run() {
        for (Offer addItem : this.$offerList) {
            OfferListFragment.access$getOfferListAdapter$p(this.this$0).addItem(addItem);
        }
    }
}
