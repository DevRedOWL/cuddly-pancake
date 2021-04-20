package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* renamed from: com.google.android.play.core.assetpacks.ao */
final /* synthetic */ class C2133ao implements Runnable {

    /* renamed from: a */
    private final C2135aq f1544a;

    /* renamed from: b */
    private final Bundle f1545b;

    /* renamed from: c */
    private final AssetPackState f1546c;

    C2133ao(C2135aq aqVar, Bundle bundle, AssetPackState assetPackState) {
        this.f1544a = aqVar;
        this.f1545b = bundle;
        this.f1546c = assetPackState;
    }

    public final void run() {
        this.f1544a.mo33628d(this.f1545b, this.f1546c);
    }
}
