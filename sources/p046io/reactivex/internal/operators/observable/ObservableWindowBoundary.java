package p046io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046io.reactivex.Observable;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.observers.QueueDrainObserver;
import p046io.reactivex.internal.queue.MpscLinkedQueue;
import p046io.reactivex.internal.util.NotificationLite;
import p046io.reactivex.observers.DisposableObserver;
import p046io.reactivex.observers.SerializedObserver;
import p046io.reactivex.plugins.RxJavaPlugins;
import p046io.reactivex.subjects.UnicastSubject;

/* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundary */
public final class ObservableWindowBoundary<T, B> extends AbstractObservableWithUpstream<T, Observable<T>> {
    final int bufferSize;
    final ObservableSource<B> other;

    public ObservableWindowBoundary(ObservableSource<T> observableSource, ObservableSource<B> observableSource2, int i) {
        super(observableSource);
        this.other = observableSource2;
        this.bufferSize = i;
    }

    public void subscribeActual(Observer<? super Observable<T>> observer) {
        this.source.subscribe(new WindowBoundaryMainObserver(new SerializedObserver(observer), this.other, this.bufferSize));
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryMainObserver */
    static final class WindowBoundaryMainObserver<T, B> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
        static final Object NEXT = new Object();
        final AtomicReference<Disposable> boundary = new AtomicReference<>();
        final int bufferSize;
        final ObservableSource<B> other;

        /* renamed from: s */
        Disposable f6066s;
        UnicastSubject<T> window;
        final AtomicLong windows = new AtomicLong();

        WindowBoundaryMainObserver(Observer<? super Observable<T>> observer, ObservableSource<B> observableSource, int i) {
            super(observer, new MpscLinkedQueue());
            this.other = observableSource;
            this.bufferSize = i;
            this.windows.lazySet(1);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f6066s, disposable)) {
                this.f6066s = disposable;
                Observer observer = this.actual;
                observer.onSubscribe(this);
                if (!this.cancelled) {
                    UnicastSubject<T> create = UnicastSubject.create(this.bufferSize);
                    this.window = create;
                    observer.onNext(create);
                    WindowBoundaryInnerObserver windowBoundaryInnerObserver = new WindowBoundaryInnerObserver(this);
                    if (this.boundary.compareAndSet((Object) null, windowBoundaryInnerObserver)) {
                        this.windows.getAndIncrement();
                        this.other.subscribe(windowBoundaryInnerObserver);
                    }
                }
            }
        }

        public void onNext(T t) {
            if (fastEnter()) {
                this.window.onNext(t);
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                this.queue.offer(NotificationLite.next(t));
                if (!enter()) {
                    return;
                }
            }
            drainLoop();
        }

        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            if (enter()) {
                drainLoop();
            }
            if (this.windows.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.boundary);
            }
            this.actual.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                if (enter()) {
                    drainLoop();
                }
                if (this.windows.decrementAndGet() == 0) {
                    DisposableHelper.dispose(this.boundary);
                }
                this.actual.onComplete();
            }
        }

        public void dispose() {
            this.cancelled = true;
        }

        public boolean isDisposed() {
            return this.cancelled;
        }

        /* access modifiers changed from: package-private */
        public void drainLoop() {
            MpscLinkedQueue mpscLinkedQueue = (MpscLinkedQueue) this.queue;
            Observer observer = this.actual;
            UnicastSubject<T> unicastSubject = this.window;
            int i = 1;
            while (true) {
                boolean z = this.done;
                Object poll = mpscLinkedQueue.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    DisposableHelper.dispose(this.boundary);
                    Throwable th = this.error;
                    if (th != null) {
                        unicastSubject.onError(th);
                        return;
                    } else {
                        unicastSubject.onComplete();
                        return;
                    }
                } else if (z2) {
                    i = leave(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (poll == NEXT) {
                    unicastSubject.onComplete();
                    if (this.windows.decrementAndGet() == 0) {
                        DisposableHelper.dispose(this.boundary);
                        return;
                    } else if (!this.cancelled) {
                        unicastSubject = UnicastSubject.create(this.bufferSize);
                        this.windows.getAndIncrement();
                        this.window = unicastSubject;
                        observer.onNext(unicastSubject);
                    }
                } else {
                    unicastSubject.onNext(NotificationLite.getValue(poll));
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void next() {
            this.queue.offer(NEXT);
            if (enter()) {
                drainLoop();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryInnerObserver */
    static final class WindowBoundaryInnerObserver<T, B> extends DisposableObserver<B> {
        boolean done;
        final WindowBoundaryMainObserver<T, B> parent;

        WindowBoundaryInnerObserver(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.parent = windowBoundaryMainObserver;
        }

        public void onNext(B b) {
            if (!this.done) {
                this.parent.next();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.parent.onError(th);
        }

        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.parent.onComplete();
            }
        }
    }
}
