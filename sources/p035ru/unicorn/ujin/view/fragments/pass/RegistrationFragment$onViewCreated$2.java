package p035ru.unicorn.ujin.view.fragments.pass;

import android.view.View;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo51343d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.pass.RegistrationFragment$onViewCreated$2 */
/* compiled from: RegistrationFragment.kt */
final class RegistrationFragment$onViewCreated$2 implements View.OnClickListener {
    final /* synthetic */ RegistrationFragment this$0;

    RegistrationFragment$onViewCreated$2(RegistrationFragment registrationFragment) {
        this.this$0 = registrationFragment;
    }

    public final void onClick(View view) {
        this.this$0.togglePasswordVisibility();
    }
}
