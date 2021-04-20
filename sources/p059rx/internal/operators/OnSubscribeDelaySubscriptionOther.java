package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Subscriber;
import p059rx.observers.Subscribers;
import p059rx.plugins.RxJavaHooks;
import p059rx.subscriptions.SerialSubscription;
import p059rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OnSubscribeDelaySubscriptionOther */
public final class OnSubscribeDelaySubscriptionOther<T, U> implements Observable.OnSubscribe<T> {
    final Observable<? extends T> main;
    final Observable<U> other;

    public OnSubscribeDelaySubscriptionOther(Observable<? extends T> observable, Observable<U> observable2) {
        this.main = observable;
        this.other = observable2;
    }

    public void call(Subscriber<? super T> subscriber) {
        final SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        final Subscriber<? super T> wrap = Subscribers.wrap(subscriber);
        C62491 r1 = new Subscriber<U>() {
            boolean done;

            public void onNext(U u) {
                onCompleted();
            }

            public void onError(Throwable th) {
                if (this.done) {
                    RxJavaHooks.onError(th);
                    return;
                }
                this.done = true;
                wrap.onError(th);
            }

            public void onCompleted() {
                if (!this.done) {
                    this.done = true;
                    serialSubscription.set(Subscriptions.unsubscribed());
                    OnSubscribeDelaySubscriptionOther.this.main.unsafeSubscribe(wrap);
                }
            }
        };
        serialSubscription.set(r1);
        this.other.unsafeSubscribe(r1);
    }
}
