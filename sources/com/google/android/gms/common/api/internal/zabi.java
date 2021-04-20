package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
final class zabi implements Runnable {
    private final /* synthetic */ zabg zaa;

    zabi(zabg zabg) {
        this.zaa = zabg;
    }

    public final void run() {
        this.zaa.zaa.zac.disconnect(String.valueOf(this.zaa.zaa.zac.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
