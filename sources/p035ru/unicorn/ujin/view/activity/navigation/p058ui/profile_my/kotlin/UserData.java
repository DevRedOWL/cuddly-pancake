package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4785xcd7d828c;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\b\u0016\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0010R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014¨\u0006."}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserData;", "Lio/realm/RealmObject;", "id", "", "comment", "", "name", "surname", "patronymic", "fullname", "providerId", "email", "phone", "birthday", "gender", "lastActive", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirthday", "()Ljava/lang/String;", "setBirthday", "(Ljava/lang/String;)V", "getComment", "setComment", "getEmail", "setEmail", "getFullname", "setFullname", "getGender", "setGender", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLastActive", "setLastActive", "getName", "setName", "getPatronymic", "setPatronymic", "getPhone", "setPhone", "getProviderId", "setProviderId", "getSurname", "setSurname", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserData */
/* compiled from: UserProfile.kt */
public class UserData extends RealmObject implements C4785xcd7d828c {
    private String birthday;
    private String comment;
    private String email;
    private String fullname;
    private String gender;
    @PrimaryKey

    /* renamed from: id */
    private Integer f6848id;
    @SerializedName("last_active")
    private String lastActive;
    private String name;
    private String patronymic;
    private String phone;
    @SerializedName("provider_id")
    private Integer providerId;
    private String surname;

    public UserData() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$birthday() {
        return this.birthday;
    }

    public String realmGet$comment() {
        return this.comment;
    }

    public String realmGet$email() {
        return this.email;
    }

    public String realmGet$fullname() {
        return this.fullname;
    }

    public String realmGet$gender() {
        return this.gender;
    }

    public Integer realmGet$id() {
        return this.f6848id;
    }

    public String realmGet$lastActive() {
        return this.lastActive;
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

    public Integer realmGet$providerId() {
        return this.providerId;
    }

    public String realmGet$surname() {
        return this.surname;
    }

    public void realmSet$birthday(String str) {
        this.birthday = str;
    }

    public void realmSet$comment(String str) {
        this.comment = str;
    }

    public void realmSet$email(String str) {
        this.email = str;
    }

    public void realmSet$fullname(String str) {
        this.fullname = str;
    }

    public void realmSet$gender(String str) {
        this.gender = str;
    }

    public void realmSet$id(Integer num) {
        this.f6848id = num;
    }

    public void realmSet$lastActive(String str) {
        this.lastActive = str;
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

    public void realmSet$providerId(Integer num) {
        this.providerId = num;
    }

    public void realmSet$surname(String str) {
        this.surname = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserData(java.lang.Integer r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Integer r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r0 = r14
            r1 = r27
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000c
            r2 = r3
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x000d
        L_0x000c:
            r2 = r15
        L_0x000d:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0015
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0017
        L_0x0015:
            r4 = r16
        L_0x0017:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x001f
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0021
        L_0x001f:
            r5 = r17
        L_0x0021:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0029
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x002b
        L_0x0029:
            r6 = r18
        L_0x002b:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0033
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0035
        L_0x0033:
            r7 = r19
        L_0x0035:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x003d
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x003f
        L_0x003d:
            r8 = r20
        L_0x003f:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0047
            r9 = r3
            java.lang.Integer r9 = (java.lang.Integer) r9
            goto L_0x0049
        L_0x0047:
            r9 = r21
        L_0x0049:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0051
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0053
        L_0x0051:
            r10 = r22
        L_0x0053:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x005b
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x005d
        L_0x005b:
            r11 = r23
        L_0x005d:
            r12 = r1 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0065
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x0067
        L_0x0065:
            r12 = r24
        L_0x0067:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x006f
            r13 = r3
            java.lang.String r13 = (java.lang.String) r13
            goto L_0x0071
        L_0x006f:
            r13 = r25
        L_0x0071:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0079
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x007b
        L_0x0079:
            r1 = r26
        L_0x007b:
            r15 = r14
            r16 = r2
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r13
            r27 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x00a1
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserData.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Integer getId() {
        return realmGet$id();
    }

    public final void setId(Integer num) {
        realmSet$id(num);
    }

    public final String getComment() {
        return realmGet$comment();
    }

    public final void setComment(String str) {
        realmSet$comment(str);
    }

    public final String getName() {
        return realmGet$name();
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final String getSurname() {
        return realmGet$surname();
    }

    public final void setSurname(String str) {
        realmSet$surname(str);
    }

    public final String getPatronymic() {
        return realmGet$patronymic();
    }

    public final void setPatronymic(String str) {
        realmSet$patronymic(str);
    }

    public final String getFullname() {
        return realmGet$fullname();
    }

    public final void setFullname(String str) {
        realmSet$fullname(str);
    }

    public final Integer getProviderId() {
        return realmGet$providerId();
    }

    public final void setProviderId(Integer num) {
        realmSet$providerId(num);
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
        realmSet$phone(str);
    }

    public final String getBirthday() {
        return realmGet$birthday();
    }

    public final void setBirthday(String str) {
        realmSet$birthday(str);
    }

    public final String getGender() {
        return realmGet$gender();
    }

    public final void setGender(String str) {
        realmSet$gender(str);
    }

    public final String getLastActive() {
        return realmGet$lastActive();
    }

    public final void setLastActive(String str) {
        realmSet$lastActive(str);
    }

    public UserData(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, String str6, String str7, String str8, String str9, String str10) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(num);
        realmSet$comment(str);
        realmSet$name(str2);
        realmSet$surname(str3);
        realmSet$patronymic(str4);
        realmSet$fullname(str5);
        realmSet$providerId(num2);
        realmSet$email(str6);
        realmSet$phone(str7);
        realmSet$birthday(str8);
        realmSet$gender(str9);
        realmSet$lastActive(str10);
    }
}
