package p046io.reactivex.internal.operators.observable;

import p046io.reactivex.Observable;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;
import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Predicate;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.fuseable.FuseToObservable;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.ObservableAnySingle */
public final class ObservableAnySingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {
    final Predicate<? super T> predicate;
    final ObservableSource<T> source;

    public ObservableAnySingle(ObservableSource<T> observableSource, Predicate<? super T> predicate2) {
        this.source = observableSource;
        this.predicate = predicate2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.source.subscribe(new AnyObserver(singleObserver, this.predicate));
    }

    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableAny(this.source, this.predicate));
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAnySingle$AnyObserver */
    static final class AnyObserver<T> implements Observer<T>, Disposable {
        final SingleObserver<? super Boolean> actual;
        boolean done;
        final Predicate<? super T> predicate;

        /* renamed from: s */
        Disposable f5964s;

        AnyObserver(SingleObserver<? super Boolean> singleObserver, Predicate<? super T> predicate2) {
            this.actual = singleObserver;
            this.predicate = predicate2;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5964s, disposable)) {
                this.f5964s = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    if (this.predicate.test(t)) {
                        this.done = true;
                        this.f5964s.dispose();
                        this.actual.onSuccess(true);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f5964s.dispose();
                    onError(th);
                }
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
                this.actual.onSuccess(false);
            }
        }

        public void dispose() {
            this.f5964s.dispose();
        }

        public boolean isDisposed() {
            return this.f5964s.isDisposed();
        }
    }
}
