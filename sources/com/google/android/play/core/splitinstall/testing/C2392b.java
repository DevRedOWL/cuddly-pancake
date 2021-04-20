package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.testing.b */
final /* synthetic */ class C2392b implements C2399i {

    /* renamed from: a */
    private final Integer f2154a;

    /* renamed from: b */
    private final int f2155b;

    /* renamed from: c */
    private final int f2156c;

    /* renamed from: d */
    private final Long f2157d;

    /* renamed from: e */
    private final Long f2158e;

    /* renamed from: f */
    private final List f2159f;

    /* renamed from: g */
    private final List f2160g;

    C2392b(Integer num, int i, int i2, Long l, Long l2, List list, List list2) {
        this.f2154a = num;
        this.f2155b = i;
        this.f2156c = i2;
        this.f2157d = l;
        this.f2158e = l2;
        this.f2159f = list;
        this.f2160g = list2;
    }

    /* renamed from: a */
    public final SplitInstallSessionState mo34046a(SplitInstallSessionState splitInstallSessionState) {
        return FakeSplitInstallManager.m1556i(this.f2154a, this.f2155b, this.f2156c, this.f2157d, this.f2158e, this.f2159f, this.f2160g, splitInstallSessionState);
    }
}
