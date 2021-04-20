package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
final class zziy implements zzjg {
    private zzjg[] zza;

    zziy(zzjg... zzjgArr) {
        this.zza = zzjgArr;
    }

    public final boolean zza(Class<?> cls) {
        for (zzjg zza2 : this.zza) {
            if (zza2.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzjh zzb(Class<?> cls) {
        for (zzjg zzjg : this.zza) {
            if (zzjg.zza(cls)) {
                return zzjg.zzb(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
