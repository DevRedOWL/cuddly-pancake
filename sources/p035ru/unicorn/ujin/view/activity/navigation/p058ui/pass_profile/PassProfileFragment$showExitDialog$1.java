package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import android.content.DialogInterface;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassProfileFragment$showExitDialog$1 */
/* compiled from: PassProfileFragment.kt */
final class PassProfileFragment$showExitDialog$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ PassProfileFragment this$0;

    PassProfileFragment$showExitDialog$1(PassProfileFragment passProfileFragment) {
        this.this$0 = passProfileFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.this$0.getBaseActivity().logout();
        dialogInterface.dismiss();
    }
}
