package p046io.reactivex.internal.operators.maybe;

import p046io.reactivex.MaybeObserver;
import p046io.reactivex.MaybeSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeDetach */
public final class MaybeDetach<T> extends AbstractMaybeWithUpstream<T, T> {
    public MaybeDetach(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new DetachMaybeObserver(maybeObserver));
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeDetach$DetachMaybeObserver */
    static final class DetachMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        MaybeObserver<? super T> actual;

        /* renamed from: d */
        Disposable f5932d;

        DetachMaybeObserver(MaybeObserver<? super T> maybeObserver) {
            this.actual = maybeObserver;
        }

        public void dispose() {
            this.actual = null;
            this.f5932d.dispose();
            this.f5932d = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f5932d.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5932d, disposable)) {
                this.f5932d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f5932d = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.actual;
            if (maybeObserver != null) {
                this.actual = null;
                maybeObserver.onSuccess(t);
            }
        }

        public void onError(Throwable th) {
            this.f5932d = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.actual;
            if (maybeObserver != null) {
                this.actual = null;
                maybeObserver.onError(th);
            }
        }

        public void onComplete() {
            this.f5932d = DisposableHelper.DISPOSED;
            MaybeObserver<? super T> maybeObserver = this.actual;
            if (maybeObserver != null) {
                this.actual = null;
                maybeObserver.onComplete();
            }
        }
    }
}
