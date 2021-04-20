package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.card;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.databinding.FragmentPassCardFirstBinding;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "isSave", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V", "ru/unicorn/ujin/view/activity/navigation/ui/pass_settings/card/PassCreateCardFirstFragment$onViewCreated$1$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.card.PassCreateCardFirstFragment$onViewCreated$1$$special$$inlined$let$lambda$1 */
/* compiled from: PassCreateCardFirstFragment.kt */
final class C5913x22cb5b1f extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ PassCreateCardFirstFragment$onViewCreated$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5913x22cb5b1f(PassCreateCardFirstFragment$onViewCreated$1 passCreateCardFirstFragment$onViewCreated$1) {
        super(1);
        this.this$0 = passCreateCardFirstFragment$onViewCreated$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Boolean bool) {
        ProgressBar progressBar = ((FragmentPassCardFirstBinding) this.this$0.this$0.getViewDataBinding()).f6579pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "viewDataBinding.pb");
        progressBar.setVisibility(4);
        Intrinsics.checkNotNullExpressionValue(bool, "isSave");
        if (bool.booleanValue()) {
            PassCreateCardFirstFragment passCreateCardFirstFragment = this.this$0.this$0;
            String string = this.this$0.this$0.getString(R.string.card_success_save);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.card_success_save)");
            passCreateCardFirstFragment.showDialogMessage(string);
            return;
        }
        PassCreateCardFirstFragment passCreateCardFirstFragment2 = this.this$0.this$0;
        String string2 = this.this$0.this$0.getString(R.string.error_on_save_card);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.error_on_save_card)");
        passCreateCardFirstFragment2.showDialogMessage(string2);
    }
}
