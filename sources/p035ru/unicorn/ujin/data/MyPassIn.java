package p035ru.unicorn.ujin.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Enterprise;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.PassState;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.PassType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.User;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bL\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001Bÿ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003¢\u0006\u0002\u0010#J\u0012\u0010F\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010H\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010\u0000H\u0016J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0003HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\\\u001a\u00020\nHÆ\u0003J\t\u0010]\u001a\u00020\fHÆ\u0003J\t\u0010^\u001a\u00020\u000eHÆ\u0003J\t\u0010_\u001a\u00020\u0010HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\u0002\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u0003HÆ\u0001J\u0013\u0010b\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010c\u001a\u00020\nHÖ\u0001J\t\u0010d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u00100R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010%R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00106R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00106R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010%R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010%R\u0016\u0010 \u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010%R\u0016\u0010!\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010%R\u0016\u0010\"\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010%¨\u0006e"}, mo51343d2 = {"Lru/unicorn/ujin/data/MyPassIn;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "activeFrom", "", "activeTo", "comment", "days", "", "", "id", "", "enterprise", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Enterprise;", "user", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/User;", "isArchive", "", "passNumber", "print", "qr", "revokeComment", "slot", "state", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassState;", "type", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassType;", "userBirthday", "userCompanyName", "userEmail", "userName", "userPatronymic", "userPhone", "userSurname", "workTimeFrom", "workTimeTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILru/unicorn/ujin/view/activity/navigation/ui/corona/model/Enterprise;Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/User;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassState;Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassType;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActiveFrom", "()Ljava/lang/String;", "getActiveTo", "getComment", "getDays", "()Ljava/util/List;", "getEnterprise", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Enterprise;", "fullName", "getFullName", "getId", "()I", "()Z", "getPassNumber", "getPrint", "getQr", "getRevokeComment", "getSlot", "()Ljava/lang/Object;", "getState", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassState;", "getType", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/PassType;", "getUser", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/User;", "getUserBirthday", "getUserCompanyName", "getUserEmail", "getUserName", "getUserPatronymic", "getUserPhone", "getUserSurname", "getWorkTimeFrom", "getWorkTimeTo", "areContentsTheSame", "other", "areItemsTheSame", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.MyPassIn */
/* compiled from: ListMyPassIn.kt */
public final class MyPassIn implements Diffable<MyPassIn> {
    @SerializedName("active_from")
    private final String activeFrom;
    @SerializedName("active_to")
    private final String activeTo;
    private final String comment;
    private final List<Object> days;
    private final Enterprise enterprise;

    /* renamed from: id */
    private final int f6606id;
    @SerializedName("is_archive")
    private final boolean isArchive;
    @SerializedName("pass_number")
    private final String passNumber;
    private final String print;

    /* renamed from: qr */
    private final String f6607qr;
    @SerializedName("revoke_comment")
    private final String revokeComment;
    private final Object slot;
    private final PassState state;
    private final PassType type;
    private final User user;
    @SerializedName("user_birthday")
    private final Object userBirthday;
    @SerializedName("user_company_name")
    private final Object userCompanyName;
    @SerializedName("user_email")
    private final Object userEmail;
    @SerializedName("user_name")
    private final String userName;
    @SerializedName("user_patronymic")
    private final String userPatronymic;
    @SerializedName("user_phone")
    private final String userPhone;
    @SerializedName("user_surname")
    private final String userSurname;
    @SerializedName("work_time_from")
    private final String workTimeFrom;
    @SerializedName("work_time_to")
    private final String workTimeTo;

    public static /* synthetic */ MyPassIn copy$default(MyPassIn myPassIn, String str, String str2, String str3, List list, int i, Enterprise enterprise2, User user2, boolean z, String str4, String str5, String str6, String str7, Object obj, PassState passState, PassType passType, Object obj2, Object obj3, Object obj4, String str8, String str9, String str10, String str11, String str12, String str13, int i2, Object obj5) {
        MyPassIn myPassIn2 = myPassIn;
        int i3 = i2;
        return myPassIn.copy((i3 & 1) != 0 ? myPassIn2.activeFrom : str, (i3 & 2) != 0 ? myPassIn2.activeTo : str2, (i3 & 4) != 0 ? myPassIn2.comment : str3, (i3 & 8) != 0 ? myPassIn2.days : list, (i3 & 16) != 0 ? myPassIn2.f6606id : i, (i3 & 32) != 0 ? myPassIn2.enterprise : enterprise2, (i3 & 64) != 0 ? myPassIn2.user : user2, (i3 & 128) != 0 ? myPassIn2.isArchive : z, (i3 & 256) != 0 ? myPassIn2.passNumber : str4, (i3 & 512) != 0 ? myPassIn2.print : str5, (i3 & 1024) != 0 ? myPassIn2.f6607qr : str6, (i3 & 2048) != 0 ? myPassIn2.revokeComment : str7, (i3 & 4096) != 0 ? myPassIn2.slot : obj, (i3 & 8192) != 0 ? myPassIn2.state : passState, (i3 & 16384) != 0 ? myPassIn2.type : passType, (i3 & 32768) != 0 ? myPassIn2.userBirthday : obj2, (i3 & 65536) != 0 ? myPassIn2.userCompanyName : obj3, (i3 & 131072) != 0 ? myPassIn2.userEmail : obj4, (i3 & 262144) != 0 ? myPassIn2.userName : str8, (i3 & 524288) != 0 ? myPassIn2.userPatronymic : str9, (i3 & 1048576) != 0 ? myPassIn2.userPhone : str10, (i3 & 2097152) != 0 ? myPassIn2.userSurname : str11, (i3 & 4194304) != 0 ? myPassIn2.workTimeFrom : str12, (i3 & 8388608) != 0 ? myPassIn2.workTimeTo : str13);
    }

    public boolean areContentsTheSame(MyPassIn myPassIn) {
        return false;
    }

    public final String component1() {
        return this.activeFrom;
    }

    public final String component10() {
        return this.print;
    }

    public final String component11() {
        return this.f6607qr;
    }

    public final String component12() {
        return this.revokeComment;
    }

    public final Object component13() {
        return this.slot;
    }

    public final PassState component14() {
        return this.state;
    }

    public final PassType component15() {
        return this.type;
    }

    public final Object component16() {
        return this.userBirthday;
    }

    public final Object component17() {
        return this.userCompanyName;
    }

    public final Object component18() {
        return this.userEmail;
    }

    public final String component19() {
        return this.userName;
    }

    public final String component2() {
        return this.activeTo;
    }

    public final String component20() {
        return this.userPatronymic;
    }

    public final String component21() {
        return this.userPhone;
    }

    public final String component22() {
        return this.userSurname;
    }

    public final String component23() {
        return this.workTimeFrom;
    }

    public final String component24() {
        return this.workTimeTo;
    }

    public final String component3() {
        return this.comment;
    }

    public final List<Object> component4() {
        return this.days;
    }

    public final int component5() {
        return this.f6606id;
    }

    public final Enterprise component6() {
        return this.enterprise;
    }

    public final User component7() {
        return this.user;
    }

    public final boolean component8() {
        return this.isArchive;
    }

    public final String component9() {
        return this.passNumber;
    }

    public final MyPassIn copy(String str, String str2, String str3, List<? extends Object> list, int i, Enterprise enterprise2, User user2, boolean z, String str4, String str5, String str6, String str7, Object obj, PassState passState, PassType passType, Object obj2, Object obj3, Object obj4, String str8, String str9, String str10, String str11, String str12, String str13) {
        String str14 = str;
        Intrinsics.checkNotNullParameter(str14, "activeFrom");
        Intrinsics.checkNotNullParameter(str2, "activeTo");
        Intrinsics.checkNotNullParameter(str3, "comment");
        Intrinsics.checkNotNullParameter(list, "days");
        Intrinsics.checkNotNullParameter(enterprise2, "enterprise");
        Intrinsics.checkNotNullParameter(user2, "user");
        Intrinsics.checkNotNullParameter(str4, "passNumber");
        Intrinsics.checkNotNullParameter(str5, "print");
        Intrinsics.checkNotNullParameter(str6, "qr");
        Intrinsics.checkNotNullParameter(str7, "revokeComment");
        Intrinsics.checkNotNullParameter(str8, "userName");
        Intrinsics.checkNotNullParameter(str9, "userPatronymic");
        Intrinsics.checkNotNullParameter(str10, "userPhone");
        Intrinsics.checkNotNullParameter(str11, "userSurname");
        Intrinsics.checkNotNullParameter(str12, "workTimeFrom");
        Intrinsics.checkNotNullParameter(str13, "workTimeTo");
        return new MyPassIn(str14, str2, str3, list, i, enterprise2, user2, z, str4, str5, str6, str7, obj, passState, passType, obj2, obj3, obj4, str8, str9, str10, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyPassIn)) {
            return false;
        }
        MyPassIn myPassIn = (MyPassIn) obj;
        return Intrinsics.areEqual((Object) this.activeFrom, (Object) myPassIn.activeFrom) && Intrinsics.areEqual((Object) this.activeTo, (Object) myPassIn.activeTo) && Intrinsics.areEqual((Object) this.comment, (Object) myPassIn.comment) && Intrinsics.areEqual((Object) this.days, (Object) myPassIn.days) && this.f6606id == myPassIn.f6606id && Intrinsics.areEqual((Object) this.enterprise, (Object) myPassIn.enterprise) && Intrinsics.areEqual((Object) this.user, (Object) myPassIn.user) && this.isArchive == myPassIn.isArchive && Intrinsics.areEqual((Object) this.passNumber, (Object) myPassIn.passNumber) && Intrinsics.areEqual((Object) this.print, (Object) myPassIn.print) && Intrinsics.areEqual((Object) this.f6607qr, (Object) myPassIn.f6607qr) && Intrinsics.areEqual((Object) this.revokeComment, (Object) myPassIn.revokeComment) && Intrinsics.areEqual(this.slot, myPassIn.slot) && Intrinsics.areEqual((Object) this.state, (Object) myPassIn.state) && Intrinsics.areEqual((Object) this.type, (Object) myPassIn.type) && Intrinsics.areEqual(this.userBirthday, myPassIn.userBirthday) && Intrinsics.areEqual(this.userCompanyName, myPassIn.userCompanyName) && Intrinsics.areEqual(this.userEmail, myPassIn.userEmail) && Intrinsics.areEqual((Object) this.userName, (Object) myPassIn.userName) && Intrinsics.areEqual((Object) this.userPatronymic, (Object) myPassIn.userPatronymic) && Intrinsics.areEqual((Object) this.userPhone, (Object) myPassIn.userPhone) && Intrinsics.areEqual((Object) this.userSurname, (Object) myPassIn.userSurname) && Intrinsics.areEqual((Object) this.workTimeFrom, (Object) myPassIn.workTimeFrom) && Intrinsics.areEqual((Object) this.workTimeTo, (Object) myPassIn.workTimeTo);
    }

    public int hashCode() {
        String str = this.activeFrom;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.activeTo;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.comment;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<Object> list = this.days;
        int hashCode4 = (((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + Integer.valueOf(this.f6606id).hashCode()) * 31;
        Enterprise enterprise2 = this.enterprise;
        int hashCode5 = (hashCode4 + (enterprise2 != null ? enterprise2.hashCode() : 0)) * 31;
        User user2 = this.user;
        int hashCode6 = (hashCode5 + (user2 != null ? user2.hashCode() : 0)) * 31;
        boolean z = this.isArchive;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        String str4 = this.passNumber;
        int hashCode7 = (i2 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.print;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f6607qr;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.revokeComment;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Object obj = this.slot;
        int hashCode11 = (hashCode10 + (obj != null ? obj.hashCode() : 0)) * 31;
        PassState passState = this.state;
        int hashCode12 = (hashCode11 + (passState != null ? passState.hashCode() : 0)) * 31;
        PassType passType = this.type;
        int hashCode13 = (hashCode12 + (passType != null ? passType.hashCode() : 0)) * 31;
        Object obj2 = this.userBirthday;
        int hashCode14 = (hashCode13 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.userCompanyName;
        int hashCode15 = (hashCode14 + (obj3 != null ? obj3.hashCode() : 0)) * 31;
        Object obj4 = this.userEmail;
        int hashCode16 = (hashCode15 + (obj4 != null ? obj4.hashCode() : 0)) * 31;
        String str8 = this.userName;
        int hashCode17 = (hashCode16 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.userPatronymic;
        int hashCode18 = (hashCode17 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.userPhone;
        int hashCode19 = (hashCode18 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.userSurname;
        int hashCode20 = (hashCode19 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.workTimeFrom;
        int hashCode21 = (hashCode20 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.workTimeTo;
        if (str13 != null) {
            i = str13.hashCode();
        }
        return hashCode21 + i;
    }

    public String toString() {
        return "MyPassIn(activeFrom=" + this.activeFrom + ", activeTo=" + this.activeTo + ", comment=" + this.comment + ", days=" + this.days + ", id=" + this.f6606id + ", enterprise=" + this.enterprise + ", user=" + this.user + ", isArchive=" + this.isArchive + ", passNumber=" + this.passNumber + ", print=" + this.print + ", qr=" + this.f6607qr + ", revokeComment=" + this.revokeComment + ", slot=" + this.slot + ", state=" + this.state + ", type=" + this.type + ", userBirthday=" + this.userBirthday + ", userCompanyName=" + this.userCompanyName + ", userEmail=" + this.userEmail + ", userName=" + this.userName + ", userPatronymic=" + this.userPatronymic + ", userPhone=" + this.userPhone + ", userSurname=" + this.userSurname + ", workTimeFrom=" + this.workTimeFrom + ", workTimeTo=" + this.workTimeTo + ")";
    }

    public MyPassIn(String str, String str2, String str3, List<? extends Object> list, int i, Enterprise enterprise2, User user2, boolean z, String str4, String str5, String str6, String str7, Object obj, PassState passState, PassType passType, Object obj2, Object obj3, Object obj4, String str8, String str9, String str10, String str11, String str12, String str13) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        List<? extends Object> list2 = list;
        Enterprise enterprise3 = enterprise2;
        User user3 = user2;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        Intrinsics.checkNotNullParameter(str14, "activeFrom");
        Intrinsics.checkNotNullParameter(str15, "activeTo");
        Intrinsics.checkNotNullParameter(str16, "comment");
        Intrinsics.checkNotNullParameter(list2, "days");
        Intrinsics.checkNotNullParameter(enterprise3, "enterprise");
        Intrinsics.checkNotNullParameter(user3, "user");
        Intrinsics.checkNotNullParameter(str17, "passNumber");
        Intrinsics.checkNotNullParameter(str18, "print");
        Intrinsics.checkNotNullParameter(str19, "qr");
        Intrinsics.checkNotNullParameter(str20, "revokeComment");
        Intrinsics.checkNotNullParameter(str21, "userName");
        Intrinsics.checkNotNullParameter(str22, "userPatronymic");
        Intrinsics.checkNotNullParameter(str23, "userPhone");
        Intrinsics.checkNotNullParameter(str24, "userSurname");
        Intrinsics.checkNotNullParameter(str12, "workTimeFrom");
        String str25 = str13;
        Intrinsics.checkNotNullParameter(str25, "workTimeTo");
        this.activeFrom = str14;
        this.activeTo = str15;
        this.comment = str16;
        this.days = list2;
        this.f6606id = i;
        this.enterprise = enterprise3;
        this.user = user3;
        this.isArchive = z;
        this.passNumber = str17;
        this.print = str18;
        this.f6607qr = str19;
        this.revokeComment = str20;
        this.slot = obj;
        this.state = passState;
        this.type = passType;
        this.userBirthday = obj2;
        this.userCompanyName = obj3;
        this.userEmail = obj4;
        this.userName = str21;
        this.userPatronymic = str22;
        this.userPhone = str23;
        this.userSurname = str24;
        this.workTimeFrom = str12;
        this.workTimeTo = str25;
    }

    public final String getActiveFrom() {
        return this.activeFrom;
    }

    public final String getActiveTo() {
        return this.activeTo;
    }

    public final String getComment() {
        return this.comment;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MyPassIn(java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.List r32, int r33, p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.Enterprise r34, p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.User r35, boolean r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.Object r41, p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.PassState r42, p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model.PassType r43, java.lang.Object r44, java.lang.Object r45, java.lang.Object r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, int r53, kotlin.jvm.internal.DefaultConstructorMarker r54) {
        /*
            r28 = this;
            r0 = r53
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r29
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r5 = r2
            goto L_0x0014
        L_0x0012:
            r5 = r30
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001a
            r6 = r2
            goto L_0x001c
        L_0x001a:
            r6 = r31
        L_0x001c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0026
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r7 = r1
            goto L_0x0028
        L_0x0026:
            r7 = r32
        L_0x0028:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L_0x002f
            r8 = 0
            goto L_0x0031
        L_0x002f:
            r8 = r33
        L_0x0031:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0037
            r11 = 0
            goto L_0x0039
        L_0x0037:
            r11 = r36
        L_0x0039:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003f
            r12 = r2
            goto L_0x0041
        L_0x003f:
            r12 = r37
        L_0x0041:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0047
            r13 = r2
            goto L_0x0049
        L_0x0047:
            r13 = r38
        L_0x0049:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004f
            r14 = r2
            goto L_0x0051
        L_0x004f:
            r14 = r39
        L_0x0051:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0057
            r15 = r2
            goto L_0x0059
        L_0x0057:
            r15 = r40
        L_0x0059:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r16 = r1
            goto L_0x0067
        L_0x0065:
            r16 = r41
        L_0x0067:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r19 = r1
            goto L_0x0077
        L_0x0075:
            r19 = r44
        L_0x0077:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0084
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r20 = r1
            goto L_0x0086
        L_0x0084:
            r20 = r45
        L_0x0086:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0093
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r21 = r1
            goto L_0x0095
        L_0x0093:
            r21 = r46
        L_0x0095:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009d
            r22 = r2
            goto L_0x009f
        L_0x009d:
            r22 = r47
        L_0x009f:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a7
            r23 = r2
            goto L_0x00a9
        L_0x00a7:
            r23 = r48
        L_0x00a9:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b1
            r24 = r2
            goto L_0x00b3
        L_0x00b1:
            r24 = r49
        L_0x00b3:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00bb
            r25 = r2
            goto L_0x00bd
        L_0x00bb:
            r25 = r50
        L_0x00bd:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c5
            r26 = r2
            goto L_0x00c7
        L_0x00c5:
            r26 = r51
        L_0x00c7:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00cf
            r27 = r2
            goto L_0x00d1
        L_0x00cf:
            r27 = r52
        L_0x00d1:
            r3 = r28
            r9 = r34
            r10 = r35
            r17 = r42
            r18 = r43
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.MyPassIn.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, int, ru.unicorn.ujin.view.activity.navigation.ui.corona.model.Enterprise, ru.unicorn.ujin.view.activity.navigation.ui.corona.model.User, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, ru.unicorn.ujin.view.activity.navigation.ui.corona.model.PassState, ru.unicorn.ujin.view.activity.navigation.ui.corona.model.PassType, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<Object> getDays() {
        return this.days;
    }

    public final int getId() {
        return this.f6606id;
    }

    public final Enterprise getEnterprise() {
        return this.enterprise;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean isArchive() {
        return this.isArchive;
    }

    public final String getPassNumber() {
        return this.passNumber;
    }

    public final String getPrint() {
        return this.print;
    }

    public final String getQr() {
        return this.f6607qr;
    }

    public final String getRevokeComment() {
        return this.revokeComment;
    }

    public final Object getSlot() {
        return this.slot;
    }

    public final PassState getState() {
        return this.state;
    }

    public final PassType getType() {
        return this.type;
    }

    public final Object getUserBirthday() {
        return this.userBirthday;
    }

    public final Object getUserCompanyName() {
        return this.userCompanyName;
    }

    public final Object getUserEmail() {
        return this.userEmail;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getUserPatronymic() {
        return this.userPatronymic;
    }

    public final String getUserPhone() {
        return this.userPhone;
    }

    public final String getUserSurname() {
        return this.userSurname;
    }

    public final String getWorkTimeFrom() {
        return this.workTimeFrom;
    }

    public final String getWorkTimeTo() {
        return this.workTimeTo;
    }

    public final String getFullName() {
        return this.userName + ' ' + this.userSurname + ' ' + this.userPatronymic;
    }

    public boolean areItemsTheSame(MyPassIn myPassIn) {
        return myPassIn != null && this.f6606id == myPassIn.f6606id;
    }
}
