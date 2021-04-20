package p035ru.unicorn.ujin.view.fragments.morion;

import android.widget.TextView;
import com.andrognito.pinlockview.PinLockListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u000b"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/morion/ConfirmationFragment$onViewCreated$1", "Lcom/andrognito/pinlockview/PinLockListener;", "onComplete", "", "pin", "", "onEmpty", "onPinChange", "pinLength", "", "intermediatePin", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.morion.ConfirmationFragment$onViewCreated$1 */
/* compiled from: ConfirmationFragment.kt */
public final class ConfirmationFragment$onViewCreated$1 implements PinLockListener {
    final /* synthetic */ ConfirmationFragment this$0;

    public void onEmpty() {
    }

    ConfirmationFragment$onViewCreated$1(ConfirmationFragment confirmationFragment) {
        this.this$0 = confirmationFragment;
    }

    public void onComplete(String str) {
        if (str != null && !this.this$0.isConfirmLoading) {
            this.this$0.getProfileViewModel().rentConfirmCode(ConfirmationFragment.access$getBaseActivity$p(this.this$0).getPhone(), str);
        }
    }

    public void onPinChange(int i, String str) {
        if (i < 4 && this.this$0.afterFailLogging) {
            TextView textView = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvAuth);
            Intrinsics.checkNotNullExpressionValue(textView, "tvAuth");
            textView.setText(this.this$0.getResources().getString(R.string.enterCodeSMS));
            this.this$0.afterFailLogging = false;
        }
    }
}
