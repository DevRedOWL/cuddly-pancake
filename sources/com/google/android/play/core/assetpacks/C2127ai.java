package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.C2415i;

/* renamed from: com.google.android.play.core.assetpacks.ai */
final class C2127ai extends C2124af<Void> {

    /* renamed from: c */
    final /* synthetic */ C2131am f1526c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C2127ai(C2131am amVar, C2415i<Void> iVar) {
        super(amVar, iVar);
        this.f1526c = amVar;
    }

    /* renamed from: d */
    public final void mo33602d(Bundle bundle, Bundle bundle2) {
        super.mo33602d(bundle, bundle2);
        if (!this.f1526c.f1541g.compareAndSet(true, false)) {
            C2131am.f1535a.mo33812e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f1526c.mo33622j();
        }
    }
}
