package p046io.reactivex.internal.schedulers;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p046io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.schedulers.DisposeOnCancel */
final class DisposeOnCancel implements Future<Object> {

    /* renamed from: d */
    final Disposable f6121d;

    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }

    DisposeOnCancel(Disposable disposable) {
        this.f6121d = disposable;
    }

    public boolean cancel(boolean z) {
        this.f6121d.dispose();
        return false;
    }
}
