package p035ru.unicorn.ujin.ble;

import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.drew.metadata.exif.makernotes.OlympusMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.imageutils.JfifUtil;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.anko.DimensionsKt;

/* renamed from: ru.unicorn.ujin.ble.OpenBleDevice */
public class OpenBleDevice {
    public byte[] main(String str, String str2) throws NoSuchPaddingException, NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException, InvalidKeyException {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String printHexBinary = BleUtil.printHexBinary(bArr);
        Cipher instance = Cipher.getInstance("AES/CBC/NoPadding");
        instance.init(1, new SecretKeySpec(BleUtil.parseHexBinary(printHexBinary), "AES"), new IvParameterSpec(bArr));
        byte[] doFinal = instance.doFinal(bArr);
        System.out.println("BBB " + toHexString(doFinal));
        byte[] doubleLu = doubleLu(doFinal, instance);
        System.out.println("BBB " + toHexString(doubleLu));
        byte[] doubleLu2 = doubleLu(doubleLu, instance);
        System.out.println("BBB " + toHexString(doubleLu2));
        Cipher instance2 = Cipher.getInstance("AES/CBC/NoPadding");
        instance2.init(1, new SecretKeySpec(BleUtil.parseHexBinary(printHexBinary), "AES"), new IvParameterSpec(bArr));
        String str3 = "01" + str2 + "800000000000" + toHexString(doubleLu2);
        System.out.println("BBB dk12 = " + str3);
        byte[] doFinal2 = instance2.doFinal(BleUtil.parseHexBinary(str3));
        System.out.println("BBB " + BleUtil.printHexBinary(doFinal2));
        int length = doFinal2.length;
        byte[] copyOfRange = Arrays.copyOfRange(doFinal2, length - 16, length);
        System.out.println("BBB " + BleUtil.printHexBinary(copyOfRange));
        BleUtil.printHexBinary(copyOfRange);
        Cipher instance3 = Cipher.getInstance("AES/ECB/PKCS7Padding");
        instance3.init(1, new SecretKeySpec(copyOfRange, "AES"));
        String str4 = "0000000000000000" + str;
        System.out.println("BBB keyarndb 1  = " + str4);
        byte[] doFinal3 = instance3.doFinal(BleUtil.parseHexBinary(str4));
        System.out.println("BBB keyarndb 2  = " + BleUtil.printHexBinary(doFinal3));
        byte[] copyOfRange2 = Arrays.copyOfRange(doFinal3, 0, 16);
        System.out.println("BBB keyarndb 3  = " + BleUtil.printHexBinary(copyOfRange2));
        return copyOfRange2;
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            byte b2 = b & 255;
            if (Integer.toHexString(b2).length() == 1) {
                sb.append(0);
                sb.append(Integer.toHexString(b2));
            } else {
                sb.append(Integer.toHexString(b2));
            }
        }
        return sb.toString();
    }

    private static int shiftLeft(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            byte b = bArr[length] & 255;
            bArr2[length] = (byte) (i | (b << 1));
            i = (b >>> 7) & 1;
        }
    }

    private byte[] doubleLu(byte[] bArr, Cipher cipher) {
        byte[] lookupPoly = lookupPoly(cipher.getBlockSize());
        byte[] bArr2 = new byte[bArr.length];
        byte b = (-shiftLeft(bArr, bArr2)) & 255;
        int length = bArr.length - 3;
        bArr2[length] = (byte) (bArr2[length] ^ (lookupPoly[1] & b));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((lookupPoly[2] & b) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((lookupPoly[3] & b) ^ bArr2[length3]);
        return bArr2;
    }

    private byte[] lookupPoly(int i) {
        int i2 = i * 8;
        int i3 = 135;
        switch (i2) {
            case 64:
            case DimensionsKt.XHDPI:
                i3 = 27;
                break;
            case 128:
            case JfifUtil.MARKER_SOFn:
                break;
            case 160:
                i3 = 45;
                break;
            case CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY:
                i3 = 777;
                break;
            case 256:
                i3 = PhotoshopDirectory.TAG_CAPTION_DIGEST;
                break;
            case BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT:
                i3 = OlympusMakernoteDirectory.TAG_ZOOM;
                break;
            case 448:
                i3 = 2129;
                break;
            case 512:
                i3 = 293;
                break;
            case 768:
                i3 = 655377;
                break;
            case 1024:
                i3 = 524355;
                break;
            case 2048:
                i3 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + i2);
        }
        return intToBigEndian(i3);
    }

    public String byteToString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02X ", new Object[]{Integer.valueOf(bArr[i] & 255)}));
        }
        return sb.toString().trim().replace(" ", "");
    }

    public byte[] intToBigEndian(int i) {
        byte[] bArr = new byte[4];
        intToBigEndian(i, bArr, 0);
        return bArr;
    }

    public void intToBigEndian(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public String rotateString(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        String substring = str.substring(0, 2);
        sb.append(str.substring(2, length));
        sb.append(substring);
        return sb.toString();
    }
}
