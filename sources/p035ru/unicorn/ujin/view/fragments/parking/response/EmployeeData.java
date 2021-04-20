package p035ru.unicorn.ujin.view.fragments.parking.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/EmployeeData;", "", "id", "", "fullname", "(Ljava/lang/String;Ljava/lang/String;)V", "getFullname", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.EmployeeData */
/* compiled from: EmployeeSlotsResponse.kt */
public final class EmployeeData {
    private final String fullname;

    /* renamed from: id */
    private final String f6934id;

    public static /* synthetic */ EmployeeData copy$default(EmployeeData employeeData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = employeeData.f6934id;
        }
        if ((i & 2) != 0) {
            str2 = employeeData.fullname;
        }
        return employeeData.copy(str, str2);
    }

    public final String component1() {
        return this.f6934id;
    }

    public final String component2() {
        return this.fullname;
    }

    public final EmployeeData copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, UserProfile.Fields.fullname);
        return new EmployeeData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmployeeData)) {
            return false;
        }
        EmployeeData employeeData = (EmployeeData) obj;
        return Intrinsics.areEqual((Object) this.f6934id, (Object) employeeData.f6934id) && Intrinsics.areEqual((Object) this.fullname, (Object) employeeData.fullname);
    }

    public int hashCode() {
        String str = this.f6934id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.fullname;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "EmployeeData(id=" + this.f6934id + ", fullname=" + this.fullname + ")";
    }

    public EmployeeData(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, UserProfile.Fields.fullname);
        this.f6934id = str;
        this.fullname = str2;
    }

    public final String getId() {
        return this.f6934id;
    }

    public final String getFullname() {
        return this.fullname;
    }
}
