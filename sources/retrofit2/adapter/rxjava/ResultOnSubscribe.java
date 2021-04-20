package retrofit2.adapter.rxjava;

import p059rx.Observable;
import p059rx.Subscriber;
import p059rx.exceptions.CompositeException;
import p059rx.exceptions.Exceptions;
import p059rx.exceptions.OnCompletedFailedException;
import p059rx.exceptions.OnErrorFailedException;
import p059rx.exceptions.OnErrorNotImplementedException;
import p059rx.plugins.RxJavaPlugins;
import retrofit2.Response;

final class ResultOnSubscribe<T> implements Observable.OnSubscribe<Result<T>> {
    private final Observable.OnSubscribe<Response<T>> upstream;

    ResultOnSubscribe(Observable.OnSubscribe<Response<T>> onSubscribe) {
        this.upstream = onSubscribe;
    }

    public void call(Subscriber<? super Result<T>> subscriber) {
        this.upstream.call(new ResultSubscriber(subscriber));
    }

    private static class ResultSubscriber<R> extends Subscriber<Response<R>> {
        private final Subscriber<? super Result<R>> subscriber;

        ResultSubscriber(Subscriber<? super Result<R>> subscriber2) {
            super(subscriber2);
            this.subscriber = subscriber2;
        }

        public void onNext(Response<R> response) {
            this.subscriber.onNext(Result.response(response));
        }

        public void onError(Throwable th) {
            try {
                this.subscriber.onNext(Result.error(th));
                this.subscriber.onCompleted();
            } catch (Throwable th2) {
                try {
                    this.subscriber.onError(th2);
                } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException e) {
                    RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.getInstance().getErrorHandler().handleError(new CompositeException(th2, th3));
                }
            }
        }

        public void onCompleted() {
            this.subscriber.onCompleted();
        }
    }
}
