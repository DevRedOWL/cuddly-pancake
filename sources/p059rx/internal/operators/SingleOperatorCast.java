package p059rx.internal.operators;

import p059rx.functions.Func1;

/* renamed from: rx.internal.operators.SingleOperatorCast */
public class SingleOperatorCast<T, R> implements Func1<T, R> {
    final Class<R> castClass;

    public SingleOperatorCast(Class<R> cls) {
        this.castClass = cls;
    }

    public R call(T t) {
        return this.castClass.cast(t);
    }
}
