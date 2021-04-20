package org.mobileid.time_key.web_service;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000B!\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\u0005R\u001c\u0010\b\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\u0005¨\u0006\f"}, mo51343d2 = {"Lorg/mobileid/time_key/web_service/ActionOnKeyBody;", "", "application", "Ljava/lang/String;", "getApplication", "()Ljava/lang/String;", "mobileQr", "getMobileQr", "phoneToken", "getPhoneToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "aclib-api2-6826_release"}, mo51344k = 1, mo51345mv = {1, 1, 15}, mo51346pn = "", mo51347xi = 0, mo51348xs = "")
public final class ActionOnKeyBody {
    @SerializedName("application")
    public final String application;
    @SerializedName("mobile_qr")
    public final String mobileQr;
    @SerializedName("phone_token")
    public final String phoneToken;

    public ActionOnKeyBody(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "mobileQr");
        Intrinsics.checkNotNullParameter(str2, "phoneToken");
        Intrinsics.checkNotNullParameter(str3, "application");
        this.mobileQr = str;
        this.phoneToken = str2;
        this.application = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionOnKeyBody(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "UPROX" : str3);
    }

    public final String getApplication() {
        return this.application;
    }

    public final String getMobileQr() {
        return this.mobileQr;
    }

    public final String getPhoneToken() {
        return this.phoneToken;
    }
}
