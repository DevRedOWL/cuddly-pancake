package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingList;", "", "complexes", "", "Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingDTO;", "(Ljava/util/List;)V", "getComplexes", "()Ljava/util/List;", "setComplexes", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingList */
/* compiled from: SearchBuildingDTO.kt */
public final class SearchBuildingList {
    private List<? extends SearchBuildingDTO> complexes;

    public static /* synthetic */ SearchBuildingList copy$default(SearchBuildingList searchBuildingList, List<? extends SearchBuildingDTO> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchBuildingList.complexes;
        }
        return searchBuildingList.copy(list);
    }

    public final List<SearchBuildingDTO> component1() {
        return this.complexes;
    }

    public final SearchBuildingList copy(List<? extends SearchBuildingDTO> list) {
        Intrinsics.checkNotNullParameter(list, "complexes");
        return new SearchBuildingList(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SearchBuildingList) && Intrinsics.areEqual((Object) this.complexes, (Object) ((SearchBuildingList) obj).complexes);
        }
        return true;
    }

    public int hashCode() {
        List<? extends SearchBuildingDTO> list = this.complexes;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "SearchBuildingList(complexes=" + this.complexes + ")";
    }

    public SearchBuildingList(List<? extends SearchBuildingDTO> list) {
        Intrinsics.checkNotNullParameter(list, "complexes");
        this.complexes = list;
    }

    public final List<SearchBuildingDTO> getComplexes() {
        return this.complexes;
    }

    public final void setComplexes(List<? extends SearchBuildingDTO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.complexes = list;
    }
}
