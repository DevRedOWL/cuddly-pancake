package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
final class zzhp implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzhb zzb;

    zzhp(zzhb zzhb, Bundle bundle) {
        this.zzb = zzhb;
        this.zza = bundle;
    }

    public final void run() {
        this.zzb.zzd(this.zza);
    }
}
