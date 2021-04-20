package retrofit2.adapter.rxjava;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p059rx.Completable;
import p059rx.Observable;
import p059rx.Scheduler;
import p059rx.Single;
import retrofit2.CallAdapter;
import retrofit2.Response;
import retrofit2.Retrofit;

public final class RxJavaCallAdapterFactory extends CallAdapter.Factory {
    private final boolean isAsync;
    @Nullable
    private final Scheduler scheduler;

    public static RxJavaCallAdapterFactory create() {
        return new RxJavaCallAdapterFactory((Scheduler) null, false);
    }

    public static RxJavaCallAdapterFactory createAsync() {
        return new RxJavaCallAdapterFactory((Scheduler) null, true);
    }

    public static RxJavaCallAdapterFactory createWithScheduler(Scheduler scheduler2) {
        if (scheduler2 != null) {
            return new RxJavaCallAdapterFactory(scheduler2, false);
        }
        throw new NullPointerException("scheduler == null");
    }

    private RxJavaCallAdapterFactory(@Nullable Scheduler scheduler2, boolean z) {
        this.scheduler = scheduler2;
        this.isAsync = z;
    }

    @Nullable
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        boolean z;
        boolean z2;
        Type type2;
        Class<?> rawType = getRawType(type);
        boolean z3 = rawType == Single.class;
        boolean z4 = rawType == Completable.class;
        if (rawType != Observable.class && !z3 && !z4) {
            return null;
        }
        if (z4) {
            return new RxJavaCallAdapter(Void.class, this.scheduler, this.isAsync, false, true, false, true);
        }
        if (!(type instanceof ParameterizedType)) {
            String str = z3 ? "Single" : "Observable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type parameterUpperBound = getParameterUpperBound(0, (ParameterizedType) type);
        Class<?> rawType2 = getRawType(parameterUpperBound);
        if (rawType2 == Response.class) {
            if (parameterUpperBound instanceof ParameterizedType) {
                type2 = getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                z2 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (rawType2 != Result.class) {
            type2 = parameterUpperBound;
            z2 = false;
            z = true;
            return new RxJavaCallAdapter(type2, this.scheduler, this.isAsync, z2, z, z3, false);
        } else if (parameterUpperBound instanceof ParameterizedType) {
            type2 = getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
            z2 = true;
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        z = false;
        return new RxJavaCallAdapter(type2, this.scheduler, this.isAsync, z2, z, z3, false);
    }
}
