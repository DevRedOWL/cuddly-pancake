package p059rx.observers;

import p059rx.Observer;
import p059rx.Subscriber;

/* renamed from: rx.observers.SerializedSubscriber */
public class SerializedSubscriber<T> extends Subscriber<T> {

    /* renamed from: s */
    private final Observer<T> f6997s;

    public SerializedSubscriber(Subscriber<? super T> subscriber) {
        this(subscriber, true);
    }

    public SerializedSubscriber(Subscriber<? super T> subscriber, boolean z) {
        super(subscriber, z);
        this.f6997s = new SerializedObserver(subscriber);
    }

    public void onCompleted() {
        this.f6997s.onCompleted();
    }

    public void onError(Throwable th) {
        this.f6997s.onError(th);
    }

    public void onNext(T t) {
        this.f6997s.onNext(t);
    }
}
