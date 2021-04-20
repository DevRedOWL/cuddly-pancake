package p035ru.unicorn.ujin.view.fragments.domru;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.activity.domru.SendingCodeActivity;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.domru.CodeRecoveryFirstFragment$onViewCreated$1 */
/* compiled from: CodeRecoveryFirstFragment.kt */
final class CodeRecoveryFirstFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ CodeRecoveryFirstFragment this$0;

    CodeRecoveryFirstFragment$onViewCreated$1(CodeRecoveryFirstFragment codeRecoveryFirstFragment) {
        this.this$0 = codeRecoveryFirstFragment;
    }

    public final void onClick(View view) {
        CodeRecoveryFirstFragment.access$getBaseActivity$p(this.this$0).hideKeyboard();
        SendingCodeActivity access$getBaseActivity$p = CodeRecoveryFirstFragment.access$getBaseActivity$p(this.this$0);
        TextInputEditText textInputEditText = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etPhone");
        access$getBaseActivity$p.setPhone(String.valueOf(textInputEditText.getText()));
        ProfileViewModel profileViewModel = this.this$0.getProfileViewModel();
        TextInputEditText textInputEditText2 = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone);
        Intrinsics.checkNotNullExpressionValue(textInputEditText2, "etPhone");
        profileViewModel.providerGetNewCode(String.valueOf(textInputEditText2.getText()));
    }
}
