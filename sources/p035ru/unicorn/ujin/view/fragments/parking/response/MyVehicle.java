package p035ru.unicorn.ujin.view.fragments.parking.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "", "id", "", "licencePlate", "", "brand", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLicencePlate", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/unicorn/ujin/view/fragments/parking/response/MyVehicle;", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.MyVehicle */
/* compiled from: MyVehiclesResponse.kt */
public final class MyVehicle {
    private final String brand;

    /* renamed from: id */
    private final Integer f6937id;
    @SerializedName("id_number")
    private final String licencePlate;

    public static /* synthetic */ MyVehicle copy$default(MyVehicle myVehicle, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = myVehicle.f6937id;
        }
        if ((i & 2) != 0) {
            str = myVehicle.licencePlate;
        }
        if ((i & 4) != 0) {
            str2 = myVehicle.brand;
        }
        return myVehicle.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.f6937id;
    }

    public final String component2() {
        return this.licencePlate;
    }

    public final String component3() {
        return this.brand;
    }

    public final MyVehicle copy(Integer num, String str, String str2) {
        return new MyVehicle(num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyVehicle)) {
            return false;
        }
        MyVehicle myVehicle = (MyVehicle) obj;
        return Intrinsics.areEqual((Object) this.f6937id, (Object) myVehicle.f6937id) && Intrinsics.areEqual((Object) this.licencePlate, (Object) myVehicle.licencePlate) && Intrinsics.areEqual((Object) this.brand, (Object) myVehicle.brand);
    }

    public int hashCode() {
        Integer num = this.f6937id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.licencePlate;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.brand;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "MyVehicle(id=" + this.f6937id + ", licencePlate=" + this.licencePlate + ", brand=" + this.brand + ")";
    }

    public MyVehicle(Integer num, String str, String str2) {
        this.f6937id = num;
        this.licencePlate = str;
        this.brand = str2;
    }

    public final Integer getId() {
        return this.f6937id;
    }

    public final String getLicencePlate() {
        return this.licencePlate;
    }

    public final String getBrand() {
        return this.brand;
    }
}
