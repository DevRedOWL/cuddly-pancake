package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass.company;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo51343d2 = {"<anonymous>", "", "run", "ru/unicorn/ujin/view/activity/navigation/ui/pass/company/SearchCompanyFragment$showProgressBar$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass.company.SearchCompanyFragment$showProgressBar$$inlined$let$lambda$1 */
/* compiled from: SearchCompanyFragment.kt */
final class SearchCompanyFragment$showProgressBar$$inlined$let$lambda$1 implements Runnable {
    final /* synthetic */ SearchCompanyFragment this$0;

    SearchCompanyFragment$showProgressBar$$inlined$let$lambda$1(SearchCompanyFragment searchCompanyFragment) {
        this.this$0 = searchCompanyFragment;
    }

    public final void run() {
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.pbar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "pbar");
        progressBar.setVisibility(0);
    }
}
