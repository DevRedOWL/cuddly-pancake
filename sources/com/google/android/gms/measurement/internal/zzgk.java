package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
final class zzgk implements Callable<byte[]> {
    private final /* synthetic */ zzaq zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzfz zzc;

    zzgk(zzfz zzfz, zzaq zzaq, String str) {
        this.zzc = zzfz;
        this.zza = zzaq;
        this.zzb = str;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.zzc.zza.zzr();
        return this.zzc.zza.zzg().zza(this.zza, this.zzb);
    }
}
