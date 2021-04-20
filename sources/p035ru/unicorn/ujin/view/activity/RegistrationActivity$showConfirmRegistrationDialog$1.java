package p035ru.unicorn.ujin.view.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, mo51343d2 = {"<anonymous>", "", "userName", "", "phone", "code", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivity$showConfirmRegistrationDialog$1 */
/* compiled from: RegistrationActivity.kt */
final class RegistrationActivity$showConfirmRegistrationDialog$1 extends Lambda implements Function3<String, String, String, Unit> {
    final /* synthetic */ RegistrationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RegistrationActivity$showConfirmRegistrationDialog$1(RegistrationActivity registrationActivity) {
        super(3);
        this.this$0 = registrationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((String) obj, (String) obj2, (String) obj3);
        return Unit.INSTANCE;
    }

    public final void invoke(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "userName");
        Intrinsics.checkNotNullParameter(str2, "phone");
        Intrinsics.checkNotNullParameter(str3, "code");
        this.this$0.onSendCodeListener(str, str2, str3);
    }
}
