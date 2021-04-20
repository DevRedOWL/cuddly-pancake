package okio.internal;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.facebook.imageutils.JfifUtil;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;
import org.jetbrains.anko.DimensionsKt;

@Metadata(mo51341bv = {1, 0, 2}, mo51342d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, mo51343d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "jvm"}, mo51344k = 2, mo51345mv = {1, 1, 11})
/* compiled from: -Utf8.kt */
public final class _Utf8Kt {
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (((r0[r5] & 192) == 128) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0105, code lost:
        if (((r0[r5] & 192) == 128) == false) goto L_0x0107;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String commonToUtf8String(byte[] r17) {
        /*
            r0 = r17
            java.lang.String r1 = "$receiver"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            int r1 = r0.length
            char[] r1 = new char[r1]
            int r2 = r0.length
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000e:
            if (r4 >= r2) goto L_0x0199
            byte r6 = r0[r4]
            if (r6 < 0) goto L_0x002f
            char r6 = (char) r6
            int r7 = r5 + 1
            r1[r5] = r6
            int r4 = r4 + 1
        L_0x001b:
            if (r4 >= r2) goto L_0x002d
            byte r5 = r0[r4]
            if (r5 < 0) goto L_0x002d
            int r5 = r4 + 1
            byte r4 = r0[r4]
            char r4 = (char) r4
            int r6 = r7 + 1
            r1[r7] = r4
            r4 = r5
            r7 = r6
            goto L_0x001b
        L_0x002d:
            r5 = r7
            goto L_0x000e
        L_0x002f:
            int r7 = r6 >> 5
            r8 = -2
            r10 = 128(0x80, float:1.794E-43)
            r11 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r8) goto L_0x006c
            int r6 = r4 + 1
            if (r2 > r6) goto L_0x0044
            char r6 = (char) r11
            int r7 = r5 + 1
            r1[r5] = r6
        L_0x0042:
            r12 = 1
            goto L_0x006a
        L_0x0044:
            byte r7 = r0[r4]
            byte r6 = r0[r6]
            r8 = r6 & 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L_0x004e
            r8 = 1
            goto L_0x004f
        L_0x004e:
            r8 = 0
        L_0x004f:
            if (r8 != 0) goto L_0x0057
            char r6 = (char) r11
            int r7 = r5 + 1
            r1[r5] = r6
            goto L_0x0042
        L_0x0057:
            r6 = r6 ^ 3968(0xf80, float:5.56E-42)
            int r7 = r7 << 6
            r6 = r6 ^ r7
            if (r6 >= r10) goto L_0x0064
            char r6 = (char) r11
            int r7 = r5 + 1
            r1[r5] = r6
            goto L_0x0069
        L_0x0064:
            char r6 = (char) r6
            int r7 = r5 + 1
            r1[r5] = r6
        L_0x0069:
            r12 = 2
        L_0x006a:
            int r4 = r4 + r12
            goto L_0x002d
        L_0x006c:
            int r7 = r6 >> 4
            r13 = 55296(0xd800, float:7.7486E-41)
            r14 = 57343(0xdfff, float:8.0355E-41)
            r15 = 3
            if (r7 != r8) goto L_0x00dc
            int r6 = r4 + 2
            if (r2 > r6) goto L_0x0090
            char r6 = (char) r11
            int r7 = r5 + 1
            r1[r5] = r6
            int r5 = r4 + 1
            if (r2 <= r5) goto L_0x0042
            byte r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L_0x008c
            r5 = 1
            goto L_0x008d
        L_0x008c:
            r5 = 0
        L_0x008d:
            if (r5 != 0) goto L_0x0069
            goto L_0x0042
        L_0x0090:
            byte r7 = r0[r4]
            int r8 = r4 + 1
            byte r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto L_0x009c
            r9 = 1
            goto L_0x009d
        L_0x009c:
            r9 = 0
        L_0x009d:
            if (r9 != 0) goto L_0x00a5
            char r6 = (char) r11
            int r7 = r5 + 1
            r1[r5] = r6
            goto L_0x0042
        L_0x00a5:
            byte r6 = r0[r6]
            r9 = r6 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto L_0x00ad
            r12 = 1
            goto L_0x00ae
        L_0x00ad:
            r12 = 0
        L_0x00ae:
            if (r12 != 0) goto L_0x00b6
            char r6 = (char) r11
            int r7 = r5 + 1
            r1[r5] = r6
            goto L_0x0069
        L_0x00b6:
            r9 = -123008(0xfffffffffffe1f80, float:NaN)
            r6 = r6 ^ r9
            int r8 = r8 << 6
            r6 = r6 ^ r8
            int r7 = r7 << 12
            r6 = r6 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto L_0x00ca
            char r6 = (char) r11
            int r7 = r5 + 1
            r1[r5] = r6
            goto L_0x00da
        L_0x00ca:
            if (r13 <= r6) goto L_0x00cd
            goto L_0x00d5
        L_0x00cd:
            if (r14 < r6) goto L_0x00d5
            char r6 = (char) r11
            int r7 = r5 + 1
            r1[r5] = r6
            goto L_0x00da
        L_0x00d5:
            char r6 = (char) r6
            int r7 = r5 + 1
            r1[r5] = r6
        L_0x00da:
            r12 = 3
            goto L_0x006a
        L_0x00dc:
            int r6 = r6 >> 3
            if (r6 != r8) goto L_0x0190
            int r6 = r4 + 3
            if (r2 > r6) goto L_0x010d
            int r6 = r5 + 1
            r1[r5] = r11
            int r5 = r4 + 1
            if (r2 <= r5) goto L_0x010a
            byte r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L_0x00f4
            r5 = 1
            goto L_0x00f5
        L_0x00f4:
            r5 = 0
        L_0x00f5:
            if (r5 != 0) goto L_0x00f8
            goto L_0x010a
        L_0x00f8:
            int r5 = r4 + 2
            if (r2 <= r5) goto L_0x0107
            byte r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L_0x0104
            r12 = 1
            goto L_0x0105
        L_0x0104:
            r12 = 0
        L_0x0105:
            if (r12 != 0) goto L_0x018e
        L_0x0107:
            r15 = 2
            goto L_0x018e
        L_0x010a:
            r15 = 1
            goto L_0x018e
        L_0x010d:
            byte r7 = r0[r4]
            int r8 = r4 + 1
            byte r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto L_0x0119
            r9 = 1
            goto L_0x011a
        L_0x0119:
            r9 = 0
        L_0x011a:
            if (r9 != 0) goto L_0x0121
            int r6 = r5 + 1
            r1[r5] = r11
            goto L_0x010a
        L_0x0121:
            int r9 = r4 + 2
            byte r9 = r0[r9]
            r12 = r9 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L_0x012b
            r12 = 1
            goto L_0x012c
        L_0x012b:
            r12 = 0
        L_0x012c:
            if (r12 != 0) goto L_0x0133
            int r6 = r5 + 1
            r1[r5] = r11
            goto L_0x0107
        L_0x0133:
            byte r6 = r0[r6]
            r12 = r6 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L_0x013c
            r16 = 1
            goto L_0x013e
        L_0x013c:
            r16 = 0
        L_0x013e:
            if (r16 != 0) goto L_0x0145
            int r6 = r5 + 1
            r1[r5] = r11
            goto L_0x018e
        L_0x0145:
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r6 = r6 ^ r10
            int r9 = r9 << 6
            r6 = r6 ^ r9
            int r8 = r8 << 12
            r6 = r6 ^ r8
            int r7 = r7 << 18
            r6 = r6 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r7) goto L_0x015c
            int r6 = r5 + 1
            r1[r5] = r11
            goto L_0x018c
        L_0x015c:
            if (r13 <= r6) goto L_0x015f
            goto L_0x0166
        L_0x015f:
            if (r14 < r6) goto L_0x0166
            int r6 = r5 + 1
            r1[r5] = r11
            goto L_0x018c
        L_0x0166:
            r7 = 65536(0x10000, float:9.18355E-41)
            if (r6 >= r7) goto L_0x016f
            int r6 = r5 + 1
            r1[r5] = r11
            goto L_0x018c
        L_0x016f:
            if (r6 == r11) goto L_0x0188
            int r7 = r6 >>> 10
            r8 = 55232(0xd7c0, float:7.7397E-41)
            int r7 = r7 + r8
            char r7 = (char) r7
            int r8 = r5 + 1
            r1[r5] = r7
            r5 = r6 & 1023(0x3ff, float:1.434E-42)
            r6 = 56320(0xdc00, float:7.8921E-41)
            int r5 = r5 + r6
            char r5 = (char) r5
            int r6 = r8 + 1
            r1[r8] = r5
            goto L_0x018c
        L_0x0188:
            int r6 = r5 + 1
            r1[r5] = r11
        L_0x018c:
            r9 = 4
            r15 = 4
        L_0x018e:
            int r4 = r4 + r15
            goto L_0x0196
        L_0x0190:
            int r6 = r5 + 1
            r1[r5] = r11
            int r4 = r4 + 1
        L_0x0196:
            r5 = r6
            goto L_0x000e
        L_0x0199:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal._Utf8Kt.commonToUtf8String(byte[]):java.lang.String");
    }

    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i;
        int i2;
        int i3;
        char charAt;
        int i4;
        Intrinsics.checkParameterIsNotNull(str, "$receiver");
        byte[] bArr = new byte[(str.length() * 4)];
        int length = str.length();
        int i5 = 0;
        while (i < length) {
            char charAt2 = str.charAt(i);
            if (charAt2 >= 128) {
                int length2 = str.length();
                int i6 = i;
                while (i < length2) {
                    char charAt3 = str.charAt(i);
                    if (charAt3 < 128) {
                        int i7 = i6 + 1;
                        bArr[i6] = (byte) charAt3;
                        i++;
                        while (i < length2 && str.charAt(i) < 128) {
                            bArr[i7] = (byte) str.charAt(i);
                            i++;
                            i7++;
                        }
                        i6 = i7;
                    } else {
                        if (charAt3 < 2048) {
                            int i8 = i6 + 1;
                            bArr[i6] = (byte) ((charAt3 >> 6) | JfifUtil.MARKER_SOFn);
                            i2 = i8 + 1;
                            bArr[i8] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || 57343 < charAt3) {
                            int i9 = i6 + 1;
                            bArr[i6] = (byte) ((charAt3 >> 12) | CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY);
                            int i10 = i9 + 1;
                            bArr[i9] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i2 = i10 + 1;
                            bArr[i10] = (byte) ((charAt3 & '?') | 128);
                        } else if (charAt3 > 56319 || length2 <= (i3 = i + 1) || 56320 > (charAt = str.charAt(i3)) || 57343 < charAt) {
                            i2 = i6 + 1;
                            bArr[i6] = Utf8.REPLACEMENT_BYTE;
                        } else {
                            int charAt4 = ((charAt3 << 10) + str.charAt(i3)) - 56613888;
                            int i11 = i6 + 1;
                            bArr[i6] = (byte) ((charAt4 >> 18) | DimensionsKt.HDPI);
                            int i12 = i11 + 1;
                            bArr[i11] = (byte) (((charAt4 >> 12) & 63) | 128);
                            int i13 = i12 + 1;
                            bArr[i12] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i2 = i13 + 1;
                            bArr[i13] = (byte) ((charAt4 & 63) | 128);
                            i4 = i + 2;
                            i6 = i2;
                        }
                        i4 = i + 1;
                        i6 = i2;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i6);
                Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i] = (byte) charAt2;
            i5 = i + 1;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkExpressionValueIsNotNull(copyOf2, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf2;
    }
}
