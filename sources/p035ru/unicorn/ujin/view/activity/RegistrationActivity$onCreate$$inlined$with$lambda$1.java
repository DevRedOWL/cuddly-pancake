package p035ru.unicorn.ujin.view.activity;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "ru/unicorn/ujin/view/activity/RegistrationActivity$onCreate$12$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.RegistrationActivity$onCreate$$inlined$with$lambda$1 */
/* compiled from: RegistrationActivity.kt */
final class RegistrationActivity$onCreate$$inlined$with$lambda$1 implements View.OnClickListener {
    final /* synthetic */ TextView $this_with;
    final /* synthetic */ RegistrationActivity this$0;

    RegistrationActivity$onCreate$$inlined$with$lambda$1(TextView textView, RegistrationActivity registrationActivity) {
        this.$this_with = textView;
        this.this$0 = registrationActivity;
    }

    public final void onClick(View view) {
        this.this$0.profileViewModel.getLoginMethod().set(0);
        RegistrationActivityKt.removeUnderline(this.$this_with);
        RegistrationActivityKt.underlineView(this.$this_with, "электронную почту");
        this.this$0.checkValidData();
    }
}
