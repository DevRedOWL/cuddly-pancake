package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import p046io.realm.C4617x60d71890;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006\u001c"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/PreviewImage;", "Lio/realm/RealmObject;", "id", "", "bytes", "name", "url", "width", "", "height", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "getBytes", "()Ljava/lang/String;", "setBytes", "(Ljava/lang/String;)V", "getHeight", "()Ljava/lang/Float;", "setHeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getId", "setId", "getName", "setName", "getUrl", "setUrl", "getWidth", "setWidth", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.PreviewImage */
/* compiled from: Coupon.kt */
public class PreviewImage extends RealmObject implements C4617x60d71890 {
    private String bytes;
    private Float height;

    /* renamed from: id */
    private String f6691id;
    private String name;
    private String url;
    private Float width;

    public PreviewImage() {
        this((String) null, (String) null, (String) null, (String) null, (Float) null, (Float) null, 63, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$bytes() {
        return this.bytes;
    }

    public Float realmGet$height() {
        return this.height;
    }

    public String realmGet$id() {
        return this.f6691id;
    }

    public String realmGet$name() {
        return this.name;
    }

    public String realmGet$url() {
        return this.url;
    }

    public Float realmGet$width() {
        return this.width;
    }

    public void realmSet$bytes(String str) {
        this.bytes = str;
    }

    public void realmSet$height(Float f) {
        this.height = f;
    }

    public void realmSet$id(String str) {
        this.f6691id = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public void realmSet$width(Float f) {
        this.width = f;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PreviewImage(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.Float r9, java.lang.Float r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
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
            java.lang.Float r9 = (java.lang.Float) r9
        L_0x0027:
            r3 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002f
            r10 = r0
            java.lang.Float r10 = (java.lang.Float) r10
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.PreviewImage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getBytes() {
        return realmGet$bytes();
    }

    public final void setBytes(String str) {
        realmSet$bytes(str);
    }

    public final String getName() {
        return realmGet$name();
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final String getUrl() {
        return realmGet$url();
    }

    public final void setUrl(String str) {
        realmSet$url(str);
    }

    public final Float getWidth() {
        return realmGet$width();
    }

    public final void setWidth(Float f) {
        realmSet$width(f);
    }

    public final Float getHeight() {
        return realmGet$height();
    }

    public final void setHeight(Float f) {
        realmSet$height(f);
    }

    public PreviewImage(String str, String str2, String str3, String str4, Float f, Float f2) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$bytes(str2);
        realmSet$name(str3);
        realmSet$url(str4);
        realmSet$width(f);
        realmSet$height(f2);
    }
}
