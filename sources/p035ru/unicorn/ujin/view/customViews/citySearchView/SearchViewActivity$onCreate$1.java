package p035ru.unicorn.ujin.view.customViews.citySearchView;

import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, mo51343d2 = {"ru/unicorn/ujin/view/customViews/citySearchView/SearchViewActivity$onCreate$1", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "onQueryTextChange", "", "newText", "", "onQueryTextSubmit", "query", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewActivity$onCreate$1 */
/* compiled from: SearchViewActivity.kt */
public final class SearchViewActivity$onCreate$1 implements SearchView.OnQueryTextListener {
    final /* synthetic */ SearchViewActivity this$0;

    public boolean onQueryTextSubmit(String str) {
        Intrinsics.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        return false;
    }

    SearchViewActivity$onCreate$1(SearchViewActivity searchViewActivity) {
        this.this$0 = searchViewActivity;
    }

    public boolean onQueryTextChange(String str) {
        Filter filter;
        Intrinsics.checkNotNullParameter(str, "newText");
        SearchViewAdapter access$getSearchAdapter$p = this.this$0.searchAdapter;
        if (access$getSearchAdapter$p == null || (filter = access$getSearchAdapter$p.getFilter()) == null) {
            return false;
        }
        filter.filter(str);
        return false;
    }
}
