package p035ru.unicorn.ujin.view.fragments.searchFilter;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Flat;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R*\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u0006("}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListResponseData;", "", "token", "", "apartmentList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/realm/Flat;", "Lkotlin/collections/ArrayList;", "count", "", "ending", "root", "filterData", "Lru/unicorn/ujin/view/fragments/searchFilter/FilterData;", "complexTitle", "(Ljava/lang/String;Ljava/util/ArrayList;ILjava/lang/String;Ljava/lang/String;Lru/unicorn/ujin/view/fragments/searchFilter/FilterData;Ljava/lang/String;)V", "getApartmentList", "()Ljava/util/ArrayList;", "getComplexTitle", "()Ljava/lang/String;", "getCount", "()I", "getEnding", "getFilterData", "()Lru/unicorn/ujin/view/fragments/searchFilter/FilterData;", "getRoot", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.ApartmentListResponseData */
/* compiled from: ApartmentListResponse.kt */
public final class ApartmentListResponseData {
    @SerializedName("flat")
    private final ArrayList<Flat> apartmentList;
    @SerializedName("complex_title")
    private final String complexTitle;
    private final int count;
    private final String ending;
    @SerializedName("filter_data")
    private final FilterData filterData;
    private final String root;
    private final String token;

    public static /* synthetic */ ApartmentListResponseData copy$default(ApartmentListResponseData apartmentListResponseData, String str, ArrayList<Flat> arrayList, int i, String str2, String str3, FilterData filterData2, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = apartmentListResponseData.token;
        }
        if ((i2 & 2) != 0) {
            arrayList = apartmentListResponseData.apartmentList;
        }
        ArrayList<Flat> arrayList2 = arrayList;
        if ((i2 & 4) != 0) {
            i = apartmentListResponseData.count;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = apartmentListResponseData.ending;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = apartmentListResponseData.root;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            filterData2 = apartmentListResponseData.filterData;
        }
        FilterData filterData3 = filterData2;
        if ((i2 & 64) != 0) {
            str4 = apartmentListResponseData.complexTitle;
        }
        return apartmentListResponseData.copy(str, arrayList2, i3, str5, str6, filterData3, str4);
    }

    public final String component1() {
        return this.token;
    }

    public final ArrayList<Flat> component2() {
        return this.apartmentList;
    }

    public final int component3() {
        return this.count;
    }

    public final String component4() {
        return this.ending;
    }

    public final String component5() {
        return this.root;
    }

    public final FilterData component6() {
        return this.filterData;
    }

    public final String component7() {
        return this.complexTitle;
    }

    public final ApartmentListResponseData copy(String str, ArrayList<Flat> arrayList, int i, String str2, String str3, FilterData filterData2, String str4) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "ending");
        Intrinsics.checkNotNullParameter(str3, "root");
        Intrinsics.checkNotNullParameter(filterData2, "filterData");
        String str5 = str4;
        Intrinsics.checkNotNullParameter(str5, "complexTitle");
        return new ApartmentListResponseData(str, arrayList, i, str2, str3, filterData2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApartmentListResponseData)) {
            return false;
        }
        ApartmentListResponseData apartmentListResponseData = (ApartmentListResponseData) obj;
        return Intrinsics.areEqual((Object) this.token, (Object) apartmentListResponseData.token) && Intrinsics.areEqual((Object) this.apartmentList, (Object) apartmentListResponseData.apartmentList) && this.count == apartmentListResponseData.count && Intrinsics.areEqual((Object) this.ending, (Object) apartmentListResponseData.ending) && Intrinsics.areEqual((Object) this.root, (Object) apartmentListResponseData.root) && Intrinsics.areEqual((Object) this.filterData, (Object) apartmentListResponseData.filterData) && Intrinsics.areEqual((Object) this.complexTitle, (Object) apartmentListResponseData.complexTitle);
    }

    public int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<Flat> arrayList = this.apartmentList;
        int hashCode2 = (((hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31) + Integer.valueOf(this.count).hashCode()) * 31;
        String str2 = this.ending;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.root;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        FilterData filterData2 = this.filterData;
        int hashCode5 = (hashCode4 + (filterData2 != null ? filterData2.hashCode() : 0)) * 31;
        String str4 = this.complexTitle;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "ApartmentListResponseData(token=" + this.token + ", apartmentList=" + this.apartmentList + ", count=" + this.count + ", ending=" + this.ending + ", root=" + this.root + ", filterData=" + this.filterData + ", complexTitle=" + this.complexTitle + ")";
    }

    public ApartmentListResponseData(String str, ArrayList<Flat> arrayList, int i, String str2, String str3, FilterData filterData2, String str4) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "ending");
        Intrinsics.checkNotNullParameter(str3, "root");
        Intrinsics.checkNotNullParameter(filterData2, "filterData");
        Intrinsics.checkNotNullParameter(str4, "complexTitle");
        this.token = str;
        this.apartmentList = arrayList;
        this.count = i;
        this.ending = str2;
        this.root = str3;
        this.filterData = filterData2;
        this.complexTitle = str4;
    }

    public final String getToken() {
        return this.token;
    }

    public final ArrayList<Flat> getApartmentList() {
        return this.apartmentList;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getEnding() {
        return this.ending;
    }

    public final String getRoot() {
        return this.root;
    }

    public final FilterData getFilterData() {
        return this.filterData;
    }

    public final String getComplexTitle() {
        return this.complexTitle;
    }
}
