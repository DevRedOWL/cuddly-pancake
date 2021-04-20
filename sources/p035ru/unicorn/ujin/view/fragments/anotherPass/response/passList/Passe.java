package p035ru.unicorn.ujin.view.fragments.anotherPass.response.passList;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.mycompany.RentCompany;
import p035ru.unicorn.ujin.view.fragments.anotherPass.request.IdentityDocument;
import p035ru.unicorn.ujin.view.fragments.parking.response.ParkingSlot;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bG\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0019¢\u0006\u0002\u0010'J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0010HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010U\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u001fHÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010!HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010HJ\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010_\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0019HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010b\u001a\u00020\tHÆ\u0003J\t\u0010c\u001a\u00020\u000bHÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003JÆ\u0002\u0010g\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0019HÆ\u0001¢\u0006\u0002\u0010hJ\u0013\u0010i\u001a\u00020\u000b2\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020\tHÖ\u0001J\t\u0010l\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010)R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u00102R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010)R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010)R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010)R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0013\u0010 \u001a\u0004\u0018\u00010!¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b@\u0010)R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010)R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u0010)R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010)R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u0010)R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0015\u0010#\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010I\u001a\u0004\bG\u0010HR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010)R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bK\u0010)¨\u0006m"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Passe;", "", "active_from", "", "active_to", "comment", "enterprise", "Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "id", "", "is_archive", "", "pass_number", "print", "qr", "state", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/State;", "user_name", "user_patronymic", "user_phone", "user_email", "user_company_name", "user_surname", "user_company", "vehicles", "", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Vehicle;", "number", "work_time_from", "work_time_to", "strategy", "Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Strategy;", "slot", "Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "persons_count", "with_stuff", "user_birthday", "identity_documents", "Lru/unicorn/ujin/view/fragments/anotherPass/request/IdentityDocument;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/State;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Strategy;Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)V", "getActive_from", "()Ljava/lang/String;", "getActive_to", "getComment", "getEnterprise", "()Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;", "getId", "()I", "getIdentity_documents", "()Ljava/util/List;", "()Z", "getNumber", "getPass_number", "getPersons_count", "getPrint", "getQr", "getSlot", "()Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;", "getState", "()Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/State;", "getStrategy", "()Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Strategy;", "getUser_birthday", "getUser_company", "getUser_company_name", "getUser_email", "getUser_name", "getUser_patronymic", "getUser_phone", "getUser_surname", "getVehicles", "getWith_stuff", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getWork_time_from", "getWork_time_to", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/activity/navigation/ui/mycompany/RentCompany;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/State;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Strategy;Lru/unicorn/ujin/view/fragments/parking/response/ParkingSlot;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)Lru/unicorn/ujin/view/fragments/anotherPass/response/passList/Passe;", "equals", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.response.passList.Passe */
/* compiled from: Passe.kt */
public final class Passe {
    private final String active_from;
    private final String active_to;
    private final String comment;
    private final RentCompany enterprise;

    /* renamed from: id */
    private final int f6915id;
    private final List<IdentityDocument> identity_documents;
    private final boolean is_archive;
    private final String number;
    private final String pass_number;
    private final String persons_count;
    private final String print;

    /* renamed from: qr */
    private final String f6916qr;
    private final ParkingSlot slot;
    private final State state;
    private final Strategy strategy;
    private final String user_birthday;
    private final String user_company;
    private final String user_company_name;
    private final String user_email;
    private final String user_name;
    private final String user_patronymic;
    private final String user_phone;
    private final String user_surname;
    private final List<Vehicle> vehicles;
    private final Boolean with_stuff;
    private final String work_time_from;
    private final String work_time_to;

    public static /* synthetic */ Passe copy$default(Passe passe, String str, String str2, String str3, RentCompany rentCompany, int i, boolean z, String str4, String str5, String str6, State state2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, String str14, String str15, String str16, Strategy strategy2, ParkingSlot parkingSlot, String str17, Boolean bool, String str18, List list2, int i2, Object obj) {
        Passe passe2 = passe;
        int i3 = i2;
        return passe.copy((i3 & 1) != 0 ? passe2.active_from : str, (i3 & 2) != 0 ? passe2.active_to : str2, (i3 & 4) != 0 ? passe2.comment : str3, (i3 & 8) != 0 ? passe2.enterprise : rentCompany, (i3 & 16) != 0 ? passe2.f6915id : i, (i3 & 32) != 0 ? passe2.is_archive : z, (i3 & 64) != 0 ? passe2.pass_number : str4, (i3 & 128) != 0 ? passe2.print : str5, (i3 & 256) != 0 ? passe2.f6916qr : str6, (i3 & 512) != 0 ? passe2.state : state2, (i3 & 1024) != 0 ? passe2.user_name : str7, (i3 & 2048) != 0 ? passe2.user_patronymic : str8, (i3 & 4096) != 0 ? passe2.user_phone : str9, (i3 & 8192) != 0 ? passe2.user_email : str10, (i3 & 16384) != 0 ? passe2.user_company_name : str11, (i3 & 32768) != 0 ? passe2.user_surname : str12, (i3 & 65536) != 0 ? passe2.user_company : str13, (i3 & 131072) != 0 ? passe2.vehicles : list, (i3 & 262144) != 0 ? passe2.number : str14, (i3 & 524288) != 0 ? passe2.work_time_from : str15, (i3 & 1048576) != 0 ? passe2.work_time_to : str16, (i3 & 2097152) != 0 ? passe2.strategy : strategy2, (i3 & 4194304) != 0 ? passe2.slot : parkingSlot, (i3 & 8388608) != 0 ? passe2.persons_count : str17, (i3 & 16777216) != 0 ? passe2.with_stuff : bool, (i3 & 33554432) != 0 ? passe2.user_birthday : str18, (i3 & 67108864) != 0 ? passe2.identity_documents : list2);
    }

    public final String component1() {
        return this.active_from;
    }

    public final State component10() {
        return this.state;
    }

    public final String component11() {
        return this.user_name;
    }

    public final String component12() {
        return this.user_patronymic;
    }

    public final String component13() {
        return this.user_phone;
    }

    public final String component14() {
        return this.user_email;
    }

    public final String component15() {
        return this.user_company_name;
    }

    public final String component16() {
        return this.user_surname;
    }

    public final String component17() {
        return this.user_company;
    }

    public final List<Vehicle> component18() {
        return this.vehicles;
    }

    public final String component19() {
        return this.number;
    }

    public final String component2() {
        return this.active_to;
    }

    public final String component20() {
        return this.work_time_from;
    }

    public final String component21() {
        return this.work_time_to;
    }

    public final Strategy component22() {
        return this.strategy;
    }

    public final ParkingSlot component23() {
        return this.slot;
    }

    public final String component24() {
        return this.persons_count;
    }

    public final Boolean component25() {
        return this.with_stuff;
    }

    public final String component26() {
        return this.user_birthday;
    }

    public final List<IdentityDocument> component27() {
        return this.identity_documents;
    }

    public final String component3() {
        return this.comment;
    }

    public final RentCompany component4() {
        return this.enterprise;
    }

    public final int component5() {
        return this.f6915id;
    }

    public final boolean component6() {
        return this.is_archive;
    }

    public final String component7() {
        return this.pass_number;
    }

    public final String component8() {
        return this.print;
    }

    public final String component9() {
        return this.f6916qr;
    }

    public final Passe copy(String str, String str2, String str3, RentCompany rentCompany, int i, boolean z, String str4, String str5, String str6, State state2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<Vehicle> list, String str14, String str15, String str16, Strategy strategy2, ParkingSlot parkingSlot, String str17, Boolean bool, String str18, List<IdentityDocument> list2) {
        String str19 = str;
        Intrinsics.checkNotNullParameter(str3, "comment");
        Intrinsics.checkNotNullParameter(str4, "pass_number");
        Intrinsics.checkNotNullParameter(str5, "print");
        Intrinsics.checkNotNullParameter(str6, "qr");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(str7, "user_name");
        Intrinsics.checkNotNullParameter(str8, "user_patronymic");
        Intrinsics.checkNotNullParameter(str9, "user_phone");
        Intrinsics.checkNotNullParameter(str12, "user_surname");
        Intrinsics.checkNotNullParameter(strategy2, "strategy");
        return new Passe(str, str2, str3, rentCompany, i, z, str4, str5, str6, state2, str7, str8, str9, str10, str11, str12, str13, list, str14, str15, str16, strategy2, parkingSlot, str17, bool, str18, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Passe)) {
            return false;
        }
        Passe passe = (Passe) obj;
        return Intrinsics.areEqual((Object) this.active_from, (Object) passe.active_from) && Intrinsics.areEqual((Object) this.active_to, (Object) passe.active_to) && Intrinsics.areEqual((Object) this.comment, (Object) passe.comment) && Intrinsics.areEqual((Object) this.enterprise, (Object) passe.enterprise) && this.f6915id == passe.f6915id && this.is_archive == passe.is_archive && Intrinsics.areEqual((Object) this.pass_number, (Object) passe.pass_number) && Intrinsics.areEqual((Object) this.print, (Object) passe.print) && Intrinsics.areEqual((Object) this.f6916qr, (Object) passe.f6916qr) && Intrinsics.areEqual((Object) this.state, (Object) passe.state) && Intrinsics.areEqual((Object) this.user_name, (Object) passe.user_name) && Intrinsics.areEqual((Object) this.user_patronymic, (Object) passe.user_patronymic) && Intrinsics.areEqual((Object) this.user_phone, (Object) passe.user_phone) && Intrinsics.areEqual((Object) this.user_email, (Object) passe.user_email) && Intrinsics.areEqual((Object) this.user_company_name, (Object) passe.user_company_name) && Intrinsics.areEqual((Object) this.user_surname, (Object) passe.user_surname) && Intrinsics.areEqual((Object) this.user_company, (Object) passe.user_company) && Intrinsics.areEqual((Object) this.vehicles, (Object) passe.vehicles) && Intrinsics.areEqual((Object) this.number, (Object) passe.number) && Intrinsics.areEqual((Object) this.work_time_from, (Object) passe.work_time_from) && Intrinsics.areEqual((Object) this.work_time_to, (Object) passe.work_time_to) && Intrinsics.areEqual((Object) this.strategy, (Object) passe.strategy) && Intrinsics.areEqual((Object) this.slot, (Object) passe.slot) && Intrinsics.areEqual((Object) this.persons_count, (Object) passe.persons_count) && Intrinsics.areEqual((Object) this.with_stuff, (Object) passe.with_stuff) && Intrinsics.areEqual((Object) this.user_birthday, (Object) passe.user_birthday) && Intrinsics.areEqual((Object) this.identity_documents, (Object) passe.identity_documents);
    }

    public int hashCode() {
        String str = this.active_from;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.active_to;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.comment;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        RentCompany rentCompany = this.enterprise;
        int hashCode4 = (((hashCode3 + (rentCompany != null ? rentCompany.hashCode() : 0)) * 31) + Integer.valueOf(this.f6915id).hashCode()) * 31;
        boolean z = this.is_archive;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str4 = this.pass_number;
        int hashCode5 = (i2 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.print;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f6916qr;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        State state2 = this.state;
        int hashCode8 = (hashCode7 + (state2 != null ? state2.hashCode() : 0)) * 31;
        String str7 = this.user_name;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.user_patronymic;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.user_phone;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.user_email;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.user_company_name;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.user_surname;
        int hashCode14 = (hashCode13 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.user_company;
        int hashCode15 = (hashCode14 + (str13 != null ? str13.hashCode() : 0)) * 31;
        List<Vehicle> list = this.vehicles;
        int hashCode16 = (hashCode15 + (list != null ? list.hashCode() : 0)) * 31;
        String str14 = this.number;
        int hashCode17 = (hashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.work_time_from;
        int hashCode18 = (hashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.work_time_to;
        int hashCode19 = (hashCode18 + (str16 != null ? str16.hashCode() : 0)) * 31;
        Strategy strategy2 = this.strategy;
        int hashCode20 = (hashCode19 + (strategy2 != null ? strategy2.hashCode() : 0)) * 31;
        ParkingSlot parkingSlot = this.slot;
        int hashCode21 = (hashCode20 + (parkingSlot != null ? parkingSlot.hashCode() : 0)) * 31;
        String str17 = this.persons_count;
        int hashCode22 = (hashCode21 + (str17 != null ? str17.hashCode() : 0)) * 31;
        Boolean bool = this.with_stuff;
        int hashCode23 = (hashCode22 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str18 = this.user_birthday;
        int hashCode24 = (hashCode23 + (str18 != null ? str18.hashCode() : 0)) * 31;
        List<IdentityDocument> list2 = this.identity_documents;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode24 + i;
    }

    public String toString() {
        return "Passe(active_from=" + this.active_from + ", active_to=" + this.active_to + ", comment=" + this.comment + ", enterprise=" + this.enterprise + ", id=" + this.f6915id + ", is_archive=" + this.is_archive + ", pass_number=" + this.pass_number + ", print=" + this.print + ", qr=" + this.f6916qr + ", state=" + this.state + ", user_name=" + this.user_name + ", user_patronymic=" + this.user_patronymic + ", user_phone=" + this.user_phone + ", user_email=" + this.user_email + ", user_company_name=" + this.user_company_name + ", user_surname=" + this.user_surname + ", user_company=" + this.user_company + ", vehicles=" + this.vehicles + ", number=" + this.number + ", work_time_from=" + this.work_time_from + ", work_time_to=" + this.work_time_to + ", strategy=" + this.strategy + ", slot=" + this.slot + ", persons_count=" + this.persons_count + ", with_stuff=" + this.with_stuff + ", user_birthday=" + this.user_birthday + ", identity_documents=" + this.identity_documents + ")";
    }

    public Passe(String str, String str2, String str3, RentCompany rentCompany, int i, boolean z, String str4, String str5, String str6, State state2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<Vehicle> list, String str14, String str15, String str16, Strategy strategy2, ParkingSlot parkingSlot, String str17, Boolean bool, String str18, List<IdentityDocument> list2) {
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        State state3 = state2;
        String str22 = str7;
        String str23 = str8;
        String str24 = str9;
        String str25 = str12;
        Strategy strategy3 = strategy2;
        Intrinsics.checkNotNullParameter(str3, "comment");
        Intrinsics.checkNotNullParameter(str19, "pass_number");
        Intrinsics.checkNotNullParameter(str20, "print");
        Intrinsics.checkNotNullParameter(str21, "qr");
        Intrinsics.checkNotNullParameter(state3, "state");
        Intrinsics.checkNotNullParameter(str22, "user_name");
        Intrinsics.checkNotNullParameter(str23, "user_patronymic");
        Intrinsics.checkNotNullParameter(str24, "user_phone");
        Intrinsics.checkNotNullParameter(str25, "user_surname");
        Intrinsics.checkNotNullParameter(strategy3, "strategy");
        this.active_from = str;
        this.active_to = str2;
        this.comment = str3;
        this.enterprise = rentCompany;
        this.f6915id = i;
        this.is_archive = z;
        this.pass_number = str19;
        this.print = str20;
        this.f6916qr = str21;
        this.state = state3;
        this.user_name = str22;
        this.user_patronymic = str23;
        this.user_phone = str24;
        this.user_email = str10;
        this.user_company_name = str11;
        this.user_surname = str25;
        this.user_company = str13;
        this.vehicles = list;
        this.number = str14;
        this.work_time_from = str15;
        this.work_time_to = str16;
        this.strategy = strategy3;
        this.slot = parkingSlot;
        this.persons_count = str17;
        this.with_stuff = bool;
        this.user_birthday = str18;
        this.identity_documents = list2;
    }

    public final String getActive_from() {
        return this.active_from;
    }

    public final String getActive_to() {
        return this.active_to;
    }

    public final String getComment() {
        return this.comment;
    }

    public final RentCompany getEnterprise() {
        return this.enterprise;
    }

    public final int getId() {
        return this.f6915id;
    }

    public final boolean is_archive() {
        return this.is_archive;
    }

    public final String getPass_number() {
        return this.pass_number;
    }

    public final String getPrint() {
        return this.print;
    }

    public final String getQr() {
        return this.f6916qr;
    }

    public final State getState() {
        return this.state;
    }

    public final String getUser_name() {
        return this.user_name;
    }

    public final String getUser_patronymic() {
        return this.user_patronymic;
    }

    public final String getUser_phone() {
        return this.user_phone;
    }

    public final String getUser_email() {
        return this.user_email;
    }

    public final String getUser_company_name() {
        return this.user_company_name;
    }

    public final String getUser_surname() {
        return this.user_surname;
    }

    public final String getUser_company() {
        return this.user_company;
    }

    public final List<Vehicle> getVehicles() {
        return this.vehicles;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getWork_time_from() {
        return this.work_time_from;
    }

    public final String getWork_time_to() {
        return this.work_time_to;
    }

    public final Strategy getStrategy() {
        return this.strategy;
    }

    public final ParkingSlot getSlot() {
        return this.slot;
    }

    public final String getPersons_count() {
        return this.persons_count;
    }

    public final Boolean getWith_stuff() {
        return this.with_stuff;
    }

    public final String getUser_birthday() {
        return this.user_birthday;
    }

    public final List<IdentityDocument> getIdentity_documents() {
        return this.identity_documents;
    }
}
