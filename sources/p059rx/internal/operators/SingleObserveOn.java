package p059rx.internal.operators;

import p059rx.Scheduler;
import p059rx.Single;
import p059rx.SingleSubscriber;
import p059rx.functions.Action0;

/* renamed from: rx.internal.operators.SingleObserveOn */
public final class SingleObserveOn<T> implements Single.OnSubscribe<T> {
    final Scheduler scheduler;
    final Single.OnSubscribe<T> source;

    public SingleObserveOn(Single.OnSubscribe<T> onSubscribe, Scheduler scheduler2) {
        this.source = onSubscribe;
        this.scheduler = scheduler2;
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        ObserveOnSingleSubscriber observeOnSingleSubscriber = new ObserveOnSingleSubscriber(singleSubscriber, createWorker);
        singleSubscriber.add(createWorker);
        singleSubscriber.add(observeOnSingleSubscriber);
        this.source.call(observeOnSingleSubscriber);
    }

    /* renamed from: rx.internal.operators.SingleObserveOn$ObserveOnSingleSubscriber */
    static final class ObserveOnSingleSubscriber<T> extends SingleSubscriber<T> implements Action0 {
        final SingleSubscriber<? super T> actual;
        Throwable error;
        T value;

        /* renamed from: w */
        final Scheduler.Worker f6978w;

        public ObserveOnSingleSubscriber(SingleSubscriber<? super T> singleSubscriber, Scheduler.Worker worker) {
            this.actual = singleSubscriber;
            this.f6978w = worker;
        }

        public void onSuccess(T t) {
            this.value = t;
            this.f6978w.schedule(this);
        }

        public void onError(Throwable th) {
            this.error = th;
            this.f6978w.schedule(this);
        }

        public void call() {
            try {
                Throwable th = this.error;
                if (th != null) {
                    this.error = null;
                    this.actual.onError(th);
                } else {
                    T t = this.value;
                    this.value = null;
                    this.actual.onSuccess(t);
                }
            } finally {
                this.f6978w.unsubscribe();
            }
        }
    }
}
