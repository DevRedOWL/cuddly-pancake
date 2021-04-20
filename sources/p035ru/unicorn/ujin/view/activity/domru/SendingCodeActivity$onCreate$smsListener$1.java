package p035ru.unicorn.ujin.view.activity.domru;

import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.receiver.SmsReceiver;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/domru/SendingCodeActivity$onCreate$smsListener$1", "Lru/unicorn/ujin/receiver/SmsReceiver$SmsListener;", "onCodeReceived", "", "code", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.domru.SendingCodeActivity$onCreate$smsListener$1 */
/* compiled from: SendingCodeActivity.kt */
public final class SendingCodeActivity$onCreate$smsListener$1 implements SmsReceiver.SmsListener {
    SendingCodeActivity$onCreate$smsListener$1() {
    }

    public void onCodeReceived(String str) {
        Intrinsics.checkNotNullParameter(str, "code");
        throw new NotImplementedError("An operation is not implemented: " + "not implemented");
    }
}
