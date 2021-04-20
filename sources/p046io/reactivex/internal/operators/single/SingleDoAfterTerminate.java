package p046io.reactivex.internal.operators.single;

import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Action;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.single.SingleDoAfterTerminate */
public final class SingleDoAfterTerminate<T> extends Single<T> {
    final Action onAfterTerminate;
    final SingleSource<T> source;

    public SingleDoAfterTerminate(SingleSource<T> singleSource, Action action) {
        this.source = singleSource;
        this.onAfterTerminate = action;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new DoAfterTerminateObserver(singleObserver, this.onAfterTerminate));
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleDoAfterTerminate$DoAfterTerminateObserver */
    static final class DoAfterTerminateObserver<T> implements SingleObserver<T>, Disposable {
        final SingleObserver<? super T> actual;

        /* renamed from: d */
        Disposable f6102d;
        final Action onAfterTerminate;

        DoAfterTerminateObserver(SingleObserver<? super T> singleObserver, Action action) {
            this.actual = singleObserver;
            this.onAfterTerminate = action;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f6102d, disposable)) {
                this.f6102d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.actual.onSuccess(t);
            onAfterTerminate();
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
            onAfterTerminate();
        }

        public void dispose() {
            this.f6102d.dispose();
        }

        public boolean isDisposed() {
            return this.f6102d.isDisposed();
        }

        private void onAfterTerminate() {
            try {
                this.onAfterTerminate.run();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(th);
            }
        }
    }
}
