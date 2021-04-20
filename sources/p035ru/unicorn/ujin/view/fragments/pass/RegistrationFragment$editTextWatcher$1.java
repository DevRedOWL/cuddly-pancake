package p035ru.unicorn.ujin.view.fragments.pass;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;
import p035ru.unicorn.ujin.view.activity.pass.PassRegistrationActivity;
import p035ru.unicorn.ujin.view.customViews.DynamicBackgroundButton;
import p035ru.unicorn.ujin.view.customViews.fields.PhoneMaskedEditText;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo51343d2 = {"ru/unicorn/ujin/view/fragments/pass/RegistrationFragment$editTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.pass.RegistrationFragment$editTextWatcher$1 */
/* compiled from: RegistrationFragment.kt */
public final class RegistrationFragment$editTextWatcher$1 implements TextWatcher {
    final /* synthetic */ RegistrationFragment this$0;

    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    RegistrationFragment$editTextWatcher$1(RegistrationFragment registrationFragment) {
        this.this$0 = registrationFragment;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
        DynamicBackgroundButton dynamicBackgroundButton = (DynamicBackgroundButton) this.this$0._$_findCachedViewById(C5619R.C5622id.btnContinue);
        Intrinsics.checkNotNullExpressionValue(dynamicBackgroundButton, "btnContinue");
        dynamicBackgroundButton.setEnabled(this.this$0.isRegisterDataValid());
        PassRegistrationActivity access$getBaseActivity$p = RegistrationFragment.access$getBaseActivity$p(this.this$0);
        EditText editText = (EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etName);
        Intrinsics.checkNotNullExpressionValue(editText, "etName");
        access$getBaseActivity$p.setName(editText.getText().toString());
        PassRegistrationActivity access$getBaseActivity$p2 = RegistrationFragment.access$getBaseActivity$p(this.this$0);
        PhoneMaskedEditText phoneMaskedEditText = (PhoneMaskedEditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPhone);
        Intrinsics.checkNotNullExpressionValue(phoneMaskedEditText, "etPhone");
        access$getBaseActivity$p2.setPhone(String.valueOf(phoneMaskedEditText.getText()));
    }
}
