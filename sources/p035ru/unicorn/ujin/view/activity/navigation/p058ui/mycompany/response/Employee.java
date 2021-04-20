package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/Employee;", "", "id", "", "fullname", "", "phone", "position", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFullname", "()Ljava/lang/String;", "setFullname", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPhone", "setPhone", "getPosition", "setPosition", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/Employee;", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.Employee */
/* compiled from: CompanyObjectsResponse.kt */
public final class Employee {
    private String fullname;
    @SerializedName("userdata_id")

    /* renamed from: id */
    private Integer f6806id;
    private String phone;
    private String position;

    public Employee() {
        this((Integer) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Employee copy$default(Employee employee, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = employee.f6806id;
        }
        if ((i & 2) != 0) {
            str = employee.fullname;
        }
        if ((i & 4) != 0) {
            str2 = employee.phone;
        }
        if ((i & 8) != 0) {
            str3 = employee.position;
        }
        return employee.copy(num, str, str2, str3);
    }

    public final Integer component1() {
        return this.f6806id;
    }

    public final String component2() {
        return this.fullname;
    }

    public final String component3() {
        return this.phone;
    }

    public final String component4() {
        return this.position;
    }

    public final Employee copy(Integer num, String str, String str2, String str3) {
        return new Employee(num, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) obj;
        return Intrinsics.areEqual((Object) this.f6806id, (Object) employee.f6806id) && Intrinsics.areEqual((Object) this.fullname, (Object) employee.fullname) && Intrinsics.areEqual((Object) this.phone, (Object) employee.phone) && Intrinsics.areEqual((Object) this.position, (Object) employee.position);
    }

    public int hashCode() {
        Integer num = this.f6806id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.fullname;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.phone;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.position;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "Employee(id=" + this.f6806id + ", fullname=" + this.fullname + ", phone=" + this.phone + ", position=" + this.position + ")";
    }

    public Employee(Integer num, String str, String str2, String str3) {
        this.f6806id = num;
        this.fullname = str;
        this.phone = str2;
        this.position = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Employee(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final Integer getId() {
        return this.f6806id;
    }

    public final void setId(Integer num) {
        this.f6806id = num;
    }

    public final String getFullname() {
        return this.fullname;
    }

    public final void setFullname(String str) {
        this.fullname = str;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final String getPosition() {
        return this.position;
    }

    public final void setPosition(String str) {
        this.position = str;
    }
}
