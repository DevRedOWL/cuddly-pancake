package org.mobileid.requester.web_service;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000*\u0004\b\u0000\u0010\u0001B\u001b\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo51343d2 = {"Lorg/mobileid/requester/web_service/Response;", "T", "Lorg/mobileid/requester/web_service/Error;", "error", "Lorg/mobileid/requester/web_service/Error;", "getError", "()Lorg/mobileid/requester/web_service/Error;", "setError", "(Lorg/mobileid/requester/web_service/Error;)V", "result", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "<init>", "(Ljava/lang/Object;Lorg/mobileid/requester/web_service/Error;)V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class Response<T> {
    @SerializedName("error")
    public Error error;
    @SerializedName("result")
    public T result;

    public Response(T t, Error error2) {
        this.result = t;
        this.error = error2;
    }

    public final Error getError() {
        return this.error;
    }

    public final T getResult() {
        return this.result;
    }

    public final void setError(Error error2) {
        this.error = error2;
    }

    public final void setResult(T t) {
        this.result = t;
    }
}
