package com.google.android.play.core.tasks;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.l */
final class C2418l implements Executor {

    /* renamed from: a */
    private final Handler f2219a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f2219a.post(runnable);
    }
}
