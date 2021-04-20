package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import android.widget.CompoundButton;
import kotlin.Metadata;
import p035ru.unicorn.ujin.util.ServiceHelper;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.BleSettingsFragment$onViewCreated$2 */
/* compiled from: BleSettingsFragment.kt */
final class BleSettingsFragment$onViewCreated$2 implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ BleSettingsFragment this$0;

    BleSettingsFragment$onViewCreated$2(BleSettingsFragment bleSettingsFragment) {
        this.this$0 = bleSettingsFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            BleRationaleFragment bleRationaleFragment = new BleRationaleFragment();
            bleRationaleFragment.setCallback(this.this$0);
            bleRationaleFragment.show(this.this$0.getChildFragmentManager(), "");
            return;
        }
        this.this$0.saveChoose(false);
        this.this$0.startWorkerForWatching(false);
        ServiceHelper.stopLocationService(this.this$0.getBaseActivity());
    }
}
