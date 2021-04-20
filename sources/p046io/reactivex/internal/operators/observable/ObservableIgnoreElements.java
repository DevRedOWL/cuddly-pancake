package p046io.reactivex.internal.operators.observable;

import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.observable.ObservableIgnoreElements */
public final class ObservableIgnoreElements<T> extends AbstractObservableWithUpstream<T, T> {
    public ObservableIgnoreElements(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new IgnoreObservable(observer));
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableIgnoreElements$IgnoreObservable */
    static final class IgnoreObservable<T> implements Observer<T>, Disposable {
        final Observer<? super T> actual;

        /* renamed from: d */
        Disposable f6009d;

        public void onNext(T t) {
        }

        IgnoreObservable(Observer<? super T> observer) {
            this.actual = observer;
        }

        public void onSubscribe(Disposable disposable) {
            this.f6009d = disposable;
            this.actual.onSubscribe(this);
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        public void onComplete() {
            this.actual.onComplete();
        }

        public void dispose() {
            this.f6009d.dispose();
        }

        public boolean isDisposed() {
            return this.f6009d.isDisposed();
        }
    }
}
