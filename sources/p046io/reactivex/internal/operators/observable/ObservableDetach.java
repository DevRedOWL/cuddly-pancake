package p046io.reactivex.internal.operators.observable;

import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.util.EmptyComponent;

/* renamed from: io.reactivex.internal.operators.observable.ObservableDetach */
public final class ObservableDetach<T> extends AbstractObservableWithUpstream<T, T> {
    public ObservableDetach(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new DetachObserver(observer));
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDetach$DetachObserver */
    static final class DetachObserver<T> implements Observer<T>, Disposable {
        Observer<? super T> actual;

        /* renamed from: s */
        Disposable f5991s;

        DetachObserver(Observer<? super T> observer) {
            this.actual = observer;
        }

        public void dispose() {
            Disposable disposable = this.f5991s;
            this.f5991s = EmptyComponent.INSTANCE;
            this.actual = EmptyComponent.asObserver();
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f5991s.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5991s, disposable)) {
                this.f5991s = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.actual.onNext(t);
        }

        public void onError(Throwable th) {
            Observer<? super T> observer = this.actual;
            this.f5991s = EmptyComponent.INSTANCE;
            this.actual = EmptyComponent.asObserver();
            observer.onError(th);
        }

        public void onComplete() {
            Observer<? super T> observer = this.actual;
            this.f5991s = EmptyComponent.INSTANCE;
            this.actual = EmptyComponent.asObserver();
            observer.onComplete();
        }
    }
}
