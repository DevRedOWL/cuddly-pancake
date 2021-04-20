package p035ru.unicorn.ujin.view.fragments.parking.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Jn\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006)"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/GuestableSlotsResponse;", "", "command", "", "error", "", "message", "token", "ghostToken", "fromdomain", "worktime", "data", "Lru/unicorn/ujin/view/fragments/parking/response/GuestableSlotsData;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/parking/response/GuestableSlotsData;)V", "getCommand", "()Ljava/lang/String;", "getData", "()Lru/unicorn/ujin/view/fragments/parking/response/GuestableSlotsData;", "getError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFromdomain", "getGhostToken", "getMessage", "getToken", "getWorktime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/parking/response/GuestableSlotsData;)Lru/unicorn/ujin/view/fragments/parking/response/GuestableSlotsResponse;", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.GuestableSlotsResponse */
/* compiled from: GuestableSlotsResponse.kt */
public final class GuestableSlotsResponse {
    private final String command;
    private final GuestableSlotsData data;
    private final Integer error;
    private final String fromdomain;
    @SerializedName("ghost_token")
    private final String ghostToken;
    private final String message;
    private final String token;
    private final String worktime;

    public static /* synthetic */ GuestableSlotsResponse copy$default(GuestableSlotsResponse guestableSlotsResponse, String str, Integer num, String str2, String str3, String str4, String str5, String str6, GuestableSlotsData guestableSlotsData, int i, Object obj) {
        GuestableSlotsResponse guestableSlotsResponse2 = guestableSlotsResponse;
        int i2 = i;
        return guestableSlotsResponse.copy((i2 & 1) != 0 ? guestableSlotsResponse2.command : str, (i2 & 2) != 0 ? guestableSlotsResponse2.error : num, (i2 & 4) != 0 ? guestableSlotsResponse2.message : str2, (i2 & 8) != 0 ? guestableSlotsResponse2.token : str3, (i2 & 16) != 0 ? guestableSlotsResponse2.ghostToken : str4, (i2 & 32) != 0 ? guestableSlotsResponse2.fromdomain : str5, (i2 & 64) != 0 ? guestableSlotsResponse2.worktime : str6, (i2 & 128) != 0 ? guestableSlotsResponse2.data : guestableSlotsData);
    }

    public final String component1() {
        return this.command;
    }

    public final Integer component2() {
        return this.error;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.token;
    }

    public final String component5() {
        return this.ghostToken;
    }

    public final String component6() {
        return this.fromdomain;
    }

    public final String component7() {
        return this.worktime;
    }

    public final GuestableSlotsData component8() {
        return this.data;
    }

    public final GuestableSlotsResponse copy(String str, Integer num, String str2, String str3, String str4, String str5, String str6, GuestableSlotsData guestableSlotsData) {
        return new GuestableSlotsResponse(str, num, str2, str3, str4, str5, str6, guestableSlotsData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestableSlotsResponse)) {
            return false;
        }
        GuestableSlotsResponse guestableSlotsResponse = (GuestableSlotsResponse) obj;
        return Intrinsics.areEqual((Object) this.command, (Object) guestableSlotsResponse.command) && Intrinsics.areEqual((Object) this.error, (Object) guestableSlotsResponse.error) && Intrinsics.areEqual((Object) this.message, (Object) guestableSlotsResponse.message) && Intrinsics.areEqual((Object) this.token, (Object) guestableSlotsResponse.token) && Intrinsics.areEqual((Object) this.ghostToken, (Object) guestableSlotsResponse.ghostToken) && Intrinsics.areEqual((Object) this.fromdomain, (Object) guestableSlotsResponse.fromdomain) && Intrinsics.areEqual((Object) this.worktime, (Object) guestableSlotsResponse.worktime) && Intrinsics.areEqual((Object) this.data, (Object) guestableSlotsResponse.data);
    }

    public int hashCode() {
        String str = this.command;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.error;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.message;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.ghostToken;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.fromdomain;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.worktime;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        GuestableSlotsData guestableSlotsData = this.data;
        if (guestableSlotsData != null) {
            i = guestableSlotsData.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "GuestableSlotsResponse(command=" + this.command + ", error=" + this.error + ", message=" + this.message + ", token=" + this.token + ", ghostToken=" + this.ghostToken + ", fromdomain=" + this.fromdomain + ", worktime=" + this.worktime + ", data=" + this.data + ")";
    }

    public GuestableSlotsResponse(String str, Integer num, String str2, String str3, String str4, String str5, String str6, GuestableSlotsData guestableSlotsData) {
        this.command = str;
        this.error = num;
        this.message = str2;
        this.token = str3;
        this.ghostToken = str4;
        this.fromdomain = str5;
        this.worktime = str6;
        this.data = guestableSlotsData;
    }

    public final String getCommand() {
        return this.command;
    }

    public final Integer getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getGhostToken() {
        return this.ghostToken;
    }

    public final String getFromdomain() {
        return this.fromdomain;
    }

    public final String getWorktime() {
        return this.worktime;
    }

    public final GuestableSlotsData getData() {
        return this.data;
    }
}
