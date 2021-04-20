package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.card;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;
import p035ru.unicorn.ujin.view.extensions.ExtensionKt;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/pass_settings/card/PassSettingsCardFragment$showDeleteDialog$1", "Lru/unicorn/ujin/view/activity/navigation/helper/DialogHelper$OnButtonDialogClick;", "onNegativeClick", "", "onPositiveClick", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.card.PassSettingsCardFragment$showDeleteDialog$1 */
/* compiled from: PassSettingsCardFragment.kt */
public final class PassSettingsCardFragment$showDeleteDialog$1 implements DialogHelper.OnButtonDialogClick {
    final /* synthetic */ String $sn;
    final /* synthetic */ PassSettingsCardFragment this$0;

    public void onNegativeClick() {
    }

    PassSettingsCardFragment$showDeleteDialog$1(PassSettingsCardFragment passSettingsCardFragment, String str) {
        this.this$0 = passSettingsCardFragment;
        this.$sn = str;
    }

    public void onPositiveClick() {
        ((PassProfileVM) this.this$0.getViewModell()).deleteByInterfaceType(this.$sn, PASS_TYPE.CARD.getType());
        PassSettingsCardFragment passSettingsCardFragment = this.this$0;
        ExtensionKt.observe((Fragment) passSettingsCardFragment, ((PassProfileVM) passSettingsCardFragment.getViewModell()).getSaveFaceResult(), new PassSettingsCardFragment$showDeleteDialog$1$onPositiveClick$1(this));
    }
}
