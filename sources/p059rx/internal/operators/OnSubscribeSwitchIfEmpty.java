package p059rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p059rx.Observable;
import p059rx.Producer;
import p059rx.Subscriber;
import p059rx.internal.producers.ProducerArbiter;
import p059rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OnSubscribeSwitchIfEmpty */
public final class OnSubscribeSwitchIfEmpty<T> implements Observable.OnSubscribe<T> {
    final Observable<? extends T> alternate;
    final Observable<? extends T> source;

    public OnSubscribeSwitchIfEmpty(Observable<? extends T> observable, Observable<? extends T> observable2) {
        this.source = observable;
        this.alternate = observable2;
    }

    public void call(Subscriber<? super T> subscriber) {
        SerialSubscription serialSubscription = new SerialSubscription();
        ProducerArbiter producerArbiter = new ProducerArbiter();
        ParentSubscriber parentSubscriber = new ParentSubscriber(subscriber, serialSubscription, producerArbiter, this.alternate);
        serialSubscription.set(parentSubscriber);
        subscriber.add(serialSubscription);
        subscriber.setProducer(producerArbiter);
        parentSubscriber.subscribe(this.source);
    }

    /* renamed from: rx.internal.operators.OnSubscribeSwitchIfEmpty$ParentSubscriber */
    static final class ParentSubscriber<T> extends Subscriber<T> {
        volatile boolean active;
        private final Observable<? extends T> alternate;
        private final ProducerArbiter arbiter;
        private final Subscriber<? super T> child;
        private boolean empty = true;
        private final SerialSubscription serial;
        final AtomicInteger wip;

        ParentSubscriber(Subscriber<? super T> subscriber, SerialSubscription serialSubscription, ProducerArbiter producerArbiter, Observable<? extends T> observable) {
            this.child = subscriber;
            this.serial = serialSubscription;
            this.arbiter = producerArbiter;
            this.alternate = observable;
            this.wip = new AtomicInteger();
        }

        public void setProducer(Producer producer) {
            this.arbiter.setProducer(producer);
        }

        public void onCompleted() {
            if (!this.empty) {
                this.child.onCompleted();
            } else if (!this.child.isUnsubscribed()) {
                this.active = false;
                subscribe((Observable) null);
            }
        }

        /* access modifiers changed from: package-private */
        public void subscribe(Observable<? extends T> observable) {
            if (this.wip.getAndIncrement() == 0) {
                while (!this.child.isUnsubscribed()) {
                    if (!this.active) {
                        if (observable == null) {
                            AlternateSubscriber alternateSubscriber = new AlternateSubscriber(this.child, this.arbiter);
                            this.serial.set(alternateSubscriber);
                            this.active = true;
                            this.alternate.unsafeSubscribe(alternateSubscriber);
                        } else {
                            this.active = true;
                            observable.unsafeSubscribe(this);
                            observable = null;
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void onError(Throwable th) {
            this.child.onError(th);
        }

        public void onNext(T t) {
            this.empty = false;
            this.child.onNext(t);
            this.arbiter.produced(1);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeSwitchIfEmpty$AlternateSubscriber */
    static final class AlternateSubscriber<T> extends Subscriber<T> {
        private final ProducerArbiter arbiter;
        private final Subscriber<? super T> child;

        AlternateSubscriber(Subscriber<? super T> subscriber, ProducerArbiter producerArbiter) {
            this.child = subscriber;
            this.arbiter = producerArbiter;
        }

        public void setProducer(Producer producer) {
            this.arbiter.setProducer(producer);
        }

        public void onCompleted() {
            this.child.onCompleted();
        }

        public void onError(Throwable th) {
            this.child.onError(th);
        }

        public void onNext(T t) {
            this.child.onNext(t);
            this.arbiter.produced(1);
        }
    }
}
