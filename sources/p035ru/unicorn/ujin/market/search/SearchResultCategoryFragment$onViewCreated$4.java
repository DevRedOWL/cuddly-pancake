package p035ru.unicorn.ujin.market.search;

import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "", "kotlin.jvm.PlatformType", "onChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.search.SearchResultCategoryFragment$onViewCreated$4 */
/* compiled from: SearchResultCategoryFragment.kt */
final class SearchResultCategoryFragment$onViewCreated$4<T> implements Observer<String> {
    final /* synthetic */ SearchResultCategoryFragment this$0;

    SearchResultCategoryFragment$onViewCreated$4(SearchResultCategoryFragment searchResultCategoryFragment) {
        this.this$0 = searchResultCategoryFragment;
    }

    public final void onChanged(String str) {
        SearchResultCategoryFragment searchResultCategoryFragment = this.this$0;
        Intrinsics.checkNotNullExpressionValue(str, "event");
        searchResultCategoryFragment.handleSearchCategoryEvent(str);
    }
}
