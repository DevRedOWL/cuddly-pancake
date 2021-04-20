package p035ru.unicorn.ujin.data.api.request.market;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo51343d2 = {"Lru/unicorn/ujin/data/api/request/market/CompanyDataBody;", "", "companies", "", "", "(Ljava/util/List;)V", "getCompanies", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.api.request.market.CompanyDataBody */
/* compiled from: CompanyBody.kt */
public final class CompanyDataBody {
    private final List<String> companies;

    public static /* synthetic */ CompanyDataBody copy$default(CompanyDataBody companyDataBody, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = companyDataBody.companies;
        }
        return companyDataBody.copy(list);
    }

    public final List<String> component1() {
        return this.companies;
    }

    public final CompanyDataBody copy(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "companies");
        return new CompanyDataBody(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CompanyDataBody) && Intrinsics.areEqual((Object) this.companies, (Object) ((CompanyDataBody) obj).companies);
        }
        return true;
    }

    public int hashCode() {
        List<String> list = this.companies;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "CompanyDataBody(companies=" + this.companies + ")";
    }

    public CompanyDataBody(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "companies");
        this.companies = list;
    }

    public final List<String> getCompanies() {
        return this.companies;
    }
}
