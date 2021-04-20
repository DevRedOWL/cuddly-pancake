package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.e */
final class C2334e implements C2337h {

    /* renamed from: a */
    final /* synthetic */ C2346q f2019a;

    /* renamed from: b */
    final /* synthetic */ Set f2020b;

    /* renamed from: c */
    final /* synthetic */ AtomicBoolean f2021c;

    /* renamed from: d */
    final /* synthetic */ C2340k f2022d;

    C2334e(C2340k kVar, C2346q qVar, Set set, AtomicBoolean atomicBoolean) {
        this.f2022d = kVar;
        this.f2019a = qVar;
        this.f2020b = set;
        this.f2021c = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo33961a(ZipFile zipFile, Set<C2339j> set) throws IOException {
        this.f2022d.m1441f(this.f2019a, set, new C2333d(this));
    }
}
