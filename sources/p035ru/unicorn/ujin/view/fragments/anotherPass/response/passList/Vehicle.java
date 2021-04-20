package p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Vehicle;", "", "brand", "", "id", "", "id_number", "(Ljava/lang/String;ILjava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "getId", "()I", "getId_number", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Vehicle */
/* compiled from: Vehicle.kt */
public final class Vehicle {
    private final String brand;

    /* renamed from: id */
    private final int f6917id;
    private final String id_number;

    public static /* synthetic */ Vehicle copy$default(Vehicle vehicle, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = vehicle.brand;
        }
        if ((i2 & 2) != 0) {
            i = vehicle.f6917id;
        }
        if ((i2 & 4) != 0) {
            str2 = vehicle.id_number;
        }
        return vehicle.copy(str, i, str2);
    }

    public final String component1() {
        return this.brand;
    }

    public final int component2() {
        return this.f6917id;
    }

    public final String component3() {
        return this.id_number;
    }

    public final Vehicle copy(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_BRAND);
        Intrinsics.checkNotNullParameter(str2, "id_number");
        return new Vehicle(str, i, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vehicle)) {
            return false;
        }
        Vehicle vehicle = (Vehicle) obj;
        return Intrinsics.areEqual((Object) this.brand, (Object) vehicle.brand) && this.f6917id == vehicle.f6917id && Intrinsics.areEqual((Object) this.id_number, (Object) vehicle.id_number);
    }

    public int hashCode() {
        String str = this.brand;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.f6917id).hashCode()) * 31;
        String str2 = this.id_number;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Vehicle(brand=" + this.brand + ", id=" + this.f6917id + ", id_number=" + this.id_number + ")";
    }

    public Vehicle(String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_BRAND);
        Intrinsics.checkNotNullParameter(str2, "id_number");
        this.brand = str;
        this.f6917id = i;
        this.id_number = str2;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final int getId() {
        return this.f6917id;
    }

    public final String getId_number() {
        return this.id_number;
    }
}
