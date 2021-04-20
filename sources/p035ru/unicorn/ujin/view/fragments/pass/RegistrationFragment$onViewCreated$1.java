package p035ru.unicorn.ujin.view.fragments.pass;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.data.profile.ProfileViewModel;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.pass.RegistrationFragment$onViewCreated$1 */
/* compiled from: RegistrationFragment.kt */
final class RegistrationFragment$onViewCreated$1 implements View.OnClickListener {
    final /* synthetic */ RegistrationFragment this$0;

    RegistrationFragment$onViewCreated$1(RegistrationFragment registrationFragment) {
        this.this$0 = registrationFragment;
    }

    public final void onClick(View view) {
        String str;
        RegistrationFragment.access$getBaseActivity$p(this.this$0).hideKeyboard();
        int access$getCurrentMode$p = this.this$0.currentMode;
        if (access$getCurrentMode$p == 0) {
            ProfileViewModel profileViewModel = this.this$0.getProfileViewModel();
            String name = RegistrationFragment.access$getBaseActivity$p(this.this$0).getName();
            String phone = RegistrationFragment.access$getBaseActivity$p(this.this$0).getPhone();
            String format = new SimpleDateFormat("ZZZZZ", Locale.getDefault()).format(new Date());
            Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"ZZZZZ\"…Default()).format(Date())");
            profileViewModel.rentRegisterByPhoneCorona(name, phone, format);
        } else if (access$getCurrentMode$p == 1) {
            ProfileViewModel profileViewModel2 = this.this$0.getProfileViewModel();
            if (this.this$0.currentLoginMode != 0) {
                EditText editText = (EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etEmail);
                Intrinsics.checkNotNullExpressionValue(editText, "etEmail");
                str = editText.getText().toString();
            } else {
                str = ((PhoneMaskedEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone)).getValue();
            }
            TextInputEditText textInputEditText = (TextInputEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPassword);
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "etPassword");
            profileViewModel2.rentAuthorizeCorona(str, String.valueOf(textInputEditText.getText()));
        }
    }
}
