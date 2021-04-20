package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.C2415i;
import java.util.List;

/* renamed from: com.google.android.play.core.assetpacks.cf */
final /* synthetic */ class C2178cf implements Runnable {

    /* renamed from: a */
    private final C2182cj f1727a;

    /* renamed from: b */
    private final List f1728b;

    /* renamed from: c */
    private final C2136ar f1729c;

    /* renamed from: d */
    private final C2415i f1730d;

    C2178cf(C2182cj cjVar, List list, C2136ar arVar, C2415i iVar) {
        this.f1727a = cjVar;
        this.f1728b = list;
        this.f1729c = arVar;
        this.f1730d = iVar;
    }

    public final void run() {
        this.f1727a.mo33725n(this.f1728b, this.f1729c, this.f1730d);
    }
}
