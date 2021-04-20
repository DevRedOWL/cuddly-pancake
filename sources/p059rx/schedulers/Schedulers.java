package p059rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p059rx.Scheduler;
import p059rx.internal.schedulers.ExecutorScheduler;
import p059rx.internal.schedulers.GenericScheduledExecutorService;
import p059rx.internal.schedulers.ImmediateScheduler;
import p059rx.internal.schedulers.SchedulerLifecycle;
import p059rx.internal.schedulers.TrampolineScheduler;
import p059rx.plugins.RxJavaHooks;
import p059rx.plugins.RxJavaPlugins;
import p059rx.plugins.RxJavaSchedulersHook;

/* renamed from: rx.schedulers.Schedulers */
public final class Schedulers {
    private static final AtomicReference<Schedulers> INSTANCE = new AtomicReference<>();
    private final Scheduler computationScheduler;
    private final Scheduler ioScheduler;
    private final Scheduler newThreadScheduler;

    private static Schedulers getInstance() {
        while (true) {
            Schedulers schedulers = INSTANCE.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            if (INSTANCE.compareAndSet((Object) null, schedulers2)) {
                return schedulers2;
            }
            schedulers2.shutdownInstance();
        }
    }

    private Schedulers() {
        RxJavaSchedulersHook schedulersHook = RxJavaPlugins.getInstance().getSchedulersHook();
        Scheduler computationScheduler2 = schedulersHook.getComputationScheduler();
        if (computationScheduler2 != null) {
            this.computationScheduler = computationScheduler2;
        } else {
            this.computationScheduler = RxJavaSchedulersHook.createComputationScheduler();
        }
        Scheduler iOScheduler = schedulersHook.getIOScheduler();
        if (iOScheduler != null) {
            this.ioScheduler = iOScheduler;
        } else {
            this.ioScheduler = RxJavaSchedulersHook.createIoScheduler();
        }
        Scheduler newThreadScheduler2 = schedulersHook.getNewThreadScheduler();
        if (newThreadScheduler2 != null) {
            this.newThreadScheduler = newThreadScheduler2;
        } else {
            this.newThreadScheduler = RxJavaSchedulersHook.createNewThreadScheduler();
        }
    }

    public static Scheduler immediate() {
        return ImmediateScheduler.INSTANCE;
    }

    public static Scheduler trampoline() {
        return TrampolineScheduler.INSTANCE;
    }

    public static Scheduler newThread() {
        return RxJavaHooks.onNewThreadScheduler(getInstance().newThreadScheduler);
    }

    public static Scheduler computation() {
        return RxJavaHooks.onComputationScheduler(getInstance().computationScheduler);
    }

    /* renamed from: io */
    public static Scheduler m6935io() {
        return RxJavaHooks.onIOScheduler(getInstance().ioScheduler);
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static Scheduler from(Executor executor) {
        return new ExecutorScheduler(executor);
    }

    public static void reset() {
        Schedulers andSet = INSTANCE.getAndSet((Object) null);
        if (andSet != null) {
            andSet.shutdownInstance();
        }
    }

    public static void start() {
        Schedulers instance = getInstance();
        instance.startInstance();
        synchronized (instance) {
            GenericScheduledExecutorService.INSTANCE.start();
        }
    }

    public static void shutdown() {
        Schedulers instance = getInstance();
        instance.shutdownInstance();
        synchronized (instance) {
            GenericScheduledExecutorService.INSTANCE.shutdown();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void startInstance() {
        if (this.computationScheduler instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.computationScheduler).start();
        }
        if (this.ioScheduler instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.ioScheduler).start();
        }
        if (this.newThreadScheduler instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.newThreadScheduler).start();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void shutdownInstance() {
        if (this.computationScheduler instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.computationScheduler).shutdown();
        }
        if (this.ioScheduler instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.ioScheduler).shutdown();
        }
        if (this.newThreadScheduler instanceof SchedulerLifecycle) {
            ((SchedulerLifecycle) this.newThreadScheduler).shutdown();
        }
    }
}
