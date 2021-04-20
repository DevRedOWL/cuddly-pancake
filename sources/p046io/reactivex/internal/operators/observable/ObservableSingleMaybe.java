package p046io.reactivex.internal.operators.observable;

import p046io.reactivex.Maybe;
import p046io.reactivex.MaybeObserver;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.ObservableSingleMaybe */
public final class ObservableSingleMaybe<T> extends Maybe<T> {
    final ObservableSource<T> source;

    public ObservableSingleMaybe(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }

    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new SingleElementObserver(maybeObserver));
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSingleMaybe$SingleElementObserver */
    static final class SingleElementObserver<T> implements Observer<T>, Disposable {
        final MaybeObserver<? super T> actual;
        boolean done;

        /* renamed from: s */
        Disposable f6037s;
        T value;

        SingleElementObserver(MaybeObserver<? super T> maybeObserver) {
            this.actual = maybeObserver;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f6037s, disposable)) {
                this.f6037s = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f6037s.dispose();
        }

        public boolean isDisposed() {
            return this.f6037s.isDisposed();
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.value != null) {
                    this.done = true;
                    this.f6037s.dispose();
                    this.actual.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.value = t;
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.actual.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                T t = this.value;
                this.value = null;
                if (t == null) {
                    this.actual.onComplete();
                } else {
                    this.actual.onSuccess(t);
                }
            }
        }
    }
}
