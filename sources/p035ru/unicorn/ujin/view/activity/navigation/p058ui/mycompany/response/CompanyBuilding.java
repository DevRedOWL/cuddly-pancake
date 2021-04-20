package p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/response/CompanyBuilding;", "", "id", "", "address", "buildingTitle", "complexTitle", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "getBuildingTitle", "setBuildingTitle", "getComplexTitle", "setComplexTitle", "getId", "setId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.mycompany.response.CompanyBuilding */
/* compiled from: CompanyObjectsResponse.kt */
public final class CompanyBuilding {
    private String address;
    @SerializedName("building_title")
    private String buildingTitle;
    @SerializedName("complex_title")
    private String complexTitle;

    /* renamed from: id */
    private String f6804id;

    public CompanyBuilding() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CompanyBuilding copy$default(CompanyBuilding companyBuilding, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = companyBuilding.f6804id;
        }
        if ((i & 2) != 0) {
            str2 = companyBuilding.address;
        }
        if ((i & 4) != 0) {
            str3 = companyBuilding.buildingTitle;
        }
        if ((i & 8) != 0) {
            str4 = companyBuilding.complexTitle;
        }
        return companyBuilding.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f6804id;
    }

    public final String component2() {
        return this.address;
    }

    public final String component3() {
        return this.buildingTitle;
    }

    public final String component4() {
        return this.complexTitle;
    }

    public final CompanyBuilding copy(String str, String str2, String str3, String str4) {
        return new CompanyBuilding(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanyBuilding)) {
            return false;
        }
        CompanyBuilding companyBuilding = (CompanyBuilding) obj;
        return Intrinsics.areEqual((Object) this.f6804id, (Object) companyBuilding.f6804id) && Intrinsics.areEqual((Object) this.address, (Object) companyBuilding.address) && Intrinsics.areEqual((Object) this.buildingTitle, (Object) companyBuilding.buildingTitle) && Intrinsics.areEqual((Object) this.complexTitle, (Object) companyBuilding.complexTitle);
    }

    public int hashCode() {
        String str = this.f6804id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.address;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.buildingTitle;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.complexTitle;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "CompanyBuilding(id=" + this.f6804id + ", address=" + this.address + ", buildingTitle=" + this.buildingTitle + ", complexTitle=" + this.complexTitle + ")";
    }

    public CompanyBuilding(String str, String str2, String str3, String str4) {
        this.f6804id = str;
        this.address = str2;
        this.buildingTitle = str3;
        this.complexTitle = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompanyBuilding(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final String getId() {
        return this.f6804id;
    }

    public final void setId(String str) {
        this.f6804id = str;
    }

    public final String getAddress() {
        return this.address;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final String getBuildingTitle() {
        return this.buildingTitle;
    }

    public final void setBuildingTitle(String str) {
        this.buildingTitle = str;
    }

    public final String getComplexTitle() {
        return this.complexTitle;
    }

    public final void setComplexTitle(String str) {
        this.complexTitle = str;
    }
}
