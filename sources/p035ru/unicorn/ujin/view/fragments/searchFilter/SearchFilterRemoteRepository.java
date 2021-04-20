package p035ru.unicorn.ujin.view.fragments.searchFilter;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.Complex;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.schedulers.Schedulers;
import p046io.reactivex.subjects.PublishSubject;
import p046io.realm.Realm;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0001\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u00010\u001c2\b\u00100\u001a\u0004\u0018\u00010\u001cJ\u000e\u00101\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cJ\u0006\u00102\u001a\u00020 J\u000e\u00103\u001a\u00020 2\u0006\u00104\u001a\u00020\u001cJ\u000e\u00105\u001a\u00020 2\u0006\u0010'\u001a\u00020\u001cR5\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR5\u0010\t\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\n0\n\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR5\u0010\f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\r0\r\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR5\u0010\u000f\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00100\u0010 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R5\u0010\u0018\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00190\u0019 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00190\u0019\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00066"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/searchFilter/SearchFilterRemoteRepository;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "apartmentListSubject", "Lio/reactivex/subjects/PublishSubject;", "Lru/unicorn/ujin/view/fragments/searchFilter/ApartmentListEvent;", "kotlin.jvm.PlatformType", "getApartmentListSubject", "()Lio/reactivex/subjects/PublishSubject;", "buildingListSubject", "Lru/unicorn/ujin/view/fragments/searchFilter/BuildingListEvent;", "getBuildingListSubject", "cityListSubject", "Lru/unicorn/ujin/view/fragments/searchFilter/CityListEvent;", "getCityListSubject", "complexListSubject", "Lru/unicorn/ujin/view/fragments/searchFilter/ComplexListEvent;", "getComplexListSubject", "realm", "Lio/realm/Realm;", "getRealm", "()Lio/realm/Realm;", "realm$delegate", "Lkotlin/Lazy;", "sectionListSubject", "Lru/unicorn/ujin/view/fragments/searchFilter/SectionListEvent;", "getSectionListSubject", "userToken", "", "getUserToken", "()Ljava/lang/String;", "requestApartmentList", "", "complexId", "studia", "room1", "room2", "room3", "room4plus", "buildingId", "sectionId", "squareMin", "squareMax", "floorMin", "floorMax", "priceMin", "priceMax", "actionStock", "finishedApartments", "requestBuildingList", "requestCityList", "requestSearchFilter", "cityId", "requestSectionList", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.searchFilter.SearchFilterRemoteRepository */
/* compiled from: SearchFilterRemoteRepository.kt */
public final class SearchFilterRemoteRepository extends BaseRemoteRepository {
    private final PublishSubject<ApartmentListEvent> apartmentListSubject = PublishSubject.create();
    private final PublishSubject<BuildingListEvent> buildingListSubject = PublishSubject.create();
    private final PublishSubject<CityListEvent> cityListSubject = PublishSubject.create();
    private final PublishSubject<ComplexListEvent> complexListSubject = PublishSubject.create();
    private final Lazy realm$delegate = LazyKt.lazy(SearchFilterRemoteRepository$realm$2.INSTANCE);
    private final PublishSubject<SectionListEvent> sectionListSubject = PublishSubject.create();
    private final String userToken = ProfileLocalRepository.Companion.getInstance().getUserToken();

    /* access modifiers changed from: private */
    public final Realm getRealm() {
        return (Realm) this.realm$delegate.getValue();
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public final PublishSubject<CityListEvent> getCityListSubject() {
        return this.cityListSubject;
    }

    public final PublishSubject<ComplexListEvent> getComplexListSubject() {
        return this.complexListSubject;
    }

    public final PublishSubject<BuildingListEvent> getBuildingListSubject() {
        return this.buildingListSubject;
    }

    public final PublishSubject<SectionListEvent> getSectionListSubject() {
        return this.sectionListSubject;
    }

    public final PublishSubject<ApartmentListEvent> getApartmentListSubject() {
        return this.apartmentListSubject;
    }

    public final void requestSearchFilter(String str) {
        Intrinsics.checkNotNullParameter(str, Complex.Fields.cityId);
        getApi().getComplexList(getAppName(), getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new SearchFilterRemoteRepository$requestSearchFilter$1(this, str), new SearchFilterRemoteRepository$requestSearchFilter$2(this));
    }

    public final void requestCityList() {
        getApi().getCityList(getAppName(), getToken()).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new SearchFilterRemoteRepository$requestCityList$1(this), new SearchFilterRemoteRepository$requestCityList$2(this));
    }

    public final void requestBuildingList(String str) {
        Intrinsics.checkNotNullParameter(str, "complexId");
        getApi().getBuildingsList(getAppName(), getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new SearchFilterRemoteRepository$requestBuildingList$1(this), new SearchFilterRemoteRepository$requestBuildingList$2(this));
    }

    public final void requestSectionList(String str) {
        Intrinsics.checkNotNullParameter(str, "buildingId");
        getApi().getSectionList(getAppName(), getToken(), str).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new SearchFilterRemoteRepository$requestSectionList$1(this), new SearchFilterRemoteRepository$requestSectionList$2(this));
    }

    public final void requestApartmentList(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        Intrinsics.checkNotNullParameter(str, "complexId");
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
        getApi().getFilteredApartmentList(getAppName(), getToken(), str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16).subscribeOn(Schedulers.m6765io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new SearchFilterRemoteRepository$requestApartmentList$1(this), new SearchFilterRemoteRepository$requestApartmentList$2(this));
    }
}
