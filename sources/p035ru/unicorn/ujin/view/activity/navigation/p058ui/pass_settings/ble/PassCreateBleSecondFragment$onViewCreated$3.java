package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleSecondFragment$onViewCreated$3 */
/* compiled from: PassCreateBleSecondFragment.kt */
final class PassCreateBleSecondFragment$onViewCreated$3 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ PassCreateBleSecondFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassCreateBleSecondFragment$onViewCreated$3(PassCreateBleSecondFragment passCreateBleSecondFragment) {
        super(1);
        this.this$0 = passCreateBleSecondFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        PassCreateBleSecondFragment passCreateBleSecondFragment = this.this$0;
        String string = passCreateBleSecondFragment.getString(R.string.error_on_finger);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.error_on_finger)");
        passCreateBleSecondFragment.showDialogMessage(string);
    }
}
