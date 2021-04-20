package p046io.reactivex.internal.operators.observable;

import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Action;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.fuseable.QueueDisposable;
import p046io.reactivex.internal.observers.BasicIntQueueDisposable;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.internal.operators.observable.ObservableDoFinally */
public final class ObservableDoFinally<T> extends AbstractObservableWithUpstream<T, T> {
    final Action onFinally;

    public ObservableDoFinally(ObservableSource<T> observableSource, Action action) {
        super(observableSource);
        this.onFinally = action;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new DoFinallyObserver(observer, this.onFinally));
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDoFinally$DoFinallyObserver */
    static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements Observer<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final Observer<? super T> actual;

        /* renamed from: d */
        Disposable f5992d;
        final Action onFinally;

        /* renamed from: qd */
        QueueDisposable<T> f5993qd;
        boolean syncFused;

        DoFinallyObserver(Observer<? super T> observer, Action action) {
            this.actual = observer;
            this.onFinally = action;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5992d, disposable)) {
                this.f5992d = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.f5993qd = (QueueDisposable) disposable;
                }
                this.actual.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.actual.onNext(t);
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
            runFinally();
        }

        public void onComplete() {
            this.actual.onComplete();
            runFinally();
        }

        public void dispose() {
            this.f5992d.dispose();
            runFinally();
        }

        public boolean isDisposed() {
            return this.f5992d.isDisposed();
        }

        public int requestFusion(int i) {
            QueueDisposable<T> queueDisposable = this.f5993qd;
            if (queueDisposable == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = queueDisposable.requestFusion(i);
            if (requestFusion != 0) {
                boolean z = true;
                if (requestFusion != 1) {
                    z = false;
                }
                this.syncFused = z;
            }
            return requestFusion;
        }

        public void clear() {
            this.f5993qd.clear();
        }

        public boolean isEmpty() {
            return this.f5993qd.isEmpty();
        }

        public T poll() throws Exception {
            T poll = this.f5993qd.poll();
            if (poll == null && this.syncFused) {
                runFinally();
            }
            return poll;
        }

        /* access modifiers changed from: package-private */
        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }
    }
}
