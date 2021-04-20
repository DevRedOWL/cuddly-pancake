package retrofit2.adapter.rxjava;

import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p059rx.Observable;
import p059rx.Scheduler;
import retrofit2.Call;
import retrofit2.CallAdapter;

final class RxJavaCallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;
    @Nullable
    private final Scheduler scheduler;

    RxJavaCallAdapter(Type type, @Nullable Scheduler scheduler2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.responseType = type;
        this.scheduler = scheduler2;
        this.isAsync = z;
        this.isResult = z2;
        this.isBody = z3;
        this.isSingle = z4;
        this.isCompletable = z5;
    }

    public Type responseType() {
        return this.responseType;
    }

    public Object adapt(Call<R> call) {
        Observable.OnSubscribe onSubscribe;
        Observable.OnSubscribe callEnqueueOnSubscribe = this.isAsync ? new CallEnqueueOnSubscribe(call) : new CallExecuteOnSubscribe(call);
        if (this.isResult) {
            onSubscribe = new ResultOnSubscribe(callEnqueueOnSubscribe);
        } else {
            onSubscribe = this.isBody ? new BodyOnSubscribe(callEnqueueOnSubscribe) : callEnqueueOnSubscribe;
        }
        Observable create = Observable.create(onSubscribe);
        Scheduler scheduler2 = this.scheduler;
        if (scheduler2 != null) {
            create = create.subscribeOn(scheduler2);
        }
        if (this.isSingle) {
            return create.toSingle();
        }
        return this.isCompletable ? create.toCompletable() : create;
    }
}
