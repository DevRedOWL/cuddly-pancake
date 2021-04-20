package p059rx;

import p059rx.internal.util.SubscriptionList;

/* renamed from: rx.SingleSubscriber */
public abstract class SingleSubscriber<T> implements Subscription {

    /* renamed from: cs */
    private final SubscriptionList f6957cs = new SubscriptionList();

    public abstract void onError(Throwable th);

    public abstract void onSuccess(T t);

    public final void add(Subscription subscription) {
        this.f6957cs.add(subscription);
    }

    public final void unsubscribe() {
        this.f6957cs.unsubscribe();
    }

    public final boolean isUnsubscribed() {
        return this.f6957cs.isUnsubscribed();
    }
}
