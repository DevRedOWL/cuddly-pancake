package p035ru.unicorn.ujin.ble.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0016\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, mo51343d2 = {"Lru/unicorn/ujin/ble/data/BleKeyData;", "Lio/realm/RealmObject;", "serialNumber", "", "keyValue", "", "keyTitle", "keyAssign", "", "deviceClass", "interfaceType", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDeviceClass", "()Ljava/lang/String;", "setDeviceClass", "(Ljava/lang/String;)V", "getInterfaceType", "setInterfaceType", "getKeyAssign", "()I", "setKeyAssign", "(I)V", "getKeyTitle", "setKeyTitle", "getKeyValue", "setKeyValue", "getSerialNumber", "()J", "setSerialNumber", "(J)V", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.data.BleKeyData */
/* compiled from: BleData.kt */
public class BleKeyData extends RealmObject implements ru_unicorn_ujin_ble_data_BleKeyDataRealmProxyInterface {
    @SerializedName("device_class")
    private String deviceClass;
    @SerializedName("interface_type")
    private String interfaceType;
    @SerializedName("key_assign")
    private int keyAssign;
    @SerializedName("key_title")
    private String keyTitle;
    @SerializedName("key_value")
    private String keyValue;
    @SerializedName("serial_number")
    @PrimaryKey
    private long serialNumber;

    public BleKeyData() {
        this(0, (String) null, (String) null, 0, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$deviceClass() {
        return this.deviceClass;
    }

    public String realmGet$interfaceType() {
        return this.interfaceType;
    }

    public int realmGet$keyAssign() {
        return this.keyAssign;
    }

    public String realmGet$keyTitle() {
        return this.keyTitle;
    }

    public String realmGet$keyValue() {
        return this.keyValue;
    }

    public long realmGet$serialNumber() {
        return this.serialNumber;
    }

    public void realmSet$deviceClass(String str) {
        this.deviceClass = str;
    }

    public void realmSet$interfaceType(String str) {
        this.interfaceType = str;
    }

    public void realmSet$keyAssign(int i) {
        this.keyAssign = i;
    }

    public void realmSet$keyTitle(String str) {
        this.keyTitle = str;
    }

    public void realmSet$keyValue(String str) {
        this.keyValue = str;
    }

    public void realmSet$serialNumber(long j) {
        this.serialNumber = j;
    }

    public final long getSerialNumber() {
        return realmGet$serialNumber();
    }

    public final void setSerialNumber(long j) {
        realmSet$serialNumber(j);
    }

    public final String getKeyValue() {
        return realmGet$keyValue();
    }

    public final void setKeyValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$keyValue(str);
    }

    public final String getKeyTitle() {
        return realmGet$keyTitle();
    }

    public final void setKeyTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$keyTitle(str);
    }

    public final int getKeyAssign() {
        return realmGet$keyAssign();
    }

    public final void setKeyAssign(int i) {
        realmSet$keyAssign(i);
    }

    public final String getDeviceClass() {
        return realmGet$deviceClass();
    }

    public final void setDeviceClass(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$deviceClass(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BleKeyData(long r10, java.lang.String r12, java.lang.String r13, int r14, java.lang.String r15, java.lang.String r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r9 = this;
            r0 = r9
            r1 = r17 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x0009
        L_0x0008:
            r1 = r10
        L_0x0009:
            r3 = r17 & 2
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x0011
            r3 = r4
            goto L_0x0012
        L_0x0011:
            r3 = r12
        L_0x0012:
            r5 = r17 & 4
            if (r5 == 0) goto L_0x0018
            r5 = r4
            goto L_0x0019
        L_0x0018:
            r5 = r13
        L_0x0019:
            r6 = r17 & 8
            if (r6 == 0) goto L_0x001f
            r6 = 0
            goto L_0x0020
        L_0x001f:
            r6 = r14
        L_0x0020:
            r7 = r17 & 16
            if (r7 == 0) goto L_0x0026
            r7 = r4
            goto L_0x0027
        L_0x0026:
            r7 = r15
        L_0x0027:
            r8 = r17 & 32
            if (r8 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r4 = r16
        L_0x002e:
            r10 = r9
            r11 = r1
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r4
            r10.<init>(r11, r13, r14, r15, r16, r17)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x0044
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.ble.data.BleKeyData.<init>(long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getInterfaceType() {
        return realmGet$interfaceType();
    }

    public final void setInterfaceType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$interfaceType(str);
    }

    public BleKeyData(long j, String str, String str2, int i, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "keyValue");
        Intrinsics.checkNotNullParameter(str2, "keyTitle");
        Intrinsics.checkNotNullParameter(str3, "deviceClass");
        Intrinsics.checkNotNullParameter(str4, "interfaceType");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$serialNumber(j);
        realmSet$keyValue(str);
        realmSet$keyTitle(str2);
        realmSet$keyAssign(i);
        realmSet$deviceClass(str3);
        realmSet$interfaceType(str4);
    }
}
