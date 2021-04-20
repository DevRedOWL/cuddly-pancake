package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class ProcessUtils {
    @Nullable
    private static String zza;
    private static int zzb;
    private static long zzc;

    private ProcessUtils() {
    }

    public static String getMyProcessName() {
        if (zza == null) {
            if (zzb == 0) {
                zzb = Process.myPid();
            }
            zza = zza(zzb);
        }
        return zza;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zza(int r4) {
        /*
            r0 = 0
            if (r4 > 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c, all -> 0x0037 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003c, all -> 0x0037 }
            java.lang.String r1 = "/proc/"
            r2.append(r1)     // Catch:{ IOException -> 0x003c, all -> 0x0037 }
            r2.append(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0037 }
            java.lang.String r4 = "/cmdline"
            r2.append(r4)     // Catch:{ IOException -> 0x003c, all -> 0x0037 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x003c, all -> 0x0037 }
            java.io.BufferedReader r4 = zza((java.lang.String) r4)     // Catch:{ IOException -> 0x003c, all -> 0x0037 }
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            java.lang.String r0 = r1.trim()     // Catch:{ IOException -> 0x003d, all -> 0x0032 }
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r4)
            goto L_0x0040
        L_0x0032:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0038
        L_0x0037:
            r4 = move-exception
        L_0x0038:
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r0)
            throw r4
        L_0x003c:
            r4 = r0
        L_0x003d:
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r4)
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.ProcessUtils.zza(int):java.lang.String");
    }

    private static BufferedReader zza(String str) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
