package p035ru.unicorn.ujin.data.realm.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.FileData;
import p035ru.unicorn.ujin.market.search.SearchResultType;
import p046io.realm.C4608x56dd70a5;
import p046io.realm.RealmObject;
import p046io.realm.annotations.PrimaryKey;
import p046io.realm.internal.RealmObjectProxy;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001cB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Category;", "Lio/realm/RealmObject;", "Lru/unicorn/ujin/market/search/SearchResultType;", "id", "", "title", "icon", "Lru/unicorn/ujin/data/realm/FileData;", "hasContent", "", "(Ljava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/data/realm/FileData;Ljava/lang/Boolean;)V", "getHasContent", "()Ljava/lang/Boolean;", "setHasContent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getIcon", "()Lru/unicorn/ujin/data/realm/FileData;", "setIcon", "(Lru/unicorn/ujin/data/realm/FileData;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getTitle", "setTitle", "getType", "", "Fields", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.realm.marketplace.Category */
/* compiled from: Category.kt */
public class Category extends RealmObject implements SearchResultType, C4608x56dd70a5 {
    @SerializedName("has_content")
    private Boolean hasContent;
    private FileData icon;
    @PrimaryKey

    /* renamed from: id */
    private String f6675id;
    private String title;

    public Category() {
        this((String) null, (String) null, (FileData) null, (Boolean) null, 15, (DefaultConstructorMarker) null);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
    }

    public int getType() {
        return 1;
    }

    public Boolean realmGet$hasContent() {
        return this.hasContent;
    }

    public FileData realmGet$icon() {
        return this.icon;
    }

    public String realmGet$id() {
        return this.f6675id;
    }

    public String realmGet$title() {
        return this.title;
    }

    public void realmSet$hasContent(Boolean bool) {
        this.hasContent = bool;
    }

    public void realmSet$icon(FileData fileData) {
        this.icon = fileData;
    }

    public void realmSet$id(String str) {
        this.f6675id = str;
    }

    public void realmSet$title(String str) {
        this.title = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Category(String str, String str2, FileData fileData, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : fileData, (i & 8) != 0 ? null : bool);
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
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

    public final FileData getIcon() {
        return realmGet$icon();
    }

    public final void setIcon(FileData fileData) {
        realmSet$icon(fileData);
    }

    public final Boolean getHasContent() {
        return realmGet$hasContent();
    }

    public final void setHasContent(Boolean bool) {
        realmSet$hasContent(bool);
    }

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo51343d2 = {"Lru/unicorn/ujin/data/realm/marketplace/Category$Fields;", "", "()V", "id", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.data.realm.marketplace.Category$Fields */
    /* compiled from: Category.kt */
    public static final class Fields {
        public static final Fields INSTANCE = new Fields();

        /* renamed from: id */
        public static final String f6676id = "id";

        private Fields() {
        }
    }

    public Category(String str, String str2, FileData fileData, Boolean bool) {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(str);
        realmSet$title(str2);
        realmSet$icon(fileData);
        realmSet$hasContent(bool);
    }
}
