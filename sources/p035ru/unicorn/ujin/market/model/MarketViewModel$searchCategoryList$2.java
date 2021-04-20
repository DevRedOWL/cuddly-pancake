package p035ru.unicorn.ujin.market.model;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.market.repository.MarketLocalRepository;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.model.MarketViewModel$searchCategoryList$2 */
/* compiled from: MarketViewModel.kt */
final class MarketViewModel$searchCategoryList$2<T> implements Consumer<Resource<CategoryListResponseData>> {
    final /* synthetic */ int $page;
    final /* synthetic */ MarketViewModel this$0;

    MarketViewModel$searchCategoryList$2(MarketViewModel marketViewModel, int i) {
        this.this$0 = marketViewModel;
        this.$page = i;
    }

    public final void accept(Resource<CategoryListResponseData> resource) {
        if (resource != null && resource.getData() != null) {
            MarketLocalRepository access$getLocalRepository$p = this.this$0.localRepository;
            CategoryListResponseData data = resource.getData();
            List categories = data != null ? data.getCategories() : null;
            Class<Category> cls = Category.class;
            boolean z = true;
            if (this.$page != 1) {
                z = false;
            }
            access$getLocalRepository$p.saveDataAsList(categories, cls, z);
        }
    }
}
