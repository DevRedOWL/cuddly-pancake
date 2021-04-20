package p046io.reactivex.internal.operators.maybe;

import p046io.reactivex.Maybe;
import p046io.reactivex.MaybeObserver;
import p046io.reactivex.internal.disposables.EmptyDisposable;
import p046io.reactivex.internal.fuseable.ScalarCallable;

/* renamed from: io.reactivex.internal.operators.maybe.MaybeEmpty */
public final class MaybeEmpty extends Maybe<Object> implements ScalarCallable<Object> {
    public static final MaybeEmpty INSTANCE = new MaybeEmpty();

    public Object call() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(MaybeObserver<? super Object> maybeObserver) {
        EmptyDisposable.complete((MaybeObserver<?>) maybeObserver);
    }
}
