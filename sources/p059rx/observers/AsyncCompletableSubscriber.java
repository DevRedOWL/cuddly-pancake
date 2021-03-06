package p059rx.observers;

import java.util.concurrent.atomic.AtomicReference;
import p059rx.CompletableSubscriber;
import p059rx.Subscription;
import p059rx.plugins.RxJavaHooks;

/* renamed from: rx.observers.AsyncCompletableSubscriber */
public abstract class AsyncCompletableSubscriber implements CompletableSubscriber, Subscription {
    static final Unsubscribed UNSUBSCRIBED = new Unsubscribed();
    private final AtomicReference<Subscription> upstream = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void onSubscribe(Subscription subscription) {
        if (!this.upstream.compareAndSet((Object) null, subscription)) {
            subscription.unsubscribe();
            if (this.upstream.get() != UNSUBSCRIBED) {
                RxJavaHooks.onError(new IllegalStateException("Subscription already set!"));
                return;
            }
            return;
        }
        onStart();
    }

    public final boolean isUnsubscribed() {
        return this.upstream.get() == UNSUBSCRIBED;
    }

    /* access modifiers changed from: protected */
    public final void clear() {
        this.upstream.set(UNSUBSCRIBED);
    }

    public final void unsubscribe() {
        Subscription andSet;
        Subscription subscription = this.upstream.get();
        Unsubscribed unsubscribed = UNSUBSCRIBED;
        if (subscription != unsubscribed && (andSet = this.upstream.getAndSet(unsubscribed)) != null && andSet != UNSUBSCRIBED) {
            andSet.unsubscribe();
        }
    }

    /* renamed from: rx.observers.AsyncCompletableSubscriber$Unsubscribed */
    static final class Unsubscribed implements Subscription {
        public boolean isUnsubscribed() {
            return true;
        }

        public void unsubscribe() {
        }

        Unsubscribed() {
        }
    }
}
