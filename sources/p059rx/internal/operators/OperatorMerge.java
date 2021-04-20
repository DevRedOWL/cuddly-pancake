package p059rx.internal.operators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import p059rx.Observable;
import p059rx.Producer;
import p059rx.Subscriber;
import p059rx.exceptions.CompositeException;
import p059rx.exceptions.MissingBackpressureException;
import p059rx.exceptions.OnErrorThrowable;
import p059rx.internal.util.RxRingBuffer;
import p059rx.internal.util.ScalarSynchronousObservable;
import p059rx.internal.util.atomic.SpscAtomicArrayQueue;
import p059rx.internal.util.atomic.SpscExactAtomicArrayQueue;
import p059rx.internal.util.atomic.SpscUnboundedAtomicArrayQueue;
import p059rx.internal.util.unsafe.Pow2;
import p059rx.internal.util.unsafe.SpscArrayQueue;
import p059rx.internal.util.unsafe.UnsafeAccess;
import p059rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.OperatorMerge */
public final class OperatorMerge<T> implements Observable.Operator<T, Observable<? extends T>> {
    final boolean delayErrors;
    final int maxConcurrent;

    /* renamed from: rx.internal.operators.OperatorMerge$HolderNoDelay */
    static final class HolderNoDelay {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(false, Integer.MAX_VALUE);

        HolderNoDelay() {
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$HolderDelayErrors */
    static final class HolderDelayErrors {
        static final OperatorMerge<Object> INSTANCE = new OperatorMerge<>(true, Integer.MAX_VALUE);

        HolderDelayErrors() {
        }
    }

    public static <T> OperatorMerge<T> instance(boolean z) {
        if (z) {
            return HolderDelayErrors.INSTANCE;
        }
        return HolderNoDelay.INSTANCE;
    }

    public static <T> OperatorMerge<T> instance(boolean z, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxConcurrent > 0 required but it was " + i);
        } else if (i == Integer.MAX_VALUE) {
            return instance(z);
        } else {
            return new OperatorMerge<>(z, i);
        }
    }

    OperatorMerge(boolean z, int i) {
        this.delayErrors = z;
        this.maxConcurrent = i;
    }

    public Subscriber<Observable<? extends T>> call(Subscriber<? super T> subscriber) {
        MergeSubscriber mergeSubscriber = new MergeSubscriber(subscriber, this.delayErrors, this.maxConcurrent);
        MergeProducer<T> mergeProducer = new MergeProducer<>(mergeSubscriber);
        mergeSubscriber.producer = mergeProducer;
        subscriber.add(mergeSubscriber);
        subscriber.setProducer(mergeProducer);
        return mergeSubscriber;
    }

    /* renamed from: rx.internal.operators.OperatorMerge$MergeProducer */
    static final class MergeProducer<T> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1214379189873595503L;
        final MergeSubscriber<T> subscriber;

        public MergeProducer(MergeSubscriber<T> mergeSubscriber) {
            this.subscriber = mergeSubscriber;
        }

        public void request(long j) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i > 0) {
                if (get() != Long.MAX_VALUE) {
                    BackpressureUtils.getAndAddRequest(this, j);
                    this.subscriber.emit();
                }
            } else if (i < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }

        public long produced(int i) {
            return addAndGet((long) (-i));
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$MergeSubscriber */
    static final class MergeSubscriber<T> extends Subscriber<Observable<? extends T>> {
        static final InnerSubscriber<?>[] EMPTY = new InnerSubscriber[0];
        final Subscriber<? super T> child;
        final boolean delayErrors;
        volatile boolean done;
        boolean emitting;
        volatile ConcurrentLinkedQueue<Throwable> errors;
        final Object innerGuard = new Object();
        volatile InnerSubscriber<?>[] innerSubscribers = EMPTY;
        long lastId;
        int lastIndex;
        final int maxConcurrent;
        boolean missed;
        MergeProducer<T> producer;
        volatile Queue<Object> queue;
        int scalarEmissionCount;
        final int scalarEmissionLimit;
        volatile CompositeSubscription subscriptions;
        long uniqueId;

        public MergeSubscriber(Subscriber<? super T> subscriber, boolean z, int i) {
            this.child = subscriber;
            this.delayErrors = z;
            this.maxConcurrent = i;
            if (i == Integer.MAX_VALUE) {
                this.scalarEmissionLimit = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
                return;
            }
            this.scalarEmissionLimit = Math.max(1, i >> 1);
            request((long) i);
        }

        /* access modifiers changed from: package-private */
        public Queue<Throwable> getOrCreateErrorQueue() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.errors;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    concurrentLinkedQueue = this.errors;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.errors = concurrentLinkedQueue;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        /* access modifiers changed from: package-private */
        public CompositeSubscription getOrCreateComposite() {
            CompositeSubscription compositeSubscription;
            CompositeSubscription compositeSubscription2 = this.subscriptions;
            if (compositeSubscription2 != null) {
                return compositeSubscription2;
            }
            boolean z = false;
            synchronized (this) {
                compositeSubscription = this.subscriptions;
                if (compositeSubscription == null) {
                    CompositeSubscription compositeSubscription3 = new CompositeSubscription();
                    this.subscriptions = compositeSubscription3;
                    compositeSubscription = compositeSubscription3;
                    z = true;
                }
            }
            if (z) {
                add(compositeSubscription);
            }
            return compositeSubscription;
        }

        public void onNext(Observable<? extends T> observable) {
            if (observable != null) {
                if (observable == Observable.empty()) {
                    emitEmpty();
                } else if (observable instanceof ScalarSynchronousObservable) {
                    tryEmit(((ScalarSynchronousObservable) observable).get());
                } else {
                    long j = this.uniqueId;
                    this.uniqueId = 1 + j;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j);
                    addInner(innerSubscriber);
                    observable.unsafeSubscribe(innerSubscriber);
                    emit();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void emitEmpty() {
            int i = this.scalarEmissionCount + 1;
            if (i == this.scalarEmissionLimit) {
                this.scalarEmissionCount = 0;
                requestMore((long) i);
                return;
            }
            this.scalarEmissionCount = i;
        }

        private void reportError() {
            ArrayList arrayList = new ArrayList(this.errors);
            if (arrayList.size() == 1) {
                this.child.onError((Throwable) arrayList.get(0));
            } else {
                this.child.onError(new CompositeException((Collection<? extends Throwable>) arrayList));
            }
        }

        public void onError(Throwable th) {
            getOrCreateErrorQueue().offer(th);
            this.done = true;
            emit();
        }

        public void onCompleted() {
            this.done = true;
            emit();
        }

        /* access modifiers changed from: package-private */
        public void addInner(InnerSubscriber<T> innerSubscriber) {
            getOrCreateComposite().add(innerSubscriber);
            synchronized (this.innerGuard) {
                InnerSubscriber<?>[] innerSubscriberArr = this.innerSubscribers;
                int length = innerSubscriberArr.length;
                InnerSubscriber<?>[] innerSubscriberArr2 = new InnerSubscriber[(length + 1)];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
                this.innerSubscribers = innerSubscriberArr2;
            }
        }

        /* access modifiers changed from: package-private */
        public void removeInner(InnerSubscriber<T> innerSubscriber) {
            RxRingBuffer rxRingBuffer = innerSubscriber.queue;
            if (rxRingBuffer != null) {
                rxRingBuffer.release();
            }
            this.subscriptions.remove(innerSubscriber);
            synchronized (this.innerGuard) {
                InnerSubscriber<?>[] innerSubscriberArr = this.innerSubscribers;
                int length = innerSubscriberArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (innerSubscriber.equals(innerSubscriberArr[i2])) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        this.innerSubscribers = EMPTY;
                        return;
                    }
                    InnerSubscriber<?>[] innerSubscriberArr2 = new InnerSubscriber[(length - 1)];
                    System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, i);
                    System.arraycopy(innerSubscriberArr, i + 1, innerSubscriberArr2, i, (length - i) - 1);
                    this.innerSubscribers = innerSubscriberArr2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void tryEmit(InnerSubscriber<T> innerSubscriber, T t) {
            long j = this.producer.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    j = this.producer.get();
                    if (!this.emitting && j != 0) {
                        this.emitting = true;
                        z = true;
                    }
                }
            }
            if (z) {
                RxRingBuffer rxRingBuffer = innerSubscriber.queue;
                if (rxRingBuffer == null || rxRingBuffer.isEmpty()) {
                    emitScalar(innerSubscriber, t, j);
                    return;
                }
                queueScalar(innerSubscriber, t);
                emitLoop();
                return;
            }
            queueScalar(innerSubscriber, t);
            emit();
        }

        /* access modifiers changed from: protected */
        public void queueScalar(InnerSubscriber<T> innerSubscriber, T t) {
            RxRingBuffer rxRingBuffer = innerSubscriber.queue;
            if (rxRingBuffer == null) {
                rxRingBuffer = RxRingBuffer.getSpscInstance();
                innerSubscriber.add(rxRingBuffer);
                innerSubscriber.queue = rxRingBuffer;
            }
            try {
                rxRingBuffer.onNext(NotificationLite.next(t));
            } catch (MissingBackpressureException e) {
                innerSubscriber.unsubscribe();
                innerSubscriber.onError(e);
            } catch (IllegalStateException e2) {
                if (!innerSubscriber.isUnsubscribed()) {
                    innerSubscriber.unsubscribe();
                    innerSubscriber.onError(e2);
                }
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        protected void emitScalar(p059rx.internal.operators.OperatorMerge.InnerSubscriber<T> r5, T r6, long r7) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                rx.Subscriber<? super T> r2 = r4.child     // Catch:{ all -> 0x0008 }
                r2.onNext(r6)     // Catch:{ all -> 0x0008 }
                goto L_0x0020
            L_0x0008:
                r6 = move-exception
                boolean r2 = r4.delayErrors     // Catch:{ all -> 0x0046 }
                if (r2 != 0) goto L_0x0019
                p059rx.exceptions.Exceptions.throwIfFatal(r6)     // Catch:{ all -> 0x0046 }
                r5.unsubscribe()     // Catch:{ all -> 0x0017 }
                r5.onError(r6)     // Catch:{ all -> 0x0017 }
                return
            L_0x0017:
                r5 = move-exception
                goto L_0x0048
            L_0x0019:
                java.util.Queue r2 = r4.getOrCreateErrorQueue()     // Catch:{ all -> 0x0046 }
                r2.offer(r6)     // Catch:{ all -> 0x0046 }
            L_0x0020:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r6 == 0) goto L_0x002e
                rx.internal.operators.OperatorMerge$MergeProducer<T> r6 = r4.producer     // Catch:{ all -> 0x0046 }
                r6.produced(r0)     // Catch:{ all -> 0x0046 }
            L_0x002e:
                r6 = 1
                r5.requestMore(r6)     // Catch:{ all -> 0x0046 }
                monitor-enter(r4)     // Catch:{ all -> 0x0046 }
                boolean r5 = r4.missed     // Catch:{ all -> 0x0043 }
                if (r5 != 0) goto L_0x003c
                r4.emitting = r1     // Catch:{ all -> 0x0043 }
                monitor-exit(r4)     // Catch:{ all -> 0x0043 }
                return
            L_0x003c:
                r4.missed = r1     // Catch:{ all -> 0x0043 }
                monitor-exit(r4)     // Catch:{ all -> 0x0043 }
                r4.emitLoop()
                return
            L_0x0043:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0043 }
                throw r5     // Catch:{ all -> 0x0017 }
            L_0x0046:
                r5 = move-exception
                r0 = 0
            L_0x0048:
                if (r0 != 0) goto L_0x0052
                monitor-enter(r4)
                r4.emitting = r1     // Catch:{ all -> 0x004f }
                monitor-exit(r4)     // Catch:{ all -> 0x004f }
                goto L_0x0052
            L_0x004f:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x004f }
                throw r5
            L_0x0052:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p059rx.internal.operators.OperatorMerge.MergeSubscriber.emitScalar(rx.internal.operators.OperatorMerge$InnerSubscriber, java.lang.Object, long):void");
        }

        public void requestMore(long j) {
            request(j);
        }

        /* access modifiers changed from: package-private */
        public void tryEmit(T t) {
            long j = this.producer.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    j = this.producer.get();
                    if (!this.emitting && j != 0) {
                        this.emitting = true;
                        z = true;
                    }
                }
            }
            if (z) {
                Queue<Object> queue2 = this.queue;
                if (queue2 == null || queue2.isEmpty()) {
                    emitScalar(t, j);
                    return;
                }
                queueScalar(t);
                emitLoop();
                return;
            }
            queueScalar(t);
            emit();
        }

        /* access modifiers changed from: protected */
        public void queueScalar(T t) {
            Queue<Object> queue2;
            Queue<Object> queue3 = this.queue;
            if (queue3 == null) {
                int i = this.maxConcurrent;
                if (i == Integer.MAX_VALUE) {
                    queue3 = new SpscUnboundedAtomicArrayQueue<>(RxRingBuffer.SIZE);
                } else {
                    if (!Pow2.isPowerOfTwo(i)) {
                        queue2 = new SpscExactAtomicArrayQueue<>(i);
                    } else if (UnsafeAccess.isUnsafeAvailable()) {
                        queue2 = new SpscArrayQueue<>(i);
                    } else {
                        queue2 = new SpscAtomicArrayQueue<>(i);
                    }
                    queue3 = queue2;
                }
                this.queue = queue3;
            }
            if (!queue3.offer(NotificationLite.next(t))) {
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t));
            }
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        protected void emitScalar(T r5, long r6) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                rx.Subscriber<? super T> r2 = r4.child     // Catch:{ all -> 0x0008 }
                r2.onNext(r5)     // Catch:{ all -> 0x0008 }
                goto L_0x0020
            L_0x0008:
                r5 = move-exception
                boolean r2 = r4.delayErrors     // Catch:{ all -> 0x0051 }
                if (r2 != 0) goto L_0x0019
                p059rx.exceptions.Exceptions.throwIfFatal(r5)     // Catch:{ all -> 0x0051 }
                r4.unsubscribe()     // Catch:{ all -> 0x0017 }
                r4.onError(r5)     // Catch:{ all -> 0x0017 }
                return
            L_0x0017:
                r5 = move-exception
                goto L_0x0053
            L_0x0019:
                java.util.Queue r2 = r4.getOrCreateErrorQueue()     // Catch:{ all -> 0x0051 }
                r2.offer(r5)     // Catch:{ all -> 0x0051 }
            L_0x0020:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r5 == 0) goto L_0x002e
                rx.internal.operators.OperatorMerge$MergeProducer<T> r5 = r4.producer     // Catch:{ all -> 0x0051 }
                r5.produced(r0)     // Catch:{ all -> 0x0051 }
            L_0x002e:
                int r5 = r4.scalarEmissionCount     // Catch:{ all -> 0x0051 }
                int r5 = r5 + r0
                int r6 = r4.scalarEmissionLimit     // Catch:{ all -> 0x0051 }
                if (r5 != r6) goto L_0x003c
                r4.scalarEmissionCount = r1     // Catch:{ all -> 0x0051 }
                long r5 = (long) r5     // Catch:{ all -> 0x0051 }
                r4.requestMore(r5)     // Catch:{ all -> 0x0051 }
                goto L_0x003e
            L_0x003c:
                r4.scalarEmissionCount = r5     // Catch:{ all -> 0x0051 }
            L_0x003e:
                monitor-enter(r4)     // Catch:{ all -> 0x0051 }
                boolean r5 = r4.missed     // Catch:{ all -> 0x004e }
                if (r5 != 0) goto L_0x0047
                r4.emitting = r1     // Catch:{ all -> 0x004e }
                monitor-exit(r4)     // Catch:{ all -> 0x004e }
                return
            L_0x0047:
                r4.missed = r1     // Catch:{ all -> 0x004e }
                monitor-exit(r4)     // Catch:{ all -> 0x004e }
                r4.emitLoop()
                return
            L_0x004e:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x004e }
                throw r5     // Catch:{ all -> 0x0017 }
            L_0x0051:
                r5 = move-exception
                r0 = 0
            L_0x0053:
                if (r0 != 0) goto L_0x005d
                monitor-enter(r4)
                r4.emitting = r1     // Catch:{ all -> 0x005a }
                monitor-exit(r4)     // Catch:{ all -> 0x005a }
                goto L_0x005d
            L_0x005a:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x005a }
                throw r5
            L_0x005d:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p059rx.internal.operators.OperatorMerge.MergeSubscriber.emitScalar(java.lang.Object, long):void");
        }

        /* access modifiers changed from: package-private */
        public void emit() {
            synchronized (this) {
                if (this.emitting) {
                    this.missed = true;
                    return;
                }
                this.emitting = true;
                emitLoop();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x01bf, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x01c0, code lost:
            r21 = r2;
         */
        /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x018d A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00f8 A[Catch:{ all -> 0x0046, all -> 0x01c5, all -> 0x0059 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void emitLoop() {
            /*
                r22 = this;
                r1 = r22
                rx.Subscriber<? super T> r4 = r1.child     // Catch:{ all -> 0x01c5 }
            L_0x0004:
                boolean r0 = r22.checkTerminate()     // Catch:{ all -> 0x01c5 }
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                java.util.Queue<java.lang.Object> r5 = r1.queue     // Catch:{ all -> 0x01c5 }
                rx.internal.operators.OperatorMerge$MergeProducer<T> r0 = r1.producer     // Catch:{ all -> 0x01c5 }
                long r6 = r0.get()     // Catch:{ all -> 0x01c5 }
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r0 != 0) goto L_0x001e
                r10 = 1
                goto L_0x001f
            L_0x001e:
                r10 = 0
            L_0x001f:
                r11 = 1
                r14 = 0
                if (r5 == 0) goto L_0x0093
                r0 = 0
            L_0x0026:
                r16 = r0
                r0 = 0
                r2 = 0
            L_0x002a:
                int r17 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r17 <= 0) goto L_0x0074
                java.lang.Object r17 = r5.poll()     // Catch:{ all -> 0x01c5 }
                boolean r0 = r22.checkTerminate()     // Catch:{ all -> 0x01c5 }
                if (r0 == 0) goto L_0x0039
                return
            L_0x0039:
                if (r17 != 0) goto L_0x003e
                r0 = r17
                goto L_0x0074
            L_0x003e:
                java.lang.Object r0 = p059rx.internal.operators.NotificationLite.getValue(r17)     // Catch:{ all -> 0x01c5 }
                r4.onNext(r0)     // Catch:{ all -> 0x0046 }
                goto L_0x0067
            L_0x0046:
                r0 = move-exception
                r18 = r0
                boolean r0 = r1.delayErrors     // Catch:{ all -> 0x01c5 }
                if (r0 != 0) goto L_0x005e
                p059rx.exceptions.Exceptions.throwIfFatal(r18)     // Catch:{ all -> 0x01c5 }
                r22.unsubscribe()     // Catch:{ all -> 0x0059 }
                r2 = r18
                r4.onError(r2)     // Catch:{ all -> 0x0059 }
                return
            L_0x0059:
                r0 = move-exception
                r21 = 1
                goto L_0x01c8
            L_0x005e:
                r8 = r18
                java.util.Queue r0 = r22.getOrCreateErrorQueue()     // Catch:{ all -> 0x01c5 }
                r0.offer(r8)     // Catch:{ all -> 0x01c5 }
            L_0x0067:
                int r16 = r16 + 1
                int r2 = r2 + 1
                long r6 = r6 - r11
                r0 = r17
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L_0x002a
            L_0x0074:
                if (r2 <= 0) goto L_0x0084
                if (r10 == 0) goto L_0x007e
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L_0x0084
            L_0x007e:
                rx.internal.operators.OperatorMerge$MergeProducer<T> r6 = r1.producer     // Catch:{ all -> 0x01c5 }
                long r6 = r6.produced(r2)     // Catch:{ all -> 0x01c5 }
            L_0x0084:
                int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r2 == 0) goto L_0x0095
                if (r0 != 0) goto L_0x008b
                goto L_0x0095
            L_0x008b:
                r0 = r16
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L_0x0026
            L_0x0093:
                r16 = 0
            L_0x0095:
                boolean r0 = r1.done     // Catch:{ all -> 0x01c5 }
                java.util.Queue<java.lang.Object> r2 = r1.queue     // Catch:{ all -> 0x01c5 }
                rx.internal.operators.OperatorMerge$InnerSubscriber<?>[] r5 = r1.innerSubscribers     // Catch:{ all -> 0x01c5 }
                int r8 = r5.length     // Catch:{ all -> 0x01c5 }
                if (r0 == 0) goto L_0x00bb
                if (r2 == 0) goto L_0x00a6
                boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x01c5 }
                if (r0 == 0) goto L_0x00bb
            L_0x00a6:
                if (r8 != 0) goto L_0x00bb
                java.util.concurrent.ConcurrentLinkedQueue<java.lang.Throwable> r0 = r1.errors     // Catch:{ all -> 0x01c5 }
                if (r0 == 0) goto L_0x00b7
                boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x01c5 }
                if (r0 == 0) goto L_0x00b3
                goto L_0x00b7
            L_0x00b3:
                r22.reportError()     // Catch:{ all -> 0x01c5 }
                goto L_0x00ba
            L_0x00b7:
                r4.onCompleted()     // Catch:{ all -> 0x01c5 }
            L_0x00ba:
                return
            L_0x00bb:
                if (r8 <= 0) goto L_0x019a
                long r11 = r1.lastId     // Catch:{ all -> 0x01c5 }
                int r0 = r1.lastIndex     // Catch:{ all -> 0x01c5 }
                if (r8 <= r0) goto L_0x00ce
                r2 = r5[r0]     // Catch:{ all -> 0x01c5 }
                r17 = r4
                long r3 = r2.f6973id     // Catch:{ all -> 0x01c5 }
                int r2 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r2 == 0) goto L_0x00f3
                goto L_0x00d0
            L_0x00ce:
                r17 = r4
            L_0x00d0:
                if (r8 > r0) goto L_0x00d3
                r0 = 0
            L_0x00d3:
                r2 = r0
                r0 = 0
            L_0x00d5:
                if (r0 >= r8) goto L_0x00ea
                r3 = r5[r2]     // Catch:{ all -> 0x01c5 }
                long r3 = r3.f6973id     // Catch:{ all -> 0x01c5 }
                int r21 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
                if (r21 != 0) goto L_0x00e0
                goto L_0x00ea
            L_0x00e0:
                int r3 = r2 + 1
                if (r3 != r8) goto L_0x00e6
                r2 = 0
                goto L_0x00e7
            L_0x00e6:
                r2 = r3
            L_0x00e7:
                int r0 = r0 + 1
                goto L_0x00d5
            L_0x00ea:
                r1.lastIndex = r2     // Catch:{ all -> 0x01c5 }
                r0 = r5[r2]     // Catch:{ all -> 0x01c5 }
                long r3 = r0.f6973id     // Catch:{ all -> 0x01c5 }
                r1.lastId = r3     // Catch:{ all -> 0x01c5 }
                r0 = r2
            L_0x00f3:
                r2 = r0
                r0 = 0
                r3 = 0
            L_0x00f6:
                if (r0 >= r8) goto L_0x018d
                boolean r4 = r22.checkTerminate()     // Catch:{ all -> 0x01c5 }
                if (r4 == 0) goto L_0x00ff
                return
            L_0x00ff:
                r4 = r5[r2]     // Catch:{ all -> 0x01c5 }
                r11 = 0
            L_0x0102:
                r12 = r11
                r11 = 0
            L_0x0104:
                int r21 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r21 <= 0) goto L_0x011a
                boolean r21 = r22.checkTerminate()     // Catch:{ all -> 0x01c5 }
                if (r21 == 0) goto L_0x010f
                return
            L_0x010f:
                rx.internal.util.RxRingBuffer r9 = r4.queue     // Catch:{ all -> 0x01c5 }
                if (r9 != 0) goto L_0x0114
                goto L_0x011a
            L_0x0114:
                java.lang.Object r12 = r9.poll()     // Catch:{ all -> 0x01c5 }
                if (r12 != 0) goto L_0x011f
            L_0x011a:
                r13 = r17
                r19 = 1
                goto L_0x0143
            L_0x011f:
                java.lang.Object r9 = p059rx.internal.operators.NotificationLite.getValue(r12)     // Catch:{ all -> 0x01c5 }
                r13 = r17
                r13.onNext(r9)     // Catch:{ all -> 0x0131 }
                r19 = 1
                long r6 = r6 - r19
                int r11 = r11 + 1
                r17 = r13
                goto L_0x0104
            L_0x0131:
                r0 = move-exception
                r2 = r0
                p059rx.exceptions.Exceptions.throwIfFatal(r2)     // Catch:{ all -> 0x0059 }
                r13.onError(r2)     // Catch:{ all -> 0x013d }
                r22.unsubscribe()     // Catch:{ all -> 0x0059 }
                return
            L_0x013d:
                r0 = move-exception
                r2 = r0
                r22.unsubscribe()     // Catch:{ all -> 0x0059 }
                throw r2     // Catch:{ all -> 0x0059 }
            L_0x0143:
                if (r11 <= 0) goto L_0x0159
                if (r10 != 0) goto L_0x014e
                rx.internal.operators.OperatorMerge$MergeProducer<T> r6 = r1.producer     // Catch:{ all -> 0x01c5 }
                long r6 = r6.produced(r11)     // Catch:{ all -> 0x01c5 }
                goto L_0x0153
            L_0x014e:
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            L_0x0153:
                long r14 = (long) r11     // Catch:{ all -> 0x01c5 }
                r4.requestMore(r14)     // Catch:{ all -> 0x01c5 }
                r14 = 0
            L_0x0159:
                int r9 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
                if (r9 == 0) goto L_0x0164
                if (r12 != 0) goto L_0x0160
                goto L_0x0164
            L_0x0160:
                r11 = r12
                r17 = r13
                goto L_0x0102
            L_0x0164:
                boolean r11 = r4.done     // Catch:{ all -> 0x01c5 }
                rx.internal.util.RxRingBuffer r12 = r4.queue     // Catch:{ all -> 0x01c5 }
                if (r11 == 0) goto L_0x017f
                if (r12 == 0) goto L_0x0172
                boolean r11 = r12.isEmpty()     // Catch:{ all -> 0x01c5 }
                if (r11 == 0) goto L_0x017f
            L_0x0172:
                r1.removeInner(r4)     // Catch:{ all -> 0x01c5 }
                boolean r3 = r22.checkTerminate()     // Catch:{ all -> 0x01c5 }
                if (r3 == 0) goto L_0x017c
                return
            L_0x017c:
                int r16 = r16 + 1
                r3 = 1
            L_0x017f:
                if (r9 != 0) goto L_0x0182
                goto L_0x018f
            L_0x0182:
                int r2 = r2 + 1
                if (r2 != r8) goto L_0x0187
                r2 = 0
            L_0x0187:
                int r0 = r0 + 1
                r17 = r13
                goto L_0x00f6
            L_0x018d:
                r13 = r17
            L_0x018f:
                r1.lastIndex = r2     // Catch:{ all -> 0x01c5 }
                r0 = r5[r2]     // Catch:{ all -> 0x01c5 }
                long r4 = r0.f6973id     // Catch:{ all -> 0x01c5 }
                r1.lastId = r4     // Catch:{ all -> 0x01c5 }
                r0 = r16
                goto L_0x019e
            L_0x019a:
                r13 = r4
                r0 = r16
                r3 = 0
            L_0x019e:
                if (r0 <= 0) goto L_0x01a4
                long r4 = (long) r0     // Catch:{ all -> 0x01c5 }
                r1.request(r4)     // Catch:{ all -> 0x01c5 }
            L_0x01a4:
                if (r3 == 0) goto L_0x01a9
            L_0x01a6:
                r4 = r13
                goto L_0x0004
            L_0x01a9:
                monitor-enter(r22)     // Catch:{ all -> 0x01c5 }
                boolean r0 = r1.missed     // Catch:{ all -> 0x01bb }
                if (r0 != 0) goto L_0x01b6
                r2 = 0
                r1.emitting = r2     // Catch:{ all -> 0x01b3 }
                monitor-exit(r22)     // Catch:{ all -> 0x01b3 }
                return
            L_0x01b3:
                r0 = move-exception
                r2 = 1
                goto L_0x01bd
            L_0x01b6:
                r2 = 0
                r1.missed = r2     // Catch:{ all -> 0x01bb }
                monitor-exit(r22)     // Catch:{ all -> 0x01bb }
                goto L_0x01a6
            L_0x01bb:
                r0 = move-exception
                r2 = 0
            L_0x01bd:
                monitor-exit(r22)     // Catch:{ all -> 0x01c3 }
                throw r0     // Catch:{ all -> 0x01bf }
            L_0x01bf:
                r0 = move-exception
                r21 = r2
                goto L_0x01c8
            L_0x01c3:
                r0 = move-exception
                goto L_0x01bd
            L_0x01c5:
                r0 = move-exception
                r21 = 0
            L_0x01c8:
                if (r21 != 0) goto L_0x01d3
                monitor-enter(r22)
                r2 = 0
                r1.emitting = r2     // Catch:{ all -> 0x01d0 }
                monitor-exit(r22)     // Catch:{ all -> 0x01d0 }
                goto L_0x01d3
            L_0x01d0:
                r0 = move-exception
                monitor-exit(r22)     // Catch:{ all -> 0x01d0 }
                throw r0
            L_0x01d3:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p059rx.internal.operators.OperatorMerge.MergeSubscriber.emitLoop():void");
        }

        /* access modifiers changed from: package-private */
        public boolean checkTerminate() {
            if (this.child.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.errors;
            if (this.delayErrors || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                reportError();
                return true;
            } finally {
                unsubscribe();
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$InnerSubscriber */
    static final class InnerSubscriber<T> extends Subscriber<T> {
        static final int LIMIT = (RxRingBuffer.SIZE / 4);
        volatile boolean done;

        /* renamed from: id */
        final long f6973id;
        int outstanding;
        final MergeSubscriber<T> parent;
        volatile RxRingBuffer queue;

        public InnerSubscriber(MergeSubscriber<T> mergeSubscriber, long j) {
            this.parent = mergeSubscriber;
            this.f6973id = j;
        }

        public void onStart() {
            this.outstanding = RxRingBuffer.SIZE;
            request((long) RxRingBuffer.SIZE);
        }

        public void onNext(T t) {
            this.parent.tryEmit(this, t);
        }

        public void onError(Throwable th) {
            this.parent.getOrCreateErrorQueue().offer(th);
            this.done = true;
            this.parent.emit();
        }

        public void onCompleted() {
            this.done = true;
            this.parent.emit();
        }

        public void requestMore(long j) {
            int i = this.outstanding - ((int) j);
            if (i > LIMIT) {
                this.outstanding = i;
                return;
            }
            this.outstanding = RxRingBuffer.SIZE;
            int i2 = RxRingBuffer.SIZE - i;
            if (i2 > 0) {
                request((long) i2);
            }
        }
    }
}
