package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import p046io.realm.C4613xe0811b7c;
import p046io.realm.RealmObject;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0016\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014¨\u0006\""}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/CouponImage;", "Lio/realm/RealmObject;", "id", "", "bytes", "name", "url", "width", "", "height", "preview", "Lru/unicorn/ujin/data/realm/marketplace/PreviewImage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Lru/unicorn/ujin/data/realm/marketplace/PreviewImage;)V", "getBytes", "()Ljava/lang/String;", "setBytes", "(Ljava/lang/String;)V", "getHeight", "()Ljava/lang/Float;", "setHeight", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getId", "setId", "getName", "setName", "getPreview", "()Lru/unicorn/ujin/data/realm/marketplace/PreviewImage;", "setPreview", "(Lru/unicorn/ujin/data/realm/marketplace/PreviewImage;)V", "getUrl", "setUrl", "getWidth", "setWidth", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.CouponImage */
/* compiled from: Coupon.kt */
public class CouponImage extends RealmObject implements C4613xe0811b7c {
    private String bytes;
    private Float height;

    /* renamed from: id */
    private String f6685id;
    private String name;
    private PreviewImage preview;
    private String url;
    private Float width;

    public CouponImage() {
        this((String) null, (String) null, (String) null, (String) null, (Float) null, (Float) null, (PreviewImage) null, 127, (DefaultConstructorMarker) null);
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
        return this.f6685id;
    }

    public String realmGet$name() {
        return this.name;
    }

    public PreviewImage realmGet$preview() {
        return this.preview;
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
        this.f6685id = str;
    }

    public void realmSet$name(String str) {
        this.name = str;
    }

    public void realmSet$preview(PreviewImage previewImage) {
        this.preview = previewImage;
    }

    public void realmSet$url(String str) {
        this.url = str;
    }

    public void realmSet$width(Float f) {
        this.width = f;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CouponImage(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.Float r10, java.lang.Float r11, p035ru.unicorn.ujin.data.realm.marketplace.PreviewImage r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            r0 = 0
            if (r14 == 0) goto L_0x0008
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L_0x0008:
            r14 = r13 & 2
            if (r14 == 0) goto L_0x000f
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L_0x000f:
            r14 = r7
            r7 = r13 & 4
            if (r7 == 0) goto L_0x0017
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
        L_0x0017:
            r1 = r8
            r7 = r13 & 8
            if (r7 == 0) goto L_0x001f
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
        L_0x001f:
            r2 = r9
            r7 = r13 & 16
            if (r7 == 0) goto L_0x0027
            r10 = r0
            java.lang.Float r10 = (java.lang.Float) r10
        L_0x0027:
            r3 = r10
            r7 = r13 & 32
            if (r7 == 0) goto L_0x002f
            r11 = r0
            java.lang.Float r11 = (java.lang.Float) r11
        L_0x002f:
            r4 = r11
            r7 = r13 & 64
            if (r7 == 0) goto L_0x0037
            r12 = r0
            ru.unicorn.ujin.data.realm.marketplace.PreviewImage r12 = (p035ru.unicorn.ujin.data.realm.marketplace.PreviewImage) r12
        L_0x0037:
            r0 = r12
            r7 = r5
            r8 = r6
            r9 = r14
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            boolean r6 = r5 instanceof p046io.realm.internal.RealmObjectProxy
            if (r6 == 0) goto L_0x004d
            r6 = r5
            io.realm.internal.RealmObjectProxy r6 = (p046io.realm.internal.RealmObjectProxy) r6
            r6.realm$injectObjectContext()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.CouponImage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, ru.unicorn.ujin.data.realm.marketplace.PreviewImage, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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

    public final PreviewImage getPreview() {
        return realmGet$preview();
    }

    public final void setPreview(PreviewImage previewImage) {
        realmSet$preview(previewImage);
    }

    public CouponImage(String str, String str2, String str3, String str4, Float f, Float f2, PreviewImage previewImage) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$bytes(str2);
        realmSet$name(str3);
        realmSet$url(str4);
        realmSet$width(f);
        realmSet$height(f2);
        realmSet$preview(previewImage);
    }
}
