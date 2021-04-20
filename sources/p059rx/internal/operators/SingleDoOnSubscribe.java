package p059rx.internal.operators;

import p059rx.Single;
import p059rx.SingleSubscriber;
import p059rx.exceptions.Exceptions;
import p059rx.functions.Action0;

/* renamed from: rx.internal.operators.SingleDoOnSubscribe */
public final class SingleDoOnSubscribe<T> implements Single.OnSubscribe<T> {
    final Action0 onSubscribe;
    final Single.OnSubscribe<T> source;

    public SingleDoOnSubscribe(Single.OnSubscribe<T> onSubscribe2, Action0 action0) {
        this.source = onSubscribe2;
        this.onSubscribe = action0;
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        try {
            this.onSubscribe.call();
            this.source.call(singleSubscriber);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            singleSubscriber.onError(th);
        }
    }
}
