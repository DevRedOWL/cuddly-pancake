package p046io.reactivex.internal.operators.completable;

import java.util.concurrent.atomic.AtomicInteger;
import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.CompletableSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Action;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.completable.CompletableDoFinally */
public final class CompletableDoFinally extends Completable {
    final Action onFinally;
    final CompletableSource source;

    public CompletableDoFinally(CompletableSource completableSource, Action action) {
        this.source = completableSource;
        this.onFinally = action;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(new DoFinallyObserver(completableObserver, this.onFinally));
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableDoFinally$DoFinallyObserver */
    static final class DoFinallyObserver extends AtomicInteger implements CompletableObserver, Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        final CompletableObserver actual;

        /* renamed from: d */
        Disposable f5792d;
        final Action onFinally;

        DoFinallyObserver(CompletableObserver completableObserver, Action action) {
            this.actual = completableObserver;
            this.onFinally = action;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5792d, disposable)) {
                this.f5792d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
            runFinally();
        }

        public void onComplete() {
            this.actual.onComplete();
            runFinally();
        }

        public void dispose() {
            this.f5792d.dispose();
            runFinally();
        }

        public boolean isDisposed() {
            return this.f5792d.isDisposed();
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
