package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
public final class zzmn implements zzmk {
    private static final zzdh<Boolean> zza;
    private static final zzdh<Boolean> zzb;
    private static final zzdh<Boolean> zzc;
    private static final zzdh<Long> zzd;
    private static final zzdh<Long> zze;

    public final boolean zza() {
        return true;
    }

    public final boolean zzb() {
        return zza.zzc().booleanValue();
    }

    public final boolean zzc() {
        return zzb.zzc().booleanValue();
    }

    public final boolean zzd() {
        return zzc.zzc().booleanValue();
    }

    public final long zze() {
        return zze.zzc().longValue();
    }

    static {
        zzdm zzdm = new zzdm(zzde.zza("com.google.android.gms.measurement"));
        zza = zzdm.zza("measurement.client.consent_state_v1", false);
        zzb = zzdm.zza("measurement.client.3p_consent_state_v1", false);
        zzc = zzdm.zza("measurement.service.consent_state_v1_W36", false);
        zzd = zzdm.zza("measurement.id.service.consent_state_v1_W36", 0);
        zze = zzdm.zza("measurement.service.storage_consent_support_version", 203590);
    }
}
