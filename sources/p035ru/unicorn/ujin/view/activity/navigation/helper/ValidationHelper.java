package p035ru.unicorn.ujin.view.activity.navigation.helper;

import android.text.TextUtils;
import android.util.Patterns;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.helper.ValidationHelper */
public class ValidationHelper {
    public static final boolean isValidEmail(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    public static final boolean isValidPhone(CharSequence charSequence) {
        return !TextUtils.isEmpty(charSequence) && Patterns.PHONE.matcher(charSequence).matches();
    }
}
