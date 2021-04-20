package p035ru.unicorn.ujin.util;

import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.util.Validator */
public class Validator {
    public static boolean isNameValid(String str) {
        return true;
    }

    public static boolean isEmailValid(String str) {
        return str.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
    }

    public static boolean isPasswordSafe(String str) {
        return str.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{8,}$");
    }

    public static boolean isPhoneValid(String str) {
        return containsOnlyDigits(str) && str.length() == 11;
    }

    public static boolean isPasswordValid(String str) {
        return str.length() >= 6;
    }

    public static boolean isRegistrationCodeValid(String str) {
        return str.length() == 20;
    }

    public static boolean containsOnlyDigits(String str) {
        return str.matches("\\d+");
    }

    public static boolean isCorrectFormatDate(String str) {
        return str.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public static boolean validate(EditText editText, TextInputLayout textInputLayout) {
        return validate(editText, textInputLayout, editText.getContext().getString(R.string.error_not_empty));
    }

    public static boolean validate(EditText editText, TextInputLayout textInputLayout, String str) {
        if (editText.getVisibility() == 8 || editText.getVisibility() == 4 || textInputLayout.getVisibility() == 8 || textInputLayout.getVisibility() == 4) {
            return true;
        }
        if (TextUtils.getTrimmedLength(editText.getText().toString()) > 0) {
            textInputLayout.setError((CharSequence) null);
            textInputLayout.setErrorEnabled(false);
            return true;
        }
        textInputLayout.setError(str);
        textInputLayout.clearFocus();
        textInputLayout.requestFocus();
        return false;
    }
}
