package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
final class zzkh extends zzkn {
    private final /* synthetic */ zzkc zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzkh(zzkc zzkc) {
        super(zzkc, (zzkf) null);
        this.zza = zzkc;
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzke(this.zza, (zzkf) null);
    }

    /* synthetic */ zzkh(zzkc zzkc, zzkf zzkf) {
        this(zzkc);
    }
}
