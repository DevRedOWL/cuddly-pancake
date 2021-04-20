package p035ru.unicorn.ujin.market.search;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.market.search.SearchViewFragment$initSearchView$1 */
/* compiled from: SearchViewFragment.kt */
final class SearchViewFragment$initSearchView$1 implements View.OnFocusChangeListener {
    final /* synthetic */ SearchViewFragment this$0;

    SearchViewFragment$initSearchView$1(SearchViewFragment searchViewFragment) {
        this.this$0 = searchViewFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
            if (access$getBaseActivity != null) {
                access$getBaseActivity.hideBottomNavigation();
                return;
            }
            return;
        }
        BaseActivity access$getBaseActivity2 = this.this$0.getBaseActivity();
        if (access$getBaseActivity2 != null) {
            access$getBaseActivity2.showBottomNavigation();
        }
    }
}
