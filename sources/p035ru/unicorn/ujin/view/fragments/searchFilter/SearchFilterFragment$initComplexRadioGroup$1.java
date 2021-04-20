package p035ru.unicorn.ujin.view.fragments.searchFilter;

import android.widget.RadioGroup;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/RadioGroup;", "kotlin.jvm.PlatformType", "id", "", "onCheckedChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterFragment$initComplexRadioGroup$1 */
/* compiled from: SearchFilterFragment.kt */
final class SearchFilterFragment$initComplexRadioGroup$1 implements RadioGroup.OnCheckedChangeListener {
    final /* synthetic */ SearchFilterFragment this$0;

    SearchFilterFragment$initComplexRadioGroup$1(SearchFilterFragment searchFilterFragment) {
        this.this$0 = searchFilterFragment;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.this$0.complexSelected(i);
    }
}
