package p035ru.unicorn.ujin.util;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: ru.unicorn.ujin.util.ErrorResetWatcher */
public class ErrorResetWatcher implements TextWatcher {
    private TextInputLayout input;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public ErrorResetWatcher(TextInputLayout textInputLayout) {
        this.input = textInputLayout;
    }

    public void afterTextChanged(Editable editable) {
        if (editable.length() > 0) {
            this.input.setError((CharSequence) null);
            this.input.setErrorEnabled(false);
        }
    }
}
