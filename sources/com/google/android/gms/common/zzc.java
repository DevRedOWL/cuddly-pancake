package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
final class zzc {
    private static volatile zzr zza;
    private static final Object zzb = new Object();
    private static Context zzc;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void zza(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.zzc> r0 = com.google.android.gms.common.zzc.class
            monitor-enter(r0)
            android.content.Context r1 = zzc     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            zzc = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.zzc.zza(android.content.Context):void");
    }

    private static void zzb() throws DynamiteModule.LoadingException {
        if (zza == null) {
            Preconditions.checkNotNull(zzc);
            synchronized (zzb) {
                if (zza == null) {
                    zza = zzq.zza(DynamiteModule.load(zzc, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }

    static zzs zza(String str, boolean z, boolean z2, boolean z3) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzb(str, z, false, false);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static zzs zza(String str, zzd zzd, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzb(str, zzd, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: finally extract failed */
    static boolean zza() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzb();
            boolean zza2 = zza.zza();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return zza2;
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static zzs zzb(String str, boolean z, boolean z2, boolean z3) {
        Preconditions.checkNotNull(zzc);
        try {
            zzb();
            try {
                zzl zza2 = zza.zza(new zzj(str, z, z2, ObjectWrapper.wrap(zzc).asBinder(), false));
                if (zza2.zza()) {
                    return zzs.zza();
                }
                String zzb2 = zza2.zzb();
                if (zzb2 == null) {
                    zzb2 = "error checking package certificate";
                }
                if (zza2.zzc().equals(zzo.PACKAGE_NOT_FOUND)) {
                    return zzs.zza(zzb2, new PackageManager.NameNotFoundException());
                }
                return zzs.zza(zzb2);
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return zzs.zza("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return zzs.zza(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    private static zzs zzb(String str, zzd zzd, boolean z, boolean z2) {
        try {
            zzb();
            Preconditions.checkNotNull(zzc);
            try {
                if (zza.zza(new zzq(str, zzd, z, z2), ObjectWrapper.wrap(zzc.getPackageManager()))) {
                    return zzs.zza();
                }
                return zzs.zza((Callable<String>) new zze(z, str, zzd));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return zzs.zza("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String valueOf = String.valueOf(e2.getMessage());
            return zzs.zza(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e2);
        }
    }

    static final /* synthetic */ String zza(boolean z, String str, zzd zzd) throws Exception {
        boolean z2 = true;
        if (z || !zzb(str, zzd, true, false).zza) {
            z2 = false;
        }
        return zzs.zza(str, zzd, z, z2);
    }
}
