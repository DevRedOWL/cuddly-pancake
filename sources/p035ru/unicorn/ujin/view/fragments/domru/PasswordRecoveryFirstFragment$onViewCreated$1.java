package p035ru.unicorn.ujin.view.fragments.domru;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.activity.domru.PasswordRecoveryActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.domru.PasswordRecoveryFirstFragment$onViewCreated$1 */
/* compiled from: PasswordRecoveryFirstFragment.kt */
final class PasswordRecoveryFirstFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ PasswordRecoveryFirstFragment this$0;

    PasswordRecoveryFirstFragment$onViewCreated$1(PasswordRecoveryFirstFragment passwordRecoveryFirstFragment) {
        this.this$0 = passwordRecoveryFirstFragment;
    }

    public final void onClick(View view) {
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            ((PasswordRecoveryActivity) activity).goToNextStep();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ru.unicorn.ujin.view.activity.domru.PasswordRecoveryActivity");
    }
}
