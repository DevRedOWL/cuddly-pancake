package org.linphone.api;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p046io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RemoteRepository {
    private static final String BASE_URL = "https://api-product.mysmartflat.ru/api/";
    private static RemoteRepository instance;
    private Api api;

    public static RemoteRepository getInstance() {
        if (instance == null) {
            instance = new RemoteRepository();
        }
        return instance;
    }

    private RemoteRepository() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(httpLoggingInterceptor);
        this.api = (Api) new Retrofit.Builder().baseUrl("https://api-product.mysmartflat.ru/api/").client(builder.build()).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build().create(Api.class);
    }

    public void sendLog(String str, String str2, String str3) {
        this.api.sendLog(str2, str, str3).onErrorReturn($$Lambda$ZNnRw3qzklseL_eAH01cCzPj870.INSTANCE).subscribeOn(Schedulers.m6765io()).subscribe();
    }
}
