package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
final class zacr implements zacq {
    private final /* synthetic */ zaco zaa;

    zacr(zaco zaco) {
        this.zaa = zaco;
    }

    public final void zaa(BasePendingResult<?> basePendingResult) {
        this.zaa.zab.remove(basePendingResult);
    }
}
