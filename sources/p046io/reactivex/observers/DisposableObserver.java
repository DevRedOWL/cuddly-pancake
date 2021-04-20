package p046io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;
import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.util.EndConsumerHelper;

/* renamed from: io.reactivex.observers.DisposableObserver */
public abstract class DisposableObserver<T> implements Observer<T>, Disposable {

    /* renamed from: s */
    final AtomicReference<Disposable> f6156s = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void onSubscribe(Disposable disposable) {
        if (EndConsumerHelper.setOnce(this.f6156s, disposable, getClass())) {
            onStart();
        }
    }

    public final boolean isDisposed() {
        return this.f6156s.get() == DisposableHelper.DISPOSED;
    }

    public final void dispose() {
        DisposableHelper.dispose(this.f6156s);
    }
}
