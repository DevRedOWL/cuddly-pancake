package p046io.reactivex.internal.operators.completable;

import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.completable.CompletableFromSingle */
public final class CompletableFromSingle<T> extends Completable {
    final SingleSource<T> single;

    public CompletableFromSingle(SingleSource<T> singleSource) {
        this.single = singleSource;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        this.single.subscribe(new CompletableFromSingleObserver(completableObserver));
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableFromSingle$CompletableFromSingleObserver */
    static final class CompletableFromSingleObserver<T> implements SingleObserver<T> {

        /* renamed from: co */
        final CompletableObserver f5796co;

        CompletableFromSingleObserver(CompletableObserver completableObserver) {
            this.f5796co = completableObserver;
        }

        public void onError(Throwable th) {
            this.f5796co.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f5796co.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            this.f5796co.onComplete();
        }
    }
}
