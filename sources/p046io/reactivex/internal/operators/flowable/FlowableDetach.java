package p046io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;
import p046io.reactivex.internal.util.EmptyComponent;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableDetach */
public final class FlowableDetach<T> extends AbstractFlowableWithUpstream<T, T> {
    public FlowableDetach(Flowable<T> flowable) {
        super(flowable);
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new DetachSubscriber(subscriber));
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDetach$DetachSubscriber */
    static final class DetachSubscriber<T> implements FlowableSubscriber<T>, Subscription {
        Subscriber<? super T> actual;

        /* renamed from: s */
        Subscription f5836s;

        DetachSubscriber(Subscriber<? super T> subscriber) {
            this.actual = subscriber;
        }

        public void request(long j) {
            this.f5836s.request(j);
        }

        public void cancel() {
            Subscription subscription = this.f5836s;
            this.f5836s = EmptyComponent.INSTANCE;
            this.actual = EmptyComponent.asSubscriber();
            subscription.cancel();
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f5836s, subscription)) {
                this.f5836s = subscription;
                this.actual.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.actual.onNext(t);
        }

        public void onError(Throwable th) {
            Subscriber<? super T> subscriber = this.actual;
            this.f5836s = EmptyComponent.INSTANCE;
            this.actual = EmptyComponent.asSubscriber();
            subscriber.onError(th);
        }

        public void onComplete() {
            Subscriber<? super T> subscriber = this.actual;
            this.f5836s = EmptyComponent.INSTANCE;
            this.actual = EmptyComponent.asSubscriber();
            subscriber.onComplete();
        }
    }
}
