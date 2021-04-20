package org.mobileid.requester.web_service.simple_key;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, mo51343d2 = {"Lorg/mobileid/requester/web_service/simple_key/RequestSimpleKeyBody;", "", "mobileQr", "Ljava/lang/String;", "getMobileQr", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class RequestSimpleKeyBody {
    @SerializedName("mobile_qr")
    public final String mobileQr;

    public RequestSimpleKeyBody(String str) {
        Intrinsics.checkNotNullParameter(str, "mobileQr");
        this.mobileQr = str;
    }

    public final String getMobileQr() {
        return this.mobileQr;
    }
}
