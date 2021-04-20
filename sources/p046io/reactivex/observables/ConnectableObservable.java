package p046io.reactivex.observables;

import p046io.reactivex.Observable;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.internal.functions.Functions;
import p046io.reactivex.internal.operators.observable.ObservableAutoConnect;
import p046io.reactivex.internal.operators.observable.ObservableRefCount;
import p046io.reactivex.internal.util.ConnectConsumer;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.observables.ConnectableObservable */
public abstract class ConnectableObservable<T> extends Observable<T> {
    public abstract void connect(Consumer<? super Disposable> consumer);

    public final Disposable connect() {
        ConnectConsumer connectConsumer = new ConnectConsumer();
        connect(connectConsumer);
        return connectConsumer.disposable;
    }

    public Observable<T> refCount() {
        return RxJavaPlugins.onAssembly(new ObservableRefCount(this));
    }

    public Observable<T> autoConnect() {
        return autoConnect(1);
    }

    public Observable<T> autoConnect(int i) {
        return autoConnect(i, Functions.emptyConsumer());
    }

    public Observable<T> autoConnect(int i, Consumer<? super Disposable> consumer) {
        if (i > 0) {
            return RxJavaPlugins.onAssembly(new ObservableAutoConnect(this, i, consumer));
        }
        connect(consumer);
        return RxJavaPlugins.onAssembly(this);
    }
}
