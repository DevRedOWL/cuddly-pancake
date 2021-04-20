package p035ru.unicorn.ujin.view.fragments.searchFilter;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.viewModel.SingleLiveEvent;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0014J\u0001\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020!2\b\u0010/\u001a\u0004\u0018\u00010!2\b\u00100\u001a\u0004\u0018\u00010!J\u000e\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020!J\u0006\u00103\u001a\u00020\u001eJ\u000e\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020!J\u000e\u00106\u001a\u00020\u001e2\u0006\u00102\u001a\u00020!R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007¨\u00067"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/searchFilter/SearchFilterViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "apartmentListLiveData", "Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListEvent;", "getApartmentListLiveData", "()Lru/unicorn/ujin/viewModel/SingleLiveEvent;", "buildingListLiveData", "Lru/unicorn/ujin/view/fragments/searchFilter/BuildingListEvent;", "getBuildingListLiveData", "cityListLiveData", "Lru/unicorn/ujin/view/fragments/searchFilter/CityListEvent;", "getCityListLiveData", "complexListLiveData", "Lru/unicorn/ujin/view/fragments/searchFilter/ComplexListEvent;", "getComplexListLiveData", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "remoteRepository", "Lru/unicorn/ujin/view/fragments/searchFilter/SearchFilterRemoteRepository;", "getRemoteRepository", "()Lru/unicorn/ujin/view/fragments/searchFilter/SearchFilterRemoteRepository;", "sectionListLiveData", "Lru/unicorn/ujin/view/fragments/searchFilter/SectionListEvent;", "getSectionListLiveData", "showProgressLiveData", "", "getShowProgressLiveData", "onCleared", "", "requestApartmentList", "complexId", "", "studia", "room1", "room2", "room3", "room4plus", "buildingId", "sectionId", "squareMin", "squareMax", "floorMin", "floorMax", "priceMin", "priceMax", "actionStock", "finishedApartments", "requestBuildingList", "id", "requestCityList", "requestComplexList", "cityId", "requestSectionList", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterViewModel */
/* compiled from: SearchFilterViewModel.kt */
public final class SearchFilterViewModel extends ViewModel {
    private final SingleLiveEvent<ApartmentListEvent> apartmentListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<BuildingListEvent> buildingListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<CityListEvent> cityListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ComplexListEvent> complexListLiveData = new SingleLiveEvent<>();
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    private final SearchFilterRemoteRepository remoteRepository = new SearchFilterRemoteRepository();
    private final SingleLiveEvent<SectionListEvent> sectionListLiveData = new SingleLiveEvent<>();
    private final SingleLiveEvent<Boolean> showProgressLiveData = new SingleLiveEvent<>();

    public SearchFilterViewModel() {
        this.compositeDisposable.addAll(this.remoteRepository.getComplexListSubject().subscribe(new Consumer<ComplexListEvent>(this) {
            final /* synthetic */ SearchFilterViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ComplexListEvent complexListEvent) {
                this.this$0.getComplexListLiveData().setValue(complexListEvent);
            }
        }), this.remoteRepository.getCityListSubject().subscribe(new Consumer<CityListEvent>(this) {
            final /* synthetic */ SearchFilterViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(CityListEvent cityListEvent) {
                this.this$0.getCityListLiveData().setValue(cityListEvent);
            }
        }), this.remoteRepository.getBuildingListSubject().subscribe(new Consumer<BuildingListEvent>(this) {
            final /* synthetic */ SearchFilterViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(BuildingListEvent buildingListEvent) {
                this.this$0.getBuildingListLiveData().setValue(buildingListEvent);
            }
        }), this.remoteRepository.getSectionListSubject().subscribe(new Consumer<SectionListEvent>(this) {
            final /* synthetic */ SearchFilterViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(SectionListEvent sectionListEvent) {
                this.this$0.getSectionListLiveData().setValue(sectionListEvent);
            }
        }), this.remoteRepository.getApartmentListSubject().subscribe(new Consumer<ApartmentListEvent>(this) {
            final /* synthetic */ SearchFilterViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final void accept(ApartmentListEvent apartmentListEvent) {
                SearchFilterViewModel searchFilterViewModel = this.this$0;
                searchFilterViewModel.getShowProgressLiveData().setValue(false);
                searchFilterViewModel.getApartmentListLiveData().setValue(apartmentListEvent);
            }
        }));
    }

    public final SearchFilterRemoteRepository getRemoteRepository() {
        return this.remoteRepository;
    }

    public final SingleLiveEvent<CityListEvent> getCityListLiveData() {
        return this.cityListLiveData;
    }

    public final SingleLiveEvent<ComplexListEvent> getComplexListLiveData() {
        return this.complexListLiveData;
    }

    public final SingleLiveEvent<BuildingListEvent> getBuildingListLiveData() {
        return this.buildingListLiveData;
    }

    public final SingleLiveEvent<SectionListEvent> getSectionListLiveData() {
        return this.sectionListLiveData;
    }

    public final SingleLiveEvent<ApartmentListEvent> getApartmentListLiveData() {
        return this.apartmentListLiveData;
    }

    public final SingleLiveEvent<Boolean> getShowProgressLiveData() {
        return this.showProgressLiveData;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        this.compositeDisposable.dispose();
        super.onCleared();
    }

    public final void requestCityList() {
        this.showProgressLiveData.setValue(true);
        this.remoteRepository.requestCityList();
    }

    public final void requestComplexList(String str) {
        Intrinsics.checkNotNullParameter(str, Complex.Fields.cityId);
        this.showProgressLiveData.setValue(true);
        this.remoteRepository.requestSearchFilter(str);
    }

    public final void requestBuildingList(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.showProgressLiveData.setValue(true);
        this.remoteRepository.requestBuildingList(str);
    }

    public final void requestSectionList(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.showProgressLiveData.setValue(true);
        this.remoteRepository.requestSectionList(str);
    }

    public final void requestApartmentList(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        String str17 = str;
        Intrinsics.checkNotNullParameter(str17, "complexId");
        Intrinsics.checkNotNullParameter(str2, "studia");
        Intrinsics.checkNotNullParameter(str3, "room1");
        Intrinsics.checkNotNullParameter(str4, "room2");
        Intrinsics.checkNotNullParameter(str5, "room3");
        Intrinsics.checkNotNullParameter(str6, "room4plus");
        Intrinsics.checkNotNullParameter(str7, "buildingId");
        Intrinsics.checkNotNullParameter(str8, "sectionId");
        Intrinsics.checkNotNullParameter(str9, "squareMin");
        Intrinsics.checkNotNullParameter(str10, "squareMax");
        Intrinsics.checkNotNullParameter(str11, "floorMin");
        Intrinsics.checkNotNullParameter(str12, "floorMax");
        Intrinsics.checkNotNullParameter(str13, "priceMin");
        Intrinsics.checkNotNullParameter(str14, "priceMax");
        this.showProgressLiveData.setValue(true);
        this.remoteRepository.requestApartmentList(str17, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }
}
