package p035ru.unicorn.ujin.data.realm.profile;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0016\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/profile/RentObject;", "Lio/realm/RealmObject;", "id", "", "title", "", "rentCost", "rentAvailable", "lastDateRent", "building", "Lru/unicorn/ujin/data/realm/profile/RentObjectBuilding;", "area", "floor", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/data/realm/profile/RentObjectBuilding;Ljava/lang/String;Ljava/lang/String;)V", "getArea", "()Ljava/lang/String;", "setArea", "(Ljava/lang/String;)V", "getBuilding", "()Lru/unicorn/ujin/data/realm/profile/RentObjectBuilding;", "setBuilding", "(Lru/unicorn/ujin/data/realm/profile/RentObjectBuilding;)V", "getFloor", "setFloor", "getId", "()J", "setId", "(J)V", "getLastDateRent", "setLastDateRent", "getRentAvailable", "setRentAvailable", "getRentCost", "setRentCost", "getTitle", "setTitle", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.profile.RentObject */
/* compiled from: RentObject.kt */
public class RentObject extends RealmObject implements ru_unicorn_ujin_data_realm_profile_RentObjectRealmProxyInterface {
    private String area;
    private RentObjectBuilding building;
    private String floor;
    @PrimaryKey

    /* renamed from: id */
    private long f6705id;
    @SerializedName("last_date_rent")
    private String lastDateRent;
    @SerializedName("rent_available")
    private String rentAvailable;
    @SerializedName("rent_cost")
    private String rentCost;
    private String title;

    public RentObject() {
        this(0, (String) null, (String) null, (String) null, (String) null, (RentObjectBuilding) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$area() {
        return this.area;
    }

    public RentObjectBuilding realmGet$building() {
        return this.building;
    }

    public String realmGet$floor() {
        return this.floor;
    }

    public long realmGet$id() {
        return this.f6705id;
    }

    public String realmGet$lastDateRent() {
        return this.lastDateRent;
    }

    public String realmGet$rentAvailable() {
        return this.rentAvailable;
    }

    public String realmGet$rentCost() {
        return this.rentCost;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$area(String str) {
        this.area = str;
    }

    public void realmSet$building(RentObjectBuilding rentObjectBuilding) {
        this.building = rentObjectBuilding;
    }

    public void realmSet$floor(String str) {
        this.floor = str;
    }

    public void realmSet$id(long j) {
        this.f6705id = j;
    }

    public void realmSet$lastDateRent(String str) {
        this.lastDateRent = str;
    }

    public void realmSet$rentAvailable(String str) {
        this.rentAvailable = str;
    }

    public void realmSet$rentCost(String str) {
        this.rentCost = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public final long getId() {
        return realmGet$id();
    }

    public final void setId(long j) {
        realmSet$id(j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RentObject(long r12, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding r18, java.lang.String r19, java.lang.String r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r0 = r11
            r1 = r21
            r2 = r1 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000b
        L_0x000a:
            r2 = r12
        L_0x000b:
            r4 = r1 & 2
            r5 = 0
            if (r4 == 0) goto L_0x0014
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0015
        L_0x0014:
            r4 = r14
        L_0x0015:
            r6 = r1 & 4
            if (r6 == 0) goto L_0x001d
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x001e
        L_0x001d:
            r6 = r15
        L_0x001e:
            r7 = r1 & 8
            if (r7 == 0) goto L_0x0026
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0028
        L_0x0026:
            r7 = r16
        L_0x0028:
            r8 = r1 & 16
            if (r8 == 0) goto L_0x0030
            r8 = r5
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0032
        L_0x0030:
            r8 = r17
        L_0x0032:
            r9 = r1 & 32
            if (r9 == 0) goto L_0x003a
            r9 = r5
            ru.unicorn.ujin.data.realm.profile.RentObjectBuilding r9 = (p035ru.unicorn.ujin.data.realm.profile.RentObjectBuilding) r9
            goto L_0x003c
        L_0x003a:
            r9 = r18
        L_0x003c:
            r10 = r1 & 64
            if (r10 == 0) goto L_0x0044
            r10 = r5
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0046
        L_0x0044:
            r10 = r19
        L_0x0046:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x004e
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0050
        L_0x004e:
            r1 = r20
        L_0x0050:
            r12 = r11
            r13 = r2
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r10
            r21 = r1
            r12.<init>(r13, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x006c
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.profile.RentObject.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.unicorn.ujin.data.realm.profile.RentObjectBuilding, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getRentCost() {
        return realmGet$rentCost();
    }

    public final void setRentCost(String str) {
        realmSet$rentCost(str);
    }

    public final String getRentAvailable() {
        return realmGet$rentAvailable();
    }

    public final void setRentAvailable(String str) {
        realmSet$rentAvailable(str);
    }

    public final String getLastDateRent() {
        return realmGet$lastDateRent();
    }

    public final void setLastDateRent(String str) {
        realmSet$lastDateRent(str);
    }

    public final RentObjectBuilding getBuilding() {
        return realmGet$building();
    }

    public final void setBuilding(RentObjectBuilding rentObjectBuilding) {
        realmSet$building(rentObjectBuilding);
    }

    public final String getArea() {
        return realmGet$area();
    }

    public final void setArea(String str) {
        realmSet$area(str);
    }

    public final String getFloor() {
        return realmGet$floor();
    }

    public final void setFloor(String str) {
        realmSet$floor(str);
    }

    public RentObject(long j, String str, String str2, String str3, String str4, RentObjectBuilding rentObjectBuilding, String str5, String str6) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(j);
        realmSet$title(str);
        realmSet$rentCost(str2);
        realmSet$rentAvailable(str3);
        realmSet$lastDateRent(str4);
        realmSet$building(rentObjectBuilding);
        realmSet$area(str5);
        realmSet$floor(str6);
    }
}
