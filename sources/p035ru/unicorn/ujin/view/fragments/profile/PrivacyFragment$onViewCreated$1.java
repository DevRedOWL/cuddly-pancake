package p035ru.unicorn.ujin.view.fragments.profile;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.BaseActivity;
import p035ru.unicorn.ujin.view.fragments.profile.PasswordChangeFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profile.PrivacyFragment$onViewCreated$1 */
/* compiled from: PrivacyFragment.kt */
final class PrivacyFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ PrivacyFragment this$0;

    PrivacyFragment$onViewCreated$1(PrivacyFragment privacyFragment) {
        this.this$0 = privacyFragment;
    }

    public final void onClick(View view) {
        PrivacyFragment privacyFragment = this.this$0;
        PasswordChangeFragment.Companion companion = PasswordChangeFragment.Companion;
        TextView textView = (TextView) this.this$0._$_findCachedViewById(C5619R.C5622id.tvPasswordChange);
        Intrinsics.checkNotNullExpressionValue(textView, "tvPasswordChange");
        privacyFragment.nextFragment(companion.newInstance(textView.getText().toString()), false, BaseActivity.FRAGMENT_PASSWORD_EDIT);
    }
}
