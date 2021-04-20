package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;

/* renamed from: com.google.android.play.core.splitinstall.testing.f */
final /* synthetic */ class C2396f implements Runnable {

    /* renamed from: a */
    private final FakeSplitInstallManager f2167a;

    /* renamed from: b */
    private final SplitInstallSessionState f2168b;

    C2396f(FakeSplitInstallManager fakeSplitInstallManager, SplitInstallSessionState splitInstallSessionState) {
        this.f2167a = fakeSplitInstallManager;
        this.f2168b = splitInstallSessionState;
    }

    public final void run() {
        this.f2167a.mo34043f(this.f2168b);
    }
}
