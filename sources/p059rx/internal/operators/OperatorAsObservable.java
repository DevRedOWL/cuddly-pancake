package p059rx.internal.operators;

import p059rx.Observable;
import p059rx.Subscriber;

/* renamed from: rx.internal.operators.OperatorAsObservable */
public final class OperatorAsObservable<T> implements Observable.Operator<T, T> {
    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        return subscriber;
    }

    /* renamed from: rx.internal.operators.OperatorAsObservable$Holder */
    static final class Holder {
        static final OperatorAsObservable<Object> INSTANCE = new OperatorAsObservable<>();

        Holder() {
        }
    }

    public static <T> OperatorAsObservable<T> instance() {
        return Holder.INSTANCE;
    }

    OperatorAsObservable() {
    }
}
