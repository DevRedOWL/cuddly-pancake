package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.finger;

import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/pass_settings/finger/PassCreateFingerSecondFragment$showDialogMessage$1", "Lru/unicorn/ujin/view/activity/navigation/helper/DialogHelper$OnButtonDialogClick;", "onNegativeClick", "", "onPositiveClick", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.finger.PassCreateFingerSecondFragment$showDialogMessage$1 */
/* compiled from: PassCreateFingerSecondFragment.kt */
public final class PassCreateFingerSecondFragment$showDialogMessage$1 implements DialogHelper.OnButtonDialogClick {
    final /* synthetic */ PassCreateFingerSecondFragment this$0;

    public void onNegativeClick() {
    }

    PassCreateFingerSecondFragment$showDialogMessage$1(PassCreateFingerSecondFragment passCreateFingerSecondFragment) {
        this.this$0 = passCreateFingerSecondFragment;
    }

    public void onPositiveClick() {
        this.this$0.popTo(BaseActivity.FRAGMENT_FINGER_START);
    }
}
