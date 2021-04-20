package p046io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.util.EndConsumerHelper;

/* renamed from: io.reactivex.observers.DisposableSingleObserver */
public abstract class DisposableSingleObserver<T> implements SingleObserver<T>, Disposable {

    /* renamed from: s */
    final AtomicReference<Disposable> f6157s = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void onSubscribe(Disposable disposable) {
        if (EndConsumerHelper.setOnce(this.f6157s, disposable, getClass())) {
            onStart();
        }
    }

    public final boolean isDisposed() {
        return this.f6157s.get() == DisposableHelper.DISPOSED;
    }

    public final void dispose() {
        DisposableHelper.dispose(this.f6157s);
    }
}
