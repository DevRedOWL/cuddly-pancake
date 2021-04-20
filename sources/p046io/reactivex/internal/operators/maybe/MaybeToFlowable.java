package p046io.reactivex.internal.operators.maybe;

import org.reactivestreams.Subscriber;
import p046io.reactivex.Flowable;
import p046io.reactivex.MaybeObserver;
import p046io.reactivex.MaybeSource;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import p046io.reactivex.internal.subscriptions.DeferredScalarSubscription;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeToFlowable */
public final class MaybeToFlowable<T> extends Flowable<T> implements HasUpstreamMaybeSource<T> {
    final MaybeSource<T> source;

    public MaybeToFlowable(MaybeSource<T> maybeSource) {
        this.source = maybeSource;
    }

    public MaybeSource<T> source() {
        return this.source;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new MaybeToFlowableSubscriber(subscriber));
    }

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeToFlowable$MaybeToFlowableSubscriber */
    static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: d */
        Disposable f5956d;

        MaybeToFlowableSubscriber(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f5956d, disposable)) {
                this.f5956d = disposable;
                this.actual.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            complete(t);
        }

        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        public void onComplete() {
            this.actual.onComplete();
        }

        public void cancel() {
            super.cancel();
            this.f5956d.dispose();
        }
    }
}
