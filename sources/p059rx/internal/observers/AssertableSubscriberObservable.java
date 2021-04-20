package p059rx.internal.observers;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p059rx.Producer;
import p059rx.Subscriber;
import p059rx.functions.Action0;
import p059rx.observers.AssertableSubscriber;
import p059rx.observers.TestSubscriber;

/* renamed from: rx.internal.observers.AssertableSubscriberObservable */
public class AssertableSubscriberObservable<T> extends Subscriber<T> implements AssertableSubscriber<T> {

    /* renamed from: ts */
    private final TestSubscriber<T> f6958ts;

    public AssertableSubscriberObservable(TestSubscriber<T> testSubscriber) {
        this.f6958ts = testSubscriber;
    }

    public static <T> AssertableSubscriberObservable<T> create(long j) {
        TestSubscriber testSubscriber = new TestSubscriber(j);
        AssertableSubscriberObservable<T> assertableSubscriberObservable = new AssertableSubscriberObservable<>(testSubscriber);
        assertableSubscriberObservable.add(testSubscriber);
        return assertableSubscriberObservable;
    }

    public void onStart() {
        this.f6958ts.onStart();
    }

    public void onCompleted() {
        this.f6958ts.onCompleted();
    }

    public void setProducer(Producer producer) {
        this.f6958ts.setProducer(producer);
    }

    public final int getCompletions() {
        return this.f6958ts.getCompletions();
    }

    public void onError(Throwable th) {
        this.f6958ts.onError(th);
    }

    public List<Throwable> getOnErrorEvents() {
        return this.f6958ts.getOnErrorEvents();
    }

    public void onNext(T t) {
        this.f6958ts.onNext(t);
    }

    public final int getValueCount() {
        return this.f6958ts.getValueCount();
    }

    public AssertableSubscriber<T> requestMore(long j) {
        this.f6958ts.requestMore(j);
        return this;
    }

    public List<T> getOnNextEvents() {
        return this.f6958ts.getOnNextEvents();
    }

    public AssertableSubscriber<T> assertReceivedOnNext(List<T> list) {
        this.f6958ts.assertReceivedOnNext(list);
        return this;
    }

    public final AssertableSubscriber<T> awaitValueCount(int i, long j, TimeUnit timeUnit) {
        if (this.f6958ts.awaitValueCount(i, j, timeUnit)) {
            return this;
        }
        throw new AssertionError("Did not receive enough values in time. Expected: " + i + ", Actual: " + this.f6958ts.getValueCount());
    }

    public AssertableSubscriber<T> assertTerminalEvent() {
        this.f6958ts.assertTerminalEvent();
        return this;
    }

    public AssertableSubscriber<T> assertUnsubscribed() {
        this.f6958ts.assertUnsubscribed();
        return this;
    }

    public AssertableSubscriber<T> assertNoErrors() {
        this.f6958ts.assertNoErrors();
        return this;
    }

    public AssertableSubscriber<T> awaitTerminalEvent() {
        this.f6958ts.awaitTerminalEvent();
        return this;
    }

    public AssertableSubscriber<T> awaitTerminalEvent(long j, TimeUnit timeUnit) {
        this.f6958ts.awaitTerminalEvent(j, timeUnit);
        return this;
    }

    public AssertableSubscriber<T> awaitTerminalEventAndUnsubscribeOnTimeout(long j, TimeUnit timeUnit) {
        this.f6958ts.awaitTerminalEventAndUnsubscribeOnTimeout(j, timeUnit);
        return this;
    }

    public Thread getLastSeenThread() {
        return this.f6958ts.getLastSeenThread();
    }

    public AssertableSubscriber<T> assertCompleted() {
        this.f6958ts.assertCompleted();
        return this;
    }

    public AssertableSubscriber<T> assertNotCompleted() {
        this.f6958ts.assertNotCompleted();
        return this;
    }

    public AssertableSubscriber<T> assertError(Class<? extends Throwable> cls) {
        this.f6958ts.assertError(cls);
        return this;
    }

    public AssertableSubscriber<T> assertError(Throwable th) {
        this.f6958ts.assertError(th);
        return this;
    }

    public AssertableSubscriber<T> assertNoTerminalEvent() {
        this.f6958ts.assertNoTerminalEvent();
        return this;
    }

    public AssertableSubscriber<T> assertNoValues() {
        this.f6958ts.assertNoValues();
        return this;
    }

    public AssertableSubscriber<T> assertValueCount(int i) {
        this.f6958ts.assertValueCount(i);
        return this;
    }

    public AssertableSubscriber<T> assertValues(T... tArr) {
        this.f6958ts.assertValues(tArr);
        return this;
    }

    public AssertableSubscriber<T> assertValue(T t) {
        this.f6958ts.assertValue(t);
        return this;
    }

    public final AssertableSubscriber<T> assertValuesAndClear(T t, T... tArr) {
        this.f6958ts.assertValuesAndClear(t, tArr);
        return this;
    }

    public final AssertableSubscriber<T> perform(Action0 action0) {
        action0.call();
        return this;
    }

    public String toString() {
        return this.f6958ts.toString();
    }

    public final AssertableSubscriber<T> assertResult(T... tArr) {
        this.f6958ts.assertValues(tArr);
        this.f6958ts.assertNoErrors();
        this.f6958ts.assertCompleted();
        return this;
    }

    public final AssertableSubscriber<T> assertFailure(Class<? extends Throwable> cls, T... tArr) {
        this.f6958ts.assertValues(tArr);
        this.f6958ts.assertError(cls);
        this.f6958ts.assertNotCompleted();
        return this;
    }

    public final AssertableSubscriber<T> assertFailureAndMessage(Class<? extends Throwable> cls, String str, T... tArr) {
        this.f6958ts.assertValues(tArr);
        this.f6958ts.assertError(cls);
        this.f6958ts.assertNotCompleted();
        String message = this.f6958ts.getOnErrorEvents().get(0).getMessage();
        if (message == str || (str != null && str.equals(message))) {
            return this;
        }
        throw new AssertionError("Error message differs. Expected: '" + str + "', Received: '" + message + "'");
    }
}
