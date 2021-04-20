package p035ru.unicorn.ujin.data.api.request.market;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/market/CompanyListDataBody;", "", "categories", "", "", "search", "(Ljava/util/List;Ljava/lang/String;)V", "getCategories", "()Ljava/util/List;", "getSearch", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.market.CompanyListDataBody */
/* compiled from: CompanyListBody.kt */
public final class CompanyListDataBody {
    private final List<String> categories;
    private final String search;

    public static /* synthetic */ CompanyListDataBody copy$default(CompanyListDataBody companyListDataBody, List<String> list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = companyListDataBody.categories;
        }
        if ((i & 2) != 0) {
            str = companyListDataBody.search;
        }
        return companyListDataBody.copy(list, str);
    }

    public final List<String> component1() {
        return this.categories;
    }

    public final String component2() {
        return this.search;
    }

    public final CompanyListDataBody copy(List<String> list, String str) {
        Intrinsics.checkNotNullParameter(list, "categories");
        return new CompanyListDataBody(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompanyListDataBody)) {
            return false;
        }
        CompanyListDataBody companyListDataBody = (CompanyListDataBody) obj;
        return Intrinsics.areEqual((Object) this.categories, (Object) companyListDataBody.categories) && Intrinsics.areEqual((Object) this.search, (Object) companyListDataBody.search);
    }

    public int hashCode() {
        List<String> list = this.categories;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.search;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "CompanyListDataBody(categories=" + this.categories + ", search=" + this.search + ")";
    }

    public CompanyListDataBody(List<String> list, String str) {
        Intrinsics.checkNotNullParameter(list, "categories");
        this.categories = list;
        this.search = str;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final String getSearch() {
        return this.search;
    }
}
