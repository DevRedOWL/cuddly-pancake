package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.ble;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "btn", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.ble.PassCreateBleZeroFragment$onViewCreated$4 */
/* compiled from: PassCreateBleZeroFragment.kt */
final class PassCreateBleZeroFragment$onViewCreated$4 implements View.OnClickListener {
    final /* synthetic */ PassCreateBleZeroFragment this$0;

    PassCreateBleZeroFragment$onViewCreated$4(PassCreateBleZeroFragment passCreateBleZeroFragment) {
        this.this$0 = passCreateBleZeroFragment;
    }

    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        if (view == null) {
            throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.customViews.DynamicBackgroundButton");
        } else if (Intrinsics.areEqual((Object) ((DynamicBackgroundButton) view).getText(), (Object) this.this$0.getString(R.string.button_next))) {
            this.this$0.nextFragment(new PassCreateBleFirstFragment(), false);
        } else {
            this.this$0.checkAllPermissions();
        }
    }
}
