package p046io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;
import p046io.reactivex.MaybeObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.util.EndConsumerHelper;

/* renamed from: io.reactivex.observers.DisposableMaybeObserver */
public abstract class DisposableMaybeObserver<T> implements MaybeObserver<T>, Disposable {

    /* renamed from: s */
    final AtomicReference<Disposable> f6155s = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void onSubscribe(Disposable disposable) {
        if (EndConsumerHelper.setOnce(this.f6155s, disposable, getClass())) {
            onStart();
        }
    }

    public final boolean isDisposed() {
        return this.f6155s.get() == DisposableHelper.DISPOSED;
    }

    public final void dispose() {
        DisposableHelper.dispose(this.f6155s);
    }
}
