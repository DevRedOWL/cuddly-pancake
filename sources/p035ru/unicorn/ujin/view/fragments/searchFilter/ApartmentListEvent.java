package p035ru.unicorn.ujin.view.fragments.searchFilter;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Flat;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0002\u0010\u0014R%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b \u0010\u001bR%\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\"\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006&"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListEvent;", "", "success", "", "message", "", "apartmentList", "Ljava/util/ArrayList;", "Lru/unicorn/ujin/data/realm/Flat;", "Lkotlin/collections/ArrayList;", "ending", "squareMin", "", "squareMax", "floorMin", "floorMax", "priceMin", "priceMax", "roomCountArrayList", "complexTitle", "(ZLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;)V", "getApartmentList", "()Ljava/util/ArrayList;", "getComplexTitle", "()Ljava/lang/String;", "getEnding", "getFloorMax", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFloorMin", "getMessage", "getPriceMax", "getPriceMin", "getRoomCountArrayList", "getSquareMax", "getSquareMin", "getSuccess", "()Z", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.ApartmentListEvent */
/* compiled from: ApartmentListEvent.kt */
public final class ApartmentListEvent {
    private final ArrayList<Flat> apartmentList;
    private final String complexTitle;
    private final String ending;
    private final Integer floorMax;
    private final Integer floorMin;
    private final String message;
    private final Integer priceMax;
    private final Integer priceMin;
    private final ArrayList<String> roomCountArrayList;
    private final Integer squareMax;
    private final Integer squareMin;
    private final boolean success;

    public ApartmentListEvent(boolean z, String str, ArrayList<Flat> arrayList, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, ArrayList<String> arrayList2, String str3) {
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(str2, "ending");
        Intrinsics.checkNotNullParameter(str3, "complexTitle");
        this.success = z;
        this.message = str;
        this.apartmentList = arrayList;
        this.ending = str2;
        this.squareMin = num;
        this.squareMax = num2;
        this.floorMin = num3;
        this.floorMax = num4;
        this.priceMin = num5;
        this.priceMax = num6;
        this.roomCountArrayList = arrayList2;
        this.complexTitle = str3;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final ArrayList<Flat> getApartmentList() {
        return this.apartmentList;
    }

    public final String getEnding() {
        return this.ending;
    }

    public final Integer getSquareMax() {
        return this.squareMax;
    }

    public final Integer getSquareMin() {
        return this.squareMin;
    }

    public final Integer getFloorMax() {
        return this.floorMax;
    }

    public final Integer getFloorMin() {
        return this.floorMin;
    }

    public final Integer getPriceMax() {
        return this.priceMax;
    }

    public final Integer getPriceMin() {
        return this.priceMin;
    }

    public final ArrayList<String> getRoomCountArrayList() {
        return this.roomCountArrayList;
    }

    public final String getComplexTitle() {
        return this.complexTitle;
    }
}
