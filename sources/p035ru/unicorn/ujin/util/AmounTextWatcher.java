package p035ru.unicorn.ujin.util;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import org.apache.commons.lang3.StringUtils;

/* renamed from: ru.unicorn.ujin.util.AmounTextWatcher */
public class AmounTextWatcher implements TextWatcher {
    private static final String DECIMAL_SEPARATOR = ".";
    public static final String THOUSANDS_SEPARATOR = " ";
    private boolean deleteDigitBeforeSeparator;
    private int digsAfterDot = 2;
    private int digsBeforeDot = 10;
    private EditText etAmount;
    private boolean stateChanged;
    private int trimDecimals;

    public AmounTextWatcher(EditText editText) {
        this.etAmount = editText;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.trimDecimals = 0;
        this.deleteDigitBeforeSeparator = false;
        if (i3 != 0) {
            return;
        }
        if (charSequence.length() != 0 || i != 0) {
            String valueOf = String.valueOf(charSequence.charAt(i));
            if (valueOf.equals(DECIMAL_SEPARATOR)) {
                this.trimDecimals = StringUtils.substringAfter(charSequence.toString(), DECIMAL_SEPARATOR).length();
            }
            if (valueOf.equals(" ")) {
                this.deleteDigitBeforeSeparator = true;
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!StringUtils.isBlank(charSequence)) {
            this.etAmount.removeTextChangedListener(this);
            String normalizeString = normalizeString(charSequence.toString(), i, i3);
            boolean contains = normalizeString.contains(DECIMAL_SEPARATOR);
            String substringBefore = StringUtils.substringBefore(normalizeString, DECIMAL_SEPARATOR);
            String str = null;
            if (contains) {
                str = StringUtils.substringAfter(normalizeString, DECIMAL_SEPARATOR);
            } else {
                substringBefore = StringUtils.left(substringBefore, substringBefore.length() - this.trimDecimals);
            }
            if (contains && StringUtils.isBlank(substringBefore) && StringUtils.isBlank(str)) {
                substringBefore = "0";
            }
            StringBuilder sb = new StringBuilder();
            if (substringBefore.length() > this.digsBeforeDot) {
                sb.append(charSequence.subSequence(0, i));
                sb.append(charSequence.subSequence(i + i3, charSequence.length()));
            } else {
                sb.append(addSeparator(substringBefore, " ", 3));
                if (str != null) {
                    sb.append(DECIMAL_SEPARATOR);
                    sb.append(StringUtils.left(str, this.digsAfterDot));
                }
            }
            this.etAmount.setText(sb);
            this.etAmount.setSelection(calcSelection(i, i3, charSequence.length(), sb.length()));
            this.etAmount.addTextChangedListener(this);
        }
    }

    public void afterTextChanged(Editable editable) {
        this.stateChanged = true;
    }

    private String normalizeString(String str, int i, int i2) {
        if (StringUtils.countMatches((CharSequence) str, (CharSequence) DECIMAL_SEPARATOR) > 1) {
            str = StringUtils.left(str, i) + StringUtils.right(str, (str.length() - i) - i2);
        }
        if (this.deleteDigitBeforeSeparator) {
            str = StringUtils.left(str, i - 1) + StringUtils.right(str, (str.length() - i) - i2);
        }
        return str.replace(" ", "");
    }

    private String addSeparator(String str, String str2, int i) {
        if (StringUtils.isBlank(str)) {
            return str;
        }
        String reverse = StringUtils.reverse(str);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < reverse.length()) {
            sb.append(StringUtils.mid(reverse, i2, i));
            sb.append(str2);
            i2 += i;
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.reverse().toString();
    }

    private int calcSelection(int i, int i2, int i3, int i4) {
        int i5 = i + i2;
        int i6 = (i5 + i4) - i3;
        if (i6 >= 0) {
            i5 = i6;
        }
        return (i5 > i4 || this.trimDecimals > 0) ? i4 : i5;
    }
}
