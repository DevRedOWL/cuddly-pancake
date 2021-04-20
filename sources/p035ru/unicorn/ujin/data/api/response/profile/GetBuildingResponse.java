package p035ru.unicorn.ujin.data.api.response.profile;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Building;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/profile/GetBuildingResponse;", "", "id", "", "complex", "Lru/unicorn/ujin/data/api/response/profile/ComplexData;", "building", "Lru/unicorn/ujin/data/realm/Building;", "entrances2", "", "", "(ILru/unicorn/ujin/data/api/response/profile/ComplexData;Lru/unicorn/ujin/data/realm/Building;Ljava/util/List;)V", "getBuilding", "()Lru/unicorn/ujin/data/realm/Building;", "getComplex", "()Lru/unicorn/ujin/data/api/response/profile/ComplexData;", "getEntrances2", "()Ljava/util/List;", "getId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.profile.GetBuildingResponse */
/* compiled from: GetBuildingResponse.kt */
public final class GetBuildingResponse {
    @SerializedName("building")
    private final Building building;
    @SerializedName("complex")
    private final ComplexData complex;
    @SerializedName("entrances2")
    private final List<String> entrances2;
    @SerializedName("id")

    /* renamed from: id */
    private final int f6622id;

    public static /* synthetic */ GetBuildingResponse copy$default(GetBuildingResponse getBuildingResponse, int i, ComplexData complexData, Building building2, List<String> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getBuildingResponse.f6622id;
        }
        if ((i2 & 2) != 0) {
            complexData = getBuildingResponse.complex;
        }
        if ((i2 & 4) != 0) {
            building2 = getBuildingResponse.building;
        }
        if ((i2 & 8) != 0) {
            list = getBuildingResponse.entrances2;
        }
        return getBuildingResponse.copy(i, complexData, building2, list);
    }

    public final int component1() {
        return this.f6622id;
    }

    public final ComplexData component2() {
        return this.complex;
    }

    public final Building component3() {
        return this.building;
    }

    public final List<String> component4() {
        return this.entrances2;
    }

    public final GetBuildingResponse copy(int i, ComplexData complexData, Building building2, List<String> list) {
        Intrinsics.checkNotNullParameter(complexData, "complex");
        Intrinsics.checkNotNullParameter(building2, "building");
        Intrinsics.checkNotNullParameter(list, "entrances2");
        return new GetBuildingResponse(i, complexData, building2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetBuildingResponse)) {
            return false;
        }
        GetBuildingResponse getBuildingResponse = (GetBuildingResponse) obj;
        return this.f6622id == getBuildingResponse.f6622id && Intrinsics.areEqual((Object) this.complex, (Object) getBuildingResponse.complex) && Intrinsics.areEqual((Object) this.building, (Object) getBuildingResponse.building) && Intrinsics.areEqual((Object) this.entrances2, (Object) getBuildingResponse.entrances2);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.f6622id).hashCode() * 31;
        ComplexData complexData = this.complex;
        int i = 0;
        int hashCode2 = (hashCode + (complexData != null ? complexData.hashCode() : 0)) * 31;
        Building building2 = this.building;
        int hashCode3 = (hashCode2 + (building2 != null ? building2.hashCode() : 0)) * 31;
        List<String> list = this.entrances2;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "GetBuildingResponse(id=" + this.f6622id + ", complex=" + this.complex + ", building=" + this.building + ", entrances2=" + this.entrances2 + ")";
    }

    public GetBuildingResponse(int i, ComplexData complexData, Building building2, List<String> list) {
        Intrinsics.checkNotNullParameter(complexData, "complex");
        Intrinsics.checkNotNullParameter(building2, "building");
        Intrinsics.checkNotNullParameter(list, "entrances2");
        this.f6622id = i;
        this.complex = complexData;
        this.building = building2;
        this.entrances2 = list;
    }

    public final int getId() {
        return this.f6622id;
    }

    public final ComplexData getComplex() {
        return this.complex;
    }

    public final Building getBuilding() {
        return this.building;
    }

    public final List<String> getEntrances2() {
        return this.entrances2;
    }
}
