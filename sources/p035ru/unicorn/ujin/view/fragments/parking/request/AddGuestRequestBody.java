package p035ru.unicorn.ujin.view.fragments.parking.request;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.card.CardFragment;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/parking/request/AddGuestRequestBody;", "", "slotId", "", "dateFrom", "", "dateTo", "surname", "name", "patronymic", "phone", "number", "brand", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "getDateFrom", "getDateTo", "getName", "getNumber", "getPatronymic", "getPhone", "getSlotId", "()I", "getSurname", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.parking.request.AddGuestRequestBody */
/* compiled from: AddGuestRequestBody.kt */
public final class AddGuestRequestBody {
    private final String brand;
    @SerializedName("date_from")
    private final String dateFrom;
    @SerializedName("date_to")
    private final String dateTo;
    private final String name;
    @SerializedName("id_number")
    private final String number;
    private final String patronymic;
    private final String phone;
    @SerializedName("slot_id")
    private final int slotId;
    private final String surname;

    public static /* synthetic */ AddGuestRequestBody copy$default(AddGuestRequestBody addGuestRequestBody, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, Object obj) {
        AddGuestRequestBody addGuestRequestBody2 = addGuestRequestBody;
        int i3 = i2;
        return addGuestRequestBody.copy((i3 & 1) != 0 ? addGuestRequestBody2.slotId : i, (i3 & 2) != 0 ? addGuestRequestBody2.dateFrom : str, (i3 & 4) != 0 ? addGuestRequestBody2.dateTo : str2, (i3 & 8) != 0 ? addGuestRequestBody2.surname : str3, (i3 & 16) != 0 ? addGuestRequestBody2.name : str4, (i3 & 32) != 0 ? addGuestRequestBody2.patronymic : str5, (i3 & 64) != 0 ? addGuestRequestBody2.phone : str6, (i3 & 128) != 0 ? addGuestRequestBody2.number : str7, (i3 & 256) != 0 ? addGuestRequestBody2.brand : str8);
    }

    public final int component1() {
        return this.slotId;
    }

    public final String component2() {
        return this.dateFrom;
    }

    public final String component3() {
        return this.dateTo;
    }

    public final String component4() {
        return this.surname;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.patronymic;
    }

    public final String component7() {
        return this.phone;
    }

    public final String component8() {
        return this.number;
    }

    public final String component9() {
        return this.brand;
    }

    public final AddGuestRequestBody copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "dateFrom");
        Intrinsics.checkNotNullParameter(str2, "dateTo");
        Intrinsics.checkNotNullParameter(str3, "surname");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, "name");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "patronymic");
        String str11 = str6;
        Intrinsics.checkNotNullParameter(str11, "phone");
        String str12 = str7;
        Intrinsics.checkNotNullParameter(str12, CardFragment.ARG_NUMBER);
        String str13 = str8;
        Intrinsics.checkNotNullParameter(str13, CardFragment.ARG_BRAND);
        return new AddGuestRequestBody(i, str, str2, str3, str9, str10, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddGuestRequestBody)) {
            return false;
        }
        AddGuestRequestBody addGuestRequestBody = (AddGuestRequestBody) obj;
        return this.slotId == addGuestRequestBody.slotId && Intrinsics.areEqual((Object) this.dateFrom, (Object) addGuestRequestBody.dateFrom) && Intrinsics.areEqual((Object) this.dateTo, (Object) addGuestRequestBody.dateTo) && Intrinsics.areEqual((Object) this.surname, (Object) addGuestRequestBody.surname) && Intrinsics.areEqual((Object) this.name, (Object) addGuestRequestBody.name) && Intrinsics.areEqual((Object) this.patronymic, (Object) addGuestRequestBody.patronymic) && Intrinsics.areEqual((Object) this.phone, (Object) addGuestRequestBody.phone) && Intrinsics.areEqual((Object) this.number, (Object) addGuestRequestBody.number) && Intrinsics.areEqual((Object) this.brand, (Object) addGuestRequestBody.brand);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.slotId).hashCode() * 31;
        String str = this.dateFrom;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.dateTo;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.surname;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.name;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.patronymic;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.phone;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.number;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.brand;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        return "AddGuestRequestBody(slotId=" + this.slotId + ", dateFrom=" + this.dateFrom + ", dateTo=" + this.dateTo + ", surname=" + this.surname + ", name=" + this.name + ", patronymic=" + this.patronymic + ", phone=" + this.phone + ", number=" + this.number + ", brand=" + this.brand + ")";
    }

    public AddGuestRequestBody(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "dateFrom");
        Intrinsics.checkNotNullParameter(str2, "dateTo");
        Intrinsics.checkNotNullParameter(str3, "surname");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(str5, "patronymic");
        Intrinsics.checkNotNullParameter(str6, "phone");
        Intrinsics.checkNotNullParameter(str7, CardFragment.ARG_NUMBER);
        Intrinsics.checkNotNullParameter(str8, CardFragment.ARG_BRAND);
        this.slotId = i;
        this.dateFrom = str;
        this.dateTo = str2;
        this.surname = str3;
        this.name = str4;
        this.patronymic = str5;
        this.phone = str6;
        this.number = str7;
        this.brand = str8;
    }

    public final int getSlotId() {
        return this.slotId;
    }

    public final String getDateFrom() {
        return this.dateFrom;
    }

    public final String getDateTo() {
        return this.dateTo;
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

    public final String getNumber() {
        return this.number;
    }

    public final String getBrand() {
        return this.brand;
    }
}
