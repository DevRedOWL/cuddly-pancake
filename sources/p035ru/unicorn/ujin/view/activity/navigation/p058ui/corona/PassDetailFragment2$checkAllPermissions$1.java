package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.content.Intent;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/corona/PassDetailFragment2$checkAllPermissions$1", "Lru/unicorn/ujin/view/activity/navigation/helper/DialogHelper$OnButtonDialogClick;", "onNegativeClick", "", "onPositiveClick", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$checkAllPermissions$1 */
/* compiled from: PassDetailFragment2.kt */
public final class PassDetailFragment2$checkAllPermissions$1 implements DialogHelper.OnButtonDialogClick {
    final /* synthetic */ PassDetailFragment2 this$0;

    public void onNegativeClick() {
    }

    PassDetailFragment2$checkAllPermissions$1(PassDetailFragment2 passDetailFragment2) {
        this.this$0 = passDetailFragment2;
    }

    public void onPositiveClick() {
        this.this$0.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }
}
