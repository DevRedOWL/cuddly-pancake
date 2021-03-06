package p059rx.internal.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import p059rx.Subscription;
import p059rx.exceptions.Exceptions;
import p059rx.functions.Cancellable;
import p059rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.subscriptions.CancellableSubscription */
public final class CancellableSubscription extends AtomicReference<Cancellable> implements Subscription {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableSubscription(Cancellable cancellable) {
        super(cancellable);
    }

    public boolean isUnsubscribed() {
        return get() == null;
    }

    public void unsubscribe() {
        Cancellable cancellable;
        if (get() != null && (cancellable = (Cancellable) getAndSet((Object) null)) != null) {
            try {
                cancellable.cancel();
            } catch (Exception e) {
                Exceptions.throwIfFatal(e);
                RxJavaHooks.onError(e);
            }
        }
    }
}
