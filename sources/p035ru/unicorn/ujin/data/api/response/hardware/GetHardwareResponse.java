package p035ru.unicorn.ujin.data.api.response.hardware;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/hardware/GetHardwareResponse;", "", "command", "", "error", "", "message", "token", "fromdomain", "worktime", "data", "", "Lru/unicorn/ujin/data/api/response/hardware/GetHardwareResponseData;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCommand", "()Ljava/lang/String;", "getData", "()Ljava/util/List;", "getError", "()I", "getFromdomain", "getMessage", "getToken", "getWorktime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.hardware.GetHardwareResponse */
/* compiled from: GetHardwareResponse.kt */
public final class GetHardwareResponse {
    private final String command;
    private final List<GetHardwareResponseData> data;
    private final int error;
    private final String fromdomain;
    private final String message;
    private final String token;
    private final String worktime;

    public static /* synthetic */ GetHardwareResponse copy$default(GetHardwareResponse getHardwareResponse, String str, int i, String str2, String str3, String str4, String str5, List<GetHardwareResponseData> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getHardwareResponse.command;
        }
        if ((i2 & 2) != 0) {
            i = getHardwareResponse.error;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = getHardwareResponse.message;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = getHardwareResponse.token;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = getHardwareResponse.fromdomain;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            str5 = getHardwareResponse.worktime;
        }
        String str9 = str5;
        if ((i2 & 64) != 0) {
            list = getHardwareResponse.data;
        }
        return getHardwareResponse.copy(str, i3, str6, str7, str8, str9, list);
    }

    public final String component1() {
        return this.command;
    }

    public final int component2() {
        return this.error;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.token;
    }

    public final String component5() {
        return this.fromdomain;
    }

    public final String component6() {
        return this.worktime;
    }

    public final List<GetHardwareResponseData> component7() {
        return this.data;
    }

    public final GetHardwareResponse copy(String str, int i, String str2, String str3, String str4, String str5, List<GetHardwareResponseData> list) {
        Intrinsics.checkNotNullParameter(str, "command");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(str3, "token");
        Intrinsics.checkNotNullParameter(str4, "fromdomain");
        Intrinsics.checkNotNullParameter(str5, "worktime");
        return new GetHardwareResponse(str, i, str2, str3, str4, str5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetHardwareResponse)) {
            return false;
        }
        GetHardwareResponse getHardwareResponse = (GetHardwareResponse) obj;
        return Intrinsics.areEqual((Object) this.command, (Object) getHardwareResponse.command) && this.error == getHardwareResponse.error && Intrinsics.areEqual((Object) this.message, (Object) getHardwareResponse.message) && Intrinsics.areEqual((Object) this.token, (Object) getHardwareResponse.token) && Intrinsics.areEqual((Object) this.fromdomain, (Object) getHardwareResponse.fromdomain) && Intrinsics.areEqual((Object) this.worktime, (Object) getHardwareResponse.worktime) && Intrinsics.areEqual((Object) this.data, (Object) getHardwareResponse.data);
    }

    public int hashCode() {
        String str = this.command;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.error).hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.token;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.fromdomain;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.worktime;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<GetHardwareResponseData> list = this.data;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "GetHardwareResponse(command=" + this.command + ", error=" + this.error + ", message=" + this.message + ", token=" + this.token + ", fromdomain=" + this.fromdomain + ", worktime=" + this.worktime + ", data=" + this.data + ")";
    }

    public GetHardwareResponse(String str, int i, String str2, String str3, String str4, String str5, List<GetHardwareResponseData> list) {
        Intrinsics.checkNotNullParameter(str, "command");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(str3, "token");
        Intrinsics.checkNotNullParameter(str4, "fromdomain");
        Intrinsics.checkNotNullParameter(str5, "worktime");
        this.command = str;
        this.error = i;
        this.message = str2;
        this.token = str3;
        this.fromdomain = str4;
        this.worktime = str5;
        this.data = list;
    }

    public final String getCommand() {
        return this.command;
    }

    public final int getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getFromdomain() {
        return this.fromdomain;
    }

    public final String getWorktime() {
        return this.worktime;
    }

    public final List<GetHardwareResponseData> getData() {
        return this.data;
    }
}
