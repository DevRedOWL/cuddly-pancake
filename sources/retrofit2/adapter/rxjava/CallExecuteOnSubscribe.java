package retrofit2.adapter.rxjava;

import p059rx.Observable;
import p059rx.Subscriber;
import p059rx.exceptions.Exceptions;
import retrofit2.Call;
import retrofit2.Response;

final class CallExecuteOnSubscribe<T> implements Observable.OnSubscribe<Response<T>> {
    private final Call<T> originalCall;

    CallExecuteOnSubscribe(Call<T> call) {
        this.originalCall = call;
    }

    public void call(Subscriber<? super Response<T>> subscriber) {
        Call<T> clone = this.originalCall.clone();
        CallArbiter callArbiter = new CallArbiter(clone, subscriber);
        subscriber.add(callArbiter);
        subscriber.setProducer(callArbiter);
        try {
            callArbiter.emitResponse(clone.execute());
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            callArbiter.emitError(th);
        }
    }
}
