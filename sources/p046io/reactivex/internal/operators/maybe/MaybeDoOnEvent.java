package p046io.reactivex.internal.operators.maybe;

import p046io.reactivex.MaybeObserver;
import p046io.reactivex.MaybeSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.CompositeException;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.BiConsumer;
import p046io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeDoOnEvent */
public final class MaybeDoOnEvent<T> extends AbstractMaybeWithUpstream<T, T> {
    final BiConsumer<? super T, ? super Throwable> onEvent;

    public MaybeDoOnEvent(MaybeSource<T> maybeSource, BiConsumer<? super T, ? super Throwable> biConsumer) {
        super(maybeSource);
        this.onEvent = biConsumer;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new DoOnEventMaybeObserver(maybeObserver, this.onEvent));
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeDoOnEvent$DoOnEventMaybeObserver */
    static final class DoOnEventMaybeObserver<T> implements MaybeObserver<T>, Disposable {
        final MaybeObserver<? super T> actual;

        /* renamed from: d */
        Disposable f5935d;
        final BiConsumer<? super T, ? super Throwable> onEvent;

        DoOnEventMaybeObserver(MaybeObserver<? super T> maybeObserver, BiConsumer<? super T, ? super Throwable> biConsumer) {
            this.actual = maybeObserver;
            this.onEvent = biConsumer;
        }

        public void dispose() {
            this.f5935d.dispose();
            this.f5935d = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f5935d.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5935d, disposable)) {
                this.f5935d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f5935d = DisposableHelper.DISPOSED;
            try {
                this.onEvent.accept(t, null);
                this.actual.onSuccess(t);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.actual.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f5935d = DisposableHelper.DISPOSED;
            try {
                this.onEvent.accept(null, th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                th = new CompositeException(th, th2);
            }
            this.actual.onError(th);
        }

        public void onComplete() {
            this.f5935d = DisposableHelper.DISPOSED;
            try {
                this.onEvent.accept(null, null);
                this.actual.onComplete();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.actual.onError(th);
            }
        }
    }
}
