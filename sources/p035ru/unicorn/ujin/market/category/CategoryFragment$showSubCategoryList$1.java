package p035ru.unicorn.ujin.market.category;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.market.category.SubCategoryListAdapter;
import p035ru.unicorn.ujin.metrics.MetricsKeys;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/market/category/CategoryFragment$showSubCategoryList$1", "Lru/unicorn/ujin/market/category/SubCategoryListAdapter$SubCategoryListAdapterListener;", "onItemSelected", "", "category", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.category.CategoryFragment$showSubCategoryList$1 */
/* compiled from: CategoryFragment.kt */
public final class CategoryFragment$showSubCategoryList$1 implements SubCategoryListAdapter.SubCategoryListAdapterListener {
    final /* synthetic */ CategoryFragment this$0;

    CategoryFragment$showSubCategoryList$1(CategoryFragment categoryFragment) {
        this.this$0 = categoryFragment;
    }

    public void onItemSelected(Category category) {
        CategoryFragment categoryFragment = this.this$0;
        String str = null;
        String id = category != null ? category.getId() : null;
        if (category != null) {
            str = category.getTitle();
        }
        categoryFragment.showSubCategoryFragment(id, str, MetricsKeys.category.getValue(), "");
    }
}
