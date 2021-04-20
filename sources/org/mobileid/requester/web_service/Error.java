package org.mobileid.requester.web_service;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo51343d2 = {"Lorg/mobileid/requester/web_service/Error;", "", "code", "I", "getCode", "()I", "setCode", "(I)V", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "<init>", "(ILjava/lang/String;)V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class Error {
    @SerializedName("code")
    public int code;
    @SerializedName("message")
    public String message;

    public Error(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
