package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0016\u0018\u00002\u00020\u0001:\u0001;B§\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0014R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010\u001cR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\"\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R&\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!¨\u0006<"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Building;", "Lio/realm/RealmObject;", "id", "", "title", "floor", "startWorkTime", "endWorkTime", "fias", "apartmentCount", "", "entranceCount", "address", "Lru/unicorn/ujin/data/realm/Address;", "sellEnabled", "", "sellEmails", "Lio/realm/RealmList;", "securityNumber", "rentAvailable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lru/unicorn/ujin/data/realm/Address;Ljava/lang/Boolean;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/Boolean;)V", "getAddress", "()Lru/unicorn/ujin/data/realm/Address;", "setAddress", "(Lru/unicorn/ujin/data/realm/Address;)V", "getApartmentCount", "()Ljava/lang/Integer;", "setApartmentCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEndWorkTime", "()Ljava/lang/String;", "setEndWorkTime", "(Ljava/lang/String;)V", "getEntranceCount", "setEntranceCount", "getFias", "setFias", "getFloor", "setFloor", "getId", "setId", "getRentAvailable", "()Ljava/lang/Boolean;", "setRentAvailable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSecurityNumber", "setSecurityNumber", "getSellEmails", "()Lio/realm/RealmList;", "setSellEmails", "(Lio/realm/RealmList;)V", "getSellEnabled", "setSellEnabled", "getStartWorkTime", "setStartWorkTime", "getTitle", "setTitle", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Building */
/* compiled from: Building.kt */
public class Building extends RealmObject implements ru_unicorn_ujin_data_realm_BuildingRealmProxyInterface {
    @SerializedName("address")
    private Address address;
    @SerializedName("apartmentCount")
    private Integer apartmentCount;
    @SerializedName("end_work_time")
    private String endWorkTime;
    @SerializedName("entranceCount")
    private Integer entranceCount;
    @SerializedName("fias")
    private String fias;
    @SerializedName("floor")
    private String floor;
    @SerializedName("id")
    @PrimaryKey

    /* renamed from: id */
    private String f6634id;
    @SerializedName("buildings_properties_rent_available")
    private Boolean rentAvailable;
    @SerializedName("security_number")
    private String securityNumber;
    @SerializedName("sell_emails")
    private RealmList<String> sellEmails;
    @SerializedName("sell_enabled")
    private Boolean sellEnabled;
    @SerializedName("start_work_time")
    private String startWorkTime;
    @SerializedName("title")
    private String title;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Building() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Address) null, (Boolean) null, (RealmList) null, (String) null, (Boolean) null, 8191, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public Address realmGet$address() {
        return this.address;
    }

    public Integer realmGet$apartmentCount() {
        return this.apartmentCount;
    }

    public String realmGet$endWorkTime() {
        return this.endWorkTime;
    }

    public Integer realmGet$entranceCount() {
        return this.entranceCount;
    }

    public String realmGet$fias() {
        return this.fias;
    }

    public String realmGet$floor() {
        return this.floor;
    }

    public String realmGet$id() {
        return this.f6634id;
    }

    public Boolean realmGet$rentAvailable() {
        return this.rentAvailable;
    }

    public String realmGet$securityNumber() {
        return this.securityNumber;
    }

    public RealmList realmGet$sellEmails() {
        return this.sellEmails;
    }

    public Boolean realmGet$sellEnabled() {
        return this.sellEnabled;
    }

    public String realmGet$startWorkTime() {
        return this.startWorkTime;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$address(Address address2) {
        this.address = address2;
    }

    public void realmSet$apartmentCount(Integer num) {
        this.apartmentCount = num;
    }

    public void realmSet$endWorkTime(String str) {
        this.endWorkTime = str;
    }

    public void realmSet$entranceCount(Integer num) {
        this.entranceCount = num;
    }

    public void realmSet$fias(String str) {
        this.fias = str;
    }

    public void realmSet$floor(String str) {
        this.floor = str;
    }

    public void realmSet$id(String str) {
        this.f6634id = str;
    }

    public void realmSet$rentAvailable(Boolean bool) {
        this.rentAvailable = bool;
    }

    public void realmSet$securityNumber(String str) {
        this.securityNumber = str;
    }

    public void realmSet$sellEmails(RealmList realmList) {
        this.sellEmails = realmList;
    }

    public void realmSet$sellEnabled(Boolean bool) {
        this.sellEnabled = bool;
    }

    public void realmSet$startWorkTime(String str) {
        this.startWorkTime = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Building(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.Integer r22, java.lang.Integer r23, p035ru.unicorn.ujin.data.realm.Address r24, java.lang.Boolean r25, p046io.realm.RealmList r26, java.lang.String r27, java.lang.Boolean r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r15 = this;
            r0 = r15
            r1 = r29
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000c
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x000e
        L_0x000c:
            r2 = r16
        L_0x000e:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0016
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0018
        L_0x0016:
            r4 = r17
        L_0x0018:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x0020
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x002a
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x002c
        L_0x002a:
            r6 = r19
        L_0x002c:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0034
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0036
        L_0x0034:
            r7 = r20
        L_0x0036:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x003e
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0040
        L_0x003e:
            r8 = r21
        L_0x0040:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0048
            r9 = r3
            java.lang.Integer r9 = (java.lang.Integer) r9
            goto L_0x004a
        L_0x0048:
            r9 = r22
        L_0x004a:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0052
            r10 = r3
            java.lang.Integer r10 = (java.lang.Integer) r10
            goto L_0x0054
        L_0x0052:
            r10 = r23
        L_0x0054:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x005c
            r11 = r3
            ru.unicorn.ujin.data.realm.Address r11 = (p035ru.unicorn.ujin.data.realm.Address) r11
            goto L_0x005e
        L_0x005c:
            r11 = r24
        L_0x005e:
            r12 = r1 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0066
            r12 = r3
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            goto L_0x0068
        L_0x0066:
            r12 = r25
        L_0x0068:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0070
            r13 = r3
            io.realm.RealmList r13 = (p046io.realm.RealmList) r13
            goto L_0x0072
        L_0x0070:
            r13 = r26
        L_0x0072:
            r14 = r1 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x007a
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x007c
        L_0x007a:
            r14 = r27
        L_0x007c:
            r1 = r1 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0084
            r1 = r3
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            goto L_0x0086
        L_0x0084:
            r1 = r28
        L_0x0086:
            r16 = r15
            r17 = r2
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r14
            r29 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x00af
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.Building.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, ru.unicorn.ujin.data.realm.Address, java.lang.Boolean, io.realm.RealmList, java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getFloor() {
        return realmGet$floor();
    }

    public final void setFloor(String str) {
        realmSet$floor(str);
    }

    public final String getStartWorkTime() {
        return realmGet$startWorkTime();
    }

    public final void setStartWorkTime(String str) {
        realmSet$startWorkTime(str);
    }

    public final String getEndWorkTime() {
        return realmGet$endWorkTime();
    }

    public final void setEndWorkTime(String str) {
        realmSet$endWorkTime(str);
    }

    public final String getFias() {
        return realmGet$fias();
    }

    public final void setFias(String str) {
        realmSet$fias(str);
    }

    public final Integer getApartmentCount() {
        return realmGet$apartmentCount();
    }

    public final void setApartmentCount(Integer num) {
        realmSet$apartmentCount(num);
    }

    public final Integer getEntranceCount() {
        return realmGet$entranceCount();
    }

    public final void setEntranceCount(Integer num) {
        realmSet$entranceCount(num);
    }

    public final Address getAddress() {
        return realmGet$address();
    }

    public final void setAddress(Address address2) {
        realmSet$address(address2);
    }

    public final Boolean getSellEnabled() {
        return realmGet$sellEnabled();
    }

    public final void setSellEnabled(Boolean bool) {
        realmSet$sellEnabled(bool);
    }

    public final RealmList<String> getSellEmails() {
        return realmGet$sellEmails();
    }

    public final void setSellEmails(RealmList<String> realmList) {
        realmSet$sellEmails(realmList);
    }

    public final String getSecurityNumber() {
        return realmGet$securityNumber();
    }

    public final void setSecurityNumber(String str) {
        realmSet$securityNumber(str);
    }

    public final Boolean getRentAvailable() {
        return realmGet$rentAvailable();
    }

    public final void setRentAvailable(Boolean bool) {
        realmSet$rentAvailable(bool);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Building$Fields;", "", "()V", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.Building$Fields */
    /* compiled from: Building.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6635id = "id";

        private Fields() {
        }
    }

    public Building(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Address address2, Boolean bool, RealmList<String> realmList, String str7, Boolean bool2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$title(str2);
        realmSet$floor(str3);
        realmSet$startWorkTime(str4);
        realmSet$endWorkTime(str5);
        realmSet$fias(str6);
        realmSet$apartmentCount(num);
        realmSet$entranceCount(num2);
        realmSet$address(address2);
        realmSet$sellEnabled(bool);
        realmSet$sellEmails(realmList);
        realmSet$securityNumber(str7);
        realmSet$rentAvailable(bool2);
    }
}
