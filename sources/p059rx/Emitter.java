package p059rx;

import p059rx.functions.Cancellable;

/* renamed from: rx.Emitter */
public interface Emitter<T> extends Observer<T> {

    /* renamed from: rx.Emitter$BackpressureMode */
    public enum BackpressureMode {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST
    }

    long requested();

    void setCancellation(Cancellable cancellable);

    void setSubscription(Subscription subscription);
}
