package p035ru.unicorn.ujin.view.fragments.pass;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.pass.RegistrationFragment$onViewCreated$4 */
/* compiled from: RegistrationFragment.kt */
final class RegistrationFragment$onViewCreated$4 implements View.OnClickListener {
    final /* synthetic */ RegistrationFragment this$0;

    RegistrationFragment$onViewCreated$4(RegistrationFragment registrationFragment) {
        this.this$0 = registrationFragment;
    }

    public final void onClick(View view) {
        this.this$0.currentLoginMode = 1;
        TextInputLayout textInputLayout = (TextInputLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.tilEmail);
        Intrinsics.checkNotNullExpressionValue(textInputLayout, "tilEmail");
        textInputLayout.setVisibility(0);
        TextInputLayout textInputLayout2 = (TextInputLayout) this.this$0._$_findCachedViewById(C5619R.C5622id.tilPhone);
        Intrinsics.checkNotNullExpressionValue(textInputLayout2, "tilPhone");
        textInputLayout2.setVisibility(8);
        RegistrationFragment registrationFragment = this.this$0;
        TextView textView = (TextView) registrationFragment._$_findCachedViewById(C5619R.C5622id.tvLoginHint);
        Intrinsics.checkNotNullExpressionValue(textView, "tvLoginHint");
        registrationFragment.removeUnderline(textView);
        RegistrationFragment registrationFragment2 = this.this$0;
        TextView textView2 = (TextView) registrationFragment2._$_findCachedViewById(C5619R.C5622id.tvLoginHint);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvLoginHint");
        registrationFragment2.underline(textView2, "номер телефона");
    }
}
