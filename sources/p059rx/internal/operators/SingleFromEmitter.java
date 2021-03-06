package p059rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import p059rx.Single;
import p059rx.SingleEmitter;
import p059rx.SingleSubscriber;
import p059rx.Subscription;
import p059rx.exceptions.Exceptions;
import p059rx.functions.Action1;
import p059rx.functions.Cancellable;
import p059rx.internal.subscriptions.CancellableSubscription;
import p059rx.internal.subscriptions.SequentialSubscription;
import p059rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.SingleFromEmitter */
public final class SingleFromEmitter<T> implements Single.OnSubscribe<T> {
    final Action1<SingleEmitter<T>> producer;

    public SingleFromEmitter(Action1<SingleEmitter<T>> action1) {
        this.producer = action1;
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        SingleEmitterImpl singleEmitterImpl = new SingleEmitterImpl(singleSubscriber);
        singleSubscriber.add(singleEmitterImpl);
        try {
            this.producer.call(singleEmitterImpl);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            singleEmitterImpl.onError(th);
        }
    }

    /* renamed from: rx.internal.operators.SingleFromEmitter$SingleEmitterImpl */
    static final class SingleEmitterImpl<T> extends AtomicBoolean implements SingleEmitter<T>, Subscription {
        private static final long serialVersionUID = 8082834163465882809L;
        final SingleSubscriber<? super T> actual;
        final SequentialSubscription resource = new SequentialSubscription();

        SingleEmitterImpl(SingleSubscriber<? super T> singleSubscriber) {
            this.actual = singleSubscriber;
        }

        public void unsubscribe() {
            if (compareAndSet(false, true)) {
                this.resource.unsubscribe();
            }
        }

        public boolean isUnsubscribed() {
            return get();
        }

        public void onSuccess(T t) {
            if (compareAndSet(false, true)) {
                try {
                    this.actual.onSuccess(t);
                } finally {
                    this.resource.unsubscribe();
                }
            }
        }

        public void onError(Throwable th) {
            if (th == null) {
                th = new NullPointerException();
            }
            if (compareAndSet(false, true)) {
                try {
                    this.actual.onError(th);
                } finally {
                    this.resource.unsubscribe();
                }
            } else {
                RxJavaHooks.onError(th);
            }
        }

        public void setSubscription(Subscription subscription) {
            this.resource.update(subscription);
        }

        public void setCancellation(Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }
    }
}
