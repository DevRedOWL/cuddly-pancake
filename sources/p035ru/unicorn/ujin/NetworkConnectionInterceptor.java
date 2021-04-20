package p035ru.unicorn.ujin;

import com.google.android.gcm.GCMConstants;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: ru.unicorn.ujin.NetworkConnectionInterceptor */
public abstract class NetworkConnectionInterceptor implements Interceptor {
    public abstract boolean isInternetAvailable();

    public abstract void onInternetUnavailable();

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request build = chain.request().newBuilder().url(chain.request().url().newBuilder().addQueryParameter(GCMConstants.EXTRA_APPLICATION_PENDING_INTENT, "kortros").build()).build();
        if (!isInternetAvailable()) {
            onInternetUnavailable();
        }
        return chain.proceed(build);
    }
}
