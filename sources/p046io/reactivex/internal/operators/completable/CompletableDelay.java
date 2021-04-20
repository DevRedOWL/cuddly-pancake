package p046io.reactivex.internal.operators.completable;

import java.util.concurrent.TimeUnit;
import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.CompletableSource;
import p046io.reactivex.Scheduler;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.completable.CompletableDelay */
public final class CompletableDelay extends Completable {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final CompletableSource source;
    final TimeUnit unit;

    public CompletableDelay(CompletableSource completableSource, long j, TimeUnit timeUnit, Scheduler scheduler2, boolean z) {
        this.source = completableSource;
        this.delay = j;
        this.unit = timeUnit;
        this.scheduler = scheduler2;
        this.delayError = z;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(new Delay(new CompositeDisposable(), completableObserver));
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableDelay$Delay */
    final class Delay implements CompletableObserver {

        /* renamed from: s */
        final CompletableObserver f5787s;
        private final CompositeDisposable set;

        Delay(CompositeDisposable compositeDisposable, CompletableObserver completableObserver) {
            this.set = compositeDisposable;
            this.f5787s = completableObserver;
        }

        public void onComplete() {
            this.set.add(CompletableDelay.this.scheduler.scheduleDirect(new OnComplete(), CompletableDelay.this.delay, CompletableDelay.this.unit));
        }

        public void onError(Throwable th) {
            this.set.add(CompletableDelay.this.scheduler.scheduleDirect(new OnError(th), CompletableDelay.this.delayError ? CompletableDelay.this.delay : 0, CompletableDelay.this.unit));
        }

        public void onSubscribe(Disposable disposable) {
            this.set.add(disposable);
            this.f5787s.onSubscribe(this.set);
        }

        /* renamed from: io.reactivex.internal.operators.completable.CompletableDelay$Delay$OnComplete */
        final class OnComplete implements Runnable {
            OnComplete() {
            }

            public void run() {
                Delay.this.f5787s.onComplete();
            }
        }

        /* renamed from: io.reactivex.internal.operators.completable.CompletableDelay$Delay$OnError */
        final class OnError implements Runnable {

            /* renamed from: e */
            private final Throwable f5788e;

            OnError(Throwable th) {
                this.f5788e = th;
            }

            public void run() {
                Delay.this.f5787s.onError(this.f5788e);
            }
        }
    }
}
