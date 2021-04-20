package p035ru.unicorn.ujin.view.fragments;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.C5619R;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.SmsConfirmationFragment$onViewCreated$9 */
/* compiled from: SmsConfirmationFragment.kt */
final class SmsConfirmationFragment$onViewCreated$9 implements View.OnClickListener {
    final /* synthetic */ SmsConfirmationFragment this$0;

    SmsConfirmationFragment$onViewCreated$9(SmsConfirmationFragment smsConfirmationFragment) {
        this.this$0 = smsConfirmationFragment;
    }

    public final void onClick(View view) {
        ((EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPin)).requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(this.this$0.requireContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput((EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPin), 1);
        }
        EditText editText = (EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPin);
        Intrinsics.checkNotNullExpressionValue(editText, "etPin");
        ((EditText) this.this$0._$_findCachedViewById(C5619R.C5622id.etPin)).setSelection(editText.getText().toString().length());
    }
}
