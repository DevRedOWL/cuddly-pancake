package p035ru.unicorn.ujin.view.fragments.parking.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/request/AttachVehicleRequestBody;", "", "vehicleId", "", "slotId", "(II)V", "getSlotId", "()I", "getVehicleId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.request.AttachVehicleRequestBody */
/* compiled from: AttachVehicleRequestBody.kt */
public final class AttachVehicleRequestBody {
    @SerializedName("parking_slot_id")
    private final int slotId;
    @SerializedName("vehicle_id")
    private final int vehicleId;

    public static /* synthetic */ AttachVehicleRequestBody copy$default(AttachVehicleRequestBody attachVehicleRequestBody, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = attachVehicleRequestBody.vehicleId;
        }
        if ((i3 & 2) != 0) {
            i2 = attachVehicleRequestBody.slotId;
        }
        return attachVehicleRequestBody.copy(i, i2);
    }

    public final int component1() {
        return this.vehicleId;
    }

    public final int component2() {
        return this.slotId;
    }

    public final AttachVehicleRequestBody copy(int i, int i2) {
        return new AttachVehicleRequestBody(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachVehicleRequestBody)) {
            return false;
        }
        AttachVehicleRequestBody attachVehicleRequestBody = (AttachVehicleRequestBody) obj;
        return this.vehicleId == attachVehicleRequestBody.vehicleId && this.slotId == attachVehicleRequestBody.slotId;
    }

    public int hashCode() {
        return (Integer.valueOf(this.vehicleId).hashCode() * 31) + Integer.valueOf(this.slotId).hashCode();
    }

    public String toString() {
        return "AttachVehicleRequestBody(vehicleId=" + this.vehicleId + ", slotId=" + this.slotId + ")";
    }

    public AttachVehicleRequestBody(int i, int i2) {
        this.vehicleId = i;
        this.slotId = i2;
    }

    public final int getVehicleId() {
        return this.vehicleId;
    }

    public final int getSlotId() {
        return this.slotId;
    }
}
