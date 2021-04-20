package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.EmployeeDataType;
import p035ru.unicorn.ujin.view.activity.navigation.p058ui.myrenta.RentPermissions;
import p046io.realm.C4787xe7d1c935;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u00022\u00020\u0003:\u00010Bc\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\u0012\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010.\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010/\u001a\u00020\u0011H\u0016R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u000f\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001c¨\u00061"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/EmployeeDataType;", "userdata", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserData;", "position", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserCompany;", "vehicles", "Lio/realm/RealmList;", "Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserVehicle;", "permissions", "Lru/unicorn/ujin/view/activity/navigation/ui/myrenta/RentPermissions;", "me", "", "isVerified", "propertyId", "", "(Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserData;Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserCompany;Lio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "()Ljava/lang/Boolean;", "setVerified", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMe", "setMe", "getPermissions", "()Lio/realm/RealmList;", "setPermissions", "(Lio/realm/RealmList;)V", "getPosition", "()Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserCompany;", "setPosition", "(Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserCompany;)V", "getPropertyId", "()Ljava/lang/Integer;", "setPropertyId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getUserdata", "()Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserData;", "setUserdata", "(Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserData;)V", "getVehicles", "setVehicles", "areContentsTheSame", "other", "areItemsTheSame", "getDataType", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile */
/* compiled from: UserProfile.kt */
public class UserProfile extends RealmObject implements Diffable<UserProfile>, EmployeeDataType, C4787xe7d1c935 {
    @SerializedName("is_verified")
    private Boolean isVerified;

    /* renamed from: me */
    private Boolean f6849me;
    private RealmList<RentPermissions> permissions;
    private UserCompany position;
    @SerializedName("property_id")
    private Integer propertyId;
    private UserData userdata;
    private RealmList<UserVehicle> vehicles;

    public UserProfile() {
        this((UserData) null, (UserCompany) null, (RealmList) null, (RealmList) null, (Boolean) null, (Boolean) null, (Integer) null, 127, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public boolean areContentsTheSame(UserProfile userProfile) {
        return false;
    }

    public boolean areItemsTheSame(UserProfile userProfile) {
        return false;
    }

    public int getDataType() {
        return 1;
    }

    public Boolean realmGet$isVerified() {
        return this.isVerified;
    }

    public Boolean realmGet$me() {
        return this.f6849me;
    }

    public RealmList realmGet$permissions() {
        return this.permissions;
    }

    public UserCompany realmGet$position() {
        return this.position;
    }

    public Integer realmGet$propertyId() {
        return this.propertyId;
    }

    public UserData realmGet$userdata() {
        return this.userdata;
    }

    public RealmList realmGet$vehicles() {
        return this.vehicles;
    }

    public void realmSet$isVerified(Boolean bool) {
        this.isVerified = bool;
    }

    public void realmSet$me(Boolean bool) {
        this.f6849me = bool;
    }

    public void realmSet$permissions(RealmList realmList) {
        this.permissions = realmList;
    }

    public void realmSet$position(UserCompany userCompany) {
        this.position = userCompany;
    }

    public void realmSet$propertyId(Integer num) {
        this.propertyId = num;
    }

    public void realmSet$userdata(UserData userData) {
        this.userdata = userData;
    }

    public void realmSet$vehicles(RealmList realmList) {
        this.vehicles = realmList;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserProfile(p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData r6, p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany r7, p046io.realm.RealmList r8, p046io.realm.RealmList r9, java.lang.Boolean r10, java.lang.Boolean r11, java.lang.Integer r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0008
            r6 = r0
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData r6 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData) r6
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000f
            r7 = r0
            ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserCompany r7 = (p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserCompany) r7
        L_0x000f:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0019
            io.realm.RealmList r8 = new io.realm.RealmList
            r8.<init>()
        L_0x0019:
            r1 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x0023
            io.realm.RealmList r9 = new io.realm.RealmList
            r9.<init>()
        L_0x0023:
            r2 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x002b
            r10 = r0
            java.lang.Boolean r10 = (java.lang.Boolean) r10
        L_0x002b:
            r3 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x0033
            r11 = r0
            java.lang.Boolean r11 = (java.lang.Boolean) r11
        L_0x0033:
            r4 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x003b
            r12 = r0
            java.lang.Integer r12 = (java.lang.Integer) r12
        L_0x003b:
            r0 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            boolean r6 = r5 instanceof p046io.realm.internal.RealmObjectProxy
            if (r6 == 0) goto L_0x0051
            r6 = r5
            io.realm.internal.RealmObjectProxy r6 = (p046io.realm.internal.RealmObjectProxy) r6
            r6.realm$injectObjectContext()
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserProfile.<init>(ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData, ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserCompany, io.realm.RealmList, io.realm.RealmList, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final UserData getUserdata() {
        return realmGet$userdata();
    }

    public final void setUserdata(UserData userData) {
        realmSet$userdata(userData);
    }

    public final UserCompany getPosition() {
        return realmGet$position();
    }

    public final void setPosition(UserCompany userCompany) {
        realmSet$position(userCompany);
    }

    public final RealmList<UserVehicle> getVehicles() {
        return realmGet$vehicles();
    }

    public final void setVehicles(RealmList<UserVehicle> realmList) {
        Intrinsics.checkNotNullParameter(realmList, "<set-?>");
        realmSet$vehicles(realmList);
    }

    public final RealmList<RentPermissions> getPermissions() {
        return realmGet$permissions();
    }

    public final void setPermissions(RealmList<RentPermissions> realmList) {
        realmSet$permissions(realmList);
    }

    public final Boolean getMe() {
        return realmGet$me();
    }

    public final void setMe(Boolean bool) {
        realmSet$me(bool);
    }

    public final Boolean isVerified() {
        return realmGet$isVerified();
    }

    public final void setVerified(Boolean bool) {
        realmSet$isVerified(bool);
    }

    public final Integer getPropertyId() {
        return realmGet$propertyId();
    }

    public final void setPropertyId(Integer num) {
        realmSet$propertyId(num);
    }

    public UserProfile(UserData userData, UserCompany userCompany, RealmList<UserVehicle> realmList, RealmList<RentPermissions> realmList2, Boolean bool, Boolean bool2, Integer num) {
        Intrinsics.checkNotNullParameter(realmList, "vehicles");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$userdata(userData);
        realmSet$position(userCompany);
        realmSet$vehicles(realmList);
        realmSet$permissions(realmList2);
        realmSet$me(bool);
        realmSet$isVerified(bool2);
        realmSet$propertyId(num);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserProfile$Fields;", "", "()V", "birthday", "", "email", "fullname", "gender", "id", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserProfile$Fields */
    /* compiled from: UserProfile.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();
        public static final String birthday = "birthday";
        public static final String email = "email";
        public static final String fullname = "fullname";
        public static final String gender = "gender";

        /* renamed from: id */
        public static final String f6850id = "id";

        private Fields() {
        }
    }
}
