package p046io.reactivex.internal.operators.completable;

import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.CompletableSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.CompositeException;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Predicate;

/* renamed from: io.reactivex.internal.operators.completable.CompletableOnErrorComplete */
public final class CompletableOnErrorComplete extends Completable {
    final Predicate<? super Throwable> predicate;
    final CompletableSource source;

    public CompletableOnErrorComplete(CompletableSource completableSource, Predicate<? super Throwable> predicate2) {
        this.source = completableSource;
        this.predicate = predicate2;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(new OnError(completableObserver));
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableOnErrorComplete$OnError */
    final class OnError implements CompletableObserver {

        /* renamed from: s */
        private final CompletableObserver f5799s;

        OnError(CompletableObserver completableObserver) {
            this.f5799s = completableObserver;
        }

        public void onComplete() {
            this.f5799s.onComplete();
        }

        public void onError(Throwable th) {
            try {
                if (CompletableOnErrorComplete.this.predicate.test(th)) {
                    this.f5799s.onComplete();
                } else {
                    this.f5799s.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f5799s.onError(new CompositeException(th, th2));
            }
        }

        public void onSubscribe(Disposable disposable) {
            this.f5799s.onSubscribe(disposable);
        }
    }
}
