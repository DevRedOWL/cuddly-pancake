package p035ru.unicorn.ujin.view.activity.navigation.p058ui.alertpoints;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.alertpoints.GatesFragment$drawSettingIcon$1 */
/* compiled from: GatesFragment.kt */
final class GatesFragment$drawSettingIcon$1 implements View.OnClickListener {
    final /* synthetic */ GatesFragment this$0;

    GatesFragment$drawSettingIcon$1(GatesFragment gatesFragment) {
        this.this$0 = gatesFragment;
    }

    public final void onClick(View view) {
        this.this$0.nextFragment(new BleSettingsFragment(), false);
    }
}
