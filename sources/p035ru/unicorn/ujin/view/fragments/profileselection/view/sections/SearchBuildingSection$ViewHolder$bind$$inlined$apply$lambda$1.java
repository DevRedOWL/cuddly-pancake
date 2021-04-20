package p035ru.unicorn.ujin.view.fragments.profileselection.view.sections;

import android.view.View;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchBuildingSection$ViewHolder$bind$2$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection$ViewHolder$bind$$inlined$apply$lambda$1 */
/* compiled from: SearchBuildingSection.kt */
final class SearchBuildingSection$ViewHolder$bind$$inlined$apply$lambda$1 implements View.OnClickListener {
    final /* synthetic */ MaterialAutoCompleteTextView $this_apply;
    final /* synthetic */ SearchBuildingSection.ViewHolder this$0;

    SearchBuildingSection$ViewHolder$bind$$inlined$apply$lambda$1(MaterialAutoCompleteTextView materialAutoCompleteTextView, SearchBuildingSection.ViewHolder viewHolder) {
        this.$this_apply = materialAutoCompleteTextView;
        this.this$0 = viewHolder;
    }

    public final void onClick(View view) {
        this.this$0.showSearchVisibility(!(!StringsKt.isBlank(this.$this_apply.getText().toString())));
        if (!this.$this_apply.isPopupShowing()) {
            this.$this_apply.showDropDown();
        }
    }
}
