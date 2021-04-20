package p035ru.unicorn.ujin.view.fragments.domru;

import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.domru.CodeRecoverySecondFragment$onViewCreated$1 */
/* compiled from: CodeRecoverySecondFragment.kt */
final class CodeRecoverySecondFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ CodeRecoverySecondFragment this$0;

    CodeRecoverySecondFragment$onViewCreated$1(CodeRecoverySecondFragment codeRecoverySecondFragment) {
        this.this$0 = codeRecoverySecondFragment;
    }

    public final void onClick(View view) {
        CodeRecoverySecondFragment.access$getBaseActivity$p(this.this$0).hideKeyboard();
        ProfileViewModel profileViewModel = this.this$0.getProfileViewModel();
        String phone = CodeRecoverySecondFragment.access$getBaseActivity$p(this.this$0).getPhone();
        TextInputEditText textInputEditText = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etCode);
        Intrinsics.checkNotNullExpressionValue(textInputEditText, "etCode");
        profileViewModel.providerValidateSms(phone, String.valueOf(textInputEditText.getText()));
    }
}
