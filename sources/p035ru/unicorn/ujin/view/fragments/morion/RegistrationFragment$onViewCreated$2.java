package p035ru.unicorn.ujin.view.fragments.morion;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.activity.morion.MorionRegistrationActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "value", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.morion.RegistrationFragment$onViewCreated$2 */
/* compiled from: RegistrationFragment.kt */
final class RegistrationFragment$onViewCreated$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ RegistrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RegistrationFragment$onViewCreated$2(RegistrationFragment registrationFragment) {
        super(1);
        this.this$0 = registrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        MorionRegistrationActivity access$getBaseActivity$p = RegistrationFragment.access$getBaseActivity$p(this.this$0);
        access$getBaseActivity$p.setPhone('7' + str);
    }
}
