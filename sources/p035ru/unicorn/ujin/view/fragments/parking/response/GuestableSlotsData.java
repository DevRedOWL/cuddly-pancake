package p035ru.unicorn.ujin.view.fragments.parking.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u001d\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J?\u0010\u0012\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR*\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/GuestableSlotsData;", "", "zoneList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/parking/response/ZoneInfo;", "Lkotlin/collections/ArrayList;", "own", "Lru/unicorn/ujin/view/fragments/parking/response/OwnSlotsData;", "rented", "(Ljava/util/ArrayList;Lru/unicorn/ujin/view/fragments/parking/response/OwnSlotsData;Lru/unicorn/ujin/view/fragments/parking/response/OwnSlotsData;)V", "getOwn", "()Lru/unicorn/ujin/view/fragments/parking/response/OwnSlotsData;", "getRented", "getZoneList", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.GuestableSlotsData */
/* compiled from: GuestableSlotsResponse.kt */
public final class GuestableSlotsData {
    @SerializedName("own")
    private final OwnSlotsData own;
    @SerializedName("rented")
    private final OwnSlotsData rented;
    @SerializedName("zones")
    private final ArrayList<ZoneInfo> zoneList;

    public static /* synthetic */ GuestableSlotsData copy$default(GuestableSlotsData guestableSlotsData, ArrayList<ZoneInfo> arrayList, OwnSlotsData ownSlotsData, OwnSlotsData ownSlotsData2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = guestableSlotsData.zoneList;
        }
        if ((i & 2) != 0) {
            ownSlotsData = guestableSlotsData.own;
        }
        if ((i & 4) != 0) {
            ownSlotsData2 = guestableSlotsData.rented;
        }
        return guestableSlotsData.copy(arrayList, ownSlotsData, ownSlotsData2);
    }

    public final ArrayList<ZoneInfo> component1() {
        return this.zoneList;
    }

    public final OwnSlotsData component2() {
        return this.own;
    }

    public final OwnSlotsData component3() {
        return this.rented;
    }

    public final GuestableSlotsData copy(ArrayList<ZoneInfo> arrayList, OwnSlotsData ownSlotsData, OwnSlotsData ownSlotsData2) {
        return new GuestableSlotsData(arrayList, ownSlotsData, ownSlotsData2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestableSlotsData)) {
            return false;
        }
        GuestableSlotsData guestableSlotsData = (GuestableSlotsData) obj;
        return Intrinsics.areEqual((Object) this.zoneList, (Object) guestableSlotsData.zoneList) && Intrinsics.areEqual((Object) this.own, (Object) guestableSlotsData.own) && Intrinsics.areEqual((Object) this.rented, (Object) guestableSlotsData.rented);
    }

    public int hashCode() {
        ArrayList<ZoneInfo> arrayList = this.zoneList;
        int i = 0;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        OwnSlotsData ownSlotsData = this.own;
        int hashCode2 = (hashCode + (ownSlotsData != null ? ownSlotsData.hashCode() : 0)) * 31;
        OwnSlotsData ownSlotsData2 = this.rented;
        if (ownSlotsData2 != null) {
            i = ownSlotsData2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "GuestableSlotsData(zoneList=" + this.zoneList + ", own=" + this.own + ", rented=" + this.rented + ")";
    }

    public GuestableSlotsData(ArrayList<ZoneInfo> arrayList, OwnSlotsData ownSlotsData, OwnSlotsData ownSlotsData2) {
        this.zoneList = arrayList;
        this.own = ownSlotsData;
        this.rented = ownSlotsData2;
    }

    public final ArrayList<ZoneInfo> getZoneList() {
        return this.zoneList;
    }

    public final OwnSlotsData getOwn() {
        return this.own;
    }

    public final OwnSlotsData getRented() {
        return this.rented;
    }
}
