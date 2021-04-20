package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, mo51343d2 = {"ru/unicorn/ujin/view/activity/navigation/ui/corona/PassDetailFragment2$onRequestPermissionsResult$1", "Lru/unicorn/ujin/view/activity/navigation/helper/DialogHelper$OnButtonDialogClick;", "onNegativeClick", "", "onPositiveClick", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.PassDetailFragment2$onRequestPermissionsResult$1 */
/* compiled from: PassDetailFragment2.kt */
public final class PassDetailFragment2$onRequestPermissionsResult$1 implements DialogHelper.OnButtonDialogClick {
    final /* synthetic */ PassDetailFragment2 this$0;

    public void onNegativeClick() {
    }

    PassDetailFragment2$onRequestPermissionsResult$1(PassDetailFragment2 passDetailFragment2) {
        this.this$0 = passDetailFragment2;
    }

    public void onPositiveClick() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
        Uri fromParts = Uri.fromParts("package", access$getBaseActivity != null ? access$getBaseActivity.getPackageName() : null, (String) null);
        Intrinsics.checkNotNullExpressionValue(fromParts, "Uri.fromParts(\"package\",…ivity?.packageName, null)");
        intent.setData(fromParts);
        this.this$0.startActivity(intent);
    }
}
