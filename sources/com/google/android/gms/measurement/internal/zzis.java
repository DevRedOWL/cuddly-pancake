package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
final class zzis implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzku zzb;
    private final /* synthetic */ zzn zzc;
    private final /* synthetic */ zzir zzd;

    zzis(zzir zzir, boolean z, zzku zzku, zzn zzn) {
        this.zzd = zzir;
        this.zza = z;
        this.zzb = zzku;
        this.zzc = zzn;
    }

    public final void run() {
        zzei zzd2 = this.zzd.zzb;
        if (zzd2 == null) {
            this.zzd.zzq().zze().zza("Discarding data. Failed to set user property");
            return;
        }
        this.zzd.zza(zzd2, (AbstractSafeParcelable) this.zza ? null : this.zzb, this.zzc);
        this.zzd.zzaj();
    }
}
