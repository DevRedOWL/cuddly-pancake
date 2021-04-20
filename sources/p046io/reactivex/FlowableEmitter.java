package p046io.reactivex;

import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.functions.Cancellable;

/* renamed from: io.reactivex.FlowableEmitter */
public interface FlowableEmitter<T> extends Emitter<T> {
    boolean isCancelled();

    long requested();

    FlowableEmitter<T> serialize();

    void setCancellable(Cancellable cancellable);

    void setDisposable(Disposable disposable);

    boolean tryOnError(Throwable th);
}
