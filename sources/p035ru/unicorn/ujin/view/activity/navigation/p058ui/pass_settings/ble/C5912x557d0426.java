package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/pass_settings/ble/PassCreateBleSecondFragment$showDialogMessage$1$1", "Lru/unicorn/ujin/view/activity/navigation/helper/DialogHelper$OnButtonDialogClick;", "onNegativeClick", "", "onPositiveClick", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleSecondFragment$showDialogMessage$$inlined$let$lambda$1 */
/* compiled from: PassCreateBleSecondFragment.kt */
public final class C5912x557d0426 implements DialogHelper.OnButtonDialogClick {
    final /* synthetic */ String $label$inlined;
    final /* synthetic */ PassCreateBleSecondFragment this$0;

    public void onNegativeClick() {
    }

    C5912x557d0426(PassCreateBleSecondFragment passCreateBleSecondFragment, String str) {
        this.this$0 = passCreateBleSecondFragment;
        this.$label$inlined = str;
    }

    public void onPositiveClick() {
        this.this$0.popFragment();
    }
}
