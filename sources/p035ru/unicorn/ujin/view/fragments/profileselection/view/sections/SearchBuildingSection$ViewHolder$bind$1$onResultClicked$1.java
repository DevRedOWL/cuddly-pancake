package p035ru.unicorn.ujin.view.fragments.profileselection.view.sections;

import android.view.View;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.navigation.helper.UIHelper;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection$ViewHolder$bind$1$onResultClicked$1 */
/* compiled from: SearchBuildingSection.kt */
final class SearchBuildingSection$ViewHolder$bind$1$onResultClicked$1 implements Runnable {
    final /* synthetic */ SearchBuildingDTO $item;
    final /* synthetic */ SearchBuildingSection$ViewHolder$bind$1 this$0;

    SearchBuildingSection$ViewHolder$bind$1$onResultClicked$1(SearchBuildingSection$ViewHolder$bind$1 searchBuildingSection$ViewHolder$bind$1, SearchBuildingDTO searchBuildingDTO) {
        this.this$0 = searchBuildingSection$ViewHolder$bind$1;
        this.$item = searchBuildingDTO;
    }

    public final void run() {
        String title;
        View view = this.this$0.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) view.findViewById(C5619R.C5622id.tvSearch);
        this.this$0.this$0.this$0.setSelectedValue(this.$item);
        View view2 = this.this$0.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        ((MaterialAutoCompleteTextView) view2.findViewById(C5619R.C5622id.tvSearch)).removeTextChangedListener(this.this$0.this$0.editTextWatcher);
        BusinessBuildings building = this.$item.getBuilding();
        int i = 0;
        materialAutoCompleteTextView.setText(String.valueOf(building != null ? building.getTitle() : null), false);
        View view3 = this.this$0.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        ((MaterialAutoCompleteTextView) view3.findViewById(C5619R.C5622id.tvSearch)).addTextChangedListener(this.this$0.this$0.editTextWatcher);
        BusinessBuildings building2 = this.$item.getBuilding();
        if (!(building2 == null || (title = building2.getTitle()) == null)) {
            i = title.length();
        }
        materialAutoCompleteTextView.setSelection(i);
        materialAutoCompleteTextView.clearFocus();
        View view4 = this.this$0.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "itemView");
        UIHelper.hideKeyboard(view4.getContext(), materialAutoCompleteTextView);
    }
}
