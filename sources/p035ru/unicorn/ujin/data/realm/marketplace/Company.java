package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.market.search.SearchResultType;
import p046io.realm.C4611x5a122a54;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u00014B§\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\u0010\u0013J\b\u00102\u001a\u000203H\u0016R \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017¨\u00065"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Company;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/market/search/SearchResultType;", "id", "", "title", "tagline", "highlights", "Lio/realm/RealmList;", "logo", "Lru/unicorn/ujin/data/realm/FileData;", "background", "accentColor", "summary", "description", "delivery", "contacts", "Lru/unicorn/ujin/data/realm/marketplace/CompanyContact;", "images", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Lru/unicorn/ujin/data/realm/FileData;Lru/unicorn/ujin/data/realm/FileData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;Lio/realm/RealmList;)V", "getAccentColor", "()Ljava/lang/String;", "setAccentColor", "(Ljava/lang/String;)V", "getBackground", "()Lru/unicorn/ujin/data/realm/FileData;", "setBackground", "(Lru/unicorn/ujin/data/realm/FileData;)V", "getContacts", "()Lio/realm/RealmList;", "setContacts", "(Lio/realm/RealmList;)V", "getDelivery", "setDelivery", "getDescription", "setDescription", "getHighlights", "setHighlights", "getId", "setId", "getImages", "setImages", "getLogo", "setLogo", "getSummary", "setSummary", "getTagline", "setTagline", "getTitle", "setTitle", "getType", "", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Company */
/* compiled from: Company.kt */
public class Company extends RealmObject implements SearchResultType, C4611x5a122a54 {
    @SerializedName("accent_color")
    private String accentColor;
    private FileData background;
    private RealmList<CompanyContact> contacts;
    private String delivery;
    private String description;
    private RealmList<String> highlights;
    @PrimaryKey

    /* renamed from: id */
    private String f6681id;
    private RealmList<FileData> images;
    private FileData logo;
    private String summary;
    private String tagline;
    private String title;

    public Company() {
        this((String) null, (String) null, (String) null, (RealmList) null, (FileData) null, (FileData) null, (String) null, (String) null, (String) null, (String) null, (RealmList) null, (RealmList) null, 4095, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public int getType() {
        return 0;
    }

    public String realmGet$accentColor() {
        return this.accentColor;
    }

    public FileData realmGet$background() {
        return this.background;
    }

    public RealmList realmGet$contacts() {
        return this.contacts;
    }

    public String realmGet$delivery() {
        return this.delivery;
    }

    public String realmGet$description() {
        return this.description;
    }

    public RealmList realmGet$highlights() {
        return this.highlights;
    }

    public String realmGet$id() {
        return this.f6681id;
    }

    public RealmList realmGet$images() {
        return this.images;
    }

    public FileData realmGet$logo() {
        return this.logo;
    }

    public String realmGet$summary() {
        return this.summary;
    }

    public String realmGet$tagline() {
        return this.tagline;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$accentColor(String str) {
        this.accentColor = str;
    }

    public void realmSet$background(FileData fileData) {
        this.background = fileData;
    }

    public void realmSet$contacts(RealmList realmList) {
        this.contacts = realmList;
    }

    public void realmSet$delivery(String str) {
        this.delivery = str;
    }

    public void realmSet$description(String str) {
        this.description = str;
    }

    public void realmSet$highlights(RealmList realmList) {
        this.highlights = realmList;
    }

    public void realmSet$id(String str) {
        this.f6681id = str;
    }

    public void realmSet$images(RealmList realmList) {
        this.images = realmList;
    }

    public void realmSet$logo(FileData fileData) {
        this.logo = fileData;
    }

    public void realmSet$summary(String str) {
        this.summary = str;
    }

    public void realmSet$tagline(String str) {
        this.tagline = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Company(java.lang.String r15, java.lang.String r16, java.lang.String r17, p046io.realm.RealmList r18, p035ru.unicorn.ujin.data.realm.FileData r19, p035ru.unicorn.ujin.data.realm.FileData r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, p046io.realm.RealmList r25, p046io.realm.RealmList r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r0 = r14
            r1 = r27
            r2 = r1 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000c
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x000d
        L_0x000c:
            r2 = r15
        L_0x000d:
            r4 = r1 & 2
            if (r4 == 0) goto L_0x0015
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0017
        L_0x0015:
            r4 = r16
        L_0x0017:
            r5 = r1 & 4
            if (r5 == 0) goto L_0x001f
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0021
        L_0x001f:
            r5 = r17
        L_0x0021:
            r6 = r1 & 8
            if (r6 == 0) goto L_0x0029
            r6 = r3
            io.realm.RealmList r6 = (p046io.realm.RealmList) r6
            goto L_0x002b
        L_0x0029:
            r6 = r18
        L_0x002b:
            r7 = r1 & 16
            if (r7 == 0) goto L_0x0033
            r7 = r3
            ru.unicorn.ujin.data.realm.FileData r7 = (p035ru.unicorn.ujin.data.realm.FileData) r7
            goto L_0x0035
        L_0x0033:
            r7 = r19
        L_0x0035:
            r8 = r1 & 32
            if (r8 == 0) goto L_0x003d
            r8 = r3
            ru.unicorn.ujin.data.realm.FileData r8 = (p035ru.unicorn.ujin.data.realm.FileData) r8
            goto L_0x003f
        L_0x003d:
            r8 = r20
        L_0x003f:
            r9 = r1 & 64
            if (r9 == 0) goto L_0x0047
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0049
        L_0x0047:
            r9 = r21
        L_0x0049:
            r10 = r1 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0051
            r10 = r3
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x0053
        L_0x0051:
            r10 = r22
        L_0x0053:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x005b
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            goto L_0x005d
        L_0x005b:
            r11 = r23
        L_0x005d:
            r12 = r1 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0065
            r12 = r3
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x0067
        L_0x0065:
            r12 = r24
        L_0x0067:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x006f
            r13 = r3
            io.realm.RealmList r13 = (p046io.realm.RealmList) r13
            goto L_0x0071
        L_0x006f:
            r13 = r25
        L_0x0071:
            r1 = r1 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0079
            r1 = r3
            io.realm.RealmList r1 = (p046io.realm.RealmList) r1
            goto L_0x007b
        L_0x0079:
            r1 = r26
        L_0x007b:
            r15 = r14
            r16 = r2
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r13
            r27 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r1 = r0 instanceof p046io.realm.internal.RealmObjectProxy
            if (r1 == 0) goto L_0x00a1
            r1 = r0
            io.realm.internal.RealmObjectProxy r1 = (p046io.realm.internal.RealmObjectProxy) r1
            r1.realm$injectObjectContext()
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.Company.<init>(java.lang.String, java.lang.String, java.lang.String, io.realm.RealmList, ru.unicorn.ujin.data.realm.FileData, ru.unicorn.ujin.data.realm.FileData, java.lang.String, java.lang.String, java.lang.String, java.lang.String, io.realm.RealmList, io.realm.RealmList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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

    public final String getTagline() {
        return realmGet$tagline();
    }

    public final void setTagline(String str) {
        realmSet$tagline(str);
    }

    public final RealmList<String> getHighlights() {
        return realmGet$highlights();
    }

    public final void setHighlights(RealmList<String> realmList) {
        realmSet$highlights(realmList);
    }

    public final FileData getLogo() {
        return realmGet$logo();
    }

    public final void setLogo(FileData fileData) {
        realmSet$logo(fileData);
    }

    public final FileData getBackground() {
        return realmGet$background();
    }

    public final void setBackground(FileData fileData) {
        realmSet$background(fileData);
    }

    public final String getAccentColor() {
        return realmGet$accentColor();
    }

    public final void setAccentColor(String str) {
        realmSet$accentColor(str);
    }

    public final String getSummary() {
        return realmGet$summary();
    }

    public final void setSummary(String str) {
        realmSet$summary(str);
    }

    public final String getDescription() {
        return realmGet$description();
    }

    public final void setDescription(String str) {
        realmSet$description(str);
    }

    public final String getDelivery() {
        return realmGet$delivery();
    }

    public final void setDelivery(String str) {
        realmSet$delivery(str);
    }

    public final RealmList<CompanyContact> getContacts() {
        return realmGet$contacts();
    }

    public final void setContacts(RealmList<CompanyContact> realmList) {
        realmSet$contacts(realmList);
    }

    public final RealmList<FileData> getImages() {
        return realmGet$images();
    }

    public final void setImages(RealmList<FileData> realmList) {
        realmSet$images(realmList);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Company$Fields;", "", "()V", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.Company$Fields */
    /* compiled from: Company.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6682id = "id";

        private Fields() {
        }
    }

    public Company(String str, String str2, String str3, RealmList<String> realmList, FileData fileData, FileData fileData2, String str4, String str5, String str6, String str7, RealmList<CompanyContact> realmList2, RealmList<FileData> realmList3) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$title(str2);
        realmSet$tagline(str3);
        realmSet$highlights(realmList);
        realmSet$logo(fileData);
        realmSet$background(fileData2);
        realmSet$accentColor(str4);
        realmSet$summary(str5);
        realmSet$description(str6);
        realmSet$delivery(str7);
        realmSet$contacts(realmList2);
        realmSet$images(realmList3);
    }
}
