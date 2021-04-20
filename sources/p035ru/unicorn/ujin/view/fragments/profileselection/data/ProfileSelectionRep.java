package p035ru.unicorn.ujin.view.fragments.profileselection.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.TokenData;
import p035ru.unicorn.ujin.data.UkAttachData;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.registration.CreateApartmentData;
import p035ru.unicorn.ujin.data.repository.BaseRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.repository.LocalRepository;
import p046io.reactivex.Flowable;
import p046io.reactivex.schedulers.Schedulers;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bJ\u0014\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\r0\b2\u0006\u0010\u0013\u001a\u00020\u0014J\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\r0\b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0014J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0\b2\u0006\u0010\u001b\u001a\u00020\nJ$\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0\b2\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014J\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0\b2\u0006\u0010\u001b\u001a\u00020\nJ$\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\r0\b2\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014J$\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\r0\b2\u0006\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006 "}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/data/ProfileSelectionRep;", "Lru/unicorn/ujin/data/repository/BaseRemoteRepository;", "()V", "localRep", "Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "getLocalRep", "()Lru/unicorn/ujin/view/activity/navigation/repository/LocalRepository;", "getCities", "Lio/reactivex/Flowable;", "", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityDTO;", "getCitiesWithUK", "joinToBusinessCenter", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/TokenData;", "id", "", "joinToUjin", "Lru/unicorn/ujin/data/registration/CreateApartmentData;", "apartmentTitle", "", "joinToUk", "Lru/unicorn/ujin/data/UkAttachData;", "buildingId", "apartmentNumber", "loadBusCenter", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessCenterList;", "city", "query", "loadUk", "searchBuildings", "Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingList;", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.data.ProfileSelectionRep */
/* compiled from: ProfileSelectionRep.kt */
public final class ProfileSelectionRep extends BaseRemoteRepository {
    private final LocalRepository localRep;

    public ProfileSelectionRep() {
        LocalRepository instance = LocalRepository.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "LocalRepository.getInstance()");
        this.localRep = instance;
    }

    public final LocalRepository getLocalRep() {
        return this.localRep;
    }

    public final Flowable<List<CityDTO>> getCities() {
        Flowable<R> map;
        Flowable<R> doOnNext;
        Flowable<R> onErrorReturn;
        this.localRep.getData(CityDTO.class).filter(ProfileSelectionRep$getCities$localData$1.INSTANCE).flatMapIterable(ProfileSelectionRep$getCities$localData$2.INSTANCE).toList().toFlowable();
        Flowable<Resource<CityList>> filter = getApi().getCitiesWithBusinessCentres(getToken()).filter(ProfileSelectionRep$getCities$remoteData$1.INSTANCE);
        if (filter == null || (map = filter.map(ProfileSelectionRep$getCities$remoteData$2.INSTANCE)) == null || (doOnNext = map.doOnNext(new ProfileSelectionRep$getCities$remoteData$3(this))) == null || (onErrorReturn = doOnNext.onErrorReturn(ProfileSelectionRep$getCities$remoteData$4.INSTANCE)) == null) {
            return null;
        }
        return onErrorReturn.subscribeOn(Schedulers.m6765io());
    }

    public final Flowable<List<CityDTO>> getCitiesWithUK() {
        Flowable<R> map;
        Flowable<R> doOnNext;
        Flowable<R> onErrorReturn;
        Flowable<Resource<CityList>> filter = getApi().getCitiesWithUK(getToken()).filter(ProfileSelectionRep$getCitiesWithUK$remoteData$1.INSTANCE);
        if (filter == null || (map = filter.map(ProfileSelectionRep$getCitiesWithUK$remoteData$2.INSTANCE)) == null || (doOnNext = map.doOnNext(new ProfileSelectionRep$getCitiesWithUK$remoteData$3(this))) == null || (onErrorReturn = doOnNext.onErrorReturn(ProfileSelectionRep$getCitiesWithUK$remoteData$4.INSTANCE)) == null) {
            return null;
        }
        return onErrorReturn.subscribeOn(Schedulers.m6765io());
    }

    public final Flowable<Resource<BusinessCenterList>> loadBusCenter(CityDTO cityDTO) {
        Intrinsics.checkNotNullParameter(cityDTO, "city");
        return loadBusCenter(cityDTO, (String) null);
    }

    public final Flowable<Resource<BusinessCenterList>> loadUk(CityDTO cityDTO) {
        Intrinsics.checkNotNullParameter(cityDTO, "city");
        return loadUk(cityDTO, (String) null);
    }

    public final Flowable<Resource<BusinessCenterList>> loadBusCenter(CityDTO cityDTO, String str) {
        Intrinsics.checkNotNullParameter(cityDTO, "city");
        Flowable<Resource<BusinessCenterList>> subscribeOn = getApi().getBusinessCentres(getToken(), cityDTO.getId(), str).onErrorReturn(ProfileSelectionRep$loadBusCenter$1.INSTANCE).toFlowable().subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getBusinessCentres(g…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<BusinessCenterList>> loadUk(CityDTO cityDTO, String str) {
        Intrinsics.checkNotNullParameter(cityDTO, "city");
        Flowable<Resource<BusinessCenterList>> subscribeOn = getApi().getUks(getToken(), cityDTO.getId(), str).onErrorReturn(ProfileSelectionRep$loadUk$1.INSTANCE).toFlowable().subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.getUks(getToken(), c…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<SearchBuildingList>> searchBuildings(CityDTO cityDTO, String str) {
        Intrinsics.checkNotNullParameter(cityDTO, "city");
        Flowable<Resource<SearchBuildingList>> subscribeOn = getApi().searchBuildings(getToken(), cityDTO.getId(), str).onErrorReturn(ProfileSelectionRep$searchBuildings$1.INSTANCE).toFlowable().subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.searchBuildings(getT…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<TokenData>> joinToBusinessCenter(int i) {
        Flowable<R> subscribeOn = getApi().joinToBusCenter(getToken(), new BusinessCenterOut(i)).map(ProfileSelectionRep$joinToBusinessCenter$1.INSTANCE).filter(ProfileSelectionRep$joinToBusinessCenter$2.INSTANCE).doOnNext(new ProfileSelectionRep$joinToBusinessCenter$3(this)).onErrorReturn(ProfileSelectionRep$joinToBusinessCenter$4.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.joinToBusCenter(getT…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<UkAttachData>> joinToUk(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "apartmentNumber");
        Flowable<R> subscribeOn = getApi().joinToUk(getToken(), String.valueOf(i), str).map(ProfileSelectionRep$joinToUk$1.INSTANCE).onErrorReturn(ProfileSelectionRep$joinToUk$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.joinToUk(getToken(),…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final Flowable<Resource<CreateApartmentData>> joinToUjin(String str) {
        Intrinsics.checkNotNullParameter(str, "apartmentTitle");
        Flowable<R> subscribeOn = getApi().joinToUjin(getToken(), str).map(ProfileSelectionRep$joinToUjin$1.INSTANCE).onErrorReturn(ProfileSelectionRep$joinToUjin$2.INSTANCE).subscribeOn(Schedulers.m6765io());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "api.joinToUjin(getToken(…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
