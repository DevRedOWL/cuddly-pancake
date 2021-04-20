package p035ru.unicorn.ujin.market.model;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.model.MarketViewModel$getCart$4 */
/* compiled from: MarketViewModel.kt */
final class MarketViewModel$getCart$4<T> implements Consumer<Resource<CartResponse>> {
    final /* synthetic */ MarketViewModel this$0;

    MarketViewModel$getCart$4(MarketViewModel marketViewModel) {
        this.this$0 = marketViewModel;
    }

    public final void accept(Resource<CartResponse> resource) {
        this.this$0.getCartItemListLiveData().setValue(resource);
    }
}
