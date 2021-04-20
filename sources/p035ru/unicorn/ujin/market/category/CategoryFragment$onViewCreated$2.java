package p035ru.unicorn.ujin.market.category;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "kotlin.jvm.PlatformType", "verticalOffset", "", "onOffsetChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.category.CategoryFragment$onViewCreated$2 */
/* compiled from: CategoryFragment.kt */
final class CategoryFragment$onViewCreated$2 implements AppBarLayout.OnOffsetChangedListener {
    final /* synthetic */ CategoryFragment this$0;

    CategoryFragment$onViewCreated$2(CategoryFragment categoryFragment) {
        this.this$0 = categoryFragment;
    }

    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        if (Math.abs(i) >= (appBarLayout != null ? appBarLayout.getTotalScrollRange() : -100) && this.this$0.needLoadMore && this.this$0.currentPage < this.this$0.lastPage && this.this$0.isCategoryListLoaded) {
            CategoryFragment categoryFragment = this.this$0;
            categoryFragment.currentPage = categoryFragment.currentPage + 1;
            this.this$0.loadCategoryList();
        }
    }
}
