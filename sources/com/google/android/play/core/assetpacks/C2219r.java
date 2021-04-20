package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C2269bh;
import com.google.android.play.core.internal.C2293ce;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.play.core.assetpacks.r */
public final class C2219r implements C2293ce<Executor> {

    /* renamed from: a */
    private final /* synthetic */ int f1867a = 0;

    public C2219r() {
    }

    public C2219r(byte[] bArr) {
    }

    public C2219r(char[] cArr) {
    }

    public C2219r(short[] sArr) {
    }

    /* renamed from: b */
    public static Executor m1093b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C2211k.f1854a);
        C2269bh.m1221k(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: c */
    public static Executor m1094c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C2211k.f1855b);
        C2269bh.m1221k(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: d */
    public static C2149bd m1095d() {
        return new C2149bd();
    }

    /* renamed from: e */
    public static C2159bn m1096e() {
        return new C2159bn();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33525a() {
        int i = this.f1867a;
        return i != 0 ? i != 1 ? i != 2 ? m1096e() : m1095d() : m1094c() : m1093b();
    }
}
