package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.C2373d;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.testing.h */
final class C2398h implements C2373d {

    /* renamed from: a */
    final /* synthetic */ List f2175a;

    /* renamed from: b */
    final /* synthetic */ List f2176b;

    /* renamed from: c */
    final /* synthetic */ long f2177c;

    /* renamed from: d */
    final /* synthetic */ boolean f2178d;

    /* renamed from: e */
    final /* synthetic */ List f2179e;

    /* renamed from: f */
    final /* synthetic */ FakeSplitInstallManager f2180f;

    C2398h(FakeSplitInstallManager fakeSplitInstallManager, List list, List list2, long j, boolean z, List list3) {
        this.f2180f = fakeSplitInstallManager;
        this.f2175a = list;
        this.f2176b = list2;
        this.f2177c = j;
        this.f2178d = z;
        this.f2179e = list3;
    }

    /* renamed from: a */
    public final void mo34024a() {
        this.f2180f.f2148m.addAll(this.f2175a);
        this.f2180f.f2149n.addAll(this.f2176b);
        this.f2180f.m1565r(5, 0, Long.valueOf(this.f2177c), Long.valueOf(this.f2177c), (List<String>) null, (Integer) null, (List<String>) null);
    }

    /* renamed from: b */
    public final void mo34025b() {
        if (!this.f2178d) {
            this.f2180f.m1570w(this.f2179e, this.f2175a, this.f2176b, this.f2177c, true);
        }
    }

    /* renamed from: c */
    public final void mo34026c(int i) {
        this.f2180f.m1571x(i);
    }
}
