package p046io.reactivex;

import p046io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.CompletableObserver */
public interface CompletableObserver {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(Disposable disposable);
}
