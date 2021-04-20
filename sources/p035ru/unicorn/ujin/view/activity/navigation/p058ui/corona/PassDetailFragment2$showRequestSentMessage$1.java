package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import androidx.appcompat.app.AlertDialog;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$showRequestSentMessage$1 */
/* compiled from: PassDetailFragment2.kt */
final class PassDetailFragment2$showRequestSentMessage$1 implements Runnable {
    final /* synthetic */ PassDetailFragment2 this$0;

    PassDetailFragment2$showRequestSentMessage$1(PassDetailFragment2 passDetailFragment2) {
        this.this$0 = passDetailFragment2;
    }

    public final void run() {
        AlertDialog access$getRequestDialog$p;
        AlertDialog access$getRequestDialog$p2 = this.this$0.requestDialog;
        if (access$getRequestDialog$p2 != null && access$getRequestDialog$p2.isShowing() && (access$getRequestDialog$p = this.this$0.requestDialog) != null) {
            access$getRequestDialog$p.dismiss();
        }
    }
}
