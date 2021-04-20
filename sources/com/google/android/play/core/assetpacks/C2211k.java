package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.k */
final /* synthetic */ class C2211k implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f1854a = new C2211k();

    /* renamed from: b */
    static final ThreadFactory f1855b = new C2211k((byte[]) null);

    /* renamed from: c */
    private final /* synthetic */ int f1856c = 0;

    private C2211k() {
    }

    private C2211k(byte[] bArr) {
    }

    public final Thread newThread(Runnable runnable) {
        return this.f1856c != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }
}
