package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
final class zzil implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzij zzb;
    private final /* synthetic */ zzij zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzii zze;

    zzil(zzii zzii, Bundle bundle, zzij zzij, zzij zzij2, long j) {
        this.zze = zzii;
        this.zza = bundle;
        this.zzb = zzij;
        this.zzc = zzij2;
        this.zzd = j;
    }

    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
