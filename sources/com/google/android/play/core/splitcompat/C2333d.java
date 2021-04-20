package com.google.android.play.core.splitcompat;

import java.io.File;
import java.io.IOException;

/* renamed from: com.google.android.play.core.splitcompat.d */
final class C2333d implements C2338i {

    /* renamed from: a */
    final /* synthetic */ C2334e f2018a;

    C2333d(C2334e eVar) {
        this.f2018a = eVar;
    }

    /* renamed from: a */
    public final void mo33960a(C2339j jVar, File file, boolean z) throws IOException {
        this.f2018a.f2020b.add(file);
        if (!z) {
            this.f2018a.f2021c.set(false);
        }
    }
}
