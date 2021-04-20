package p035ru.unicorn.ujin.view.fragments.parking.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Jn\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006)"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/EmployeeSlotsResponse;", "", "command", "", "error", "", "message", "token", "ghostToken", "fromdomain", "worktime", "data", "Lru/unicorn/ujin/view/fragments/parking/response/EmployeeSlotData;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/parking/response/EmployeeSlotData;)V", "getCommand", "()Ljava/lang/String;", "getData", "()Lru/unicorn/ujin/view/fragments/parking/response/EmployeeSlotData;", "getError", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFromdomain", "getGhostToken", "getMessage", "getToken", "getWorktime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/parking/response/EmployeeSlotData;)Lru/unicorn/ujin/view/fragments/parking/response/EmployeeSlotsResponse;", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.EmployeeSlotsResponse */
/* compiled from: EmployeeSlotsResponse.kt */
public final class EmployeeSlotsResponse {
    private final String command;
    private final EmployeeSlotData data;
    private final Integer error;
    private final String fromdomain;
    @SerializedName("ghost_token")
    private final String ghostToken;
    private final String message;
    private final String token;
    private final String worktime;

    public static /* synthetic */ EmployeeSlotsResponse copy$default(EmployeeSlotsResponse employeeSlotsResponse, String str, Integer num, String str2, String str3, String str4, String str5, String str6, EmployeeSlotData employeeSlotData, int i, Object obj) {
        EmployeeSlotsResponse employeeSlotsResponse2 = employeeSlotsResponse;
        int i2 = i;
        return employeeSlotsResponse.copy((i2 & 1) != 0 ? employeeSlotsResponse2.command : str, (i2 & 2) != 0 ? employeeSlotsResponse2.error : num, (i2 & 4) != 0 ? employeeSlotsResponse2.message : str2, (i2 & 8) != 0 ? employeeSlotsResponse2.token : str3, (i2 & 16) != 0 ? employeeSlotsResponse2.ghostToken : str4, (i2 & 32) != 0 ? employeeSlotsResponse2.fromdomain : str5, (i2 & 64) != 0 ? employeeSlotsResponse2.worktime : str6, (i2 & 128) != 0 ? employeeSlotsResponse2.data : employeeSlotData);
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

    public final EmployeeSlotData component8() {
        return this.data;
    }

    public final EmployeeSlotsResponse copy(String str, Integer num, String str2, String str3, String str4, String str5, String str6, EmployeeSlotData employeeSlotData) {
        return new EmployeeSlotsResponse(str, num, str2, str3, str4, str5, str6, employeeSlotData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmployeeSlotsResponse)) {
            return false;
        }
        EmployeeSlotsResponse employeeSlotsResponse = (EmployeeSlotsResponse) obj;
        return Intrinsics.areEqual((Object) this.command, (Object) employeeSlotsResponse.command) && Intrinsics.areEqual((Object) this.error, (Object) employeeSlotsResponse.error) && Intrinsics.areEqual((Object) this.message, (Object) employeeSlotsResponse.message) && Intrinsics.areEqual((Object) this.token, (Object) employeeSlotsResponse.token) && Intrinsics.areEqual((Object) this.ghostToken, (Object) employeeSlotsResponse.ghostToken) && Intrinsics.areEqual((Object) this.fromdomain, (Object) employeeSlotsResponse.fromdomain) && Intrinsics.areEqual((Object) this.worktime, (Object) employeeSlotsResponse.worktime) && Intrinsics.areEqual((Object) this.data, (Object) employeeSlotsResponse.data);
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
        EmployeeSlotData employeeSlotData = this.data;
        if (employeeSlotData != null) {
            i = employeeSlotData.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "EmployeeSlotsResponse(command=" + this.command + ", error=" + this.error + ", message=" + this.message + ", token=" + this.token + ", ghostToken=" + this.ghostToken + ", fromdomain=" + this.fromdomain + ", worktime=" + this.worktime + ", data=" + this.data + ")";
    }

    public EmployeeSlotsResponse(String str, Integer num, String str2, String str3, String str4, String str5, String str6, EmployeeSlotData employeeSlotData) {
        this.command = str;
        this.error = num;
        this.message = str2;
        this.token = str3;
        this.ghostToken = str4;
        this.fromdomain = str5;
        this.worktime = str6;
        this.data = employeeSlotData;
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

    public final EmployeeSlotData getData() {
        return this.data;
    }
}
