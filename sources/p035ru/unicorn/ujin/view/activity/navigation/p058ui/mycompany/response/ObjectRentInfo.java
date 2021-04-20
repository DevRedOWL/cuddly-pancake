package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/ObjectRentInfo;", "", "id", "", "startDate", "finishDate", "employees", "", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/Employee;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEmployees", "()Ljava/util/List;", "setEmployees", "(Ljava/util/List;)V", "getFinishDate", "()Ljava/lang/String;", "setFinishDate", "(Ljava/lang/String;)V", "getId", "setId", "getStartDate", "setStartDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.ObjectRentInfo */
/* compiled from: CompanyObjectsResponse.kt */
public final class ObjectRentInfo {
    private List<Employee> employees;
    @SerializedName("finish_date")
    private String finishDate;

    /* renamed from: id */
    private String f6807id;
    @SerializedName("start_date")
    private String startDate;

    public static /* synthetic */ ObjectRentInfo copy$default(ObjectRentInfo objectRentInfo, String str, String str2, String str3, List<Employee> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = objectRentInfo.f6807id;
        }
        if ((i & 2) != 0) {
            str2 = objectRentInfo.startDate;
        }
        if ((i & 4) != 0) {
            str3 = objectRentInfo.finishDate;
        }
        if ((i & 8) != 0) {
            list = objectRentInfo.employees;
        }
        return objectRentInfo.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.f6807id;
    }

    public final String component2() {
        return this.startDate;
    }

    public final String component3() {
        return this.finishDate;
    }

    public final List<Employee> component4() {
        return this.employees;
    }

    public final ObjectRentInfo copy(String str, String str2, String str3, List<Employee> list) {
        Intrinsics.checkNotNullParameter(list, "employees");
        return new ObjectRentInfo(str, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjectRentInfo)) {
            return false;
        }
        ObjectRentInfo objectRentInfo = (ObjectRentInfo) obj;
        return Intrinsics.areEqual((Object) this.f6807id, (Object) objectRentInfo.f6807id) && Intrinsics.areEqual((Object) this.startDate, (Object) objectRentInfo.startDate) && Intrinsics.areEqual((Object) this.finishDate, (Object) objectRentInfo.finishDate) && Intrinsics.areEqual((Object) this.employees, (Object) objectRentInfo.employees);
    }

    public int hashCode() {
        String str = this.f6807id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.startDate;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.finishDate;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<Employee> list = this.employees;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ObjectRentInfo(id=" + this.f6807id + ", startDate=" + this.startDate + ", finishDate=" + this.finishDate + ", employees=" + this.employees + ")";
    }

    public ObjectRentInfo(String str, String str2, String str3, List<Employee> list) {
        Intrinsics.checkNotNullParameter(list, "employees");
        this.f6807id = str;
        this.startDate = str2;
        this.finishDate = str3;
        this.employees = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObjectRentInfo(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, list);
    }

    public final String getId() {
        return this.f6807id;
    }

    public final void setId(String str) {
        this.f6807id = str;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final void setStartDate(String str) {
        this.startDate = str;
    }

    public final String getFinishDate() {
        return this.finishDate;
    }

    public final void setFinishDate(String str) {
        this.finishDate = str;
    }

    public final List<Employee> getEmployees() {
        return this.employees;
    }

    public final void setEmployees(List<Employee> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.employees = list;
    }
}
