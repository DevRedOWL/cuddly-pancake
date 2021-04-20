package com.google.android.play.core.splitinstall.testing;

import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.testing.g */
final /* synthetic */ class C2397g implements Runnable {

    /* renamed from: a */
    private final FakeSplitInstallManager f2169a;

    /* renamed from: b */
    private final List f2170b;

    /* renamed from: c */
    private final List f2171c;

    /* renamed from: d */
    private final List f2172d;

    /* renamed from: e */
    private final long f2173e;

    /* renamed from: f */
    private final /* synthetic */ int f2174f = 1;

    C2397g(FakeSplitInstallManager fakeSplitInstallManager, long j, List list, List list2, List list3) {
        this.f2169a = fakeSplitInstallManager;
        this.f2173e = j;
        this.f2170b = list;
        this.f2171c = list2;
        this.f2172d = list3;
    }

    C2397g(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, List list3, long j) {
        this.f2169a = fakeSplitInstallManager;
        this.f2170b = list;
        this.f2171c = list2;
        this.f2172d = list3;
        this.f2173e = j;
    }

    public final void run() {
        if (this.f2174f != 0) {
            this.f2169a.mo34042e(this.f2173e, this.f2170b, this.f2171c, this.f2172d);
        } else {
            this.f2169a.mo34041d(this.f2170b, this.f2171c, this.f2172d, this.f2173e);
        }
    }
}
