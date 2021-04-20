package p046io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.util.EndConsumerHelper;

/* renamed from: io.reactivex.observers.DisposableCompletableObserver */
public abstract class DisposableCompletableObserver implements CompletableObserver, Disposable {

    /* renamed from: s */
    final AtomicReference<Disposable> f6154s = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void onSubscribe(Disposable disposable) {
        if (EndConsumerHelper.setOnce(this.f6154s, disposable, getClass())) {
            onStart();
        }
    }

    public final boolean isDisposed() {
        return this.f6154s.get() == DisposableHelper.DISPOSED;
    }

    public final void dispose() {
        DisposableHelper.dispose(this.f6154s);
    }
}
