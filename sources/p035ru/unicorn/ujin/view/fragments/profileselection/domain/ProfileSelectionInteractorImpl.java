package p035ru.unicorn.ujin.view.fragments.profileselection.domain;

import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.UkAttachData;
import p035ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository;
import p035ru.unicorn.ujin.data.realm.Resource;
import p035ru.unicorn.ujin.data.registration.CreateApartmentData;
import p035ru.unicorn.ujin.view.dialogs.dataEntry.Contact;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.ProfileSelectionRep;
import p035ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractor;
import p046io.reactivex.Flowable;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.reactivex.disposables.CompositeDisposable;
import p046io.reactivex.disposables.Disposable;
import p046io.reactivex.functions.Consumer;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\rH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\"H\u0016J\b\u0010'\u001a\u00020\u0019H\u0016J\b\u0010(\u001a\u00020\u0019H\u0016J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\"H\u0016J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/domain/ProfileSelectionInteractorImpl;", "Lru/unicorn/ujin/view/fragments/profileselection/domain/ProfileSelectionInteractor;", "callback", "Lru/unicorn/ujin/view/fragments/profileselection/domain/ProfileSelectionInteractor$Callback;", "(Lru/unicorn/ujin/view/fragments/profileselection/domain/ProfileSelectionInteractor$Callback;)V", "getCallback", "()Lru/unicorn/ujin/view/fragments/profileselection/domain/ProfileSelectionInteractor$Callback;", "cd", "Lio/reactivex/disposables/CompositeDisposable;", "createApartmentData", "Lru/unicorn/ujin/data/realm/Resource;", "Lru/unicorn/ujin/data/registration/CreateApartmentData;", "currentAddress", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;", "currentBusinessDTO", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessCenterDTO;", "currentCityDTO", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityDTO;", "profileRepository", "Lru/unicorn/ujin/data/profile/repository/ProfileRemoteRepository;", "profileSelectionRep", "Lru/unicorn/ujin/view/fragments/profileselection/data/ProfileSelectionRep;", "ukAttachData", "Lru/unicorn/ujin/data/UkAttachData;", "chooseBusinessCenter", "", "center", "chooseCity", "cityDTO", "chooseCityForUk", "join", "busCenter", "joinToUjin", "apartmentTitle", "", "joinUk", "buildingId", "", "apartmentNumber", "loadBusCenters", "loadCities", "loadCitiesWithUk", "loadUks", "searchBuildings", "query", "selectBusinessCenterAddress", "address", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractorImpl */
/* compiled from: ProfileSelectionInteractorImpl.kt */
public final class ProfileSelectionInteractorImpl implements ProfileSelectionInteractor {
    private final ProfileSelectionInteractor.Callback callback;

    /* renamed from: cd */
    private final CompositeDisposable f6946cd = new CompositeDisposable();
    /* access modifiers changed from: private */
    public Resource<CreateApartmentData> createApartmentData;
    private BusinessBuildings currentAddress = new BusinessBuildings(0, (String) null, 3, (DefaultConstructorMarker) null);
    private BusinessCenterDTO currentBusinessDTO = new BusinessCenterDTO(0, (String) null, (RealmList) null, 7, (DefaultConstructorMarker) null);
    private CityDTO currentCityDTO = new CityDTO(0, (String) null, 3, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final ProfileRemoteRepository profileRepository = new ProfileRemoteRepository();
    private final ProfileSelectionRep profileSelectionRep = new ProfileSelectionRep();
    /* access modifiers changed from: private */
    public Resource<UkAttachData> ukAttachData;

    public ProfileSelectionInteractorImpl(ProfileSelectionInteractor.Callback callback2) {
        Intrinsics.checkNotNullParameter(callback2, "callback");
        this.callback = callback2;
        this.callback.updateCityData(this.currentCityDTO);
    }

    public final ProfileSelectionInteractor.Callback getCallback() {
        return this.callback;
    }

    public void loadCities() {
        Flowable<List<CityDTO>> observeOn;
        Disposable subscribe;
        Flowable<List<CityDTO>> cities = this.profileSelectionRep.getCities();
        if (cities != null && (observeOn = cities.observeOn(AndroidSchedulers.mainThread())) != null && (subscribe = observeOn.subscribe((Consumer<? super List<CityDTO>>) new ProfileSelectionInteractorImpl$loadCities$1(this))) != null) {
            this.f6946cd.add(subscribe);
        }
    }

    public void loadCitiesWithUk() {
        Flowable<List<CityDTO>> observeOn;
        Disposable subscribe;
        Flowable<List<CityDTO>> citiesWithUK = this.profileSelectionRep.getCitiesWithUK();
        if (citiesWithUK != null && (observeOn = citiesWithUK.observeOn(AndroidSchedulers.mainThread())) != null && (subscribe = observeOn.subscribe((Consumer<? super List<CityDTO>>) new ProfileSelectionInteractorImpl$loadCitiesWithUk$1(this))) != null) {
            this.f6946cd.add(subscribe);
        }
    }

    public void chooseCity(CityDTO cityDTO) {
        Intrinsics.checkNotNullParameter(cityDTO, "cityDTO");
        if (this.currentCityDTO.getId() == -1 || this.currentCityDTO.getId() != cityDTO.getId()) {
            this.currentCityDTO = cityDTO;
            this.callback.updateCityData(this.currentCityDTO);
            this.callback.onBCLoad(CollectionsKt.emptyList());
            this.callback.updateBCData(new BusinessCenterDTO(0, (String) null, (RealmList) null, 7, (DefaultConstructorMarker) null));
            loadBusCenters();
        }
    }

    public void chooseCityForUk(CityDTO cityDTO) {
        Intrinsics.checkNotNullParameter(cityDTO, "cityDTO");
        if (this.currentCityDTO.getId() == -1 || this.currentCityDTO.getId() != cityDTO.getId()) {
            this.currentCityDTO = cityDTO;
            this.callback.updateCityData(this.currentCityDTO);
            this.callback.onBCLoad(CollectionsKt.emptyList());
            this.callback.updateBCData(new BusinessCenterDTO(0, (String) null, (RealmList) null, 7, (DefaultConstructorMarker) null));
            loadUks();
        }
    }

    public void chooseBusinessCenter(BusinessCenterDTO businessCenterDTO) {
        Intrinsics.checkNotNullParameter(businessCenterDTO, "center");
        this.currentBusinessDTO = businessCenterDTO;
        this.callback.updateBCData(businessCenterDTO);
    }

    public void selectBusinessCenterAddress(BusinessBuildings businessBuildings) {
        Intrinsics.checkNotNullParameter(businessBuildings, Contact.Type.address);
        this.currentAddress = businessBuildings;
    }

    public void loadBusCenters() {
        Disposable subscribe = this.profileSelectionRep.loadBusCenter(this.currentCityDTO).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileSelectionInteractorImpl$loadBusCenters$1(this));
        if (subscribe != null) {
            this.f6946cd.add(subscribe);
        }
    }

    public void loadUks() {
        Disposable subscribe = this.profileSelectionRep.loadUk(this.currentCityDTO).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileSelectionInteractorImpl$loadUks$1(this));
        if (subscribe != null) {
            this.f6946cd.add(subscribe);
        }
    }

    public void searchBuildings(String str) {
        Intrinsics.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        Disposable subscribe = this.profileSelectionRep.searchBuildings(this.currentCityDTO, str).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileSelectionInteractorImpl$searchBuildings$1(this));
        if (subscribe != null) {
            this.f6946cd.add(subscribe);
        }
    }

    public void join(BusinessBuildings businessBuildings) {
        Intrinsics.checkNotNullParameter(businessBuildings, "busCenter");
        Disposable subscribe = this.profileSelectionRep.joinToBusinessCenter(businessBuildings.getId()).filter(ProfileSelectionInteractorImpl$join$1.INSTANCE).map(ProfileSelectionInteractorImpl$join$2.INSTANCE).flatMap(new ProfileSelectionInteractorImpl$join$3(this)).doOnNext(ProfileSelectionInteractorImpl$join$4.INSTANCE).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileSelectionInteractorImpl$join$5(this), new ProfileSelectionInteractorImpl$join$6(this));
        if (subscribe != null) {
            this.f6946cd.add(subscribe);
        }
    }

    public void joinUk(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "apartmentNumber");
        Disposable subscribe = this.profileSelectionRep.joinToUk(i, str).flatMap(new ProfileSelectionInteractorImpl$joinUk$1(this)).doOnNext(ProfileSelectionInteractorImpl$joinUk$2.INSTANCE).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileSelectionInteractorImpl$joinUk$3(this), new ProfileSelectionInteractorImpl$joinUk$4(this));
        if (subscribe != null) {
            this.f6946cd.add(subscribe);
        }
    }

    public void joinToUjin(String str) {
        Intrinsics.checkNotNullParameter(str, "apartmentTitle");
        Disposable subscribe = this.profileSelectionRep.joinToUjin(str).flatMap(new ProfileSelectionInteractorImpl$joinToUjin$1(this)).doOnNext(ProfileSelectionInteractorImpl$joinToUjin$2.INSTANCE).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileSelectionInteractorImpl$joinToUjin$3(this), new ProfileSelectionInteractorImpl$joinToUjin$4(this));
        if (subscribe != null) {
            this.f6946cd.add(subscribe);
        }
    }
}
