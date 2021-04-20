package p046io.reactivex.internal.operators.flowable;

import java.util.concurrent.TimeUnit;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.Scheduler;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;
import p046io.reactivex.subscribers.SerializedSubscriber;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    public FlowableDelay(Flowable<T> flowable, long j, TimeUnit timeUnit, Scheduler scheduler2, boolean z) {
        super(flowable);
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.delayError = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber;
        if (this.delayError) {
            serializedSubscriber = subscriber;
        } else {
            serializedSubscriber = new SerializedSubscriber(subscriber);
        }
        this.source.subscribe(new DelaySubscriber(serializedSubscriber, this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber */
    static final class DelaySubscriber<T> implements FlowableSubscriber<T>, Subscription {
        final Subscriber<? super T> actual;
        final long delay;
        final boolean delayError;

        /* renamed from: s */
        Subscription f5830s;
        final TimeUnit unit;

        /* renamed from: w */
        final Scheduler.Worker f5831w;

        DelaySubscriber(Subscriber<? super T> subscriber, long j, TimeUnit timeUnit, Scheduler.Worker worker, boolean z) {
            this.actual = subscriber;
            this.delay = j;
            this.unit = timeUnit;
            this.f5831w = worker;
            this.delayError = z;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f5830s, subscription)) {
                this.f5830s = subscription;
                this.actual.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f5831w.schedule(new OnNext(t), this.delay, this.unit);
        }

        public void onError(Throwable th) {
            this.f5831w.schedule(new OnError(th), this.delayError ? this.delay : 0, this.unit);
        }

        public void onComplete() {
            this.f5831w.schedule(new OnComplete(), this.delay, this.unit);
        }

        public void request(long j) {
            this.f5830s.request(j);
        }

        public void cancel() {
            this.f5830s.cancel();
            this.f5831w.dispose();
        }

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber$OnNext */
        final class OnNext implements Runnable {

            /* renamed from: t */
            private final T f5833t;

            OnNext(T t) {
                this.f5833t = t;
            }

            public void run() {
                DelaySubscriber.this.actual.onNext(this.f5833t);
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber$OnError */
        final class OnError implements Runnable {

            /* renamed from: t */
            private final Throwable f5832t;

            OnError(Throwable th) {
                this.f5832t = th;
            }

            public void run() {
                try {
                    DelaySubscriber.this.actual.onError(this.f5832t);
                } finally {
                    DelaySubscriber.this.f5831w.dispose();
                }
            }
        }

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableDelay$DelaySubscriber$OnComplete */
        final class OnComplete implements Runnable {
            OnComplete() {
            }

            public void run() {
                try {
                    DelaySubscriber.this.actual.onComplete();
                } finally {
                    DelaySubscriber.this.f5831w.dispose();
                }
            }
        }
    }
}
