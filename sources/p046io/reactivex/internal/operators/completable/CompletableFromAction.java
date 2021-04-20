package p046io.reactivex.internal.operators.completable;

import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.disposables.Disposables;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Action;

/* renamed from: io.reactivex.internal.operators.completable.CompletableFromAction */
public final class CompletableFromAction extends Completable {
    final Action run;

    public CompletableFromAction(Action action) {
        this.run = action;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        Disposable empty = Disposables.empty();
        completableObserver.onSubscribe(empty);
        try {
            this.run.run();
            if (!empty.isDisposed()) {
                completableObserver.onComplete();
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            if (!empty.isDisposed()) {
                completableObserver.onError(th);
            }
        }
    }
}
