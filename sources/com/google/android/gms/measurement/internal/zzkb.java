package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
final class zzkb implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzjy zzc;

    zzkb(zzjy zzjy, long j, long j2) {
        this.zzc = zzjy;
        this.zza = j;
        this.zzb = j2;
    }

    public final void run() {
        this.zzc.zza.zzp().zza((Runnable) new zzka(this));
    }
}
