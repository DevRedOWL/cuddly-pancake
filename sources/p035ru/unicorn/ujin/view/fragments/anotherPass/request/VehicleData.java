package p035ru.unicorn.ujin.view.fragments.anotherPass.request;

import androidx.databinding.BaseObservable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/request/VehicleData;", "Landroidx/databinding/BaseObservable;", "brand", "", "number", "(Ljava/lang/String;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "getNumber", "setNumber", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.request.VehicleData */
/* compiled from: CreateAnotherPassRequestBody.kt */
public final class VehicleData extends BaseObservable {
    private String brand;
    @SerializedName("id_number")
    private String number;

    public static /* synthetic */ VehicleData copy$default(VehicleData vehicleData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vehicleData.brand;
        }
        if ((i & 2) != 0) {
            str2 = vehicleData.number;
        }
        return vehicleData.copy(str, str2);
    }

    public final String component1() {
        return this.brand;
    }

    public final String component2() {
        return this.number;
    }

    public final VehicleData copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_BRAND);
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_NUMBER);
        return new VehicleData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VehicleData)) {
            return false;
        }
        VehicleData vehicleData = (VehicleData) obj;
        return Intrinsics.areEqual((Object) this.brand, (Object) vehicleData.brand) && Intrinsics.areEqual((Object) this.number, (Object) vehicleData.number);
    }

    public int hashCode() {
        String str = this.brand;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.number;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VehicleData(brand=" + this.brand + ", number=" + this.number + ")";
    }

    public final String getBrand() {
        return this.brand;
    }

    public final void setBrand(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.brand = str;
    }

    public final String getNumber() {
        return this.number;
    }

    public final void setNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.number = str;
    }

    public VehicleData(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, CardFragment.ARG_BRAND);
        Intrinsics.checkNotNullParameter(str2, CardFragment.ARG_NUMBER);
        this.brand = str;
        this.number = str2;
    }
}
