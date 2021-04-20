package p046io.reactivex.internal.operators.single;

import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.BiPredicate;

/* renamed from: io.reactivex.internal.operators.single.SingleContains */
public final class SingleContains<T> extends p046io.reactivex.Single<Boolean> {
    final BiPredicate<Object, Object> comparer;
    final SingleSource<T> source;
    final Object value;

    public SingleContains(SingleSource<T> singleSource, Object obj, BiPredicate<Object, Object> biPredicate) {
        this.source = singleSource;
        this.value = obj;
        this.comparer = biPredicate;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.source.subscribe(new Single(singleObserver));
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleContains$Single */
    final class Single implements SingleObserver<T> {

        /* renamed from: s */
        private final SingleObserver<? super Boolean> f6095s;

        Single(SingleObserver<? super Boolean> singleObserver) {
            this.f6095s = singleObserver;
        }

        public void onSubscribe(Disposable disposable) {
            this.f6095s.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            try {
                this.f6095s.onSuccess(Boolean.valueOf(SingleContains.this.comparer.test(t, SingleContains.this.value)));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.f6095s.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f6095s.onError(th);
        }
    }
}
