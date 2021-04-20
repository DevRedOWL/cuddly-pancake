package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileChooserStage2Fragment$onViewCreated$7 */
/* compiled from: ProfileChooserStage2Fragment.kt */
final class ProfileChooserStage2Fragment$onViewCreated$7 implements View.OnClickListener {
    final /* synthetic */ ProfileChooserStage2Fragment this$0;

    ProfileChooserStage2Fragment$onViewCreated$7(ProfileChooserStage2Fragment profileChooserStage2Fragment) {
        this.this$0 = profileChooserStage2Fragment;
    }

    public final void onClick(View view) {
        this.this$0.nextFragment(new ProfileChooserStage3Fragment(), false, "profileChooserAddBc3");
    }
}
