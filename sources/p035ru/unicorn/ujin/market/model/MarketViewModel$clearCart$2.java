package p035ru.unicorn.ujin.market.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.marketplace.CartResponse;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Predicate;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CartResponse;", "test"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.model.MarketViewModel$clearCart$2 */
/* compiled from: MarketViewModel.kt */
final class MarketViewModel$clearCart$2<T> implements Predicate<Resource<CartResponse>> {
    public static final MarketViewModel$clearCart$2 INSTANCE = new MarketViewModel$clearCart$2();

    MarketViewModel$clearCart$2() {
    }

    public final boolean test(Resource<CartResponse> resource) {
        Intrinsics.checkNotNullParameter(resource, "data");
        return resource.getData() != null;
    }
}
