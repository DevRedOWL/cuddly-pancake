package p035ru.unicorn.ujin.market.category;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/market/category/CategoryFragment$showSubCategoryList$3$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.category.CategoryFragment$showSubCategoryList$$inlined$apply$lambda$1 */
/* compiled from: CategoryFragment.kt */
final class CategoryFragment$showSubCategoryList$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ String $decCategory$inlined;
    final /* synthetic */ List $subCategoryList$inlined;
    final /* synthetic */ CategoryFragment this$0;

    CategoryFragment$showSubCategoryList$$inlined$apply$lambda$1(CategoryFragment categoryFragment, String str, List list) {
        this.this$0 = categoryFragment;
        this.$decCategory$inlined = str;
        this.$subCategoryList$inlined = list;
    }

    public final void onClick(View view) {
        int size = this.$subCategoryList$inlined.size();
        for (int i = 5; i < size; i++) {
            CategoryFragment.access$getSubCategoryListAdapter$p(this.this$0).addItem((Category) this.$subCategoryList$inlined.get(i));
        }
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.btnLoadAll);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnLoadAll");
        dynamicBackgroundButton.setVisibility(8);
        this.this$0.needLoadMore = true;
    }
}
