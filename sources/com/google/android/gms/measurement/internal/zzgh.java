package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
final class zzgh implements Callable<List<zzz>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzfz zzd;

    zzgh(zzfz zzfz, String str, String str2, String str3) {
        this.zzd = zzfz;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.zzd.zza.zzr();
        return this.zzd.zza.zze().zzb(this.zza, this.zzb, this.zzc);
    }
}
