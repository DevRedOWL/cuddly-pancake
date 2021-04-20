package p035ru.unicorn.ujin.view.fragments.profileselection.view.sections;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex;
import p035ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchBuildingSection$ViewHolder$editTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchBuildingSection$ViewHolder$editTextWatcher$1 */
/* compiled from: SearchBuildingSection.kt */
public final class SearchBuildingSection$ViewHolder$editTextWatcher$1 implements TextWatcher {
    final /* synthetic */ SearchBuildingSection.ViewHolder this$0;

    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    SearchBuildingSection$ViewHolder$editTextWatcher$1(SearchBuildingSection.ViewHolder viewHolder) {
        this.this$0 = viewHolder;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
        SearchBuildingDTO access$getSelectedValue$p = this.this$0.this$0.selectedValue;
        if ((access$getSelectedValue$p != null ? access$getSelectedValue$p.getBuilding() : null) != null) {
            this.this$0.this$0.setSelectedValue(new SearchBuildingDTO((SearchComplex) null, (BusinessBuildings) null, 3, (DefaultConstructorMarker) null));
        }
        if (!StringsKt.isBlank(charSequence)) {
            if (charSequence.length() > 2) {
                this.this$0.this$0.getOnTextChanged().onNext(charSequence.toString());
            }
            this.this$0.showSearchVisibility(false);
            return;
        }
        this.this$0.showSearchVisibility(true);
    }
}
