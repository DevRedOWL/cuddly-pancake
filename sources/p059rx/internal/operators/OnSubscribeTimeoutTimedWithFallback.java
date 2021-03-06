package p059rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p059rx.Observable;
import p059rx.Producer;
import p059rx.Scheduler;
import p059rx.Subscriber;
import p059rx.Subscription;
import p059rx.functions.Action0;
import p059rx.internal.producers.ProducerArbiter;
import p059rx.internal.subscriptions.SequentialSubscription;
import p059rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeTimeoutTimedWithFallback */
public final class OnSubscribeTimeoutTimedWithFallback<T> implements Observable.OnSubscribe<T> {
    final Observable<? extends T> fallback;
    final Scheduler scheduler;
    final Observable<T> source;
    final long timeout;
    final TimeUnit unit;

    public OnSubscribeTimeoutTimedWithFallback(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler2, Observable<? extends T> observable2) {
        this.source = observable;
        this.timeout = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.fallback = observable2;
    }

    public void call(Subscriber<? super T> subscriber) {
        TimeoutMainSubscriber timeoutMainSubscriber = new TimeoutMainSubscriber(subscriber, this.timeout, this.unit, this.scheduler.createWorker(), this.fallback);
        subscriber.add(timeoutMainSubscriber.upstream);
        subscriber.setProducer(timeoutMainSubscriber.arbiter);
        timeoutMainSubscriber.startTimeout(0);
        this.source.subscribe(timeoutMainSubscriber);
    }

    /* renamed from: rx.internal.operators.OnSubscribeTimeoutTimedWithFallback$TimeoutMainSubscriber */
    static final class TimeoutMainSubscriber<T> extends Subscriber<T> {
        final Subscriber<? super T> actual;
        final ProducerArbiter arbiter = new ProducerArbiter();
        long consumed;
        final Observable<? extends T> fallback;
        final AtomicLong index = new AtomicLong();
        final SequentialSubscription task = new SequentialSubscription();
        final long timeout;
        final TimeUnit unit;
        final SequentialSubscription upstream = new SequentialSubscription(this);
        final Scheduler.Worker worker;

        TimeoutMainSubscriber(Subscriber<? super T> subscriber, long j, TimeUnit timeUnit, Scheduler.Worker worker2, Observable<? extends T> observable) {
            this.actual = subscriber;
            this.timeout = j;
            this.unit = timeUnit;
            this.worker = worker2;
            this.fallback = observable;
            add(worker2);
            add(this.task);
        }

        public void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = j + 1;
                if (this.index.compareAndSet(j, j2)) {
                    Subscription subscription = (Subscription) this.task.get();
                    if (subscription != null) {
                        subscription.unsubscribe();
                    }
                    this.consumed++;
                    this.actual.onNext(t);
                    startTimeout(j2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void startTimeout(long j) {
            this.task.replace(this.worker.schedule(new TimeoutTask(j), this.timeout, this.unit));
        }

        public void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.unsubscribe();
                this.actual.onError(th);
                this.worker.unsubscribe();
                return;
            }
            RxJavaHooks.onError(th);
        }

        public void onCompleted() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.unsubscribe();
                this.actual.onCompleted();
                this.worker.unsubscribe();
            }
        }

        public void setProducer(Producer producer) {
            this.arbiter.setProducer(producer);
        }

        /* access modifiers changed from: package-private */
        public void onTimeout(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.fallback == null) {
                    this.actual.onError(new TimeoutException());
                    return;
                }
                long j2 = this.consumed;
                if (j2 != 0) {
                    this.arbiter.produced(j2);
                }
                FallbackSubscriber fallbackSubscriber = new FallbackSubscriber(this.actual, this.arbiter);
                if (this.upstream.replace(fallbackSubscriber)) {
                    this.fallback.subscribe(fallbackSubscriber);
                }
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeTimeoutTimedWithFallback$TimeoutMainSubscriber$TimeoutTask */
        final class TimeoutTask implements Action0 {
            final long idx;

            TimeoutTask(long j) {
                this.idx = j;
            }

            public void call() {
                TimeoutMainSubscriber.this.onTimeout(this.idx);
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeTimeoutTimedWithFallback$FallbackSubscriber */
    static final class FallbackSubscriber<T> extends Subscriber<T> {
        final Subscriber<? super T> actual;
        final ProducerArbiter arbiter;

        FallbackSubscriber(Subscriber<? super T> subscriber, ProducerArbiter producerArbiter) {
            this.actual = subscriber;
            this.arbiter = producerArbiter;
        }

        public void onNext(T t) {
            this.actual.onNext(t);
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        public void onCompleted() {
            this.actual.onCompleted();
        }

        public void setProducer(Producer producer) {
            this.arbiter.setProducer(producer);
        }
    }
}
