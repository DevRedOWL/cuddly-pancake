package org.apache.commons.lang3;

import com.github.mikephil.charting.utils.Utils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

public class StringUtils {

    /* renamed from: CR */
    public static final String f6285CR = "\r";
    public static final String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;

    /* renamed from: LF */
    public static final String f6286LF = "\n";
    private static final int PAD_LIMIT = 8192;
    public static final String SPACE = " ";
    private static final int STRING_BUILDER_SIZE = 256;

    public static String defaultString(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence charSequence) {
        return !isEmpty(charSequence);
    }

    public static boolean isAnyEmpty(CharSequence... charSequenceArr) {
        if (ArrayUtils.isEmpty((Object[]) charSequenceArr)) {
            return false;
        }
        for (CharSequence isEmpty : charSequenceArr) {
            if (isEmpty(isEmpty)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoneEmpty(CharSequence... charSequenceArr) {
        return !isAnyEmpty(charSequenceArr);
    }

    public static boolean isAllEmpty(CharSequence... charSequenceArr) {
        if (ArrayUtils.isEmpty((Object[]) charSequenceArr)) {
            return true;
        }
        for (CharSequence isNotEmpty : charSequenceArr) {
            if (isNotEmpty(isNotEmpty)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBlank(CharSequence charSequence) {
        int length;
        if (!(charSequence == null || (length = charSequence.length()) == 0)) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isNotBlank(CharSequence charSequence) {
        return !isBlank(charSequence);
    }

    public static boolean isAnyBlank(CharSequence... charSequenceArr) {
        if (ArrayUtils.isEmpty((Object[]) charSequenceArr)) {
            return false;
        }
        for (CharSequence isBlank : charSequenceArr) {
            if (isBlank(isBlank)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoneBlank(CharSequence... charSequenceArr) {
        return !isAnyBlank(charSequenceArr);
    }

    public static boolean isAllBlank(CharSequence... charSequenceArr) {
        if (ArrayUtils.isEmpty((Object[]) charSequenceArr)) {
            return true;
        }
        for (CharSequence isNotBlank : charSequenceArr) {
            if (isNotBlank(isNotBlank)) {
                return false;
            }
        }
        return true;
    }

    public static String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static String trimToNull(String str) {
        String trim = trim(str);
        if (isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    public static String trimToEmpty(String str) {
        return str == null ? "" : str.trim();
    }

    public static String truncate(String str, int i) {
        return truncate(str, 0, i);
    }

    public static String truncate(String str, int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("offset cannot be negative");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("maxWith cannot be negative");
        } else if (str == null) {
            return null;
        } else {
            if (i > str.length()) {
                return "";
            }
            if (str.length() <= i2) {
                return str.substring(i);
            }
            int i3 = i2 + i;
            if (i3 > str.length()) {
                i3 = str.length();
            }
            return str.substring(i, i3);
        }
    }

    public static String strip(String str) {
        return strip(str, (String) null);
    }

    public static String stripToNull(String str) {
        if (str == null) {
            return null;
        }
        String strip = strip(str, (String) null);
        if (strip.isEmpty()) {
            return null;
        }
        return strip;
    }

    public static String stripToEmpty(String str) {
        return str == null ? "" : strip(str, (String) null);
    }

    public static String strip(String str, String str2) {
        if (isEmpty(str)) {
            return str;
        }
        return stripEnd(stripStart(str, str2), str2);
    }

    public static String stripStart(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        int i = 0;
        if (str2 == null) {
            while (i != length && Character.isWhitespace(str.charAt(i))) {
                i++;
            }
        } else if (str2.isEmpty()) {
            return str;
        } else {
            while (i != length && str2.indexOf(str.charAt(i)) != -1) {
                i++;
            }
        }
        return str.substring(i);
    }

    public static String stripEnd(String str, String str2) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        if (str2 == null) {
            while (length != 0 && Character.isWhitespace(str.charAt(length - 1))) {
                length--;
            }
        } else if (str2.isEmpty()) {
            return str;
        } else {
            while (length != 0 && str2.indexOf(str.charAt(length - 1)) != -1) {
                length--;
            }
        }
        return str.substring(0, length);
    }

    public static String[] stripAll(String... strArr) {
        return stripAll(strArr, (String) null);
    }

    public static String[] stripAll(String[] strArr, String str) {
        int length;
        if (strArr == null || (length = strArr.length) == 0) {
            return strArr;
        }
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = strip(strArr[i], str);
        }
        return strArr2;
    }

    public static String stripAccents(String str) {
        if (str == null) {
            return null;
        }
        Pattern compile = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        StringBuilder sb = new StringBuilder(Normalizer.normalize(str, Normalizer.Form.NFD));
        convertRemainingAccentCharacters(sb);
        return compile.matcher(sb).replaceAll("");
    }

    private static void convertRemainingAccentCharacters(StringBuilder sb) {
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 321) {
                sb.deleteCharAt(i);
                sb.insert(i, 'L');
            } else if (sb.charAt(i) == 322) {
                sb.deleteCharAt(i);
                sb.insert(i, 'l');
            }
        }
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        return CharSequenceUtils.regionMatches(charSequence, false, 0, charSequence2, 0, charSequence.length());
    }

    public static boolean equalsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == charSequence2) {
                return true;
            }
            return false;
        } else if (charSequence == charSequence2) {
            return true;
        } else {
            if (charSequence.length() != charSequence2.length()) {
                return false;
            }
            return CharSequenceUtils.regionMatches(charSequence, true, 0, charSequence2, 0, charSequence.length());
        }
    }

    public static int compare(String str, String str2) {
        return compare(str, str2, true);
    }

    public static int compare(String str, String str2, boolean z) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return z ? -1 : 1;
        }
        if (str2 == null) {
            return z ? 1 : -1;
        }
        return str.compareTo(str2);
    }

    public static int compareIgnoreCase(String str, String str2) {
        return compareIgnoreCase(str, str2, true);
    }

    public static int compareIgnoreCase(String str, String str2, boolean z) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return z ? -1 : 1;
        }
        if (str2 == null) {
            return z ? 1 : -1;
        }
        return str.compareToIgnoreCase(str2);
    }

    public static boolean equalsAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (ArrayUtils.isNotEmpty((T[]) charSequenceArr)) {
            for (CharSequence equals : charSequenceArr) {
                if (equals(charSequence, equals)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean equalsAnyIgnoreCase(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (ArrayUtils.isNotEmpty((T[]) charSequenceArr)) {
            for (CharSequence equalsIgnoreCase : charSequenceArr) {
                if (equalsIgnoreCase(charSequence, equalsIgnoreCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int indexOf(CharSequence charSequence, int i) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, i, 0);
    }

    public static int indexOf(CharSequence charSequence, int i, int i2) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, i, i2);
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, charSequence2, 0);
    }

    public static int indexOf(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return CharSequenceUtils.indexOf(charSequence, charSequence2, i);
    }

    public static int ordinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i) {
        return ordinalIndexOf(charSequence, charSequence2, i, false);
    }

    private static int ordinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i, boolean z) {
        int i2 = -1;
        if (charSequence == null || charSequence2 == null || i <= 0) {
            return i2;
        }
        int i3 = 0;
        if (charSequence2.length() != 0) {
            if (z) {
                i2 = charSequence.length();
            }
            do {
                if (z) {
                    i2 = CharSequenceUtils.lastIndexOf(charSequence, charSequence2, i2 - 1);
                } else {
                    i2 = CharSequenceUtils.indexOf(charSequence, charSequence2, i2 + 1);
                }
                if (i2 < 0) {
                    return i2;
                }
                i3++;
            } while (i3 < i);
            return i2;
        } else if (z) {
            return charSequence.length();
        } else {
            return 0;
        }
    }

    public static int indexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return indexOfIgnoreCase(charSequence, charSequence2, 0);
    }

    public static int indexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (!(charSequence == null || charSequence2 == null)) {
            if (i < 0) {
                i = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i;
            }
            while (i < length) {
                if (CharSequenceUtils.regionMatches(charSequence, true, i, charSequence2, 0, charSequence2.length())) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(CharSequence charSequence, int i) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, i, charSequence.length());
    }

    public static int lastIndexOf(CharSequence charSequence, int i, int i2) {
        if (isEmpty(charSequence)) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, i, i2);
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, charSequence2, charSequence.length());
    }

    public static int lastOrdinalIndexOf(CharSequence charSequence, CharSequence charSequence2, int i) {
        return ordinalIndexOf(charSequence, charSequence2, i, true);
    }

    public static int lastIndexOf(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return CharSequenceUtils.lastIndexOf(charSequence, charSequence2, i);
    }

    public static int lastIndexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return lastIndexOfIgnoreCase(charSequence, charSequence2, charSequence.length());
    }

    public static int lastIndexOfIgnoreCase(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (!(charSequence == null || charSequence2 == null)) {
            if (i > charSequence.length() - charSequence2.length()) {
                i = charSequence.length() - charSequence2.length();
            }
            if (i < 0) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i;
            }
            while (i >= 0) {
                if (CharSequenceUtils.regionMatches(charSequence, true, i, charSequence2, 0, charSequence2.length())) {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public static boolean contains(CharSequence charSequence, int i) {
        if (!isEmpty(charSequence) && CharSequenceUtils.indexOf(charSequence, i, 0) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean contains(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null || CharSequenceUtils.indexOf(charSequence, charSequence2, 0) < 0) ? false : true;
    }

    public static boolean containsIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        if (!(charSequence == null || charSequence2 == null)) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            for (int i = 0; i <= length2; i++) {
                if (CharSequenceUtils.regionMatches(charSequence, true, i, charSequence2, 0, length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsWhitespace(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (Character.isWhitespace(charSequence.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static int indexOfAny(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(cArr)) {
            int length = charSequence.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == charAt && (i3 >= i || i4 >= i2 || !Character.isHighSurrogate(charAt) || cArr[i4 + 1] == charSequence.charAt(i3 + 1))) {
                        return i3;
                    }
                }
            }
        }
        return -1;
    }

    public static int indexOfAny(CharSequence charSequence, String str) {
        if (isEmpty(charSequence) || isEmpty(str)) {
            return -1;
        }
        return indexOfAny(charSequence, str.toCharArray());
    }

    public static boolean containsAny(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i = length - 1;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                            return true;
                        }
                        if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean containsAny(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return containsAny(charSequence, CharSequenceUtils.toCharArray(charSequence2));
    }

    public static boolean containsAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty((Object[]) charSequenceArr)) {
            for (CharSequence contains : charSequenceArr) {
                if (contains(charSequence, contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int indexOfAnyBut(CharSequence charSequence, char... cArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty(cArr)) {
            int length = charSequence.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            int i3 = 0;
            while (i3 < length) {
                char charAt = charSequence.charAt(i3);
                int i4 = 0;
                while (i4 < length2) {
                    if (cArr[i4] != charAt || (i3 < i && i4 < i2 && Character.isHighSurrogate(charAt) && cArr[i4 + 1] != charSequence.charAt(i3 + 1))) {
                        i4++;
                    } else {
                        i3++;
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    public static int indexOfAnyBut(CharSequence charSequence, CharSequence charSequence2) {
        if (!isEmpty(charSequence) && !isEmpty(charSequence2)) {
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                char charAt = charSequence.charAt(i);
                boolean z = CharSequenceUtils.indexOf(charSequence2, (int) charAt, 0) >= 0;
                int i2 = i + 1;
                if (i2 < length && Character.isHighSurrogate(charAt)) {
                    char charAt2 = charSequence.charAt(i2);
                    if (z && CharSequenceUtils.indexOf(charSequence2, (int) charAt2, 0) < 0) {
                        return i;
                    }
                } else if (!z) {
                    return i;
                }
                i = i2;
            }
        }
        return -1;
    }

    public static boolean containsOnly(CharSequence charSequence, char... cArr) {
        if (cArr == null || charSequence == null) {
            return false;
        }
        if (charSequence.length() == 0) {
            return true;
        }
        if (cArr.length != 0 && indexOfAnyBut(charSequence, cArr) == -1) {
            return true;
        }
        return false;
    }

    public static boolean containsOnly(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return false;
        }
        return containsOnly(charSequence, str.toCharArray());
    }

    public static boolean containsNone(CharSequence charSequence, char... cArr) {
        if (!(charSequence == null || cArr == null)) {
            int length = charSequence.length();
            int i = length - 1;
            int length2 = cArr.length;
            int i2 = length2 - 1;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                for (int i4 = 0; i4 < length2; i4++) {
                    if (cArr[i4] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i4 == i2) {
                            return false;
                        }
                        if (i3 < i && cArr[i4 + 1] == charSequence.charAt(i3 + 1)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean containsNone(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return true;
        }
        return containsNone(charSequence, str.toCharArray());
    }

    public static int indexOfAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        int indexOf;
        if (charSequence == null || charSequenceArr == null) {
            return -1;
        }
        int i = Integer.MAX_VALUE;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (!(charSequence2 == null || (indexOf = CharSequenceUtils.indexOf(charSequence, charSequence2, 0)) == -1 || indexOf >= i)) {
                i = indexOf;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i;
    }

    public static int lastIndexOfAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        int lastIndexOf;
        int i = -1;
        if (!(charSequence == null || charSequenceArr == null)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence2 != null && (lastIndexOf = CharSequenceUtils.lastIndexOf(charSequence, charSequence2, charSequence.length())) > i) {
                    i = lastIndexOf;
                }
            }
        }
        return i;
    }

    public static String substring(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            i += str.length();
        }
        if (i < 0) {
            i = 0;
        }
        if (i > str.length()) {
            return "";
        }
        return str.substring(i);
    }

    public static String substring(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0) {
            i2 += str.length();
        }
        if (i < 0) {
            i += str.length();
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        if (i > i2) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        return str.substring(i, i2);
    }

    public static String left(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i);
    }

    public static String right(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i < 0) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(str.length() - i);
    }

    public static String mid(String str, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (i2 < 0 || i > str.length()) {
            return "";
        }
        if (i < 0) {
            i = 0;
        }
        int i3 = i2 + i;
        if (str.length() <= i3) {
            return str.substring(i);
        }
        return str.substring(i, i3);
    }

    private static StringBuilder newStringBuilder(int i) {
        return new StringBuilder(i * 16);
    }

    public static String substringBefore(String str, String str2) {
        if (isEmpty(str) || str2 == null) {
            return str;
        }
        if (str2.isEmpty()) {
            return "";
        }
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public static String substringAfter(String str, String str2) {
        int indexOf;
        if (isEmpty(str)) {
            return str;
        }
        if (str2 == null || (indexOf = str.indexOf(str2)) == -1) {
            return "";
        }
        return str.substring(indexOf + str2.length());
    }

    public static String substringBeforeLast(String str, String str2) {
        int lastIndexOf;
        if (isEmpty(str) || isEmpty(str2) || (lastIndexOf = str.lastIndexOf(str2)) == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    public static String substringAfterLast(String str, String str2) {
        int lastIndexOf;
        if (isEmpty(str)) {
            return str;
        }
        if (isEmpty(str2) || (lastIndexOf = str.lastIndexOf(str2)) == -1 || lastIndexOf == str.length() - str2.length()) {
            return "";
        }
        return str.substring(lastIndexOf + str2.length());
    }

    public static String substringBetween(String str, String str2) {
        return substringBetween(str, str2, str2);
    }

    public static String substringBetween(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (str == null || str2 == null || str3 == null || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(indexOf + str2.length(), indexOf2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = r5 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] substringsBetween(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0058
            boolean r1 = isEmpty(r8)
            if (r1 != 0) goto L_0x0058
            boolean r1 = isEmpty(r9)
            if (r1 == 0) goto L_0x0010
            goto L_0x0058
        L_0x0010:
            int r1 = r7.length()
            if (r1 != 0) goto L_0x0019
            java.lang.String[] r7 = org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY
            return r7
        L_0x0019:
            int r2 = r9.length()
            int r3 = r8.length()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
        L_0x0027:
            int r6 = r1 - r2
            if (r5 >= r6) goto L_0x0044
            int r5 = r7.indexOf(r8, r5)
            if (r5 >= 0) goto L_0x0032
            goto L_0x0044
        L_0x0032:
            int r5 = r5 + r3
            int r6 = r7.indexOf(r9, r5)
            if (r6 >= 0) goto L_0x003a
            goto L_0x0044
        L_0x003a:
            java.lang.String r5 = r7.substring(r5, r6)
            r4.add(r5)
            int r5 = r6 + r2
            goto L_0x0027
        L_0x0044:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x004b
            return r0
        L_0x004b:
            int r7 = r4.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r7 = r4.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            return r7
        L_0x0058:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.StringUtils.substringsBetween(java.lang.String, java.lang.String, java.lang.String):java.lang.String[]");
    }

    public static String[] split(String str) {
        return split(str, (String) null, -1);
    }

    public static String[] split(String str, char c) {
        return splitWorker(str, c, false);
    }

    public static String[] split(String str, String str2) {
        return splitWorker(str, str2, -1, false);
    }

    public static String[] split(String str, String str2, int i) {
        return splitWorker(str, str2, i, false);
    }

    public static String[] splitByWholeSeparator(String str, String str2) {
        return splitByWholeSeparatorWorker(str, str2, -1, false);
    }

    public static String[] splitByWholeSeparator(String str, String str2, int i) {
        return splitByWholeSeparatorWorker(str, str2, i, false);
    }

    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String str2) {
        return splitByWholeSeparatorWorker(str, str2, -1, true);
    }

    public static String[] splitByWholeSeparatorPreserveAllTokens(String str, String str2, int i) {
        return splitByWholeSeparatorWorker(str, str2, i, true);
    }

    private static String[] splitByWholeSeparatorWorker(String str, String str2, int i, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        if (str2 == null || "".equals(str2)) {
            return splitWorker(str, (String) null, i, z);
        }
        int length2 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            i2 = str.indexOf(str2, i3);
            if (i2 > -1) {
                if (i2 > i3) {
                    i4++;
                    if (i4 == i) {
                        arrayList.add(str.substring(i3));
                    } else {
                        arrayList.add(str.substring(i3, i2));
                    }
                } else if (z) {
                    i4++;
                    if (i4 == i) {
                        arrayList.add(str.substring(i3));
                        i2 = length;
                    } else {
                        arrayList.add("");
                    }
                }
                i3 = i2 + length2;
            } else {
                arrayList.add(str.substring(i3));
            }
            i2 = length;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] splitPreserveAllTokens(String str) {
        return splitWorker(str, (String) null, -1, true);
    }

    public static String[] splitPreserveAllTokens(String str, char c) {
        return splitWorker(str, c, true);
    }

    private static String[] splitWorker(String str, char c, boolean z) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (i < length) {
            if (str.charAt(i) == c) {
                if (z2 || z) {
                    arrayList.add(str.substring(i2, i));
                    z2 = false;
                    z3 = true;
                }
                i2 = i + 1;
                i = i2;
            } else {
                i++;
                z2 = true;
                z3 = false;
            }
        }
        if (z2 || (z && z3)) {
            arrayList.add(str.substring(i2, i));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] splitPreserveAllTokens(String str, String str2) {
        return splitWorker(str, str2, -1, true);
    }

    public static String[] splitPreserveAllTokens(String str, String str2, int i) {
        return splitWorker(str, str2, i, true);
    }

    private static String[] splitWorker(String str, String str2, int i, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            int i4 = 0;
            boolean z5 = false;
            boolean z6 = false;
            int i5 = 0;
            int i6 = 1;
            while (i4 < length) {
                if (Character.isWhitespace(str.charAt(i4))) {
                    if (z5 || z) {
                        int i7 = i6 + 1;
                        if (i6 == i) {
                            i4 = length;
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        arrayList.add(str.substring(i5, i4));
                        i6 = i7;
                        z5 = false;
                    }
                    i5 = i4 + 1;
                    i4 = i5;
                } else {
                    i4++;
                    z5 = true;
                    z6 = false;
                }
            }
            i2 = i5;
            z2 = z6;
            z3 = z5;
            i3 = i4;
        } else if (str2.length() == 1) {
            char charAt = str2.charAt(0);
            i3 = 0;
            z3 = false;
            z2 = false;
            i2 = 0;
            int i8 = 1;
            while (i3 < length) {
                if (str.charAt(i3) == charAt) {
                    if (z3 || z) {
                        int i9 = i8 + 1;
                        if (i8 == i) {
                            i3 = length;
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        arrayList.add(str.substring(i2, i3));
                        i8 = i9;
                        z3 = false;
                    }
                    i2 = i3 + 1;
                    i3 = i2;
                } else {
                    i3++;
                    z3 = true;
                    z2 = false;
                }
            }
        } else {
            int i10 = 0;
            z3 = false;
            z2 = false;
            i2 = 0;
            int i11 = 1;
            while (i3 < length) {
                if (str2.indexOf(str.charAt(i3)) >= 0) {
                    if (z3 || z) {
                        int i12 = i11 + 1;
                        if (i11 == i) {
                            i3 = length;
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        arrayList.add(str.substring(i2, i3));
                        i11 = i12;
                        z3 = false;
                    }
                    i2 = i3 + 1;
                    i10 = i2;
                } else {
                    i10 = i3 + 1;
                    z3 = true;
                    z2 = false;
                }
            }
        }
        if (z3 || (z && z2)) {
            arrayList.add(str.substring(i2, i3));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] splitByCharacterType(String str) {
        return splitByCharacterType(str, false);
    }

    public static String[] splitByCharacterTypeCamelCase(String str) {
        return splitByCharacterType(str, true);
    }

    private static String[] splitByCharacterType(String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int type = Character.getType(charArray[0]);
        int i = 0;
        for (int i2 = 1; i2 < charArray.length; i2++) {
            int type2 = Character.getType(charArray[i2]);
            if (type2 != type) {
                if (z && type2 == 2 && type == 1) {
                    int i3 = i2 - 1;
                    if (i3 != i) {
                        arrayList.add(new String(charArray, i, i3 - i));
                        i = i3;
                    }
                } else {
                    arrayList.add(new String(charArray, i, i2 - i));
                    i = i2;
                }
                type = type2;
            }
        }
        arrayList.add(new String(charArray, i, charArray.length - i));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @SafeVarargs
    public static <T> String join(T... tArr) {
        return join((Object[]) tArr, (String) null);
    }

    public static String join(Object[] objArr, char c) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, c, 0, objArr.length);
    }

    public static String join(long[] jArr, char c) {
        if (jArr == null) {
            return null;
        }
        return join(jArr, c, 0, jArr.length);
    }

    public static String join(int[] iArr, char c) {
        if (iArr == null) {
            return null;
        }
        return join(iArr, c, 0, iArr.length);
    }

    public static String join(short[] sArr, char c) {
        if (sArr == null) {
            return null;
        }
        return join(sArr, c, 0, sArr.length);
    }

    public static String join(byte[] bArr, char c) {
        if (bArr == null) {
            return null;
        }
        return join(bArr, c, 0, bArr.length);
    }

    public static String join(char[] cArr, char c) {
        if (cArr == null) {
            return null;
        }
        return join(cArr, c, 0, cArr.length);
    }

    public static String join(float[] fArr, char c) {
        if (fArr == null) {
            return null;
        }
        return join(fArr, c, 0, fArr.length);
    }

    public static String join(double[] dArr, char c) {
        if (dArr == null) {
            return null;
        }
        return join(dArr, c, 0, dArr.length);
    }

    public static String join(Object[] objArr, char c, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder newStringBuilder = newStringBuilder(i3);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                newStringBuilder.append(c);
            }
            if (objArr[i4] != null) {
                newStringBuilder.append(objArr[i4]);
            }
        }
        return newStringBuilder.toString();
    }

    public static String join(long[] jArr, char c, int i, int i2) {
        if (jArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder newStringBuilder = newStringBuilder(i3);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                newStringBuilder.append(c);
            }
            newStringBuilder.append(jArr[i4]);
        }
        return newStringBuilder.toString();
    }

    public static String join(int[] iArr, char c, int i, int i2) {
        if (iArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder newStringBuilder = newStringBuilder(i3);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                newStringBuilder.append(c);
            }
            newStringBuilder.append(iArr[i4]);
        }
        return newStringBuilder.toString();
    }

    public static String join(byte[] bArr, char c, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder newStringBuilder = newStringBuilder(i3);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                newStringBuilder.append(c);
            }
            newStringBuilder.append(bArr[i4]);
        }
        return newStringBuilder.toString();
    }

    public static String join(short[] sArr, char c, int i, int i2) {
        if (sArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder newStringBuilder = newStringBuilder(i3);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                newStringBuilder.append(c);
            }
            newStringBuilder.append(sArr[i4]);
        }
        return newStringBuilder.toString();
    }

    public static String join(char[] cArr, char c, int i, int i2) {
        if (cArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder newStringBuilder = newStringBuilder(i3);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                newStringBuilder.append(c);
            }
            newStringBuilder.append(cArr[i4]);
        }
        return newStringBuilder.toString();
    }

    public static String join(double[] dArr, char c, int i, int i2) {
        if (dArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder newStringBuilder = newStringBuilder(i3);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                newStringBuilder.append(c);
            }
            newStringBuilder.append(dArr[i4]);
        }
        return newStringBuilder.toString();
    }

    public static String join(float[] fArr, char c, int i, int i2) {
        if (fArr == null) {
            return null;
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder newStringBuilder = newStringBuilder(i3);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                newStringBuilder.append(c);
            }
            newStringBuilder.append(fArr[i4]);
        }
        return newStringBuilder.toString();
    }

    public static String join(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return join(objArr, str, 0, objArr.length);
    }

    public static String join(Object[] objArr, String str, int i, int i2) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i3 = i2 - i;
        if (i3 <= 0) {
            return "";
        }
        StringBuilder newStringBuilder = newStringBuilder(i3);
        for (int i4 = i; i4 < i2; i4++) {
            if (i4 > i) {
                newStringBuilder.append(str);
            }
            if (objArr[i4] != null) {
                newStringBuilder.append(objArr[i4]);
            }
        }
        return newStringBuilder.toString();
    }

    public static String join(Iterator<?> it, char c) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(c);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String join(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String join(Iterable<?> iterable, char c) {
        if (iterable == null) {
            return null;
        }
        return join(iterable.iterator(), c);
    }

    public static String join(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return join(iterable.iterator(), str);
    }

    public static String join(List<?> list, char c, int i, int i2) {
        if (list == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        return join(list.subList(i, i2).iterator(), c);
    }

    public static String join(List<?> list, String str, int i, int i2) {
        if (list == null) {
            return null;
        }
        if (i2 - i <= 0) {
            return "";
        }
        return join(list.subList(i, i2).iterator(), str);
    }

    public static String joinWith(String str, Object... objArr) {
        if (objArr != null) {
            String defaultString = defaultString(str);
            StringBuilder sb = new StringBuilder();
            Iterator it = Arrays.asList(objArr).iterator();
            while (it.hasNext()) {
                sb.append(Objects.toString(it.next(), ""));
                if (it.hasNext()) {
                    sb.append(defaultString);
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Object varargs must not be null");
    }

    public static String deleteWhitespace(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(str.charAt(i2))) {
                cArr[i] = str.charAt(i2);
                i++;
            }
        }
        if (i == length) {
            return str;
        }
        return new String(cArr, 0, i);
    }

    public static String removeStart(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    public static String removeStartIgnoreCase(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !startsWithIgnoreCase(str, str2)) ? str : str.substring(str2.length());
    }

    public static String removeEnd(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String removeEndIgnoreCase(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2) || !endsWithIgnoreCase(str, str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static String remove(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2)) ? str : replace(str, str2, "", -1);
    }

    public static String removeIgnoreCase(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2)) ? str : replaceIgnoreCase(str, str2, "", -1);
    }

    public static String remove(String str, char c) {
        if (isEmpty(str) || str.indexOf(c) == -1) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i = 0;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if (charArray[i2] != c) {
                charArray[i] = charArray[i2];
                i++;
            }
        }
        return new String(charArray, 0, i);
    }

    @Deprecated
    public static String removeAll(String str, String str2) {
        return RegExUtils.removeAll(str, str2);
    }

    @Deprecated
    public static String removeFirst(String str, String str2) {
        return replaceFirst(str, str2, "");
    }

    public static String replaceOnce(String str, String str2, String str3) {
        return replace(str, str2, str3, 1);
    }

    public static String replaceOnceIgnoreCase(String str, String str2, String str3) {
        return replaceIgnoreCase(str, str2, str3, 1);
    }

    @Deprecated
    public static String replacePattern(String str, String str2, String str3) {
        return RegExUtils.replacePattern(str, str2, str3);
    }

    @Deprecated
    public static String removePattern(String str, String str2) {
        return RegExUtils.removePattern(str, str2);
    }

    @Deprecated
    public static String replaceAll(String str, String str2, String str3) {
        return RegExUtils.replaceAll(str, str2, str3);
    }

    @Deprecated
    public static String replaceFirst(String str, String str2, String str3) {
        return RegExUtils.replaceFirst(str, str2, str3);
    }

    public static String replace(String str, String str2, String str3) {
        return replace(str, str2, str3, -1);
    }

    public static String replaceIgnoreCase(String str, String str2, String str3) {
        return replaceIgnoreCase(str, str2, str3, -1);
    }

    public static String replace(String str, String str2, String str3, int i) {
        return replace(str, str2, str3, i, false);
    }

    private static String replace(String str, String str2, String str3, int i, boolean z) {
        String str4;
        if (isEmpty(str) || isEmpty(str2) || str3 == null || i == 0) {
            return str;
        }
        if (z) {
            str4 = str.toLowerCase();
            str2 = str2.toLowerCase();
        } else {
            str4 = str;
        }
        int i2 = 0;
        int indexOf = str4.indexOf(str2, 0);
        if (indexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        int i3 = 64;
        if (i < 0) {
            i3 = 16;
        } else if (i <= 64) {
            i3 = i;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length2 * i3));
        while (indexOf != -1) {
            sb.append(str, i2, indexOf);
            sb.append(str3);
            i2 = indexOf + length;
            i--;
            if (i == 0) {
                break;
            }
            indexOf = str4.indexOf(str2, i2);
        }
        sb.append(str, i2, str.length());
        return sb.toString();
    }

    public static String replaceIgnoreCase(String str, String str2, String str3, int i) {
        return replace(str, str2, str3, i, true);
    }

    public static String replaceEach(String str, String[] strArr, String[] strArr2) {
        return replaceEach(str, strArr, strArr2, false, 0);
    }

    public static String replaceEachRepeatedly(String str, String[] strArr, String[] strArr2) {
        return replaceEach(str, strArr, strArr2, true, strArr == null ? 0 : strArr.length);
    }

    private static String replaceEach(String str, String[] strArr, String[] strArr2, boolean z, int i) {
        int length;
        if (str == null || str.isEmpty() || strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return str;
        }
        if (i >= 0) {
            int length2 = strArr.length;
            int length3 = strArr2.length;
            if (length2 == length3) {
                boolean[] zArr = new boolean[length2];
                int i2 = -1;
                int i3 = -1;
                for (int i4 = 0; i4 < length2; i4++) {
                    if (!zArr[i4] && strArr[i4] != null && !strArr[i4].isEmpty() && strArr2[i4] != null) {
                        int indexOf = str.indexOf(strArr[i4]);
                        if (indexOf == -1) {
                            zArr[i4] = true;
                        } else if (i2 == -1 || indexOf < i2) {
                            i3 = i4;
                            i2 = indexOf;
                        }
                    }
                }
                if (i2 == -1) {
                    return str;
                }
                int i5 = 0;
                for (int i6 = 0; i6 < strArr.length; i6++) {
                    if (!(strArr[i6] == null || strArr2[i6] == null || (length = strArr2[i6].length() - strArr[i6].length()) <= 0)) {
                        i5 += length * 3;
                    }
                }
                StringBuilder sb = new StringBuilder(str.length() + Math.min(i5, str.length() / 5));
                int i7 = 0;
                while (i2 != -1) {
                    while (i7 < i2) {
                        sb.append(str.charAt(i7));
                        i7++;
                    }
                    sb.append(strArr2[i3]);
                    i7 = strArr[i3].length() + i2;
                    int i8 = -1;
                    int i9 = -1;
                    for (int i10 = 0; i10 < length2; i10++) {
                        if (!zArr[i10] && strArr[i10] != null && !strArr[i10].isEmpty() && strArr2[i10] != null) {
                            int indexOf2 = str.indexOf(strArr[i10], i7);
                            if (indexOf2 == -1) {
                                zArr[i10] = true;
                            } else if (i8 == -1 || indexOf2 < i8) {
                                i9 = i10;
                                i8 = indexOf2;
                            }
                        }
                    }
                    i2 = i8;
                    i3 = i9;
                }
                int length4 = str.length();
                while (i7 < length4) {
                    sb.append(str.charAt(i7));
                    i7++;
                }
                String sb2 = sb.toString();
                if (!z) {
                    return sb2;
                }
                return replaceEach(sb2, strArr, strArr2, z, i - 1);
            }
            throw new IllegalArgumentException("Search and Replace array lengths don't match: " + length2 + " vs " + length3);
        }
        throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
    }

    public static String replaceChars(String str, char c, char c2) {
        if (str == null) {
            return null;
        }
        return str.replace(c, c2);
    }

    public static String replaceChars(String str, String str2, String str3) {
        if (isEmpty(str) || isEmpty(str2)) {
            return str;
        }
        if (str3 == null) {
            str3 = "";
        }
        int length = str3.length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length2);
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            int indexOf = str2.indexOf(charAt);
            if (indexOf >= 0) {
                if (indexOf < length) {
                    sb.append(str3.charAt(indexOf));
                }
                z = true;
            } else {
                sb.append(charAt);
            }
        }
        return z ? sb.toString() : str;
    }

    public static String overlay(String str, String str2, int i, int i2) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        int length = str.length();
        if (i < 0) {
            i = 0;
        }
        if (i > length) {
            i = length;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > length) {
            i2 = length;
        }
        if (i > i2) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        return str.substring(0, i) + str2 + str.substring(i2);
    }

    public static String chomp(String str) {
        if (isEmpty(str)) {
            return str;
        }
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            return (charAt == 13 || charAt == 10) ? "" : str;
        }
        int length = str.length() - 1;
        char charAt2 = str.charAt(length);
        if (charAt2 == 10) {
            if (str.charAt(length - 1) == 13) {
                length--;
            }
        } else if (charAt2 != 13) {
            length++;
        }
        return str.substring(0, length);
    }

    @Deprecated
    public static String chomp(String str, String str2) {
        return removeEnd(str, str2);
    }

    public static String chop(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length < 2) {
            return "";
        }
        int i = length - 1;
        String substring = str.substring(0, i);
        if (str.charAt(i) == 10) {
            int i2 = i - 1;
            if (substring.charAt(i2) == 13) {
                return substring.substring(0, i2);
            }
        }
        return substring;
    }

    public static String repeat(String str, int i) {
        if (str == null) {
            return null;
        }
        if (i <= 0) {
            return "";
        }
        int length = str.length();
        if (i == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i <= 8192) {
            return repeat(str.charAt(0), i);
        }
        int i2 = length * i;
        if (length == 1) {
            return repeat(str.charAt(0), i);
        }
        if (length != 2) {
            StringBuilder sb = new StringBuilder(i2);
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(str);
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        char[] cArr = new char[i2];
        for (int i4 = (i * 2) - 2; i4 >= 0; i4 = (i4 - 1) - 1) {
            cArr[i4] = charAt;
            cArr[i4 + 1] = charAt2;
        }
        return new String(cArr);
    }

    public static String repeat(String str, String str2, int i) {
        if (str == null || str2 == null) {
            return repeat(str, i);
        }
        return removeEnd(repeat(str + str2, i), str2);
    }

    public static String repeat(char c, int i) {
        if (i <= 0) {
            return "";
        }
        char[] cArr = new char[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            cArr[i2] = c;
        }
        return new String(cArr);
    }

    public static String rightPad(String str, int i) {
        return rightPad(str, i, ' ');
    }

    public static String rightPad(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return rightPad(str, i, String.valueOf(c));
        }
        return str.concat(repeat(c, length));
    }

    public static String rightPad(String str, int i, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return rightPad(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str.concat(str2);
        }
        if (length2 < length) {
            return str.concat(str2.substring(0, length2));
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i2 = 0; i2 < length2; i2++) {
            cArr[i2] = charArray[i2 % length];
        }
        return str.concat(new String(cArr));
    }

    public static String leftPad(String str, int i) {
        return leftPad(str, i, ' ');
    }

    public static String leftPad(String str, int i, char c) {
        if (str == null) {
            return null;
        }
        int length = i - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return leftPad(str, i, String.valueOf(c));
        }
        return repeat(c, length).concat(str);
    }

    public static String leftPad(String str, int i, String str2) {
        if (str == null) {
            return null;
        }
        if (isEmpty(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return leftPad(str, i, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i2 = 0; i2 < length2; i2++) {
            cArr[i2] = charArray[i2 % length];
        }
        return new String(cArr).concat(str);
    }

    public static int length(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String center(String str, int i) {
        return center(str, i, ' ');
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r2.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String center(java.lang.String r2, int r3, char r4) {
        /*
            if (r2 == 0) goto L_0x0019
            if (r3 > 0) goto L_0x0005
            goto L_0x0019
        L_0x0005:
            int r0 = r2.length()
            int r1 = r3 - r0
            if (r1 > 0) goto L_0x000e
            return r2
        L_0x000e:
            int r1 = r1 / 2
            int r0 = r0 + r1
            java.lang.String r2 = leftPad((java.lang.String) r2, (int) r0, (char) r4)
            java.lang.String r2 = rightPad((java.lang.String) r2, (int) r3, (char) r4)
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.StringUtils.center(java.lang.String, int, char):java.lang.String");
    }

    public static String center(String str, int i, String str2) {
        if (str == null || i <= 0) {
            return str;
        }
        if (isEmpty(str2)) {
            str2 = " ";
        }
        int length = str.length();
        int i2 = i - length;
        if (i2 <= 0) {
            return str;
        }
        return rightPad(leftPad(str, length + (i2 / 2), str2), i, str2);
    }

    public static String upperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static String upperCase(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(locale);
    }

    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static String lowerCase(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(locale);
    }

    public static String capitalize(String str) {
        int length;
        int codePointAt;
        int titleCase;
        if (str == null || (length = str.length()) == 0 || (codePointAt = str.codePointAt(0)) == (titleCase = Character.toTitleCase(codePointAt))) {
            return str;
        }
        int[] iArr = new int[length];
        iArr[0] = titleCase;
        int charCount = Character.charCount(codePointAt);
        int i = 1;
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            iArr[i] = codePointAt2;
            charCount += Character.charCount(codePointAt2);
            i++;
        }
        return new String(iArr, 0, i);
    }

    public static String uncapitalize(String str) {
        int length;
        int codePointAt;
        int lowerCase;
        if (str == null || (length = str.length()) == 0 || (codePointAt = str.codePointAt(0)) == (lowerCase = Character.toLowerCase(codePointAt))) {
            return str;
        }
        int[] iArr = new int[length];
        iArr[0] = lowerCase;
        int charCount = Character.charCount(codePointAt);
        int i = 1;
        while (charCount < length) {
            int codePointAt2 = str.codePointAt(charCount);
            iArr[i] = codePointAt2;
            charCount += Character.charCount(codePointAt2);
            i++;
        }
        return new String(iArr, 0, i);
    }

    public static String swapCase(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (Character.isUpperCase(codePointAt)) {
                codePointAt = Character.toLowerCase(codePointAt);
            } else if (Character.isTitleCase(codePointAt)) {
                codePointAt = Character.toLowerCase(codePointAt);
            } else if (Character.isLowerCase(codePointAt)) {
                codePointAt = Character.toUpperCase(codePointAt);
            }
            iArr[i2] = codePointAt;
            i += Character.charCount(codePointAt);
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    public static int countMatches(CharSequence charSequence, CharSequence charSequence2) {
        int i = 0;
        if (isEmpty(charSequence) || isEmpty(charSequence2)) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int indexOf = CharSequenceUtils.indexOf(charSequence, charSequence2, i);
            if (indexOf == -1) {
                return i2;
            }
            i2++;
            i = indexOf + charSequence2.length();
        }
    }

    public static int countMatches(CharSequence charSequence, char c) {
        if (isEmpty(charSequence)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (c == charSequence.charAt(i2)) {
                i++;
            }
        }
        return i;
    }

    public static boolean isAlpha(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetter(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphaSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetter(charSequence.charAt(i)) && charSequence.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphanumeric(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphanumericSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i)) && charSequence.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean isAsciiPrintable(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!CharUtils.isAsciiPrintable(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumeric(CharSequence charSequence) {
        if (isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumericSpace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(charSequence.charAt(i)) && charSequence.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String getDigits(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static boolean isWhitespace(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllLowerCase(CharSequence charSequence) {
        if (charSequence == null || isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLowerCase(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllUpperCase(CharSequence charSequence) {
        if (charSequence == null || isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isUpperCase(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMixedCase(CharSequence charSequence) {
        if (isEmpty(charSequence) || charSequence.length() == 1) {
            return false;
        }
        int length = charSequence.length();
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            if (z && z2) {
                return true;
            }
            if (Character.isUpperCase(charSequence.charAt(i))) {
                z = true;
            } else if (Character.isLowerCase(charSequence.charAt(i))) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static String defaultString(String str) {
        return defaultString(str, "");
    }

    @SafeVarargs
    public static <T extends CharSequence> T firstNonBlank(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t : tArr) {
            if (isNotBlank(t)) {
                return t;
            }
        }
        return null;
    }

    @SafeVarargs
    public static <T extends CharSequence> T firstNonEmpty(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t : tArr) {
            if (isNotEmpty(t)) {
                return t;
            }
        }
        return null;
    }

    public static <T extends CharSequence> T defaultIfBlank(T t, T t2) {
        return isBlank(t) ? t2 : t;
    }

    public static <T extends CharSequence> T defaultIfEmpty(T t, T t2) {
        return isEmpty(t) ? t2 : t;
    }

    public static String rotate(String str, int i) {
        int i2;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (i == 0 || length == 0 || (i2 = i % length) == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length);
        int i3 = -i2;
        sb.append(substring(str, i3));
        sb.append(substring(str, 0, i3));
        return sb.toString();
    }

    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseDelimited(String str, char c) {
        if (str == null) {
            return null;
        }
        String[] split = split(str, c);
        ArrayUtils.reverse((Object[]) split);
        return join((Object[]) split, c);
    }

    public static String abbreviate(String str, int i) {
        return abbreviate(str, "...", 0, i);
    }

    public static String abbreviate(String str, int i, int i2) {
        return abbreviate(str, "...", i, i2);
    }

    public static String abbreviate(String str, String str2, int i) {
        return abbreviate(str, str2, 0, i);
    }

    public static String abbreviate(String str, String str2, int i, int i2) {
        if (isEmpty(str) || isEmpty(str2)) {
            return str;
        }
        int length = str2.length();
        int i3 = length + 1;
        int i4 = length + length + 1;
        if (i2 < i3) {
            throw new IllegalArgumentException(String.format("Minimum abbreviation width is %d", new Object[]{Integer.valueOf(i3)}));
        } else if (str.length() <= i2) {
            return str;
        } else {
            if (i > str.length()) {
                i = str.length();
            }
            int i5 = i2 - length;
            if (str.length() - i < i5) {
                i = str.length() - i5;
            }
            if (i <= i3) {
                return str.substring(0, i5) + str2;
            } else if (i2 < i4) {
                throw new IllegalArgumentException(String.format("Minimum abbreviation width with offset is %d", new Object[]{Integer.valueOf(i4)}));
            } else if ((i2 + i) - length < str.length()) {
                return str2 + abbreviate(str.substring(i), str2, i5);
            } else {
                return str2 + str.substring(str.length() - i5);
            }
        }
    }

    public static String abbreviateMiddle(String str, String str2, int i) {
        if (isEmpty(str) || isEmpty(str2) || i >= str.length() || i < str2.length() + 2) {
            return str;
        }
        int length = i - str2.length();
        int i2 = length / 2;
        int i3 = (length % 2) + i2;
        int length2 = str.length() - i2;
        return str.substring(0, i3) + str2 + str.substring(length2);
    }

    public static String difference(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int indexOfDifference = indexOfDifference(str, str2);
        if (indexOfDifference == -1) {
            return "";
        }
        return str2.substring(indexOfDifference);
    }

    public static int indexOfDifference(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return -1;
        }
        int i = 0;
        if (!(charSequence == null || charSequence2 == null)) {
            while (i < charSequence.length() && i < charSequence2.length() && charSequence.charAt(i) == charSequence2.charAt(i)) {
                i++;
            }
            if (i < charSequence2.length() || i < charSequence.length()) {
                return i;
            }
            return -1;
        }
        return i;
    }

    public static int indexOfDifference(CharSequence... charSequenceArr) {
        if (charSequenceArr != null && charSequenceArr.length > 1) {
            int length = charSequenceArr.length;
            boolean z = true;
            int i = 0;
            int i2 = Integer.MAX_VALUE;
            boolean z2 = false;
            for (CharSequence charSequence : charSequenceArr) {
                if (charSequence == null) {
                    i2 = 0;
                    z2 = true;
                } else {
                    int min = Math.min(charSequence.length(), i2);
                    i = Math.max(charSequence.length(), i);
                    i2 = min;
                    z = false;
                }
            }
            if (!z && (i != 0 || z2)) {
                if (i2 == 0) {
                    return 0;
                }
                int i3 = -1;
                for (int i4 = 0; i4 < i2; i4++) {
                    char charAt = charSequenceArr[0].charAt(i4);
                    int i5 = 1;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        } else if (charSequenceArr[i5].charAt(i4) != charAt) {
                            i3 = i4;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i3 != -1) {
                        break;
                    }
                }
                return (i3 != -1 || i2 == i) ? i3 : i2;
            }
        }
        return -1;
    }

    public static String getCommonPrefix(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        int indexOfDifference = indexOfDifference(strArr);
        if (indexOfDifference == -1) {
            if (strArr[0] == null) {
                return "";
            }
            return strArr[0];
        } else if (indexOfDifference == 0) {
            return "";
        } else {
            return strArr[0].substring(0, indexOfDifference);
        }
    }

    @Deprecated
    public static int getLevenshteinDistance(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        if (length > length2) {
            int i = length2;
            length2 = charSequence.length();
            length = i;
        } else {
            CharSequence charSequence3 = charSequence2;
            charSequence2 = charSequence;
            charSequence = charSequence3;
        }
        int[] iArr = new int[(length + 1)];
        for (int i2 = 0; i2 <= length; i2++) {
            iArr[i2] = i2;
        }
        for (int i3 = 1; i3 <= length2; i3++) {
            int i4 = iArr[0];
            char charAt = charSequence.charAt(i3 - 1);
            iArr[0] = i3;
            int i5 = i4;
            int i6 = 1;
            while (i6 <= length) {
                int i7 = iArr[i6];
                int i8 = i6 - 1;
                iArr[i6] = Math.min(Math.min(iArr[i8] + 1, iArr[i6] + 1), i5 + (charSequence2.charAt(i8) == charAt ? 0 : 1));
                i6++;
                i5 = i7;
            }
        }
        return iArr[length];
    }

    @Deprecated
    public static int getLevenshteinDistance(CharSequence charSequence, CharSequence charSequence2, int i) {
        CharSequence charSequence3;
        int i2;
        CharSequence charSequence4;
        int i3;
        int i4 = i;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        } else if (i4 >= 0) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            if (length == 0) {
                if (length2 <= i4) {
                    return length2;
                }
                return -1;
            } else if (length2 == 0) {
                if (length <= i4) {
                    return length;
                }
                return -1;
            } else if (Math.abs(length - length2) > i4) {
                return -1;
            } else {
                if (length > length2) {
                    charSequence3 = charSequence2;
                    i2 = charSequence.length();
                    length = length2;
                    charSequence4 = charSequence;
                } else {
                    charSequence3 = charSequence;
                    i2 = length2;
                    charSequence4 = charSequence2;
                }
                int i5 = length + 1;
                int[] iArr = new int[i5];
                int[] iArr2 = new int[i5];
                int min = Math.min(length, i4) + 1;
                char c = 0;
                for (int i6 = 0; i6 < min; i6++) {
                    iArr[i6] = i6;
                }
                int i7 = Integer.MAX_VALUE;
                Arrays.fill(iArr, min, iArr.length, Integer.MAX_VALUE);
                Arrays.fill(iArr2, Integer.MAX_VALUE);
                int[] iArr3 = iArr2;
                int i8 = 1;
                while (i8 <= i2) {
                    char charAt = charSequence4.charAt(i8 - 1);
                    iArr3[c] = i8;
                    int max = Math.max(1, i8 - i4);
                    if (i8 > i7 - i4) {
                        i3 = length;
                    } else {
                        i3 = Math.min(length, i8 + i4);
                    }
                    if (max > i3) {
                        return -1;
                    }
                    if (max > 1) {
                        iArr3[max - 1] = i7;
                    }
                    while (max <= i3) {
                        int i9 = max - 1;
                        if (charSequence3.charAt(i9) == charAt) {
                            iArr3[max] = iArr[i9];
                        } else {
                            iArr3[max] = Math.min(Math.min(iArr3[i9], iArr[max]), iArr[i9]) + 1;
                        }
                        max++;
                    }
                    i8++;
                    c = 0;
                    i7 = Integer.MAX_VALUE;
                    int[] iArr4 = iArr3;
                    iArr3 = iArr;
                    iArr = iArr4;
                }
                if (iArr[length] <= i4) {
                    return iArr[length];
                }
                return -1;
            }
        } else {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
    }

    @Deprecated
    public static double getJaroWinklerDistance(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int[] matches = matches(charSequence, charSequence2);
        double d = (double) matches[0];
        if (d == Utils.DOUBLE_EPSILON) {
            return Utils.DOUBLE_EPSILON;
        }
        double length = (((d / ((double) charSequence.length())) + (d / ((double) charSequence2.length()))) + ((d - ((double) matches[1])) / d)) / 3.0d;
        if (length >= 0.7d) {
            length += Math.min(0.1d, 1.0d / ((double) matches[3])) * ((double) matches[2]) * (1.0d - length);
        }
        return ((double) Math.round(length * 100.0d)) / 100.0d;
    }

    private static int[] matches(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence.length() > charSequence2.length()) {
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int max = Math.max((charSequence4.length() / 2) - 1, 0);
        int[] iArr = new int[charSequence3.length()];
        Arrays.fill(iArr, -1);
        boolean[] zArr = new boolean[charSequence4.length()];
        int i = 0;
        for (int i2 = 0; i2 < charSequence3.length(); i2++) {
            char charAt = charSequence3.charAt(i2);
            int max2 = Math.max(i2 - max, 0);
            int min = Math.min(i2 + max + 1, charSequence4.length());
            while (true) {
                if (max2 < min) {
                    if (!zArr[max2] && charAt == charSequence4.charAt(max2)) {
                        iArr[i2] = max2;
                        zArr[max2] = true;
                        i++;
                        break;
                    }
                    max2++;
                } else {
                    break;
                }
            }
        }
        char[] cArr = new char[i];
        char[] cArr2 = new char[i];
        int i3 = 0;
        for (int i4 = 0; i4 < charSequence3.length(); i4++) {
            if (iArr[i4] != -1) {
                cArr[i3] = charSequence3.charAt(i4);
                i3++;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < charSequence4.length(); i6++) {
            if (zArr[i6]) {
                cArr2[i5] = charSequence4.charAt(i6);
                i5++;
            }
        }
        int i7 = 0;
        for (int i8 = 0; i8 < cArr.length; i8++) {
            if (cArr[i8] != cArr2[i8]) {
                i7++;
            }
        }
        int i9 = 0;
        for (int i10 = 0; i10 < charSequence3.length(); i10++) {
            CharSequence charSequence5 = charSequence;
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                break;
            }
            i9++;
        }
        return new int[]{i, i7 / 2, i9, charSequence4.length()};
    }

    @Deprecated
    public static int getFuzzyDistance(CharSequence charSequence, CharSequence charSequence2, Locale locale) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        } else if (locale != null) {
            String lowerCase = charSequence.toString().toLowerCase(locale);
            String lowerCase2 = charSequence2.toString().toLowerCase(locale);
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = Integer.MIN_VALUE;
            while (i < lowerCase2.length()) {
                char charAt = lowerCase2.charAt(i);
                int i5 = i4;
                int i6 = i2;
                boolean z = false;
                while (i3 < lowerCase.length() && !z) {
                    if (charAt == lowerCase.charAt(i3)) {
                        i6++;
                        if (i5 + 1 == i3) {
                            i6 += 2;
                        }
                        z = true;
                        i5 = i3;
                    }
                    i3++;
                }
                i++;
                i2 = i6;
                i4 = i5;
            }
            return i2;
        } else {
            throw new IllegalArgumentException("Locale must not be null");
        }
    }

    public static boolean startsWith(CharSequence charSequence, CharSequence charSequence2) {
        return startsWith(charSequence, charSequence2, false);
    }

    public static boolean startsWithIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return startsWith(charSequence, charSequence2, true);
    }

    private static boolean startsWith(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == charSequence2) {
                return true;
            }
            return false;
        } else if (charSequence2.length() > charSequence.length()) {
            return false;
        } else {
            return CharSequenceUtils.regionMatches(charSequence, z, 0, charSequence2, 0, charSequence2.length());
        }
    }

    public static boolean startsWithAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty((Object[]) charSequenceArr)) {
            for (CharSequence startsWith : charSequenceArr) {
                if (startsWith(charSequence, startsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean endsWith(CharSequence charSequence, CharSequence charSequence2) {
        return endsWith(charSequence, charSequence2, false);
    }

    public static boolean endsWithIgnoreCase(CharSequence charSequence, CharSequence charSequence2) {
        return endsWith(charSequence, charSequence2, true);
    }

    private static boolean endsWith(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        if (charSequence == null || charSequence2 == null) {
            if (charSequence == charSequence2) {
                return true;
            }
            return false;
        } else if (charSequence2.length() > charSequence.length()) {
            return false;
        } else {
            return CharSequenceUtils.regionMatches(charSequence, z, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
        }
    }

    public static String normalizeSpace(String str) {
        if (isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 1;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Character.isWhitespace(charAt)) {
                if (i3 == 0 && !z) {
                    cArr[i2] = " ".charAt(0);
                    i2++;
                }
                i3++;
            } else {
                int i5 = i2 + 1;
                if (charAt == 160) {
                    charAt = ' ';
                }
                cArr[i2] = charAt;
                i2 = i5;
                z = false;
                i3 = 0;
            }
        }
        if (z) {
            return "";
        }
        if (i3 <= 0) {
            i = 0;
        }
        return new String(cArr, 0, i2 - i).trim();
    }

    public static boolean endsWithAny(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!isEmpty(charSequence) && !ArrayUtils.isEmpty((Object[]) charSequenceArr)) {
            for (CharSequence endsWith : charSequenceArr) {
                if (endsWith(charSequence, endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static String appendIfMissing(String str, CharSequence charSequence, boolean z, CharSequence... charSequenceArr) {
        if (str == null || isEmpty(charSequence) || endsWith(str, charSequence, z)) {
            return str;
        }
        if (charSequenceArr != null && charSequenceArr.length > 0) {
            for (CharSequence endsWith : charSequenceArr) {
                if (endsWith(str, endsWith, z)) {
                    return str;
                }
            }
        }
        return str + charSequence.toString();
    }

    public static String appendIfMissing(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return appendIfMissing(str, charSequence, false, charSequenceArr);
    }

    public static String appendIfMissingIgnoreCase(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return appendIfMissing(str, charSequence, true, charSequenceArr);
    }

    private static String prependIfMissing(String str, CharSequence charSequence, boolean z, CharSequence... charSequenceArr) {
        if (str == null || isEmpty(charSequence) || startsWith(str, charSequence, z)) {
            return str;
        }
        if (charSequenceArr != null && charSequenceArr.length > 0) {
            for (CharSequence startsWith : charSequenceArr) {
                if (startsWith(str, startsWith, z)) {
                    return str;
                }
            }
        }
        return charSequence.toString() + str;
    }

    public static String prependIfMissing(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return prependIfMissing(str, charSequence, false, charSequenceArr);
    }

    public static String prependIfMissingIgnoreCase(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return prependIfMissing(str, charSequence, true, charSequenceArr);
    }

    @Deprecated
    public static String toString(byte[] bArr, String str) throws UnsupportedEncodingException {
        String str2;
        if (str == null) {
            str2 = new String(bArr, Charset.defaultCharset());
        }
        return str2;
    }

    public static String toEncodedString(byte[] bArr, Charset charset) {
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        return new String(bArr, charset);
    }

    public static String wrap(String str, char c) {
        if (isEmpty(str) || c == 0) {
            return str;
        }
        return c + str + c;
    }

    public static String wrap(String str, String str2) {
        return (isEmpty(str) || isEmpty(str2)) ? str : str2.concat(str).concat(str2);
    }

    public static String wrapIfMissing(String str, char c) {
        if (isEmpty(str) || c == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        if (str.charAt(0) != c) {
            sb.append(c);
        }
        sb.append(str);
        if (str.charAt(str.length() - 1) != c) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static String wrapIfMissing(String str, String str2) {
        if (isEmpty(str) || isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + str2.length());
        if (!str.startsWith(str2)) {
            sb.append(str2);
        }
        sb.append(str);
        if (!str.endsWith(str2)) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public static String unwrap(String str, String str2) {
        if (isEmpty(str) || isEmpty(str2) || !startsWith(str, str2) || !endsWith(str, str2)) {
            return str;
        }
        int indexOf = str.indexOf(str2);
        int lastIndexOf = str.lastIndexOf(str2);
        return (indexOf == -1 || lastIndexOf == -1) ? str : str.substring(indexOf + str2.length(), lastIndexOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r3 = r2.length() - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String unwrap(java.lang.String r2, char r3) {
        /*
            boolean r0 = isEmpty(r2)
            if (r0 != 0) goto L_0x0028
            if (r3 != 0) goto L_0x0009
            goto L_0x0028
        L_0x0009:
            r0 = 0
            char r0 = r2.charAt(r0)
            if (r0 != r3) goto L_0x0028
            int r0 = r2.length()
            r1 = 1
            int r0 = r0 - r1
            char r0 = r2.charAt(r0)
            if (r0 != r3) goto L_0x0028
            int r3 = r2.length()
            int r3 = r3 - r1
            r0 = -1
            if (r3 == r0) goto L_0x0028
            java.lang.String r2 = r2.substring(r1, r3)
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.StringUtils.unwrap(java.lang.String, char):java.lang.String");
    }

    public static int[] toCodePoints(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return ArrayUtils.EMPTY_INT_ARRAY;
        }
        String charSequence2 = charSequence.toString();
        int[] iArr = new int[charSequence2.codePointCount(0, charSequence2.length())];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = charSequence2.codePointAt(i);
            i += Character.charCount(iArr[i2]);
        }
        return iArr;
    }
}
