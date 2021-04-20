package p035ru.unicorn.ujin.market.model;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.ContextBanner;
import p035ru.unicorn.ujin.data.realm.Resource;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "", "Lru/unicorn/ujin/data/realm/ContextBanner;", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.model.MarketViewModel$getContextBannerList$2 */
/* compiled from: MarketViewModel.kt */
final class MarketViewModel$getContextBannerList$2<T> implements Consumer<Resource<List<? extends ContextBanner>>> {
    final /* synthetic */ MarketViewModel this$0;

    MarketViewModel$getContextBannerList$2(MarketViewModel marketViewModel) {
        this.this$0 = marketViewModel;
    }

    public final void accept(Resource<List<ContextBanner>> resource) {
        this.this$0.getContextBannerListLiveData().setValue(resource);
    }
}
