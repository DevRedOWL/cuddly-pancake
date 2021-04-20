package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Observer;
import p059rx.Subscriber;
import p059rx.exceptions.Exceptions;
import p059rx.functions.Func0;
import p059rx.observers.Subscribers;

/* renamed from: rx.internal.operators.OnSubscribeDefer */
public final class OnSubscribeDefer<T> implements Observable.OnSubscribe<T> {
    final Func0<? extends Observable<? extends T>> observableFactory;

    public OnSubscribeDefer(Func0<? extends Observable<? extends T>> func0) {
        this.observableFactory = func0;
    }

    public void call(Subscriber<? super T> subscriber) {
        try {
            ((Observable) this.observableFactory.call()).unsafeSubscribe(Subscribers.wrap(subscriber));
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, (Observer<?>) subscriber);
        }
    }
}
