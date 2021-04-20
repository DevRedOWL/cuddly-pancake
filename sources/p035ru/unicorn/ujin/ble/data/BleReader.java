package p035ru.unicorn.ujin.ble.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B}\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0002\u0010\u0011J\u0012\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u00101\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u00102\u001a\u00020\u0006H\u0016R\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001e\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001e\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001e\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001e\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010\u0015R\u001e\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015¨\u00063"}, mo51343d2 = {"Lru/unicorn/ujin/ble/data/BleReader;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "serialNumber", "", "deviceKey", "", "deviceName", "deviceTitle", "deviceClass", "deviceMac", "interfaceType", "uuidID", "uuidTX", "uuidRX", "uuidService", "rssi", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceClass", "()Ljava/lang/String;", "setDeviceClass", "(Ljava/lang/String;)V", "getDeviceKey", "setDeviceKey", "getDeviceMac", "setDeviceMac", "getDeviceName", "setDeviceName", "getDeviceTitle", "setDeviceTitle", "getInterfaceType", "setInterfaceType", "getRssi", "setRssi", "getSerialNumber", "()J", "setSerialNumber", "(J)V", "getUuidID", "setUuidID", "getUuidRX", "setUuidRX", "getUuidService", "setUuidService", "getUuidTX", "setUuidTX", "areContentsTheSame", "", "other", "areItemsTheSame", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.ble.data.BleReader */
/* compiled from: BleData.kt */
public class BleReader extends RealmObject implements Diffable<BleReader>, ru_unicorn_ujin_ble_data_BleReaderRealmProxyInterface {
    @SerializedName("device_class")
    private String deviceClass;
    @SerializedName("device_key")
    private String deviceKey;
    @SerializedName("device_mac")
    private String deviceMac;
    @SerializedName("device_name")
    private String deviceName;
    @SerializedName("device_title")
    private String deviceTitle;
    @SerializedName("interface_type")
    private String interfaceType;
    @SerializedName("rssi")
    private String rssi;
    @SerializedName("serial_number")
    @PrimaryKey
    private long serialNumber;
    @SerializedName("uuid_id")
    private String uuidID;
    @SerializedName("uuid_rx")
    private String uuidRX;
    @SerializedName("uuid_service")
    private String uuidService;
    @SerializedName("uuid_tx")
    private String uuidTX;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BleReader() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$deviceClass() {
        return this.deviceClass;
    }

    public String realmGet$deviceKey() {
        return this.deviceKey;
    }

    public String realmGet$deviceMac() {
        return this.deviceMac;
    }

    public String realmGet$deviceName() {
        return this.deviceName;
    }

    public String realmGet$deviceTitle() {
        return this.deviceTitle;
    }

    public String realmGet$interfaceType() {
        return this.interfaceType;
    }

    public String realmGet$rssi() {
        return this.rssi;
    }

    public long realmGet$serialNumber() {
        return this.serialNumber;
    }

    public String realmGet$uuidID() {
        return this.uuidID;
    }

    public String realmGet$uuidRX() {
        return this.uuidRX;
    }

    public String realmGet$uuidService() {
        return this.uuidService;
    }

    public String realmGet$uuidTX() {
        return this.uuidTX;
    }

    public void realmSet$deviceClass(String str) {
        this.deviceClass = str;
    }

    public void realmSet$deviceKey(String str) {
        this.deviceKey = str;
    }

    public void realmSet$deviceMac(String str) {
        this.deviceMac = str;
    }

    public void realmSet$deviceName(String str) {
        this.deviceName = str;
    }

    public void realmSet$deviceTitle(String str) {
        this.deviceTitle = str;
    }

    public void realmSet$interfaceType(String str) {
        this.interfaceType = str;
    }

    public void realmSet$rssi(String str) {
        this.rssi = str;
    }

    public void realmSet$serialNumber(long j) {
        this.serialNumber = j;
    }

    public void realmSet$uuidID(String str) {
        this.uuidID = str;
    }

    public void realmSet$uuidRX(String str) {
        this.uuidRX = str;
    }

    public void realmSet$uuidService(String str) {
        this.uuidService = str;
    }

    public void realmSet$uuidTX(String str) {
        this.uuidTX = str;
    }

    public final long getSerialNumber() {
        return realmGet$serialNumber();
    }

    public final void setSerialNumber(long j) {
        realmSet$serialNumber(j);
    }

    public final String getDeviceKey() {
        return realmGet$deviceKey();
    }

    public final void setDeviceKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$deviceKey(str);
    }

    public final String getDeviceName() {
        return realmGet$deviceName();
    }

    public final void setDeviceName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$deviceName(str);
    }

    public final String getDeviceTitle() {
        return realmGet$deviceTitle();
    }

    public final void setDeviceTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$deviceTitle(str);
    }

    public final String getDeviceClass() {
        return realmGet$deviceClass();
    }

    public final void setDeviceClass(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$deviceClass(str);
    }

    public final String getDeviceMac() {
        return realmGet$deviceMac();
    }

    public final void setDeviceMac(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$deviceMac(str);
    }

    public final String getInterfaceType() {
        return realmGet$interfaceType();
    }

    public final void setInterfaceType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$interfaceType(str);
    }

    public final String getUuidID() {
        return realmGet$uuidID();
    }

    public final void setUuidID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$uuidID(str);
    }

    public final String getUuidTX() {
        return realmGet$uuidTX();
    }

    public final void setUuidTX(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$uuidTX(str);
    }

    public final String getUuidRX() {
        return realmGet$uuidRX();
    }

    public final void setUuidRX(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$uuidRX(str);
    }

    public final String getUuidService() {
        return realmGet$uuidService();
    }

    public final void setUuidService(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$uuidService(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BleReader(long r16, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r15 = this;
            r0 = r15
            r1 = r29
            r2 = r1 & 1
            if (r2 == 0) goto L_0x000a
            r2 = 0
            goto L_0x000c
        L_0x000a:
            r2 = r16
        L_0x000c:
            r4 = r1 & 2
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0014
            r4 = r5
            goto L_0x0016
        L_0x0014:
            r4 = r18
        L_0x0016:
            r6 = r1 & 4
            if (r6 == 0) goto L_0x001c
            r6 = r5
            goto L_0x001e
        L_0x001c:
            r6 = r19
        L_0x001e:
            r7 = r1 & 8
            if (r7 == 0) goto L_0x0024
            r7 = r5
            goto L_0x0026
        L_0x0024:
            r7 = r20
        L_0x0026:
            r8 = r1 & 16
            if (r8 == 0) goto L_0x002c
            r8 = r5
            goto L_0x002e
        L_0x002c:
            r8 = r21
        L_0x002e:
            r9 = r1 & 32
            if (r9 == 0) goto L_0x0034
            r9 = r5
            goto L_0x0036
        L_0x0034:
            r9 = r22
        L_0x0036:
            r10 = r1 & 64
            if (r10 == 0) goto L_0x003c
            r10 = r5
            goto L_0x003e
        L_0x003c:
            r10 = r23
        L_0x003e:
            r11 = r1 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0044
            r11 = r5
            goto L_0x0046
        L_0x0044:
            r11 = r24
        L_0x0046:
            r12 = r1 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004c
            r12 = r5
            goto L_0x004e
        L_0x004c:
            r12 = r25
        L_0x004e:
            r13 = r1 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0054
            r13 = r5
            goto L_0x0056
        L_0x0054:
            r13 = r26
        L_0x0056:
            r14 = r1 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005c
            r14 = r5
            goto L_0x005e
        L_0x005c:
            r14 = r27
        L_0x005e:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r5 = r28
        L_0x0065:
            r16 = r15
            r17 = r2
            r19 = r4
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r10
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r14
            r29 = r5
            r16.<init>(r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x008c
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.ble.data.BleReader.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getRssi() {
        return realmGet$rssi();
    }

    public final void setRssi(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        realmSet$rssi(str);
    }

    public BleReader(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Intrinsics.checkNotNullParameter(str, "deviceKey");
        Intrinsics.checkNotNullParameter(str2, "deviceName");
        Intrinsics.checkNotNullParameter(str3, "deviceTitle");
        Intrinsics.checkNotNullParameter(str4, "deviceClass");
        Intrinsics.checkNotNullParameter(str5, "deviceMac");
        Intrinsics.checkNotNullParameter(str6, "interfaceType");
        Intrinsics.checkNotNullParameter(str7, "uuidID");
        Intrinsics.checkNotNullParameter(str8, "uuidTX");
        Intrinsics.checkNotNullParameter(str9, "uuidRX");
        Intrinsics.checkNotNullParameter(str10, "uuidService");
        Intrinsics.checkNotNullParameter(str11, "rssi");
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$serialNumber(j);
        realmSet$deviceKey(str);
        realmSet$deviceName(str2);
        realmSet$deviceTitle(str3);
        realmSet$deviceClass(str4);
        realmSet$deviceMac(str5);
        realmSet$interfaceType(str6);
        realmSet$uuidID(str7);
        realmSet$uuidTX(str8);
        realmSet$uuidRX(str9);
        realmSet$uuidService(str10);
        realmSet$rssi(str11);
    }

    public boolean areItemsTheSame(BleReader bleReader) {
        return bleReader != null && realmGet$serialNumber() == bleReader.realmGet$serialNumber();
    }

    public boolean areContentsTheSame(BleReader bleReader) {
        return Intrinsics.areEqual((Object) realmGet$deviceTitle(), (Object) bleReader != null ? bleReader.realmGet$deviceTitle() : null);
    }

    public String toString() {
        return "BleReader(serialNumber=" + realmGet$serialNumber() + ", deviceKey='" + realmGet$deviceKey() + "', deviceName='" + realmGet$deviceName() + "', deviceTitle='" + realmGet$deviceTitle() + "', deviceClass='" + realmGet$deviceClass() + "', deviceMac='" + realmGet$deviceMac() + "', interfaceType='" + realmGet$interfaceType() + "', uuidID='" + realmGet$uuidID() + "', uuidTX='" + realmGet$uuidTX() + "', uuidRX='" + realmGet$uuidRX() + "', uuidService='" + realmGet$uuidService() + "', rssi='" + realmGet$rssi() + "')";
    }
}
