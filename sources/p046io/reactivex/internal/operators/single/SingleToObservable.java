package p046io.reactivex.internal.operators.single;

import p046io.reactivex.Observable;
import p046io.reactivex.Observer;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.single.SingleToObservable */
public final class SingleToObservable<T> extends Observable<T> {
    final SingleSource<? extends T> source;

    public SingleToObservable(SingleSource<? extends T> singleSource) {
        this.source = singleSource;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new SingleToObservableObserver(observer));
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleToObservable$SingleToObservableObserver */
    static final class SingleToObservableObserver<T> implements SingleObserver<T>, Disposable {
        final Observer<? super T> actual;

        /* renamed from: d */
        Disposable f6117d;

        SingleToObservableObserver(Observer<? super T> observer) {
            this.actual = observer;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f6117d, disposable)) {
                this.f6117d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.actual.onNext(t);
            this.actual.onComplete();
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        public void dispose() {
            this.f6117d.dispose();
        }

        public boolean isDisposed() {
            return this.f6117d.isDisposed();
        }
    }
}
