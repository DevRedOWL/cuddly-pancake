package p046io.reactivex.internal.operators.flowable;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p046io.reactivex.Flowable;
import p046io.reactivex.Observable;
import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.flowable.FlowableFromObservable */
public final class FlowableFromObservable<T> extends Flowable<T> {
    private final Observable<T> upstream;

    public FlowableFromObservable(Observable<T> observable) {
        this.upstream = observable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.upstream.subscribe(new SubscriberObserver(subscriber));
    }

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableFromObservable$SubscriberObserver */
    static class SubscriberObserver<T> implements Observer<T>, Subscription {

        /* renamed from: d */
        private Disposable f5852d;

        /* renamed from: s */
        private final Subscriber<? super T> f5853s;

        public void request(long j) {
        }

        SubscriberObserver(Subscriber<? super T> subscriber) {
            this.f5853s = subscriber;
        }

        public void onComplete() {
            this.f5853s.onComplete();
        }

        public void onError(Throwable th) {
            this.f5853s.onError(th);
        }

        public void onNext(T t) {
            this.f5853s.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            this.f5852d = disposable;
            this.f5853s.onSubscribe(this);
        }

        public void cancel() {
            this.f5852d.dispose();
        }
    }
}
