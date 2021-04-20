package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.view.View;
import androidx.lifecycle.LiveData;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.base.ViewmodelFactorys;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserFragment$onViewCreated$3 */
/* compiled from: ProfileChooserFragment.kt */
final class ProfileChooserFragment$onViewCreated$3 implements View.OnClickListener {
    final /* synthetic */ ProfileSelectionVM $vm;
    final /* synthetic */ ProfileChooserFragment this$0;

    ProfileChooserFragment$onViewCreated$3(ProfileChooserFragment profileChooserFragment, ProfileSelectionVM profileSelectionVM) {
        this.this$0 = profileChooserFragment;
        this.$vm = profileSelectionVM;
    }

    public final void onClick(View view) {
        Integer num;
        LiveData<Integer> selectNumber;
        ProfileSelectionVM profileSelectionVM = this.$vm;
        if (profileSelectionVM == null || (selectNumber = profileSelectionVM.getSelectNumber()) == null || (num = selectNumber.getValue()) == null) {
            num = -1;
        }
        if (num != null && num.intValue() == 0) {
            this.this$0.getBaseActivity().startStageOne();
        } else if (num != null && num.intValue() == 1) {
            this.this$0.showChooseUjinDialog();
        } else if (num != null && num.intValue() == 2) {
            ViewmodelFactorys.getInstance().clear(ProfileSelectionVM.class);
            this.this$0.nextFragment(new ProfileChooserStage2Fragment(), false, "profileChooserAddBc2");
        } else if (num != null && num.intValue() == 3) {
            ViewmodelFactorys.getInstance().clear(ProfileSelectionVM.class);
            this.this$0.nextFragment(new ProfileChooserUkAttachmentRequestFragment(), false, "profileChooserAddUk");
        } else if (num == null || num.intValue() != 4) {
            this.this$0.showMessage("Выберите тип профиля");
        }
    }
}
