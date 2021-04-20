package p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.C4789xfdd56d2;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0016\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R \u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001e¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/view/activity/navigation/ui/profile_my/kotlin/UserVehicle;", "Lio/realm/RealmObject;", "id", "", "userDataId", "brand", "", "number", "comment", "createdAt", "updatedAt", "deleted", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "getComment", "setComment", "getCreatedAt", "setCreatedAt", "getDeleted", "()Ljava/lang/Boolean;", "setDeleted", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNumber", "setNumber", "getUpdatedAt", "setUpdatedAt", "getUserDataId", "setUserDataId", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.activity.navigation.ui.profile_my.kotlin.UserVehicle */
/* compiled from: UserVehicle.kt */
public class UserVehicle extends RealmObject implements C4789xfdd56d2 {
    private String brand;
    private String comment;
    @SerializedName("created_at")
    private String createdAt;
    private Boolean deleted;

    /* renamed from: id */
    private Integer f6851id;
    @SerializedName("id_number")
    private String number;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("userdata_id")
    private Integer userDataId;

    public UserVehicle() {
        this((Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, 255, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$brand() {
        return this.brand;
    }

    public String realmGet$comment() {
        return this.comment;
    }

    public String realmGet$createdAt() {
        return this.createdAt;
    }

    public Boolean realmGet$deleted() {
        return this.deleted;
    }

    public Integer realmGet$id() {
        return this.f6851id;
    }

    public String realmGet$number() {
        return this.number;
    }

    public String realmGet$updatedAt() {
        return this.updatedAt;
    }

    public Integer realmGet$userDataId() {
        return this.userDataId;
    }

    public void realmSet$brand(String str) {
        this.brand = str;
    }

    public void realmSet$comment(String str) {
        this.comment = str;
    }

    public void realmSet$createdAt(String str) {
        this.createdAt = str;
    }

    public void realmSet$deleted(Boolean bool) {
        this.deleted = bool;
    }

    public void realmSet$id(Integer num) {
        this.f6851id = num;
    }

    public void realmSet$number(String str) {
        this.number = str;
    }

    public void realmSet$updatedAt(String str) {
        this.updatedAt = str;
    }

    public void realmSet$userDataId(Integer num) {
        this.userDataId = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserVehicle(java.lang.Integer r11, java.lang.Integer r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Boolean r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r10
            r1 = r19
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000c
            r2 = r3
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x000d
        L_0x000c:
            r2 = r11
        L_0x000d:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0015
            r4 = r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L_0x0016
        L_0x0015:
            r4 = r12
        L_0x0016:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x001e
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0027
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0028
        L_0x0027:
            r6 = r14
        L_0x0028:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0030
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0031
        L_0x0030:
            r7 = r15
        L_0x0031:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x0039
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x003b
        L_0x0039:
            r8 = r16
        L_0x003b:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0043
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0045
        L_0x0043:
            r9 = r17
        L_0x0045:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x004d
            r1 = r3
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x004f
        L_0x004d:
            r1 = r18
        L_0x004f:
            r11 = r10
            r12 = r2
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r9
            r19 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x0069
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.activity.navigation.p058ui.profile_my.kotlin.UserVehicle.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Integer getId() {
        return realmGet$id();
    }

    public final void setId(Integer num) {
        realmSet$id(num);
    }

    public final Integer getUserDataId() {
        return realmGet$userDataId();
    }

    public final void setUserDataId(Integer num) {
        realmSet$userDataId(num);
    }

    public final String getBrand() {
        return realmGet$brand();
    }

    public final void setBrand(String str) {
        realmSet$brand(str);
    }

    public final String getNumber() {
        return realmGet$number();
    }

    public final void setNumber(String str) {
        realmSet$number(str);
    }

    public final String getComment() {
        return realmGet$comment();
    }

    public final void setComment(String str) {
        realmSet$comment(str);
    }

    public final String getCreatedAt() {
        return realmGet$createdAt();
    }

    public final void setCreatedAt(String str) {
        realmSet$createdAt(str);
    }

    public final String getUpdatedAt() {
        return realmGet$updatedAt();
    }

    public final void setUpdatedAt(String str) {
        realmSet$updatedAt(str);
    }

    public final Boolean getDeleted() {
        return realmGet$deleted();
    }

    public final void setDeleted(Boolean bool) {
        realmSet$deleted(bool);
    }

    public UserVehicle(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, Boolean bool) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(num);
        realmSet$userDataId(num2);
        realmSet$brand(str);
        realmSet$number(str2);
        realmSet$comment(str3);
        realmSet$createdAt(str4);
        realmSet$updatedAt(str5);
        realmSet$deleted(bool);
    }
}
