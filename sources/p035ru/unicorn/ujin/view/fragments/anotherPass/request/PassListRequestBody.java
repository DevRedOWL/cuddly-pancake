package p035ru.unicorn.ujin.view.fragments.anotherPass.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.GetFlatsResponseData;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/anotherPass/request/PassListRequestBody;", "", "filter", "Lru/unicorn/ujin/view/fragments/anotherPass/request/PassListFilterData;", "search", "", "(Lru/unicorn/ujin/view/fragments/anotherPass/request/PassListFilterData;Ljava/lang/String;)V", "getFilter", "()Lru/unicorn/ujin/view/fragments/anotherPass/request/PassListFilterData;", "setFilter", "(Lru/unicorn/ujin/view/fragments/anotherPass/request/PassListFilterData;)V", "getSearch", "()Ljava/lang/String;", "setSearch", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.anotherPass.request.PassListRequestBody */
/* compiled from: PassListRequestBody.kt */
public final class PassListRequestBody {
    private PassListFilterData filter;
    private String search;

    public static /* synthetic */ PassListRequestBody copy$default(PassListRequestBody passListRequestBody, PassListFilterData passListFilterData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            passListFilterData = passListRequestBody.filter;
        }
        if ((i & 2) != 0) {
            str = passListRequestBody.search;
        }
        return passListRequestBody.copy(passListFilterData, str);
    }

    public final PassListFilterData component1() {
        return this.filter;
    }

    public final String component2() {
        return this.search;
    }

    public final PassListRequestBody copy(PassListFilterData passListFilterData, String str) {
        Intrinsics.checkNotNullParameter(passListFilterData, GetFlatsResponseData.Fields.filter);
        Intrinsics.checkNotNullParameter(str, "search");
        return new PassListRequestBody(passListFilterData, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassListRequestBody)) {
            return false;
        }
        PassListRequestBody passListRequestBody = (PassListRequestBody) obj;
        return Intrinsics.areEqual((Object) this.filter, (Object) passListRequestBody.filter) && Intrinsics.areEqual((Object) this.search, (Object) passListRequestBody.search);
    }

    public int hashCode() {
        PassListFilterData passListFilterData = this.filter;
        int i = 0;
        int hashCode = (passListFilterData != null ? passListFilterData.hashCode() : 0) * 31;
        String str = this.search;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "PassListRequestBody(filter=" + this.filter + ", search=" + this.search + ")";
    }

    public PassListRequestBody(PassListFilterData passListFilterData, String str) {
        Intrinsics.checkNotNullParameter(passListFilterData, GetFlatsResponseData.Fields.filter);
        Intrinsics.checkNotNullParameter(str, "search");
        this.filter = passListFilterData;
        this.search = str;
    }

    public final PassListFilterData getFilter() {
        return this.filter;
    }

    public final void setFilter(PassListFilterData passListFilterData) {
        Intrinsics.checkNotNullParameter(passListFilterData, "<set-?>");
        this.filter = passListFilterData;
    }

    public final String getSearch() {
        return this.search;
    }

    public final void setSearch(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.search = str;
    }
}
