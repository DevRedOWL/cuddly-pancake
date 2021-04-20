package p035ru.unicorn.ujin.view.fragments.parking.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010)\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jª\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u00112\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u0012\u0010\u001cR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u0010\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u00068"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/response/Guest;", "", "id", "", "dateStart", "", "dateFinish", "fullname", "surname", "name", "patronymic", "phone", "brand", "licencePlate", "slot", "Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "isExpired", "", "isActive", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/parking/response/Zone;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getBrand", "()Ljava/lang/String;", "getDateFinish", "getDateStart", "getFullname", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLicencePlate", "getName", "getPatronymic", "getPhone", "getSlot", "()Lru/unicorn/ujin/view/fragments/parking/response/Zone;", "getSurname", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/parking/response/Zone;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lru/unicorn/ujin/view/fragments/parking/response/Guest;", "equals", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.response.Guest */
/* compiled from: AvailableGuestsResponse.kt */
public final class Guest {
    private final String brand;
    @SerializedName("date_to")
    private final String dateFinish;
    @SerializedName("date_from")
    private final String dateStart;
    private final String fullname;

    /* renamed from: id */
    private final Integer f6936id;
    @SerializedName("is_active")
    private final Boolean isActive;
    @SerializedName("is_expired")
    private final Boolean isExpired;
    @SerializedName("id_number")
    private final String licencePlate;
    private final String name;
    private final String patronymic;
    private final String phone;
    private final Zone slot;
    private final String surname;

    public static /* synthetic */ Guest copy$default(Guest guest, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Zone zone, Boolean bool, Boolean bool2, int i, Object obj) {
        Guest guest2 = guest;
        int i2 = i;
        return guest.copy((i2 & 1) != 0 ? guest2.f6936id : num, (i2 & 2) != 0 ? guest2.dateStart : str, (i2 & 4) != 0 ? guest2.dateFinish : str2, (i2 & 8) != 0 ? guest2.fullname : str3, (i2 & 16) != 0 ? guest2.surname : str4, (i2 & 32) != 0 ? guest2.name : str5, (i2 & 64) != 0 ? guest2.patronymic : str6, (i2 & 128) != 0 ? guest2.phone : str7, (i2 & 256) != 0 ? guest2.brand : str8, (i2 & 512) != 0 ? guest2.licencePlate : str9, (i2 & 1024) != 0 ? guest2.slot : zone, (i2 & 2048) != 0 ? guest2.isExpired : bool, (i2 & 4096) != 0 ? guest2.isActive : bool2);
    }

    public final Integer component1() {
        return this.f6936id;
    }

    public final String component10() {
        return this.licencePlate;
    }

    public final Zone component11() {
        return this.slot;
    }

    public final Boolean component12() {
        return this.isExpired;
    }

    public final Boolean component13() {
        return this.isActive;
    }

    public final String component2() {
        return this.dateStart;
    }

    public final String component3() {
        return this.dateFinish;
    }

    public final String component4() {
        return this.fullname;
    }

    public final String component5() {
        return this.surname;
    }

    public final String component6() {
        return this.name;
    }

    public final String component7() {
        return this.patronymic;
    }

    public final String component8() {
        return this.phone;
    }

    public final String component9() {
        return this.brand;
    }

    public final Guest copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Zone zone, Boolean bool, Boolean bool2) {
        return new Guest(num, str, str2, str3, str4, str5, str6, str7, str8, str9, zone, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Guest)) {
            return false;
        }
        Guest guest = (Guest) obj;
        return Intrinsics.areEqual((Object) this.f6936id, (Object) guest.f6936id) && Intrinsics.areEqual((Object) this.dateStart, (Object) guest.dateStart) && Intrinsics.areEqual((Object) this.dateFinish, (Object) guest.dateFinish) && Intrinsics.areEqual((Object) this.fullname, (Object) guest.fullname) && Intrinsics.areEqual((Object) this.surname, (Object) guest.surname) && Intrinsics.areEqual((Object) this.name, (Object) guest.name) && Intrinsics.areEqual((Object) this.patronymic, (Object) guest.patronymic) && Intrinsics.areEqual((Object) this.phone, (Object) guest.phone) && Intrinsics.areEqual((Object) this.brand, (Object) guest.brand) && Intrinsics.areEqual((Object) this.licencePlate, (Object) guest.licencePlate) && Intrinsics.areEqual((Object) this.slot, (Object) guest.slot) && Intrinsics.areEqual((Object) this.isExpired, (Object) guest.isExpired) && Intrinsics.areEqual((Object) this.isActive, (Object) guest.isActive);
    }

    public int hashCode() {
        Integer num = this.f6936id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.dateStart;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.dateFinish;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fullname;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.surname;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.name;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.patronymic;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.phone;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.brand;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.licencePlate;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Zone zone = this.slot;
        int hashCode11 = (hashCode10 + (zone != null ? zone.hashCode() : 0)) * 31;
        Boolean bool = this.isExpired;
        int hashCode12 = (hashCode11 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isActive;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        return "Guest(id=" + this.f6936id + ", dateStart=" + this.dateStart + ", dateFinish=" + this.dateFinish + ", fullname=" + this.fullname + ", surname=" + this.surname + ", name=" + this.name + ", patronymic=" + this.patronymic + ", phone=" + this.phone + ", brand=" + this.brand + ", licencePlate=" + this.licencePlate + ", slot=" + this.slot + ", isExpired=" + this.isExpired + ", isActive=" + this.isActive + ")";
    }

    public Guest(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Zone zone, Boolean bool, Boolean bool2) {
        this.f6936id = num;
        this.dateStart = str;
        this.dateFinish = str2;
        this.fullname = str3;
        this.surname = str4;
        this.name = str5;
        this.patronymic = str6;
        this.phone = str7;
        this.brand = str8;
        this.licencePlate = str9;
        this.slot = zone;
        this.isExpired = bool;
        this.isActive = bool2;
    }

    public final Integer getId() {
        return this.f6936id;
    }

    public final String getDateStart() {
        return this.dateStart;
    }

    public final String getDateFinish() {
        return this.dateFinish;
    }

    public final String getFullname() {
        return this.fullname;
    }

    public final String getSurname() {
        return this.surname;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPatronymic() {
        return this.patronymic;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getLicencePlate() {
        return this.licencePlate;
    }

    public final Zone getSlot() {
        return this.slot;
    }

    public final Boolean isExpired() {
        return this.isExpired;
    }

    public final Boolean isActive() {
        return this.isActive;
    }
}
