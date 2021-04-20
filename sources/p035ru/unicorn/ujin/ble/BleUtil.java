package p035ru.unicorn.ujin.ble;

/* renamed from: ru.unicorn.ujin.ble.BleUtil */
public class BleUtil {
    private static final char[] hexCode = "0123456789ABCDEF".toCharArray();

    private static int hexToBin(char c) {
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        char c2 = 'A';
        if ('A' > c || c > 'F') {
            c2 = 'a';
            if ('a' > c || c > 'f') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static byte[] parseHexBinary(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            for (int i = 0; i < length; i += 2) {
                int hexToBin = hexToBin(str.charAt(i));
                int hexToBin2 = hexToBin(str.charAt(i + 1));
                if (hexToBin == -1 || hexToBin2 == -1) {
                    throw new IllegalArgumentException("contains illegal character for hexBinary: " + str);
                }
                bArr[i / 2] = (byte) ((hexToBin * 16) + hexToBin2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("hexBinary needs to be even-length: " + str);
    }

    public static String printHexBinary(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(hexCode[(b >> 4) & 15]);
            sb.append(hexCode[b & 15]);
        }
        return sb.toString();
    }
}
