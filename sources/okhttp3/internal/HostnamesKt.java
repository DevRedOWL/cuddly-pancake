package okhttp3.internal;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, mo51343d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, mo51344k = 2, mo51345mv = {1, 1, 15})
/* compiled from: hostnames.kt */
public final class HostnamesKt {
    public static final String toCanonicalHost(String str) {
        InetAddress inetAddress;
        Intrinsics.checkParameterIsNotNull(str, "$this$toCanonicalHost");
        boolean z = true;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) ":", false, 2, (Object) null)) {
            if (!StringsKt.startsWith$default(str, "[", false, 2, (Object) null) || !StringsKt.endsWith$default(str, "]", false, 2, (Object) null)) {
                inetAddress = decodeIpv6(str, 0, str.length());
            } else {
                inetAddress = decodeIpv6(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                Intrinsics.checkExpressionValueIsNotNull(address, Contact.Type.address);
                return inet6AddressToAscii(address);
            } else if (address.length == 4) {
                return inetAddress.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                Intrinsics.checkExpressionValueIsNotNull(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.US");
                if (ascii != null) {
                    String lowerCase = ascii.toLowerCase(locale);
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase.length() != 0) {
                        z = false;
                    }
                    if (z) {
                        return null;
                    }
                    if (containsInvalidHostnameAsciiCodes(lowerCase)) {
                        return null;
                    }
                    return lowerCase;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", charAt, 0, false, 6, (Object) null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        if (r12 == r8.length) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r13 != -1) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        r1 = r12 - r13;
        java.lang.System.arraycopy(r8, r13, r8, r8.length - r1, r1);
        java.util.Arrays.fill(r8, r13, (r8.length - r12) + r13, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        return java.net.InetAddress.getByAddress(r8);
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084 A[LOOP:0: B:1:0x000e->B:37:0x0084, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096 A[EDGE_INSN: B:46:0x0096->B:38:0x0096 ?: BREAK  
    EDGE_INSN: B:52:0x0096->B:38:0x0096 ?: BREAK  , RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r17, int r18, int r19) {
        /*
            r6 = r17
            r7 = r19
            r0 = 16
            byte[] r8 = new byte[r0]
            r10 = -1
            r11 = r18
            r12 = 0
            r13 = -1
            r14 = -1
        L_0x000e:
            r15 = 0
            if (r11 >= r7) goto L_0x0097
            int r0 = r8.length
            if (r12 != r0) goto L_0x0015
            return r15
        L_0x0015:
            int r5 = r11 + 2
            if (r5 > r7) goto L_0x0038
            r3 = 0
            r4 = 4
            r16 = 0
            java.lang.String r1 = "::"
            r0 = r17
            r2 = r11
            r9 = r5
            r5 = r16
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0038
            if (r13 == r10) goto L_0x002e
            return r15
        L_0x002e:
            int r12 = r12 + 2
            if (r9 != r7) goto L_0x0035
            r13 = r12
            goto L_0x0097
        L_0x0035:
            r14 = r9
            r13 = r12
            goto L_0x0067
        L_0x0038:
            if (r12 == 0) goto L_0x0066
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r0 = r17
            r2 = r11
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x004b
            int r11 = r11 + 1
            goto L_0x0066
        L_0x004b:
            r3 = 0
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r0 = r17
            r2 = r11
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0065
            int r0 = r12 + -2
            boolean r0 = decodeIpv4Suffix(r6, r14, r7, r8, r0)
            if (r0 != 0) goto L_0x0062
            return r15
        L_0x0062:
            int r12 = r12 + 2
            goto L_0x0097
        L_0x0065:
            return r15
        L_0x0066:
            r14 = r11
        L_0x0067:
            r11 = r14
            r0 = 0
        L_0x0069:
            if (r11 >= r7) goto L_0x007c
            char r1 = r6.charAt(r11)
            int r1 = okhttp3.internal.Util.parseHexDigit(r1)
            if (r1 != r10) goto L_0x0076
            goto L_0x007c
        L_0x0076:
            int r0 = r0 << 4
            int r0 = r0 + r1
            int r11 = r11 + 1
            goto L_0x0069
        L_0x007c:
            int r1 = r11 - r14
            if (r1 == 0) goto L_0x0096
            r2 = 4
            if (r1 <= r2) goto L_0x0084
            goto L_0x0096
        L_0x0084:
            int r1 = r12 + 1
            int r2 = r0 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r8[r12] = r2
            int r12 = r1 + 1
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r8[r1] = r0
            goto L_0x000e
        L_0x0096:
            return r15
        L_0x0097:
            int r0 = r8.length
            if (r12 == r0) goto L_0x00ac
            if (r13 != r10) goto L_0x009d
            return r15
        L_0x009d:
            int r0 = r8.length
            int r1 = r12 - r13
            int r0 = r0 - r1
            java.lang.System.arraycopy(r8, r13, r8, r0, r1)
            int r0 = r8.length
            int r0 = r0 - r12
            int r0 = r0 + r13
            r1 = 0
            byte r1 = (byte) r1
            java.util.Arrays.fill(r8, r13, r0, r1)
        L_0x00ac:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 == i3 + 4) {
            return true;
        }
        return false;
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i2 < bArr.length) {
            int i5 = i2;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i2;
            if (i6 > i4 && i6 >= 4) {
                i3 = i2;
                i4 = i6;
            }
            i2 = i5 + 2;
        }
        Buffer buffer = new Buffer();
        while (i < bArr.length) {
            if (i == i3) {
                buffer.writeByte(58);
                i += i4;
                if (i == 16) {
                    buffer.writeByte(58);
                }
            } else {
                if (i > 0) {
                    buffer.writeByte(58);
                }
                buffer.writeHexadecimalUnsignedLong((long) ((Util.and(bArr[i], 255) << 8) | Util.and(bArr[i + 1], 255)));
                i += 2;
            }
        }
        return buffer.readUtf8();
    }
}
