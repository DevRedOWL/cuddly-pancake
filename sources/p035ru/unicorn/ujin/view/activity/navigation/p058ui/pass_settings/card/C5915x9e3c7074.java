package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.card;

import android.view.View;
import kotlin.Metadata;
import p035ru.unicorn.ujin.ble.data.BleKeyData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/activity/navigation/ui/pass_settings/card/PassSettingsCardFragment$getAvailableCards$1$1$1$2", "ru/unicorn/ujin/view/activity/navigation/ui/pass_settings/card/PassSettingsCardFragment$getAvailableCards$1$$special$$inlined$apply$lambda$2"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.card.PassSettingsCardFragment$getAvailableCards$1$$special$$inlined$forEach$lambda$2 */
/* compiled from: PassSettingsCardFragment.kt */
final class C5915x9e3c7074 implements View.OnClickListener {
    final /* synthetic */ BleKeyData $it$inlined;
    final /* synthetic */ boolean $sizeEqualOne$inlined;
    final /* synthetic */ PassSettingsCardFragment$getAvailableCards$1 this$0;

    C5915x9e3c7074(BleKeyData bleKeyData, PassSettingsCardFragment$getAvailableCards$1 passSettingsCardFragment$getAvailableCards$1, boolean z) {
        this.$it$inlined = bleKeyData;
        this.this$0 = passSettingsCardFragment$getAvailableCards$1;
        this.$sizeEqualOne$inlined = z;
    }

    public final void onClick(View view) {
        this.this$0.this$0.showDeleteDialog(String.valueOf(this.$it$inlined.getSerialNumber()));
    }
}
