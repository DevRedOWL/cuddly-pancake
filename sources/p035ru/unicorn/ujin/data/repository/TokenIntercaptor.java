package p035ru.unicorn.ujin.data.repository;

import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;

/* renamed from: ru.unicorn.ujin.data.repository.TokenIntercaptor */
public class TokenIntercaptor implements Interceptor {
    ProfileLocalRepository localRepository;
    String token;

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl url = request.url();
        if (this.localRepository == null) {
            this.localRepository = ProfileLocalRepository.Companion.getInstance();
        }
        if (this.token == null) {
            this.token = this.localRepository.getUserToken();
        }
        HttpUrl.Builder newBuilder = url.newBuilder();
        String str = this.token;
        if (str == null) {
            str = "";
        }
        return chain.proceed(request.newBuilder().url(newBuilder.addQueryParameter("token", str).build()).build());
    }
}
