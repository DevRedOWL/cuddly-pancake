package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
final class zzik implements Runnable {
    private final /* synthetic */ zzij zza;
    private final /* synthetic */ zzij zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zzii zze;

    zzik(zzii zzii, zzij zzij, zzij zzij2, long j, boolean z) {
        this.zze = zzii;
        this.zza = zzij;
        this.zzb = zzij2;
        this.zzc = j;
        this.zzd = z;
    }

    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd, (Bundle) null);
    }
}
