package p035ru.unicorn.ujin.data.api.response.marketplace;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p035ru.unicorn.ujin.data.realm.marketplace.CategoryItem;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\fHÆ\u0003JU\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/CategoryResponse;", "", "error", "", "message", "", "data", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "id", "title", "parent", "children", "Lio/realm/RealmList;", "(ILjava/lang/String;Lru/unicorn/ujin/data/realm/marketplace/Category;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/realm/RealmList;)V", "getChildren", "()Lio/realm/RealmList;", "getData", "()Lru/unicorn/ujin/data/realm/marketplace/Category;", "getError", "()I", "getId", "()Ljava/lang/String;", "getMessage", "getParent", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.CategoryResponse */
/* compiled from: CategoryResponse.kt */
public final class CategoryResponse {
    private final RealmList<Category> children;
    private final Category data;
    private final int error;
    @SerializedName("category_id")

    /* renamed from: id */
    private final String f6618id;
    private final String message;
    @SerializedName("category_parent")
    private final String parent;
    @SerializedName("category_title")
    private final String title;

    public static /* synthetic */ CategoryResponse copy$default(CategoryResponse categoryResponse, int i, String str, Category category, String str2, String str3, String str4, RealmList<Category> realmList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = categoryResponse.error;
        }
        if ((i2 & 2) != 0) {
            str = categoryResponse.message;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            category = categoryResponse.data;
        }
        Category category2 = category;
        if ((i2 & 8) != 0) {
            str2 = categoryResponse.f6618id;
        }
        String str6 = str2;
        if ((i2 & 16) != 0) {
            str3 = categoryResponse.title;
        }
        String str7 = str3;
        if ((i2 & 32) != 0) {
            str4 = categoryResponse.parent;
        }
        String str8 = str4;
        if ((i2 & 64) != 0) {
            realmList = categoryResponse.children;
        }
        return categoryResponse.copy(i, str5, category2, str6, str7, str8, realmList);
    }

    public final int component1() {
        return this.error;
    }

    public final String component2() {
        return this.message;
    }

    public final Category component3() {
        return this.data;
    }

    public final String component4() {
        return this.f6618id;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.parent;
    }

    public final RealmList<Category> component7() {
        return this.children;
    }

    public final CategoryResponse copy(int i, String str, Category category, String str2, String str3, String str4, RealmList<Category> realmList) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(category, "data");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, CategoryItem.Fields.parent);
        RealmList<Category> realmList2 = realmList;
        Intrinsics.checkNotNullParameter(realmList2, "children");
        return new CategoryResponse(i, str, category, str2, str3, str4, realmList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryResponse)) {
            return false;
        }
        CategoryResponse categoryResponse = (CategoryResponse) obj;
        return this.error == categoryResponse.error && Intrinsics.areEqual((Object) this.message, (Object) categoryResponse.message) && Intrinsics.areEqual((Object) this.data, (Object) categoryResponse.data) && Intrinsics.areEqual((Object) this.f6618id, (Object) categoryResponse.f6618id) && Intrinsics.areEqual((Object) this.title, (Object) categoryResponse.title) && Intrinsics.areEqual((Object) this.parent, (Object) categoryResponse.parent) && Intrinsics.areEqual((Object) this.children, (Object) categoryResponse.children);
    }

    public int hashCode() {
        int hashCode = Integer.valueOf(this.error).hashCode() * 31;
        String str = this.message;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Category category = this.data;
        int hashCode3 = (hashCode2 + (category != null ? category.hashCode() : 0)) * 31;
        String str2 = this.f6618id;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.parent;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        RealmList<Category> realmList = this.children;
        if (realmList != null) {
            i = realmList.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        return "CategoryResponse(error=" + this.error + ", message=" + this.message + ", data=" + this.data + ", id=" + this.f6618id + ", title=" + this.title + ", parent=" + this.parent + ", children=" + this.children + ")";
    }

    public CategoryResponse(int i, String str, Category category, String str2, String str3, String str4, RealmList<Category> realmList) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(category, "data");
        Intrinsics.checkNotNullParameter(str2, "id");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, CategoryItem.Fields.parent);
        Intrinsics.checkNotNullParameter(realmList, "children");
        this.error = i;
        this.message = str;
        this.data = category;
        this.f6618id = str2;
        this.title = str3;
        this.parent = str4;
        this.children = realmList;
    }

    public final int getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Category getData() {
        return this.data;
    }

    public final String getId() {
        return this.f6618id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getParent() {
        return this.parent;
    }

    public final RealmList<Category> getChildren() {
        return this.children;
    }
}
