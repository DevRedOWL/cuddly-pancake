package p035ru.unicorn.ujin.view.fragments.searchFilter;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fHÆ\u0003J_\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR&\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006$"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/searchFilter/FilterData;", "", "squareMin", "", "squareMax", "floorMin", "floorMax", "priceMin", "priceMax", "roomCountInfo", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(IIIIIILjava/util/ArrayList;)V", "getFloorMax", "()I", "getFloorMin", "getPriceMax", "getPriceMin", "getRoomCountInfo", "()Ljava/util/ArrayList;", "getSquareMax", "getSquareMin", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.FilterData */
/* compiled from: ApartmentListResponse.kt */
public final class FilterData {
    @SerializedName("floor_max")
    private final int floorMax;
    @SerializedName("floor_min")
    private final int floorMin;
    @SerializedName("price_max")
    private final int priceMax;
    @SerializedName("price_min")
    private final int priceMin;
    @SerializedName("room_info")
    private final ArrayList<String> roomCountInfo;
    @SerializedName("square_max")
    private final int squareMax;
    @SerializedName("square_min")
    private final int squareMin;

    public static /* synthetic */ FilterData copy$default(FilterData filterData, int i, int i2, int i3, int i4, int i5, int i6, ArrayList<String> arrayList, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = filterData.squareMin;
        }
        if ((i7 & 2) != 0) {
            i2 = filterData.squareMax;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = filterData.floorMin;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            i4 = filterData.floorMax;
        }
        int i10 = i4;
        if ((i7 & 16) != 0) {
            i5 = filterData.priceMin;
        }
        int i11 = i5;
        if ((i7 & 32) != 0) {
            i6 = filterData.priceMax;
        }
        int i12 = i6;
        if ((i7 & 64) != 0) {
            arrayList = filterData.roomCountInfo;
        }
        return filterData.copy(i, i8, i9, i10, i11, i12, arrayList);
    }

    public final int component1() {
        return this.squareMin;
    }

    public final int component2() {
        return this.squareMax;
    }

    public final int component3() {
        return this.floorMin;
    }

    public final int component4() {
        return this.floorMax;
    }

    public final int component5() {
        return this.priceMin;
    }

    public final int component6() {
        return this.priceMax;
    }

    public final ArrayList<String> component7() {
        return this.roomCountInfo;
    }

    public final FilterData copy(int i, int i2, int i3, int i4, int i5, int i6, ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList2, "roomCountInfo");
        return new FilterData(i, i2, i3, i4, i5, i6, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterData)) {
            return false;
        }
        FilterData filterData = (FilterData) obj;
        return this.squareMin == filterData.squareMin && this.squareMax == filterData.squareMax && this.floorMin == filterData.floorMin && this.floorMax == filterData.floorMax && this.priceMin == filterData.priceMin && this.priceMax == filterData.priceMax && Intrinsics.areEqual((Object) this.roomCountInfo, (Object) filterData.roomCountInfo);
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.valueOf(this.squareMin).hashCode() * 31) + Integer.valueOf(this.squareMax).hashCode()) * 31) + Integer.valueOf(this.floorMin).hashCode()) * 31) + Integer.valueOf(this.floorMax).hashCode()) * 31) + Integer.valueOf(this.priceMin).hashCode()) * 31) + Integer.valueOf(this.priceMax).hashCode()) * 31;
        ArrayList<String> arrayList = this.roomCountInfo;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public String toString() {
        return "FilterData(squareMin=" + this.squareMin + ", squareMax=" + this.squareMax + ", floorMin=" + this.floorMin + ", floorMax=" + this.floorMax + ", priceMin=" + this.priceMin + ", priceMax=" + this.priceMax + ", roomCountInfo=" + this.roomCountInfo + ")";
    }

    public FilterData(int i, int i2, int i3, int i4, int i5, int i6, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "roomCountInfo");
        this.squareMin = i;
        this.squareMax = i2;
        this.floorMin = i3;
        this.floorMax = i4;
        this.priceMin = i5;
        this.priceMax = i6;
        this.roomCountInfo = arrayList;
    }

    public final int getSquareMin() {
        return this.squareMin;
    }

    public final int getSquareMax() {
        return this.squareMax;
    }

    public final int getFloorMin() {
        return this.floorMin;
    }

    public final int getFloorMax() {
        return this.floorMax;
    }

    public final int getPriceMin() {
        return this.priceMin;
    }

    public final int getPriceMax() {
        return this.priceMax;
    }

    public final ArrayList<String> getRoomCountInfo() {
        return this.roomCountInfo;
    }
}
