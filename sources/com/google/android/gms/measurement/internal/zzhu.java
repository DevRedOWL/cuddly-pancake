package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
final class zzhu implements Runnable {
    private final /* synthetic */ Boolean zza;
    private final /* synthetic */ zzhb zzb;

    zzhu(zzhb zzhb, Boolean bool) {
        this.zzb = zzhb;
        this.zza = bool;
    }

    public final void run() {
        this.zzb.zza(this.zza, true);
    }
}
