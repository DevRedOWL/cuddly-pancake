package p035ru.unicorn.ujin.view.fragments.providerService;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderInfoResponse;", "", "command", "", "data", "Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderInfoResponseData;", "error", "", "fromdomain", "message", "token", "worktime", "(Ljava/lang/String;Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderInfoResponseData;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommand", "()Ljava/lang/String;", "getData", "()Lru/unicorn/ujin/view/fragments/providerService/ActiveProviderInfoResponseData;", "getError", "()I", "getFromdomain", "getMessage", "getToken", "getWorktime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.providerService.ActiveProviderInfoResponse */
/* compiled from: ActiveProviderInfoResponse.kt */
public final class ActiveProviderInfoResponse {
    private final String command;
    private final ActiveProviderInfoResponseData data;
    private final int error;
    private final String fromdomain;
    private final String message;
    private final String token;
    private final String worktime;

    public static /* synthetic */ ActiveProviderInfoResponse copy$default(ActiveProviderInfoResponse activeProviderInfoResponse, String str, ActiveProviderInfoResponseData activeProviderInfoResponseData, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = activeProviderInfoResponse.command;
        }
        if ((i2 & 2) != 0) {
            activeProviderInfoResponseData = activeProviderInfoResponse.data;
        }
        ActiveProviderInfoResponseData activeProviderInfoResponseData2 = activeProviderInfoResponseData;
        if ((i2 & 4) != 0) {
            i = activeProviderInfoResponse.error;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = activeProviderInfoResponse.fromdomain;
        }
        String str6 = str2;
        if ((i2 & 16) != 0) {
            str3 = activeProviderInfoResponse.message;
        }
        String str7 = str3;
        if ((i2 & 32) != 0) {
            str4 = activeProviderInfoResponse.token;
        }
        String str8 = str4;
        if ((i2 & 64) != 0) {
            str5 = activeProviderInfoResponse.worktime;
        }
        return activeProviderInfoResponse.copy(str, activeProviderInfoResponseData2, i3, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.command;
    }

    public final ActiveProviderInfoResponseData component2() {
        return this.data;
    }

    public final int component3() {
        return this.error;
    }

    public final String component4() {
        return this.fromdomain;
    }

    public final String component5() {
        return this.message;
    }

    public final String component6() {
        return this.token;
    }

    public final String component7() {
        return this.worktime;
    }

    public final ActiveProviderInfoResponse copy(String str, ActiveProviderInfoResponseData activeProviderInfoResponseData, int i, String str2, String str3, String str4, String str5) {
        return new ActiveProviderInfoResponse(str, activeProviderInfoResponseData, i, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveProviderInfoResponse)) {
            return false;
        }
        ActiveProviderInfoResponse activeProviderInfoResponse = (ActiveProviderInfoResponse) obj;
        return Intrinsics.areEqual((Object) this.command, (Object) activeProviderInfoResponse.command) && Intrinsics.areEqual((Object) this.data, (Object) activeProviderInfoResponse.data) && this.error == activeProviderInfoResponse.error && Intrinsics.areEqual((Object) this.fromdomain, (Object) activeProviderInfoResponse.fromdomain) && Intrinsics.areEqual((Object) this.message, (Object) activeProviderInfoResponse.message) && Intrinsics.areEqual((Object) this.token, (Object) activeProviderInfoResponse.token) && Intrinsics.areEqual((Object) this.worktime, (Object) activeProviderInfoResponse.worktime);
    }

    public int hashCode() {
        String str = this.command;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ActiveProviderInfoResponseData activeProviderInfoResponseData = this.data;
        int hashCode2 = (((hashCode + (activeProviderInfoResponseData != null ? activeProviderInfoResponseData.hashCode() : 0)) * 31) + Integer.valueOf(this.error).hashCode()) * 31;
        String str2 = this.fromdomain;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.message;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.token;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.worktime;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "ActiveProviderInfoResponse(command=" + this.command + ", data=" + this.data + ", error=" + this.error + ", fromdomain=" + this.fromdomain + ", message=" + this.message + ", token=" + this.token + ", worktime=" + this.worktime + ")";
    }

    public ActiveProviderInfoResponse(String str, ActiveProviderInfoResponseData activeProviderInfoResponseData, int i, String str2, String str3, String str4, String str5) {
        this.command = str;
        this.data = activeProviderInfoResponseData;
        this.error = i;
        this.fromdomain = str2;
        this.message = str3;
        this.token = str4;
        this.worktime = str5;
    }

    public final String getCommand() {
        return this.command;
    }

    public final ActiveProviderInfoResponseData getData() {
        return this.data;
    }

    public final int getError() {
        return this.error;
    }

    public final String getFromdomain() {
        return this.fromdomain;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getWorktime() {
        return this.worktime;
    }
}
