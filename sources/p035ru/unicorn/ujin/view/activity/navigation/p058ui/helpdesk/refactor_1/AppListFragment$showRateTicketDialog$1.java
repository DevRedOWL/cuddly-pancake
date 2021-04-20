package p035ru.unicorn.ujin.view.activity.navigation.p058ui.helpdesk.refactor_1;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.helpdesk.refactor_1.AppListFragment$showRateTicketDialog$1 */
/* compiled from: AppListFragment.kt */
final class AppListFragment$showRateTicketDialog$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AppListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppListFragment$showRateTicketDialog$1(AppListFragment appListFragment) {
        super(0);
        this.this$0 = appListFragment;
    }

    public final void invoke() {
        ProgressBar progressBar = this.this$0.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(0);
        AppListFragment.access$getViewModell$p(this.this$0).getTickets();
    }
}
