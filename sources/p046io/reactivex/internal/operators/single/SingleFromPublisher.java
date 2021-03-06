package p046io.reactivex.internal.operators.single;

import java.util.NoSuchElementException;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.single.SingleFromPublisher */
public final class SingleFromPublisher<T> extends Single<T> {
    final Publisher<? extends T> publisher;

    public SingleFromPublisher(Publisher<? extends T> publisher2) {
        this.publisher = publisher2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.publisher.subscribe(new ToSingleObserver(singleObserver));
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleFromPublisher$ToSingleObserver */
    static final class ToSingleObserver<T> implements FlowableSubscriber<T>, Disposable {
        final SingleObserver<? super T> actual;
        volatile boolean disposed;
        boolean done;

        /* renamed from: s */
        Subscription f6113s;
        T value;

        ToSingleObserver(SingleObserver<? super T> singleObserver) {
            this.actual = singleObserver;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f6113s, subscription)) {
                this.f6113s = subscription;
                this.actual.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        public void onNext(T t) {
            if (!this.done) {
                if (this.value != null) {
                    this.f6113s.cancel();
                    this.done = true;
                    this.value = null;
                    this.actual.onError(new IndexOutOfBoundsException("Too many elements in the Publisher"));
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
            this.value = null;
            this.actual.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                T t = this.value;
                this.value = null;
                if (t == null) {
                    this.actual.onError(new NoSuchElementException("The source Publisher is empty"));
                } else {
                    this.actual.onSuccess(t);
                }
            }
        }

        public boolean isDisposed() {
            return this.disposed;
        }

        public void dispose() {
            this.disposed = true;
            this.f6113s.cancel();
        }
    }
}
