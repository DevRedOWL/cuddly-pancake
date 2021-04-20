package p035ru.unicorn.ujin.data.realm.marketplace;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0016\u0018\u00002\u00020\u0001:\u0001+Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fR \u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013¨\u0006,"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Coupon;", "Lio/realm/RealmObject;", "id", "", "title", "", "description", "longDescription", "termsOfObtaining", "group", "buttonTitle", "image", "Lru/unicorn/ujin/data/realm/marketplace/CouponImage;", "redeemedCode", "Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/data/realm/marketplace/CouponImage;Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;)V", "getButtonTitle", "()Ljava/lang/String;", "setButtonTitle", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getGroup", "setGroup", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImage", "()Lru/unicorn/ujin/data/realm/marketplace/CouponImage;", "setImage", "(Lru/unicorn/ujin/data/realm/marketplace/CouponImage;)V", "getLongDescription", "setLongDescription", "getRedeemedCode", "()Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;", "setRedeemedCode", "(Lru/unicorn/ujin/data/realm/marketplace/RedeemedCode;)V", "getTermsOfObtaining", "setTermsOfObtaining", "getTitle", "setTitle", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Coupon */
/* compiled from: Coupon.kt */
public class Coupon extends RealmObject implements ru_unicorn_ujin_data_realm_marketplace_CouponRealmProxyInterface {
    @SerializedName("button_title")
    private String buttonTitle;
    private String description;
    @SerializedName("group_name")
    private String group;
    @PrimaryKey

    /* renamed from: id */
    private Integer f6683id;
    private CouponImage image;
    @SerializedName("detailed_description")
    private String longDescription;
    @SerializedName("redeemed_code")
    private RedeemedCode redeemedCode;
    @SerializedName("conditions")
    private String termsOfObtaining;
    private String title;

    public Coupon() {
        this((Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (CouponImage) null, (RedeemedCode) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$buttonTitle() {
        return this.buttonTitle;
    }

    public String realmGet$description() {
        return this.description;
    }

    public String realmGet$group() {
        return this.group;
    }

    public Integer realmGet$id() {
        return this.f6683id;
    }

    public CouponImage realmGet$image() {
        return this.image;
    }

    public String realmGet$longDescription() {
        return this.longDescription;
    }

    public RedeemedCode realmGet$redeemedCode() {
        return this.redeemedCode;
    }

    public String realmGet$termsOfObtaining() {
        return this.termsOfObtaining;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$buttonTitle(String str) {
        this.buttonTitle = str;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$group(String str) {
        this.group = str;
    }

    public void realmSet$id(Integer num) {
        this.f6683id = num;
    }

    public void realmSet$image(CouponImage couponImage) {
        this.image = couponImage;
    }

    public void realmSet$longDescription(String str) {
        this.longDescription = str;
    }

    public void realmSet$redeemedCode(RedeemedCode redeemedCode2) {
        this.redeemedCode = redeemedCode2;
    }

    public void realmSet$termsOfObtaining(String str) {
        this.termsOfObtaining = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Coupon(java.lang.Integer r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, p035ru.unicorn.ujin.data.realm.marketplace.CouponImage r19, p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r0 = r11
            r1 = r21
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000c
            r2 = r3
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L_0x000d
        L_0x000c:
            r2 = r12
        L_0x000d:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0015
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0016
        L_0x0015:
            r4 = r13
        L_0x0016:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x001e
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0027
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0028
        L_0x0027:
            r6 = r15
        L_0x0028:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0030
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0032
        L_0x0030:
            r7 = r16
        L_0x0032:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x0039
            java.lang.String r8 = ""
            goto L_0x003b
        L_0x0039:
            r8 = r17
        L_0x003b:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0043
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0045
        L_0x0043:
            r9 = r18
        L_0x0045:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004d
            r10 = r3
            ru.unicorn.ujin.data.realm.marketplace.CouponImage r10 = (p035ru.unicorn.ujin.data.realm.marketplace.CouponImage) r10
            goto L_0x004f
        L_0x004d:
            r10 = r19
        L_0x004f:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0057
            r1 = r3
            ru.unicorn.ujin.data.realm.marketplace.RedeemedCode r1 = (p035ru.unicorn.ujin.data.realm.marketplace.RedeemedCode) r1
            goto L_0x0059
        L_0x0057:
            r1 = r20
        L_0x0059:
            r12 = r11
            r13 = r2
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r10
            r21 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x0076
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.Coupon.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.unicorn.ujin.data.realm.marketplace.CouponImage, ru.unicorn.ujin.data.realm.marketplace.RedeemedCode, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Integer getId() {
        return realmGet$id();
    }

    public final void setId(Integer num) {
        realmSet$id(num);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getDescription() {
        return realmGet$description();
    }

    public final void setDescription(String str) {
        realmSet$description(str);
    }

    public final String getLongDescription() {
        return realmGet$longDescription();
    }

    public final void setLongDescription(String str) {
        realmSet$longDescription(str);
    }

    public final String getTermsOfObtaining() {
        return realmGet$termsOfObtaining();
    }

    public final void setTermsOfObtaining(String str) {
        realmSet$termsOfObtaining(str);
    }

    public final String getGroup() {
        return realmGet$group();
    }

    public final void setGroup(String str) {
        realmSet$group(str);
    }

    public final String getButtonTitle() {
        return realmGet$buttonTitle();
    }

    public final void setButtonTitle(String str) {
        realmSet$buttonTitle(str);
    }

    public final CouponImage getImage() {
        return realmGet$image();
    }

    public final void setImage(CouponImage couponImage) {
        realmSet$image(couponImage);
    }

    public final RedeemedCode getRedeemedCode() {
        return realmGet$redeemedCode();
    }

    public final void setRedeemedCode(RedeemedCode redeemedCode2) {
        realmSet$redeemedCode(redeemedCode2);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Coupon$Fields;", "", "()V", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.Coupon$Fields */
    /* compiled from: Coupon.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6684id = "id";

        private Fields() {
        }
    }

    public Coupon(Integer num, String str, String str2, String str3, String str4, String str5, String str6, CouponImage couponImage, RedeemedCode redeemedCode2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(num);
        realmSet$title(str);
        realmSet$description(str2);
        realmSet$longDescription(str3);
        realmSet$termsOfObtaining(str4);
        realmSet$group(str5);
        realmSet$buttonTitle(str6);
        realmSet$image(couponImage);
        realmSet$redeemedCode(redeemedCode2);
    }
}
