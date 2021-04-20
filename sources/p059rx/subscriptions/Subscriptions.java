package p059rx.subscriptions;

import java.util.concurrent.Future;
import p059rx.Subscription;
import p059rx.functions.Action0;

/* renamed from: rx.subscriptions.Subscriptions */
public final class Subscriptions {
    private static final Unsubscribed UNSUBSCRIBED = new Unsubscribed();

    private Subscriptions() {
        throw new IllegalStateException("No instances!");
    }

    public static Subscription empty() {
        return BooleanSubscription.create();
    }

    public static Subscription unsubscribed() {
        return UNSUBSCRIBED;
    }

    public static Subscription create(Action0 action0) {
        return BooleanSubscription.create(action0);
    }

    public static Subscription from(Future<?> future) {
        return new FutureSubscription(future);
    }

    /* renamed from: rx.subscriptions.Subscriptions$FutureSubscription */
    static final class FutureSubscription implements Subscription {

        /* renamed from: f */
        final Future<?> f6999f;

        public FutureSubscription(Future<?> future) {
            this.f6999f = future;
        }

        public void unsubscribe() {
            this.f6999f.cancel(true);
        }

        public boolean isUnsubscribed() {
            return this.f6999f.isCancelled();
        }
    }

    public static CompositeSubscription from(Subscription... subscriptionArr) {
        return new CompositeSubscription(subscriptionArr);
    }

    /* renamed from: rx.subscriptions.Subscriptions$Unsubscribed */
    static final class Unsubscribed implements Subscription {
        public boolean isUnsubscribed() {
            return true;
        }

        public void unsubscribe() {
        }

        Unsubscribed() {
        }
    }
}
