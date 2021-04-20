package p035ru.unicorn.ujin.view.fragments.parking.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R*\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/ZoneInfo;", "", "zone", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "slotList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Lru/unicorn/ujin/view/fragments/parking/response/Zone;Ljava/util/ArrayList;)V", "getSlotList", "()Ljava/util/ArrayList;", "getZone", "()Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.ZoneInfo */
/* compiled from: RentableSlotsResponse.kt */
public final class ZoneInfo {
    @SerializedName("slots")
    private final ArrayList<Zone> slotList;
    private final Zone zone;

    public static /* synthetic */ ZoneInfo copy$default(ZoneInfo zoneInfo, Zone zone2, ArrayList<Zone> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            zone2 = zoneInfo.zone;
        }
        if ((i & 2) != 0) {
            arrayList = zoneInfo.slotList;
        }
        return zoneInfo.copy(zone2, arrayList);
    }

    public final Zone component1() {
        return this.zone;
    }

    public final ArrayList<Zone> component2() {
        return this.slotList;
    }

    public final ZoneInfo copy(Zone zone2, ArrayList<Zone> arrayList) {
        return new ZoneInfo(zone2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZoneInfo)) {
            return false;
        }
        ZoneInfo zoneInfo = (ZoneInfo) obj;
        return Intrinsics.areEqual((Object) this.zone, (Object) zoneInfo.zone) && Intrinsics.areEqual((Object) this.slotList, (Object) zoneInfo.slotList);
    }

    public int hashCode() {
        Zone zone2 = this.zone;
        int i = 0;
        int hashCode = (zone2 != null ? zone2.hashCode() : 0) * 31;
        ArrayList<Zone> arrayList = this.slotList;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ZoneInfo(zone=" + this.zone + ", slotList=" + this.slotList + ")";
    }

    public ZoneInfo(Zone zone2, ArrayList<Zone> arrayList) {
        this.zone = zone2;
        this.slotList = arrayList;
    }

    public final Zone getZone() {
        return this.zone;
    }

    public final ArrayList<Zone> getSlotList() {
        return this.slotList;
    }
}
