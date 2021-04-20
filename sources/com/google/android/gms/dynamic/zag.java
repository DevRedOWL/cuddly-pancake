package com.google.android.gms.dynamic;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
final class zag implements DeferredLifecycleHelper.zaa {
    private final /* synthetic */ DeferredLifecycleHelper zaa;

    zag(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    public final int zaa() {
        return 4;
    }

    public final void zaa(LifecycleDelegate lifecycleDelegate) {
        this.zaa.zaa.onStart();
    }
}
