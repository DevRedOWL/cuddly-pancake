package p035ru.unicorn.ujin.view.fragments.acceptance;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.adapters.TimeSlotsAdapter;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/acceptance/AcceptanceDateFragment$onViewCreated$1", "Lru/unicorn/ujin/view/adapters/TimeSlotsAdapter$TimeSlotsAdapterListener;", "onStateChanged", "", "position", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.acceptance.AcceptanceDateFragment$onViewCreated$1 */
/* compiled from: AcceptanceDateFragment.kt */
public final class AcceptanceDateFragment$onViewCreated$1 implements TimeSlotsAdapter.TimeSlotsAdapterListener {
    final /* synthetic */ AcceptanceDateFragment this$0;

    AcceptanceDateFragment$onViewCreated$1(AcceptanceDateFragment acceptanceDateFragment) {
        this.this$0 = acceptanceDateFragment;
    }

    public void onStateChanged(int i) {
        ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C5619R.C5622id.progressBar);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        progressBar.setVisibility(0);
    }
}
