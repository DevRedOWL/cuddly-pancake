package p059rx.internal.operators;

import java.util.concurrent.Callable;
import p059rx.Single;
import p059rx.SingleSubscriber;
import p059rx.exceptions.Exceptions;

/* renamed from: rx.internal.operators.SingleFromCallable */
public final class SingleFromCallable<T> implements Single.OnSubscribe<T> {
    final Callable<? extends T> callable;

    public SingleFromCallable(Callable<? extends T> callable2) {
        this.callable = callable2;
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        try {
            singleSubscriber.onSuccess(this.callable.call());
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            singleSubscriber.onError(th);
        }
    }
}
