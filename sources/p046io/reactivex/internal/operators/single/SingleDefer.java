package p046io.reactivex.internal.operators.single;

import java.util.concurrent.Callable;
import p046io.reactivex.Single;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.internal.disposables.EmptyDisposable;
import p046io.reactivex.internal.functions.ObjectHelper;

/* renamed from: io.reactivex.internal.operators.single.SingleDefer */
public final class SingleDefer<T> extends Single<T> {
    final Callable<? extends SingleSource<? extends T>> singleSupplier;

    public SingleDefer(Callable<? extends SingleSource<? extends T>> callable) {
        this.singleSupplier = callable;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        try {
            ((SingleSource) ObjectHelper.requireNonNull(this.singleSupplier.call(), "The singleSupplier returned a null SingleSource")).subscribe(singleObserver);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptyDisposable.error(th, (SingleObserver<?>) singleObserver);
        }
    }
}
