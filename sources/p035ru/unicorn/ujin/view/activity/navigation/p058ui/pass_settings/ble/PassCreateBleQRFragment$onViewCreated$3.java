package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.Api;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleQRFragment$onViewCreated$3 */
/* compiled from: PassCreateBleQRFragment.kt */
final class PassCreateBleQRFragment$onViewCreated$3 implements View.OnClickListener {
    final /* synthetic */ PassCreateBleQRFragment this$0;

    PassCreateBleQRFragment$onViewCreated$3(PassCreateBleQRFragment passCreateBleQRFragment) {
        this.this$0 = passCreateBleQRFragment;
    }

    public final void onClick(View view) {
        Api api = Api.INSTANCE;
        BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(access$getBaseActivity, "baseActivity");
        Api.requestAccess$default(api, access$getBaseActivity, (String) null, 2, (Object) null);
    }
}
