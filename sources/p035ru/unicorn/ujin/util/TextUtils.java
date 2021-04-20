package p035ru.unicorn.ujin.util;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import org.apache.commons.lang3.ClassUtils;
import p035ru.mysmartflat.kortros.R;

/* renamed from: ru.unicorn.ujin.util.TextUtils */
public class TextUtils {
    private static final String DECIMAL_FORMAT = "###,###.##";

    public static String formatPhoneNumber(String str) {
        if (str.length() < 11 || !str.matches("\\d+")) {
            return str;
        }
        return "+7 " + str.substring(1, 4) + " " + str.substring(4, 7) + "-" + str.substring(7, 9) + "-" + str.substring(9);
    }

    public static Integer formatStringToInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String decOfNumber(int i, String[] strArr) {
        int i2 = i % 100;
        return strArr[(i2 <= 4 || i2 >= 20) ? new int[]{2, 0, 1, 1, 1, 2}[Math.min(i % 10, 5)] : 2];
    }

    public static SpannableString formatAmount(BigDecimal bigDecimal, Context context) {
        SpannableString spannableString = new SpannableString(formatDecimal(bigDecimal) + " " + context.getResources().getString(R.string.unit_rub));
        spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.textLightColor)), spannableString.length() + -1, spannableString.length(), 33);
        return spannableString;
    }

    public static SpannableString formatAmount(String str, Context context) {
        SpannableString spannableString = new SpannableString(str + " " + context.getResources().getString(R.string.unit_rub));
        spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.textLightColor)), spannableString.length() + -1, spannableString.length(), 33);
        return spannableString;
    }

    public static String formatDecimal(BigDecimal bigDecimal) {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        decimalFormatSymbols.setDecimalSeparator(ClassUtils.PACKAGE_SEPARATOR_CHAR);
        decimalFormatSymbols.setGroupingSeparator(' ');
        return new DecimalFormat(DECIMAL_FORMAT, decimalFormatSymbols).format(bigDecimal);
    }
}
