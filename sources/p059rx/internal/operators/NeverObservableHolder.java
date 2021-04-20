package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Subscriber;

/* renamed from: rx.internal.operators.NeverObservableHolder */
public enum NeverObservableHolder implements Observable.OnSubscribe<Object> {
    INSTANCE;
    
    static final Observable<Object> NEVER = null;

    public void call(Subscriber<? super Object> subscriber) {
    }

    static {
        NeverObservableHolder neverObservableHolder;
        NEVER = Observable.unsafeCreate(neverObservableHolder);
    }

    public static <T> Observable<T> instance() {
        return NEVER;
    }
}
