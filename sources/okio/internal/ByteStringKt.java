package okio.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Base64;
import okio.ByteString;
import okio.Platform;
import okio.Util;
import org.apache.commons.lang3.StringUtils;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0017\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\tH\u0000\u001a\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0001H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0001H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0000\u001a\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u0011H\u0000\u001a\f\u0010\u0016\u001a\u00020\u0001*\u00020\u0011H\u0000\u001a\f\u0010\u0017\u001a\u00020\u0001*\u00020\u0011H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\tH\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0001H\u0000\u001a\u0016\u0010\u001b\u001a\u00020\u0019*\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u001cH\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0007H\u0000\u001a\f\u0010 \u001a\u00020\u0007*\u00020\u0001H\u0000\u001a\f\u0010!\u001a\u00020\u0007*\u00020\u0001H\u0000\u001a\f\u0010\"\u001a\u00020\u0011*\u00020\u0001H\u0000\u001a\u001c\u0010#\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0007H\u0000\u001a\f\u0010%\u001a\u00020\t*\u00020\u0001H\u0000\u001a\u001c\u0010&\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010$\u001a\u00020\u0007H\u0000\u001a,\u0010'\u001a\u00020\u0019*\u00020\u00012\u0006\u0010(\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0000\u001a,\u0010'\u001a\u00020\u0019*\u00020\u00012\u0006\u0010(\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0000\u001a\u0014\u0010+\u001a\u00020\u0019*\u00020\u00012\u0006\u0010,\u001a\u00020\tH\u0000\u001a\u0014\u0010+\u001a\u00020\u0019*\u00020\u00012\u0006\u0010,\u001a\u00020\u0001H\u0000\u001a\u001c\u0010-\u001a\u00020\u0001*\u00020\u00012\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007H\u0000\u001a\f\u00100\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u00101\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u00102\u001a\u00020\t*\u00020\u0001H\u0000\u001a\f\u00103\u001a\u00020\u0011*\u00020\u0001H\u0000\u001a\f\u00104\u001a\u00020\u0011*\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, mo51343d2 = {"COMMON_EMPTY", "Lokio/ByteString;", "getCOMMON_EMPTY", "()Lokio/ByteString;", "HEX_DIGITS", "", "codePointIndexToCharIndex", "", "s", "", "codePointCount", "commonOf", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "offset", "otherOffset", "byteCount", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", "endIndex", "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToString", "commonUtf8", "jvm"}, mo51344k = 2, mo51345mv = {1, 1, 11})
/* compiled from: ByteString.kt */
public final class ByteStringKt {
    private static final ByteString COMMON_EMPTY = ByteString.Companion.mo55386of(new byte[0]);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final String commonUtf8(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        String utf8$jvm = byteString.getUtf8$jvm();
        if (utf8$jvm != null) {
            return utf8$jvm;
        }
        String utf8String = Platform.toUtf8String(byteString.internalArray$jvm());
        byteString.setUtf8$jvm(utf8String);
        return utf8String;
    }

    public static final String commonBase64(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        return Base64.encodeBase64$default(byteString.getData$jvm(), (byte[]) null, 1, (Object) null);
    }

    public static final String commonBase64Url(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        return Base64.encodeBase64(byteString.getData$jvm(), Base64.getBASE64_URL_SAFE());
    }

    public static final String commonHex(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        char[] cArr = new char[(byteString.getData$jvm().length * 2)];
        int i = 0;
        for (byte b : byteString.getData$jvm()) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static final ByteString commonToAsciiLowercase(ByteString byteString) {
        byte b;
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        int i = 0;
        while (i < byteString.getData$jvm().length) {
            byte b2 = byteString.getData$jvm()[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] data$jvm = byteString.getData$jvm();
                byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final ByteString commonToAsciiUppercase(ByteString byteString) {
        byte b;
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        int i = 0;
        while (i < byteString.getData$jvm().length) {
            byte b2 = byteString.getData$jvm()[i];
            byte b3 = (byte) 97;
            if (b2 < b3 || b2 > (b = (byte) 122)) {
                i++;
            } else {
                byte[] data$jvm = byteString.getData$jvm();
                byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return byteString;
    }

    public static final ByteString commonSubstring(ByteString byteString, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        boolean z = true;
        if (i >= 0) {
            if (i2 <= byteString.getData$jvm().length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    z = false;
                }
                if (!z) {
                    throw new IllegalArgumentException("endIndex < beginIndex".toString());
                } else if (i == 0 && i2 == byteString.getData$jvm().length) {
                    return byteString;
                } else {
                    byte[] bArr = new byte[i3];
                    Platform.arraycopy(byteString.getData$jvm(), i, bArr, 0, i3);
                    return new ByteString(bArr);
                }
            } else {
                throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$jvm().length + ')').toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0".toString());
        }
    }

    public static final byte commonGetByte(ByteString byteString, int i) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        return byteString.getData$jvm()[i];
    }

    public static final int commonGetSize(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        return byteString.getData$jvm().length;
    }

    public static final byte[] commonToByteArray(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        byte[] data$jvm = byteString.getData$jvm();
        byte[] copyOf = Arrays.copyOf(data$jvm, data$jvm.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public static final byte[] commonInternalArray(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        return byteString.getData$jvm();
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i, ByteString byteString2, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        Intrinsics.checkParameterIsNotNull(byteString2, Contact.Type.other);
        return byteString2.rangeEquals(i2, byteString.getData$jvm(), i, i3);
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        Intrinsics.checkParameterIsNotNull(bArr, Contact.Type.other);
        return i >= 0 && i <= byteString.getData$jvm().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && Util.arrayRangeEquals(byteString.getData$jvm(), i, bArr, i2, i3);
    }

    public static final boolean commonStartsWith(ByteString byteString, ByteString byteString2) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        Intrinsics.checkParameterIsNotNull(byteString2, "prefix");
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    public static final boolean commonStartsWith(ByteString byteString, byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        Intrinsics.checkParameterIsNotNull(bArr, "prefix");
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }

    public static final boolean commonEndsWith(ByteString byteString, ByteString byteString2) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        Intrinsics.checkParameterIsNotNull(byteString2, "suffix");
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonEndsWith(ByteString byteString, byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        Intrinsics.checkParameterIsNotNull(bArr, "suffix");
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final int commonIndexOf(ByteString byteString, byte[] bArr, int i) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        Intrinsics.checkParameterIsNotNull(bArr, Contact.Type.other);
        int length = byteString.getData$jvm().length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!Util.arrayRangeEquals(byteString.getData$jvm(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public static final int commonLastIndexOf(ByteString byteString, byte[] bArr, int i) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        Intrinsics.checkParameterIsNotNull(bArr, Contact.Type.other);
        for (int min = Math.min(i, byteString.getData$jvm().length - bArr.length); min >= 0; min--) {
            if (Util.arrayRangeEquals(byteString.getData$jvm(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public static final boolean commonEquals(ByteString byteString, Object obj) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            return byteString2.size() == byteString.getData$jvm().length && byteString2.rangeEquals(0, byteString.getData$jvm(), 0, byteString.getData$jvm().length);
        }
    }

    public static final int commonHashCode(ByteString byteString) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        int hashCode$jvm = byteString.getHashCode$jvm();
        if (hashCode$jvm != 0) {
            return hashCode$jvm;
        }
        byteString.setHashCode$jvm(Arrays.hashCode(byteString.getData$jvm()));
        return byteString.getHashCode$jvm();
    }

    public static final int commonCompareTo(ByteString byteString, ByteString byteString2) {
        Intrinsics.checkParameterIsNotNull(byteString, "$receiver");
        Intrinsics.checkParameterIsNotNull(byteString2, Contact.Type.other);
        int size = byteString.size();
        int size2 = byteString2.size();
        int min = Math.min(size, size2);
        int i = 0;
        while (i < min) {
            byte b = byteString.getByte(i) & 255;
            byte b2 = byteString2.getByte(i) & 255;
            if (b == b2) {
                i++;
            } else if (b < b2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        if (size < size2) {
            return -1;
        }
        return 1;
    }

    public static final ByteString getCOMMON_EMPTY() {
        return COMMON_EMPTY;
    }

    public static final ByteString commonOf(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new ByteString(copyOf);
    }

    public static final ByteString commonEncodeUtf8(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$receiver");
        ByteString byteString = new ByteString(Platform.asUtf8ToByteArray(str));
        byteString.setUtf8$jvm(str);
        return byteString;
    }

    public static final ByteString commonDecodeBase64(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$receiver");
        byte[] decodeBase64ToArray = Base64.decodeBase64ToArray(str);
        if (decodeBase64ToArray != null) {
            return new ByteString(decodeBase64ToArray);
        }
        return null;
    }

    public static final ByteString commonDecodeHex(String str) {
        Intrinsics.checkParameterIsNotNull(str, "$receiver");
        if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((decodeHexDigit(str.charAt(i2)) << 4) + decodeHexDigit(str.charAt(i2 + 1)));
            }
            return new ByteString(bArr);
        }
        throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
    }

    private static final int decodeHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    public static final String commonToString(ByteString byteString) {
        ByteString byteString2 = byteString;
        Intrinsics.checkParameterIsNotNull(byteString2, "$receiver");
        if (byteString.getData$jvm().length == 0) {
            return "[size=0]";
        }
        int codePointIndexToCharIndex = codePointIndexToCharIndex(byteString.getData$jvm(), 64);
        if (codePointIndexToCharIndex != -1) {
            String utf8 = byteString.utf8();
            if (utf8 != null) {
                String substring = utf8.substring(0, codePointIndexToCharIndex);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String replace$default = StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), StringUtils.f6285CR, "\\r", false, 4, (Object) null);
                if (codePointIndexToCharIndex < utf8.length()) {
                    return "[size=" + byteString.getData$jvm().length + " text=" + replace$default + "…]";
                }
                return "[text=" + replace$default + ']';
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } else if (byteString.getData$jvm().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        } else {
            return "[size=" + byteString.getData$jvm().length + " hex=" + commonSubstring(byteString2, 0, 64).hex() + "…]";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0069, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int codePointIndexToCharIndex(byte[] r20, int r21) {
        /*
            r0 = r20
            r1 = r21
            int r2 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0008:
            if (r4 >= r2) goto L_0x01df
            byte r7 = r0[r4]
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 159(0x9f, float:2.23E-43)
            r10 = 31
            r11 = 13
            r12 = 65533(0xfffd, float:9.1831E-41)
            r13 = 10
            r14 = 65536(0x10000, float:9.18355E-41)
            r16 = -1
            r17 = 1
            if (r7 < 0) goto L_0x0078
            int r18 = r6 + 1
            if (r6 != r1) goto L_0x0026
            return r5
        L_0x0026:
            if (r7 == r13) goto L_0x0038
            if (r7 == r11) goto L_0x0038
            if (r7 < 0) goto L_0x002e
            if (r10 >= r7) goto L_0x0033
        L_0x002e:
            if (r8 <= r7) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            if (r9 < r7) goto L_0x0035
        L_0x0033:
            r6 = 1
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            if (r6 != 0) goto L_0x003a
        L_0x0038:
            if (r7 != r12) goto L_0x003b
        L_0x003a:
            return r16
        L_0x003b:
            if (r7 >= r14) goto L_0x003f
            r6 = 1
            goto L_0x0040
        L_0x003f:
            r6 = 2
        L_0x0040:
            int r5 = r5 + r6
            int r4 = r4 + 1
            r6 = r5
        L_0x0044:
            r5 = r18
            if (r4 >= r2) goto L_0x0072
            byte r7 = r0[r4]
            if (r7 < 0) goto L_0x0072
            int r7 = r4 + 1
            byte r4 = r0[r4]
            int r18 = r5 + 1
            if (r5 != r1) goto L_0x0055
            return r6
        L_0x0055:
            if (r4 == r13) goto L_0x0067
            if (r4 == r11) goto L_0x0067
            if (r4 < 0) goto L_0x005d
            if (r10 >= r4) goto L_0x0062
        L_0x005d:
            if (r8 <= r4) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            if (r9 < r4) goto L_0x0064
        L_0x0062:
            r5 = 1
            goto L_0x0065
        L_0x0064:
            r5 = 0
        L_0x0065:
            if (r5 != 0) goto L_0x0069
        L_0x0067:
            if (r4 != r12) goto L_0x006a
        L_0x0069:
            return r16
        L_0x006a:
            if (r4 >= r14) goto L_0x006e
            r4 = 1
            goto L_0x006f
        L_0x006e:
            r4 = 2
        L_0x006f:
            int r6 = r6 + r4
            r4 = r7
            goto L_0x0044
        L_0x0072:
            r19 = r6
            r6 = r5
            r5 = r19
            goto L_0x0008
        L_0x0078:
            int r3 = r7 >> 5
            r15 = -2
            r14 = 128(0x80, float:1.794E-43)
            if (r3 != r15) goto L_0x00cb
            int r3 = r4 + 1
            if (r2 > r3) goto L_0x0087
            if (r6 != r1) goto L_0x0086
            return r5
        L_0x0086:
            return r16
        L_0x0087:
            byte r7 = r0[r4]
            byte r3 = r0[r3]
            r15 = r3 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x0091
            r15 = 1
            goto L_0x0092
        L_0x0091:
            r15 = 0
        L_0x0092:
            if (r15 != 0) goto L_0x0098
            if (r6 != r1) goto L_0x0097
            return r5
        L_0x0097:
            return r16
        L_0x0098:
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r3 = r3 ^ r7
            if (r3 >= r14) goto L_0x00a3
            if (r6 != r1) goto L_0x00a2
            return r5
        L_0x00a2:
            return r16
        L_0x00a3:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x00a8
            return r5
        L_0x00a8:
            if (r3 == r13) goto L_0x00ba
            if (r3 == r11) goto L_0x00ba
            if (r3 < 0) goto L_0x00b0
            if (r10 >= r3) goto L_0x00b5
        L_0x00b0:
            if (r8 <= r3) goto L_0x00b3
            goto L_0x00b7
        L_0x00b3:
            if (r9 < r3) goto L_0x00b7
        L_0x00b5:
            r6 = 1
            goto L_0x00b8
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            if (r6 != 0) goto L_0x00bc
        L_0x00ba:
            if (r3 != r12) goto L_0x00bd
        L_0x00bc:
            return r16
        L_0x00bd:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x00c2
            goto L_0x00c4
        L_0x00c2:
            r17 = 2
        L_0x00c4:
            int r5 = r5 + r17
            int r4 = r4 + 2
        L_0x00c8:
            r6 = r7
            goto L_0x0008
        L_0x00cb:
            int r3 = r7 >> 4
            if (r3 != r15) goto L_0x0143
            int r3 = r4 + 2
            if (r2 > r3) goto L_0x00d7
            if (r6 != r1) goto L_0x00d6
            return r5
        L_0x00d6:
            return r16
        L_0x00d7:
            byte r7 = r0[r4]
            int r15 = r4 + 1
            byte r15 = r0[r15]
            r12 = r15 & 192(0xc0, float:2.69E-43)
            if (r12 != r14) goto L_0x00e3
            r12 = 1
            goto L_0x00e4
        L_0x00e3:
            r12 = 0
        L_0x00e4:
            if (r12 != 0) goto L_0x00ea
            if (r6 != r1) goto L_0x00e9
            return r5
        L_0x00e9:
            return r16
        L_0x00ea:
            byte r3 = r0[r3]
            r12 = r3 & 192(0xc0, float:2.69E-43)
            if (r12 != r14) goto L_0x00f2
            r12 = 1
            goto L_0x00f3
        L_0x00f2:
            r12 = 0
        L_0x00f3:
            if (r12 != 0) goto L_0x00f9
            if (r6 != r1) goto L_0x00f8
            return r5
        L_0x00f8:
            return r16
        L_0x00f9:
            r12 = -123008(0xfffffffffffe1f80, float:NaN)
            r3 = r3 ^ r12
            int r12 = r15 << 6
            r3 = r3 ^ r12
            int r7 = r7 << 12
            r3 = r3 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 >= r7) goto L_0x010b
            if (r6 != r1) goto L_0x010a
            return r5
        L_0x010a:
            return r16
        L_0x010b:
            r7 = 57343(0xdfff, float:8.0355E-41)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r12 <= r3) goto L_0x0114
            goto L_0x011a
        L_0x0114:
            if (r7 < r3) goto L_0x011a
            if (r6 != r1) goto L_0x0119
            return r5
        L_0x0119:
            return r16
        L_0x011a:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x011f
            return r5
        L_0x011f:
            if (r3 == r13) goto L_0x0131
            if (r3 == r11) goto L_0x0131
            if (r3 < 0) goto L_0x0127
            if (r10 >= r3) goto L_0x012c
        L_0x0127:
            if (r8 <= r3) goto L_0x012a
            goto L_0x012e
        L_0x012a:
            if (r9 < r3) goto L_0x012e
        L_0x012c:
            r6 = 1
            goto L_0x012f
        L_0x012e:
            r6 = 0
        L_0x012f:
            if (r6 != 0) goto L_0x0136
        L_0x0131:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x0137
        L_0x0136:
            return r16
        L_0x0137:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r17 = 2
        L_0x013e:
            int r5 = r5 + r17
            int r4 = r4 + 3
            goto L_0x00c8
        L_0x0143:
            int r3 = r7 >> 3
            if (r3 != r15) goto L_0x01db
            int r3 = r4 + 3
            if (r2 > r3) goto L_0x014f
            if (r6 != r1) goto L_0x014e
            return r5
        L_0x014e:
            return r16
        L_0x014f:
            byte r7 = r0[r4]
            int r12 = r4 + 1
            byte r12 = r0[r12]
            r15 = r12 & 192(0xc0, float:2.69E-43)
            if (r15 != r14) goto L_0x015b
            r15 = 1
            goto L_0x015c
        L_0x015b:
            r15 = 0
        L_0x015c:
            if (r15 != 0) goto L_0x0162
            if (r6 != r1) goto L_0x0161
            return r5
        L_0x0161:
            return r16
        L_0x0162:
            int r15 = r4 + 2
            byte r15 = r0[r15]
            r9 = r15 & 192(0xc0, float:2.69E-43)
            if (r9 != r14) goto L_0x016c
            r9 = 1
            goto L_0x016d
        L_0x016c:
            r9 = 0
        L_0x016d:
            if (r9 != 0) goto L_0x0173
            if (r6 != r1) goto L_0x0172
            return r5
        L_0x0172:
            return r16
        L_0x0173:
            byte r3 = r0[r3]
            r9 = r3 & 192(0xc0, float:2.69E-43)
            if (r9 != r14) goto L_0x017b
            r9 = 1
            goto L_0x017c
        L_0x017b:
            r9 = 0
        L_0x017c:
            if (r9 != 0) goto L_0x0182
            if (r6 != r1) goto L_0x0181
            return r5
        L_0x0181:
            return r16
        L_0x0182:
            r9 = 3678080(0x381f80, float:5.154088E-39)
            r3 = r3 ^ r9
            int r9 = r15 << 6
            r3 = r3 ^ r9
            int r9 = r12 << 12
            r3 = r3 ^ r9
            int r7 = r7 << 18
            r3 = r3 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r3 <= r7) goto L_0x0198
            if (r6 != r1) goto L_0x0197
            return r5
        L_0x0197:
            return r16
        L_0x0198:
            r7 = 57343(0xdfff, float:8.0355E-41)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r9 <= r3) goto L_0x01a1
            goto L_0x01a7
        L_0x01a1:
            if (r7 < r3) goto L_0x01a7
            if (r6 != r1) goto L_0x01a6
            return r5
        L_0x01a6:
            return r16
        L_0x01a7:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r7) goto L_0x01af
            if (r6 != r1) goto L_0x01ae
            return r5
        L_0x01ae:
            return r16
        L_0x01af:
            int r7 = r6 + 1
            if (r6 != r1) goto L_0x01b4
            return r5
        L_0x01b4:
            if (r3 == r13) goto L_0x01c8
            if (r3 == r11) goto L_0x01c8
            if (r3 < 0) goto L_0x01bc
            if (r10 >= r3) goto L_0x01c3
        L_0x01bc:
            if (r8 <= r3) goto L_0x01bf
            goto L_0x01c5
        L_0x01bf:
            r6 = 159(0x9f, float:2.23E-43)
            if (r6 < r3) goto L_0x01c5
        L_0x01c3:
            r6 = 1
            goto L_0x01c6
        L_0x01c5:
            r6 = 0
        L_0x01c6:
            if (r6 != 0) goto L_0x01cd
        L_0x01c8:
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r6) goto L_0x01ce
        L_0x01cd:
            return r16
        L_0x01ce:
            r6 = 65536(0x10000, float:9.18355E-41)
            if (r3 >= r6) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r17 = 2
        L_0x01d5:
            int r5 = r5 + r17
            int r4 = r4 + 4
            goto L_0x00c8
        L_0x01db:
            if (r6 != r1) goto L_0x01de
            return r5
        L_0x01de:
            return r16
        L_0x01df:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.ByteStringKt.codePointIndexToCharIndex(byte[], int):int");
    }
}
