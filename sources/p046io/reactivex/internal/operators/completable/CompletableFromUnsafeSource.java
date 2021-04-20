package p046io.reactivex.internal.operators.completable;

import p046io.reactivex.Completable;
import p046io.reactivex.CompletableObserver;
import p046io.reactivex.CompletableSource;

/* renamed from: io.reactivex.internal.operators.completable.CompletableFromUnsafeSource */
public final class CompletableFromUnsafeSource extends Completable {
    final CompletableSource source;

    public CompletableFromUnsafeSource(CompletableSource completableSource) {
        this.source = completableSource;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(CompletableObserver completableObserver) {
        this.source.subscribe(completableObserver);
    }
}
