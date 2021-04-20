package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.GateStatus;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble.PassCreateBleQRFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "gateStatus", "Lru/unicorn/ujin/view/activity/navigation/ui/pass_profile/GateStatus;", "kotlin.jvm.PlatformType", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleQRFragment$onViewCreated$2 */
/* compiled from: PassCreateBleQRFragment.kt */
final class PassCreateBleQRFragment$onViewCreated$2 extends Lambda implements Function1<GateStatus, Unit> {
    final /* synthetic */ PassCreateBleQRFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassCreateBleQRFragment$onViewCreated$2(PassCreateBleQRFragment passCreateBleQRFragment) {
        super(1);
        this.this$0 = passCreateBleQRFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GateStatus) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(GateStatus gateStatus) {
        if (gateStatus != null) {
            int i = PassCreateBleQRFragment.WhenMappings.$EnumSwitchMapping$0[gateStatus.ordinal()];
            if (i == 1) {
                this.this$0.startMigration();
            } else if (i == 2 || i == 3) {
                this.this$0.finishMigration();
                PassCreateBleQRFragment passCreateBleQRFragment = this.this$0;
                String string = passCreateBleQRFragment.getString(R.string.label_show_gate_success);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.label_show_gate_success)");
                passCreateBleQRFragment.showDialogMessage(string);
                DialogHelper.showDialog(this.this$0.getBaseActivity(), this.this$0.getString(R.string.label_show_gate_success), R.string.button_ok, R.string.btn_empty, new DialogHelper.OnButtonDialogClick(this) {
                    final /* synthetic */ PassCreateBleQRFragment$onViewCreated$2 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public void onPositiveClick() {
                        this.this$0.this$0.popTo(BaseActivity.FRAGMENT_MY_PASS);
                    }

                    public void onNegativeClick() {
                        this.this$0.this$0.popTo(BaseActivity.FRAGMENT_MY_PASS);
                    }
                });
            } else if (i == 4) {
                PassCreateBleQRFragment passCreateBleQRFragment2 = this.this$0;
                String string2 = passCreateBleQRFragment2.getString(R.string.label_show_gate_error);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.label_show_gate_error)");
                passCreateBleQRFragment2.showDialogMessage(string2);
            }
        }
    }
}
