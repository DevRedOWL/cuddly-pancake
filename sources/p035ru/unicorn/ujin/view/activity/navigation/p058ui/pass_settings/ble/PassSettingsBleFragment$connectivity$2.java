package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.mobile.p055id.example.core.connectivity.ConnectivityImpl;
import p035ru.unicorn.ujin.view.activity.BaseActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "Lorg/mobile/id/example/core/connectivity/ConnectivityImpl;", "invoke"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassSettingsBleFragment$connectivity$2 */
/* compiled from: PassSettingsBleFragment.kt */
final class PassSettingsBleFragment$connectivity$2 extends Lambda implements Function0<ConnectivityImpl> {
    final /* synthetic */ PassSettingsBleFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PassSettingsBleFragment$connectivity$2(PassSettingsBleFragment passSettingsBleFragment) {
        super(0);
        this.this$0 = passSettingsBleFragment;
    }

    public final ConnectivityImpl invoke() {
        BaseActivity access$getBaseActivity = this.this$0.getBaseActivity();
        Intrinsics.checkNotNullExpressionValue(access$getBaseActivity, "baseActivity");
        return new ConnectivityImpl(access$getBaseActivity);
    }
}
