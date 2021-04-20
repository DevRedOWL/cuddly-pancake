package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.face;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "isOk", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.face.PassSettingsFaceFragment$onViewCreated$4 */
/* compiled from: PassSettingsFaceFragment.kt */
final class PassSettingsFaceFragment$onViewCreated$4 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ PassSettingsFaceFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassSettingsFaceFragment$onViewCreated$4(PassSettingsFaceFragment passSettingsFaceFragment) {
        super(1);
        this.this$0 = passSettingsFaceFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Boolean) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(Boolean bool) {
        Intrinsics.checkNotNullExpressionValue(bool, "isOk");
        if (bool.booleanValue()) {
            this.this$0.showDialogMessage("Доступ по лицу\nуспешно удалён.");
        } else {
            this.this$0.showDialogMessage("Ошибка. Доступ по лицу\nне удалён.");
        }
    }
}
