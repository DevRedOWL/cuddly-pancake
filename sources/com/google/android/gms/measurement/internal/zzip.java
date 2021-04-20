package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
final class zzip implements Runnable {
    private final /* synthetic */ zzij zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzii zzc;

    zzip(zzii zzii, zzij zzij, long j) {
        this.zzc = zzii;
        this.zza = zzij;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        zzii zzii = this.zzc;
        zzii.zza = null;
        zzii.zzg().zza((zzij) null);
    }
}
