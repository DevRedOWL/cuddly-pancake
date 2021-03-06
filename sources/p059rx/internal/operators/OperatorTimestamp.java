package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Scheduler;
import p059rx.Subscriber;
import p059rx.schedulers.Timestamped;

/* renamed from: rx.internal.operators.OperatorTimestamp */
public final class OperatorTimestamp<T> implements Observable.Operator<Timestamped<T>, T> {
    final Scheduler scheduler;

    public OperatorTimestamp(Scheduler scheduler2) {
        this.scheduler = scheduler2;
    }

    public Subscriber<? super T> call(final Subscriber<? super Timestamped<T>> subscriber) {
        return new Subscriber<T>(subscriber) {
            public void onCompleted() {
                subscriber.onCompleted();
            }

            public void onError(Throwable th) {
                subscriber.onError(th);
            }

            public void onNext(T t) {
                subscriber.onNext(new Timestamped(OperatorTimestamp.this.scheduler.now(), t));
            }
        };
    }
}
