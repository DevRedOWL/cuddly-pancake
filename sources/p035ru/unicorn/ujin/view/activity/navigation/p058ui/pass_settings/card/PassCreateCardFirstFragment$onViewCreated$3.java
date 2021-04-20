package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.card;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.databinding.FragmentPassCardFirstBinding;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "it", "", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.card.PassCreateCardFirstFragment$onViewCreated$3 */
/* compiled from: PassCreateCardFirstFragment.kt */
final class PassCreateCardFirstFragment$onViewCreated$3 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ PassCreateCardFirstFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassCreateCardFirstFragment$onViewCreated$3(PassCreateCardFirstFragment passCreateCardFirstFragment) {
        super(1);
        this.this$0 = passCreateCardFirstFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        DynamicBackgroundButton dynamicBackgroundButton = ((FragmentPassCardFirstBinding) this.this$0.getViewDataBinding()).addCard;
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "viewDataBinding.addCard");
        dynamicBackgroundButton.setEnabled(i != -1);
        this.this$0.bleReaderSection.setCurrentSelected(i);
        this.this$0.getAdapter().notifyDataSetChanged();
    }
}
