package p035ru.unicorn.ujin.view.fragments.parking.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.entity.schema.Schema;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlotState;", "", "slug", "", "vehicle", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingVehicle;", "(Ljava/lang/String;Lru/unicorn/ujin/view/fragments/parking/response/ParkingVehicle;)V", "getSlug", "()Ljava/lang/String;", "getVehicle", "()Lru/unicorn/ujin/view/fragments/parking/response/ParkingVehicle;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Slug", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState */
/* compiled from: MySlotsResponse.kt */
public final class ParkingSlotState {
    private final String slug;
    private final ParkingVehicle vehicle;

    public static /* synthetic */ ParkingSlotState copy$default(ParkingSlotState parkingSlotState, String str, ParkingVehicle parkingVehicle, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parkingSlotState.slug;
        }
        if ((i & 2) != 0) {
            parkingVehicle = parkingSlotState.vehicle;
        }
        return parkingSlotState.copy(str, parkingVehicle);
    }

    public final String component1() {
        return this.slug;
    }

    public final ParkingVehicle component2() {
        return this.vehicle;
    }

    public final ParkingSlotState copy(String str, ParkingVehicle parkingVehicle) {
        return new ParkingSlotState(str, parkingVehicle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParkingSlotState)) {
            return false;
        }
        ParkingSlotState parkingSlotState = (ParkingSlotState) obj;
        return Intrinsics.areEqual((Object) this.slug, (Object) parkingSlotState.slug) && Intrinsics.areEqual((Object) this.vehicle, (Object) parkingSlotState.vehicle);
    }

    public int hashCode() {
        String str = this.slug;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ParkingVehicle parkingVehicle = this.vehicle;
        if (parkingVehicle != null) {
            i = parkingVehicle.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ParkingSlotState(slug=" + this.slug + ", vehicle=" + this.vehicle + ")";
    }

    public ParkingSlotState(String str, ParkingVehicle parkingVehicle) {
        this.slug = str;
        this.vehicle = parkingVehicle;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final ParkingVehicle getVehicle() {
        return this.vehicle;
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlotState$Slug;", "", "()V", "empty", "", "getEmpty", "()Ljava/lang/String;", "noInfo", "getNoInfo", "taken", "getTaken", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.parking.response.ParkingSlotState$Slug */
    /* compiled from: MySlotsResponse.kt */
    public static final class Slug {
        public static final Slug INSTANCE = new Slug();
        private static final String empty = Schema.EMPTY;
        private static final String noInfo = "no_information";
        private static final String taken = "taken";

        private Slug() {
        }

        public final String getTaken() {
            return taken;
        }

        public final String getEmpty() {
            return empty;
        }

        public final String getNoInfo() {
            return noInfo;
        }
    }
}
