package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints.custom.osnova;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.custom.osnova.ListOfGateFragment$onStreamStarted$1 */
/* compiled from: ListOfGateFragment.kt */
final class ListOfGateFragment$onStreamStarted$1 implements Runnable {
    final /* synthetic */ boolean $showLoading;
    final /* synthetic */ ListOfGateFragment this$0;

    ListOfGateFragment$onStreamStarted$1(ListOfGateFragment listOfGateFragment, boolean z) {
        this.this$0 = listOfGateFragment;
        this.$showLoading = z;
    }

    public final void run() {
        if (!this.this$0.getSendRequest()) {
            ProgressBar progressBar = this.this$0.f6913pb;
            Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
            progressBar.setVisibility(this.$showLoading ? 0 : 4);
        }
    }
}
