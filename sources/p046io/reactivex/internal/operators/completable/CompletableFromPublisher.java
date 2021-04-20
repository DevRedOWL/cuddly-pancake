package p046io.reactivex.internal.operators.completable;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;

/* renamed from: io.reactivex.internal.operators.completable.CompletableFromPublisher */
public final class CompletableFromPublisher<T> extends Completable {
    final Publisher<T> flowable;

    public CompletableFromPublisher(Publisher<T> publisher) {
        this.flowable = publisher;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        this.flowable.subscribe(new FromPublisherSubscriber(completableObserver));
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableFromPublisher$FromPublisherSubscriber */
    static final class FromPublisherSubscriber<T> implements FlowableSubscriber<T>, Disposable {

        /* renamed from: cs */
        final CompletableObserver f5794cs;

        /* renamed from: s */
        Subscription f5795s;

        public void onNext(T t) {
        }

        FromPublisherSubscriber(CompletableObserver completableObserver) {
            this.f5794cs = completableObserver;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f5795s, subscription)) {
                this.f5795s = subscription;
                this.f5794cs.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void onError(Throwable th) {
            this.f5794cs.onError(th);
        }

        public void onComplete() {
            this.f5794cs.onComplete();
        }

        public void dispose() {
            this.f5795s.cancel();
            this.f5795s = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f5795s == SubscriptionHelper.CANCELLED;
        }
    }
}
