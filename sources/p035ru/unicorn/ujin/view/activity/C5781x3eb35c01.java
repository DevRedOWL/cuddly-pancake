package p035ru.unicorn.ujin.view.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke", "ru/unicorn/ujin/view/activity/RegistrationActivity$showSuccessRegistrationDialog$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivity$showSuccessRegistrationDialog$$inlined$let$lambda$1 */
/* compiled from: RegistrationActivity.kt */
final class C5781x3eb35c01 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ String $token;
    final /* synthetic */ RegistrationActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5781x3eb35c01(String str, RegistrationActivity registrationActivity) {
        super(1);
        this.$token = str;
        this.this$0 = registrationActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        this.this$0.onRegistrationFinished(this.$token);
    }
}
