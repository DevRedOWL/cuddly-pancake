package androidx.renderscript;

import android.util.Log;
import java.util.BitSet;

public class FieldPacker {
    private BitSet mAlignment;
    private byte[] mData;
    private int mLen;
    private int mPos;

    public FieldPacker(int i) {
        this.mPos = 0;
        this.mLen = i;
        this.mData = new byte[i];
        this.mAlignment = new BitSet();
    }

    public FieldPacker(byte[] bArr) {
        this.mPos = bArr.length;
        this.mLen = bArr.length;
        this.mData = bArr;
        this.mAlignment = new BitSet();
    }

    static FieldPacker createFromArray(Object[] objArr) {
        FieldPacker fieldPacker = new FieldPacker(RenderScript.sPointerSize * 8);
        for (Object addSafely : objArr) {
            fieldPacker.addSafely(addSafely);
        }
        fieldPacker.resize(fieldPacker.mPos);
        return fieldPacker;
    }

    public void align(int i) {
        if (i > 0) {
            int i2 = i - 1;
            if ((i & i2) == 0) {
                while (true) {
                    int i3 = this.mPos;
                    if ((i3 & i2) != 0) {
                        this.mAlignment.flip(i3);
                        byte[] bArr = this.mData;
                        int i4 = this.mPos;
                        this.mPos = i4 + 1;
                        bArr[i4] = 0;
                    } else {
                        return;
                    }
                }
            }
        }
        throw new RSIllegalArgumentException("argument must be a non-negative non-zero power of 2: " + i);
    }

    public void subalign(int i) {
        int i2;
        int i3 = i - 1;
        if ((i & i3) == 0) {
            while (true) {
                i2 = this.mPos;
                if ((i2 & i3) == 0) {
                    break;
                }
                this.mPos = i2 - 1;
            }
            if (i2 > 0) {
                while (this.mAlignment.get(this.mPos - 1)) {
                    this.mPos--;
                    this.mAlignment.flip(this.mPos);
                }
                return;
            }
            return;
        }
        throw new RSIllegalArgumentException("argument must be a non-negative non-zero power of 2: " + i);
    }

    public void reset() {
        this.mPos = 0;
    }

    public void reset(int i) {
        if (i < 0 || i > this.mLen) {
            throw new RSIllegalArgumentException("out of range argument: " + i);
        }
        this.mPos = i;
    }

    public void skip(int i) {
        int i2 = this.mPos + i;
        if (i2 < 0 || i2 > this.mLen) {
            throw new RSIllegalArgumentException("out of range argument: " + i);
        }
        this.mPos = i2;
    }

    public void addI8(byte b) {
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = b;
    }

    public byte subI8() {
        subalign(1);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        return bArr[i];
    }

    public void addI16(short s) {
        align(2);
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) (s & 255);
        int i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = (byte) (s >> 8);
    }

    public short subI16() {
        subalign(2);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        int i2 = this.mPos - 1;
        this.mPos = i2;
        return (short) (((short) (bArr[i2] & 255)) | ((short) ((bArr[i] & 255) << 8)));
    }

    public void addI32(int i) {
        align(4);
        byte[] bArr = this.mData;
        int i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = (byte) (i & 255);
        int i3 = this.mPos;
        this.mPos = i3 + 1;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i4 = this.mPos;
        this.mPos = i4 + 1;
        bArr[i4] = (byte) ((i >> 16) & 255);
        int i5 = this.mPos;
        this.mPos = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public int subI32() {
        subalign(4);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        int i2 = this.mPos - 1;
        this.mPos = i2;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i3 = this.mPos - 1;
        this.mPos = i3;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        int i4 = this.mPos - 1;
        this.mPos = i4;
        return (bArr[i4] & 255) | b2;
    }

    public void addI64(long j) {
        align(8);
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) (j & 255));
        int i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i3 = this.mPos;
        this.mPos = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i4 = this.mPos;
        this.mPos = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >> 24) & 255));
        int i5 = this.mPos;
        this.mPos = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >> 32) & 255));
        int i6 = this.mPos;
        this.mPos = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >> 40) & 255));
        int i7 = this.mPos;
        this.mPos = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >> 48) & 255));
        int i8 = this.mPos;
        this.mPos = i8 + 1;
        bArr[i8] = (byte) ((int) ((j >> 56) & 255));
    }

    public long subI64() {
        subalign(8);
        byte[] bArr = this.mData;
        int i = this.mPos - 1;
        this.mPos = i;
        int i2 = this.mPos - 1;
        this.mPos = i2;
        long j = ((((long) bArr[i]) & 255) << 56) | 0 | ((((long) bArr[i2]) & 255) << 48);
        int i3 = this.mPos - 1;
        this.mPos = i3;
        long j2 = j | ((((long) bArr[i3]) & 255) << 40);
        int i4 = this.mPos - 1;
        this.mPos = i4;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 32);
        int i5 = this.mPos - 1;
        this.mPos = i5;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 24);
        int i6 = this.mPos - 1;
        this.mPos = i6;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 16);
        int i7 = this.mPos - 1;
        this.mPos = i7;
        int i8 = this.mPos - 1;
        this.mPos = i8;
        return (((long) bArr[i8]) & 255) | j5 | ((((long) bArr[i7]) & 255) << 8);
    }

    public void addU8(short s) {
        if (s < 0 || s > 255) {
            Log.e("rs", "FieldPacker.addU8( " + s + " )");
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) s;
    }

    public void addU16(int i) {
        if (i < 0 || i > 65535) {
            Log.e("rs", "FieldPacker.addU16( " + i + " )");
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        align(2);
        byte[] bArr = this.mData;
        int i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = (byte) (i & 255);
        int i3 = this.mPos;
        this.mPos = i3 + 1;
        bArr[i3] = (byte) (i >> 8);
    }

    public void addU32(long j) {
        if (j < 0 || j > 4294967295L) {
            Log.e("rs", "FieldPacker.addU32( " + j + " )");
            throw new IllegalArgumentException("Saving value out of range for type");
        }
        align(4);
        byte[] bArr = this.mData;
        int i = this.mPos;
        this.mPos = i + 1;
        bArr[i] = (byte) ((int) (j & 255));
        int i2 = this.mPos;
        this.mPos = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i3 = this.mPos;
        this.mPos = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i4 = this.mPos;
        this.mPos = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >> 24) & 255));
    }

    public void addU64(long j) {
        if (j >= 0) {
            align(8);
            byte[] bArr = this.mData;
            int i = this.mPos;
            this.mPos = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            int i2 = this.mPos;
            this.mPos = i2 + 1;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i3 = this.mPos;
            this.mPos = i3 + 1;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i4 = this.mPos;
            this.mPos = i4 + 1;
            bArr[i4] = (byte) ((int) ((j >> 24) & 255));
            int i5 = this.mPos;
            this.mPos = i5 + 1;
            bArr[i5] = (byte) ((int) ((j >> 32) & 255));
            int i6 = this.mPos;
            this.mPos = i6 + 1;
            bArr[i6] = (byte) ((int) ((j >> 40) & 255));
            int i7 = this.mPos;
            this.mPos = i7 + 1;
            bArr[i7] = (byte) ((int) ((j >> 48) & 255));
            int i8 = this.mPos;
            this.mPos = i8 + 1;
            bArr[i8] = (byte) ((int) ((j >> 56) & 255));
            return;
        }
        Log.e("rs", "FieldPacker.addU64( " + j + " )");
        throw new IllegalArgumentException("Saving value out of range for type");
    }

    public void addF32(float f) {
        addI32(Float.floatToRawIntBits(f));
    }

    public float subF32() {
        return Float.intBitsToFloat(subI32());
    }

    public void addF64(double d) {
        addI64(Double.doubleToRawLongBits(d));
    }

    public double subF64() {
        return Double.longBitsToDouble(subI64());
    }

    public void addObj(BaseObj baseObj) {
        if (baseObj != null) {
            if (RenderScript.sPointerSize == 8) {
                addI64(baseObj.getID((RenderScript) null));
                addI64(0);
                addI64(0);
                addI64(0);
                return;
            }
            addI32((int) baseObj.getID((RenderScript) null));
        } else if (RenderScript.sPointerSize == 8) {
            addI64(0);
            addI64(0);
            addI64(0);
            addI64(0);
        } else {
            addI32(0);
        }
    }

    public void addF32(Float2 float2) {
        addF32(float2.f97x);
        addF32(float2.f98y);
    }

    public void addF32(Float3 float3) {
        addF32(float3.f99x);
        addF32(float3.f100y);
        addF32(float3.f101z);
    }

    public void addF32(Float4 float4) {
        addF32(float4.f103x);
        addF32(float4.f104y);
        addF32(float4.f105z);
        addF32(float4.f102w);
    }

    public void addF64(Double2 double2) {
        addF64(double2.f88x);
        addF64(double2.f89y);
    }

    public void addF64(Double3 double3) {
        addF64(double3.f90x);
        addF64(double3.f91y);
        addF64(double3.f92z);
    }

    public void addF64(Double4 double4) {
        addF64(double4.f94x);
        addF64(double4.f95y);
        addF64(double4.f96z);
        addF64(double4.f93w);
    }

    public void addI8(Byte2 byte2) {
        addI8(byte2.f79x);
        addI8(byte2.f80y);
    }

    public void addI8(Byte3 byte3) {
        addI8(byte3.f81x);
        addI8(byte3.f82y);
        addI8(byte3.f83z);
    }

    public void addI8(Byte4 byte4) {
        addI8(byte4.f85x);
        addI8(byte4.f86y);
        addI8(byte4.f87z);
        addI8(byte4.f84w);
    }

    public void addU8(Short2 short2) {
        addU8(short2.f126x);
        addU8(short2.f127y);
    }

    public void addU8(Short3 short3) {
        addU8(short3.f128x);
        addU8(short3.f129y);
        addU8(short3.f130z);
    }

    public void addU8(Short4 short4) {
        addU8(short4.f132x);
        addU8(short4.f133y);
        addU8(short4.f134z);
        addU8(short4.f131w);
    }

    public void addI16(Short2 short2) {
        addI16(short2.f126x);
        addI16(short2.f127y);
    }

    public void addI16(Short3 short3) {
        addI16(short3.f128x);
        addI16(short3.f129y);
        addI16(short3.f130z);
    }

    public void addI16(Short4 short4) {
        addI16(short4.f132x);
        addI16(short4.f133y);
        addI16(short4.f134z);
        addI16(short4.f131w);
    }

    public void addU16(Int2 int2) {
        addU16(int2.f106x);
        addU16(int2.f107y);
    }

    public void addU16(Int3 int3) {
        addU16(int3.f108x);
        addU16(int3.f109y);
        addU16(int3.f110z);
    }

    public void addU16(Int4 int4) {
        addU16(int4.f112x);
        addU16(int4.f113y);
        addU16(int4.f114z);
        addU16(int4.f111w);
    }

    public void addI32(Int2 int2) {
        addI32(int2.f106x);
        addI32(int2.f107y);
    }

    public void addI32(Int3 int3) {
        addI32(int3.f108x);
        addI32(int3.f109y);
        addI32(int3.f110z);
    }

    public void addI32(Int4 int4) {
        addI32(int4.f112x);
        addI32(int4.f113y);
        addI32(int4.f114z);
        addI32(int4.f111w);
    }

    public void addU32(Long2 long2) {
        addU32(long2.f115x);
        addU32(long2.f116y);
    }

    public void addU32(Long3 long3) {
        addU32(long3.f117x);
        addU32(long3.f118y);
        addU32(long3.f119z);
    }

    public void addU32(Long4 long4) {
        addU32(long4.f121x);
        addU32(long4.f122y);
        addU32(long4.f123z);
        addU32(long4.f120w);
    }

    public void addI64(Long2 long2) {
        addI64(long2.f115x);
        addI64(long2.f116y);
    }

    public void addI64(Long3 long3) {
        addI64(long3.f117x);
        addI64(long3.f118y);
        addI64(long3.f119z);
    }

    public void addI64(Long4 long4) {
        addI64(long4.f121x);
        addI64(long4.f122y);
        addI64(long4.f123z);
        addI64(long4.f120w);
    }

    public void addU64(Long2 long2) {
        addU64(long2.f115x);
        addU64(long2.f116y);
    }

    public void addU64(Long3 long3) {
        addU64(long3.f117x);
        addU64(long3.f118y);
        addU64(long3.f119z);
    }

    public void addU64(Long4 long4) {
        addU64(long4.f121x);
        addU64(long4.f122y);
        addU64(long4.f123z);
        addU64(long4.f120w);
    }

    public Float2 subFloat2() {
        Float2 float2 = new Float2();
        float2.f98y = subF32();
        float2.f97x = subF32();
        return float2;
    }

    public Float3 subFloat3() {
        Float3 float3 = new Float3();
        float3.f101z = subF32();
        float3.f100y = subF32();
        float3.f99x = subF32();
        return float3;
    }

    public Float4 subFloat4() {
        Float4 float4 = new Float4();
        float4.f102w = subF32();
        float4.f105z = subF32();
        float4.f104y = subF32();
        float4.f103x = subF32();
        return float4;
    }

    public Double2 subDouble2() {
        Double2 double2 = new Double2();
        double2.f89y = subF64();
        double2.f88x = subF64();
        return double2;
    }

    public Double3 subDouble3() {
        Double3 double3 = new Double3();
        double3.f92z = subF64();
        double3.f91y = subF64();
        double3.f90x = subF64();
        return double3;
    }

    public Double4 subDouble4() {
        Double4 double4 = new Double4();
        double4.f93w = subF64();
        double4.f96z = subF64();
        double4.f95y = subF64();
        double4.f94x = subF64();
        return double4;
    }

    public Byte2 subByte2() {
        Byte2 byte2 = new Byte2();
        byte2.f80y = subI8();
        byte2.f79x = subI8();
        return byte2;
    }

    public Byte3 subByte3() {
        Byte3 byte3 = new Byte3();
        byte3.f83z = subI8();
        byte3.f82y = subI8();
        byte3.f81x = subI8();
        return byte3;
    }

    public Byte4 subByte4() {
        Byte4 byte4 = new Byte4();
        byte4.f84w = subI8();
        byte4.f87z = subI8();
        byte4.f86y = subI8();
        byte4.f85x = subI8();
        return byte4;
    }

    public Short2 subShort2() {
        Short2 short2 = new Short2();
        short2.f127y = subI16();
        short2.f126x = subI16();
        return short2;
    }

    public Short3 subShort3() {
        Short3 short3 = new Short3();
        short3.f130z = subI16();
        short3.f129y = subI16();
        short3.f128x = subI16();
        return short3;
    }

    public Short4 subShort4() {
        Short4 short4 = new Short4();
        short4.f131w = subI16();
        short4.f134z = subI16();
        short4.f133y = subI16();
        short4.f132x = subI16();
        return short4;
    }

    public Int2 subInt2() {
        Int2 int2 = new Int2();
        int2.f107y = subI32();
        int2.f106x = subI32();
        return int2;
    }

    public Int3 subInt3() {
        Int3 int3 = new Int3();
        int3.f110z = subI32();
        int3.f109y = subI32();
        int3.f108x = subI32();
        return int3;
    }

    public Int4 subInt4() {
        Int4 int4 = new Int4();
        int4.f111w = subI32();
        int4.f114z = subI32();
        int4.f113y = subI32();
        int4.f112x = subI32();
        return int4;
    }

    public Long2 subLong2() {
        Long2 long2 = new Long2();
        long2.f116y = subI64();
        long2.f115x = subI64();
        return long2;
    }

    public Long3 subLong3() {
        Long3 long3 = new Long3();
        long3.f119z = subI64();
        long3.f118y = subI64();
        long3.f117x = subI64();
        return long3;
    }

    public Long4 subLong4() {
        Long4 long4 = new Long4();
        long4.f120w = subI64();
        long4.f123z = subI64();
        long4.f122y = subI64();
        long4.f121x = subI64();
        return long4;
    }

    public void addMatrix(Matrix4f matrix4f) {
        for (float addF32 : matrix4f.mMat) {
            addF32(addF32);
        }
    }

    public Matrix4f subMatrix4f() {
        Matrix4f matrix4f = new Matrix4f();
        for (int length = matrix4f.mMat.length - 1; length >= 0; length--) {
            matrix4f.mMat[length] = subF32();
        }
        return matrix4f;
    }

    public void addMatrix(Matrix3f matrix3f) {
        for (float addF32 : matrix3f.mMat) {
            addF32(addF32);
        }
    }

    public Matrix3f subMatrix3f() {
        Matrix3f matrix3f = new Matrix3f();
        for (int length = matrix3f.mMat.length - 1; length >= 0; length--) {
            matrix3f.mMat[length] = subF32();
        }
        return matrix3f;
    }

    public void addMatrix(Matrix2f matrix2f) {
        for (float addF32 : matrix2f.mMat) {
            addF32(addF32);
        }
    }

    public Matrix2f subMatrix2f() {
        Matrix2f matrix2f = new Matrix2f();
        for (int length = matrix2f.mMat.length - 1; length >= 0; length--) {
            matrix2f.mMat[length] = subF32();
        }
        return matrix2f;
    }

    public void addBoolean(boolean z) {
        addI8(z ? (byte) 1 : 0);
    }

    public boolean subBoolean() {
        return subI8() == 1;
    }

    public final byte[] getData() {
        return this.mData;
    }

    public int getPos() {
        return this.mPos;
    }

    private static void addToPack(FieldPacker fieldPacker, Object obj) {
        if (obj instanceof Boolean) {
            fieldPacker.addBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            fieldPacker.addI8(((Byte) obj).byteValue());
        } else if (obj instanceof Short) {
            fieldPacker.addI16(((Short) obj).shortValue());
        } else if (obj instanceof Integer) {
            fieldPacker.addI32(((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            fieldPacker.addI64(((Long) obj).longValue());
        } else if (obj instanceof Float) {
            fieldPacker.addF32(((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            fieldPacker.addF64(((Double) obj).doubleValue());
        } else if (obj instanceof Byte2) {
            fieldPacker.addI8((Byte2) obj);
        } else if (obj instanceof Byte3) {
            fieldPacker.addI8((Byte3) obj);
        } else if (obj instanceof Byte4) {
            fieldPacker.addI8((Byte4) obj);
        } else if (obj instanceof Short2) {
            fieldPacker.addI16((Short2) obj);
        } else if (obj instanceof Short3) {
            fieldPacker.addI16((Short3) obj);
        } else if (obj instanceof Short4) {
            fieldPacker.addI16((Short4) obj);
        } else if (obj instanceof Int2) {
            fieldPacker.addI32((Int2) obj);
        } else if (obj instanceof Int3) {
            fieldPacker.addI32((Int3) obj);
        } else if (obj instanceof Int4) {
            fieldPacker.addI32((Int4) obj);
        } else if (obj instanceof Long2) {
            fieldPacker.addI64((Long2) obj);
        } else if (obj instanceof Long3) {
            fieldPacker.addI64((Long3) obj);
        } else if (obj instanceof Long4) {
            fieldPacker.addI64((Long4) obj);
        } else if (obj instanceof Float2) {
            fieldPacker.addF32((Float2) obj);
        } else if (obj instanceof Float3) {
            fieldPacker.addF32((Float3) obj);
        } else if (obj instanceof Float4) {
            fieldPacker.addF32((Float4) obj);
        } else if (obj instanceof Double2) {
            fieldPacker.addF64((Double2) obj);
        } else if (obj instanceof Double3) {
            fieldPacker.addF64((Double3) obj);
        } else if (obj instanceof Double4) {
            fieldPacker.addF64((Double4) obj);
        } else if (obj instanceof Matrix2f) {
            fieldPacker.addMatrix((Matrix2f) obj);
        } else if (obj instanceof Matrix3f) {
            fieldPacker.addMatrix((Matrix3f) obj);
        } else if (obj instanceof Matrix4f) {
            fieldPacker.addMatrix((Matrix4f) obj);
        } else if (obj instanceof BaseObj) {
            fieldPacker.addObj((BaseObj) obj);
        }
    }

    private static int getPackedSize(Object obj) {
        if ((obj instanceof Boolean) || (obj instanceof Byte)) {
            return 1;
        }
        if (obj instanceof Short) {
            return 2;
        }
        if (obj instanceof Integer) {
            return 4;
        }
        if (obj instanceof Long) {
            return 8;
        }
        if (obj instanceof Float) {
            return 4;
        }
        if (obj instanceof Double) {
            return 8;
        }
        if (obj instanceof Byte2) {
            return 2;
        }
        if (obj instanceof Byte3) {
            return 3;
        }
        if ((obj instanceof Byte4) || (obj instanceof Short2)) {
            return 4;
        }
        if (obj instanceof Short3) {
            return 6;
        }
        if ((obj instanceof Short4) || (obj instanceof Int2)) {
            return 8;
        }
        if (obj instanceof Int3) {
            return 12;
        }
        if ((obj instanceof Int4) || (obj instanceof Long2)) {
            return 16;
        }
        if (obj instanceof Long3) {
            return 24;
        }
        if (obj instanceof Long4) {
            return 32;
        }
        if (obj instanceof Float2) {
            return 8;
        }
        if (obj instanceof Float3) {
            return 12;
        }
        if ((obj instanceof Float4) || (obj instanceof Double2)) {
            return 16;
        }
        if (obj instanceof Double3) {
            return 24;
        }
        if (obj instanceof Double4) {
            return 32;
        }
        if (obj instanceof Matrix2f) {
            return 16;
        }
        if (obj instanceof Matrix3f) {
            return 36;
        }
        if (obj instanceof Matrix4f) {
            return 64;
        }
        if (!(obj instanceof BaseObj)) {
            return 0;
        }
        if (RenderScript.sPointerSize == 8) {
            return 32;
        }
        return 4;
    }

    static FieldPacker createFieldPack(Object[] objArr) {
        int i = 0;
        for (Object packedSize : objArr) {
            i += getPackedSize(packedSize);
        }
        FieldPacker fieldPacker = new FieldPacker(i);
        for (Object addToPack : objArr) {
            addToPack(fieldPacker, addToPack);
        }
        return fieldPacker;
    }

    private boolean resize(int i) {
        if (i == this.mLen) {
            return false;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.mData, 0, bArr, 0, this.mPos);
        this.mData = bArr;
        this.mLen = i;
        return true;
    }

    private void addSafely(Object obj) {
        boolean z;
        int i = this.mPos;
        do {
            z = false;
            try {
                addToPack(this, obj);
                continue;
            } catch (ArrayIndexOutOfBoundsException unused) {
                this.mPos = i;
                resize(this.mLen * 2);
                z = true;
                continue;
            }
        } while (z);
    }
}
