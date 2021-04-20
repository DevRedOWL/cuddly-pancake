package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.C2415i;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.ce */
final /* synthetic */ class C2177ce implements Runnable {

    /* renamed from: a */
    private final C2182cj f1723a;

    /* renamed from: b */
    private final List f1724b;

    /* renamed from: c */
    private final C2415i f1725c;

    /* renamed from: d */
    private final List f1726d;

    C2177ce(C2182cj cjVar, List list, C2415i iVar, List list2) {
        this.f1723a = cjVar;
        this.f1724b = list;
        this.f1725c = iVar;
        this.f1726d = list2;
    }

    public final void run() {
        this.f1723a.mo33726o(this.f1724b, this.f1725c, this.f1726d);
    }
}
