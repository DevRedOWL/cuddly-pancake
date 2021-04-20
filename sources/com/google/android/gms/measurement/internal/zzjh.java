package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
final class zzjh implements Runnable {
    private final /* synthetic */ boolean zza = true;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zzz zzc;
    private final /* synthetic */ zzn zzd;
    private final /* synthetic */ zzz zze;
    private final /* synthetic */ zzir zzf;

    zzjh(zzir zzir, boolean z, boolean z2, zzz zzz, zzn zzn, zzz zzz2) {
        this.zzf = zzir;
        this.zzb = z2;
        this.zzc = zzz;
        this.zzd = zzn;
        this.zze = zzz2;
    }

    public final void run() {
        zzei zzd2 = this.zzf.zzb;
        if (zzd2 == null) {
            this.zzf.zzq().zze().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.zza) {
            this.zzf.zza(zzd2, (AbstractSafeParcelable) this.zzb ? null : this.zzc, this.zzd);
        } else {
            try {
                if (TextUtils.isEmpty(this.zze.zza)) {
                    zzd2.zza(this.zzc, this.zzd);
                } else {
                    zzd2.zza(this.zzc);
                }
            } catch (RemoteException e) {
                this.zzf.zzq().zze().zza("Failed to send conditional user property to the service", e);
            }
        }
        this.zzf.zzaj();
    }
}
