package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.d */
final class C2410d<ResultT> implements C2413g<ResultT> {

    /* renamed from: a */
    private final Executor f2207a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f2208b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final OnFailureListener f2209c;

    public C2410d(Executor executor, OnFailureListener onFailureListener) {
        this.f2207a = executor;
        this.f2209c = onFailureListener;
    }

    /* renamed from: a */
    public final void mo34067a(Task<ResultT> task) {
        if (!task.isSuccessful()) {
            synchronized (this.f2208b) {
                if (this.f2209c != null) {
                    this.f2207a.execute(new C2409c(this, task));
                }
            }
        }
    }
}
