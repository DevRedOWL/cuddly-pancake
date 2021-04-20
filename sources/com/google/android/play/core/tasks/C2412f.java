package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.f */
final class C2412f<ResultT> implements C2413g<ResultT> {

    /* renamed from: a */
    private final Executor f2212a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f2213b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final OnSuccessListener<? super ResultT> f2214c;

    public C2412f(Executor executor, OnSuccessListener<? super ResultT> onSuccessListener) {
        this.f2212a = executor;
        this.f2214c = onSuccessListener;
    }

    /* renamed from: a */
    public final void mo34067a(Task<ResultT> task) {
        if (task.isSuccessful()) {
            synchronized (this.f2213b) {
                if (this.f2214c != null) {
                    this.f2212a.execute(new C2411e(this, task));
                }
            }
        }
    }
}
