package p008c.p009a.p031f;

/* renamed from: c.a.f.c */
public class C0988c {

    /* renamed from: a */
    public static final char[] f1128a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m582a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f1128a;
            cArr[i] = cArr2[(bArr[i2] & 255) >> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return String.valueOf(cArr);
    }

    /* renamed from: a */
    public static String m583a(byte[] bArr, int i, int i2) {
        if (i2 + i <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            while (i4 < i3) {
                int i5 = i4 + 1;
                char[] cArr2 = f1128a;
                cArr[i4] = cArr2[(bArr[i] & 255) >> 4];
                i4 = i5 + 1;
                cArr[i5] = cArr2[bArr[i] & 15];
                i++;
            }
            return String.valueOf(cArr);
        }
        throw new IllegalArgumentException("Length must be less than buffer size");
    }

    /* renamed from: a */
    public static byte[] m584a(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length must be even");
    }
}
