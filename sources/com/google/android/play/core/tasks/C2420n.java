package com.google.android.play.core.tasks;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.tasks.n */
final class C2420n implements OnSuccessListener, OnFailureListener {

    /* renamed from: a */
    private final CountDownLatch f2225a = new CountDownLatch(1);

    private C2420n() {
    }

    /* synthetic */ C2420n(byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo34083a() throws InterruptedException {
        this.f2225a.await();
    }

    /* renamed from: b */
    public final boolean mo34084b(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f2225a.await(j, timeUnit);
    }

    public final void onFailure(Exception exc) {
        this.f2225a.countDown();
    }

    public final void onSuccess(Object obj) {
        this.f2225a.countDown();
    }
}
