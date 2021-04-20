package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.view.activity.navigation.adapter.Diffable;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_PointRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B·\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010¢\u0006\u0002\u0010\u001aJ\u0012\u0010G\u001a\u00020\u00142\b\u0010H\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010I\u001a\u00020\u00142\b\u0010H\u001a\u0004\u0018\u00010\u0000H\u0016R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\u0019\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b\u000f\u0010/\"\u0004\b0\u00101R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b\u0015\u00103\"\u0004\b4\u00105R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b\u0013\u00103\"\u0004\b7\u00105R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010,\"\u0004\b@\u0010.R \u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010,\"\u0004\bB\u0010.R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\bC\u00103\"\u0004\bD\u00105R&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"¨\u0006J"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/Point;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/view/activity/navigation/adapter/Diffable;", "id", "", "longitude", "", "latitude", "radius", "name", "wifi", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/Wifi;", "beacons", "Lru/unicorn/ujin/data/realm/MyBeacon;", "isBeaconEnable", "", "beaconAction", "Lru/unicorn/ujin/data/realm/BeaconAction;", "isWIFIEnable", "", "isGPSEnable", "remove", "camera", "Lru/unicorn/ujin/data/realm/Camera;", "hide", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/Integer;Lru/unicorn/ujin/data/realm/BeaconAction;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lru/unicorn/ujin/data/realm/Camera;I)V", "getBeaconAction", "()Lru/unicorn/ujin/data/realm/BeaconAction;", "setBeaconAction", "(Lru/unicorn/ujin/data/realm/BeaconAction;)V", "getBeacons", "()Lio/realm/RealmList;", "setBeacons", "(Lio/realm/RealmList;)V", "getCamera", "()Lru/unicorn/ujin/data/realm/Camera;", "setCamera", "(Lru/unicorn/ujin/data/realm/Camera;)V", "getHide", "()I", "setHide", "(I)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Ljava/lang/Integer;", "setBeaconEnable", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setGPSEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setWIFIEnable", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLongitude", "setLongitude", "getName", "setName", "getRadius", "setRadius", "getRemove", "setRemove", "getWifi", "setWifi", "areContentsTheSame", "other", "areItemsTheSame", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.Point */
/* compiled from: Point.kt */
public class Point extends RealmObject implements Diffable<Point>, ru_unicorn_ujin_data_realm_PointRealmProxyInterface {
    @SerializedName("action")
    private BeaconAction beaconAction;
    @SerializedName("beacon")
    private RealmList<MyBeacon> beacons;
    @SerializedName("camera")
    private Camera camera;
    private int hide;
    @SerializedName("id")
    @PrimaryKey

    /* renamed from: id */
    private String f6662id;
    @SerializedName("beacon-enabled")
    private Integer isBeaconEnable;
    private Boolean isGPSEnable;
    private Boolean isWIFIEnable;
    @SerializedName("latitude")
    private Double latitude;
    @SerializedName("longitude")
    private Double longitude;
    @SerializedName("name")
    private String name;
    @SerializedName("radius")
    private String radius;
    private Boolean remove;
    @SerializedName("wifi")
    private RealmList<Wifi> wifi;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Point() {
        this((String) null, (Double) null, (Double) null, (String) null, (String) null, (RealmList) null, (RealmList) null, (Integer) null, (BeaconAction) null, (Boolean) null, (Boolean) null, (Boolean) null, (Camera) null, 0, 16383, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public boolean areContentsTheSame(Point point) {
        return true;
    }

    public BeaconAction realmGet$beaconAction() {
        return this.beaconAction;
    }

    public RealmList realmGet$beacons() {
        return this.beacons;
    }

    public Camera realmGet$camera() {
        return this.camera;
    }

    public int realmGet$hide() {
        return this.hide;
    }

    public String realmGet$id() {
        return this.f6662id;
    }

    public Integer realmGet$isBeaconEnable() {
        return this.isBeaconEnable;
    }

    public Boolean realmGet$isGPSEnable() {
        return this.isGPSEnable;
    }

    public Boolean realmGet$isWIFIEnable() {
        return this.isWIFIEnable;
    }

    public Double realmGet$latitude() {
        return this.latitude;
    }

    public Double realmGet$longitude() {
        return this.longitude;
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$radius() {
        return this.radius;
    }

    public Boolean realmGet$remove() {
        return this.remove;
    }

    public RealmList realmGet$wifi() {
        return this.wifi;
    }

    public void realmSet$beaconAction(BeaconAction beaconAction2) {
        this.beaconAction = beaconAction2;
    }

    public void realmSet$beacons(RealmList realmList) {
        this.beacons = realmList;
    }

    public void realmSet$camera(Camera camera2) {
        this.camera = camera2;
    }

    public void realmSet$hide(int i) {
        this.hide = i;
    }

    public void realmSet$id(String str) {
        this.f6662id = str;
    }

    public void realmSet$isBeaconEnable(Integer num) {
        this.isBeaconEnable = num;
    }

    public void realmSet$isGPSEnable(Boolean bool) {
        this.isGPSEnable = bool;
    }

    public void realmSet$isWIFIEnable(Boolean bool) {
        this.isWIFIEnable = bool;
    }

    public void realmSet$latitude(Double d) {
        this.latitude = d;
    }

    public void realmSet$longitude(Double d) {
        this.longitude = d;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$radius(String str) {
        this.radius = str;
    }

    public void realmSet$remove(Boolean bool) {
        this.remove = bool;
    }

    public void realmSet$wifi(RealmList realmList) {
        this.wifi = realmList;
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Point(java.lang.String r17, java.lang.Double r18, java.lang.Double r19, java.lang.String r20, java.lang.String r21, p046io.realm.RealmList r22, p046io.realm.RealmList r23, java.lang.Integer r24, p035ru.unicorn.ujin.data.realm.BeaconAction r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.Boolean r28, p035ru.unicorn.ujin.data.realm.Camera r29, int r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r16 = this;
            r0 = r16
            r1 = r31
            r2 = r1 & 1
            if (r2 == 0) goto L_0x000b
            java.lang.String r2 = "0"
            goto L_0x000d
        L_0x000b:
            r2 = r17
        L_0x000d:
            r3 = r1 & 2
            r4 = 0
            if (r3 == 0) goto L_0x0018
            java.lang.Double r3 = java.lang.Double.valueOf(r4)
            goto L_0x001a
        L_0x0018:
            r3 = r18
        L_0x001a:
            r6 = r1 & 4
            if (r6 == 0) goto L_0x0023
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            goto L_0x0025
        L_0x0023:
            r4 = r19
        L_0x0025:
            r5 = r1 & 8
            r6 = 0
            if (r5 == 0) goto L_0x002e
            r5 = r6
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0030
        L_0x002e:
            r5 = r20
        L_0x0030:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0038
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x003a
        L_0x0038:
            r7 = r21
        L_0x003a:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x0042
            r8 = r6
            io.realm.RealmList r8 = (p046io.realm.RealmList) r8
            goto L_0x0044
        L_0x0042:
            r8 = r22
        L_0x0044:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x004c
            r9 = r6
            io.realm.RealmList r9 = (p046io.realm.RealmList) r9
            goto L_0x004e
        L_0x004c:
            r9 = r23
        L_0x004e:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0058
            r10 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x005a
        L_0x0058:
            r10 = r24
        L_0x005a:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0062
            r11 = r6
            ru.unicorn.ujin.data.realm.BeaconAction r11 = (p035ru.unicorn.ujin.data.realm.BeaconAction) r11
            goto L_0x0064
        L_0x0062:
            r11 = r25
        L_0x0064:
            r12 = r1 & 512(0x200, float:7.175E-43)
            r13 = 0
            if (r12 == 0) goto L_0x006e
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r13)
            goto L_0x0070
        L_0x006e:
            r12 = r26
        L_0x0070:
            r14 = r1 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0079
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r13)
            goto L_0x007b
        L_0x0079:
            r14 = r27
        L_0x007b:
            r15 = r1 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0084
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r13)
            goto L_0x0086
        L_0x0084:
            r15 = r28
        L_0x0086:
            r13 = r1 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x008d
            ru.unicorn.ujin.data.realm.Camera r6 = (p035ru.unicorn.ujin.data.realm.Camera) r6
            goto L_0x008f
        L_0x008d:
            r6 = r29
        L_0x008f:
            r1 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0095
            r1 = 0
            goto L_0x0097
        L_0x0095:
            r1 = r30
        L_0x0097:
            r17 = r16
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r14
            r29 = r15
            r30 = r6
            r31 = r1
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x00c2
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x00c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.Point.<init>(java.lang.String, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String, io.realm.RealmList, io.realm.RealmList, java.lang.Integer, ru.unicorn.ujin.data.realm.BeaconAction, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, ru.unicorn.ujin.data.realm.Camera, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Double getLongitude() {
        return realmGet$longitude();
    }

    public final void setLongitude(Double d) {
        realmSet$longitude(d);
    }

    public final Double getLatitude() {
        return realmGet$latitude();
    }

    public final void setLatitude(Double d) {
        realmSet$latitude(d);
    }

    public final String getRadius() {
        return realmGet$radius();
    }

    public final void setRadius(String str) {
        realmSet$radius(str);
    }

    public final String getName() {
        return realmGet$name();
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final RealmList<Wifi> getWifi() {
        return realmGet$wifi();
    }

    public final void setWifi(RealmList<Wifi> realmList) {
        realmSet$wifi(realmList);
    }

    public final RealmList<MyBeacon> getBeacons() {
        return realmGet$beacons();
    }

    public final void setBeacons(RealmList<MyBeacon> realmList) {
        realmSet$beacons(realmList);
    }

    public final Integer isBeaconEnable() {
        return realmGet$isBeaconEnable();
    }

    public final void setBeaconEnable(Integer num) {
        realmSet$isBeaconEnable(num);
    }

    public final BeaconAction getBeaconAction() {
        return realmGet$beaconAction();
    }

    public final void setBeaconAction(BeaconAction beaconAction2) {
        realmSet$beaconAction(beaconAction2);
    }

    public final Boolean isWIFIEnable() {
        return realmGet$isWIFIEnable();
    }

    public final void setWIFIEnable(Boolean bool) {
        realmSet$isWIFIEnable(bool);
    }

    public final Boolean isGPSEnable() {
        return realmGet$isGPSEnable();
    }

    public final void setGPSEnable(Boolean bool) {
        realmSet$isGPSEnable(bool);
    }

    public final Boolean getRemove() {
        return realmGet$remove();
    }

    public final void setRemove(Boolean bool) {
        realmSet$remove(bool);
    }

    public final Camera getCamera() {
        return realmGet$camera();
    }

    public final void setCamera(Camera camera2) {
        realmSet$camera(camera2);
    }

    public final int getHide() {
        return realmGet$hide();
    }

    public final void setHide(int i) {
        realmSet$hide(i);
    }

    public Point(String str, Double d, Double d2, String str2, String str3, RealmList<Wifi> realmList, RealmList<MyBeacon> realmList2, Integer num, BeaconAction beaconAction2, Boolean bool, Boolean bool2, Boolean bool3, Camera camera2, int i) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$longitude(d);
        realmSet$latitude(d2);
        realmSet$radius(str2);
        realmSet$name(str3);
        realmSet$wifi(realmList);
        realmSet$beacons(realmList2);
        realmSet$isBeaconEnable(num);
        realmSet$beaconAction(beaconAction2);
        realmSet$isWIFIEnable(bool);
        realmSet$isGPSEnable(bool2);
        realmSet$remove(bool3);
        realmSet$camera(camera2);
        realmSet$hide(i);
    }

    public boolean areItemsTheSame(Point point) {
        return Intrinsics.areEqual((Object) realmGet$id(), (Object) point != null ? point.realmGet$id() : null);
    }
}
