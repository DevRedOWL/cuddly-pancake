package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.widget.ProgressBar;
import androidx.lifecycle.Observer;
import kotlin.Metadata;
import kotlin.Unit;
import p035ru.unicorn.ujin.ReactConst;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "onChanged", "(Lkotlin/Unit;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage4Fragment$onViewCreated$3 */
/* compiled from: ProfileChooserStage4Fragment.kt */
final class ProfileChooserStage4Fragment$onViewCreated$3<T> implements Observer<Unit> {
    final /* synthetic */ ProfileChooserStage4Fragment this$0;

    ProfileChooserStage4Fragment$onViewCreated$3(ProfileChooserStage4Fragment profileChooserStage4Fragment) {
        this.this$0 = profileChooserStage4Fragment;
    }

    public final void onChanged(Unit unit) {
        ProgressBar progressBar = this.this$0.f6913pb;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
        this.this$0.getBaseActivity().setRegistrationFinished();
        this.this$0.getBaseActivity().startStageThree(ReactConst.SECURITYTAB, false);
    }
}
