package p035ru.unicorn.ujin.view.dialogs;

import android.os.CountDownTimer;
import android.widget.TextView;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo51343d2 = {"ru/unicorn/ujin/view/dialogs/ConfirmRegistrationDialogFragment$onViewCreated$3", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.dialogs.ConfirmRegistrationDialogFragment$onViewCreated$3 */
/* compiled from: ConfirmRegistrationDialogFragment.kt */
public final class ConfirmRegistrationDialogFragment$onViewCreated$3 extends CountDownTimer {
    final /* synthetic */ ConfirmRegistrationDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfirmRegistrationDialogFragment$onViewCreated$3(ConfirmRegistrationDialogFragment confirmRegistrationDialogFragment, long j, long j2) {
        super(j, j2);
        this.this$0 = confirmRegistrationDialogFragment;
    }

    public void onTick(long j) {
        long j2 = (long) 60;
        long j3 = (j / ((long) BeaconHelper.PUSH_LIVE_TIME_IN_MILLIS)) % j2;
        long j4 = (j / ((long) 1000)) % j2;
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvTime);
        Intrinsics.checkNotNullExpressionValue(textView, "tvTime");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArr = {Long.valueOf(j3), Long.valueOf(j4)};
        String format = String.format("%02d:%02d", Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        textView.setText(format);
    }

    public void onFinish() {
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvTime);
        Intrinsics.checkNotNullExpressionValue(textView, "tvTime");
        textView.setText("00:00");
    }
}
