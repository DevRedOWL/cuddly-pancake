package com.google.android.play.core.tasks;

/* renamed from: com.google.android.play.core.tasks.c */
final class C2409c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Task f2205a;

    /* renamed from: b */
    final /* synthetic */ C2410d f2206b;

    C2409c(C2410d dVar, Task task) {
        this.f2206b = dVar;
        this.f2205a = task;
    }

    public final void run() {
        synchronized (this.f2206b.f2208b) {
            if (this.f2206b.f2209c != null) {
                this.f2206b.f2209c.onFailure(this.f2205a.getException());
            }
        }
    }
}
