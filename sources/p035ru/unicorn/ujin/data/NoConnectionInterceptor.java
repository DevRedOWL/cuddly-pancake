package p035ru.unicorn.ujin.data;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0003J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/data/NoConnectionInterceptor;", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "isConnectionOn", "", "isInternetAvailable", "postAndroidMInternetCheck", "connectivityManager", "Landroid/net/ConnectivityManager;", "preAndroidMInternetCheck", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.NoConnectionInterceptor */
/* compiled from: NoConnectionInterceptor.kt */
public final class NoConnectionInterceptor implements Interceptor {
    private final Context context;

    public NoConnectionInterceptor(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!isConnectionOn()) {
            throw new NoConnectivityException();
        } else if (isInternetAvailable()) {
            return chain.proceed(chain.request());
        } else {
            throw new NoInternetException();
        }
    }

    private final boolean isInternetAvailable() {
        try {
            URLConnection openConnection = new URL("https://api-product.mysmartflat.ru/api/whoareyou").openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestProperty("User-Agent", "Test");
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.setConnectTimeout(1500);
                httpURLConnection.connect();
                return httpURLConnection.getResponseCode() == 200;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (IOException unused) {
            return false;
        }
    }

    private final boolean isConnectionOn() {
        Object systemService = this.context.getSystemService("connectivity");
        if (systemService != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            if (Build.VERSION.SDK_INT >= 23) {
                return postAndroidMInternetCheck(connectivityManager);
            }
            return preAndroidMInternetCheck(connectivityManager);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    private final boolean preAndroidMInternetCheck(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        if (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 0) {
            return true;
        }
        return false;
    }

    private final boolean postAndroidMInternetCheck(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null || (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0))) {
            return false;
        }
        return true;
    }
}
