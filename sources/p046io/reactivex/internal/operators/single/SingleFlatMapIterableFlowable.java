package p046io.reactivex.internal.operators.single;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import p046io.reactivex.Flowable;
import p046io.reactivex.SingleObserver;
import p046io.reactivex.SingleSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.exceptions.Exceptions;
import p046io.reactivex.functions.Function;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.functions.ObjectHelper;
import p046io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import p046io.reactivex.internal.subscriptions.SubscriptionHelper;
import p046io.reactivex.internal.util.BackpressureHelper;

/* renamed from: io.reactivex.internal.operators.single.SingleFlatMapIterableFlowable */
public final class SingleFlatMapIterableFlowable<T, R> extends Flowable<R> {
    final Function<? super T, ? extends Iterable<? extends R>> mapper;
    final SingleSource<T> source;

    public SingleFlatMapIterableFlowable(SingleSource<T> singleSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.source = singleSource;
        this.mapper = function;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe(new FlatMapIterableObserver(subscriber, this.mapper));
    }

    /* renamed from: io.reactivex.internal.operators.single.SingleFlatMapIterableFlowable$FlatMapIterableObserver */
    static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements SingleObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        final Subscriber<? super R> actual;
        volatile boolean cancelled;

        /* renamed from: d */
        Disposable f6109d;

        /* renamed from: it */
        volatile Iterator<? extends R> f6110it;
        final Function<? super T, ? extends Iterable<? extends R>> mapper;
        boolean outputFused;
        final AtomicLong requested = new AtomicLong();

        FlatMapIterableObserver(Subscriber<? super R> subscriber, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.actual = subscriber;
            this.mapper = function;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f6109d, disposable)) {
                this.f6109d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                Iterator<? extends R> it = ((Iterable) this.mapper.apply(t)).iterator();
                if (!it.hasNext()) {
                    this.actual.onComplete();
                    return;
                }
                this.f6110it = it;
                drain();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.actual.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.f6109d = DisposableHelper.DISPOSED;
            this.actual.onError(th);
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(this.requested, j);
                drain();
            }
        }

        public void cancel() {
            this.cancelled = true;
            this.f6109d.dispose();
            this.f6109d = DisposableHelper.DISPOSED;
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            if (getAndIncrement() == 0) {
                Subscriber<? super R> subscriber = this.actual;
                Iterator<? extends R> it = this.f6110it;
                if (!this.outputFused || it == null) {
                    int i = 1;
                    while (true) {
                        if (it != null) {
                            long j = this.requested.get();
                            if (j == Long.MAX_VALUE) {
                                slowPath(subscriber, it);
                                return;
                            }
                            long j2 = 0;
                            while (j2 != j) {
                                if (!this.cancelled) {
                                    try {
                                        subscriber.onNext(ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                                        if (!this.cancelled) {
                                            j2++;
                                            try {
                                                if (!it.hasNext()) {
                                                    subscriber.onComplete();
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Exceptions.throwIfFatal(th);
                                                subscriber.onError(th);
                                                return;
                                            }
                                        } else {
                                            return;
                                        }
                                    } catch (Throwable th2) {
                                        Exceptions.throwIfFatal(th2);
                                        subscriber.onError(th2);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                            if (j2 != 0) {
                                BackpressureHelper.produced(this.requested, j2);
                            }
                        }
                        i = addAndGet(-i);
                        if (i != 0) {
                            if (it == null) {
                                it = this.f6110it;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    subscriber.onNext(null);
                    subscriber.onComplete();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void slowPath(Subscriber<? super R> subscriber, Iterator<? extends R> it) {
            while (!this.cancelled) {
                try {
                    subscriber.onNext(it.next());
                    if (!this.cancelled) {
                        try {
                            if (!it.hasNext()) {
                                subscriber.onComplete();
                                return;
                            }
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            subscriber.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    subscriber.onError(th2);
                    return;
                }
            }
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        public void clear() {
            this.f6110it = null;
        }

        public boolean isEmpty() {
            return this.f6110it == null;
        }

        public R poll() throws Exception {
            Iterator<? extends R> it = this.f6110it;
            if (it == null) {
                return null;
            }
            R requireNonNull = ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f6110it = null;
            }
            return requireNonNull;
        }
    }
}
