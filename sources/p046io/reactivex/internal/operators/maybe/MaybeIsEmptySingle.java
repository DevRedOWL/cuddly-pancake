package p046io.reactivex.internal.operators.maybe;

import p046io.reactivex.Maybe;
import p046io.reactivex.MaybeObserver;
import p046io.reactivex.MaybeSource;
import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.fuseable.FuseToMaybe;
import p046io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeIsEmptySingle */
public final class MaybeIsEmptySingle<T> extends Single<Boolean> implements HasUpstreamMaybeSource<T>, FuseToMaybe<Boolean> {
    final MaybeSource<T> source;

    public MaybeIsEmptySingle(MaybeSource<T> maybeSource) {
        this.source = maybeSource;
    }

    public MaybeSource<T> source() {
        return this.source;
    }

    public Maybe<Boolean> fuseToMaybe() {
        return RxJavaPlugins.onAssembly(new MaybeIsEmpty(this.source));
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.source.subscribe(new IsEmptyMaybeObserver(singleObserver));
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeIsEmptySingle$IsEmptyMaybeObserver */
    static final class IsEmptyMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        final SingleObserver<? super Boolean> actual;

        /* renamed from: d */
        Disposable f5950d;

        IsEmptyMaybeObserver(SingleObserver<? super Boolean> singleObserver) {
            this.actual = singleObserver;
        }

        public void dispose() {
            this.f5950d.dispose();
            this.f5950d = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f5950d.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5950d, disposable)) {
                this.f5950d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f5950d = DisposableHelper.DISPOSED;
            this.actual.onSuccess(false);
        }

        public void onError(Throwable th) {
            this.f5950d = DisposableHelper.DISPOSED;
            this.actual.onError(th);
        }

        public void onComplete() {
            this.f5950d = DisposableHelper.DISPOSED;
            this.actual.onSuccess(true);
        }
    }
}
