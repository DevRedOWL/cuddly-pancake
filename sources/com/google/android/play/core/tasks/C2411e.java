package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.e */
final class C2411e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f2210a;

    /* renamed from: b */
    final /* synthetic */ C2412f f2211b;

    C2411e(C2412f fVar, Task task) {
        this.f2211b = fVar;
        this.f2210a = task;
    }

    public final void run() {
        synchronized (this.f2211b.f2213b) {
            if (this.f2211b.f2214c != null) {
                this.f2211b.f2214c.onSuccess(this.f2210a.getResult());
            }
        }
    }
}
