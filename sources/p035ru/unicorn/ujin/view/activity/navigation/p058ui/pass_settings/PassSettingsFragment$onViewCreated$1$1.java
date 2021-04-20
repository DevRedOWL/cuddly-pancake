package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings;

import android.widget.CompoundButton;
import kotlin.Metadata;
import p035ru.unicorn.ujin.p057di.koin.KoinData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.PassSettingsFragment$onViewCreated$1$1 */
/* compiled from: PassSettingsFragment.kt */
final class PassSettingsFragment$onViewCreated$1$1 implements CompoundButton.OnCheckedChangeListener {
    public static final PassSettingsFragment$onViewCreated$1$1 INSTANCE = new PassSettingsFragment$onViewCreated$1$1();

    PassSettingsFragment$onViewCreated$1$1() {
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        KoinData.INSTANCE.startOnScreenOnService(z);
    }
}
