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

final class BodyOnSubscribe<T> implements Observable.OnSubscribe<T> {
    private final Observable.OnSubscribe<Response<T>> upstream;

    BodyOnSubscribe(Observable.OnSubscribe<Response<T>> onSubscribe) {
        this.upstream = onSubscribe;
    }

    public void call(Subscriber<? super T> subscriber) {
        this.upstream.call(new BodySubscriber(subscriber));
    }

    private static class BodySubscriber<R> extends Subscriber<Response<R>> {
        private final Subscriber<? super R> subscriber;
        private boolean subscriberTerminated;

        BodySubscriber(Subscriber<? super R> subscriber2) {
            super(subscriber2);
            this.subscriber = subscriber2;
        }

        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.subscriber.onNext(response.body());
                return;
            }
            this.subscriberTerminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.subscriber.onError(httpException);
            } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException e) {
                RxJavaPlugins.getInstance().getErrorHandler().handleError(e);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.getInstance().getErrorHandler().handleError(new CompositeException(httpException, th));
            }
        }

        public void onError(Throwable th) {
            if (!this.subscriberTerminated) {
                this.subscriber.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a Retrofit bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.getInstance().getErrorHandler().handleError(assertionError);
        }

        public void onCompleted() {
            if (!this.subscriberTerminated) {
                this.subscriber.onCompleted();
            }
        }
    }
}
