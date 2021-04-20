package org.linphone.api;

import p046io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {
    @FormUrlEncoded
    @POST("log/insertapp/")
    Observable<String> sendLog(@Field("token") String str, @Field("data") String str2, @Field("browser_token") String str3);
}
