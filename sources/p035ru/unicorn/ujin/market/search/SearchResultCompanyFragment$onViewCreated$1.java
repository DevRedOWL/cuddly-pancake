package p035ru.unicorn.ujin.market.search;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.data.realm.marketplace.Company;
import p035ru.unicorn.ujin.market.search.SearchResultAdapter;
import p035ru.unicorn.ujin.metrics.MetricsKeys;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, mo51343d2 = {"ru/unicorn/ujin/market/search/SearchResultCompanyFragment$onViewCreated$1", "Lru/unicorn/ujin/market/search/SearchResultAdapter$OnItemClickListener;", "onCategoryClicked", "", "category", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "onCompanyClicked", "company", "Lru/unicorn/ujin/data/realm/marketplace/Company;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.search.SearchResultCompanyFragment$onViewCreated$1 */
/* compiled from: SearchResultCompanyFragment.kt */
public final class SearchResultCompanyFragment$onViewCreated$1 implements SearchResultAdapter.OnItemClickListener {
    final /* synthetic */ SearchResultCompanyFragment this$0;

    SearchResultCompanyFragment$onViewCreated$1(SearchResultCompanyFragment searchResultCompanyFragment) {
        this.this$0 = searchResultCompanyFragment;
    }

    public void onCompanyClicked(Company company) {
        UIHelper.hideKeyboard(this.this$0.getBaseActivity(), (RecyclerView) this.this$0._$_findCachedViewById(C5619R.C5622id.resultListView));
        SearchResultCompanyFragment searchResultCompanyFragment = this.this$0;
        String str = null;
        String id = company != null ? company.getId() : null;
        if (company != null) {
            str = company.getTitle();
        }
        searchResultCompanyFragment.showCompanyFragment(id, str, MetricsKeys.offerCompanyInfo.getValue());
    }

    public void onCategoryClicked(Category category) {
        UIHelper.hideKeyboard(this.this$0.getBaseActivity(), (RecyclerView) this.this$0._$_findCachedViewById(C5619R.C5622id.resultListView));
        SearchResultCompanyFragment searchResultCompanyFragment = this.this$0;
        String str = null;
        String id = category != null ? category.getId() : null;
        if (category != null) {
            str = category.getTitle();
        }
        searchResultCompanyFragment.showCategoryFragment(id, str, MetricsKeys.category.getValue());
    }
}
