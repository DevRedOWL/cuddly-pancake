package p046io.reactivex.internal.subscribers;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.internal.fuseable.QueueSubscription;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.subscribers.BasicFuseableSubscriber */
public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {
    protected final Subscriber<? super R> actual;
    protected boolean done;

    /* renamed from: qs */
    protected QueueSubscription<T> f6125qs;

    /* renamed from: s */
    protected Subscription f6126s;
    protected int sourceMode;

    /* access modifiers changed from: protected */
    public void afterDownstream() {
    }

    /* access modifiers changed from: protected */
    public boolean beforeDownstream() {
        return true;
    }

    public BasicFuseableSubscriber(Subscriber<? super R> subscriber) {
        this.actual = subscriber;
    }

    public final void onSubscribe(Subscription subscription) {
        if (SubscriptionHelper.validate(this.f6126s, subscription)) {
            this.f6126s = subscription;
            if (subscription instanceof QueueSubscription) {
                this.f6125qs = (QueueSubscription) subscription;
            }
            if (beforeDownstream()) {
                this.actual.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.done = true;
        this.actual.onError(th);
    }

    /* access modifiers changed from: protected */
    public final void fail(Throwable th) {
        Exceptions.throwIfFatal(th);
        this.f6126s.cancel();
        onError(th);
    }

    public void onComplete() {
        if (!this.done) {
            this.done = true;
            this.actual.onComplete();
        }
    }

    /* access modifiers changed from: protected */
    public final int transitiveBoundaryFusion(int i) {
        QueueSubscription<T> queueSubscription = this.f6125qs;
        if (queueSubscription == null || (i & 4) != 0) {
            return 0;
        }
        int requestFusion = queueSubscription.requestFusion(i);
        if (requestFusion != 0) {
            this.sourceMode = requestFusion;
        }
        return requestFusion;
    }

    public void request(long j) {
        this.f6126s.request(j);
    }

    public void cancel() {
        this.f6126s.cancel();
    }

    public boolean isEmpty() {
        return this.f6125qs.isEmpty();
    }

    public void clear() {
        this.f6125qs.clear();
    }

    public final boolean offer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final boolean offer(R r, R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
