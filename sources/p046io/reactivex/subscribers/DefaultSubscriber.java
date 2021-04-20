package p046io.reactivex.subscribers;

import org.reactivestreams.Subscription;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;
import p046io.reactivex.internal.util.EndConsumerHelper;

/* renamed from: io.reactivex.subscribers.DefaultSubscriber */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {

    /* renamed from: s */
    private Subscription f6166s;

    public final void onSubscribe(Subscription subscription) {
        if (EndConsumerHelper.validate(this.f6166s, subscription, getClass())) {
            this.f6166s = subscription;
            onStart();
        }
    }

    /* access modifiers changed from: protected */
    public final void request(long j) {
        Subscription subscription = this.f6166s;
        if (subscription != null) {
            subscription.request(j);
        }
    }

    /* access modifiers changed from: protected */
    public final void cancel() {
        Subscription subscription = this.f6166s;
        this.f6166s = SubscriptionHelper.CANCELLED;
        subscription.cancel();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        request(Long.MAX_VALUE);
    }
}
