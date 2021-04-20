package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
final class zzao implements Iterator<String> {
    private Iterator<String> zza = this.zzb.zza.keySet().iterator();
    private final /* synthetic */ zzap zzb;

    zzao(zzap zzap) {
        this.zzb = zzap;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public final /* synthetic */ Object next() {
        return this.zza.next();
    }
}
