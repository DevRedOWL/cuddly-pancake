package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.OnFailureListener;

/* renamed from: com.google.android.play.core.assetpacks.g */
final /* synthetic */ class C2207g implements OnFailureListener {

    /* renamed from: a */
    static final OnFailureListener f1830a = new C2207g();

    private C2207g() {
    }

    public final void onFailure(Exception exc) {
        C2209i.f1833a.mo33812e(String.format("Could not sync active asset packs. %s", new Object[]{exc}), new Object[0]);
    }
}
