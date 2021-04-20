package p046io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Predicate;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate */
public final class FlowableTakeUntilPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    final Predicate<? super T> predicate;

    public FlowableTakeUntilPredicate(Flowable<T> flowable, Predicate<? super T> predicate2) {
        super(flowable);
        this.predicate = predicate2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new InnerSubscriber(subscriber, this.predicate));
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate$InnerSubscriber */
    static final class InnerSubscriber<T> implements FlowableSubscriber<T>, Subscription {
        final Subscriber<? super T> actual;
        boolean done;
        final Predicate<? super T> predicate;

        /* renamed from: s */
        Subscription f5904s;

        InnerSubscriber(Subscriber<? super T> subscriber, Predicate<? super T> predicate2) {
            this.actual = subscriber;
            this.predicate = predicate2;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f5904s, subscription)) {
                this.f5904s = subscription;
                this.actual.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                this.actual.onNext(t);
                try {
                    if (this.predicate.test(t)) {
                        this.done = true;
                        this.f5904s.cancel();
                        this.actual.onComplete();
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f5904s.cancel();
                    onError(th);
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.actual.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.actual.onComplete();
            }
        }

        public void request(long j) {
            this.f5904s.request(j);
        }

        public void cancel() {
            this.f5904s.cancel();
        }
    }
}
