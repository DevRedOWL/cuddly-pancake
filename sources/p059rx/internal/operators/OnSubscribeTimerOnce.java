package p059rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p059rx.Observable;
import p059rx.Observer;
import p059rx.Scheduler;
import p059rx.Subscriber;
import p059rx.exceptions.Exceptions;
import p059rx.functions.Action0;

/* renamed from: rx.internal.operators.OnSubscribeTimerOnce */
public final class OnSubscribeTimerOnce implements Observable.OnSubscribe<Long> {
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    public OnSubscribeTimerOnce(long j, TimeUnit timeUnit, Scheduler scheduler2) {
        this.time = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
    }

    public void call(final Subscriber<? super Long> subscriber) {
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        subscriber.add(createWorker);
        createWorker.schedule(new Action0() {
            public void call() {
                try {
                    subscriber.onNext(0L);
                    subscriber.onCompleted();
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, (Observer<?>) subscriber);
                }
            }
        }, this.time, this.unit);
    }
}
