package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;

/* renamed from: com.google.android.play.core.splitinstall.testing.e */
final /* synthetic */ class C2395e implements C2399i {

    /* renamed from: a */
    private final int f2165a;

    /* renamed from: b */
    private final /* synthetic */ int f2166b = 0;

    C2395e(int i) {
        this.f2165a = i;
    }

    C2395e(int i, byte[] bArr) {
        this.f2165a = i;
    }

    /* renamed from: a */
    public final SplitInstallSessionState mo34046a(SplitInstallSessionState splitInstallSessionState) {
        if (this.f2166b == 0) {
            return FakeSplitInstallManager.m1555g(this.f2165a, splitInstallSessionState);
        }
        int i = this.f2165a;
        int i2 = FakeSplitInstallManager.f2136a;
        if (splitInstallSessionState == null) {
            return null;
        }
        return SplitInstallSessionState.create(splitInstallSessionState.sessionId(), 6, i, splitInstallSessionState.bytesDownloaded(), splitInstallSessionState.totalBytesToDownload(), splitInstallSessionState.moduleNames(), splitInstallSessionState.languages());
    }
}
