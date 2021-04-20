package p035ru.unicorn.ujin.view.adapters.marketplace;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.marketplace.SearchItem;
import p035ru.unicorn.ujin.view.adapters.marketplace.SearchResultsAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.adapters.marketplace.SearchResultsAdapter$ViewHolder$bind$1 */
/* compiled from: SearchResultsAdapter.kt */
final class SearchResultsAdapter$ViewHolder$bind$1 implements View.OnClickListener {
    final /* synthetic */ SearchItem $item;
    final /* synthetic */ SearchResultsAdapter.ViewHolder this$0;

    SearchResultsAdapter$ViewHolder$bind$1(SearchResultsAdapter.ViewHolder viewHolder, SearchItem searchItem) {
        this.this$0 = viewHolder;
        this.$item = searchItem;
    }

    public final void onClick(View view) {
        this.this$0.this$0.getOnResultClickListener$app_kortrosRelease().onResultClicked(this.$item);
    }
}
