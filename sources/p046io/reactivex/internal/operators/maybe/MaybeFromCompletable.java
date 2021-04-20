package p046io.reactivex.internal.operators.maybe;

import p046io.reactivex.CompletableObserver;
import p046io.reactivex.CompletableSource;
import p046io.reactivex.Maybe;
import p046io.reactivex.MaybeObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.fuseable.HasUpstreamCompletableSource;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeFromCompletable */
public final class MaybeFromCompletable<T> extends Maybe<T> implements HasUpstreamCompletableSource {
    final CompletableSource source;

    public MaybeFromCompletable(CompletableSource completableSource) {
        this.source = completableSource;
    }

    public CompletableSource source() {
        return this.source;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new FromCompletableObserver(maybeObserver));
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFromCompletable$FromCompletableObserver */
    static final class FromCompletableObserver<T> implements CompletableObserver, Disposable {
        final MaybeObserver<? super T> actual;

        /* renamed from: d */
        Disposable f5944d;

        FromCompletableObserver(MaybeObserver<? super T> maybeObserver) {
            this.actual = maybeObserver;
        }

        public void dispose() {
            this.f5944d.dispose();
            this.f5944d = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f5944d.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5944d, disposable)) {
                this.f5944d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onComplete() {
            this.f5944d = DisposableHelper.DISPOSED;
            this.actual.onComplete();
        }

        public void onError(Throwable th) {
            this.f5944d = DisposableHelper.DISPOSED;
            this.actual.onError(th);
        }
    }
}
