package org.mobileid.requester.web_service.simple_key;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import org.mobileid.requester.web_service.Response;
import org.mobileid.requester.web_service.interceptor.HttpInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, mo51343d2 = {"Lorg/mobileid/requester/web_service/simple_key/SimpleKeyWebService;", "Lkotlin/Any;", "Lorg/mobileid/requester/web_service/simple_key/RequestSimpleKeyBody;", "bodySimple", "Lorg/mobileid/requester/web_service/Response;", "Lorg/mobileid/requester/web_service/simple_key/SimpleKeyResponse;", "getKey", "(Lorg/mobileid/requester/web_service/simple_key/RequestSimpleKeyBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public interface SimpleKeyWebService {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo51343d2 = {"Lorg/mobileid/requester/web_service/simple_key/SimpleKeyWebService$Companion;", "", "baseUrl", "Lorg/mobileid/requester/web_service/simple_key/SimpleKeyWebService;", "create", "(Ljava/lang/String;)Lorg/mobileid/requester/web_service/simple_key/SimpleKeyWebService;", "Lokhttp3/OkHttpClient;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private final OkHttpClient getHttpClient() {
            return new OkHttpClient.Builder().addInterceptor(new HttpInterceptor()).build();
        }

        public final SimpleKeyWebService create(String str) {
            Intrinsics.checkNotNullParameter(str, "baseUrl");
            Object create = new Retrofit.Builder().baseUrl(str).client(getHttpClient()).addConverterFactory(GsonConverterFactory.create()).build().create(SimpleKeyWebService.class);
            Intrinsics.checkNotNullExpressionValue(create, "retrofit.create(SimpleKeyWebService::class.java)");
            return (SimpleKeyWebService) create;
        }
    }

    @POST("/api/mobile_qr/")
    Object getKey(@Body RequestSimpleKeyBody requestSimpleKeyBody, Continuation<? super Response<SimpleKeyResponse>> continuation);
}
