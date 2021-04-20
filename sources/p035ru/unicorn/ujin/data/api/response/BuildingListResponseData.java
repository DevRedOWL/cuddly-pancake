package p035ru.unicorn.ujin.data.api.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.fragments.searchFilter.Building;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R*\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/BuildingListResponseData;", "", "token", "", "buildingList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/searchFilter/Building;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getBuildingList", "()Ljava/util/ArrayList;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.BuildingListResponseData */
/* compiled from: BuildingListResponse.kt */
public final class BuildingListResponseData {
    @SerializedName("building")
    private final ArrayList<Building> buildingList;
    private final String token;

    public static /* synthetic */ BuildingListResponseData copy$default(BuildingListResponseData buildingListResponseData, String str, ArrayList<Building> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildingListResponseData.token;
        }
        if ((i & 2) != 0) {
            arrayList = buildingListResponseData.buildingList;
        }
        return buildingListResponseData.copy(str, arrayList);
    }

    public final String component1() {
        return this.token;
    }

    public final ArrayList<Building> component2() {
        return this.buildingList;
    }

    public final BuildingListResponseData copy(String str, ArrayList<Building> arrayList) {
        Intrinsics.checkNotNullParameter(str, "token");
        return new BuildingListResponseData(str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuildingListResponseData)) {
            return false;
        }
        BuildingListResponseData buildingListResponseData = (BuildingListResponseData) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) buildingListResponseData.token) && Intrinsics.areEqual((Object) this.buildingList, (Object) buildingListResponseData.buildingList);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<Building> arrayList = this.buildingList;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "BuildingListResponseData(token=" + this.token + ", buildingList=" + this.buildingList + ")";
    }

    public BuildingListResponseData(String str, ArrayList<Building> arrayList) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.token = str;
        this.buildingList = arrayList;
    }

    public final String getToken() {
        return this.token;
    }

    public final ArrayList<Building> getBuildingList() {
        return this.buildingList;
    }
}
