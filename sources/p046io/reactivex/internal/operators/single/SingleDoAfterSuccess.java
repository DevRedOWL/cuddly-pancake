package p046io.reactivex.internal.operators.single;

import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.single.SingleDoAfterSuccess */
public final class SingleDoAfterSuccess<T> extends Single<T> {
    final Consumer<? super T> onAfterSuccess;
    final SingleSource<T> source;

    public SingleDoAfterSuccess(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.source = singleSource;
        this.onAfterSuccess = consumer;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new DoAfterObserver(singleObserver, this.onAfterSuccess));
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleDoAfterSuccess$DoAfterObserver */
    static final class DoAfterObserver<T> implements SingleObserver<T>, Disposable {
        final SingleObserver<? super T> actual;

        /* renamed from: d */
        Disposable f6101d;
        final Consumer<? super T> onAfterSuccess;

        DoAfterObserver(SingleObserver<? super T> singleObserver, Consumer<? super T> consumer) {
            this.actual = singleObserver;
            this.onAfterSuccess = consumer;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f6101d, disposable)) {
                this.f6101d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.actual.onSuccess(t);
            try {
                this.onAfterSuccess.accept(t);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        public void dispose() {
            this.f6101d.dispose();
        }

        public boolean isDisposed() {
            return this.f6101d.isDisposed();
        }
    }
}
