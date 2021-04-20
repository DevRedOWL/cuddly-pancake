package p035ru.unicorn.ujin.view.activity.navigation.api;

import java.io.IOException;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import p035ru.unicorn.ujin.view.activity.navigation.entity.Token;
import p046io.realm.Realm;

/* renamed from: ru.unicorn.ujin.view.activity.navigation.api.RequestInterceptor */
public class RequestInterceptor implements Interceptor {
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        RequestBody body = request.body();
        String token = getToken();
        if (body.contentType().subtype().contains("form")) {
            body = processFormDataRequestBody(body, token);
        }
        if (body != null) {
            request = request.newBuilder().post(body).build();
        }
        return chain.proceed(request);
    }

    private RequestBody processFormDataRequestBody(RequestBody requestBody, String str) {
        FormBody build = new FormBody.Builder().add("token", str).build();
        String bodyToString = bodyToString(requestBody);
        StringBuilder sb = new StringBuilder();
        sb.append(bodyToString);
        sb.append(bodyToString.length() > 0 ? "&" : "");
        sb.append(bodyToString(build));
        return RequestBody.create(requestBody.contentType(), sb.toString());
    }

    private String bodyToString(RequestBody requestBody) {
        try {
            Buffer buffer = new Buffer();
            if (requestBody == null) {
                return "";
            }
            requestBody.writeTo(buffer);
            return buffer.readUtf8();
        } catch (IOException unused) {
            return "did not work";
        }
    }

    public String getToken() {
        Token token = (Token) Realm.getDefaultInstance().where(Token.class).findFirst();
        return token != null ? token.getToken() : "";
    }
}
