package p035ru.unicorn.ujin.data.realm.marketplace;

import kotlin.Metadata;
import p046io.realm.C4607xaf5ee912;
import p046io.realm.RealmList;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001cBS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/CategoryItem;", "Lio/realm/RealmObject;", "id", "", "title", "parent", "icon", "contentType", "children", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;)V", "getChildren", "()Lio/realm/RealmList;", "setChildren", "(Lio/realm/RealmList;)V", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getId", "setId", "getParent", "setParent", "getTitle", "setTitle", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.CategoryItem */
/* compiled from: CategoryItem.kt */
public class CategoryItem extends RealmObject implements C4607xaf5ee912 {
    private RealmList<Category> children;
    private String contentType;
    private String icon;
    @PrimaryKey

    /* renamed from: id */
    private String f6677id;
    private String parent;
    private String title;

    public CategoryItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (RealmList) null, 63, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public RealmList realmGet$children() {
        return this.children;
    }

    public String realmGet$contentType() {
        return this.contentType;
    }

    public String realmGet$icon() {
        return this.icon;
    }

    public String realmGet$id() {
        return this.f6677id;
    }

    public String realmGet$parent() {
        return this.parent;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$children(RealmList realmList) {
        this.children = realmList;
    }

    public void realmSet$contentType(String str) {
        this.contentType = str;
    }

    public void realmSet$icon(String str) {
        this.icon = str;
    }

    public void realmSet$id(String str) {
        this.f6677id = str;
    }

    public void realmSet$parent(String str) {
        this.parent = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CategoryItem(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, p046io.realm.RealmList r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
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
            java.lang.String r9 = (java.lang.String) r9
        L_0x0027:
            r3 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002f
            r10 = r0
            io.realm.RealmList r10 = (p046io.realm.RealmList) r10
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
        throw new UnsupportedOperationException("Method not decompiled: p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, io.realm.RealmList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
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

    public final String getParent() {
        return realmGet$parent();
    }

    public final void setParent(String str) {
        realmSet$parent(str);
    }

    public final String getIcon() {
        return realmGet$icon();
    }

    public final void setIcon(String str) {
        realmSet$icon(str);
    }

    public final String getContentType() {
        return realmGet$contentType();
    }

    public final void setContentType(String str) {
        realmSet$contentType(str);
    }

    public final RealmList<Category> getChildren() {
        return realmGet$children();
    }

    public final void setChildren(RealmList<Category> realmList) {
        realmSet$children(realmList);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/CategoryItem$Fields;", "", "()V", "id", "", "parent", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.CategoryItem$Fields */
    /* compiled from: CategoryItem.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6678id = "id";
        public static final String parent = "parent";

        private Fields() {
        }
    }

    public CategoryItem(String str, String str2, String str3, String str4, String str5, RealmList<Category> realmList) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$title(str2);
        realmSet$parent(str3);
        realmSet$icon(str4);
        realmSet$contentType(str5);
        realmSet$children(realmList);
    }
}
