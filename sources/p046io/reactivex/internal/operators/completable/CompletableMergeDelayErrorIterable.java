package p046io.reactivex.internal.operators.completable;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.CompletableSource;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.internal.functions.ObjectHelper;
import p046io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray;
import p046io.reactivex.internal.util.AtomicThrowable;

/* renamed from: io.reactivex.internal.operators.completable.CompletableMergeDelayErrorIterable */
public final class CompletableMergeDelayErrorIterable extends Completable {
    final Iterable<? extends CompletableSource> sources;

    public CompletableMergeDelayErrorIterable(Iterable<? extends CompletableSource> iterable) {
        this.sources = iterable;
    }

    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.sources.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicThrowable atomicThrowable = new AtomicThrowable();
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        if (atomicInteger.decrementAndGet() == 0) {
                            Throwable terminate = atomicThrowable.terminate();
                            if (terminate == null) {
                                completableObserver.onComplete();
                                return;
                            } else {
                                completableObserver.onError(terminate);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!compositeDisposable.isDisposed()) {
                        try {
                            CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                            if (!compositeDisposable.isDisposed()) {
                                atomicInteger.getAndIncrement();
                                completableSource.subscribe(new CompletableMergeDelayErrorArray.MergeInnerCompletableObserver(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
                            } else {
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            atomicThrowable.addThrowable(th);
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    atomicThrowable.addThrowable(th2);
                }
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            completableObserver.onError(th3);
        }
    }
}
