package p035ru.unicorn.ujin.view.fragments.profile;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.mysmartflat.kortros.R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.profile.ProfileEditFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileFragment$onViewCreated$1 */
/* compiled from: ProfileFragment.kt */
final class ProfileFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ ProfileFragment this$0;

    ProfileFragment$onViewCreated$1(ProfileFragment profileFragment) {
        this.this$0 = profileFragment;
    }

    public final void onClick(View view) {
        this.this$0.imageUrl = null;
        if (this.this$0.getProfileViewModel().isDemo()) {
            new AlertDialog.Builder(this.this$0.getBaseActivity()).setTitle((int) R.string.demo).setMessage(this.this$0.getBaseActivity().flavor.isStage1Enabled() ? R.string.label_first_stage_demo_denied : R.string.label_demo_denied).setPositiveButton((int) R.string.button_OK, (DialogInterface.OnClickListener) C60591.INSTANCE).show();
            return;
        }
        ProfileFragment profileFragment = this.this$0;
        ProfileEditFragment.Companion companion = ProfileEditFragment.Companion;
        String string = this.this$0.getString(R.string.my_profile);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.my_profile)");
        profileFragment.nextFragment(companion.newInstance(string), false, BaseActivity.FRAGMENT_PROFILE_EDIT);
    }
}
