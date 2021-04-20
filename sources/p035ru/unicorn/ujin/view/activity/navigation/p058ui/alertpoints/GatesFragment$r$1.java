package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.ble.ble_helper_class.BluetoothCentral;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$r$1 */
/* compiled from: GatesFragment.kt */
final class GatesFragment$r$1 implements Runnable {
    final /* synthetic */ GatesFragment this$0;

    GatesFragment$r$1(GatesFragment gatesFragment) {
        this.this$0 = gatesFragment;
    }

    public final void run() {
        ProgressBar progressBar = this.this$0.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        progressBar.setVisibility(4);
        BluetoothCentral access$getCentral$p = this.this$0.central;
        if (access$getCentral$p != null) {
            access$getCentral$p.stopScan();
        }
        this.this$0.showTimeoutError();
    }
}
