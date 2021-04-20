package p046io.reactivex.internal.operators.maybe;

import p046io.reactivex.MaybeObserver;
import p046io.reactivex.MaybeSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeIsEmpty */
public final class MaybeIsEmpty<T> extends AbstractMaybeWithUpstream<T, Boolean> {
    public MaybeIsEmpty(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(MaybeObserver<? super Boolean> maybeObserver) {
        this.source.subscribe(new IsEmptyMaybeObserver(maybeObserver));
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeIsEmpty$IsEmptyMaybeObserver */
    static final class IsEmptyMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        final MaybeObserver<? super Boolean> actual;

        /* renamed from: d */
        Disposable f5949d;

        IsEmptyMaybeObserver(MaybeObserver<? super Boolean> maybeObserver) {
            this.actual = maybeObserver;
        }

        public void dispose() {
            this.f5949d.dispose();
        }

        public boolean isDisposed() {
            return this.f5949d.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5949d, disposable)) {
                this.f5949d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.actual.onSuccess(false);
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        public void onComplete() {
            this.actual.onSuccess(true);
        }
    }
}
