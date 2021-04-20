package p035ru.unicorn.ujin.view.fragments.profile;

import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import kotlin.Metadata;
import p035ru.mysmartflat.kortros.R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.ProfileFragment$onViewCreated$2 */
/* compiled from: ProfileFragment.kt */
final class ProfileFragment$onViewCreated$2 implements View.OnClickListener {
    final /* synthetic */ ProfileFragment this$0;

    ProfileFragment$onViewCreated$2(ProfileFragment profileFragment) {
        this.this$0 = profileFragment;
    }

    public final void onClick(View view) {
        if (!this.this$0.getProfileViewModel().isDemo() || !this.this$0.getBaseActivity().flavor.isStage1Enabled()) {
            new AlertDialog.Builder(this.this$0.getBaseActivity()).setTitle((CharSequence) this.this$0.getString(R.string.profileLogoutDialogTitle)).setMessage((CharSequence) this.this$0.getString(R.string.profileAreYouSureToLogout)).setPositiveButton((int) R.string.button_yes, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                final /* synthetic */ ProfileFragment$onViewCreated$2 this$0;

                {
                    this.this$0 = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.this$0.this$0.getBaseActivity().logout();
                    dialogInterface.dismiss();
                }
            }).setNegativeButton((int) R.string.button_no, (DialogInterface.OnClickListener) C60623.INSTANCE).show();
        } else {
            new AlertDialog.Builder(this.this$0.getBaseActivity()).setTitle((int) R.string.demo).setMessage((int) R.string.label_first_stage_demo_denied).setPositiveButton((int) R.string.button_OK, (DialogInterface.OnClickListener) C60601.INSTANCE).show();
        }
    }
}
