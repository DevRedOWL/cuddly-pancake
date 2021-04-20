package p035ru.unicorn.ujin.view.fragments.searchFilter;

import java.util.ArrayList;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.realm.Flat;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterRemoteRepository$requestApartmentList$1 */
/* compiled from: SearchFilterRemoteRepository.kt */
final class SearchFilterRemoteRepository$requestApartmentList$1<T> implements Consumer<ApartmentListResponse> {
    final /* synthetic */ SearchFilterRemoteRepository this$0;

    SearchFilterRemoteRepository$requestApartmentList$1(SearchFilterRemoteRepository searchFilterRemoteRepository) {
        this.this$0 = searchFilterRemoteRepository;
    }

    public final void accept(ApartmentListResponse apartmentListResponse) {
        String str;
        FilterData filterData;
        FilterData filterData2;
        FilterData filterData3;
        FilterData filterData4;
        FilterData filterData5;
        FilterData filterData6;
        FilterData filterData7;
        PublishSubject<ApartmentListEvent> apartmentListSubject = this.this$0.getApartmentListSubject();
        boolean z = apartmentListResponse.getError() == 0;
        String message = apartmentListResponse.getMessage();
        ApartmentListResponseData data = apartmentListResponse.getData();
        ArrayList<Flat> apartmentList = data != null ? data.getApartmentList() : null;
        if (apartmentListResponse.getData() != null) {
            StringBuilder sb = new StringBuilder();
            ApartmentListResponseData data2 = apartmentListResponse.getData();
            sb.append((data2 != null ? Integer.valueOf(data2.getCount()) : null).intValue());
            sb.append(' ');
            ApartmentListResponseData data3 = apartmentListResponse.getData();
            sb.append(data3 != null ? data3.getRoot() : null);
            ApartmentListResponseData data4 = apartmentListResponse.getData();
            sb.append(data4 != null ? data4.getEnding() : null);
            str = sb.toString();
        } else {
            str = "";
        }
        String str2 = str;
        ApartmentListResponseData data5 = apartmentListResponse.getData();
        Integer valueOf = (data5 == null || (filterData7 = data5.getFilterData()) == null) ? null : Integer.valueOf(filterData7.getSquareMin());
        ApartmentListResponseData data6 = apartmentListResponse.getData();
        Integer valueOf2 = (data6 == null || (filterData6 = data6.getFilterData()) == null) ? null : Integer.valueOf(filterData6.getSquareMax());
        ApartmentListResponseData data7 = apartmentListResponse.getData();
        Integer valueOf3 = (data7 == null || (filterData5 = data7.getFilterData()) == null) ? null : Integer.valueOf(filterData5.getFloorMin());
        ApartmentListResponseData data8 = apartmentListResponse.getData();
        Integer valueOf4 = (data8 == null || (filterData4 = data8.getFilterData()) == null) ? null : Integer.valueOf(filterData4.getFloorMax());
        ApartmentListResponseData data9 = apartmentListResponse.getData();
        Integer valueOf5 = (data9 == null || (filterData3 = data9.getFilterData()) == null) ? null : Integer.valueOf(filterData3.getPriceMin());
        ApartmentListResponseData data10 = apartmentListResponse.getData();
        Integer valueOf6 = (data10 == null || (filterData2 = data10.getFilterData()) == null) ? null : Integer.valueOf(filterData2.getPriceMax());
        ApartmentListResponseData data11 = apartmentListResponse.getData();
        ArrayList<String> roomCountInfo = (data11 == null || (filterData = data11.getFilterData()) == null) ? null : filterData.getRoomCountInfo();
        ApartmentListResponseData data12 = apartmentListResponse.getData();
        apartmentListSubject.onNext(new ApartmentListEvent(z, message, apartmentList, str2, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, roomCountInfo, data12 != null ? data12.getComplexTitle() : null));
    }
}
