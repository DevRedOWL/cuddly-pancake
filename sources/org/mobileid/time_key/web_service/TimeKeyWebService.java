package org.mobileid.time_key.web_service;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.mobileid.requester.web_service.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J/\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo51343d2 = {"Lorg/mobileid/time_key/web_service/TimeKeyWebService;", "Lkotlin/Any;", "Lorg/mobileid/time_key/web_service/ActionOnKeyBody;", "actionOnKeyBody", "Lorg/mobileid/requester/web_service/Response;", "", "activateKey", "(Lorg/mobileid/time_key/web_service/ActionOnKeyBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmActivation", "deactivateKey", "", "token", "", "", "synchronizeKeys", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public interface TimeKeyWebService {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, mo51343d2 = {"Lorg/mobileid/time_key/web_service/TimeKeyWebService$Companion;", "", "baseUrl", "Lorg/mobileid/time_key/web_service/TimeKeyWebService;", "create", "(Ljava/lang/String;)Lorg/mobileid/time_key/web_service/TimeKeyWebService;", "<init>", "()V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final TimeKeyWebService create(String str) {
            Intrinsics.checkNotNullParameter(str, "baseUrl");
            Object create = new Retrofit.Builder().baseUrl(str).addConverterFactory(GsonConverterFactory.create()).build().create(TimeKeyWebService.class);
            Intrinsics.checkNotNullExpressionValue(create, "retrofit.create(TimeKeyWebService::class.java)");
            return (TimeKeyWebService) create;
        }
    }

    @POST("/api/mobile_app/activation")
    Object activateKey(@Body ActionOnKeyBody actionOnKeyBody, Continuation<? super Response<Boolean>> continuation);

    @POST("/api/mobile_app/confirm_activation")
    Object confirmActivation(@Body ActionOnKeyBody actionOnKeyBody, Continuation<? super Response<Boolean>> continuation);

    @POST("/api/mobile_app/deactivate")
    Object deactivateKey(@Body ActionOnKeyBody actionOnKeyBody, Continuation<? super Response<Boolean>> continuation);

    @GET("/api/mobile_app/list_token")
    Object synchronizeKeys(@Query("phone_token") String str, Continuation<? super Response<Map<String, Object>>> continuation);
}
