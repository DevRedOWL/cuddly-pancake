package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Producer;
import p059rx.Subscriber;
import p059rx.exceptions.Exceptions;
import p059rx.exceptions.OnErrorThrowable;
import p059rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OperatorCast */
public class OperatorCast<T, R> implements Observable.Operator<R, T> {
    final Class<R> castClass;

    public OperatorCast(Class<R> cls) {
        this.castClass = cls;
    }

    public Subscriber<? super T> call(Subscriber<? super R> subscriber) {
        CastSubscriber castSubscriber = new CastSubscriber(subscriber, this.castClass);
        subscriber.add(castSubscriber);
        return castSubscriber;
    }

    /* renamed from: rx.internal.operators.OperatorCast$CastSubscriber */
    static final class CastSubscriber<T, R> extends Subscriber<T> {
        final Subscriber<? super R> actual;
        final Class<R> castClass;
        boolean done;

        public CastSubscriber(Subscriber<? super R> subscriber, Class<R> cls) {
            this.actual = subscriber;
            this.castClass = cls;
        }

        public void onNext(T t) {
            try {
                this.actual.onNext(this.castClass.cast(t));
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th, t));
            }
        }

        public void onError(Throwable th) {
            if (this.done) {
                RxJavaHooks.onError(th);
                return;
            }
            this.done = true;
            this.actual.onError(th);
        }

        public void onCompleted() {
            if (!this.done) {
                this.actual.onCompleted();
            }
        }

        public void setProducer(Producer producer) {
            this.actual.setProducer(producer);
        }
    }
}
