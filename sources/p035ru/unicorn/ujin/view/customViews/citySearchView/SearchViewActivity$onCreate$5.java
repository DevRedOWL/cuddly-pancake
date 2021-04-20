package p035ru.unicorn.ujin.view.customViews.citySearchView;

import androidx.lifecycle.Observer;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "isLoading", "", "onChanged", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.customViews.citySearchView.SearchViewActivity$onCreate$5 */
/* compiled from: SearchViewActivity.kt */
final class SearchViewActivity$onCreate$5<T> implements Observer<Boolean> {
    final /* synthetic */ SearchViewActivity this$0;

    SearchViewActivity$onCreate$5(SearchViewActivity searchViewActivity) {
        this.this$0 = searchViewActivity;
    }

    public final void onChanged(Boolean bool) {
        this.this$0.toggleProgressVisibility(bool);
    }
}
