package org.mobileid.requester.web_service.simple_key;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0007R\"\u0010\u0002\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, mo51343d2 = {"Lorg/mobileid/requester/web_service/simple_key/SimpleKeyResponse;", "", "mobileId", "Ljava/lang/String;", "getMobileId", "()Ljava/lang/String;", "setMobileId", "(Ljava/lang/String;)V", "<init>", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class SimpleKeyResponse {
    @SerializedName("mobile_id")
    public String mobileId;

    public SimpleKeyResponse(String str) {
        Intrinsics.checkNotNullParameter(str, "mobileId");
        this.mobileId = str;
    }

    public final String getMobileId() {
        return this.mobileId;
    }

    public final void setMobileId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileId = str;
    }
}
