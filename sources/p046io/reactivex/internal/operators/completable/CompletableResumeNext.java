package p046io.reactivex.internal.operators.completable;

import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.CompletableSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.CompositeException;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Function;
import p046io.reactivex.internal.disposables.SequentialDisposable;

/* renamed from: io.reactivex.internal.operators.completable.CompletableResumeNext */
public final class CompletableResumeNext extends Completable {
    final Function<? super Throwable, ? extends CompletableSource> errorMapper;
    final CompletableSource source;

    public CompletableResumeNext(CompletableSource completableSource, Function<? super Throwable, ? extends CompletableSource> function) {
        this.source = completableSource;
        this.errorMapper = function;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        completableObserver.onSubscribe(sequentialDisposable);
        this.source.subscribe(new ResumeNext(completableObserver, sequentialDisposable));
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableResumeNext$ResumeNext */
    final class ResumeNext implements CompletableObserver {

        /* renamed from: s */
        final CompletableObserver f5801s;

        /* renamed from: sd */
        final SequentialDisposable f5802sd;

        ResumeNext(CompletableObserver completableObserver, SequentialDisposable sequentialDisposable) {
            this.f5801s = completableObserver;
            this.f5802sd = sequentialDisposable;
        }

        public void onComplete() {
            this.f5801s.onComplete();
        }

        public void onError(Throwable th) {
            try {
                CompletableSource completableSource = (CompletableSource) CompletableResumeNext.this.errorMapper.apply(th);
                if (completableSource == null) {
                    NullPointerException nullPointerException = new NullPointerException("The CompletableConsumable returned is null");
                    nullPointerException.initCause(th);
                    this.f5801s.onError(nullPointerException);
                    return;
                }
                completableSource.subscribe(new OnErrorObserver());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f5801s.onError(new CompositeException(th2, th));
            }
        }

        public void onSubscribe(Disposable disposable) {
            this.f5802sd.update(disposable);
        }

        /* renamed from: io.reactivex.internal.operators.completable.CompletableResumeNext$ResumeNext$OnErrorObserver */
        final class OnErrorObserver implements CompletableObserver {
            OnErrorObserver() {
            }

            public void onComplete() {
                ResumeNext.this.f5801s.onComplete();
            }

            public void onError(Throwable th) {
                ResumeNext.this.f5801s.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                ResumeNext.this.f5802sd.update(disposable);
            }
        }
    }
}
