package p035ru.unicorn.ujin.view.customViews.citySearchView;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0014¨\u0006\t"}, mo51343d2 = {"ru/unicorn/ujin/view/customViews/citySearchView/SearchViewAdapter$getFilter$1", "Landroid/widget/Filter;", "performFiltering", "Landroid/widget/Filter$FilterResults;", "constraint", "", "publishResults", "", "results", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewAdapter$getFilter$1 */
/* compiled from: SearchViewAdapter.kt */
public final class SearchViewAdapter$getFilter$1 extends Filter {
    final /* synthetic */ SearchViewAdapter this$0;

    SearchViewAdapter$getFilter$1(SearchViewAdapter searchViewAdapter) {
        this.this$0 = searchViewAdapter;
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                String obj = charSequence.toString();
                if (obj != null) {
                    String lowerCase = obj.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    CharSequence charSequence2 = lowerCase;
                    int length = charSequence2.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = Intrinsics.compare((int) charSequence2.charAt(!z ? i : length), 32) <= 0;
                        if (!z) {
                            if (!z2) {
                                z = true;
                            } else {
                                i++;
                            }
                        } else if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    String obj2 = charSequence2.subSequence(i, length + 1).toString();
                    for (SelectableItem selectableItem : this.this$0.fullItemsList) {
                        String value = selectableItem.getValue();
                        if (value != null) {
                            String lowerCase2 = value.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                            if (StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) obj2, false, 2, (Object) null)) {
                                arrayList.add(selectableItem);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    Filter.FilterResults filterResults = new Filter.FilterResults();
                    filterResults.values = arrayList;
                    return filterResults;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        arrayList.addAll(this.this$0.fullItemsList);
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        filterResults2.values = arrayList;
        return filterResults2;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Intrinsics.checkNotNullParameter(charSequence, "constraint");
        Intrinsics.checkNotNullParameter(filterResults, "results");
        this.this$0.getItemsList().clear();
        List<SelectableItem> itemsList = this.this$0.getItemsList();
        Object obj = filterResults.values;
        if (obj != null) {
            itemsList.addAll((List) obj);
            this.this$0.notifyDataSetChanged();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<ru.unicorn.ujin.view.customViews.citySearchView.SelectableItem>");
    }
}
