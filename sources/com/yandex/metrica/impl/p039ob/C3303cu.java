package com.yandex.metrica.impl.p039ob;

import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.cu */
public final class C3303cu {

    /* renamed from: a */
    static final Pattern f2975a = Pattern.compile("[^0-9a-zA-Z,`’\\.\\+\\-'\\s\"]");

    /* renamed from: b */
    static final Pattern f2976b = Pattern.compile("\\s+");

    /* renamed from: b */
    public static String m2825b(String str, String str2) {
        return str == null ? str2 : str;
    }

    /* renamed from: a */
    public static boolean m2822a(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    public static boolean m2823a(String... strArr) {
        if (strArr == null) {
            return false;
        }
        for (String isEmpty : strArr) {
            if (TextUtils.isEmpty(isEmpty)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static String m2828c(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    /* renamed from: a */
    public static String m2820a(String str) {
        return m2825b(str, "");
    }

    /* renamed from: b */
    public static String m2824b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    /* renamed from: c */
    public static byte[] m2829c(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: b */
    public static final String m2827b(String... strArr) {
        return TextUtils.join(",", strArr);
    }

    /* renamed from: d */
    public static byte[] m2831d(String str) {
        return str == null ? new byte[0] : str.getBytes();
    }

    /* renamed from: a */
    public static String m2821a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append("0123456789abcdef".charAt((b & 240) >> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m2826b(byte[] bArr) {
        return m2821a(bArr).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
    }

    /* renamed from: e */
    public static byte[] m2832e(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length();
            byte[] bArr = new byte[(length / 2)];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        }
        throw new IllegalArgumentException("Input string must contain an even number of characters");
    }

    /* renamed from: d */
    public static int m2830d(String str, String str2) {
        if (str == null) {
            return str2 == null ? 0 : -1;
        }
        if (str2 == null) {
            return 1;
        }
        return str.compareTo(str2);
    }
}
