package p046io.reactivex.internal.observers;

import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.disposables.ObserverFullArbiter;

/* renamed from: io.reactivex.internal.observers.FullArbiterObserver */
public final class FullArbiterObserver<T> implements Observer<T> {
    final ObserverFullArbiter<T> arbiter;

    /* renamed from: s */
    Disposable f5770s;

    public FullArbiterObserver(ObserverFullArbiter<T> observerFullArbiter) {
        this.arbiter = observerFullArbiter;
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f5770s, disposable)) {
            this.f5770s = disposable;
            this.arbiter.setDisposable(disposable);
        }
    }

    public void onNext(T t) {
        this.arbiter.onNext(t, this.f5770s);
    }

    public void onError(Throwable th) {
        this.arbiter.onError(th, this.f5770s);
    }

    public void onComplete() {
        this.arbiter.onComplete(this.f5770s);
    }
}
