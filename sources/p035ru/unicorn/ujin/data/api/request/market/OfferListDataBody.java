package p035ru.unicorn.ujin.data.api.request.market;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J5\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/market/OfferListDataBody;", "", "categories", "", "", "companies", "search", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getCategories", "()Ljava/util/List;", "getCompanies", "getSearch", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.market.OfferListDataBody */
/* compiled from: OfferListBody.kt */
public final class OfferListDataBody {
    private final List<String> categories;
    private final List<String> companies;
    private final String search;

    public static /* synthetic */ OfferListDataBody copy$default(OfferListDataBody offerListDataBody, List<String> list, List<String> list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = offerListDataBody.categories;
        }
        if ((i & 2) != 0) {
            list2 = offerListDataBody.companies;
        }
        if ((i & 4) != 0) {
            str = offerListDataBody.search;
        }
        return offerListDataBody.copy(list, list2, str);
    }

    public final List<String> component1() {
        return this.categories;
    }

    public final List<String> component2() {
        return this.companies;
    }

    public final String component3() {
        return this.search;
    }

    public final OfferListDataBody copy(List<String> list, List<String> list2, String str) {
        Intrinsics.checkNotNullParameter(list, "categories");
        Intrinsics.checkNotNullParameter(list2, "companies");
        return new OfferListDataBody(list, list2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferListDataBody)) {
            return false;
        }
        OfferListDataBody offerListDataBody = (OfferListDataBody) obj;
        return Intrinsics.areEqual((Object) this.categories, (Object) offerListDataBody.categories) && Intrinsics.areEqual((Object) this.companies, (Object) offerListDataBody.companies) && Intrinsics.areEqual((Object) this.search, (Object) offerListDataBody.search);
    }

    public int hashCode() {
        List<String> list = this.categories;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.companies;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.search;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "OfferListDataBody(categories=" + this.categories + ", companies=" + this.companies + ", search=" + this.search + ")";
    }

    public OfferListDataBody(List<String> list, List<String> list2, String str) {
        Intrinsics.checkNotNullParameter(list, "categories");
        Intrinsics.checkNotNullParameter(list2, "companies");
        this.categories = list;
        this.companies = list2;
        this.search = str;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final List<String> getCompanies() {
        return this.companies;
    }

    public final String getSearch() {
        return this.search;
    }
}
