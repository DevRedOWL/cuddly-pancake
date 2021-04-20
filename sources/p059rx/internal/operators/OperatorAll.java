package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Observer;
import p059rx.Subscriber;
import p059rx.exceptions.Exceptions;
import p059rx.functions.Func1;
import p059rx.internal.producers.SingleDelayedProducer;
import p059rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorAll */
public final class OperatorAll<T> implements Observable.Operator<Boolean, T> {
    final Func1<? super T, Boolean> predicate;

    public OperatorAll(Func1<? super T, Boolean> func1) {
        this.predicate = func1;
    }

    public Subscriber<? super T> call(final Subscriber<? super Boolean> subscriber) {
        final SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(subscriber);
        C62711 r1 = new Subscriber<T>() {
            boolean done;

            public void onNext(T t) {
                if (!this.done) {
                    try {
                        if (!OperatorAll.this.predicate.call(t).booleanValue()) {
                            this.done = true;
                            singleDelayedProducer.setValue(false);
                            unsubscribe();
                        }
                    } catch (Throwable th) {
                        Exceptions.throwOrReport(th, (Observer<?>) this, (Object) t);
                    }
                }
            }

            public void onError(Throwable th) {
                if (!this.done) {
                    this.done = true;
                    subscriber.onError(th);
                    return;
                }
                RxJavaHooks.onError(th);
            }

            public void onCompleted() {
                if (!this.done) {
                    this.done = true;
                    singleDelayedProducer.setValue(true);
                }
            }
        };
        subscriber.add(r1);
        subscriber.setProducer(singleDelayedProducer);
        return r1;
    }
}
