package p046io.reactivex.internal.operators.maybe;

import p046io.reactivex.MaybeObserver;
import p046io.reactivex.MaybeSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Predicate;
import p046io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeFilter */
public final class MaybeFilter<T> extends AbstractMaybeWithUpstream<T, T> {
    final Predicate<? super T> predicate;

    public MaybeFilter(MaybeSource<T> maybeSource, Predicate<? super T> predicate2) {
        super(maybeSource);
        this.predicate = predicate2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new FilterMaybeObserver(maybeObserver, this.predicate));
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFilter$FilterMaybeObserver */
    static final class FilterMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        final MaybeObserver<? super T> actual;

        /* renamed from: d */
        Disposable f5936d;
        final Predicate<? super T> predicate;

        FilterMaybeObserver(MaybeObserver<? super T> maybeObserver, Predicate<? super T> predicate2) {
            this.actual = maybeObserver;
            this.predicate = predicate2;
        }

        public void dispose() {
            Disposable disposable = this.f5936d;
            this.f5936d = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f5936d.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5936d, disposable)) {
                this.f5936d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                if (this.predicate.test(t)) {
                    this.actual.onSuccess(t);
                } else {
                    this.actual.onComplete();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.actual.onError(th);
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
