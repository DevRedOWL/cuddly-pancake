package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class GoogleSignatureVerifier {
    @Nullable
    private static GoogleSignatureVerifier zza;
    private final Context zzb;
    private volatile String zzc;

    private GoogleSignatureVerifier(Context context) {
        this.zzb = context.getApplicationContext();
    }

    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zza == null) {
                zzc.zza(context);
                zza = new GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.android.gms.common.zzs} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isUidGoogleSigned(int r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.zzb
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String[] r6 = r0.getPackagesForUid(r6)
            if (r6 == 0) goto L_0x002d
            int r0 = r6.length
            if (r0 != 0) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            r0 = 0
            int r1 = r6.length
            r2 = 0
            r3 = r0
            r0 = 0
        L_0x0015:
            if (r0 >= r1) goto L_0x0025
            r3 = r6[r0]
            com.google.android.gms.common.zzs r3 = r5.zza(r3, r2, r2)
            boolean r4 = r3.zza
            if (r4 == 0) goto L_0x0022
            goto L_0x0033
        L_0x0022:
            int r0 = r0 + 1
            goto L_0x0015
        L_0x0025:
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            r3 = r6
            com.google.android.gms.common.zzs r3 = (com.google.android.gms.common.zzs) r3
            goto L_0x0033
        L_0x002d:
            java.lang.String r6 = "no pkgs"
            com.google.android.gms.common.zzs r3 = com.google.android.gms.common.zzs.zza((java.lang.String) r6)
        L_0x0033:
            r3.zzc()
            boolean r6 = r3.zza
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.isUidGoogleSigned(int):boolean");
    }

    public boolean isPackageGoogleSigned(String str) {
        zzs zza2 = zza(str, false, false);
        zza2.zzc();
        return zza2.zza;
    }

    public static boolean zza(PackageInfo packageInfo, boolean z) {
        zzd zzd;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                zzd = zza(packageInfo, zzi.zza);
            } else {
                zzd = zza(packageInfo, zzi.zza[0]);
            }
            if (zzd != null) {
                return true;
            }
        }
        return false;
    }

    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    private final zzs zza(String str, boolean z, boolean z2) {
        zzs zzs;
        if (str == null) {
            return zzs.zza("null pkg");
        }
        if (str.equals(this.zzc)) {
            return zzs.zza();
        }
        if (zzc.zza()) {
            zzs = zzc.zza(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.zzb.getPackageManager().getPackageInfo(str, 64);
                boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                if (packageInfo == null) {
                    zzs = zzs.zza("null pkg");
                } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                    zzs = zzs.zza("single cert required");
                } else {
                    zzg zzg = new zzg(packageInfo.signatures[0].toByteArray());
                    String str2 = packageInfo.packageName;
                    zzs zza2 = zzc.zza(str2, (zzd) zzg, honorsDebugCertificates, false);
                    zzs = (!zza2.zza || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !zzc.zza(str2, (zzd) zzg, false, true).zza) ? zza2 : zzs.zza("debuggable release cert app rejected");
                }
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(str);
                return zzs.zza(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "), e);
            }
        }
        if (zzs.zza) {
            this.zzc = str;
        }
        return zzs;
    }

    @Nullable
    private static zzd zza(PackageInfo packageInfo, zzd... zzdArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        zzg zzg = new zzg(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zzdArr.length; i++) {
            if (zzdArr[i].equals(zzg)) {
                return zzdArr[i];
            }
        }
        return null;
    }
}
