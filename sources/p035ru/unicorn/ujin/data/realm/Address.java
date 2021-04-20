package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_AddressRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Address;", "Lio/realm/RealmObject;", "city", "", "street", "house", "houseNumber", "placementNumber", "fullAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", "getFullAddress", "setFullAddress", "getHouse", "setHouse", "getHouseNumber", "setHouseNumber", "getPlacementNumber", "setPlacementNumber", "getStreet", "setStreet", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Address */
/* compiled from: Building.kt */
public class Address extends RealmObject implements ru_unicorn_ujin_data_realm_AddressRealmProxyInterface {
    @SerializedName("city")
    private String city;
    @SerializedName("fullAddress")
    private String fullAddress;
    @SerializedName("house")
    private String house;
    @SerializedName("houseNumber")
    private String houseNumber;
    @SerializedName("placementNumber")
    private String placementNumber;
    @SerializedName("street")
    private String street;

    public Address() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$city() {
        return this.city;
    }

    public String realmGet$fullAddress() {
        return this.fullAddress;
    }

    public String realmGet$house() {
        return this.house;
    }

    public String realmGet$houseNumber() {
        return this.houseNumber;
    }

    public String realmGet$placementNumber() {
        return this.placementNumber;
    }

    public String realmGet$street() {
        return this.street;
    }

    public void realmSet$city(String str) {
        this.city = str;
    }

    public void realmSet$fullAddress(String str) {
        this.fullAddress = str;
    }

    public void realmSet$house(String str) {
        this.house = str;
    }

    public void realmSet$houseNumber(String str) {
        this.houseNumber = str;
    }

    public void realmSet$placementNumber(String str) {
        this.placementNumber = str;
    }

    public void realmSet$street(String str) {
        this.street = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Address(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            r0 = 0
            if (r12 == 0) goto L_0x0008
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
        L_0x0008:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000f
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L_0x000f:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0017
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L_0x0017:
            r1 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001f
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L_0x001f:
            r2 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0027
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
        L_0x0027:
            r3 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002f
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
        L_0x002f:
            r0 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            boolean r5 = r4 instanceof p046io.realm.internal.RealmObjectProxy
            if (r5 == 0) goto L_0x0044
            r5 = r4
            io.realm.internal.RealmObjectProxy r5 = (p046io.realm.internal.RealmObjectProxy) r5
            r5.realm$injectObjectContext()
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.Address.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getCity() {
        return realmGet$city();
    }

    public final void setCity(String str) {
        realmSet$city(str);
    }

    public final String getStreet() {
        return realmGet$street();
    }

    public final void setStreet(String str) {
        realmSet$street(str);
    }

    public final String getHouse() {
        return realmGet$house();
    }

    public final void setHouse(String str) {
        realmSet$house(str);
    }

    public final String getHouseNumber() {
        return realmGet$houseNumber();
    }

    public final void setHouseNumber(String str) {
        realmSet$houseNumber(str);
    }

    public final String getPlacementNumber() {
        return realmGet$placementNumber();
    }

    public final void setPlacementNumber(String str) {
        realmSet$placementNumber(str);
    }

    public final String getFullAddress() {
        return realmGet$fullAddress();
    }

    public final void setFullAddress(String str) {
        realmSet$fullAddress(str);
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$city(str);
        realmSet$street(str2);
        realmSet$house(str3);
        realmSet$houseNumber(str4);
        realmSet$placementNumber(str5);
        realmSet$fullAddress(str6);
    }
}
