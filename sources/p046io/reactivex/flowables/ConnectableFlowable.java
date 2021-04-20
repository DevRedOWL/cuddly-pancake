package p046io.reactivex.flowables;

import p046io.reactivex.Flowable;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.internal.functions.Functions;
import p046io.reactivex.internal.operators.flowable.FlowableAutoConnect;
import p046io.reactivex.internal.operators.flowable.FlowableRefCount;
import p046io.reactivex.internal.util.ConnectConsumer;
import p046io.reactivex.plugins.RxJavaPlugins;

/* renamed from: io.reactivex.flowables.ConnectableFlowable */
public abstract class ConnectableFlowable<T> extends Flowable<T> {
    public abstract void connect(Consumer<? super Disposable> consumer);

    public final Disposable connect() {
        ConnectConsumer connectConsumer = new ConnectConsumer();
        connect(connectConsumer);
        return connectConsumer.disposable;
    }

    public Flowable<T> refCount() {
        return RxJavaPlugins.onAssembly(new FlowableRefCount(this));
    }

    public Flowable<T> autoConnect() {
        return autoConnect(1);
    }

    public Flowable<T> autoConnect(int i) {
        return autoConnect(i, Functions.emptyConsumer());
    }

    public Flowable<T> autoConnect(int i, Consumer<? super Disposable> consumer) {
        if (i > 0) {
            return RxJavaPlugins.onAssembly(new FlowableAutoConnect(this, i, consumer));
        }
        connect(consumer);
        return RxJavaPlugins.onAssembly(this);
    }
}
