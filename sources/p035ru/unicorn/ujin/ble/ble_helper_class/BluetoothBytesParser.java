package p035ru.unicorn.ujin.ble.ble_helper_class;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: ru.unicorn.ujin.ble.ble_helper_class.BluetoothBytesParser */
public class BluetoothBytesParser {
    public static final int FORMAT_FLOAT = 52;
    public static final int FORMAT_SFLOAT = 50;
    public static final int FORMAT_SINT16 = 34;
    public static final int FORMAT_SINT32 = 36;
    public static final int FORMAT_SINT8 = 33;
    public static final int FORMAT_UINT16 = 18;
    public static final int FORMAT_UINT32 = 20;
    public static final int FORMAT_UINT8 = 17;
    private ByteOrder byteOrder;
    private byte[] mValue;
    private int offset;

    private int getTypeLen(int i) {
        return i & 15;
    }

    private int intToSignedBits(int i, int i2) {
        if (i >= 0) {
            return i;
        }
        int i3 = 1 << (i2 - 1);
        return (i & (i3 - 1)) + i3;
    }

    private int unsignedByteToInt(byte b) {
        return b & 255;
    }

    private int unsignedToSigned(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        return (i & i3) != 0 ? (i3 - (i & (i3 - 1))) * -1 : i;
    }

    public BluetoothBytesParser() {
        this((byte[]) null, ByteOrder.LITTLE_ENDIAN);
    }

    public BluetoothBytesParser(ByteOrder byteOrder2) {
        this((byte[]) null, byteOrder2);
    }

    public BluetoothBytesParser(byte[] bArr) {
        this(bArr, 0, ByteOrder.LITTLE_ENDIAN);
    }

    public BluetoothBytesParser(byte[] bArr, ByteOrder byteOrder2) {
        this(bArr, 0, byteOrder2);
    }

    public BluetoothBytesParser(byte[] bArr, int i) {
        this(bArr, i, ByteOrder.LITTLE_ENDIAN);
    }

    public BluetoothBytesParser(byte[] bArr, int i, ByteOrder byteOrder2) {
        this.offset = 0;
        this.mValue = bArr;
        this.offset = i;
        this.byteOrder = byteOrder2;
    }

    public Integer getIntValue(int i) {
        Integer intValue = getIntValue(i, this.offset, this.byteOrder);
        this.offset += getTypeLen(i);
        return intValue;
    }

    public Integer getIntValue(int i, ByteOrder byteOrder2) {
        Integer intValue = getIntValue(i, this.offset, byteOrder2);
        this.offset += getTypeLen(i);
        return intValue;
    }

    public long getLongValue() {
        return getLongValue(this.byteOrder);
    }

    public long getLongValue(ByteOrder byteOrder2) {
        long longValue = getLongValue(this.offset, byteOrder2);
        this.offset += 8;
        return longValue;
    }

    public long getLongValue(int i, ByteOrder byteOrder2) {
        if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
            long j = (long) (this.mValue[i + 7] & 255);
            for (int i2 = 6; i2 >= 0; i2--) {
                j = (j << 8) + ((long) (this.mValue[i2 + i] & 255));
            }
            return j;
        }
        long j2 = (long) (this.mValue[i] & 255);
        for (int i3 = 1; i3 < 8; i3++) {
            j2 = (j2 << 8) + ((long) (this.mValue[i3 + i] & 255));
        }
        return j2;
    }

    public Integer getIntValue(int i, int i2, ByteOrder byteOrder2) {
        int typeLen = getTypeLen(i) + i2;
        byte[] bArr = this.mValue;
        if (typeLen > bArr.length) {
            return null;
        }
        if (i == 17) {
            return Integer.valueOf(unsignedByteToInt(bArr[i2]));
        }
        if (i != 18) {
            if (i != 20) {
                if (i != 36) {
                    if (i == 33) {
                        return Integer.valueOf(unsignedToSigned(unsignedByteToInt(bArr[i2]), 8));
                    }
                    if (i != 34) {
                        return null;
                    }
                    if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
                        byte[] bArr2 = this.mValue;
                        return Integer.valueOf(unsignedToSigned(unsignedBytesToInt(bArr2[i2], bArr2[i2 + 1]), 16));
                    }
                    byte[] bArr3 = this.mValue;
                    return Integer.valueOf(unsignedToSigned(unsignedBytesToInt(bArr3[i2 + 1], bArr3[i2]), 16));
                } else if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
                    byte[] bArr4 = this.mValue;
                    return Integer.valueOf(unsignedToSigned(unsignedBytesToInt(bArr4[i2], bArr4[i2 + 1], bArr4[i2 + 2], bArr4[i2 + 3]), 32));
                } else {
                    byte[] bArr5 = this.mValue;
                    return Integer.valueOf(unsignedToSigned(unsignedBytesToInt(bArr5[i2 + 3], bArr5[i2 + 2], bArr5[i2 + 1], bArr5[i2]), 32));
                }
            } else if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
                byte[] bArr6 = this.mValue;
                return Integer.valueOf(unsignedBytesToInt(bArr6[i2], bArr6[i2 + 1], bArr6[i2 + 2], bArr6[i2 + 3]));
            } else {
                byte[] bArr7 = this.mValue;
                return Integer.valueOf(unsignedBytesToInt(bArr7[i2 + 3], bArr7[i2 + 2], bArr7[i2 + 1], bArr7[i2]));
            }
        } else if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
            byte[] bArr8 = this.mValue;
            return Integer.valueOf(unsignedBytesToInt(bArr8[i2], bArr8[i2 + 1]));
        } else {
            byte[] bArr9 = this.mValue;
            return Integer.valueOf(unsignedBytesToInt(bArr9[i2 + 1], bArr9[i2]));
        }
    }

    public Float getFloatValue(int i) {
        Float floatValue = getFloatValue(i, this.offset, this.byteOrder);
        this.offset += getTypeLen(i);
        return floatValue;
    }

    public Float getFloatValue(int i, ByteOrder byteOrder2) {
        Float floatValue = getFloatValue(i, this.offset, byteOrder2);
        this.offset += getTypeLen(i);
        return floatValue;
    }

    public Float getFloatValue(int i, int i2, ByteOrder byteOrder2) {
        if (getTypeLen(i) + i2 > this.mValue.length) {
            return null;
        }
        if (i != 50) {
            if (i != 52) {
                return null;
            }
            if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
                byte[] bArr = this.mValue;
                return Float.valueOf(bytesToFloat(bArr[i2], bArr[i2 + 1], bArr[i2 + 2], bArr[i2 + 3]));
            }
            byte[] bArr2 = this.mValue;
            return Float.valueOf(bytesToFloat(bArr2[i2 + 3], bArr2[i2 + 2], bArr2[i2 + 1], bArr2[i2]));
        } else if (byteOrder2 == ByteOrder.LITTLE_ENDIAN) {
            byte[] bArr3 = this.mValue;
            return Float.valueOf(bytesToFloat(bArr3[i2], bArr3[i2 + 1]));
        } else {
            byte[] bArr4 = this.mValue;
            return Float.valueOf(bytesToFloat(bArr4[i2 + 1], bArr4[i2]));
        }
    }

    public String getStringValue() {
        return getStringValue(this.offset);
    }

    public String getStringValue(int i) {
        byte[] bArr = this.mValue;
        if (bArr == null || i > bArr.length) {
            return null;
        }
        byte[] bArr2 = new byte[(bArr.length - i)];
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.mValue;
            if (i2 == bArr3.length - i) {
                break;
            }
            bArr2[i2] = bArr3[i + i2];
            i2++;
        }
        int length = bArr2.length;
        while (length > 0) {
            int i3 = length - 1;
            if (bArr2[i3] != 0 && bArr2[i3] != 32) {
                break;
            }
            length--;
        }
        return new String(bArr2, 0, length, StandardCharsets.ISO_8859_1);
    }

    public Date getDateTime() {
        Date dateTime = getDateTime(this.offset);
        this.offset += 7;
        return dateTime;
    }

    public Date getDateTime(int i) {
        int intValue = getIntValue(18, i, ByteOrder.LITTLE_ENDIAN).intValue();
        int typeLen = i + getTypeLen(18);
        int intValue2 = getIntValue(17, typeLen, ByteOrder.LITTLE_ENDIAN).intValue();
        int typeLen2 = typeLen + getTypeLen(17);
        int intValue3 = getIntValue(17, typeLen2, ByteOrder.LITTLE_ENDIAN).intValue();
        int typeLen3 = typeLen2 + getTypeLen(17);
        int intValue4 = getIntValue(17, typeLen3, ByteOrder.LITTLE_ENDIAN).intValue();
        int typeLen4 = typeLen3 + getTypeLen(17);
        return new GregorianCalendar(intValue, intValue2 - 1, intValue3, intValue4, getIntValue(17, typeLen4, ByteOrder.LITTLE_ENDIAN).intValue(), getIntValue(17, typeLen4 + getTypeLen(17), ByteOrder.LITTLE_ENDIAN).intValue()).getTime();
    }

    public byte[] getValue() {
        return this.mValue;
    }

    public boolean setIntValue(int i, int i2, int i3) {
        prepareArray(getTypeLen(i2) + i3);
        if (i2 != 17) {
            if (i2 != 18) {
                if (i2 != 20) {
                    if (i2 == 36) {
                        i = intToSignedBits(i, 32);
                    } else if (i2 == 33) {
                        i = intToSignedBits(i, 8);
                    } else if (i2 != 34) {
                        return false;
                    } else {
                        i = intToSignedBits(i, 16);
                    }
                }
                if (this.byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    byte[] bArr = this.mValue;
                    int i4 = i3 + 1;
                    bArr[i3] = (byte) (i & 255);
                    int i5 = i4 + 1;
                    bArr[i4] = (byte) ((i >> 8) & 255);
                    bArr[i5] = (byte) ((i >> 16) & 255);
                    bArr[i5 + 1] = (byte) ((i >> 24) & 255);
                    return true;
                }
                byte[] bArr2 = this.mValue;
                int i6 = i3 + 1;
                bArr2[i3] = (byte) ((i >> 24) & 255);
                int i7 = i6 + 1;
                bArr2[i6] = (byte) ((i >> 16) & 255);
                bArr2[i7] = (byte) ((i >> 8) & 255);
                bArr2[i7 + 1] = (byte) (i & 255);
                return true;
            }
            if (this.byteOrder == ByteOrder.LITTLE_ENDIAN) {
                byte[] bArr3 = this.mValue;
                bArr3[i3] = (byte) (i & 255);
                bArr3[i3 + 1] = (byte) ((i >> 8) & 255);
                return true;
            }
            byte[] bArr4 = this.mValue;
            bArr4[i3] = (byte) ((i >> 8) & 255);
            bArr4[i3 + 1] = (byte) (i & 255);
            return true;
        }
        this.mValue[i3] = (byte) (i & 255);
        return true;
    }

    public boolean setIntValue(int i, int i2) {
        boolean intValue = setIntValue(i, i2, this.offset);
        if (intValue) {
            this.offset += getTypeLen(i2);
        }
        return intValue;
    }

    public boolean setLong(long j) {
        return setLong(j, this.offset);
    }

    public boolean setLong(long j, int i) {
        prepareArray(i + 8);
        if (this.byteOrder == ByteOrder.BIG_ENDIAN) {
            for (int i2 = 7; i2 >= 0; i2--) {
                this.mValue[i2 + i] = (byte) ((int) (j & 255));
                j >>= 8;
            }
            return true;
        }
        for (int i3 = 0; i3 < 8; i3++) {
            this.mValue[i3 + i] = (byte) ((int) (j & 255));
            j >>= 8;
        }
        return true;
    }

    public boolean setFloatValue(int i, int i2, int i3, int i4) {
        prepareArray(getTypeLen(i3) + i4);
        if (i3 == 50) {
            int intToSignedBits = intToSignedBits(i, 12);
            int intToSignedBits2 = intToSignedBits(i2, 4);
            if (this.byteOrder == ByteOrder.LITTLE_ENDIAN) {
                byte[] bArr = this.mValue;
                int i5 = i4 + 1;
                bArr[i4] = (byte) (intToSignedBits & 255);
                bArr[i5] = (byte) ((intToSignedBits >> 8) & 15);
                bArr[i5] = (byte) (bArr[i5] + ((byte) ((intToSignedBits2 & 15) << 4)));
                return true;
            }
            byte[] bArr2 = this.mValue;
            bArr2[i4] = (byte) ((intToSignedBits >> 8) & 15);
            bArr2[i4] = (byte) (bArr2[i4] + ((byte) ((intToSignedBits2 & 15) << 4)));
            bArr2[i4 + 1] = (byte) (intToSignedBits & 255);
            return true;
        } else if (i3 != 52) {
            return false;
        } else {
            int intToSignedBits3 = intToSignedBits(i, 24);
            int intToSignedBits4 = intToSignedBits(i2, 8);
            if (this.byteOrder == ByteOrder.LITTLE_ENDIAN) {
                byte[] bArr3 = this.mValue;
                int i6 = i4 + 1;
                bArr3[i4] = (byte) (intToSignedBits3 & 255);
                int i7 = i6 + 1;
                bArr3[i6] = (byte) ((intToSignedBits3 >> 8) & 255);
                int i8 = i7 + 1;
                bArr3[i7] = (byte) ((intToSignedBits3 >> 16) & 255);
                bArr3[i8] = (byte) (bArr3[i8] + ((byte) (intToSignedBits4 & 255)));
                return true;
            }
            byte[] bArr4 = this.mValue;
            int i9 = i4 + 1;
            bArr4[i4] = (byte) (bArr4[i4] + ((byte) (intToSignedBits4 & 255)));
            int i10 = i9 + 1;
            bArr4[i9] = (byte) ((intToSignedBits3 >> 16) & 255);
            bArr4[i10] = (byte) ((intToSignedBits3 >> 8) & 255);
            bArr4[i10 + 1] = (byte) (intToSignedBits3 & 255);
            return true;
        }
    }

    public boolean setFloatValue(float f, int i) {
        return setFloatValue((int) ((float) (((double) f) * Math.pow(10.0d, (double) i))), -i, 52, 0);
    }

    public boolean setString(String str) {
        if (str == null) {
            return false;
        }
        setString(str, this.offset);
        this.offset += str.getBytes().length;
        return true;
    }

    public boolean setString(String str, int i) {
        if (str == null) {
            return false;
        }
        prepareArray(str.length() + i);
        byte[] bytes = str.getBytes();
        System.arraycopy(bytes, 0, this.mValue, i, bytes.length);
        return true;
    }

    public void setValue(byte[] bArr) {
        this.mValue = bArr;
    }

    public boolean setCurrentTime(Calendar calendar) {
        if (calendar == null) {
            return false;
        }
        this.mValue = new byte[10];
        this.mValue[0] = (byte) calendar.get(1);
        this.mValue[1] = (byte) (calendar.get(1) >> 8);
        this.mValue[2] = (byte) (calendar.get(2) + 1);
        this.mValue[3] = (byte) calendar.get(5);
        this.mValue[4] = (byte) calendar.get(11);
        this.mValue[5] = (byte) calendar.get(12);
        this.mValue[6] = (byte) calendar.get(13);
        this.mValue[7] = (byte) (((calendar.get(7) + 5) % 7) + 1);
        this.mValue[8] = (byte) ((calendar.get(14) * 256) / 1000);
        this.mValue[9] = 1;
        return true;
    }

    public boolean setDateTime(Calendar calendar) {
        if (calendar == null) {
            return false;
        }
        this.mValue = new byte[7];
        this.mValue[0] = (byte) calendar.get(1);
        this.mValue[1] = (byte) (calendar.get(1) >> 8);
        this.mValue[2] = (byte) (calendar.get(2) + 1);
        this.mValue[3] = (byte) calendar.get(5);
        this.mValue[4] = (byte) calendar.get(11);
        this.mValue[5] = (byte) calendar.get(12);
        this.mValue[6] = (byte) calendar.get(13);
        return true;
    }

    private int unsignedBytesToInt(byte b, byte b2) {
        return unsignedByteToInt(b) + (unsignedByteToInt(b2) << 8);
    }

    private int unsignedBytesToInt(byte b, byte b2, byte b3, byte b4) {
        return unsignedByteToInt(b) + (unsignedByteToInt(b2) << 8) + (unsignedByteToInt(b3) << 16) + (unsignedByteToInt(b4) << 24);
    }

    private float bytesToFloat(byte b, byte b2) {
        return (float) (((double) unsignedToSigned(unsignedByteToInt(b) + ((unsignedByteToInt(b2) & 15) << 8), 12)) * Math.pow(10.0d, (double) unsignedToSigned(unsignedByteToInt(b2) >> 4, 4)));
    }

    private float bytesToFloat(byte b, byte b2, byte b3, byte b4) {
        return (float) (((double) unsignedToSigned(unsignedByteToInt(b) + (unsignedByteToInt(b2) << 8) + (unsignedByteToInt(b3) << 16), 24)) * Math.pow(10.0d, (double) b4));
    }

    public static String bytes2String(byte[] bArr) {
        if (bArr == null) {
            return "-";
        }
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", new Object[]{Integer.valueOf(bArr[i] & 255)}));
        }
        return sb.toString();
    }

    public static byte[] mergeArrays(byte[]... bArr) {
        int i = 0;
        for (byte[] length : bArr) {
            i += length.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public ByteOrder getByteOrder() {
        return this.byteOrder;
    }

    private void prepareArray(int i) {
        if (this.mValue == null) {
            this.mValue = new byte[i];
        }
        byte[] bArr = this.mValue;
        if (i > bArr.length) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.mValue = bArr2;
        }
    }

    public String toString() {
        return bytes2String(this.mValue);
    }
}
