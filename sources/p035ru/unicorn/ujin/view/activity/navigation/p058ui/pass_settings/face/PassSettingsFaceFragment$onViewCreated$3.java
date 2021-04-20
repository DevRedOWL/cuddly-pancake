package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_settings.face;

import android.view.View;
import kotlin.Metadata;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.navigation.helper.DialogHelper;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile.PassProfileVM;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_settings.face.PassSettingsFaceFragment$onViewCreated$3 */
/* compiled from: PassSettingsFaceFragment.kt */
final class PassSettingsFaceFragment$onViewCreated$3 implements View.OnClickListener {
    final /* synthetic */ PassProfileVM $viewModell;
    final /* synthetic */ PassSettingsFaceFragment this$0;

    PassSettingsFaceFragment$onViewCreated$3(PassSettingsFaceFragment passSettingsFaceFragment, PassProfileVM passProfileVM) {
        this.this$0 = passSettingsFaceFragment;
        this.$viewModell = passProfileVM;
    }

    public final void onClick(View view) {
        DialogHelper.showDialog(this.this$0.getActivity(), "Вы действительно хотите\nудалить доступ по лицу?", R.string.button_ok, R.string.cancel, new DialogHelper.OnButtonDialogClick(this) {
            final /* synthetic */ PassSettingsFaceFragment$onViewCreated$3 this$0;

            public void onNegativeClick() {
            }

            {
                this.this$0 = r1;
            }

            public void onPositiveClick() {
                this.this$0.$viewModell.deleteByInterfaceType("face");
            }
        });
    }
}
