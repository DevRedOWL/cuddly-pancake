package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
final class zabd implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ GoogleApiManager zaa;

    zabd(GoogleApiManager googleApiManager) {
        this.zaa = googleApiManager;
    }

    public final void onBackgroundStateChanged(boolean z) {
        this.zaa.zat.sendMessage(this.zaa.zat.obtainMessage(1, Boolean.valueOf(z)));
    }
}
