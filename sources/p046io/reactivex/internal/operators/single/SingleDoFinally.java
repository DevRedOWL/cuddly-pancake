package p046io.reactivex.internal.operators.single;

import java.util.concurrent.atomic.AtomicInteger;
import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Action;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.single.SingleDoFinally */
public final class SingleDoFinally<T> extends Single<T> {
    final Action onFinally;
    final SingleSource<T> source;

    public SingleDoFinally(SingleSource<T> singleSource, Action action) {
        this.source = singleSource;
        this.onFinally = action;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new DoFinallyObserver(singleObserver, this.onFinally));
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleDoFinally$DoFinallyObserver */
    static final class DoFinallyObserver<T> extends AtomicInteger implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        final SingleObserver<? super T> actual;

        /* renamed from: d */
        Disposable f6103d;
        final Action onFinally;

        DoFinallyObserver(SingleObserver<? super T> singleObserver, Action action) {
            this.actual = singleObserver;
            this.onFinally = action;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f6103d, disposable)) {
                this.f6103d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.actual.onSuccess(t);
            runFinally();
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
            runFinally();
        }

        public void dispose() {
            this.f6103d.dispose();
            runFinally();
        }

        public boolean isDisposed() {
            return this.f6103d.isDisposed();
        }

        /* access modifiers changed from: package-private */
        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
