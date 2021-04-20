package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0000\u001a\u0016\u0010\b\u001a\u00020\u0007*\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003¨\u0006\n"}, mo51343d2 = {"BASE64", "", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE", "decodeBase64ToArray", "", "encodeBase64", "map", "jvm"}, mo51344k = 2, mo51345mv = {1, 1, 11})
/* renamed from: okio.-Base64  reason: invalid class name */
/* compiled from: -Base64.kt */
public final class Base64 {
    private static final byte[] BASE64 = ByteString.Companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$jvm();
    private static final byte[] BASE64_URL_SAFE = ByteString.Companion.encodeUtf8("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$jvm();

    public static final byte[] getBASE64() {
        return BASE64;
    }

    public static final byte[] getBASE64_URL_SAFE() {
        return BASE64_URL_SAFE;
    }

    public static final byte[] decodeBase64ToArray(String str) {
        int i;
        Intrinsics.checkParameterIsNotNull(str, "$receiver");
        int length = str.length();
        while (length > 0 && ((r5 = str.charAt(length - 1)) == '=' || r5 == 10 || r5 == 13 || r5 == ' ' || r5 == 9)) {
            length--;
        }
        byte[] bArr = new byte[((int) ((((long) length) * 6) / 8))];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if ('A' <= charAt && 'Z' >= charAt) {
                i = charAt - 'A';
            } else if ('a' <= charAt && 'z' >= charAt) {
                i = charAt - 'G';
            } else if ('0' <= charAt && '9' >= charAt) {
                i = charAt + 4;
            } else if (charAt == '+' || charAt == '-') {
                i = 62;
            } else if (charAt == '/' || charAt == '_') {
                i = 63;
            } else {
                if (!(charAt == 10 || charAt == 13 || charAt == ' ' || charAt == 9)) {
                    return null;
                }
            }
            i3 = (i3 << 6) | i;
            i2++;
            if (i2 % 4 == 0) {
                int i6 = i4 + 1;
                bArr[i4] = (byte) (i3 >> 16);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (i3 >> 8);
                bArr[i7] = (byte) i3;
                i4 = i7 + 1;
            }
        }
        int i8 = i2 % 4;
        if (i8 == 1) {
            return null;
        }
        if (i8 == 2) {
            bArr[i4] = (byte) ((i3 << 12) >> 16);
            i4++;
        } else if (i8 == 3) {
            int i9 = i3 << 6;
            int i10 = i4 + 1;
            bArr[i4] = (byte) (i9 >> 16);
            i4 = i10 + 1;
            bArr[i10] = (byte) (i9 >> 8);
        }
        if (i4 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        Platform.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }

    public static /* bridge */ /* synthetic */ String encodeBase64$default(byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr2 = BASE64;
        }
        return encodeBase64(bArr, bArr2);
    }

    public static final String encodeBase64(byte[] bArr, byte[] bArr2) {
        Intrinsics.checkParameterIsNotNull(bArr, "$receiver");
        Intrinsics.checkParameterIsNotNull(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr2[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr2[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr2[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr2[b3 & Utf8.REPLACEMENT_BYTE];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr3[i10] = b5;
            bArr3[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i11];
            int i12 = i2 + 1;
            bArr3[i2] = bArr2[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr2[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr3[i13] = bArr2[(b7 & 15) << 2];
            bArr3[i13 + 1] = (byte) 61;
        }
        return Platform.toUtf8String(bArr3);
    }
}
