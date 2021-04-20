package p035ru.unicorn.ujin.market.model;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.model.MarketViewModel$clearCart$3 */
/* compiled from: MarketViewModel.kt */
final class MarketViewModel$clearCart$3<T> implements Consumer<Resource<CartResponse>> {
    final /* synthetic */ MarketViewModel this$0;

    MarketViewModel$clearCart$3(MarketViewModel marketViewModel) {
        this.this$0 = marketViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = r4.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(p035ru.unicorn.ujin.data.realm.Resource<p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse> r4) {
        /*
            r3 = this;
            ru.unicorn.ujin.market.model.MarketViewModel r0 = r3.this$0
            ru.unicorn.ujin.market.repository.MarketLocalRepository r0 = r0.localRepository
            if (r4 == 0) goto L_0x0015
            java.lang.Object r4 = r4.getData()
            ru.unicorn.ujin.data.api.response.marketplace.CartResponse r4 = (p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse) r4
            if (r4 == 0) goto L_0x0015
            io.realm.RealmList r4 = r4.getList()
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartItem> r1 = p035ru.unicorn.ujin.data.realm.marketplace.CartItem.class
            r2 = 1
            r0.saveDataAsList(r4, r1, r2)
            ru.unicorn.ujin.market.model.MarketViewModel r4 = r3.this$0
            r4.clearUserLocalCart()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.model.MarketViewModel$clearCart$3.accept(ru.unicorn.ujin.data.realm.Resource):void");
    }
}
