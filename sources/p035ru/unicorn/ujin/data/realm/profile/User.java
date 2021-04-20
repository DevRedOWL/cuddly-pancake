package p035ru.unicorn.ujin.data.realm.profile;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.api.response.SubAccount;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\bD\n\u0002\u0010!\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B¯\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020\u0005¢\u0006\u0002\u0010$J\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010fJ\u0006\u0010g\u001a\u00020!R\u001a\u0010\u001f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(R&\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010*\"\u0004\b6\u0010,R\u001e\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00100\"\u0004\b8\u00102R\u001a\u0010#\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010&\"\u0004\b:\u0010(R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010&\"\u0004\b<\u0010(R\u001a\u0010\u001e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010&\"\u0004\b>\u0010(R\u001a\u0010 \u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010&\"\u0004\bD\u0010(R\u001e\u0010\u0012\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00100\"\u0004\bF\u00102R\u001e\u0010\u0013\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00100\"\u0004\bH\u00102R\u001e\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010&\"\u0004\bJ\u0010(R\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010&\"\u0004\bL\u0010(R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010&\"\u0004\bR\u0010(R\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010&\"\u0004\bT\u0010(R\u001e\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010&\"\u0004\bV\u0010(R\u001e\u0010\u0011\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u00100\"\u0004\bX\u00102R\u001e\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00100\"\u0004\bZ\u00102R\u001e\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00100\"\u0004\b\\\u00102R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010*\"\u0004\b^\u0010,R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010&\"\u0004\b`\u0010(R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010&\"\u0004\bb\u0010(R\u001a\u0010\"\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010@\"\u0004\bd\u0010B¨\u0006h"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/profile/User;", "Lio/realm/RealmObject;", "id", "", "token", "", "fullName", "name", "surname", "patronymic", "birthday", "email", "phone", "avatar", "balance", "", "status", "roleId", "gender", "hideAccount", "hideAccountText", "hideAccountFullText", "stage", "demo", "apartmentList", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/profile/Apartment;", "commerceList", "subAccountList", "Lru/unicorn/ujin/data/api/response/SubAccount;", "fcmToken", "aid", "firstTimeSinceLogin", "", "userLoggenIn", "demoToken", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;IILio/realm/RealmList;Lio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "getApartmentList", "()Lio/realm/RealmList;", "setApartmentList", "(Lio/realm/RealmList;)V", "getAvatar", "setAvatar", "getBalance", "()I", "setBalance", "(I)V", "getBirthday", "setBirthday", "getCommerceList", "setCommerceList", "getDemo", "setDemo", "getDemoToken", "setDemoToken", "getEmail", "setEmail", "getFcmToken", "setFcmToken", "getFirstTimeSinceLogin", "()Z", "setFirstTimeSinceLogin", "(Z)V", "getFullName", "setFullName", "getGender", "setGender", "getHideAccount", "setHideAccount", "getHideAccountFullText", "setHideAccountFullText", "getHideAccountText", "setHideAccountText", "getId", "()J", "setId", "(J)V", "getName", "setName", "getPatronymic", "setPatronymic", "getPhone", "setPhone", "getRoleId", "setRoleId", "getStage", "setStage", "getStatus", "setStatus", "getSubAccountList", "setSubAccountList", "getSurname", "setSurname", "getToken", "setToken", "getUserLoggenIn", "setUserLoggenIn", "combineList", "", "isCurrentCommerce", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.profile.User */
/* compiled from: User.kt */
public class User extends RealmObject implements ru_unicorn_ujin_data_realm_profile_UserRealmProxyInterface {
    private String aid;
    @SerializedName("apartment")
    private RealmList<Apartment> apartmentList;
    @SerializedName("user_avatar")
    private String avatar;
    @SerializedName("user_balance")
    private int balance;
    @SerializedName("user_birthday")
    private String birthday;
    @SerializedName("commerce")
    private RealmList<Apartment> commerceList;
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
    private long f6707id;
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
    public User() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, 0, (String) null, (String) null, 0, 0, (RealmList) null, (RealmList) null, (RealmList) null, (String) null, (String) null, false, false, (String) null, 134217727, (DefaultConstructorMarker) null);
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

    public String realmGet$birthday() {
        return this.birthday;
    }

    public RealmList realmGet$commerceList() {
        return this.commerceList;
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
        return this.f6707id;
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

    public void realmSet$birthday(String str) {
        this.birthday = str;
    }

    public void realmSet$commerceList(RealmList realmList) {
        this.commerceList = realmList;
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
        this.f6707id = j;
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

    public final String getBirthday() {
        return realmGet$birthday();
    }

    public final void setBirthday(String str) {
        realmSet$birthday(str);
    }

    public final String getEmail() {
        return realmGet$email();
    }

    public final void setEmail(String str) {
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
    public /* synthetic */ User(long r29, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, int r40, int r41, int r42, int r43, int r44, java.lang.String r45, java.lang.String r46, int r47, int r48, p046io.realm.RealmList r49, p046io.realm.RealmList r50, p046io.realm.RealmList r51, java.lang.String r52, java.lang.String r53, boolean r54, boolean r55, java.lang.String r56, int r57, kotlin.jvm.internal.DefaultConstructorMarker r58) {
        /*
            r28 = this;
            r0 = r28
            r1 = r57
            r2 = r1 & 1
            if (r2 == 0) goto L_0x000b
            r2 = 0
            goto L_0x000d
        L_0x000b:
            r2 = r29
        L_0x000d:
            r4 = r1 & 2
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0015
            r4 = r5
            goto L_0x0017
        L_0x0015:
            r4 = r31
        L_0x0017:
            r6 = r1 & 4
            if (r6 == 0) goto L_0x001d
            r6 = r5
            goto L_0x001f
        L_0x001d:
            r6 = r32
        L_0x001f:
            r7 = r1 & 8
            if (r7 == 0) goto L_0x0025
            r7 = r5
            goto L_0x0027
        L_0x0025:
            r7 = r33
        L_0x0027:
            r8 = r1 & 16
            if (r8 == 0) goto L_0x002d
            r8 = r5
            goto L_0x002f
        L_0x002d:
            r8 = r34
        L_0x002f:
            r9 = r1 & 32
            if (r9 == 0) goto L_0x0035
            r9 = r5
            goto L_0x0037
        L_0x0035:
            r9 = r35
        L_0x0037:
            r10 = r1 & 64
            if (r10 == 0) goto L_0x003d
            r10 = r5
            goto L_0x003f
        L_0x003d:
            r10 = r36
        L_0x003f:
            r11 = r1 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0045
            r11 = r5
            goto L_0x0047
        L_0x0045:
            r11 = r37
        L_0x0047:
            r12 = r1 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004d
            r12 = r5
            goto L_0x004f
        L_0x004d:
            r12 = r38
        L_0x004f:
            r13 = r1 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0055
            r13 = r5
            goto L_0x0057
        L_0x0055:
            r13 = r39
        L_0x0057:
            r14 = r1 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005d
            r14 = 0
            goto L_0x005f
        L_0x005d:
            r14 = r40
        L_0x005f:
            r15 = r1 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0065
            r15 = 0
            goto L_0x0067
        L_0x0065:
            r15 = r41
        L_0x0067:
            r30 = r5
            r5 = r1 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x006f
            r5 = 0
            goto L_0x0071
        L_0x006f:
            r5 = r42
        L_0x0071:
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0077
            r0 = 0
            goto L_0x0079
        L_0x0077:
            r0 = r43
        L_0x0079:
            r58 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0081
            r0 = 0
            goto L_0x0083
        L_0x0081:
            r0 = r44
        L_0x0083:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r1 & r16
            if (r16 == 0) goto L_0x008d
            r16 = r30
            goto L_0x008f
        L_0x008d:
            r16 = r45
        L_0x008f:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r1 & r17
            if (r17 == 0) goto L_0x0098
            r17 = r30
            goto L_0x009a
        L_0x0098:
            r17 = r46
        L_0x009a:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r1 & r18
            if (r18 == 0) goto L_0x00a3
            r18 = 1
            goto L_0x00a5
        L_0x00a3:
            r18 = r47
        L_0x00a5:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r1 & r19
            if (r19 == 0) goto L_0x00ae
            r19 = 0
            goto L_0x00b0
        L_0x00ae:
            r19 = r48
        L_0x00b0:
            r20 = 524288(0x80000, float:7.34684E-40)
            r20 = r1 & r20
            if (r20 == 0) goto L_0x00bc
            io.realm.RealmList r20 = new io.realm.RealmList
            r20.<init>()
            goto L_0x00be
        L_0x00bc:
            r20 = r49
        L_0x00be:
            r21 = 1048576(0x100000, float:1.469368E-39)
            r21 = r1 & r21
            if (r21 == 0) goto L_0x00ca
            io.realm.RealmList r21 = new io.realm.RealmList
            r21.<init>()
            goto L_0x00cc
        L_0x00ca:
            r21 = r50
        L_0x00cc:
            r22 = 2097152(0x200000, float:2.938736E-39)
            r22 = r1 & r22
            if (r22 == 0) goto L_0x00d8
            io.realm.RealmList r22 = new io.realm.RealmList
            r22.<init>()
            goto L_0x00da
        L_0x00d8:
            r22 = r51
        L_0x00da:
            r23 = 4194304(0x400000, float:5.877472E-39)
            r23 = r1 & r23
            if (r23 == 0) goto L_0x00e3
            r23 = r30
            goto L_0x00e5
        L_0x00e3:
            r23 = r52
        L_0x00e5:
            r24 = 8388608(0x800000, float:1.17549435E-38)
            r24 = r1 & r24
            if (r24 == 0) goto L_0x00ee
            r24 = r30
            goto L_0x00f0
        L_0x00ee:
            r24 = r53
        L_0x00f0:
            r25 = 16777216(0x1000000, float:2.3509887E-38)
            r25 = r1 & r25
            if (r25 == 0) goto L_0x00f9
            r25 = 0
            goto L_0x00fb
        L_0x00f9:
            r25 = r54
        L_0x00fb:
            r26 = 33554432(0x2000000, float:9.403955E-38)
            r26 = r1 & r26
            if (r26 == 0) goto L_0x0104
            r26 = 0
            goto L_0x0106
        L_0x0104:
            r26 = r55
        L_0x0106:
            r27 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r27
            if (r1 == 0) goto L_0x010f
            r1 = r30
            goto L_0x0111
        L_0x010f:
            r1 = r56
        L_0x0111:
            r29 = r28
            r30 = r2
            r32 = r4
            r33 = r6
            r34 = r7
            r35 = r8
            r36 = r9
            r37 = r10
            r38 = r11
            r39 = r12
            r40 = r13
            r41 = r14
            r42 = r15
            r43 = r5
            r44 = r58
            r45 = r0
            r46 = r16
            r47 = r17
            r48 = r18
            r49 = r19
            r50 = r20
            r51 = r21
            r52 = r22
            r53 = r23
            r54 = r24
            r55 = r25
            r56 = r26
            r57 = r1
            r29.<init>(r30, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57)
            r0 = r28
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x0158
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x0158:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.profile.User.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, int, java.lang.String, java.lang.String, int, int, io.realm.RealmList, io.realm.RealmList, io.realm.RealmList, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final RealmList<Apartment> getApartmentList() {
        return realmGet$apartmentList();
    }

    public final void setApartmentList(RealmList<Apartment> realmList) {
        realmSet$apartmentList(realmList);
    }

    public final RealmList<Apartment> getCommerceList() {
        return realmGet$commerceList();
    }

    public final void setCommerceList(RealmList<Apartment> realmList) {
        realmSet$commerceList(realmList);
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

    public User(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, int i3, int i4, int i5, String str10, String str11, int i6, int i7, RealmList<Apartment> realmList, RealmList<Apartment> realmList2, RealmList<SubAccount> realmList3, String str12, String str13, boolean z, boolean z2, String str14) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        String str18 = str4;
        String str19 = str5;
        String str20 = str8;
        String str21 = str9;
        String str22 = str10;
        String str23 = str11;
        String str24 = str12;
        String str25 = str13;
        String str26 = str14;
        Intrinsics.checkNotNullParameter(str15, "token");
        Intrinsics.checkNotNullParameter(str16, "fullName");
        Intrinsics.checkNotNullParameter(str17, "name");
        Intrinsics.checkNotNullParameter(str18, "surname");
        Intrinsics.checkNotNullParameter(str19, "patronymic");
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
        realmSet$token(str15);
        realmSet$fullName(str16);
        realmSet$name(str17);
        realmSet$surname(str18);
        realmSet$patronymic(str19);
        realmSet$birthday(str6);
        realmSet$email(str7);
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
        realmSet$commerceList(realmList2);
        realmSet$subAccountList(realmList3);
        realmSet$fcmToken(str24);
        realmSet$aid(str25);
        realmSet$firstTimeSinceLogin(z);
        realmSet$userLoggenIn(z2);
        realmSet$demoToken(str26);
    }

    public final List<Apartment> combineList() {
        List<Apartment> arrayList = new ArrayList<>();
        RealmList realmGet$apartmentList = realmGet$apartmentList();
        if (realmGet$apartmentList != null) {
            arrayList.addAll(realmGet$apartmentList);
        }
        RealmList realmGet$commerceList = realmGet$commerceList();
        if (realmGet$commerceList != null) {
            arrayList.addAll(realmGet$commerceList);
        }
        return arrayList;
    }

    public final boolean isCurrentCommerce() {
        List list;
        RealmList realmGet$commerceList = realmGet$commerceList();
        if (realmGet$commerceList != null) {
            Collection arrayList = new ArrayList();
            for (Object next : realmGet$commerceList) {
                if (Intrinsics.areEqual((Object) ((Apartment) next).realmGet$userToken(), (Object) realmGet$token())) {
                    arrayList.add(next);
                }
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        Collection collection = list;
        return true ^ (collection == null || collection.isEmpty());
    }
}
