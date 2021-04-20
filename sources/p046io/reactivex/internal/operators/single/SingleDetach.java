package p046io.reactivex.internal.operators.single;

import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.single.SingleDetach */
public final class SingleDetach<T> extends Single<T> {
    final SingleSource<T> source;

    public SingleDetach(SingleSource<T> singleSource) {
        this.source = singleSource;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.source.subscribe(new DetachSingleObserver(singleObserver));
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleDetach$DetachSingleObserver */
    static final class DetachSingleObserver<T> implements SingleObserver<T>, Disposable {
        SingleObserver<? super T> actual;

        /* renamed from: d */
        Disposable f6100d;

        DetachSingleObserver(SingleObserver<? super T> singleObserver) {
            this.actual = singleObserver;
        }

        public void dispose() {
            this.actual = null;
            this.f6100d.dispose();
            this.f6100d = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f6100d.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f6100d, disposable)) {
                this.f6100d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f6100d = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.actual;
            if (singleObserver != null) {
                this.actual = null;
                singleObserver.onSuccess(t);
            }
        }

        public void onError(Throwable th) {
            this.f6100d = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.actual;
            if (singleObserver != null) {
                this.actual = null;
                singleObserver.onError(th);
            }
        }
    }
}
