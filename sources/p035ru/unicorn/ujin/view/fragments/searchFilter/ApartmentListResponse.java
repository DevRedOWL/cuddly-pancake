package p035ru.unicorn.ujin.view.fragments.searchFilter;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListResponse;", "", "command", "", "error", "", "message", "token", "ghostToken", "fromdomain", "worktime", "data", "Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListResponseData;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListResponseData;)V", "getCommand", "()Ljava/lang/String;", "getData", "()Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListResponseData;", "getError", "()I", "getFromdomain", "getGhostToken", "getMessage", "getToken", "getWorktime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.ApartmentListResponse */
/* compiled from: ApartmentListResponse.kt */
public final class ApartmentListResponse {
    private final String command;
    private final ApartmentListResponseData data;
    private final int error;
    private final String fromdomain;
    @SerializedName("ghost_token")
    private final String ghostToken;
    private final String message;
    private final String token;
    private final String worktime;

    public static /* synthetic */ ApartmentListResponse copy$default(ApartmentListResponse apartmentListResponse, String str, int i, String str2, String str3, String str4, String str5, String str6, ApartmentListResponseData apartmentListResponseData, int i2, Object obj) {
        ApartmentListResponse apartmentListResponse2 = apartmentListResponse;
        int i3 = i2;
        return apartmentListResponse.copy((i3 & 1) != 0 ? apartmentListResponse2.command : str, (i3 & 2) != 0 ? apartmentListResponse2.error : i, (i3 & 4) != 0 ? apartmentListResponse2.message : str2, (i3 & 8) != 0 ? apartmentListResponse2.token : str3, (i3 & 16) != 0 ? apartmentListResponse2.ghostToken : str4, (i3 & 32) != 0 ? apartmentListResponse2.fromdomain : str5, (i3 & 64) != 0 ? apartmentListResponse2.worktime : str6, (i3 & 128) != 0 ? apartmentListResponse2.data : apartmentListResponseData);
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
        return this.ghostToken;
    }

    public final String component6() {
        return this.fromdomain;
    }

    public final String component7() {
        return this.worktime;
    }

    public final ApartmentListResponseData component8() {
        return this.data;
    }

    public final ApartmentListResponse copy(String str, int i, String str2, String str3, String str4, String str5, String str6, ApartmentListResponseData apartmentListResponseData) {
        Intrinsics.checkNotNullParameter(str, "command");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(str3, "token");
        String str7 = str5;
        Intrinsics.checkNotNullParameter(str7, "fromdomain");
        String str8 = str6;
        Intrinsics.checkNotNullParameter(str8, "worktime");
        ApartmentListResponseData apartmentListResponseData2 = apartmentListResponseData;
        Intrinsics.checkNotNullParameter(apartmentListResponseData2, "data");
        return new ApartmentListResponse(str, i, str2, str3, str4, str7, str8, apartmentListResponseData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApartmentListResponse)) {
            return false;
        }
        ApartmentListResponse apartmentListResponse = (ApartmentListResponse) obj;
        return Intrinsics.areEqual((Object) this.command, (Object) apartmentListResponse.command) && this.error == apartmentListResponse.error && Intrinsics.areEqual((Object) this.message, (Object) apartmentListResponse.message) && Intrinsics.areEqual((Object) this.token, (Object) apartmentListResponse.token) && Intrinsics.areEqual((Object) this.ghostToken, (Object) apartmentListResponse.ghostToken) && Intrinsics.areEqual((Object) this.fromdomain, (Object) apartmentListResponse.fromdomain) && Intrinsics.areEqual((Object) this.worktime, (Object) apartmentListResponse.worktime) && Intrinsics.areEqual((Object) this.data, (Object) apartmentListResponse.data);
    }

    public int hashCode() {
        String str = this.command;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.error).hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.token;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.ghostToken;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.fromdomain;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.worktime;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        ApartmentListResponseData apartmentListResponseData = this.data;
        if (apartmentListResponseData != null) {
            i = apartmentListResponseData.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "ApartmentListResponse(command=" + this.command + ", error=" + this.error + ", message=" + this.message + ", token=" + this.token + ", ghostToken=" + this.ghostToken + ", fromdomain=" + this.fromdomain + ", worktime=" + this.worktime + ", data=" + this.data + ")";
    }

    public ApartmentListResponse(String str, int i, String str2, String str3, String str4, String str5, String str6, ApartmentListResponseData apartmentListResponseData) {
        Intrinsics.checkNotNullParameter(str, "command");
        Intrinsics.checkNotNullParameter(str2, "message");
        Intrinsics.checkNotNullParameter(str3, "token");
        Intrinsics.checkNotNullParameter(str5, "fromdomain");
        Intrinsics.checkNotNullParameter(str6, "worktime");
        Intrinsics.checkNotNullParameter(apartmentListResponseData, "data");
        this.command = str;
        this.error = i;
        this.message = str2;
        this.token = str3;
        this.ghostToken = str4;
        this.fromdomain = str5;
        this.worktime = str6;
        this.data = apartmentListResponseData;
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

    public final String getGhostToken() {
        return this.ghostToken;
    }

    public final String getFromdomain() {
        return this.fromdomain;
    }

    public final String getWorktime() {
        return this.worktime;
    }

    public final ApartmentListResponseData getData() {
        return this.data;
    }
}
