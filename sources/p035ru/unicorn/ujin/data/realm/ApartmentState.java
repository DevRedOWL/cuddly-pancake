package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0002\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ApartmentState;", "Lio/realm/RealmObject;", "state", "", "stateTitle", "acceptanceDate", "contactPersonPhone", "contactPersonName", "acceptanceInfo", "windowId", "windowList", "Lio/realm/RealmList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;)V", "getAcceptanceDate", "()Ljava/lang/String;", "setAcceptanceDate", "(Ljava/lang/String;)V", "getAcceptanceInfo", "setAcceptanceInfo", "getContactPersonName", "setContactPersonName", "getContactPersonPhone", "setContactPersonPhone", "getState", "setState", "getStateTitle", "setStateTitle", "getWindowId", "setWindowId", "getWindowList", "()Lio/realm/RealmList;", "setWindowList", "(Lio/realm/RealmList;)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.ApartmentState */
/* compiled from: ApartmentState.kt */
public class ApartmentState extends RealmObject implements ru_unicorn_ujin_data_realm_ApartmentStateRealmProxyInterface {
    @SerializedName("accept_schedule_dt")
    private String acceptanceDate;
    @SerializedName("accept_schedule_dop")
    private String acceptanceInfo;
    @SerializedName("accept_schedule_name")
    private String contactPersonName;
    @SerializedName("accept_schedule_phone")
    private String contactPersonPhone;
    private String state;
    @SerializedName("state_title")
    private String stateTitle;
    @SerializedName("window_id")
    private String windowId;
    @SerializedName("windows")
    private RealmList<String> windowList;

    public ApartmentState() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (RealmList) null, 255, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$acceptanceDate() {
        return this.acceptanceDate;
    }

    public String realmGet$acceptanceInfo() {
        return this.acceptanceInfo;
    }

    public String realmGet$contactPersonName() {
        return this.contactPersonName;
    }

    public String realmGet$contactPersonPhone() {
        return this.contactPersonPhone;
    }

    public String realmGet$state() {
        return this.state;
    }

    public String realmGet$stateTitle() {
        return this.stateTitle;
    }

    public String realmGet$windowId() {
        return this.windowId;
    }

    public RealmList realmGet$windowList() {
        return this.windowList;
    }

    public void realmSet$acceptanceDate(String str) {
        this.acceptanceDate = str;
    }

    public void realmSet$acceptanceInfo(String str) {
        this.acceptanceInfo = str;
    }

    public void realmSet$contactPersonName(String str) {
        this.contactPersonName = str;
    }

    public void realmSet$contactPersonPhone(String str) {
        this.contactPersonPhone = str;
    }

    public void realmSet$state(String str) {
        this.state = str;
    }

    public void realmSet$stateTitle(String str) {
        this.stateTitle = str;
    }

    public void realmSet$windowId(String str) {
        this.windowId = str;
    }

    public void realmSet$windowList(RealmList realmList) {
        this.windowList = realmList;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApartmentState(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, p046io.realm.RealmList r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r10
            r1 = r19
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000c
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x000d
        L_0x000c:
            r2 = r11
        L_0x000d:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0015
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
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
            io.realm.RealmList r1 = (p046io.realm.RealmList) r1
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.ApartmentState.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, io.realm.RealmList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getState() {
        return realmGet$state();
    }

    public final void setState(String str) {
        realmSet$state(str);
    }

    public final String getStateTitle() {
        return realmGet$stateTitle();
    }

    public final void setStateTitle(String str) {
        realmSet$stateTitle(str);
    }

    public final String getAcceptanceDate() {
        return realmGet$acceptanceDate();
    }

    public final void setAcceptanceDate(String str) {
        realmSet$acceptanceDate(str);
    }

    public final String getContactPersonPhone() {
        return realmGet$contactPersonPhone();
    }

    public final void setContactPersonPhone(String str) {
        realmSet$contactPersonPhone(str);
    }

    public final String getContactPersonName() {
        return realmGet$contactPersonName();
    }

    public final void setContactPersonName(String str) {
        realmSet$contactPersonName(str);
    }

    public final String getAcceptanceInfo() {
        return realmGet$acceptanceInfo();
    }

    public final void setAcceptanceInfo(String str) {
        realmSet$acceptanceInfo(str);
    }

    public final String getWindowId() {
        return realmGet$windowId();
    }

    public final void setWindowId(String str) {
        realmSet$windowId(str);
    }

    public final RealmList<String> getWindowList() {
        return realmGet$windowList();
    }

    public final void setWindowList(RealmList<String> realmList) {
        realmSet$windowList(realmList);
    }

    public ApartmentState(String str, String str2, String str3, String str4, String str5, String str6, String str7, RealmList<String> realmList) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$state(str);
        realmSet$stateTitle(str2);
        realmSet$acceptanceDate(str3);
        realmSet$contactPersonPhone(str4);
        realmSet$contactPersonName(str5);
        realmSet$acceptanceInfo(str6);
        realmSet$windowId(str7);
        realmSet$windowList(realmList);
    }
}
