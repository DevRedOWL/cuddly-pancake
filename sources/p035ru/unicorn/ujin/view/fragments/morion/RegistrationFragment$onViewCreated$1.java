package p035ru.unicorn.ujin.view.fragments.morion;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "maskFilled", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.morion.RegistrationFragment$onViewCreated$1 */
/* compiled from: RegistrationFragment.kt */
final class RegistrationFragment$onViewCreated$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ RegistrationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RegistrationFragment$onViewCreated$1(RegistrationFragment registrationFragment) {
        super(1);
        this.this$0 = registrationFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.btnGetCode);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnGetCode");
        dynamicBackgroundButton.setEnabled(z);
    }
}
