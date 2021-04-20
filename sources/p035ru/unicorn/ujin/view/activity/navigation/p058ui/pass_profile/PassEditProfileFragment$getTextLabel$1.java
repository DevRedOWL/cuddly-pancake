package p035ru.unicorn.ujin.view.activity.navigation.p058ui.pass_profile;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.pass_profile.PassEditProfileFragment$getTextLabel$1 */
/* compiled from: PassEditProfileFragment.kt */
final class PassEditProfileFragment$getTextLabel$1 implements View.OnClickListener {
    final /* synthetic */ PassEditProfileFragment this$0;

    PassEditProfileFragment$getTextLabel$1(PassEditProfileFragment passEditProfileFragment) {
        this.this$0 = passEditProfileFragment;
    }

    public final void onClick(View view) {
        PassEditProfileFragment passEditProfileFragment = this.this$0;
        if (view != null) {
            passEditProfileFragment.onTextClick((TextView) view);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }
}
