package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Subscriber;

/* renamed from: rx.internal.operators.OnSubscribeThrow */
public final class OnSubscribeThrow<T> implements Observable.OnSubscribe<T> {
    private final Throwable exception;

    public OnSubscribeThrow(Throwable th) {
        this.exception = th;
    }

    public void call(Subscriber<? super T> subscriber) {
        subscriber.onError(this.exception);
    }
}
