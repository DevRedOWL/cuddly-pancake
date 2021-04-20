package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.a */
final class C2407a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f2200a;

    /* renamed from: b */
    final /* synthetic */ C2408b f2201b;

    C2407a(C2408b bVar, Task task) {
        this.f2201b = bVar;
        this.f2200a = task;
    }

    public final void run() {
        synchronized (this.f2201b.f2203b) {
            if (this.f2201b.f2204c != null) {
                this.f2201b.f2204c.onComplete(this.f2200a);
            }
        }
    }
}
