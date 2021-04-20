package com.google.android.play.core.splitinstall.testing;

import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.testing.c */
final /* synthetic */ class C2393c implements Runnable {

    /* renamed from: a */
    private final FakeSplitInstallManager f2161a;

    /* renamed from: b */
    private final List f2162b;

    /* renamed from: c */
    private final List f2163c;

    C2393c(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2) {
        this.f2161a = fakeSplitInstallManager;
        this.f2162b = list;
        this.f2163c = list2;
    }

    public final void run() {
        this.f2161a.mo34044h(this.f2162b, this.f2163c);
    }
}
