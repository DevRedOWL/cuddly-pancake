package p035ru.unicorn.ujin.view.fragments.development;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.realm.DeveloperDayImageList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\n¢\u0006\u0002\b\t¨\u0006\n"}, mo51343d2 = {"<anonymous>", "", "v", "Landroidx/core/widget/NestedScrollView;", "scrollX", "", "scrollY", "oldScrollX", "oldScrollY", "onScrollChange", "ru/unicorn/ujin/view/fragments/development/DeveloperBuildingStagesFragment$showData$1$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$2 */
/* compiled from: DeveloperBuildingStagesFragment.kt */
final class DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$2 implements NestedScrollView.OnScrollChangeListener {
    final /* synthetic */ ArrayList $it;
    final /* synthetic */ DeveloperBuildingStagesFragment this$0;

    DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$2(ArrayList arrayList, DeveloperBuildingStagesFragment developerBuildingStagesFragment) {
        this.$it = arrayList;
        this.this$0 = developerBuildingStagesFragment;
    }

    public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        NestedScrollView nestedScrollView2 = (NestedScrollView) this.this$0._$_findCachedViewById(C5619R.C5622id.nestedScroll);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "nestedScroll");
        View childAt = ((NestedScrollView) this.this$0._$_findCachedViewById(C5619R.C5622id.nestedScroll)).getChildAt(nestedScrollView2.getChildCount() - 1);
        if (childAt != null) {
            int measuredHeight = childAt.getMeasuredHeight();
            NestedScrollView nestedScrollView3 = (NestedScrollView) this.this$0._$_findCachedViewById(C5619R.C5622id.nestedScroll);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView3, "nestedScroll");
            if (i2 >= measuredHeight - nestedScrollView3.getMeasuredHeight() && i2 > i4 && this.this$0.nextGroup < this.this$0.totalCount - 1 && DeveloperBuildingStagesFragment.access$getStagesAdapter$p(this.this$0).getItemCount() != 0) {
                DeveloperBuildingStagesFragment developerBuildingStagesFragment = this.this$0;
                developerBuildingStagesFragment.nextGroup = developerBuildingStagesFragment.nextGroup + 1;
                DeveloperBuildingStagesFragment developerBuildingStagesFragment2 = this.this$0;
                Object obj = this.$it.get(developerBuildingStagesFragment2.nextGroup);
                Intrinsics.checkNotNullExpressionValue(obj, "it[nextGroup]");
                developerBuildingStagesFragment2.loadImageData((DeveloperDayImageList) obj);
            }
        }
    }
}
