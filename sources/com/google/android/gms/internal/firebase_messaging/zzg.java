package com.google.android.gms.internal.firebase_messaging;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Queue;

/* compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
public final class zzg {
    private static final OutputStream zza = new zze();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r2 = (long) r3;
        r2 = r2 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r2 <= 2147483647L) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r3 = Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r2 >= -2147483648L) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r3 = Integer.MIN_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r3 = (int) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] zza(java.io.InputStream r8) throws java.io.IOException {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r1 = 20
            r0.<init>(r1)
            r1 = 0
            r2 = 8192(0x2000, float:1.14794E-41)
            r2 = 0
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x000d:
            r4 = -1
            r5 = 2147483639(0x7ffffff7, float:NaN)
            if (r2 >= r5) goto L_0x004b
            int r5 = r5 - r2
            int r5 = java.lang.Math.min(r3, r5)
            byte[] r5 = new byte[r5]
            r0.add(r5)
            r6 = r2
            r2 = 0
        L_0x001f:
            int r7 = r5.length
            if (r2 >= r7) goto L_0x0031
            int r7 = r7 - r2
            int r7 = r8.read(r5, r2, r7)
            if (r7 != r4) goto L_0x002e
            byte[] r8 = zzc(r0, r6)
            goto L_0x0055
        L_0x002e:
            int r2 = r2 + r7
            int r6 = r6 + r7
            goto L_0x001f
        L_0x0031:
            long r2 = (long) r3
            long r2 = r2 + r2
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x003f
            r3 = 2147483647(0x7fffffff, float:NaN)
        L_0x003d:
            r2 = r6
            goto L_0x000d
        L_0x003f:
            r4 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 >= 0) goto L_0x0049
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x003d
        L_0x0049:
            int r3 = (int) r2
            goto L_0x003d
        L_0x004b:
            int r8 = r8.read()
            if (r8 != r4) goto L_0x0056
            byte[] r8 = zzc(r0, r5)
        L_0x0055:
            return r8
        L_0x0056:
            java.lang.OutOfMemoryError r8 = new java.lang.OutOfMemoryError
            java.lang.String r0 = "input is too large to fit in a byte array"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_messaging.zzg.zza(java.io.InputStream):byte[]");
    }

    public static InputStream zzb(InputStream inputStream, long j) {
        return new zzf(inputStream, 1048577);
    }

    private static byte[] zzc(Queue<byte[]> queue, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] remove = queue.remove();
            int min = Math.min(i2, remove.length);
            System.arraycopy(remove, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
