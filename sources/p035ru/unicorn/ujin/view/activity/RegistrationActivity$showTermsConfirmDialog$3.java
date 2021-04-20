package p035ru.unicorn.ujin.view.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "isConfirmed", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivity$showTermsConfirmDialog$3 */
/* compiled from: RegistrationActivity.kt */
final class RegistrationActivity$showTermsConfirmDialog$3 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ RegistrationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RegistrationActivity$showTermsConfirmDialog$3(RegistrationActivity registrationActivity) {
        super(1);
        this.this$0 = registrationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        this.this$0.onConfirmTermsListener(z);
    }
}
