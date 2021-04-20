package com.google.android.gms.internal.measurement;

import com.google.android.gcm.GCMRegistrar;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
public final class zzmc implements zzmd {
    private static final zzdh<Boolean> zza;
    private static final zzdh<Long> zzb;

    public final boolean zza() {
        return zza.zzc().booleanValue();
    }

    public final long zzb() {
        return zzb.zzc().longValue();
    }

    static {
        zzdm zzdm = new zzdm(zzde.zza("com.google.android.gms.measurement"));
        zza = zzdm.zza("measurement.sdk.attribution.cache", true);
        zzb = zzdm.zza("measurement.sdk.attribution.cache.ttl", (long) GCMRegistrar.DEFAULT_ON_SERVER_LIFESPAN_MS);
    }
}
