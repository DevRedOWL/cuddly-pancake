package p035ru.unicorn.ujin.view.fragments.parking.response;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u000b\u0012\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u000b¢\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u001d\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u001d\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u000bHÆ\u0003J\u001d\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u000bHÆ\u0003J°\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u000b2\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u000bHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\rHÖ\u0001R*\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R*\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0013\u0018\u0001`\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R*\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "", "id", "", "ownerId", "parkingLotId", "zone", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "detailedInfoList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/parking/response/DetailedInfo;", "Lkotlin/collections/ArrayList;", "number", "", "state", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlotState;", "vehicleList", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingVehicle;", "slotRentList", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlotRent;", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/unicorn/ujin/view/fragments/parking/response/Zone;Ljava/util/ArrayList;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlotState;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getDetailedInfoList", "()Ljava/util/ArrayList;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNumber", "()Ljava/lang/String;", "getOwnerId", "getParkingLotId", "getSlotRentList", "getState", "()Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlotState;", "getVehicleList", "getZone", "()Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lru/unicorn/ujin/view/fragments/parking/response/Zone;Ljava/util/ArrayList;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlotState;Ljava/util/ArrayList;Ljava/util/ArrayList;)Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot */
/* compiled from: MySlotsResponse.kt */
public final class ParkingSlot {
    @SerializedName("info")
    private final ArrayList<DetailedInfo> detailedInfoList;

    /* renamed from: id */
    private final Integer f6938id;
    private final String number;
    @SerializedName("owner_id")
    private final Integer ownerId;
    @SerializedName("parking_lot_id")
    private final Integer parkingLotId;
    @SerializedName("slot_rents")
    private final ArrayList<ParkingSlotRent> slotRentList;
    private final ParkingSlotState state;
    @SerializedName("vehicles")
    private final ArrayList<ParkingVehicle> vehicleList;
    private final Zone zone;

    public static /* synthetic */ ParkingSlot copy$default(ParkingSlot parkingSlot, Integer num, Integer num2, Integer num3, Zone zone2, ArrayList arrayList, String str, ParkingSlotState parkingSlotState, ArrayList arrayList2, ArrayList arrayList3, int i, Object obj) {
        ParkingSlot parkingSlot2 = parkingSlot;
        int i2 = i;
        return parkingSlot.copy((i2 & 1) != 0 ? parkingSlot2.f6938id : num, (i2 & 2) != 0 ? parkingSlot2.ownerId : num2, (i2 & 4) != 0 ? parkingSlot2.parkingLotId : num3, (i2 & 8) != 0 ? parkingSlot2.zone : zone2, (i2 & 16) != 0 ? parkingSlot2.detailedInfoList : arrayList, (i2 & 32) != 0 ? parkingSlot2.number : str, (i2 & 64) != 0 ? parkingSlot2.state : parkingSlotState, (i2 & 128) != 0 ? parkingSlot2.vehicleList : arrayList2, (i2 & 256) != 0 ? parkingSlot2.slotRentList : arrayList3);
    }

    public final Integer component1() {
        return this.f6938id;
    }

    public final Integer component2() {
        return this.ownerId;
    }

    public final Integer component3() {
        return this.parkingLotId;
    }

    public final Zone component4() {
        return this.zone;
    }

    public final ArrayList<DetailedInfo> component5() {
        return this.detailedInfoList;
    }

    public final String component6() {
        return this.number;
    }

    public final ParkingSlotState component7() {
        return this.state;
    }

    public final ArrayList<ParkingVehicle> component8() {
        return this.vehicleList;
    }

    public final ArrayList<ParkingSlotRent> component9() {
        return this.slotRentList;
    }

    public final ParkingSlot copy(Integer num, Integer num2, Integer num3, Zone zone2, ArrayList<DetailedInfo> arrayList, String str, ParkingSlotState parkingSlotState, ArrayList<ParkingVehicle> arrayList2, ArrayList<ParkingSlotRent> arrayList3) {
        return new ParkingSlot(num, num2, num3, zone2, arrayList, str, parkingSlotState, arrayList2, arrayList3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParkingSlot)) {
            return false;
        }
        ParkingSlot parkingSlot = (ParkingSlot) obj;
        return Intrinsics.areEqual((Object) this.f6938id, (Object) parkingSlot.f6938id) && Intrinsics.areEqual((Object) this.ownerId, (Object) parkingSlot.ownerId) && Intrinsics.areEqual((Object) this.parkingLotId, (Object) parkingSlot.parkingLotId) && Intrinsics.areEqual((Object) this.zone, (Object) parkingSlot.zone) && Intrinsics.areEqual((Object) this.detailedInfoList, (Object) parkingSlot.detailedInfoList) && Intrinsics.areEqual((Object) this.number, (Object) parkingSlot.number) && Intrinsics.areEqual((Object) this.state, (Object) parkingSlot.state) && Intrinsics.areEqual((Object) this.vehicleList, (Object) parkingSlot.vehicleList) && Intrinsics.areEqual((Object) this.slotRentList, (Object) parkingSlot.slotRentList);
    }

    public int hashCode() {
        Integer num = this.f6938id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.ownerId;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.parkingLotId;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Zone zone2 = this.zone;
        int hashCode4 = (hashCode3 + (zone2 != null ? zone2.hashCode() : 0)) * 31;
        ArrayList<DetailedInfo> arrayList = this.detailedInfoList;
        int hashCode5 = (hashCode4 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str = this.number;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        ParkingSlotState parkingSlotState = this.state;
        int hashCode7 = (hashCode6 + (parkingSlotState != null ? parkingSlotState.hashCode() : 0)) * 31;
        ArrayList<ParkingVehicle> arrayList2 = this.vehicleList;
        int hashCode8 = (hashCode7 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        ArrayList<ParkingSlotRent> arrayList3 = this.slotRentList;
        if (arrayList3 != null) {
            i = arrayList3.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        return "ParkingSlot(id=" + this.f6938id + ", ownerId=" + this.ownerId + ", parkingLotId=" + this.parkingLotId + ", zone=" + this.zone + ", detailedInfoList=" + this.detailedInfoList + ", number=" + this.number + ", state=" + this.state + ", vehicleList=" + this.vehicleList + ", slotRentList=" + this.slotRentList + ")";
    }

    public ParkingSlot(Integer num, Integer num2, Integer num3, Zone zone2, ArrayList<DetailedInfo> arrayList, String str, ParkingSlotState parkingSlotState, ArrayList<ParkingVehicle> arrayList2, ArrayList<ParkingSlotRent> arrayList3) {
        this.f6938id = num;
        this.ownerId = num2;
        this.parkingLotId = num3;
        this.zone = zone2;
        this.detailedInfoList = arrayList;
        this.number = str;
        this.state = parkingSlotState;
        this.vehicleList = arrayList2;
        this.slotRentList = arrayList3;
    }

    public final Integer getId() {
        return this.f6938id;
    }

    public final Integer getOwnerId() {
        return this.ownerId;
    }

    public final Integer getParkingLotId() {
        return this.parkingLotId;
    }

    public final Zone getZone() {
        return this.zone;
    }

    public final ArrayList<DetailedInfo> getDetailedInfoList() {
        return this.detailedInfoList;
    }

    public final String getNumber() {
        return this.number;
    }

    public final ParkingSlotState getState() {
        return this.state;
    }

    public final ArrayList<ParkingVehicle> getVehicleList() {
        return this.vehicleList;
    }

    public final ArrayList<ParkingSlotRent> getSlotRentList() {
        return this.slotRentList;
    }
}
