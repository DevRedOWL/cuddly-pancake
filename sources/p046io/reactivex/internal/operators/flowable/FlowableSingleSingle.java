package p046io.reactivex.internal.operators.flowable;

import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.fuseable.FuseToFlowable;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableSingleSingle */
public final class FlowableSingleSingle<T> extends Single<T> implements FuseToFlowable<T> {
    final T defaultValue;
    final Flowable<T> source;

    public FlowableSingleSingle(Flowable<T> flowable, T t) {
        this.source = flowable;
        this.defaultValue = t;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new SingleElementSubscriber(singleObserver, this.defaultValue));
    }

    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.source, this.defaultValue));
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableSingleSingle$SingleElementSubscriber */
    static final class SingleElementSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        final SingleObserver<? super T> actual;
        final T defaultValue;
        boolean done;

        /* renamed from: s */
        Subscription f5889s;
        T value;

        SingleElementSubscriber(SingleObserver<? super T> singleObserver, T t) {
            this.actual = singleObserver;
            this.defaultValue = t;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f5889s, subscription)) {
                this.f5889s = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.value != null) {
                    this.done = true;
                    this.f5889s.cancel();
                    this.f5889s = SubscriptionHelper.CANCELLED;
                    this.actual.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.value = t;
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.f5889s = SubscriptionHelper.CANCELLED;
            this.actual.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.f5889s = SubscriptionHelper.CANCELLED;
                T t = this.value;
                this.value = null;
                if (t == null) {
                    t = this.defaultValue;
                }
                if (t != null) {
                    this.actual.onSuccess(t);
                } else {
                    this.actual.onError(new NoSuchElementException());
                }
            }
        }

        public void dispose() {
            this.f5889s.cancel();
            this.f5889s = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f5889s == SubscriptionHelper.CANCELLED;
        }
    }
}
