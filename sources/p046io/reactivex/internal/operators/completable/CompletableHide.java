package p046io.reactivex.internal.operators.completable;

import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.CompletableSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.completable.CompletableHide */
public final class CompletableHide extends Completable {
    final CompletableSource source;

    public CompletableHide(CompletableSource completableSource) {
        this.source = completableSource;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(new HideCompletableObserver(completableObserver));
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableHide$HideCompletableObserver */
    static final class HideCompletableObserver implements CompletableObserver, Disposable {
        final CompletableObserver actual;

        /* renamed from: d */
        Disposable f5797d;

        HideCompletableObserver(CompletableObserver completableObserver) {
            this.actual = completableObserver;
        }

        public void dispose() {
            this.f5797d.dispose();
            this.f5797d = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f5797d.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5797d, disposable)) {
                this.f5797d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        public void onComplete() {
            this.actual.onComplete();
        }
    }
}
