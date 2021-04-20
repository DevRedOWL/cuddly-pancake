package p035ru.unicorn.ujin.view.fragments.profileselection.view.sections;

import android.view.View;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection$ViewHolder$bind$3 */
/* compiled from: SearchBuildingSection.kt */
final class SearchBuildingSection$ViewHolder$bind$3 implements View.OnClickListener {
    final /* synthetic */ SearchBuildingSection.ViewHolder this$0;

    SearchBuildingSection$ViewHolder$bind$3(SearchBuildingSection.ViewHolder viewHolder) {
        this.this$0 = viewHolder;
    }

    public final void onClick(View view) {
        this.this$0.this$0.setSelectedValue(new SearchBuildingDTO((SearchComplex) null, (BusinessBuildings) null, 3, (DefaultConstructorMarker) null));
        View view2 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        ((MaterialAutoCompleteTextView) view2.findViewById(C5619R.C5622id.tvSearch)).removeTextChangedListener(this.this$0.editTextWatcher);
        View view3 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view3, "itemView");
        ((MaterialAutoCompleteTextView) view3.findViewById(C5619R.C5622id.tvSearch)).setText("", false);
        View view4 = this.this$0.itemView;
        Intrinsics.checkNotNullExpressionValue(view4, "itemView");
        ((MaterialAutoCompleteTextView) view4.findViewById(C5619R.C5622id.tvSearch)).addTextChangedListener(this.this$0.editTextWatcher);
        this.this$0.showSearchVisibility(true);
        this.this$0.this$0.getSearchAutoCompleteAdapter().setItems(new ArrayList());
    }
}
