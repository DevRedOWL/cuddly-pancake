package p046io.reactivex.internal.operators.observable;

import p046io.reactivex.Observable;
import p046io.reactivex.ObservableSource;
import p046io.reactivex.Observer;

/* renamed from: io.reactivex.internal.operators.observable.ObservableFromUnsafeSource */
public final class ObservableFromUnsafeSource<T> extends Observable<T> {
    final ObservableSource<T> source;

    public ObservableFromUnsafeSource(ObservableSource<T> observableSource) {
        this.source = observableSource;
    }

    /* access modifiers changed from: protected */
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(observer);
    }
}
