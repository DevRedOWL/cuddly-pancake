package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
final class zziu extends zzit {
    private zziu() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        zzig zzc = zzc(obj, j);
        if (zzc.zza()) {
            return zzc;
        }
        int size = zzc.size();
        zzig zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzkz.zza(obj, j, (Object) zza);
        return zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        zzc(obj, j).mo26915i_();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzig zzc = zzc(obj, j);
        zzig zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zza()) {
                zzc = zzc.zza(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzkz.zza(obj, j, (Object) zzc2);
    }

    private static <E> zzig<E> zzc(Object obj, long j) {
        return (zzig) zzkz.zzf(obj, j);
    }
}
