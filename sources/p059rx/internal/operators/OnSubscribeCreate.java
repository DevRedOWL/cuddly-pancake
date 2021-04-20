package p059rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p059rx.Emitter;
import p059rx.Observable;
import p059rx.Producer;
import p059rx.Subscriber;
import p059rx.Subscription;
import p059rx.exceptions.MissingBackpressureException;
import p059rx.functions.Action1;
import p059rx.functions.Cancellable;
import p059rx.internal.subscriptions.CancellableSubscription;
import p059rx.internal.util.RxRingBuffer;
import p059rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import p059rx.internal.util.unsafe.SpscUnboundedArrayQueue;
import p059rx.internal.util.unsafe.UnsafeAccess;
import p059rx.plugins.RxJavaHooks;
import p059rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OnSubscribeCreate */
public final class OnSubscribeCreate<T> implements Observable.OnSubscribe<T> {
    final Action1<Emitter<T>> Emitter;
    final Emitter.BackpressureMode backpressure;

    public OnSubscribeCreate(Action1<Emitter<T>> action1, Emitter.BackpressureMode backpressureMode) {
        this.Emitter = action1;
        this.backpressure = backpressureMode;
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$1 */
    static /* synthetic */ class C62471 {
        static final /* synthetic */ int[] $SwitchMap$rx$Emitter$BackpressureMode = new int[Emitter.BackpressureMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                rx.Emitter$BackpressureMode[] r0 = p059rx.Emitter.BackpressureMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$rx$Emitter$BackpressureMode = r0
                int[] r0 = $SwitchMap$rx$Emitter$BackpressureMode     // Catch:{ NoSuchFieldError -> 0x0014 }
                rx.Emitter$BackpressureMode r1 = p059rx.Emitter.BackpressureMode.NONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$rx$Emitter$BackpressureMode     // Catch:{ NoSuchFieldError -> 0x001f }
                rx.Emitter$BackpressureMode r1 = p059rx.Emitter.BackpressureMode.ERROR     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$rx$Emitter$BackpressureMode     // Catch:{ NoSuchFieldError -> 0x002a }
                rx.Emitter$BackpressureMode r1 = p059rx.Emitter.BackpressureMode.DROP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = $SwitchMap$rx$Emitter$BackpressureMode     // Catch:{ NoSuchFieldError -> 0x0035 }
                rx.Emitter$BackpressureMode r1 = p059rx.Emitter.BackpressureMode.LATEST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p059rx.internal.operators.OnSubscribeCreate.C62471.<clinit>():void");
        }
    }

    public void call(Subscriber<? super T> subscriber) {
        BaseEmitter baseEmitter;
        int i = C62471.$SwitchMap$rx$Emitter$BackpressureMode[this.backpressure.ordinal()];
        if (i == 1) {
            baseEmitter = new NoneEmitter(subscriber);
        } else if (i == 2) {
            baseEmitter = new ErrorEmitter(subscriber);
        } else if (i == 3) {
            baseEmitter = new DropEmitter(subscriber);
        } else if (i != 4) {
            baseEmitter = new BufferEmitter(subscriber, RxRingBuffer.SIZE);
        } else {
            baseEmitter = new LatestEmitter(subscriber);
        }
        subscriber.add(baseEmitter);
        subscriber.setProducer(baseEmitter);
        this.Emitter.call(baseEmitter);
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$BaseEmitter */
    static abstract class BaseEmitter<T> extends AtomicLong implements Emitter<T>, Producer, Subscription {
        private static final long serialVersionUID = 7326289992464377023L;
        final Subscriber<? super T> actual;
        final SerialSubscription serial = new SerialSubscription();

        /* access modifiers changed from: package-private */
        public void onRequested() {
        }

        /* access modifiers changed from: package-private */
        public void onUnsubscribed() {
        }

        public BaseEmitter(Subscriber<? super T> subscriber) {
            this.actual = subscriber;
        }

        public void onCompleted() {
            if (!this.actual.isUnsubscribed()) {
                try {
                    this.actual.onCompleted();
                } finally {
                    this.serial.unsubscribe();
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.actual.isUnsubscribed()) {
                try {
                    this.actual.onError(th);
                } finally {
                    this.serial.unsubscribe();
                }
            }
        }

        public final void unsubscribe() {
            this.serial.unsubscribe();
            onUnsubscribed();
        }

        public final boolean isUnsubscribed() {
            return this.serial.isUnsubscribed();
        }

        public final void request(long j) {
            if (BackpressureUtils.validate(j)) {
                BackpressureUtils.getAndAddRequest(this, j);
                onRequested();
            }
        }

        public final void setSubscription(Subscription subscription) {
            this.serial.set(subscription);
        }

        public final void setCancellation(Cancellable cancellable) {
            setSubscription(new CancellableSubscription(cancellable));
        }

        public final long requested() {
            return get();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$NoneEmitter */
    static final class NoneEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        public NoneEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t) {
            long j;
            if (!this.actual.isUnsubscribed()) {
                this.actual.onNext(t);
                do {
                    j = get();
                    if (j == 0 || compareAndSet(j, j - 1)) {
                    }
                    j = get();
                    return;
                } while (compareAndSet(j, j - 1));
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$NoOverflowBaseEmitter */
    static abstract class NoOverflowBaseEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        /* access modifiers changed from: package-private */
        public abstract void onOverflow();

        public NoOverflowBaseEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t) {
            if (!this.actual.isUnsubscribed()) {
                if (get() != 0) {
                    this.actual.onNext(t);
                    BackpressureUtils.produced(this, 1);
                    return;
                }
                onOverflow();
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$DropEmitter */
    static final class DropEmitter<T> extends NoOverflowBaseEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        /* access modifiers changed from: package-private */
        public void onOverflow() {
        }

        public DropEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$ErrorEmitter */
    static final class ErrorEmitter<T> extends NoOverflowBaseEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;
        private boolean done;

        public ErrorEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t) {
            if (!this.done) {
                super.onNext(t);
            }
        }

        public void onCompleted() {
            if (!this.done) {
                this.done = true;
                super.onCompleted();
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                RxJavaHooks.onError(th);
                return;
            }
            this.done = true;
            super.onError(th);
        }

        /* access modifiers changed from: package-private */
        public void onOverflow() {
            onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$BufferEmitter */
    static final class BufferEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final Queue<Object> queue;
        final AtomicInteger wip;

        public BufferEmitter(Subscriber<? super T> subscriber, int i) {
            super(subscriber);
            this.queue = UnsafeAccess.isUnsafeAvailable() ? new SpscUnboundedArrayQueue<>(i) : new SpscUnboundedAtomicArrayQueue<>(i);
            this.wip = new AtomicInteger();
        }

        public void onNext(T t) {
            this.queue.offer(NotificationLite.next(t));
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onCompleted() {
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public void onRequested() {
            drain();
        }

        /* access modifiers changed from: package-private */
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            int i;
            if (this.wip.getAndIncrement() == 0) {
                Subscriber subscriber = this.actual;
                Queue<Object> queue2 = this.queue;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (subscriber.isUnsubscribed()) {
                            queue2.clear();
                            return;
                        } else {
                            boolean z = this.done;
                            Object poll = queue2.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable th = this.error;
                                if (th != null) {
                                    super.onError(th);
                                    return;
                                } else {
                                    super.onCompleted();
                                    return;
                                }
                            } else if (z2) {
                                break;
                            } else {
                                subscriber.onNext(NotificationLite.getValue(poll));
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (subscriber.isUnsubscribed()) {
                            queue2.clear();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean isEmpty = queue2.isEmpty();
                        if (z3 && isEmpty) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        BackpressureUtils.produced(this, j2);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } while (i2 != 0);
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCreate$LatestEmitter */
    static final class LatestEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<Object> queue = new AtomicReference<>();
        final AtomicInteger wip = new AtomicInteger();

        public LatestEmitter(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onNext(T t) {
            this.queue.set(NotificationLite.next(t));
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onCompleted() {
            this.done = true;
            drain();
        }

        /* access modifiers changed from: package-private */
        public void onRequested() {
            drain();
        }

        /* access modifiers changed from: package-private */
        public void onUnsubscribed() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet((Object) null);
            }
        }

        /* access modifiers changed from: package-private */
        public void drain() {
            boolean z;
            int i;
            if (this.wip.getAndIncrement() == 0) {
                Subscriber subscriber = this.actual;
                AtomicReference<Object> atomicReference = this.queue;
                int i2 = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        } else if (subscriber.isUnsubscribed()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        } else {
                            boolean z2 = this.done;
                            Object andSet = atomicReference.getAndSet((Object) null);
                            boolean z3 = andSet == null;
                            if (z2 && z3) {
                                Throwable th = this.error;
                                if (th != null) {
                                    super.onError(th);
                                    return;
                                } else {
                                    super.onCompleted();
                                    return;
                                }
                            } else if (z3) {
                                break;
                            } else {
                                subscriber.onNext(NotificationLite.getValue(andSet));
                                j2++;
                            }
                        }
                    }
                    if (i == 0) {
                        if (subscriber.isUnsubscribed()) {
                            atomicReference.lazySet((Object) null);
                            return;
                        }
                        boolean z4 = this.done;
                        if (atomicReference.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                super.onError(th2);
                                return;
                            } else {
                                super.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        BackpressureUtils.produced(this, j2);
                    }
                    i2 = this.wip.addAndGet(-i2);
                } while (i2 != 0);
            }
        }
    }
}
