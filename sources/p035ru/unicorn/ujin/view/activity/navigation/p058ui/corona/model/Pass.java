package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\t\u00101\u001a\u00020\u0014HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0001HÆ\u0003J\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\bHÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00018\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019¨\u0006B"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Pass;", "", "activeFrom", "", "activeTo", "comment", "days", "", "", "enterprise", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Enterprise;", "id", "qr", "passNumber", "revokeComment", "state", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/State;", "type", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Type;", "user", "Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/User;", "workTimeFrom", "workTimeTo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Enterprise;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/State;Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Type;Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/User;Ljava/lang/String;Ljava/lang/String;)V", "getActiveFrom", "()Ljava/lang/String;", "getActiveTo", "getComment", "getDays", "()Ljava/util/List;", "getEnterprise", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Enterprise;", "getId", "()I", "getPassNumber", "getQr", "getRevokeComment", "()Ljava/lang/Object;", "getState", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/State;", "getType", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Type;", "getUser", "()Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/User;", "getWorkTimeFrom", "getWorkTimeTo", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.model.Pass */
/* compiled from: PassDetailIn.kt */
public final class Pass {
    @SerializedName("active_from")
    private final String activeFrom;
    @SerializedName("active_to")
    private final String activeTo;
    @SerializedName("comment")
    private final String comment;
    @SerializedName("days")
    private final List<Integer> days;
    @SerializedName("enterprise")
    private final Enterprise enterprise;
    @SerializedName("id")

    /* renamed from: id */
    private final int f6754id;
    @SerializedName("pass_number")
    private final String passNumber;
    @SerializedName("qr")

    /* renamed from: qr */
    private final String f6755qr;
    @SerializedName("revoke_comment")
    private final Object revokeComment;
    @SerializedName("state")
    private final State state;
    @SerializedName("type")
    private final Type type;
    @SerializedName("user")
    private final User user;
    @SerializedName("work_time_from")
    private final String workTimeFrom;
    @SerializedName("work_time_to")
    private final String workTimeTo;

    public static /* synthetic */ Pass copy$default(Pass pass, String str, String str2, String str3, List list, Enterprise enterprise2, int i, String str4, String str5, Object obj, State state2, Type type2, User user2, String str6, String str7, int i2, Object obj2) {
        Pass pass2 = pass;
        int i3 = i2;
        return pass.copy((i3 & 1) != 0 ? pass2.activeFrom : str, (i3 & 2) != 0 ? pass2.activeTo : str2, (i3 & 4) != 0 ? pass2.comment : str3, (i3 & 8) != 0 ? pass2.days : list, (i3 & 16) != 0 ? pass2.enterprise : enterprise2, (i3 & 32) != 0 ? pass2.f6754id : i, (i3 & 64) != 0 ? pass2.f6755qr : str4, (i3 & 128) != 0 ? pass2.passNumber : str5, (i3 & 256) != 0 ? pass2.revokeComment : obj, (i3 & 512) != 0 ? pass2.state : state2, (i3 & 1024) != 0 ? pass2.type : type2, (i3 & 2048) != 0 ? pass2.user : user2, (i3 & 4096) != 0 ? pass2.workTimeFrom : str6, (i3 & 8192) != 0 ? pass2.workTimeTo : str7);
    }

    public final String component1() {
        return this.activeFrom;
    }

    public final State component10() {
        return this.state;
    }

    public final Type component11() {
        return this.type;
    }

    public final User component12() {
        return this.user;
    }

    public final String component13() {
        return this.workTimeFrom;
    }

    public final String component14() {
        return this.workTimeTo;
    }

    public final String component2() {
        return this.activeTo;
    }

    public final String component3() {
        return this.comment;
    }

    public final List<Integer> component4() {
        return this.days;
    }

    public final Enterprise component5() {
        return this.enterprise;
    }

    public final int component6() {
        return this.f6754id;
    }

    public final String component7() {
        return this.f6755qr;
    }

    public final String component8() {
        return this.passNumber;
    }

    public final Object component9() {
        return this.revokeComment;
    }

    public final Pass copy(String str, String str2, String str3, List<Integer> list, Enterprise enterprise2, int i, String str4, String str5, Object obj, State state2, Type type2, User user2, String str6, String str7) {
        String str8 = str;
        Intrinsics.checkNotNullParameter(str8, "activeFrom");
        String str9 = str2;
        Intrinsics.checkNotNullParameter(str9, "activeTo");
        String str10 = str3;
        Intrinsics.checkNotNullParameter(str10, "comment");
        List<Integer> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "days");
        Enterprise enterprise3 = enterprise2;
        Intrinsics.checkNotNullParameter(enterprise3, "enterprise");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, "qr");
        String str12 = str5;
        Intrinsics.checkNotNullParameter(str12, "passNumber");
        Object obj2 = obj;
        Intrinsics.checkNotNullParameter(obj2, "revokeComment");
        State state3 = state2;
        Intrinsics.checkNotNullParameter(state3, "state");
        Type type3 = type2;
        Intrinsics.checkNotNullParameter(type3, "type");
        User user3 = user2;
        Intrinsics.checkNotNullParameter(user3, "user");
        String str13 = str6;
        Intrinsics.checkNotNullParameter(str13, "workTimeFrom");
        String str14 = str7;
        Intrinsics.checkNotNullParameter(str14, "workTimeTo");
        return new Pass(str8, str9, str10, list2, enterprise3, i, str11, str12, obj2, state3, type3, user3, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pass)) {
            return false;
        }
        Pass pass = (Pass) obj;
        return Intrinsics.areEqual((Object) this.activeFrom, (Object) pass.activeFrom) && Intrinsics.areEqual((Object) this.activeTo, (Object) pass.activeTo) && Intrinsics.areEqual((Object) this.comment, (Object) pass.comment) && Intrinsics.areEqual((Object) this.days, (Object) pass.days) && Intrinsics.areEqual((Object) this.enterprise, (Object) pass.enterprise) && this.f6754id == pass.f6754id && Intrinsics.areEqual((Object) this.f6755qr, (Object) pass.f6755qr) && Intrinsics.areEqual((Object) this.passNumber, (Object) pass.passNumber) && Intrinsics.areEqual(this.revokeComment, pass.revokeComment) && Intrinsics.areEqual((Object) this.state, (Object) pass.state) && Intrinsics.areEqual((Object) this.type, (Object) pass.type) && Intrinsics.areEqual((Object) this.user, (Object) pass.user) && Intrinsics.areEqual((Object) this.workTimeFrom, (Object) pass.workTimeFrom) && Intrinsics.areEqual((Object) this.workTimeTo, (Object) pass.workTimeTo);
    }

    public int hashCode() {
        String str = this.activeFrom;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.activeTo;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.comment;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<Integer> list = this.days;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        Enterprise enterprise2 = this.enterprise;
        int hashCode5 = (((hashCode4 + (enterprise2 != null ? enterprise2.hashCode() : 0)) * 31) + Integer.valueOf(this.f6754id).hashCode()) * 31;
        String str4 = this.f6755qr;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.passNumber;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Object obj = this.revokeComment;
        int hashCode8 = (hashCode7 + (obj != null ? obj.hashCode() : 0)) * 31;
        State state2 = this.state;
        int hashCode9 = (hashCode8 + (state2 != null ? state2.hashCode() : 0)) * 31;
        Type type2 = this.type;
        int hashCode10 = (hashCode9 + (type2 != null ? type2.hashCode() : 0)) * 31;
        User user2 = this.user;
        int hashCode11 = (hashCode10 + (user2 != null ? user2.hashCode() : 0)) * 31;
        String str6 = this.workTimeFrom;
        int hashCode12 = (hashCode11 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.workTimeTo;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode12 + i;
    }

    public String toString() {
        return "Pass(activeFrom=" + this.activeFrom + ", activeTo=" + this.activeTo + ", comment=" + this.comment + ", days=" + this.days + ", enterprise=" + this.enterprise + ", id=" + this.f6754id + ", qr=" + this.f6755qr + ", passNumber=" + this.passNumber + ", revokeComment=" + this.revokeComment + ", state=" + this.state + ", type=" + this.type + ", user=" + this.user + ", workTimeFrom=" + this.workTimeFrom + ", workTimeTo=" + this.workTimeTo + ")";
    }

    public Pass(String str, String str2, String str3, List<Integer> list, Enterprise enterprise2, int i, String str4, String str5, Object obj, State state2, Type type2, User user2, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "activeFrom");
        Intrinsics.checkNotNullParameter(str2, "activeTo");
        Intrinsics.checkNotNullParameter(str3, "comment");
        Intrinsics.checkNotNullParameter(list, "days");
        Intrinsics.checkNotNullParameter(enterprise2, "enterprise");
        Intrinsics.checkNotNullParameter(str4, "qr");
        Intrinsics.checkNotNullParameter(str5, "passNumber");
        Intrinsics.checkNotNullParameter(obj, "revokeComment");
        Intrinsics.checkNotNullParameter(state2, "state");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(user2, "user");
        Intrinsics.checkNotNullParameter(str6, "workTimeFrom");
        Intrinsics.checkNotNullParameter(str7, "workTimeTo");
        this.activeFrom = str;
        this.activeTo = str2;
        this.comment = str3;
        this.days = list;
        this.enterprise = enterprise2;
        this.f6754id = i;
        this.f6755qr = str4;
        this.passNumber = str5;
        this.revokeComment = obj;
        this.state = state2;
        this.type = type2;
        this.user = user2;
        this.workTimeFrom = str6;
        this.workTimeTo = str7;
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

    public final List<Integer> getDays() {
        return this.days;
    }

    public final Enterprise getEnterprise() {
        return this.enterprise;
    }

    public final int getId() {
        return this.f6754id;
    }

    public final String getQr() {
        return this.f6755qr;
    }

    public final String getPassNumber() {
        return this.passNumber;
    }

    public final Object getRevokeComment() {
        return this.revokeComment;
    }

    public final State getState() {
        return this.state;
    }

    public final Type getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getWorkTimeFrom() {
        return this.workTimeFrom;
    }

    public final String getWorkTimeTo() {
        return this.workTimeTo;
    }
}
