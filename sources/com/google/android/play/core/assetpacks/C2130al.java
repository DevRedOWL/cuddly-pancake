package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C2415i;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.al */
final class C2130al extends C2124af<AssetPackStates> {

    /* renamed from: c */
    private final List<String> f1533c;

    /* renamed from: d */
    private final C2159bn f1534d;

    C2130al(C2131am amVar, C2415i<AssetPackStates> iVar, C2159bn bnVar, List<String> list) {
        super(amVar, iVar);
        this.f1534d = bnVar;
        this.f1533c = list;
    }

    /* renamed from: b */
    public final void mo33600b(int i, Bundle bundle) {
        super.mo33600b(i, bundle);
        this.f1523a.mo34076e(AssetPackStates.m820c(bundle, this.f1534d, this.f1533c));
    }
}
