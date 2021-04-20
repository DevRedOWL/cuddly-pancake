package p046io.reactivex.internal.operators.completable;

import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.CompletableSource;
import p046io.reactivex.Scheduler;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.completable.CompletableDisposeOn */
public final class CompletableDisposeOn extends Completable {
    final Scheduler scheduler;
    final CompletableSource source;

    public CompletableDisposeOn(CompletableSource completableSource, Scheduler scheduler2) {
        this.source = completableSource;
        this.scheduler = scheduler2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(new CompletableObserverImplementation(completableObserver, this.scheduler));
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableDisposeOn$CompletableObserverImplementation */
    static final class CompletableObserverImplementation implements CompletableObserver, Disposable, Runnable {

        /* renamed from: d */
        Disposable f5790d;
        volatile boolean disposed;

        /* renamed from: s */
        final CompletableObserver f5791s;
        final Scheduler scheduler;

        CompletableObserverImplementation(CompletableObserver completableObserver, Scheduler scheduler2) {
            this.f5791s = completableObserver;
            this.scheduler = scheduler2;
        }

        public void onComplete() {
            if (!this.disposed) {
                this.f5791s.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.disposed) {
                RxJavaPlugins.onError(th);
            } else {
                this.f5791s.onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5790d, disposable)) {
                this.f5790d = disposable;
                this.f5791s.onSubscribe(this);
            }
        }

        public void dispose() {
            this.disposed = true;
            this.scheduler.scheduleDirect(this);
        }

        public boolean isDisposed() {
            return this.disposed;
        }

        public void run() {
            this.f5790d.dispose();
            this.f5790d = DisposableHelper.DISPOSED;
        }
    }
}
