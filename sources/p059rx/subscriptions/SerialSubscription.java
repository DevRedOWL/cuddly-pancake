package p059rx.subscriptions;

import p059rx.Subscription;
import p059rx.internal.subscriptions.SequentialSubscription;

/* renamed from: rx.subscriptions.SerialSubscription */
public final class SerialSubscription implements Subscription {
    final SequentialSubscription state = new SequentialSubscription();

    public boolean isUnsubscribed() {
        return this.state.isUnsubscribed();
    }

    public void unsubscribe() {
        this.state.unsubscribe();
    }

    public void set(Subscription subscription) {
        if (subscription != null) {
            this.state.update(subscription);
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }

    public Subscription get() {
        return this.state.current();
    }
}
