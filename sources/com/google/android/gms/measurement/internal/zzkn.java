package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
final class zzkn implements zzez {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzkl zzb;

    zzkn(zzkl zzkl, String str) {
        this.zzb = zzkl;
        this.zza = str;
    }

    public final void zza(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.zzb.zza(i, th, bArr, this.zza);
    }
}
