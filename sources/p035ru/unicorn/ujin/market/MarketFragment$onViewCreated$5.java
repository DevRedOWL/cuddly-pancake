package p035ru.unicorn.ujin.market;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\n¢\u0006\u0002\b\t"}, mo51343d2 = {"<anonymous>", "", "v", "Landroidx/core/widget/NestedScrollView;", "scrollX", "", "scrollY", "oldScrollX", "oldScrollY", "onScrollChange"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.MarketFragment$onViewCreated$5 */
/* compiled from: MarketFragment.kt */
final class MarketFragment$onViewCreated$5 implements NestedScrollView.OnScrollChangeListener {
    final /* synthetic */ MarketFragment this$0;

    MarketFragment$onViewCreated$5(MarketFragment marketFragment) {
        this.this$0 = marketFragment;
    }

    public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        NestedScrollView nestedScrollView2 = (NestedScrollView) this.this$0._$_findCachedViewById(C5619R.C5622id.categoriesScrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "categoriesScrollView");
        View childAt = ((NestedScrollView) this.this$0._$_findCachedViewById(C5619R.C5622id.categoriesScrollView)).getChildAt(nestedScrollView2.getChildCount() - 1);
        if (childAt != null) {
            int measuredHeight = childAt.getMeasuredHeight();
            NestedScrollView nestedScrollView3 = (NestedScrollView) this.this$0._$_findCachedViewById(C5619R.C5622id.categoriesScrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView3, "categoriesScrollView");
            if (i2 >= measuredHeight - nestedScrollView3.getMeasuredHeight() && i2 > i4 && this.this$0.currentPage < this.this$0.lastPage && this.this$0.isCategoryListLoaded && this.this$0.isCouponListLoaded && this.this$0.isCompanyLoaded) {
                MarketFragment marketFragment = this.this$0;
                marketFragment.currentPage = marketFragment.currentPage + 1;
                this.this$0.loadCategoryList();
            }
        }
    }
}
