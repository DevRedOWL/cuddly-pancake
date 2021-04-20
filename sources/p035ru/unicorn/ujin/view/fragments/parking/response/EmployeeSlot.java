package p035ru.unicorn.ujin.view.fragments.parking.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/EmployeeSlot;", "", "id", "", "rentId", "", "number", "type", "employee", "Lru/unicorn/ujin/view/fragments/parking/response/EmployeeData;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/parking/response/EmployeeData;)V", "getEmployee", "()Lru/unicorn/ujin/view/fragments/parking/response/EmployeeData;", "getId", "()I", "getNumber", "()Ljava/lang/String;", "getRentId", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.EmployeeSlot */
/* compiled from: EmployeeSlotsResponse.kt */
public final class EmployeeSlot {
    private final EmployeeData employee;

    /* renamed from: id */
    private final int f6935id;
    private final String number;
    @SerializedName("rent_id")
    private final String rentId;
    private final String type;

    public static /* synthetic */ EmployeeSlot copy$default(EmployeeSlot employeeSlot, int i, String str, String str2, String str3, EmployeeData employeeData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = employeeSlot.f6935id;
        }
        if ((i2 & 2) != 0) {
            str = employeeSlot.rentId;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = employeeSlot.number;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = employeeSlot.type;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            employeeData = employeeSlot.employee;
        }
        return employeeSlot.copy(i, str4, str5, str6, employeeData);
    }

    public final int component1() {
        return this.f6935id;
    }

    public final String component2() {
        return this.rentId;
    }

    public final String component3() {
        return this.number;
    }

    public final String component4() {
        return this.type;
    }

    public final EmployeeData component5() {
        return this.employee;
    }

    public final EmployeeSlot copy(int i, String str, String str2, String str3, EmployeeData employeeData) {
        Intrinsics.checkNotNullParameter(str, "rentId");
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_NUMBER);
        Intrinsics.checkNotNullParameter(str3, "type");
        Intrinsics.checkNotNullParameter(employeeData, "employee");
        return new EmployeeSlot(i, str, str2, str3, employeeData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmployeeSlot)) {
            return false;
        }
        EmployeeSlot employeeSlot = (EmployeeSlot) obj;
        return this.f6935id == employeeSlot.f6935id && Intrinsics.areEqual((Object) this.rentId, (Object) employeeSlot.rentId) && Intrinsics.areEqual((Object) this.number, (Object) employeeSlot.number) && Intrinsics.areEqual((Object) this.type, (Object) employeeSlot.type) && Intrinsics.areEqual((Object) this.employee, (Object) employeeSlot.employee);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6935id).hashCode() * 31;
        String str = this.rentId;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.number;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        EmployeeData employeeData = this.employee;
        if (employeeData != null) {
            i = employeeData.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "EmployeeSlot(id=" + this.f6935id + ", rentId=" + this.rentId + ", number=" + this.number + ", type=" + this.type + ", employee=" + this.employee + ")";
    }

    public EmployeeSlot(int i, String str, String str2, String str3, EmployeeData employeeData) {
        Intrinsics.checkNotNullParameter(str, "rentId");
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_NUMBER);
        Intrinsics.checkNotNullParameter(str3, "type");
        Intrinsics.checkNotNullParameter(employeeData, "employee");
        this.f6935id = i;
        this.rentId = str;
        this.number = str2;
        this.type = str3;
        this.employee = employeeData;
    }

    public final int getId() {
        return this.f6935id;
    }

    public final String getRentId() {
        return this.rentId;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getType() {
        return this.type;
    }

    public final EmployeeData getEmployee() {
        return this.employee;
    }
}
