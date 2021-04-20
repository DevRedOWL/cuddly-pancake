package p035ru.unicorn.ujin.view.fragments;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, mo51343d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.SmsConfirmationFragment$onViewCreated$10 */
/* compiled from: SmsConfirmationFragment.kt */
final class SmsConfirmationFragment$onViewCreated$10 implements View.OnFocusChangeListener {
    final /* synthetic */ SmsConfirmationFragment this$0;

    SmsConfirmationFragment$onViewCreated$10(SmsConfirmationFragment smsConfirmationFragment) {
        this.this$0 = smsConfirmationFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(this.this$0.requireContext(), InputMethodManager.class);
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 1);
                return;
            }
            return;
        }
        this.this$0.getBaseActivity().hideSoftKeyboard(this.this$0.getBaseActivity());
    }
}
