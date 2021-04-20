package p035ru.unicorn.ujin.data.api.response.authorization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/authorization/SendingCodeResponse;", "", "command", "", "error", "", "message", "fromdomain", "worktime", "data", "Lru/unicorn/ujin/data/api/response/authorization/SendingCodeDataResponse;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/data/api/response/authorization/SendingCodeDataResponse;)V", "getCommand", "()Ljava/lang/String;", "getData", "()Lru/unicorn/ujin/data/api/response/authorization/SendingCodeDataResponse;", "getError", "()I", "getFromdomain", "getMessage", "getWorktime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.authorization.SendingCodeResponse */
/* compiled from: SendingCodeResponse.kt */
public final class SendingCodeResponse {
    private final String command;
    private final SendingCodeDataResponse data;
    private final int error;
    private final String fromdomain;
    private final String message;
    private final String worktime;

    public static /* synthetic */ SendingCodeResponse copy$default(SendingCodeResponse sendingCodeResponse, String str, int i, String str2, String str3, String str4, SendingCodeDataResponse sendingCodeDataResponse, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sendingCodeResponse.command;
        }
        if ((i2 & 2) != 0) {
            i = sendingCodeResponse.error;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = sendingCodeResponse.message;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = sendingCodeResponse.fromdomain;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = sendingCodeResponse.worktime;
        }
        String str7 = str4;
        if ((i2 & 32) != 0) {
            sendingCodeDataResponse = sendingCodeResponse.data;
        }
        return sendingCodeResponse.copy(str, i3, str5, str6, str7, sendingCodeDataResponse);
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
        return this.fromdomain;
    }

    public final String component5() {
        return this.worktime;
    }

    public final SendingCodeDataResponse component6() {
        return this.data;
    }

    public final SendingCodeResponse copy(String str, int i, String str2, String str3, String str4, SendingCodeDataResponse sendingCodeDataResponse) {
        Intrinsics.checkNotNullParameter(str, "command");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(str3, "fromdomain");
        Intrinsics.checkNotNullParameter(str4, "worktime");
        return new SendingCodeResponse(str, i, str2, str3, str4, sendingCodeDataResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendingCodeResponse)) {
            return false;
        }
        SendingCodeResponse sendingCodeResponse = (SendingCodeResponse) obj;
        return Intrinsics.areEqual((Object) this.command, (Object) sendingCodeResponse.command) && this.error == sendingCodeResponse.error && Intrinsics.areEqual((Object) this.message, (Object) sendingCodeResponse.message) && Intrinsics.areEqual((Object) this.fromdomain, (Object) sendingCodeResponse.fromdomain) && Intrinsics.areEqual((Object) this.worktime, (Object) sendingCodeResponse.worktime) && Intrinsics.areEqual((Object) this.data, (Object) sendingCodeResponse.data);
    }

    public int hashCode() {
        String str = this.command;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.error).hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fromdomain;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.worktime;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        SendingCodeDataResponse sendingCodeDataResponse = this.data;
        if (sendingCodeDataResponse != null) {
            i = sendingCodeDataResponse.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "SendingCodeResponse(command=" + this.command + ", error=" + this.error + ", message=" + this.message + ", fromdomain=" + this.fromdomain + ", worktime=" + this.worktime + ", data=" + this.data + ")";
    }

    public SendingCodeResponse(String str, int i, String str2, String str3, String str4, SendingCodeDataResponse sendingCodeDataResponse) {
        Intrinsics.checkNotNullParameter(str, "command");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(str3, "fromdomain");
        Intrinsics.checkNotNullParameter(str4, "worktime");
        this.command = str;
        this.error = i;
        this.message = str2;
        this.fromdomain = str3;
        this.worktime = str4;
        this.data = sendingCodeDataResponse;
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

    public final String getFromdomain() {
        return this.fromdomain;
    }

    public final String getWorktime() {
        return this.worktime;
    }

    public final SendingCodeDataResponse getData() {
        return this.data;
    }
}
