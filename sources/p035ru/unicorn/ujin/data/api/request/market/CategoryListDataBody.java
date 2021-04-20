package p035ru.unicorn.ujin.data.api.request.market;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/market/CategoryListDataBody;", "", "withContentOnly", "", "parentId", "", "search", "(ZLjava/lang/String;Ljava/lang/String;)V", "getParentId", "()Ljava/lang/String;", "getSearch", "getWithContentOnly", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.market.CategoryListDataBody */
/* compiled from: CategoryListBody.kt */
public final class CategoryListDataBody {
    @SerializedName("parent_id")
    private final String parentId;
    private final String search;
    @SerializedName("with_content_only")
    private final boolean withContentOnly;

    public static /* synthetic */ CategoryListDataBody copy$default(CategoryListDataBody categoryListDataBody, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = categoryListDataBody.withContentOnly;
        }
        if ((i & 2) != 0) {
            str = categoryListDataBody.parentId;
        }
        if ((i & 4) != 0) {
            str2 = categoryListDataBody.search;
        }
        return categoryListDataBody.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.withContentOnly;
    }

    public final String component2() {
        return this.parentId;
    }

    public final String component3() {
        return this.search;
    }

    public final CategoryListDataBody copy(boolean z, String str, String str2) {
        return new CategoryListDataBody(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryListDataBody)) {
            return false;
        }
        CategoryListDataBody categoryListDataBody = (CategoryListDataBody) obj;
        return this.withContentOnly == categoryListDataBody.withContentOnly && Intrinsics.areEqual((Object) this.parentId, (Object) categoryListDataBody.parentId) && Intrinsics.areEqual((Object) this.search, (Object) categoryListDataBody.search);
    }

    public int hashCode() {
        boolean z = this.withContentOnly;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.parentId;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.search;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "CategoryListDataBody(withContentOnly=" + this.withContentOnly + ", parentId=" + this.parentId + ", search=" + this.search + ")";
    }

    public CategoryListDataBody(boolean z, String str, String str2) {
        this.withContentOnly = z;
        this.parentId = str;
        this.search = str2;
    }

    public final boolean getWithContentOnly() {
        return this.withContentOnly;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getSearch() {
        return this.search;
    }
}
