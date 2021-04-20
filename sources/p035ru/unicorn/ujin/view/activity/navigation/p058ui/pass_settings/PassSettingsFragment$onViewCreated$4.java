package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings;

import android.view.View;
import kotlin.Metadata;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.ble.data.PASS_TYPE;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.face.PassSettingsFaceFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.PassSettingsFragment$onViewCreated$4 */
/* compiled from: PassSettingsFragment.kt */
final class PassSettingsFragment$onViewCreated$4 implements View.OnClickListener {
    final /* synthetic */ PassSettingsFragment this$0;

    PassSettingsFragment$onViewCreated$4(PassSettingsFragment passSettingsFragment) {
        this.this$0 = passSettingsFragment;
    }

    public final void onClick(View view) {
        this.this$0.nextFragment(PassSettingsFaceFragment.Companion.newInstance(R.drawable.ic_svg_id_face, R.string.label_id_face, PASS_TYPE.FACE.getType()), false, BaseActivity.FRAGMENT_FACE_START);
    }
}
