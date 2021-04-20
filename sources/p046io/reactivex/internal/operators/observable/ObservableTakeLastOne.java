package p046io.reactivex.internal.operators.observable;

import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.ObservableTakeLastOne */
public final class ObservableTakeLastOne<T> extends AbstractObservableWithUpstream<T, T> {
    public ObservableTakeLastOne(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new TakeLastOneObserver(observer));
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTakeLastOne$TakeLastOneObserver */
    static final class TakeLastOneObserver<T> implements Observer<T>, Disposable {
        final Observer<? super T> actual;

        /* renamed from: s */
        Disposable f6049s;
        T value;

        TakeLastOneObserver(Observer<? super T> observer) {
            this.actual = observer;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f6049s, disposable)) {
                this.f6049s = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.value = t;
        }

        public void onError(Throwable th) {
            this.value = null;
            this.actual.onError(th);
        }

        public void onComplete() {
            emit();
        }

        /* access modifiers changed from: package-private */
        public void emit() {
            T t = this.value;
            if (t != null) {
                this.value = null;
                this.actual.onNext(t);
            }
            this.actual.onComplete();
        }

        public void dispose() {
            this.value = null;
            this.f6049s.dispose();
        }

        public boolean isDisposed() {
            return this.f6049s.isDisposed();
        }
    }
}
