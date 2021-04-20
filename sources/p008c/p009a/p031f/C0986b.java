package p008c.p009a.p031f;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

/* renamed from: c.a.f.b */
public class C0986b {

    /* renamed from: a */
    public static final byte[][] f1124a = {new byte[]{13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7}, new byte[]{4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1}, new byte[]{12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11}, new byte[]{2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9}, new byte[]{7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15}, new byte[]{10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8}, new byte[]{15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10}, new byte[]{14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7}};

    /* renamed from: b */
    public static final byte[] f1125b = {0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 3, 2, 1, 0};

    /* renamed from: c */
    public static final byte[] f1126c = {0, 1, 2, 3, 4, 5, 6, 7, 7, 6, 5, 4, 3, 2, 1, 0, 7, 6, 5, 4, 3, 2, 1, 0, 7, 6, 5, 4, 3, 2, 1, 0};

    /* renamed from: c.a.f.b$a */
    public static class C0987a implements Serializable {

        /* renamed from: a */
        public final int[] f1127a;

        public C0987a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ByteBuffer order = ByteBuffer.allocate(32).order(ByteOrder.LITTLE_ENDIAN);
            order.putInt(i).putInt(i2).putInt(i3).putInt(i4).putInt(i5).putInt(i6).putInt(i7).putInt(i8);
            order.position(0);
            IntBuffer asIntBuffer = order.asIntBuffer();
            int[] iArr = new int[asIntBuffer.capacity()];
            this.f1127a = iArr;
            asIntBuffer.get(iArr);
        }
    }

    /* renamed from: a */
    public static byte[] m580a(C0987a aVar, byte[] bArr) {
        LongBuffer asLongBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asLongBuffer();
        ByteBuffer order = ByteBuffer.allocate(bArr.length).order(ByteOrder.LITTLE_ENDIAN);
        for (int i = 0; i < asLongBuffer.capacity(); i++) {
            order.putLong(m579a(asLongBuffer.get(i), aVar.f1127a, f1126c));
        }
        return order.array();
    }

    /* JADX WARNING: type inference failed for: r9v30, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m581b(p008c.p009a.p031f.C0986b.C0987a r14, byte[] r15) {
        /*
            int r0 = r15.length
            r1 = 8
            int r0 = r0 + r1
            int r0 = r0 + -1
            int r0 = r0 / r1
            long[] r2 = new long[r0]
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0011:
            if (r5 >= r0) goto L_0x00e6
            r7 = r2[r5]
            int r9 = r15.length
            r10 = 256(0x100, float:3.59E-43)
            if (r6 >= r9) goto L_0x0021
            int r9 = r6 + 1
            byte r6 = r15[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            goto L_0x0028
        L_0x0021:
            int r9 = r3.nextInt(r10)
            r13 = r9
            r9 = r6
            r6 = r13
        L_0x0028:
            long r11 = (long) r6
            long r6 = r7 | r11
            r2[r5] = r6
            r6 = r2[r5]
            int r8 = r15.length
            if (r9 >= r8) goto L_0x003c
            int r8 = r9 + 1
            byte r9 = r15[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r13 = r9
            r9 = r8
            r8 = r13
            goto L_0x0040
        L_0x003c:
            int r8 = r3.nextInt(r10)
        L_0x0040:
            long r11 = (long) r8
            long r11 = r11 << r1
            long r6 = r6 | r11
            r2[r5] = r6
            r6 = r2[r5]
            int r8 = r15.length
            if (r9 >= r8) goto L_0x0054
            int r8 = r9 + 1
            byte r9 = r15[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r13 = r9
            r9 = r8
            r8 = r13
            goto L_0x0058
        L_0x0054:
            int r8 = r3.nextInt(r10)
        L_0x0058:
            long r11 = (long) r8
            r8 = 16
            long r11 = r11 << r8
            long r6 = r6 | r11
            r2[r5] = r6
            r6 = r2[r5]
            int r8 = r15.length
            if (r9 >= r8) goto L_0x006e
            int r8 = r9 + 1
            byte r9 = r15[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r13 = r9
            r9 = r8
            r8 = r13
            goto L_0x0072
        L_0x006e:
            int r8 = r3.nextInt(r10)
        L_0x0072:
            long r11 = (long) r8
            r8 = 24
            long r11 = r11 << r8
            long r6 = r6 | r11
            r2[r5] = r6
            r6 = r2[r5]
            int r8 = r15.length
            if (r9 >= r8) goto L_0x0088
            int r8 = r9 + 1
            byte r9 = r15[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r13 = r9
            r9 = r8
            r8 = r13
            goto L_0x008c
        L_0x0088:
            int r8 = r3.nextInt(r10)
        L_0x008c:
            long r11 = (long) r8
            r8 = 32
            long r11 = r11 << r8
            long r6 = r6 | r11
            r2[r5] = r6
            r6 = r2[r5]
            int r8 = r15.length
            if (r9 >= r8) goto L_0x00a2
            int r8 = r9 + 1
            byte r9 = r15[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r13 = r9
            r9 = r8
            r8 = r13
            goto L_0x00a6
        L_0x00a2:
            int r8 = r3.nextInt(r10)
        L_0x00a6:
            long r11 = (long) r8
            r8 = 40
            long r11 = r11 << r8
            long r6 = r6 | r11
            r2[r5] = r6
            r6 = r2[r5]
            int r8 = r15.length
            if (r9 >= r8) goto L_0x00bc
            int r8 = r9 + 1
            byte r9 = r15[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r13 = r9
            r9 = r8
            r8 = r13
            goto L_0x00c0
        L_0x00bc:
            int r8 = r3.nextInt(r10)
        L_0x00c0:
            long r11 = (long) r8
            r8 = 48
            long r11 = r11 << r8
            long r6 = r6 | r11
            r2[r5] = r6
            r6 = r2[r5]
            int r8 = r15.length
            if (r9 >= r8) goto L_0x00d6
            int r8 = r9 + 1
            byte r9 = r15[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r13 = r9
            r9 = r8
            r8 = r13
            goto L_0x00da
        L_0x00d6:
            int r8 = r3.nextInt(r10)
        L_0x00da:
            long r10 = (long) r8
            r8 = 56
            long r10 = r10 << r8
            long r6 = r6 | r10
            r2[r5] = r6
            int r5 = r5 + 1
            r6 = r9
            goto L_0x0011
        L_0x00e6:
            int r15 = r0 * 8
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.allocate(r15)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r15 = r15.order(r1)
        L_0x00f2:
            if (r4 >= r0) goto L_0x0104
            r5 = r2[r4]
            int[] r1 = r14.f1127a
            byte[] r3 = f1125b
            long r5 = m579a(r5, r1, r3)
            r15.putLong(r5)
            int r4 = r4 + 1
            goto L_0x00f2
        L_0x0104:
            byte[] r14 = r15.array()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p008c.p009a.p031f.C0986b.m581b(c.a.f.b$a, byte[]):byte[]");
    }

    /* renamed from: a */
    public static long m579a(long j, int[] iArr, byte[] bArr) {
        long j2 = j;
        int i = 0;
        while (i < 32) {
            long j3 = j2 & 4294967295L;
            long j4 = ((long) iArr[bArr[i]]) + j3;
            int i2 = 0;
            int i3 = 0;
            while (i2 < 8) {
                i3 = (int) (((long) i3) | ((((long) f1124a[i2][(byte) ((int) ((j4 & 15) & 255))]) & 4294967295L) << (i2 * 4)));
                j4 >>= 4;
                i2++;
                i = i;
            }
            long rotateLeft = (((long) Integer.rotateLeft(i3, 11)) ^ ((j2 >> 32) & 4294967295L)) & 4294967295L;
            j2 = ((j3 << 32) & -4294967296L) | ((rotateLeft | (j2 & -4294967296L)) & 4294967295L);
            i++;
        }
        long j5 = j2 & 4294967295L;
        return ((j2 >> 32) & 4294967295L & 4294967295L) | ((j5 | ((j5 << 32) & -4294967296L)) & -4294967296L);
    }
}
