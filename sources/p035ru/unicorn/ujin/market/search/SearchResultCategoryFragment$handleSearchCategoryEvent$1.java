package p035ru.unicorn.ujin.market.search;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData;
import p035ru.unicorn.ujin.data.realm.Resource;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.search.SearchResultCategoryFragment$handleSearchCategoryEvent$1 */
/* compiled from: SearchResultCategoryFragment.kt */
final class SearchResultCategoryFragment$handleSearchCategoryEvent$1<T> implements Observer<Resource<CategoryListResponseData>> {
    final /* synthetic */ SearchResultCategoryFragment this$0;

    SearchResultCategoryFragment$handleSearchCategoryEvent$1(SearchResultCategoryFragment searchResultCategoryFragment) {
        this.this$0 = searchResultCategoryFragment;
    }

    public final void onChanged(Resource<CategoryListResponseData> resource) {
        this.this$0.getViewLifecycleOwner();
    }
}
