package p035ru.unicorn.ujin.view.fragments.profileselection.view.sections;

import android.widget.Filter;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0014¨\u0006\t"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/profileselection/view/sections/SearchAutoCompleteAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "charSequence", "", "publishResults", "", "filterResults", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.sections.SearchAutoCompleteAdapter$getFilter$1 */
/* compiled from: SearchAutoCompleteAdapter.kt */
public final class SearchAutoCompleteAdapter$getFilter$1 extends Filter {
    final /* synthetic */ SearchAutoCompleteAdapter this$0;

    SearchAutoCompleteAdapter$getFilter$1(SearchAutoCompleteAdapter searchAutoCompleteAdapter) {
        this.this$0 = searchAutoCompleteAdapter;
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
            filterResults.values = this.this$0.getData();
            filterResults.count = this.this$0.getData().size();
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        if (filterResults == null || filterResults.count <= 0) {
            this.this$0.notifyDataSetInvalidated();
            return;
        }
        SearchAutoCompleteAdapter searchAutoCompleteAdapter = this.this$0;
        Object obj = filterResults.values;
        if (obj != null) {
            searchAutoCompleteAdapter.mResults = (List) obj;
            this.this$0.notifyDataSetChanged();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO>");
    }
}
