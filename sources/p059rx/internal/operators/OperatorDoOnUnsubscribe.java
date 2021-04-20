package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Subscriber;
import p059rx.functions.Action0;
import p059rx.observers.Subscribers;
import p059rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorDoOnUnsubscribe */
public class OperatorDoOnUnsubscribe<T> implements Observable.Operator<T, T> {
    private final Action0 unsubscribe;

    public OperatorDoOnUnsubscribe(Action0 action0) {
        this.unsubscribe = action0;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        subscriber.add(Subscriptions.create(this.unsubscribe));
        return Subscribers.wrap(subscriber);
    }
}
