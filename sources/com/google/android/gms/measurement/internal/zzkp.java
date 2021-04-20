package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzml;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
final class zzkp implements Callable<String> {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzkl zzb;

    zzkp(zzkl zzkl, zzn zzn) {
        this.zzb = zzkl;
        this.zza = zzn;
    }

    public final /* synthetic */ Object call() throws Exception {
        if (!zzml.zzb() || !this.zzb.zzb().zza(zzas.zzci) || (this.zzb.zza(this.zza.zza).zze() && zzac.zza(this.zza.zzw).zze())) {
            zzf zzc = this.zzb.zzc(this.zza);
            if (zzc != null) {
                return zzc.zzd();
            }
            this.zzb.zzq().zzh().zza("App info was null when attempting to get app instance id");
            return null;
        }
        this.zzb.zzq().zzw().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
