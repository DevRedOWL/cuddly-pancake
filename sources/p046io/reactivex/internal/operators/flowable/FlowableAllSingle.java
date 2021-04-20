package p046io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscription;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Predicate;
import p046io.reactivex.internal.fuseable.FuseToFlowable;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableAllSingle */
public final class FlowableAllSingle<T> extends Single<Boolean> implements FuseToFlowable<Boolean> {
    final Predicate<? super T> predicate;
    final Flowable<T> source;

    public FlowableAllSingle(Flowable<T> flowable, Predicate<? super T> predicate2) {
        this.source = flowable;
        this.predicate = predicate2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.source.subscribe(new AllSubscriber(singleObserver, this.predicate));
    }

    public Flowable<Boolean> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableAll(this.source, this.predicate));
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableAllSingle$AllSubscriber */
    static final class AllSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        final SingleObserver<? super Boolean> actual;
        boolean done;
        final Predicate<? super T> predicate;

        /* renamed from: s */
        Subscription f5807s;

        AllSubscriber(SingleObserver<? super Boolean> singleObserver, Predicate<? super T> predicate2) {
            this.actual = singleObserver;
            this.predicate = predicate2;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f5807s, subscription)) {
                this.f5807s = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    if (!this.predicate.test(t)) {
                        this.done = true;
                        this.f5807s.cancel();
                        this.f5807s = SubscriptionHelper.CANCELLED;
                        this.actual.onSuccess(false);
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.f5807s.cancel();
                    this.f5807s = SubscriptionHelper.CANCELLED;
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
            this.f5807s = SubscriptionHelper.CANCELLED;
            this.actual.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.f5807s = SubscriptionHelper.CANCELLED;
                this.actual.onSuccess(true);
            }
        }

        public void dispose() {
            this.f5807s.cancel();
            this.f5807s = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f5807s == SubscriptionHelper.CANCELLED;
        }
    }
}
