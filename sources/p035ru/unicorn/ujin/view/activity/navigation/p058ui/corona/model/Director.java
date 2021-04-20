package p035ru.unicorn.ujin.view.activity.navigation.p058ui.corona.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/corona/model/Director;", "", "avatar", "", "email", "fullname", "id", "", "phone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getEmail", "getFullname", "getId", "()I", "getPhone", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.corona.model.Director */
/* compiled from: PassDetailIn.kt */
public final class Director {
    @SerializedName("avatar")
    private final String avatar;
    @SerializedName("email")
    private final String email;
    @SerializedName("fullname")
    private final String fullname;
    @SerializedName("id")

    /* renamed from: id */
    private final int f6752id;
    @SerializedName("phone")
    private final String phone;

    public static /* synthetic */ Director copy$default(Director director, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = director.avatar;
        }
        if ((i2 & 2) != 0) {
            str2 = director.email;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = director.fullname;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = director.f6752id;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = director.phone;
        }
        return director.copy(str, str5, str6, i3, str4);
    }

    public final String component1() {
        return this.avatar;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.fullname;
    }

    public final int component4() {
        return this.f6752id;
    }

    public final String component5() {
        return this.phone;
    }

    public final Director copy(String str, String str2, String str3, int i, String str4) {
        Intrinsics.checkNotNullParameter(str, "avatar");
        Intrinsics.checkNotNullParameter(str2, "email");
        Intrinsics.checkNotNullParameter(str3, UserProfile.Fields.fullname);
        Intrinsics.checkNotNullParameter(str4, "phone");
        return new Director(str, str2, str3, i, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Director)) {
            return false;
        }
        Director director = (Director) obj;
        return Intrinsics.areEqual((Object) this.avatar, (Object) director.avatar) && Intrinsics.areEqual((Object) this.email, (Object) director.email) && Intrinsics.areEqual((Object) this.fullname, (Object) director.fullname) && this.f6752id == director.f6752id && Intrinsics.areEqual((Object) this.phone, (Object) director.phone);
    }

    public int hashCode() {
        String str = this.avatar;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fullname;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.valueOf(this.f6752id).hashCode()) * 31;
        String str4 = this.phone;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "Director(avatar=" + this.avatar + ", email=" + this.email + ", fullname=" + this.fullname + ", id=" + this.f6752id + ", phone=" + this.phone + ")";
    }

    public Director(String str, String str2, String str3, int i, String str4) {
        Intrinsics.checkNotNullParameter(str, "avatar");
        Intrinsics.checkNotNullParameter(str2, "email");
        Intrinsics.checkNotNullParameter(str3, UserProfile.Fields.fullname);
        Intrinsics.checkNotNullParameter(str4, "phone");
        this.avatar = str;
        this.email = str2;
        this.fullname = str3;
        this.f6752id = i;
        this.phone = str4;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFullname() {
        return this.fullname;
    }

    public final int getId() {
        return this.f6752id;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Director(String str, String str2, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? "" : str3, i, (i2 & 16) != 0 ? "" : str4);
    }

    public final String getPhone() {
        return this.phone;
    }
}
