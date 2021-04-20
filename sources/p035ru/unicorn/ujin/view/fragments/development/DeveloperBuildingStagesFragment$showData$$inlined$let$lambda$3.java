package p035ru.unicorn.ujin.view.fragments.development;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/development/DeveloperBuildingStagesFragment$showData$1$3", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "getSpanSize", "", "position", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.development.DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$3 */
/* compiled from: DeveloperBuildingStagesFragment.kt */
public final class DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$3 extends GridLayoutManager.SpanSizeLookup {
    final /* synthetic */ DeveloperBuildingStagesFragment this$0;

    DeveloperBuildingStagesFragment$showData$$inlined$let$lambda$3(DeveloperBuildingStagesFragment developerBuildingStagesFragment) {
        this.this$0 = developerBuildingStagesFragment;
    }

    public int getSpanSize(int i) {
        int itemViewType = DeveloperBuildingStagesFragment.access$getStagesAdapter$p(this.this$0).getItemViewType(i);
        if (itemViewType != 0) {
            return itemViewType != 1 ? -1 : 1;
        }
        return 2;
    }
}
