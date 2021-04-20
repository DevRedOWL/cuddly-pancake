package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001eBe\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bR \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006\u001f"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Banner;", "Lio/realm/RealmObject;", "id", "", "imageUrl", "previewUrl", "contentId", "contentType", "startedAt", "finishedAt", "categoryId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategoryId", "()Ljava/lang/String;", "setCategoryId", "(Ljava/lang/String;)V", "getContentId", "setContentId", "getContentType", "setContentType", "getFinishedAt", "setFinishedAt", "getId", "setId", "getImageUrl", "setImageUrl", "getPreviewUrl", "setPreviewUrl", "getStartedAt", "setStartedAt", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Banner */
/* compiled from: Banner.kt */
public class Banner extends RealmObject implements ru_unicorn_ujin_data_realm_marketplace_BannerRealmProxyInterface {
    @SerializedName("category_id")
    private String categoryId;
    @SerializedName("content_id")
    private String contentId;
    @SerializedName("content_type")
    private String contentType;
    @SerializedName("finished_at")
    private String finishedAt;
    @PrimaryKey

    /* renamed from: id */
    private String f6669id;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("preview_url")
    private String previewUrl;
    @SerializedName("started_at")
    private String startedAt;

    public Banner() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$categoryId() {
        return this.categoryId;
    }

    public String realmGet$contentId() {
        return this.contentId;
    }

    public String realmGet$contentType() {
        return this.contentType;
    }

    public String realmGet$finishedAt() {
        return this.finishedAt;
    }

    public String realmGet$id() {
        return this.f6669id;
    }

    public String realmGet$imageUrl() {
        return this.imageUrl;
    }

    public String realmGet$previewUrl() {
        return this.previewUrl;
    }

    public String realmGet$startedAt() {
        return this.startedAt;
    }

    public void realmSet$categoryId(String str) {
        this.categoryId = str;
    }

    public void realmSet$contentId(String str) {
        this.contentId = str;
    }

    public void realmSet$contentType(String str) {
        this.contentType = str;
    }

    public void realmSet$finishedAt(String str) {
        this.finishedAt = str;
    }

    public void realmSet$id(String str) {
        this.f6669id = str;
    }

    public void realmSet$imageUrl(String str) {
        this.imageUrl = str;
    }

    public void realmSet$previewUrl(String str) {
        this.previewUrl = str;
    }

    public void realmSet$startedAt(String str) {
        this.startedAt = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Banner(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.Banner.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getImageUrl() {
        return realmGet$imageUrl();
    }

    public final void setImageUrl(String str) {
        realmSet$imageUrl(str);
    }

    public final String getPreviewUrl() {
        return realmGet$previewUrl();
    }

    public final void setPreviewUrl(String str) {
        realmSet$previewUrl(str);
    }

    public final String getContentId() {
        return realmGet$contentId();
    }

    public final void setContentId(String str) {
        realmSet$contentId(str);
    }

    public final String getContentType() {
        return realmGet$contentType();
    }

    public final void setContentType(String str) {
        realmSet$contentType(str);
    }

    public final String getStartedAt() {
        return realmGet$startedAt();
    }

    public final void setStartedAt(String str) {
        realmSet$startedAt(str);
    }

    public final String getFinishedAt() {
        return realmGet$finishedAt();
    }

    public final void setFinishedAt(String str) {
        realmSet$finishedAt(str);
    }

    public final String getCategoryId() {
        return realmGet$categoryId();
    }

    public final void setCategoryId(String str) {
        realmSet$categoryId(str);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Banner$Fields;", "", "()V", "categoryId", "", "id", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.Banner$Fields */
    /* compiled from: Banner.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();
        public static final String categoryId = "categoryId";

        /* renamed from: id */
        public static final String f6670id = "id";

        private Fields() {
        }
    }

    public Banner(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$imageUrl(str2);
        realmSet$previewUrl(str3);
        realmSet$contentId(str4);
        realmSet$contentType(str5);
        realmSet$startedAt(str6);
        realmSet$finishedAt(str7);
        realmSet$categoryId(str8);
    }
}
