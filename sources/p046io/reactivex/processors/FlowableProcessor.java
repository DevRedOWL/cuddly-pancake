package p046io.reactivex.processors;

import org.reactivestreams.Processor;
import p046io.reactivex.Flowable;
import p046io.reactivex.FlowableSubscriber;
import p046io.reactivex.annotations.CheckReturnValue;

/* renamed from: io.reactivex.processors.FlowableProcessor */
public abstract class FlowableProcessor<T> extends Flowable<T> implements Processor<T, T>, FlowableSubscriber<T> {
    public abstract Throwable getThrowable();

    public abstract boolean hasComplete();

    public abstract boolean hasSubscribers();

    public abstract boolean hasThrowable();

    @CheckReturnValue
    public final FlowableProcessor<T> toSerialized() {
        if (this instanceof SerializedProcessor) {
            return this;
        }
        return new SerializedProcessor(this);
    }
}