package p046io.reactivex.internal.operators.single;

import java.util.Iterator;
import p046io.reactivex.Observable;
import p046io.reactivex.Observer;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Function;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.functions.ObjectHelper;
import p046io.reactivex.internal.observers.BasicIntQueueDisposable;

/* renamed from: io.reactivex.internal.operators.single.SingleFlatMapIterableObservable */
public final class SingleFlatMapIterableObservable<T, R> extends Observable<R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final SingleSource<T> source;

    public SingleFlatMapIterableObservable(SingleSource<T> singleSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.source = singleSource;
        this.mapper = function;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Observer<? super R> observer) {
        this.source.subscribe(new FlatMapIterableObserver(observer, this.mapper));
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleFlatMapIterableObservable$FlatMapIterableObserver */
    static final class FlatMapIterableObserver<T, R> extends BasicIntQueueDisposable<R> implements SingleObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        final Observer<? super R> actual;
        volatile boolean cancelled;

        /* renamed from: d */
        Disposable f6111d;

        /* renamed from: it */
        volatile Iterator<? extends R> f6112it;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;

        FlatMapIterableObserver(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.actual = observer;
            this.mapper = function;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f6111d, disposable)) {
                this.f6111d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            Observer<? super R> observer = this.actual;
            try {
                Iterator<? extends R> it = ((Iterable) this.mapper.apply(t)).iterator();
                if (!it.hasNext()) {
                    observer.onComplete();
                } else if (this.outputFused) {
                    this.f6112it = it;
                    observer.onNext(null);
                    observer.onComplete();
                } else {
                    while (!this.cancelled) {
                        try {
                            observer.onNext(it.next());
                            if (!this.cancelled) {
                                try {
                                    if (!it.hasNext()) {
                                        observer.onComplete();
                                        return;
                                    }
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    observer.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            observer.onError(th2);
                            return;
                        }
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.actual.onError(th3);
            }
        }

        public void onError(Throwable th) {
            this.f6111d = DisposableHelper.DISPOSED;
            this.actual.onError(th);
        }

        public void dispose() {
            this.cancelled = true;
            this.f6111d.dispose();
            this.f6111d = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.cancelled;
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public void clear() {
            this.f6112it = null;
        }

        public boolean isEmpty() {
            return this.f6112it == null;
        }

        public R poll() throws Exception {
            Iterator<? extends R> it = this.f6112it;
            if (it == null) {
                return null;
            }
            R requireNonNull = ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f6112it = null;
            }
            return requireNonNull;
        }
    }
}
