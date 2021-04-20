package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.f */
final class C2335f implements C2337h {

    /* renamed from: a */
    final /* synthetic */ Set f2023a;

    /* renamed from: b */
    final /* synthetic */ C2346q f2024b;

    /* renamed from: c */
    final /* synthetic */ C2340k f2025c;

    C2335f(C2340k kVar, Set set, C2346q qVar) {
        this.f2025c = kVar;
        this.f2023a = set;
        this.f2024b = qVar;
    }

    /* renamed from: a */
    public final void mo33961a(ZipFile zipFile, Set<C2339j> set) throws IOException {
        this.f2023a.addAll(C2340k.m1439d(this.f2025c, set, this.f2024b, zipFile));
    }
}
