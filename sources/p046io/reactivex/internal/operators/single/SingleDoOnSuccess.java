package p046io.reactivex.internal.operators.single;

import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.internal.operators.single.SingleDoOnSuccess */
public final class SingleDoOnSuccess<T> extends Single<T> {
    final Consumer<? super T> onSuccess;
    final SingleSource<T> source;

    public SingleDoOnSuccess(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.source = singleSource;
        this.onSuccess = consumer;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new DoOnSuccess(singleObserver));
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnSuccess$DoOnSuccess */
    final class DoOnSuccess implements SingleObserver<T> {

        /* renamed from: s */
        private final SingleObserver<? super T> f6107s;

        DoOnSuccess(SingleObserver<? super T> singleObserver) {
            this.f6107s = singleObserver;
        }

        public void onSubscribe(Disposable disposable) {
            this.f6107s.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            try {
                SingleDoOnSuccess.this.onSuccess.accept(t);
                this.f6107s.onSuccess(t);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.f6107s.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f6107s.onError(th);
        }
    }
}
