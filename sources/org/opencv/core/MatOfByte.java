package org.opencv.core;

import java.util.Arrays;
import java.util.List;

public class MatOfByte extends Mat {
    public MatOfByte() {
    }

    protected MatOfByte(long j) {
        super(j);
        if (!empty() && checkVector(1, 0) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public static MatOfByte fromNativeAddr(long j) {
        return new MatOfByte(j);
    }

    public MatOfByte(Mat mat) {
        super(mat, Range.all());
        if (!empty() && checkVector(1, 0) < 0) {
            throw new IllegalArgumentException("Incompatible Mat");
        }
    }

    public MatOfByte(byte... bArr) {
        fromArray(bArr);
    }

    public void alloc(int i) {
        if (i > 0) {
            super.create(i, 1, CvType.makeType(0, 1));
        }
    }

    public void fromArray(byte... bArr) {
        if (bArr != null && bArr.length != 0) {
            alloc(bArr.length / 1);
            put(0, 0, bArr);
        }
    }

    public byte[] toArray() {
        int checkVector = checkVector(1, 0);
        if (checkVector >= 0) {
            byte[] bArr = new byte[(checkVector * 1)];
            if (checkVector == 0) {
                return bArr;
            }
            get(0, 0, bArr);
            return bArr;
        }
        throw new RuntimeException("Native Mat has unexpected type or size: " + toString());
    }

    public void fromList(List<Byte> list) {
        if (list != null && list.size() != 0) {
            Byte[] bArr = (Byte[]) list.toArray(new Byte[0]);
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = bArr[i].byteValue();
            }
            fromArray(bArr2);
        }
    }

    public List<Byte> toList() {
        byte[] array = toArray();
        Byte[] bArr = new Byte[array.length];
        for (int i = 0; i < array.length; i++) {
            bArr[i] = Byte.valueOf(array[i]);
        }
        return Arrays.asList(bArr);
    }
}
