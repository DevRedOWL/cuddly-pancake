package p046io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.ObservableElementAt */
public final class ObservableElementAt<T> extends AbstractObservableWithUpstream<T, T> {
    final T defaultValue;
    final boolean errorOnFewer;
    final long index;

    public ObservableElementAt(ObservableSource<T> observableSource, long j, T t, boolean z) {
        super(observableSource);
        this.index = j;
        this.defaultValue = t;
        this.errorOnFewer = z;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new ElementAtObserver(observer, this.index, this.defaultValue, this.errorOnFewer));
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableElementAt$ElementAtObserver */
    static final class ElementAtObserver<T> implements Observer<T>, Disposable {
        final Observer<? super T> actual;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;

        /* renamed from: s */
        Disposable f5995s;

        ElementAtObserver(Observer<? super T> observer, long j, T t, boolean z) {
            this.actual = observer;
            this.index = j;
            this.defaultValue = t;
            this.errorOnFewer = z;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5995s, disposable)) {
                this.f5995s = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f5995s.dispose();
        }

        public boolean isDisposed() {
            return this.f5995s.isDisposed();
        }

        public void onNext(T t) {
            if (!this.done) {
                long j = this.count;
                if (j == this.index) {
                    this.done = true;
                    this.f5995s.dispose();
                    this.actual.onNext(t);
                    this.actual.onComplete();
                    return;
                }
                this.count = j + 1;
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.actual.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                T t = this.defaultValue;
                if (t != null || !this.errorOnFewer) {
                    if (t != null) {
                        this.actual.onNext(t);
                    }
                    this.actual.onComplete();
                    return;
                }
                this.actual.onError(new NoSuchElementException());
            }
        }
    }
}
