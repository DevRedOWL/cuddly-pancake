package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.face;

import android.widget.ProgressBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.unicorn.ujin.view.fragments.anotherPass.fragments.AnotherPassDetailFragmentKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "isOk", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V", "ru/unicorn/ujin/view/activity/navigation/ui/pass_settings/face/PassCreateFaceThirdFragment$onViewCreated$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.face.PassCreateFaceThirdFragment$onViewCreated$$inlined$let$lambda$1 */
/* compiled from: PassCreateFaceThirdFragment.kt */
final class PassCreateFaceThirdFragment$onViewCreated$$inlined$let$lambda$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ PassCreateFaceThirdFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassCreateFaceThirdFragment$onViewCreated$$inlined$let$lambda$1(PassCreateFaceThirdFragment passCreateFaceThirdFragment) {
        super(1);
        this.this$0 = passCreateFaceThirdFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Boolean bool) {
        ProgressBar progressBar = this.this$0.f6913pb;
        Intrinsics.checkNotNullExpressionValue(progressBar, "pb");
        AnotherPassDetailFragmentKt.setVisibleOrGone(progressBar, false);
        Intrinsics.checkNotNullExpressionValue(bool, "isOk");
        this.this$0.showDialogMessage(bool.booleanValue(), bool.booleanValue() ? "Операция прошла успешно!\nДоступ по распознаванию\nлица добавлен." : "Операция прошла неудачно!\nСистема не распознала ваше лицо.");
    }
}
