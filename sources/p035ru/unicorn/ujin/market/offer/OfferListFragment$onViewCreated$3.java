package p035ru.unicorn.ujin.market.offer;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\n¢\u0006\u0002\b\t"}, mo51343d2 = {"<anonymous>", "", "v", "Landroidx/core/widget/NestedScrollView;", "scrollX", "", "scrollY", "oldScrollX", "oldScrollY", "onScrollChange"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.offer.OfferListFragment$onViewCreated$3 */
/* compiled from: OfferListFragment.kt */
final class OfferListFragment$onViewCreated$3 implements NestedScrollView.OnScrollChangeListener {
    final /* synthetic */ OfferListFragment this$0;

    OfferListFragment$onViewCreated$3(OfferListFragment offerListFragment) {
        this.this$0 = offerListFragment;
    }

    public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        NestedScrollView nestedScrollView2 = (NestedScrollView) this.this$0._$_findCachedViewById(C5619R.C5622id.offerListScrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "offerListScrollView");
        View childAt = ((NestedScrollView) this.this$0._$_findCachedViewById(C5619R.C5622id.offerListScrollView)).getChildAt(nestedScrollView2.getChildCount() - 1);
        if (childAt != null) {
            int measuredHeight = childAt.getMeasuredHeight();
            NestedScrollView nestedScrollView3 = (NestedScrollView) this.this$0._$_findCachedViewById(C5619R.C5622id.offerListScrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView3, "offerListScrollView");
            if (i2 >= measuredHeight - nestedScrollView3.getMeasuredHeight() && i2 > i4 && this.this$0.currentPage < this.this$0.lastPage && this.this$0.isOfferListLoaded) {
                OfferListFragment offerListFragment = this.this$0;
                offerListFragment.currentPage = offerListFragment.currentPage + 1;
                this.this$0.loadOfferList();
            }
        }
    }
}
