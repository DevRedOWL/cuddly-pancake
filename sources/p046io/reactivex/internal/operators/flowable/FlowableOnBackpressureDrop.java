package p046io.reactivex.internal.operators.flowable;

import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;
import p046io.reactivex.internal.util.BackpressureHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop */
public final class FlowableOnBackpressureDrop<T> extends AbstractFlowableWithUpstream<T, T> implements Consumer<T> {
    final Consumer<? super T> onDrop;

    public void accept(T t) {
    }

    public FlowableOnBackpressureDrop(Flowable<T> flowable) {
        super(flowable);
        this.onDrop = this;
    }

    public FlowableOnBackpressureDrop(Flowable<T> flowable, Consumer<? super T> consumer) {
        super(flowable);
        this.onDrop = consumer;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new BackpressureDropSubscriber(subscriber, this.onDrop));
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop$BackpressureDropSubscriber */
    static final class BackpressureDropSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -6246093802440953054L;
        final Subscriber<? super T> actual;
        boolean done;
        final Consumer<? super T> onDrop;

        /* renamed from: s */
        Subscription f5865s;

        BackpressureDropSubscriber(Subscriber<? super T> subscriber, Consumer<? super T> consumer) {
            this.actual = subscriber;
            this.onDrop = consumer;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f5865s, subscription)) {
                this.f5865s = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                if (get() != 0) {
                    this.actual.onNext(t);
                    BackpressureHelper.produced(this, 1);
                    return;
                }
                try {
                    this.onDrop.accept(t);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
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

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.actual.onComplete();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this, j);
            }
        }

        public void cancel() {
            this.f5865s.cancel();
        }
    }
}
