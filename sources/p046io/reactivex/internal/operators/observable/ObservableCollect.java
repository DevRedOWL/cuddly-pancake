package p046io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.functions.BiConsumer;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.disposables.EmptyDisposable;
import p046io.reactivex.internal.functions.ObjectHelper;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.ObservableCollect */
public final class ObservableCollect<T, U> extends AbstractObservableWithUpstream<T, U> {
    final BiConsumer<? super U, ? super T> collector;
    final Callable<? extends U> initialSupplier;

    public ObservableCollect(ObservableSource<T> observableSource, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        super(observableSource);
        this.initialSupplier = callable;
        this.collector = biConsumer;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Observer<? super U> observer) {
        try {
            this.source.subscribe(new CollectObserver(observer, ObjectHelper.requireNonNull(this.initialSupplier.call(), "The initialSupplier returned a null value"), this.collector));
        } catch (Throwable th) {
            EmptyDisposable.error(th, (Observer<?>) observer);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCollect$CollectObserver */
    static final class CollectObserver<T, U> implements Observer<T>, Disposable {
        final Observer<? super U> actual;
        final BiConsumer<? super U, ? super T> collector;
        boolean done;

        /* renamed from: s */
        Disposable f5975s;

        /* renamed from: u */
        final U f5976u;

        CollectObserver(Observer<? super U> observer, U u, BiConsumer<? super U, ? super T> biConsumer) {
            this.actual = observer;
            this.collector = biConsumer;
            this.f5976u = u;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5975s, disposable)) {
                this.f5975s = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f5975s.dispose();
        }

        public boolean isDisposed() {
            return this.f5975s.isDisposed();
        }

        public void onNext(T t) {
            if (!this.done) {
                try {
                    this.collector.accept(this.f5976u, t);
                } catch (Throwable th) {
                    this.f5975s.dispose();
                    onError(th);
                }
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
                this.actual.onNext(this.f5976u);
                this.actual.onComplete();
            }
        }
    }
}
