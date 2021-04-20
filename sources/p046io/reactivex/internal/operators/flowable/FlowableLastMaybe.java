package p046io.reactivex.internal.operators.flowable;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.Maybe;
import p046io.reactivex.MaybeObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableLastMaybe */
public final class FlowableLastMaybe<T> extends Maybe<T> {
    final Publisher<T> source;

    public FlowableLastMaybe(Publisher<T> publisher) {
        this.source = publisher;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new LastSubscriber(maybeObserver));
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableLastMaybe$LastSubscriber */
    static final class LastSubscriber<T> implements FlowableSubscriber<T>, Disposable {
        final MaybeObserver<? super T> actual;
        T item;

        /* renamed from: s */
        Subscription f5859s;

        LastSubscriber(MaybeObserver<? super T> maybeObserver) {
            this.actual = maybeObserver;
        }

        public void dispose() {
            this.f5859s.cancel();
            this.f5859s = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f5859s == SubscriptionHelper.CANCELLED;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f5859s, subscription)) {
                this.f5859s = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            this.item = t;
        }

        public void onError(Throwable th) {
            this.f5859s = SubscriptionHelper.CANCELLED;
            this.item = null;
            this.actual.onError(th);
        }

        public void onComplete() {
            this.f5859s = SubscriptionHelper.CANCELLED;
            T t = this.item;
            if (t != null) {
                this.item = null;
                this.actual.onSuccess(t);
                return;
            }
            this.actual.onComplete();
        }
    }
}
