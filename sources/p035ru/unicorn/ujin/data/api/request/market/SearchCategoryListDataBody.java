package p035ru.unicorn.ujin.data.api.request.market;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/market/SearchCategoryListDataBody;", "", "search", "", "(Ljava/lang/String;)V", "getSearch", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.market.SearchCategoryListDataBody */
/* compiled from: SearchCategoryListBody.kt */
public final class SearchCategoryListDataBody {
    private final String search;

    public static /* synthetic */ SearchCategoryListDataBody copy$default(SearchCategoryListDataBody searchCategoryListDataBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchCategoryListDataBody.search;
        }
        return searchCategoryListDataBody.copy(str);
    }

    public final String component1() {
        return this.search;
    }

    public final SearchCategoryListDataBody copy(String str) {
        return new SearchCategoryListDataBody(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SearchCategoryListDataBody) && Intrinsics.areEqual((Object) this.search, (Object) ((SearchCategoryListDataBody) obj).search);
        }
        return true;
    }

    public int hashCode() {
        String str = this.search;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "SearchCategoryListDataBody(search=" + this.search + ")";
    }

    public SearchCategoryListDataBody(String str) {
        this.search = str;
    }

    public final String getSearch() {
        return this.search;
    }
}
