package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Observer;
import p059rx.Subscriber;
import p059rx.exceptions.Exceptions;
import p059rx.functions.Func1;
import p059rx.internal.operators.OperatorDebounceWithTime;
import p059rx.observers.SerializedSubscriber;
import p059rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OperatorDebounceWithSelector */
public final class OperatorDebounceWithSelector<T, U> implements Observable.Operator<T, T> {
    final Func1<? super T, ? extends Observable<U>> selector;

    public OperatorDebounceWithSelector(Func1<? super T, ? extends Observable<U>> func1) {
        this.selector = func1;
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        final SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        final SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        return new Subscriber<T>(subscriber) {
            final Subscriber<?> self = this;
            final OperatorDebounceWithTime.DebounceState<T> state = new OperatorDebounceWithTime.DebounceState<>();

            public void onStart() {
                request(Long.MAX_VALUE);
            }

            public void onNext(T t) {
                try {
                    Observable observable = (Observable) OperatorDebounceWithSelector.this.selector.call(t);
                    final int next = this.state.next(t);
                    C62821 r1 = new Subscriber<U>() {
                        public void onNext(U u) {
                            onCompleted();
                        }

                        public void onError(Throwable th) {
                            C62811.this.self.onError(th);
                        }

                        public void onCompleted() {
                            C62811.this.state.emit(next, serializedSubscriber, C62811.this.self);
                            unsubscribe();
                        }
                    };
                    serialSubscription.set(r1);
                    observable.unsafeSubscribe(r1);
                } catch (Throwable th) {
                    Exceptions.throwOrReport(th, (Observer<?>) this);
                }
            }

            public void onError(Throwable th) {
                serializedSubscriber.onError(th);
                unsubscribe();
                this.state.clear();
            }

            public void onCompleted() {
                this.state.emitAndComplete(serializedSubscriber, this);
            }
        };
    }
}
