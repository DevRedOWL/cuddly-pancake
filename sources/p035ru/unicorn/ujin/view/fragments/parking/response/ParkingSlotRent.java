package p035ru.unicorn.ujin.view.fragments.parking.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlotRent;", "", "startDate", "", "finishDate", "(Ljava/lang/String;Ljava/lang/String;)V", "getFinishDate", "()Ljava/lang/String;", "getStartDate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotRent */
/* compiled from: MySlotsResponse.kt */
public final class ParkingSlotRent {
    @SerializedName("finish_date")
    private final String finishDate;
    @SerializedName("start_date")
    private final String startDate;

    public static /* synthetic */ ParkingSlotRent copy$default(ParkingSlotRent parkingSlotRent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parkingSlotRent.startDate;
        }
        if ((i & 2) != 0) {
            str2 = parkingSlotRent.finishDate;
        }
        return parkingSlotRent.copy(str, str2);
    }

    public final String component1() {
        return this.startDate;
    }

    public final String component2() {
        return this.finishDate;
    }

    public final ParkingSlotRent copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "finishDate");
        return new ParkingSlotRent(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParkingSlotRent)) {
            return false;
        }
        ParkingSlotRent parkingSlotRent = (ParkingSlotRent) obj;
        return Intrinsics.areEqual((Object) this.startDate, (Object) parkingSlotRent.startDate) && Intrinsics.areEqual((Object) this.finishDate, (Object) parkingSlotRent.finishDate);
    }

    public int hashCode() {
        String str = this.startDate;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.finishDate;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ParkingSlotRent(startDate=" + this.startDate + ", finishDate=" + this.finishDate + ")";
    }

    public ParkingSlotRent(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "startDate");
        Intrinsics.checkNotNullParameter(str2, "finishDate");
        this.startDate = str;
        this.finishDate = str2;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getFinishDate() {
        return this.finishDate;
    }
}
