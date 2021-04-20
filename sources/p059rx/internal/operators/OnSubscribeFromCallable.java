package p059rx.internal.operators;

import java.util.concurrent.Callable;
import p059rx.Observable;
import p059rx.Observer;
import p059rx.Subscriber;
import p059rx.exceptions.Exceptions;
import p059rx.internal.producers.SingleDelayedProducer;

/* renamed from: rx.internal.operators.OnSubscribeFromCallable */
public final class OnSubscribeFromCallable<T> implements Observable.OnSubscribe<T> {
    private final Callable<? extends T> resultFactory;

    public OnSubscribeFromCallable(Callable<? extends T> callable) {
        this.resultFactory = callable;
    }

    public void call(Subscriber<? super T> subscriber) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        subscriber.setProducer(singleDelayedProducer);
        try {
            singleDelayedProducer.setValue(this.resultFactory.call());
        } catch (Throwable th) {
            Exceptions.throwOrReport(th, (Observer<?>) subscriber);
        }
    }
}
