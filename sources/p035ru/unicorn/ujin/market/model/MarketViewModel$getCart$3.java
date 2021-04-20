package p035ru.unicorn.ujin.market.model;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.model.MarketViewModel$getCart$3 */
/* compiled from: MarketViewModel.kt */
final class MarketViewModel$getCart$3<T> implements Consumer<Resource<CartResponse>> {
    final /* synthetic */ MarketViewModel this$0;

    MarketViewModel$getCart$3(MarketViewModel marketViewModel) {
        this.this$0 = marketViewModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.getData();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(p035ru.unicorn.ujin.data.realm.Resource<p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse> r5) {
        /*
            r4 = this;
            ru.unicorn.ujin.market.model.MarketViewModel r0 = r4.this$0
            ru.unicorn.ujin.market.repository.MarketLocalRepository r0 = r0.localRepository
            if (r5 == 0) goto L_0x0015
            java.lang.Object r1 = r5.getData()
            ru.unicorn.ujin.data.api.response.marketplace.CartResponse r1 = (p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse) r1
            if (r1 == 0) goto L_0x0015
            io.realm.RealmList r1 = r1.getList()
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            java.util.List r1 = (java.util.List) r1
            java.lang.Class<ru.unicorn.ujin.data.realm.marketplace.CartItem> r2 = p035ru.unicorn.ujin.data.realm.marketplace.CartItem.class
            r3 = 1
            r0.saveDataAsList(r1, r2, r3)
            if (r5 == 0) goto L_0x003f
            java.lang.Object r5 = r5.getData()
            ru.unicorn.ujin.data.api.response.marketplace.CartResponse r5 = (p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse) r5
            if (r5 == 0) goto L_0x003f
            io.realm.RealmList r5 = r5.getList()
            if (r5 == 0) goto L_0x003f
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = kotlin.collections.CollectionsKt.filterNotNull(r5)
            if (r5 == 0) goto L_0x003f
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r5 = kotlin.collections.CollectionsKt.toMutableList(r5)
            if (r5 == 0) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
        L_0x0046:
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0059
            ru.unicorn.ujin.market.model.MarketViewModel r0 = r4.this$0
            ru.unicorn.ujin.viewModel.SingleLiveEvent r0 = r0.getUserCartItemListLiveData()
            r0.postValue(r5)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.market.model.MarketViewModel$getCart$3.accept(ru.unicorn.ujin.data.realm.Resource):void");
    }
}
