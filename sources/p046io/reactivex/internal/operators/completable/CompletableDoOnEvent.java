package p046io.reactivex.internal.operators.completable;

import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.CompletableSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.CompositeException;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.internal.operators.completable.CompletableDoOnEvent */
public final class CompletableDoOnEvent extends Completable {
    final Consumer<? super Throwable> onEvent;
    final CompletableSource source;

    public CompletableDoOnEvent(CompletableSource completableSource, Consumer<? super Throwable> consumer) {
        this.source = completableSource;
        this.onEvent = consumer;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(new DoOnEvent(completableObserver));
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableDoOnEvent$DoOnEvent */
    final class DoOnEvent implements CompletableObserver {
        private final CompletableObserver observer;

        DoOnEvent(CompletableObserver completableObserver) {
            this.observer = completableObserver;
        }

        public void onComplete() {
            try {
                CompletableDoOnEvent.this.onEvent.accept(null);
                this.observer.onComplete();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.observer.onError(th);
            }
        }

        public void onError(Throwable th) {
            try {
                CompletableDoOnEvent.this.onEvent.accept(th);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                th = new CompositeException(th, th2);
            }
            this.observer.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }
    }
}
