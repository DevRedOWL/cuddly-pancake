package p046io.reactivex;

import p046io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.SingleObserver */
public interface SingleObserver<T> {
    void onError(Throwable th);

    void onSubscribe(Disposable disposable);

    void onSuccess(T t);
}
