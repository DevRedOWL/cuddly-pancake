package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.card;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.card.PassSettingsCardFragment$onViewCreated$2 */
/* compiled from: PassSettingsCardFragment.kt */
final class PassSettingsCardFragment$onViewCreated$2 implements View.OnClickListener {
    final /* synthetic */ PassSettingsCardFragment this$0;

    PassSettingsCardFragment$onViewCreated$2(PassSettingsCardFragment passSettingsCardFragment) {
        this.this$0 = passSettingsCardFragment;
    }

    public final void onClick(View view) {
        this.this$0.nextFragment(new PassSettingsCardInfoFragment(), false);
    }
}
