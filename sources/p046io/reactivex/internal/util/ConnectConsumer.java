package p046io.reactivex.internal.util;

import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.functions.Consumer;

/* renamed from: io.reactivex.internal.util.ConnectConsumer */
public final class ConnectConsumer implements Consumer<Disposable> {
    public Disposable disposable;

    public void accept(Disposable disposable2) throws Exception {
        this.disposable = disposable2;
    }
}
