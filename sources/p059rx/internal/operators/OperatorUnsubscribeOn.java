package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Producer;
import p059rx.Scheduler;
import p059rx.Subscriber;
import p059rx.functions.Action0;
import p059rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorUnsubscribeOn */
public class OperatorUnsubscribeOn<T> implements Observable.Operator<T, T> {
    final Scheduler scheduler;

    public OperatorUnsubscribeOn(Scheduler scheduler2) {
        this.scheduler = scheduler2;
    }

    public Subscriber<? super T> call(final Subscriber<? super T> subscriber) {
        final C63661 r0 = new Subscriber<T>() {
            public void onCompleted() {
                subscriber.onCompleted();
            }

            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            public void onNext(T t) {
                subscriber.onNext(t);
            }

            public void setProducer(Producer producer) {
                subscriber.setProducer(producer);
            }
        };
        subscriber.add(Subscriptions.create(new Action0() {
            public void call() {
                final Scheduler.Worker createWorker = OperatorUnsubscribeOn.this.scheduler.createWorker();
                createWorker.schedule(new Action0() {
                    public void call() {
                        r0.unsubscribe();
                        createWorker.unsubscribe();
                    }
                });
            }
        }));
        return r0;
    }
}
