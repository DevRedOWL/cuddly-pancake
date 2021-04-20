package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.widget.ProgressBar;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "onChanged", "(Lkotlin/Unit;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserUkAttachment4Fragment$onViewCreated$2 */
/* compiled from: ProfileChooserUkAttachment4Fragment.kt */
final class ProfileChooserUkAttachment4Fragment$onViewCreated$2<T> implements Observer<Unit> {
    final /* synthetic */ ProfileChooserUkAttachment4Fragment this$0;

    ProfileChooserUkAttachment4Fragment$onViewCreated$2(ProfileChooserUkAttachment4Fragment profileChooserUkAttachment4Fragment) {
        this.this$0 = profileChooserUkAttachment4Fragment;
    }

    public final void onChanged(Unit unit) {
        ProgressBar progressBar = this.this$0.f6913pb;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        this.this$0.getBaseActivity().setRegistrationFinished();
        this.this$0.getBaseActivity().startStageThreeFromApartmentChooser(this.this$0.getBaseActivity().profileViewModel.getDefaultBottomNavigationTab());
    }
}
