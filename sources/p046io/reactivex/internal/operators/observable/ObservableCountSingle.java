package p046io.reactivex.internal.operators.observable;

import p046io.reactivex.Observable;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;
import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.fuseable.FuseToObservable;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.ObservableCountSingle */
public final class ObservableCountSingle<T> extends Single<Long> implements FuseToObservable<Long> {
    final ObservableSource<T> source;

    public ObservableCountSingle(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }

    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.source.subscribe(new CountObserver(singleObserver));
    }

    public Observable<Long> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableCount(this.source));
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCountSingle$CountObserver */
    static final class CountObserver implements Observer<Object>, Disposable {
        final SingleObserver<? super Long> actual;
        long count;

        /* renamed from: d */
        Disposable f5984d;

        CountObserver(SingleObserver<? super Long> singleObserver) {
            this.actual = singleObserver;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5984d, disposable)) {
                this.f5984d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f5984d.dispose();
            this.f5984d = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f5984d.isDisposed();
        }

        public void onNext(Object obj) {
            this.count++;
        }

        public void onError(Throwable th) {
            this.f5984d = DisposableHelper.DISPOSED;
            this.actual.onError(th);
        }

        public void onComplete() {
            this.f5984d = DisposableHelper.DISPOSED;
            this.actual.onSuccess(Long.valueOf(this.count));
        }
    }
}
