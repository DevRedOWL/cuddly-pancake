package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.ArrayList;

/* renamed from: com.google.android.play.core.splitinstall.testing.d */
final /* synthetic */ class C2394d implements C2399i {

    /* renamed from: a */
    private final SplitInstallRequest f2164a;

    C2394d(SplitInstallRequest splitInstallRequest) {
        this.f2164a = splitInstallRequest;
    }

    /* renamed from: a */
    public final SplitInstallSessionState mo34046a(SplitInstallSessionState splitInstallSessionState) {
        SplitInstallRequest splitInstallRequest = this.f2164a;
        int i = FakeSplitInstallManager.f2136a;
        if (splitInstallSessionState == null || splitInstallSessionState.hasTerminalStatus()) {
            return SplitInstallSessionState.create(splitInstallSessionState == null ? 1 : 1 + splitInstallSessionState.sessionId(), 1, 0, 0, 0, splitInstallRequest.getModuleNames(), new ArrayList());
        }
        throw new SplitInstallException(-1);
    }
}
