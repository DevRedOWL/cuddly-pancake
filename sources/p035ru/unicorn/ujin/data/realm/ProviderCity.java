package p035ru.unicorn.ujin.data.realm;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rR \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/ProviderCity;", "Lio/realm/RealmObject;", "title", "", "prefix", "code", "", "latitude", "", "longitude", "url", "regionId", "accountPrefix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountPrefix", "()Ljava/lang/String;", "setAccountPrefix", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/Integer;", "setCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLongitude", "setLongitude", "getPrefix", "setPrefix", "getRegionId", "setRegionId", "getTitle", "setTitle", "getUrl", "setUrl", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.ProviderCity */
/* compiled from: ProviderCity.kt */
public class ProviderCity extends RealmObject implements ru_unicorn_ujin_data_realm_ProviderCityRealmProxyInterface {
    @SerializedName("account_prefix")
    private String accountPrefix;
    @SerializedName("city_code")
    private Integer code;
    @SerializedName("city_latitude")
    private Double latitude;
    @SerializedName("city_longitude")
    private Double longitude;
    @SerializedName("city_prefix")
    private String prefix;
    @SerializedName("region_id")
    private String regionId;
    @SerializedName("city_title")
    private String title;
    @SerializedName("city_url")
    private String url;

    public ProviderCity() {
        this((String) null, (String) null, (Integer) null, (Double) null, (Double) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$accountPrefix() {
        return this.accountPrefix;
    }

    public Integer realmGet$code() {
        return this.code;
    }

    public Double realmGet$latitude() {
        return this.latitude;
    }

    public Double realmGet$longitude() {
        return this.longitude;
    }

    public String realmGet$prefix() {
        return this.prefix;
    }

    public String realmGet$regionId() {
        return this.regionId;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$url() {
        return this.url;
    }

    public void realmSet$accountPrefix(String str) {
        this.accountPrefix = str;
    }

    public void realmSet$code(Integer num) {
        this.code = num;
    }

    public void realmSet$latitude(Double d) {
        this.latitude = d;
    }

    public void realmSet$longitude(Double d) {
        this.longitude = d;
    }

    public void realmSet$prefix(String str) {
        this.prefix = str;
    }

    public void realmSet$regionId(String str) {
        this.regionId = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProviderCity(java.lang.String r11, java.lang.String r12, java.lang.Integer r13, java.lang.Double r14, java.lang.Double r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
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
            java.lang.Integer r5 = (java.lang.Integer) r5
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0027
            r6 = r3
            java.lang.Double r6 = (java.lang.Double) r6
            goto L_0x0028
        L_0x0027:
            r6 = r14
        L_0x0028:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0030
            r7 = r3
            java.lang.Double r7 = (java.lang.Double) r7
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
            java.lang.String r1 = (java.lang.String) r1
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.ProviderCity.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Double, java.lang.Double, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getPrefix() {
        return realmGet$prefix();
    }

    public final void setPrefix(String str) {
        realmSet$prefix(str);
    }

    public final Integer getCode() {
        return realmGet$code();
    }

    public final void setCode(Integer num) {
        realmSet$code(num);
    }

    public final Double getLatitude() {
        return realmGet$latitude();
    }

    public final void setLatitude(Double d) {
        realmSet$latitude(d);
    }

    public final Double getLongitude() {
        return realmGet$longitude();
    }

    public final void setLongitude(Double d) {
        realmSet$longitude(d);
    }

    public final String getUrl() {
        return realmGet$url();
    }

    public final void setUrl(String str) {
        realmSet$url(str);
    }

    public final String getRegionId() {
        return realmGet$regionId();
    }

    public final void setRegionId(String str) {
        realmSet$regionId(str);
    }

    public final String getAccountPrefix() {
        return realmGet$accountPrefix();
    }

    public final void setAccountPrefix(String str) {
        realmSet$accountPrefix(str);
    }

    public ProviderCity(String str, String str2, Integer num, Double d, Double d2, String str3, String str4, String str5) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$title(str);
        realmSet$prefix(str2);
        realmSet$code(num);
        realmSet$latitude(d);
        realmSet$longitude(d2);
        realmSet$url(str3);
        realmSet$regionId(str4);
        realmSet$accountPrefix(str5);
    }
}
