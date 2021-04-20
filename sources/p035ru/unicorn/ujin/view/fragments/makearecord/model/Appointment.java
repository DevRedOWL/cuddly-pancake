package p035ru.unicorn.ujin.view.fragments.makearecord.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.C4819x36140a40;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0016J\u0012\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010?\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0000H\u0016R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R \u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010\u001eR \u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001c\"\u0004\b/\u0010\u001eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b6\u0010\"\"\u0004\b7\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006@"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/makearecord/model/Appointment;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "id", "", "attachments", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/FileData;", "date", "", "description", "status", "Lru/unicorn/ujin/view/fragments/makearecord/model/Status;", "timeEnd", "timeStart", "title", "toUser", "Lru/unicorn/ujin/view/fragments/makearecord/model/ToUser;", "toUserId", "user", "Lru/unicorn/ujin/view/fragments/makearecord/model/FromUser;", "registeredName", "(Ljava/lang/Integer;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/makearecord/model/Status;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/makearecord/model/ToUser;Ljava/lang/Integer;Lru/unicorn/ujin/view/fragments/makearecord/model/FromUser;Ljava/lang/String;)V", "getAttachments", "()Lio/realm/RealmList;", "setAttachments", "(Lio/realm/RealmList;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRegisteredName", "setRegisteredName", "getStatus", "()Lru/unicorn/ujin/view/fragments/makearecord/model/Status;", "setStatus", "(Lru/unicorn/ujin/view/fragments/makearecord/model/Status;)V", "getTimeEnd", "setTimeEnd", "getTimeStart", "setTimeStart", "getTitle", "setTitle", "getToUser", "()Lru/unicorn/ujin/view/fragments/makearecord/model/ToUser;", "setToUser", "(Lru/unicorn/ujin/view/fragments/makearecord/model/ToUser;)V", "getToUserId", "setToUserId", "getUser", "()Lru/unicorn/ujin/view/fragments/makearecord/model/FromUser;", "setUser", "(Lru/unicorn/ujin/view/fragments/makearecord/model/FromUser;)V", "areContentsTheSame", "", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.makearecord.model.Appointment */
/* compiled from: Appointments.kt */
public class Appointment extends RealmObject implements Diffable<Appointment>, C4819x36140a40 {
    private RealmList<FileData> attachments;
    private String date;
    private String description;
    @PrimaryKey

    /* renamed from: id */
    private Integer f6926id;
    @SerializedName("registered_name")
    private String registeredName;
    private Status status;
    @SerializedName("time_end")
    private String timeEnd;
    @SerializedName("time_start")
    private String timeStart;
    private String title;
    @SerializedName("to_user")
    private ToUser toUser;
    @SerializedName("to_user_id")
    private Integer toUserId;
    private FromUser user;

    public Appointment() {
        this((Integer) null, (RealmList) null, (String) null, (String) null, (Status) null, (String) null, (String) null, (String) null, (ToUser) null, (Integer) null, (FromUser) null, (String) null, 4095, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList realmGet$attachments() {
        return this.attachments;
    }

    public String realmGet$date() {
        return this.date;
    }

    public String realmGet$description() {
        return this.description;
    }

    public Integer realmGet$id() {
        return this.f6926id;
    }

    public String realmGet$registeredName() {
        return this.registeredName;
    }

    public Status realmGet$status() {
        return this.status;
    }

    public String realmGet$timeEnd() {
        return this.timeEnd;
    }

    public String realmGet$timeStart() {
        return this.timeStart;
    }

    public String realmGet$title() {
        return this.title;
    }

    public ToUser realmGet$toUser() {
        return this.toUser;
    }

    public Integer realmGet$toUserId() {
        return this.toUserId;
    }

    public FromUser realmGet$user() {
        return this.user;
    }

    public void realmSet$attachments(RealmList realmList) {
        this.attachments = realmList;
    }

    public void realmSet$date(String str) {
        this.date = str;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$id(Integer num) {
        this.f6926id = num;
    }

    public void realmSet$registeredName(String str) {
        this.registeredName = str;
    }

    public void realmSet$status(Status status2) {
        this.status = status2;
    }

    public void realmSet$timeEnd(String str) {
        this.timeEnd = str;
    }

    public void realmSet$timeStart(String str) {
        this.timeStart = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$toUser(ToUser toUser2) {
        this.toUser = toUser2;
    }

    public void realmSet$toUserId(Integer num) {
        this.toUserId = num;
    }

    public void realmSet$user(FromUser fromUser) {
        this.user = fromUser;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Appointment(java.lang.Integer r15, p046io.realm.RealmList r16, java.lang.String r17, java.lang.String r18, p035ru.unicorn.ujin.view.fragments.makearecord.model.Status r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, p035ru.unicorn.ujin.view.fragments.makearecord.model.ToUser r23, java.lang.Integer r24, p035ru.unicorn.ujin.view.fragments.makearecord.model.FromUser r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
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
            io.realm.RealmList r4 = (p046io.realm.RealmList) r4
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
            ru.unicorn.ujin.view.fragments.makearecord.model.Status r7 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.Status) r7
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
            java.lang.String r9 = (java.lang.String) r9
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
            ru.unicorn.ujin.view.fragments.makearecord.model.ToUser r11 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.ToUser) r11
            goto L_0x005d
        L_0x005b:
            r11 = r23
        L_0x005d:
            r12 = r1 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0065
            r12 = r3
            java.lang.Integer r12 = (java.lang.Integer) r12
            goto L_0x0067
        L_0x0065:
            r12 = r24
        L_0x0067:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x006f
            r13 = r3
            ru.unicorn.ujin.view.fragments.makearecord.model.FromUser r13 = (p035ru.unicorn.ujin.view.fragments.makearecord.model.FromUser) r13
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.view.fragments.makearecord.model.Appointment.<init>(java.lang.Integer, io.realm.RealmList, java.lang.String, java.lang.String, ru.unicorn.ujin.view.fragments.makearecord.model.Status, java.lang.String, java.lang.String, java.lang.String, ru.unicorn.ujin.view.fragments.makearecord.model.ToUser, java.lang.Integer, ru.unicorn.ujin.view.fragments.makearecord.model.FromUser, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Integer getId() {
        return realmGet$id();
    }

    public final void setId(Integer num) {
        realmSet$id(num);
    }

    public final RealmList<FileData> getAttachments() {
        return realmGet$attachments();
    }

    public final void setAttachments(RealmList<FileData> realmList) {
        realmSet$attachments(realmList);
    }

    public final String getDate() {
        return realmGet$date();
    }

    public final void setDate(String str) {
        realmSet$date(str);
    }

    public final String getDescription() {
        return realmGet$description();
    }

    public final void setDescription(String str) {
        realmSet$description(str);
    }

    public final Status getStatus() {
        return realmGet$status();
    }

    public final void setStatus(Status status2) {
        realmSet$status(status2);
    }

    public final String getTimeEnd() {
        return realmGet$timeEnd();
    }

    public final void setTimeEnd(String str) {
        realmSet$timeEnd(str);
    }

    public final String getTimeStart() {
        return realmGet$timeStart();
    }

    public final void setTimeStart(String str) {
        realmSet$timeStart(str);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final ToUser getToUser() {
        return realmGet$toUser();
    }

    public final void setToUser(ToUser toUser2) {
        realmSet$toUser(toUser2);
    }

    public final Integer getToUserId() {
        return realmGet$toUserId();
    }

    public final void setToUserId(Integer num) {
        realmSet$toUserId(num);
    }

    public final FromUser getUser() {
        return realmGet$user();
    }

    public final void setUser(FromUser fromUser) {
        realmSet$user(fromUser);
    }

    public final String getRegisteredName() {
        return realmGet$registeredName();
    }

    public final void setRegisteredName(String str) {
        realmSet$registeredName(str);
    }

    public Appointment(Integer num, RealmList<FileData> realmList, String str, String str2, Status status2, String str3, String str4, String str5, ToUser toUser2, Integer num2, FromUser fromUser, String str6) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(num);
        realmSet$attachments(realmList);
        realmSet$date(str);
        realmSet$description(str2);
        realmSet$status(status2);
        realmSet$timeEnd(str3);
        realmSet$timeStart(str4);
        realmSet$title(str5);
        realmSet$toUser(toUser2);
        realmSet$toUserId(num2);
        realmSet$user(fromUser);
        realmSet$registeredName(str6);
    }

    public boolean areItemsTheSame(Appointment appointment) {
        return Intrinsics.areEqual((Object) realmGet$id(), (Object) appointment != null ? appointment.realmGet$id() : null);
    }

    public boolean areContentsTheSame(Appointment appointment) {
        return Intrinsics.areEqual((Object) realmGet$description(), (Object) appointment != null ? appointment.realmGet$description() : null);
    }
}
