package com.google.android.play.core.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.tasks.b */
final class C2408b<ResultT> implements C2413g<ResultT> {

    /* renamed from: a */
    private final Executor f2202a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f2203b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final OnCompleteListener<ResultT> f2204c;

    public C2408b(Executor executor, OnCompleteListener<ResultT> onCompleteListener) {
        this.f2202a = executor;
        this.f2204c = onCompleteListener;
    }

    /* renamed from: a */
    public final void mo34067a(Task<ResultT> task) {
        synchronized (this.f2203b) {
            if (this.f2204c != null) {
                this.f2202a.execute(new C2407a(this, task));
            }
        }
    }
}
