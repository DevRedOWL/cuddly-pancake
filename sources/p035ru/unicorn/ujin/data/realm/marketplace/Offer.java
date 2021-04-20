package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.FileData;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;
import p046io.realm.ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b-\b\u0016\u0018\u00002\u00020\u0001:\u0001?BÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017R \u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b\u0014\u0010,\"\u0004\b-\u0010.R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010/\u001a\u0004\b\u0012\u0010,\"\u0004\b0\u0010.R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010'\"\u0004\b8\u0010)R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0019\"\u0004\b:\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0019\"\u0004\b<\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0019\"\u0004\b>\u0010\u001b¨\u0006@"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Offer;", "Lio/realm/RealmObject;", "id", "", "title", "type", "companyId", "units", "image", "Lru/unicorn/ujin/data/realm/FileData;", "price", "oldPrice", "summary", "tags", "Lio/realm/RealmList;", "", "images", "description", "isPriceRange", "", "isPaymentEnabled", "accentColor", "importOfferLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/data/realm/FileData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Lio/realm/RealmList;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAccentColor", "()Ljava/lang/String;", "setAccentColor", "(Ljava/lang/String;)V", "getCompanyId", "setCompanyId", "getDescription", "setDescription", "getId", "setId", "getImage", "()Lru/unicorn/ujin/data/realm/FileData;", "setImage", "(Lru/unicorn/ujin/data/realm/FileData;)V", "getImages", "()Lio/realm/RealmList;", "setImages", "(Lio/realm/RealmList;)V", "getImportOfferLink", "setImportOfferLink", "()Ljava/lang/Boolean;", "setPaymentEnabled", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "setPriceRange", "getOldPrice", "setOldPrice", "getPrice", "setPrice", "getSummary", "setSummary", "getTags", "setTags", "getTitle", "setTitle", "getType", "setType", "getUnits", "setUnits", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Offer */
/* compiled from: Offer.kt */
public class Offer extends RealmObject implements ru_unicorn_ujin_data_realm_marketplace_OfferRealmProxyInterface {
    @SerializedName("accent_color")
    private String accentColor;
    @SerializedName("company_id")
    private String companyId;
    private String description;
    @PrimaryKey

    /* renamed from: id */
    private String f6686id;
    private FileData image;
    private RealmList<FileData> images;
    @SerializedName("import_offer_link")
    private String importOfferLink;
    @SerializedName("is_payment_enabled")
    private Boolean isPaymentEnabled;
    @SerializedName("is_price_range")
    private Boolean isPriceRange;
    @SerializedName("old_price")
    private String oldPrice;
    private String price;
    private String summary;
    private RealmList<Integer> tags;
    private String title;
    private String type;
    private String units;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Offer() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (FileData) null, (String) null, (String) null, (String) null, (RealmList) null, (RealmList) null, (String) null, (Boolean) null, (Boolean) null, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public String realmGet$accentColor() {
        return this.accentColor;
    }

    public String realmGet$companyId() {
        return this.companyId;
    }

    public String realmGet$description() {
        return this.description;
    }

    public String realmGet$id() {
        return this.f6686id;
    }

    public FileData realmGet$image() {
        return this.image;
    }

    public RealmList realmGet$images() {
        return this.images;
    }

    public String realmGet$importOfferLink() {
        return this.importOfferLink;
    }

    public Boolean realmGet$isPaymentEnabled() {
        return this.isPaymentEnabled;
    }

    public Boolean realmGet$isPriceRange() {
        return this.isPriceRange;
    }

    public String realmGet$oldPrice() {
        return this.oldPrice;
    }

    public String realmGet$price() {
        return this.price;
    }

    public String realmGet$summary() {
        return this.summary;
    }

    public RealmList realmGet$tags() {
        return this.tags;
    }

    public String realmGet$title() {
        return this.title;
    }

    public String realmGet$type() {
        return this.type;
    }

    public String realmGet$units() {
        return this.units;
    }

    public void realmSet$accentColor(String str) {
        this.accentColor = str;
    }

    public void realmSet$companyId(String str) {
        this.companyId = str;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$id(String str) {
        this.f6686id = str;
    }

    public void realmSet$image(FileData fileData) {
        this.image = fileData;
    }

    public void realmSet$images(RealmList realmList) {
        this.images = realmList;
    }

    public void realmSet$importOfferLink(String str) {
        this.importOfferLink = str;
    }

    public void realmSet$isPaymentEnabled(Boolean bool) {
        this.isPaymentEnabled = bool;
    }

    public void realmSet$isPriceRange(Boolean bool) {
        this.isPriceRange = bool;
    }

    public void realmSet$oldPrice(String str) {
        this.oldPrice = str;
    }

    public void realmSet$price(String str) {
        this.price = str;
    }

    public void realmSet$summary(String str) {
        this.summary = str;
    }

    public void realmSet$tags(RealmList realmList) {
        this.tags = realmList;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    public void realmSet$type(String str) {
        this.type = str;
    }

    public void realmSet$units(String str) {
        this.units = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Offer(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, p035ru.unicorn.ujin.data.realm.FileData r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, p046io.realm.RealmList r27, p046io.realm.RealmList r28, java.lang.String r29, java.lang.Boolean r30, java.lang.Boolean r31, java.lang.String r32, java.lang.String r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r17 = this;
            r0 = r17
            r1 = r34
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000d
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x000f
        L_0x000d:
            r2 = r18
        L_0x000f:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0017
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0019
        L_0x0017:
            r4 = r19
        L_0x0019:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x0021
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0023
        L_0x0021:
            r5 = r20
        L_0x0023:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x002b
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x002d
        L_0x002b:
            r6 = r21
        L_0x002d:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0035
            r7 = r3
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0037
        L_0x0035:
            r7 = r22
        L_0x0037:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x003f
            r8 = r3
            ru.unicorn.ujin.data.realm.FileData r8 = (p035ru.unicorn.ujin.data.realm.FileData) r8
            goto L_0x0041
        L_0x003f:
            r8 = r23
        L_0x0041:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0049
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x004b
        L_0x0049:
            r9 = r24
        L_0x004b:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0053
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0055
        L_0x0053:
            r10 = r25
        L_0x0055:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x005d
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x005f
        L_0x005d:
            r11 = r26
        L_0x005f:
            r12 = r1 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0067
            r12 = r3
            io.realm.RealmList r12 = (p046io.realm.RealmList) r12
            goto L_0x0069
        L_0x0067:
            r12 = r27
        L_0x0069:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0071
            r13 = r3
            io.realm.RealmList r13 = (p046io.realm.RealmList) r13
            goto L_0x0073
        L_0x0071:
            r13 = r28
        L_0x0073:
            r14 = r1 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x007b
            r14 = r3
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x007d
        L_0x007b:
            r14 = r29
        L_0x007d:
            r15 = r1 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0085
            r15 = r3
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            goto L_0x0087
        L_0x0085:
            r15 = r30
        L_0x0087:
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x008f
            r0 = r3
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L_0x0091
        L_0x008f:
            r0 = r31
        L_0x0091:
            r35 = r0
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x009b
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x009d
        L_0x009b:
            r0 = r32
        L_0x009d:
            r16 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r16
            if (r1 == 0) goto L_0x00a8
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x00aa
        L_0x00a8:
            r1 = r33
        L_0x00aa:
            r18 = r17
            r19 = r2
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            r32 = r35
            r33 = r0
            r34 = r1
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = r17
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x00db
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.Offer.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ru.unicorn.ujin.data.realm.FileData, java.lang.String, java.lang.String, java.lang.String, io.realm.RealmList, io.realm.RealmList, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getId() {
        return realmGet$id();
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final String getTitle() {
        return realmGet$title();
    }

    public final void setTitle(String str) {
        realmSet$title(str);
    }

    public final String getType() {
        return realmGet$type();
    }

    public final void setType(String str) {
        realmSet$type(str);
    }

    public final String getCompanyId() {
        return realmGet$companyId();
    }

    public final void setCompanyId(String str) {
        realmSet$companyId(str);
    }

    public final String getUnits() {
        return realmGet$units();
    }

    public final void setUnits(String str) {
        realmSet$units(str);
    }

    public final FileData getImage() {
        return realmGet$image();
    }

    public final void setImage(FileData fileData) {
        realmSet$image(fileData);
    }

    public final String getPrice() {
        return realmGet$price();
    }

    public final void setPrice(String str) {
        realmSet$price(str);
    }

    public final String getOldPrice() {
        return realmGet$oldPrice();
    }

    public final void setOldPrice(String str) {
        realmSet$oldPrice(str);
    }

    public final String getSummary() {
        return realmGet$summary();
    }

    public final void setSummary(String str) {
        realmSet$summary(str);
    }

    public final RealmList<Integer> getTags() {
        return realmGet$tags();
    }

    public final void setTags(RealmList<Integer> realmList) {
        realmSet$tags(realmList);
    }

    public final RealmList<FileData> getImages() {
        return realmGet$images();
    }

    public final void setImages(RealmList<FileData> realmList) {
        realmSet$images(realmList);
    }

    public final String getDescription() {
        return realmGet$description();
    }

    public final void setDescription(String str) {
        realmSet$description(str);
    }

    public final Boolean isPriceRange() {
        return realmGet$isPriceRange();
    }

    public final void setPriceRange(Boolean bool) {
        realmSet$isPriceRange(bool);
    }

    public final Boolean isPaymentEnabled() {
        return realmGet$isPaymentEnabled();
    }

    public final void setPaymentEnabled(Boolean bool) {
        realmSet$isPaymentEnabled(bool);
    }

    public final String getAccentColor() {
        return realmGet$accentColor();
    }

    public final void setAccentColor(String str) {
        realmSet$accentColor(str);
    }

    public final String getImportOfferLink() {
        return realmGet$importOfferLink();
    }

    public final void setImportOfferLink(String str) {
        realmSet$importOfferLink(str);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Offer$Fields;", "", "()V", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.Offer$Fields */
    /* compiled from: Offer.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6687id = "id";

        private Fields() {
        }
    }

    public Offer(String str, String str2, String str3, String str4, String str5, FileData fileData, String str6, String str7, String str8, RealmList<Integer> realmList, RealmList<FileData> realmList2, String str9, Boolean bool, Boolean bool2, String str10, String str11) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        String str12 = str2;
        realmSet$title(str2);
        String str13 = str3;
        realmSet$type(str3);
        String str14 = str4;
        realmSet$companyId(str4);
        String str15 = str5;
        realmSet$units(str5);
        FileData fileData2 = fileData;
        realmSet$image(fileData);
        String str16 = str6;
        realmSet$price(str6);
        String str17 = str7;
        realmSet$oldPrice(str7);
        String str18 = str8;
        realmSet$summary(str8);
        RealmList<Integer> realmList3 = realmList;
        realmSet$tags(realmList);
        RealmList<FileData> realmList4 = realmList2;
        realmSet$images(realmList2);
        String str19 = str9;
        realmSet$description(str9);
        Boolean bool3 = bool;
        realmSet$isPriceRange(bool);
        realmSet$isPaymentEnabled(bool2);
        realmSet$accentColor(str10);
        realmSet$importOfferLink(str11);
    }
}
