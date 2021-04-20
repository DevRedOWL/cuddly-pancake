package p035ru.unicorn.ujin.data.realm.profile;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b@\b\u0016\u0018\u00002\u00020\u0001B\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u0005¢\u0006\u0002\u0010\"R\u001a\u0010\u001d\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R&\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u0010\u0016\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001a\u0010!\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001a\u0010\u001c\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010$\"\u0004\b>\u0010&R\u001e\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\u001e\u0010\u0012\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010$\"\u0004\bF\u0010&R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010$\"\u0004\bL\u0010&R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010$\"\u0004\bN\u0010&R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010$\"\u0004\bP\u0010&R\u001e\u0010\u0010\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010.\"\u0004\bR\u00100R\u001e\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010.\"\u0004\bT\u00100R\u001e\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010.\"\u0004\bV\u00100R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010(\"\u0004\bX\u0010*R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010$\"\u0004\bZ\u0010&R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010$\"\u0004\b\\\u0010&R\u001a\u0010 \u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010:\"\u0004\b^\u0010<¨\u0006_"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/profile/DemoUser;", "Lio/realm/RealmObject;", "id", "", "token", "", "fullName", "name", "surname", "patronymic", "email", "phone", "avatar", "balance", "", "status", "roleId", "gender", "hideAccount", "hideAccountText", "hideAccountFullText", "stage", "demo", "apartmentList", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/profile/Apartment;", "subAccountList", "Lru/unicorn/ujin/data/api/response/SubAccount;", "fcmToken", "aid", "firstTimeSinceLogin", "", "userLoggenIn", "demoToken", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;IILio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "getApartmentList", "()Lio/realm/RealmList;", "setApartmentList", "(Lio/realm/RealmList;)V", "getAvatar", "setAvatar", "getBalance", "()I", "setBalance", "(I)V", "getDemo", "setDemo", "getDemoToken", "setDemoToken", "getEmail", "setEmail", "getFcmToken", "setFcmToken", "getFirstTimeSinceLogin", "()Z", "setFirstTimeSinceLogin", "(Z)V", "getFullName", "setFullName", "getGender", "setGender", "getHideAccount", "setHideAccount", "getHideAccountFullText", "setHideAccountFullText", "getHideAccountText", "setHideAccountText", "getId", "()J", "setId", "(J)V", "getName", "setName", "getPatronymic", "setPatronymic", "getPhone", "setPhone", "getRoleId", "setRoleId", "getStage", "setStage", "getStatus", "setStatus", "getSubAccountList", "setSubAccountList", "getSurname", "setSurname", "getToken", "setToken", "getUserLoggenIn", "setUserLoggenIn", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.profile.DemoUser */
/* compiled from: DemoUser.kt */
public class DemoUser extends RealmObject implements ru_unicorn_ujin_data_realm_profile_DemoUserRealmProxyInterface {
    private String aid;
    @SerializedName("apartment")
    private RealmList<Apartment> apartmentList;
    @SerializedName("user_avatar")
    private String avatar;
    @SerializedName("user_balance")
    private int balance;
    @SerializedName("is_demo")
    private int demo;
    private String demoToken;
    @SerializedName("user_mail")
    private String email;
    private String fcmToken;
    private boolean firstTimeSinceLogin;
    @SerializedName("user_fullname")
    private String fullName;
    @SerializedName("user_gender")
    private int gender;
    @SerializedName("user_search_disable")
    private int hideAccount;
    @SerializedName("user_search_disable_fulltext")
    private String hideAccountFullText;
    @SerializedName("user_search_disable_text")
    private String hideAccountText;
    @SerializedName("user_id")
    @PrimaryKey

    /* renamed from: id */
    private long f6702id;
    @SerializedName("user_name")
    private String name;
    @SerializedName("user_patronymic")
    private String patronymic;
    @SerializedName("user_phone")
    private String phone;
    @SerializedName("user_role_id")
    private int roleId;
    @SerializedName("stage")
    private int stage;
    @SerializedName("user_status")
    private int status;
    private RealmList<SubAccount> subAccountList;
    @SerializedName("user_surname")
    private String surname;
    @SerializedName("token")
    private String token;
    private boolean userLoggenIn;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DemoUser() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, 0, 0, (RealmList) null, (RealmList) null, (String) null, (String) null, false, false, (String) null, 33554431, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$aid() {
        return this.aid;
    }

    public RealmList realmGet$apartmentList() {
        return this.apartmentList;
    }

    public String realmGet$avatar() {
        return this.avatar;
    }

    public int realmGet$balance() {
        return this.balance;
    }

    public int realmGet$demo() {
        return this.demo;
    }

    public String realmGet$demoToken() {
        return this.demoToken;
    }

    public String realmGet$email() {
        return this.email;
    }

    public String realmGet$fcmToken() {
        return this.fcmToken;
    }

    public boolean realmGet$firstTimeSinceLogin() {
        return this.firstTimeSinceLogin;
    }

    public String realmGet$fullName() {
        return this.fullName;
    }

    public int realmGet$gender() {
        return this.gender;
    }

    public int realmGet$hideAccount() {
        return this.hideAccount;
    }

    public String realmGet$hideAccountFullText() {
        return this.hideAccountFullText;
    }

    public String realmGet$hideAccountText() {
        return this.hideAccountText;
    }

    public long realmGet$id() {
        return this.f6702id;
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$patronymic() {
        return this.patronymic;
    }

    public String realmGet$phone() {
        return this.phone;
    }

    public int realmGet$roleId() {
        return this.roleId;
    }

    public int realmGet$stage() {
        return this.stage;
    }

    public int realmGet$status() {
        return this.status;
    }

    public RealmList realmGet$subAccountList() {
        return this.subAccountList;
    }

    public String realmGet$surname() {
        return this.surname;
    }

    public String realmGet$token() {
        return this.token;
    }

    public boolean realmGet$userLoggenIn() {
        return this.userLoggenIn;
    }

    public void realmSet$aid(String str) {
        this.aid = str;
    }

    public void realmSet$apartmentList(RealmList realmList) {
        this.apartmentList = realmList;
    }

    public void realmSet$avatar(String str) {
        this.avatar = str;
    }

    public void realmSet$balance(int i) {
        this.balance = i;
    }

    public void realmSet$demo(int i) {
        this.demo = i;
    }

    public void realmSet$demoToken(String str) {
        this.demoToken = str;
    }

    public void realmSet$email(String str) {
        this.email = str;
    }

    public void realmSet$fcmToken(String str) {
        this.fcmToken = str;
    }

    public void realmSet$firstTimeSinceLogin(boolean z) {
        this.firstTimeSinceLogin = z;
    }

    public void realmSet$fullName(String str) {
        this.fullName = str;
    }

    public void realmSet$gender(int i) {
        this.gender = i;
    }

    public void realmSet$hideAccount(int i) {
        this.hideAccount = i;
    }

    public void realmSet$hideAccountFullText(String str) {
        this.hideAccountFullText = str;
    }

    public void realmSet$hideAccountText(String str) {
        this.hideAccountText = str;
    }

    public void realmSet$id(long j) {
        this.f6702id = j;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$patronymic(String str) {
        this.patronymic = str;
    }

    public void realmSet$phone(String str) {
        this.phone = str;
    }

    public void realmSet$roleId(int i) {
        this.roleId = i;
    }

    public void realmSet$stage(int i) {
        this.stage = i;
    }

    public void realmSet$status(int i) {
        this.status = i;
    }

    public void realmSet$subAccountList(RealmList realmList) {
        this.subAccountList = realmList;
    }

    public void realmSet$surname(String str) {
        this.surname = str;
    }

    public void realmSet$token(String str) {
        this.token = str;
    }

    public void realmSet$userLoggenIn(boolean z) {
        this.userLoggenIn = z;
    }

    public final long getId() {
        return realmGet$id();
    }

    public final void setId(long j) {
        realmSet$id(j);
    }

    public final String getToken() {
        return realmGet$token();
    }

    public final void setToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$token(str);
    }

    public final String getFullName() {
        return realmGet$fullName();
    }

    public final void setFullName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$fullName(str);
    }

    public final String getName() {
        return realmGet$name();
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$name(str);
    }

    public final String getSurname() {
        return realmGet$surname();
    }

    public final void setSurname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$surname(str);
    }

    public final String getPatronymic() {
        return realmGet$patronymic();
    }

    public final void setPatronymic(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$patronymic(str);
    }

    public final String getEmail() {
        return realmGet$email();
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$email(str);
    }

    public final String getPhone() {
        return realmGet$phone();
    }

    public final void setPhone(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$phone(str);
    }

    public final String getAvatar() {
        return realmGet$avatar();
    }

    public final void setAvatar(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$avatar(str);
    }

    public final int getBalance() {
        return realmGet$balance();
    }

    public final void setBalance(int i) {
        realmSet$balance(i);
    }

    public final int getStatus() {
        return realmGet$status();
    }

    public final void setStatus(int i) {
        realmSet$status(i);
    }

    public final int getRoleId() {
        return realmGet$roleId();
    }

    public final void setRoleId(int i) {
        realmSet$roleId(i);
    }

    public final int getGender() {
        return realmGet$gender();
    }

    public final void setGender(int i) {
        realmSet$gender(i);
    }

    public final int getHideAccount() {
        return realmGet$hideAccount();
    }

    public final void setHideAccount(int i) {
        realmSet$hideAccount(i);
    }

    public final String getHideAccountText() {
        return realmGet$hideAccountText();
    }

    public final void setHideAccountText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$hideAccountText(str);
    }

    public final String getHideAccountFullText() {
        return realmGet$hideAccountFullText();
    }

    public final void setHideAccountFullText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$hideAccountFullText(str);
    }

    public final int getStage() {
        return realmGet$stage();
    }

    public final void setStage(int i) {
        realmSet$stage(i);
    }

    public final int getDemo() {
        return realmGet$demo();
    }

    public final void setDemo(int i) {
        realmSet$demo(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DemoUser(long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, int r37, int r38, int r39, int r40, int r41, java.lang.String r42, java.lang.String r43, int r44, int r45, p046io.realm.RealmList r46, p046io.realm.RealmList r47, java.lang.String r48, java.lang.String r49, boolean r50, boolean r51, java.lang.String r52, int r53, kotlin.jvm.internal.DefaultConstructorMarker r54) {
        /*
            r26 = this;
            r0 = r26
            r1 = r53
            r2 = r1 & 1
            if (r2 == 0) goto L_0x000b
            r2 = 0
            goto L_0x000d
        L_0x000b:
            r2 = r27
        L_0x000d:
            r4 = r1 & 2
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0015
            r4 = r5
            goto L_0x0017
        L_0x0015:
            r4 = r29
        L_0x0017:
            r6 = r1 & 4
            if (r6 == 0) goto L_0x001d
            r6 = r5
            goto L_0x001f
        L_0x001d:
            r6 = r30
        L_0x001f:
            r7 = r1 & 8
            if (r7 == 0) goto L_0x0025
            r7 = r5
            goto L_0x0027
        L_0x0025:
            r7 = r31
        L_0x0027:
            r8 = r1 & 16
            if (r8 == 0) goto L_0x002d
            r8 = r5
            goto L_0x002f
        L_0x002d:
            r8 = r32
        L_0x002f:
            r9 = r1 & 32
            if (r9 == 0) goto L_0x0035
            r9 = r5
            goto L_0x0037
        L_0x0035:
            r9 = r33
        L_0x0037:
            r10 = r1 & 64
            if (r10 == 0) goto L_0x003d
            r10 = r5
            goto L_0x003f
        L_0x003d:
            r10 = r34
        L_0x003f:
            r11 = r1 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0045
            r11 = r5
            goto L_0x0047
        L_0x0045:
            r11 = r35
        L_0x0047:
            r12 = r1 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004d
            r12 = r5
            goto L_0x004f
        L_0x004d:
            r12 = r36
        L_0x004f:
            r13 = r1 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0055
            r13 = 0
            goto L_0x0057
        L_0x0055:
            r13 = r37
        L_0x0057:
            r15 = r1 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x005d
            r15 = 0
            goto L_0x005f
        L_0x005d:
            r15 = r38
        L_0x005f:
            r14 = r1 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0065
            r14 = 0
            goto L_0x0067
        L_0x0065:
            r14 = r39
        L_0x0067:
            r28 = r5
            r5 = r1 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x006f
            r5 = 0
            goto L_0x0071
        L_0x006f:
            r5 = r40
        L_0x0071:
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0077
            r0 = 0
            goto L_0x0079
        L_0x0077:
            r0 = r41
        L_0x0079:
            r54 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0082
            r0 = r28
            goto L_0x0084
        L_0x0082:
            r0 = r42
        L_0x0084:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r1 & r16
            if (r16 == 0) goto L_0x008e
            r16 = r28
            goto L_0x0090
        L_0x008e:
            r16 = r43
        L_0x0090:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r1 & r17
            if (r17 == 0) goto L_0x0099
            r17 = 1
            goto L_0x009b
        L_0x0099:
            r17 = r44
        L_0x009b:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r1 & r18
            if (r18 == 0) goto L_0x00a4
            r18 = 0
            goto L_0x00a6
        L_0x00a4:
            r18 = r45
        L_0x00a6:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r1 & r19
            if (r19 == 0) goto L_0x00b2
            io.realm.RealmList r19 = new io.realm.RealmList
            r19.<init>()
            goto L_0x00b4
        L_0x00b2:
            r19 = r46
        L_0x00b4:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r1 & r20
            if (r20 == 0) goto L_0x00c0
            io.realm.RealmList r20 = new io.realm.RealmList
            r20.<init>()
            goto L_0x00c2
        L_0x00c0:
            r20 = r47
        L_0x00c2:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r1 & r21
            if (r21 == 0) goto L_0x00cb
            r21 = r28
            goto L_0x00cd
        L_0x00cb:
            r21 = r48
        L_0x00cd:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r1 & r22
            if (r22 == 0) goto L_0x00d6
            r22 = r28
            goto L_0x00d8
        L_0x00d6:
            r22 = r49
        L_0x00d8:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r1 & r23
            if (r23 == 0) goto L_0x00e1
            r23 = 0
            goto L_0x00e3
        L_0x00e1:
            r23 = r50
        L_0x00e3:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r1 & r24
            if (r24 == 0) goto L_0x00ec
            r24 = 0
            goto L_0x00ee
        L_0x00ec:
            r24 = r51
        L_0x00ee:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r25
            if (r1 == 0) goto L_0x00f7
            r1 = r28
            goto L_0x00f9
        L_0x00f7:
            r1 = r52
        L_0x00f9:
            r27 = r26
            r28 = r2
            r30 = r4
            r31 = r6
            r32 = r7
            r33 = r8
            r34 = r9
            r35 = r10
            r36 = r11
            r37 = r12
            r38 = r13
            r39 = r15
            r40 = r14
            r41 = r5
            r42 = r54
            r43 = r0
            r44 = r16
            r45 = r17
            r46 = r18
            r47 = r19
            r48 = r20
            r49 = r21
            r50 = r22
            r51 = r23
            r52 = r24
            r53 = r1
            r27.<init>(r28, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r0 = r26
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x013c
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x013c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.profile.DemoUser.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, java.lang.String, java.lang.String, int, int, io.realm.RealmList, io.realm.RealmList, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final RealmList<Apartment> getApartmentList() {
        return realmGet$apartmentList();
    }

    public final void setApartmentList(RealmList<Apartment> realmList) {
        realmSet$apartmentList(realmList);
    }

    public final RealmList<SubAccount> getSubAccountList() {
        return realmGet$subAccountList();
    }

    public final void setSubAccountList(RealmList<SubAccount> realmList) {
        realmSet$subAccountList(realmList);
    }

    public final String getFcmToken() {
        return realmGet$fcmToken();
    }

    public final void setFcmToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$fcmToken(str);
    }

    public final String getAid() {
        return realmGet$aid();
    }

    public final void setAid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$aid(str);
    }

    public final boolean getFirstTimeSinceLogin() {
        return realmGet$firstTimeSinceLogin();
    }

    public final void setFirstTimeSinceLogin(boolean z) {
        realmSet$firstTimeSinceLogin(z);
    }

    public final boolean getUserLoggenIn() {
        return realmGet$userLoggenIn();
    }

    public final void setUserLoggenIn(boolean z) {
        realmSet$userLoggenIn(z);
    }

    public final String getDemoToken() {
        return realmGet$demoToken();
    }

    public final void setDemoToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$demoToken(str);
    }

    public DemoUser(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4, int i5, String str9, String str10, int i6, int i7, RealmList<Apartment> realmList, RealmList<SubAccount> realmList2, String str11, String str12, boolean z, boolean z2, String str13) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str5;
        String str19 = str6;
        String str20 = str7;
        String str21 = str8;
        String str22 = str9;
        String str23 = str10;
        String str24 = str11;
        String str25 = str12;
        String str26 = str13;
        Intrinsics.checkNotNullParameter(str14, "token");
        Intrinsics.checkNotNullParameter(str15, "fullName");
        Intrinsics.checkNotNullParameter(str16, "name");
        Intrinsics.checkNotNullParameter(str17, "surname");
        Intrinsics.checkNotNullParameter(str18, "patronymic");
        Intrinsics.checkNotNullParameter(str19, "email");
        Intrinsics.checkNotNullParameter(str20, "phone");
        Intrinsics.checkNotNullParameter(str21, "avatar");
        Intrinsics.checkNotNullParameter(str22, "hideAccountText");
        Intrinsics.checkNotNullParameter(str23, "hideAccountFullText");
        Intrinsics.checkNotNullParameter(str24, "fcmToken");
        Intrinsics.checkNotNullParameter(str25, "aid");
        Intrinsics.checkNotNullParameter(str26, "demoToken");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(j);
        realmSet$token(str14);
        realmSet$fullName(str15);
        realmSet$name(str16);
        realmSet$surname(str17);
        realmSet$patronymic(str18);
        realmSet$email(str19);
        realmSet$phone(str20);
        realmSet$avatar(str21);
        realmSet$balance(i);
        realmSet$status(i2);
        realmSet$roleId(i3);
        realmSet$gender(i4);
        realmSet$hideAccount(i5);
        realmSet$hideAccountText(str22);
        realmSet$hideAccountFullText(str23);
        realmSet$stage(i6);
        realmSet$demo(i7);
        realmSet$apartmentList(realmList);
        realmSet$subAccountList(realmList2);
        realmSet$fcmToken(str24);
        realmSet$aid(str25);
        realmSet$firstTimeSinceLogin(z);
        realmSet$userLoggenIn(z2);
        realmSet$demoToken(str26);
    }
}
