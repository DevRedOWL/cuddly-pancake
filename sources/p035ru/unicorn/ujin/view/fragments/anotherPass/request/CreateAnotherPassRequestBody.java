package p035ru.unicorn.ujin.view.fragments.anotherPass.request;

import androidx.databinding.BaseObservable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0012HÆ\u0003J\u001d\u0010O\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u0016HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J÷\u0001\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010_HÖ\u0003J\t\u0010`\u001a\u00020\u0012HÖ\u0001J\t\u0010a\u001a\u00020\u0003HÖ\u0001R \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u000f\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR \u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR2\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0019\u0018\u0001`\u00168\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u0010\u001fR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u001d\"\u0004\b=\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001d\"\u0004\b?\u0010\u001fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u001d\"\u0004\bC\u0010\u001fR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001d\"\u0004\bE\u0010\u001fR.\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014j\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00101\"\u0004\bG\u00103¨\u0006b"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/request/CreateAnotherPassRequestBody;", "Landroidx/databinding/BaseObservable;", "phone", "", "name", "surname", "patronymic", "company", "enterpriseId", "slotId", "dateFrom", "dateTo", "timeFrom", "timeTo", "personsCount", "comment", "strategy", "category", "", "vehicles", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/view/fragments/anotherPass/request/VehicleData;", "Lkotlin/collections/ArrayList;", "email", "identityDocuments", "Lru/unicorn/ujin/view/fragments/anotherPass/request/IdentityDocument;", "birthday", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "getBirthday", "()Ljava/lang/String;", "setBirthday", "(Ljava/lang/String;)V", "getCategory", "()I", "setCategory", "(I)V", "getComment", "setComment", "getCompany", "setCompany", "getDateFrom", "setDateFrom", "getDateTo", "setDateTo", "getEmail", "setEmail", "getEnterpriseId", "setEnterpriseId", "getIdentityDocuments", "()Ljava/util/ArrayList;", "setIdentityDocuments", "(Ljava/util/ArrayList;)V", "getName", "setName", "getPatronymic", "setPatronymic", "getPersonsCount", "setPersonsCount", "getPhone", "setPhone", "getSlotId", "setSlotId", "getStrategy", "setStrategy", "getSurname", "setSurname", "getTimeFrom", "setTimeFrom", "getTimeTo", "setTimeTo", "getVehicles", "setVehicles", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.request.CreateAnotherPassRequestBody */
/* compiled from: CreateAnotherPassRequestBody.kt */
public final class CreateAnotherPassRequestBody extends BaseObservable {
    @SerializedName("user_birthday")
    private String birthday;
    private int category;
    private String comment;
    @SerializedName("user_company_name")
    private String company;
    @SerializedName("active_from")
    private String dateFrom;
    @SerializedName("active_to")
    private String dateTo;
    @SerializedName("user_email")
    private String email;
    @SerializedName("enterprise_id")
    private String enterpriseId;
    @SerializedName("identity_documents")
    private ArrayList<IdentityDocument> identityDocuments;
    @SerializedName("user_name")
    private String name;
    @SerializedName("user_patronymic")
    private String patronymic;
    @SerializedName("persons_count")
    private String personsCount;
    @SerializedName("user_phone")
    private String phone;
    @SerializedName("slot_id")
    private String slotId;
    private String strategy;
    @SerializedName("user_surname")
    private String surname;
    @SerializedName("time_from")
    private String timeFrom;
    @SerializedName("time_to")
    private String timeTo;
    private ArrayList<VehicleData> vehicles;

    public static /* synthetic */ CreateAnotherPassRequestBody copy$default(CreateAnotherPassRequestBody createAnotherPassRequestBody, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, ArrayList arrayList, String str15, ArrayList arrayList2, String str16, int i2, Object obj) {
        CreateAnotherPassRequestBody createAnotherPassRequestBody2 = createAnotherPassRequestBody;
        int i3 = i2;
        return createAnotherPassRequestBody.copy((i3 & 1) != 0 ? createAnotherPassRequestBody2.phone : str, (i3 & 2) != 0 ? createAnotherPassRequestBody2.name : str2, (i3 & 4) != 0 ? createAnotherPassRequestBody2.surname : str3, (i3 & 8) != 0 ? createAnotherPassRequestBody2.patronymic : str4, (i3 & 16) != 0 ? createAnotherPassRequestBody2.company : str5, (i3 & 32) != 0 ? createAnotherPassRequestBody2.enterpriseId : str6, (i3 & 64) != 0 ? createAnotherPassRequestBody2.slotId : str7, (i3 & 128) != 0 ? createAnotherPassRequestBody2.dateFrom : str8, (i3 & 256) != 0 ? createAnotherPassRequestBody2.dateTo : str9, (i3 & 512) != 0 ? createAnotherPassRequestBody2.timeFrom : str10, (i3 & 1024) != 0 ? createAnotherPassRequestBody2.timeTo : str11, (i3 & 2048) != 0 ? createAnotherPassRequestBody2.personsCount : str12, (i3 & 4096) != 0 ? createAnotherPassRequestBody2.comment : str13, (i3 & 8192) != 0 ? createAnotherPassRequestBody2.strategy : str14, (i3 & 16384) != 0 ? createAnotherPassRequestBody2.category : i, (i3 & 32768) != 0 ? createAnotherPassRequestBody2.vehicles : arrayList, (i3 & 65536) != 0 ? createAnotherPassRequestBody2.email : str15, (i3 & 131072) != 0 ? createAnotherPassRequestBody2.identityDocuments : arrayList2, (i3 & 262144) != 0 ? createAnotherPassRequestBody2.birthday : str16);
    }

    public final String component1() {
        return this.phone;
    }

    public final String component10() {
        return this.timeFrom;
    }

    public final String component11() {
        return this.timeTo;
    }

    public final String component12() {
        return this.personsCount;
    }

    public final String component13() {
        return this.comment;
    }

    public final String component14() {
        return this.strategy;
    }

    public final int component15() {
        return this.category;
    }

    public final ArrayList<VehicleData> component16() {
        return this.vehicles;
    }

    public final String component17() {
        return this.email;
    }

    public final ArrayList<IdentityDocument> component18() {
        return this.identityDocuments;
    }

    public final String component19() {
        return this.birthday;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.surname;
    }

    public final String component4() {
        return this.patronymic;
    }

    public final String component5() {
        return this.company;
    }

    public final String component6() {
        return this.enterpriseId;
    }

    public final String component7() {
        return this.slotId;
    }

    public final String component8() {
        return this.dateFrom;
    }

    public final String component9() {
        return this.dateTo;
    }

    public final CreateAnotherPassRequestBody copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, ArrayList<VehicleData> arrayList, String str15, ArrayList<IdentityDocument> arrayList2, String str16) {
        String str17 = str;
        Intrinsics.checkNotNullParameter(str17, "phone");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "surname");
        Intrinsics.checkNotNullParameter(str4, "patronymic");
        Intrinsics.checkNotNullParameter(str5, "company");
        Intrinsics.checkNotNullParameter(str8, "dateFrom");
        Intrinsics.checkNotNullParameter(str9, "dateTo");
        Intrinsics.checkNotNullParameter(str10, "timeFrom");
        Intrinsics.checkNotNullParameter(str11, "timeTo");
        Intrinsics.checkNotNullParameter(str12, "personsCount");
        Intrinsics.checkNotNullParameter(str13, "comment");
        Intrinsics.checkNotNullParameter(str14, "strategy");
        return new CreateAnotherPassRequestBody(str17, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, i, arrayList, str15, arrayList2, str16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAnotherPassRequestBody)) {
            return false;
        }
        CreateAnotherPassRequestBody createAnotherPassRequestBody = (CreateAnotherPassRequestBody) obj;
        return Intrinsics.areEqual((Object) this.phone, (Object) createAnotherPassRequestBody.phone) && Intrinsics.areEqual((Object) this.name, (Object) createAnotherPassRequestBody.name) && Intrinsics.areEqual((Object) this.surname, (Object) createAnotherPassRequestBody.surname) && Intrinsics.areEqual((Object) this.patronymic, (Object) createAnotherPassRequestBody.patronymic) && Intrinsics.areEqual((Object) this.company, (Object) createAnotherPassRequestBody.company) && Intrinsics.areEqual((Object) this.enterpriseId, (Object) createAnotherPassRequestBody.enterpriseId) && Intrinsics.areEqual((Object) this.slotId, (Object) createAnotherPassRequestBody.slotId) && Intrinsics.areEqual((Object) this.dateFrom, (Object) createAnotherPassRequestBody.dateFrom) && Intrinsics.areEqual((Object) this.dateTo, (Object) createAnotherPassRequestBody.dateTo) && Intrinsics.areEqual((Object) this.timeFrom, (Object) createAnotherPassRequestBody.timeFrom) && Intrinsics.areEqual((Object) this.timeTo, (Object) createAnotherPassRequestBody.timeTo) && Intrinsics.areEqual((Object) this.personsCount, (Object) createAnotherPassRequestBody.personsCount) && Intrinsics.areEqual((Object) this.comment, (Object) createAnotherPassRequestBody.comment) && Intrinsics.areEqual((Object) this.strategy, (Object) createAnotherPassRequestBody.strategy) && this.category == createAnotherPassRequestBody.category && Intrinsics.areEqual((Object) this.vehicles, (Object) createAnotherPassRequestBody.vehicles) && Intrinsics.areEqual((Object) this.email, (Object) createAnotherPassRequestBody.email) && Intrinsics.areEqual((Object) this.identityDocuments, (Object) createAnotherPassRequestBody.identityDocuments) && Intrinsics.areEqual((Object) this.birthday, (Object) createAnotherPassRequestBody.birthday);
    }

    public int hashCode() {
        String str = this.phone;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.surname;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.patronymic;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.company;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.enterpriseId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.slotId;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.dateFrom;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.dateTo;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.timeFrom;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.timeTo;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.personsCount;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.comment;
        int hashCode13 = (hashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.strategy;
        int hashCode14 = (((hashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31) + Integer.valueOf(this.category).hashCode()) * 31;
        ArrayList<VehicleData> arrayList = this.vehicles;
        int hashCode15 = (hashCode14 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str15 = this.email;
        int hashCode16 = (hashCode15 + (str15 != null ? str15.hashCode() : 0)) * 31;
        ArrayList<IdentityDocument> arrayList2 = this.identityDocuments;
        int hashCode17 = (hashCode16 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        String str16 = this.birthday;
        if (str16 != null) {
            i = str16.hashCode();
        }
        return hashCode17 + i;
    }

    public String toString() {
        return "CreateAnotherPassRequestBody(phone=" + this.phone + ", name=" + this.name + ", surname=" + this.surname + ", patronymic=" + this.patronymic + ", company=" + this.company + ", enterpriseId=" + this.enterpriseId + ", slotId=" + this.slotId + ", dateFrom=" + this.dateFrom + ", dateTo=" + this.dateTo + ", timeFrom=" + this.timeFrom + ", timeTo=" + this.timeTo + ", personsCount=" + this.personsCount + ", comment=" + this.comment + ", strategy=" + this.strategy + ", category=" + this.category + ", vehicles=" + this.vehicles + ", email=" + this.email + ", identityDocuments=" + this.identityDocuments + ", birthday=" + this.birthday + ")";
    }

    public final String getPhone() {
        return this.phone;
    }

    public final void setPhone(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phone = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getSurname() {
        return this.surname;
    }

    public final void setSurname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.surname = str;
    }

    public final String getPatronymic() {
        return this.patronymic;
    }

    public final void setPatronymic(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.patronymic = str;
    }

    public final String getCompany() {
        return this.company;
    }

    public final void setCompany(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.company = str;
    }

    public final String getEnterpriseId() {
        return this.enterpriseId;
    }

    public final void setEnterpriseId(String str) {
        this.enterpriseId = str;
    }

    public final String getSlotId() {
        return this.slotId;
    }

    public final void setSlotId(String str) {
        this.slotId = str;
    }

    public final String getDateFrom() {
        return this.dateFrom;
    }

    public final void setDateFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateFrom = str;
    }

    public final String getDateTo() {
        return this.dateTo;
    }

    public final void setDateTo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dateTo = str;
    }

    public final String getTimeFrom() {
        return this.timeFrom;
    }

    public final void setTimeFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeFrom = str;
    }

    public final String getTimeTo() {
        return this.timeTo;
    }

    public final void setTimeTo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeTo = str;
    }

    public final String getPersonsCount() {
        return this.personsCount;
    }

    public final void setPersonsCount(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.personsCount = str;
    }

    public final String getComment() {
        return this.comment;
    }

    public final void setComment(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.comment = str;
    }

    public final String getStrategy() {
        return this.strategy;
    }

    public final void setStrategy(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.strategy = str;
    }

    public final int getCategory() {
        return this.category;
    }

    public final void setCategory(int i) {
        this.category = i;
    }

    public final ArrayList<VehicleData> getVehicles() {
        return this.vehicles;
    }

    public final void setVehicles(ArrayList<VehicleData> arrayList) {
        this.vehicles = arrayList;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final ArrayList<IdentityDocument> getIdentityDocuments() {
        return this.identityDocuments;
    }

    public final void setIdentityDocuments(ArrayList<IdentityDocument> arrayList) {
        this.identityDocuments = arrayList;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final void setBirthday(String str) {
        this.birthday = str;
    }

    public CreateAnotherPassRequestBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i, ArrayList<VehicleData> arrayList, String str15, ArrayList<IdentityDocument> arrayList2, String str16) {
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        String str27 = str14;
        Intrinsics.checkNotNullParameter(str, "phone");
        Intrinsics.checkNotNullParameter(str17, "name");
        Intrinsics.checkNotNullParameter(str18, "surname");
        Intrinsics.checkNotNullParameter(str19, "patronymic");
        Intrinsics.checkNotNullParameter(str20, "company");
        Intrinsics.checkNotNullParameter(str21, "dateFrom");
        Intrinsics.checkNotNullParameter(str22, "dateTo");
        Intrinsics.checkNotNullParameter(str23, "timeFrom");
        Intrinsics.checkNotNullParameter(str24, "timeTo");
        Intrinsics.checkNotNullParameter(str25, "personsCount");
        Intrinsics.checkNotNullParameter(str26, "comment");
        Intrinsics.checkNotNullParameter(str27, "strategy");
        this.phone = str;
        this.name = str17;
        this.surname = str18;
        this.patronymic = str19;
        this.company = str20;
        this.enterpriseId = str6;
        this.slotId = str7;
        this.dateFrom = str21;
        this.dateTo = str22;
        this.timeFrom = str23;
        this.timeTo = str24;
        this.personsCount = str25;
        this.comment = str26;
        this.strategy = str27;
        this.category = i;
        this.vehicles = arrayList;
        this.email = str15;
        this.identityDocuments = arrayList2;
        this.birthday = str16;
    }
}
