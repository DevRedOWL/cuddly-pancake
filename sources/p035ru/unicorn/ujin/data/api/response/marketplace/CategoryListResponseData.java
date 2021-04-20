package p035ru.unicorn.ujin.data.api.response.marketplace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.LinksData;
import p035ru.unicorn.ujin.data.realm.MetaData;
import p035ru.unicorn.ujin.data.realm.marketplace.Category;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/response/marketplace/CategoryListResponseData;", "", "categories", "Lio/realm/RealmList;", "Lru/unicorn/ujin/data/realm/marketplace/Category;", "links", "Lru/unicorn/ujin/data/realm/LinksData;", "meta", "Lru/unicorn/ujin/data/realm/MetaData;", "(Lio/realm/RealmList;Lru/unicorn/ujin/data/realm/LinksData;Lru/unicorn/ujin/data/realm/MetaData;)V", "getCategories", "()Lio/realm/RealmList;", "getLinks", "()Lru/unicorn/ujin/data/realm/LinksData;", "getMeta", "()Lru/unicorn/ujin/data/realm/MetaData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.response.marketplace.CategoryListResponseData */
/* compiled from: CategoryListResponse.kt */
public final class CategoryListResponseData {
    private final RealmList<Category> categories;
    private final LinksData links;
    private final MetaData meta;

    public static /* synthetic */ CategoryListResponseData copy$default(CategoryListResponseData categoryListResponseData, RealmList<Category> realmList, LinksData linksData, MetaData metaData, int i, Object obj) {
        if ((i & 1) != 0) {
            realmList = categoryListResponseData.categories;
        }
        if ((i & 2) != 0) {
            linksData = categoryListResponseData.links;
        }
        if ((i & 4) != 0) {
            metaData = categoryListResponseData.meta;
        }
        return categoryListResponseData.copy(realmList, linksData, metaData);
    }

    public final RealmList<Category> component1() {
        return this.categories;
    }

    public final LinksData component2() {
        return this.links;
    }

    public final MetaData component3() {
        return this.meta;
    }

    public final CategoryListResponseData copy(RealmList<Category> realmList, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(linksData, "links");
        Intrinsics.checkNotNullParameter(metaData, "meta");
        return new CategoryListResponseData(realmList, linksData, metaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryListResponseData)) {
            return false;
        }
        CategoryListResponseData categoryListResponseData = (CategoryListResponseData) obj;
        return Intrinsics.areEqual((Object) this.categories, (Object) categoryListResponseData.categories) && Intrinsics.areEqual((Object) this.links, (Object) categoryListResponseData.links) && Intrinsics.areEqual((Object) this.meta, (Object) categoryListResponseData.meta);
    }

    public int hashCode() {
        RealmList<Category> realmList = this.categories;
        int i = 0;
        int hashCode = (realmList != null ? realmList.hashCode() : 0) * 31;
        LinksData linksData = this.links;
        int hashCode2 = (hashCode + (linksData != null ? linksData.hashCode() : 0)) * 31;
        MetaData metaData = this.meta;
        if (metaData != null) {
            i = metaData.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "CategoryListResponseData(categories=" + this.categories + ", links=" + this.links + ", meta=" + this.meta + ")";
    }

    public CategoryListResponseData(RealmList<Category> realmList, LinksData linksData, MetaData metaData) {
        Intrinsics.checkNotNullParameter(linksData, "links");
        Intrinsics.checkNotNullParameter(metaData, "meta");
        this.categories = realmList;
        this.links = linksData;
        this.meta = metaData;
    }

    public final RealmList<Category> getCategories() {
        return this.categories;
    }

    public final LinksData getLinks() {
        return this.links;
    }

    public final MetaData getMeta() {
        return this.meta;
    }
}
