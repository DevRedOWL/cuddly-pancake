package p046io.reactivex.observers;

import java.util.concurrent.atomic.AtomicReference;
import p046io.reactivex.MaybeObserver;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.internal.disposables.DisposableHelper;
import p046io.reactivex.internal.disposables.ListCompositeDisposable;
import p046io.reactivex.internal.functions.ObjectHelper;
import p046io.reactivex.internal.util.EndConsumerHelper;

/* renamed from: io.reactivex.observers.ResourceMaybeObserver */
public abstract class ResourceMaybeObserver<T> implements MaybeObserver<T>, Disposable {
    private final ListCompositeDisposable resources = new ListCompositeDisposable();

    /* renamed from: s */
    private final AtomicReference<Disposable> f6159s = new AtomicReference<>();

    /* access modifiers changed from: protected */
    public void onStart() {
    }

    public final void add(Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "resource is null");
        this.resources.add(disposable);
    }

    public final void onSubscribe(Disposable disposable) {
        if (EndConsumerHelper.setOnce(this.f6159s, disposable, getClass())) {
            onStart();
        }
    }

    public final void dispose() {
        if (DisposableHelper.dispose(this.f6159s)) {
            this.resources.dispose();
        }
    }

    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f6159s.get());
    }
}
