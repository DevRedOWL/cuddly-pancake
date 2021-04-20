package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.BaseViewModel;
import p035ru.unicorn.ujin.view.activity.navigation.viewmodel.SingleLiveEvent;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchComplex;
import p035ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractor;
import p035ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractorImpl;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.android.schedulers.AndroidSchedulers;
import p046io.realm.RealmList;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010!\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010Y\u001a\u00020+2\u0006\u0010Z\u001a\u00020?J\u000e\u0010[\u001a\u00020+2\u0006\u0010Z\u001a\u00020?J\u0010\u0010\\\u001a\u00020+2\b\u0010]\u001a\u0004\u0018\u00010\u0013J\u0010\u0010^\u001a\u00020+2\b\u0010_\u001a\u0004\u0018\u00010\u0017J\u0010\u0010`\u001a\u00020+2\b\u0010_\u001a\u0004\u0018\u00010\u0017J\u000e\u0010a\u001a\u00020+2\u0006\u0010b\u001a\u00020\u000fJ\u0006\u0010c\u001a\u00020+J\u0006\u0010d\u001a\u00020+J\u0006\u0010e\u001a\u00020+J\u0006\u0010f\u001a\u00020+J\u0010\u0010g\u001a\u00020+2\u0006\u0010h\u001a\u00020\u0006H\u0016J\u0006\u0010i\u001a\u00020+J\u0006\u0010j\u001a\u00020+J\u0018\u0010k\u001a\u00020+2\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000eH\u0016J\u0018\u0010l\u001a\u00020+2\u000e\u0010]\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0016J\u0018\u0010m\u001a\u00020+2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010nH\u0016J\b\u0010o\u001a\u00020+H\u0016J\b\u0010p\u001a\u00020+H\u0016J\b\u0010q\u001a\u00020+H\u0016J\u000e\u0010r\u001a\u00020+2\u0006\u0010s\u001a\u00020\u0006J\u0010\u0010t\u001a\u00020+2\b\u0010u\u001a\u0004\u0018\u00010OJ\u000e\u0010v\u001a\u00020+2\u0006\u0010w\u001a\u00020\u0006J\u0010\u0010x\u001a\u00020+2\u0006\u0010]\u001a\u00020\u0013H\u0016J\u0010\u0010y\u001a\u00020+2\u0006\u0010z\u001a\u00020\u0017H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\nX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\nX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\bR\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\bR\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020+0.X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020+0.X\u0004¢\u0006\u0002\n\u0000R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020+0\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\bR\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020+0.X\u0004¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR\u0010\u00108\u001a\u0004\u0018\u000109X\u000e¢\u0006\u0002\n\u0000R\u0019\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0.¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0005¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\bR\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020?0\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020?0\u0005¢\u0006\b\n\u0000\u001a\u0004\bC\u0010\bR\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020?0\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\bF\u0010\bR\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0004¢\u0006\u0002\n\u0000R\u0019\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\fR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\fR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\bR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\bR\u0014\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00130\nX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00170\u0005¢\u0006\b\n\u0000\u001a\u0004\bT\u0010\bR\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00170\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010V\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u001d\"\u0004\bX\u0010\u001f¨\u0006{"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/view/ProfileSelectionVM;", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/BaseViewModel;", "Lru/unicorn/ujin/view/fragments/profileselection/domain/ProfileSelectionInteractor$Callback;", "()V", "apartmentTitle", "Landroidx/lifecycle/LiveData;", "", "getApartmentTitle", "()Landroidx/lifecycle/LiveData;", "apartmentTitleMutable", "Landroidx/lifecycle/MutableLiveData;", "getApartmentTitleMutable", "()Landroidx/lifecycle/MutableLiveData;", "buildings", "", "Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingDTO;", "getBuildings", "buildingsListMutable", "businessCenter", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessCenterDTO;", "getBusinessCenter", "businessCenterListMutable", "cities", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityDTO;", "getCities", "citiesListMutable", "getCitiesListMutable", "email", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "name", "getName", "setName", "onBCChange", "", "getOnBCChange", "onBusinessCenterChangeMutable", "onCityChange", "getOnCityChange", "onCityChangeMutable", "onJoinSuccess", "", "getOnJoinSuccess", "onJoinSuccessMutable", "Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "onJoinUjinSuccess", "getOnJoinUjinSuccess", "onJoinUjinSuccessMutable", "onJoinUkSuccess", "getOnJoinUkSuccess", "onJoinUkSuccessMutable", "patronymic", "getPatronymic", "setPatronymic", "profileSelectionInteractor", "Lru/unicorn/ujin/view/fragments/profileselection/domain/ProfileSelectionInteractor;", "profileUpdateLiveData", "Lru/unicorn/ujin/viewModel/events/UpdateEvent;", "getProfileUpdateLiveData", "()Lru/unicorn/ujin/view/activity/navigation/viewmodel/SingleLiveEvent;", "selectNumber", "", "getSelectNumber", "selectNumberMutable", "selectRole", "getSelectRole", "selectRoleMutable", "selectRoleName", "getSelectRoleName", "selectRoleNameMutable", "selectedApartmentNumber", "getSelectedApartmentNumber", "selectedBuildingMutable", "getSelectedBuildingMutable", "selectedBusCenter", "getSelectedBusCenter", "selectedBusCenterAddress", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;", "getSelectedBusCenterAddress", "selectedBusCenterAddressMutable", "selectedBusCenterMutable", "selectedCity", "getSelectedCity", "selectedCityMutable", "surname", "getSurname", "setSurname", "checkCurrent", "position", "checkCurrentRole", "chooseBusCenter", "bc", "chooseCity", "city", "chooseCityForUk", "chooseSearchBuilding", "searchBuildingDTO", "connectToBusinessCenter", "connectToUjin", "connectToUk", "editProfile", "errorMessage", "messageError", "loadCities", "loadCitiesWithUK", "onBCLoad", "onBuildingsLoad", "onCityLoad", "", "onJoin", "onJoinUjin", "onJoinUk", "searchBuildings", "query", "selectBCAddress", "address", "setRoleName", "roleName", "updateBCData", "updateCityData", "currentCityDTO", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM */
/* compiled from: ProfileSelectionVM.kt */
public final class ProfileSelectionVM extends BaseViewModel implements ProfileSelectionInteractor.Callback {
    private final LiveData<String> apartmentTitle;
    private final MutableLiveData<String> apartmentTitleMutable = new MutableLiveData<>();
    private final LiveData<List<SearchBuildingDTO>> buildings;
    private final MutableLiveData<List<SearchBuildingDTO>> buildingsListMutable = new MutableLiveData<>();
    private final LiveData<List<BusinessCenterDTO>> businessCenter;
    private final MutableLiveData<List<BusinessCenterDTO>> businessCenterListMutable = new MutableLiveData<>();
    private final LiveData<List<CityDTO>> cities;
    private final MutableLiveData<List<CityDTO>> citiesListMutable = new MutableLiveData<>();
    private String email;
    private String name = ProfileLocalRepository.Companion.getInstance().getUser().getName();
    private final LiveData<Boolean> onBCChange;
    private final MutableLiveData<Boolean> onBusinessCenterChangeMutable = new MutableLiveData<>();
    private final LiveData<Boolean> onCityChange;
    private final MutableLiveData<Boolean> onCityChangeMutable = new MutableLiveData<>();
    private final LiveData<Unit> onJoinSuccess;
    private final SingleLiveEvent<Unit> onJoinSuccessMutable;
    private final LiveData<Unit> onJoinUjinSuccess;
    private final SingleLiveEvent<Unit> onJoinUjinSuccessMutable;
    private final LiveData<Unit> onJoinUkSuccess;
    private final SingleLiveEvent<Unit> onJoinUkSuccessMutable;
    private String patronymic = ProfileLocalRepository.Companion.getInstance().getUser().getPatronymic();
    private ProfileSelectionInteractor profileSelectionInteractor;
    private final SingleLiveEvent<UpdateEvent> profileUpdateLiveData = new SingleLiveEvent<>();
    private final LiveData<Integer> selectNumber;
    private final MutableLiveData<Integer> selectNumberMutable = new MutableLiveData<>();
    private final LiveData<Integer> selectRole;
    private final MutableLiveData<Integer> selectRoleMutable;
    private final LiveData<String> selectRoleName;
    private final MutableLiveData<String> selectRoleNameMutable;
    private final MutableLiveData<String> selectedApartmentNumber;
    private final MutableLiveData<SearchBuildingDTO> selectedBuildingMutable;
    private final LiveData<BusinessCenterDTO> selectedBusCenter;
    private final LiveData<BusinessBuildings> selectedBusCenterAddress;
    private final MutableLiveData<BusinessBuildings> selectedBusCenterAddressMutable = new MutableLiveData<>();
    private final MutableLiveData<BusinessCenterDTO> selectedBusCenterMutable = new MutableLiveData<>();
    private final LiveData<CityDTO> selectedCity;
    private final MutableLiveData<CityDTO> selectedCityMutable = new MutableLiveData<>();
    private String surname = ProfileLocalRepository.Companion.getInstance().getUser().getSurname();

    public ProfileSelectionVM() {
        String email2 = ProfileLocalRepository.Companion.getInstance().getUser().getEmail();
        this.email = email2 == null ? "" : email2;
        this.selectRoleMutable = new MutableLiveData<>();
        this.selectRoleNameMutable = new MutableLiveData<>();
        this.onJoinSuccessMutable = new SingleLiveEvent<>();
        this.onJoinUkSuccessMutable = new SingleLiveEvent<>();
        this.onJoinUjinSuccessMutable = new SingleLiveEvent<>();
        this.selectNumber = this.selectNumberMutable;
        this.selectedCity = this.selectedCityMutable;
        this.selectedBusCenter = this.selectedBusCenterMutable;
        this.selectedBusCenterAddress = this.selectedBusCenterAddressMutable;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        Unit unit = Unit.INSTANCE;
        this.selectedApartmentNumber = mutableLiveData;
        this.cities = this.citiesListMutable;
        this.businessCenter = this.businessCenterListMutable;
        this.onCityChange = this.onCityChangeMutable;
        this.onBCChange = this.onBusinessCenterChangeMutable;
        this.buildings = this.buildingsListMutable;
        this.selectedBuildingMutable = new MutableLiveData<>();
        this.selectRole = this.selectRoleMutable;
        this.selectRoleName = this.selectRoleNameMutable;
        this.apartmentTitle = this.apartmentTitleMutable;
        this.onJoinSuccess = this.onJoinSuccessMutable;
        this.onJoinUkSuccess = this.onJoinUkSuccessMutable;
        this.onJoinUjinSuccess = this.onJoinUjinSuccessMutable;
        this.profileSelectionInteractor = new ProfileSelectionInteractorImpl(this);
        loadCities();
        this.selectRoleMutable.setValue(0);
    }

    public final MutableLiveData<List<CityDTO>> getCitiesListMutable() {
        return this.citiesListMutable;
    }

    public final MutableLiveData<String> getApartmentTitleMutable() {
        return this.apartmentTitleMutable;
    }

    public final SingleLiveEvent<UpdateEvent> getProfileUpdateLiveData() {
        return this.profileUpdateLiveData;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getSurname() {
        return this.surname;
    }

    public final void setSurname(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.surname = str;
    }

    public final String getPatronymic() {
        return this.patronymic;
    }

    public final void setPatronymic(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.patronymic = str;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final LiveData<Integer> getSelectNumber() {
        return this.selectNumber;
    }

    public final LiveData<CityDTO> getSelectedCity() {
        return this.selectedCity;
    }

    public final LiveData<BusinessCenterDTO> getSelectedBusCenter() {
        return this.selectedBusCenter;
    }

    public final LiveData<BusinessBuildings> getSelectedBusCenterAddress() {
        return this.selectedBusCenterAddress;
    }

    public final MutableLiveData<String> getSelectedApartmentNumber() {
        return this.selectedApartmentNumber;
    }

    public final LiveData<List<CityDTO>> getCities() {
        return this.cities;
    }

    public final LiveData<List<BusinessCenterDTO>> getBusinessCenter() {
        return this.businessCenter;
    }

    public final LiveData<Boolean> getOnCityChange() {
        return this.onCityChange;
    }

    public final LiveData<Boolean> getOnBCChange() {
        return this.onBCChange;
    }

    public final LiveData<List<SearchBuildingDTO>> getBuildings() {
        return this.buildings;
    }

    public final MutableLiveData<SearchBuildingDTO> getSelectedBuildingMutable() {
        return this.selectedBuildingMutable;
    }

    public final LiveData<Integer> getSelectRole() {
        return this.selectRole;
    }

    public final LiveData<String> getSelectRoleName() {
        return this.selectRoleName;
    }

    public final LiveData<String> getApartmentTitle() {
        return this.apartmentTitle;
    }

    public final LiveData<Unit> getOnJoinSuccess() {
        return this.onJoinSuccess;
    }

    public final LiveData<Unit> getOnJoinUkSuccess() {
        return this.onJoinUkSuccess;
    }

    public final LiveData<Unit> getOnJoinUjinSuccess() {
        return this.onJoinUjinSuccess;
    }

    public final void loadCities() {
        ProfileSelectionInteractor profileSelectionInteractor2 = this.profileSelectionInteractor;
        if (profileSelectionInteractor2 != null) {
            profileSelectionInteractor2.loadCities();
        }
    }

    public final void loadCitiesWithUK() {
        ProfileSelectionInteractor profileSelectionInteractor2 = this.profileSelectionInteractor;
        if (profileSelectionInteractor2 != null) {
            profileSelectionInteractor2.loadCitiesWithUk();
        }
    }

    public final void checkCurrent(int i) {
        this.selectNumberMutable.setValue(Integer.valueOf(i));
    }

    public final void chooseCity(CityDTO cityDTO) {
        if (cityDTO != null) {
            this.onCityChangeMutable.setValue(true);
            ProfileSelectionInteractor profileSelectionInteractor2 = this.profileSelectionInteractor;
            if (profileSelectionInteractor2 != null) {
                profileSelectionInteractor2.chooseCity(cityDTO);
            }
        }
    }

    public final void chooseCityForUk(CityDTO cityDTO) {
        if (cityDTO != null) {
            this.onCityChangeMutable.setValue(true);
            ProfileSelectionInteractor profileSelectionInteractor2 = this.profileSelectionInteractor;
            if (profileSelectionInteractor2 != null) {
                profileSelectionInteractor2.chooseCityForUk(cityDTO);
            }
        }
    }

    public final void chooseBusCenter(BusinessCenterDTO businessCenterDTO) {
        ProfileSelectionInteractor profileSelectionInteractor2;
        if (businessCenterDTO != null && (profileSelectionInteractor2 = this.profileSelectionInteractor) != null) {
            profileSelectionInteractor2.chooseBusinessCenter(businessCenterDTO);
        }
    }

    public final void chooseSearchBuilding(SearchBuildingDTO searchBuildingDTO) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(searchBuildingDTO, "searchBuildingDTO");
        this.selectedBuildingMutable.setValue(searchBuildingDTO);
        MutableLiveData<BusinessCenterDTO> mutableLiveData = this.selectedBusCenterMutable;
        BusinessCenterDTO businessCenterDTO = new BusinessCenterDTO(0, (String) null, (RealmList) null, 7, (DefaultConstructorMarker) null);
        SearchComplex complex = searchBuildingDTO.getComplex();
        int i = -1;
        businessCenterDTO.setId(complex != null ? complex.getId() : -1);
        SearchComplex complex2 = searchBuildingDTO.getComplex();
        if (complex2 == null || (str = complex2.getTitle()) == null) {
            str = "";
        }
        businessCenterDTO.setTitle(str);
        Unit unit = Unit.INSTANCE;
        mutableLiveData.setValue(businessCenterDTO);
        MutableLiveData<BusinessBuildings> mutableLiveData2 = this.selectedBusCenterAddressMutable;
        BusinessBuildings businessBuildings = new BusinessBuildings(0, (String) null, 3, (DefaultConstructorMarker) null);
        BusinessBuildings building = searchBuildingDTO.getBuilding();
        if (building != null) {
            i = building.getId();
        }
        businessBuildings.setId(i);
        BusinessBuildings building2 = searchBuildingDTO.getBuilding();
        if (building2 == null || (str2 = building2.getTitle()) == null) {
            str2 = "";
        }
        businessBuildings.setTitle(str2);
        Unit unit2 = Unit.INSTANCE;
        mutableLiveData2.setValue(businessBuildings);
    }

    public final void searchBuildings(String str) {
        Intrinsics.checkNotNullParameter(str, SearchIntents.EXTRA_QUERY);
        ProfileSelectionInteractor profileSelectionInteractor2 = this.profileSelectionInteractor;
        if (profileSelectionInteractor2 != null) {
            profileSelectionInteractor2.searchBuildings(str);
        }
    }

    public void onCityLoad(List<CityDTO> list) {
        this.citiesListMutable.setValue(list);
    }

    public void onBCLoad(List<? extends BusinessCenterDTO> list) {
        this.businessCenterListMutable.setValue(list);
    }

    public void onBuildingsLoad(List<? extends SearchBuildingDTO> list) {
        this.buildingsListMutable.setValue(list);
    }

    public void updateCityData(CityDTO cityDTO) {
        Intrinsics.checkNotNullParameter(cityDTO, "currentCityDTO");
        this.selectedCityMutable.setValue(cityDTO);
    }

    public void updateBCData(BusinessCenterDTO businessCenterDTO) {
        Intrinsics.checkNotNullParameter(businessCenterDTO, "bc");
        this.selectedBusCenterMutable.setValue(businessCenterDTO);
    }

    public final void selectBCAddress(BusinessBuildings businessBuildings) {
        if (businessBuildings != null) {
            this.selectedBusCenterAddressMutable.setValue(businessBuildings);
            ProfileSelectionInteractor profileSelectionInteractor2 = this.profileSelectionInteractor;
            if (profileSelectionInteractor2 != null) {
                profileSelectionInteractor2.selectBusinessCenterAddress(businessBuildings);
            }
        }
    }

    public void errorMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "messageError");
        SingleLiveEvent singleLiveEvent = this.showError;
        Intrinsics.checkNotNullExpressionValue(singleLiveEvent, "showError");
        singleLiveEvent.setValue(str);
    }

    public void onJoin() {
        this.onJoinSuccessMutable.setValue(Unit.INSTANCE);
    }

    public void onJoinUk() {
        this.onJoinUkSuccessMutable.setValue(Unit.INSTANCE);
    }

    public void onJoinUjin() {
        this.onJoinUjinSuccessMutable.setValue(Unit.INSTANCE);
    }

    public final void checkCurrentRole(int i) {
        this.selectRoleMutable.setValue(Integer.valueOf(i));
    }

    public final void setRoleName(String str) {
        Intrinsics.checkNotNullParameter(str, "roleName");
        this.selectRoleNameMutable.setValue(str);
    }

    public final void connectToBusinessCenter() {
        ProfileSelectionInteractor profileSelectionInteractor2;
        BusinessBuildings value = this.selectedBusCenterAddress.getValue();
        if (value != null && (profileSelectionInteractor2 = this.profileSelectionInteractor) != null) {
            Intrinsics.checkNotNullExpressionValue(value, "it");
            profileSelectionInteractor2.join(value);
        }
    }

    public final void connectToUk() {
        ProfileSelectionInteractor profileSelectionInteractor2;
        BusinessBuildings value = this.selectedBusCenterAddress.getValue();
        if (value != null && (profileSelectionInteractor2 = this.profileSelectionInteractor) != null) {
            int id = value.getId();
            String value2 = this.selectedApartmentNumber.getValue();
            if (value2 == null) {
                value2 = "";
            }
            Intrinsics.checkNotNullExpressionValue(value2, "selectedApartmentNumber.value?: \"\"");
            profileSelectionInteractor2.joinUk(id, value2);
        }
    }

    public final void connectToUjin() {
        ProfileSelectionInteractor profileSelectionInteractor2;
        String value = this.apartmentTitle.getValue();
        if (value != null && (profileSelectionInteractor2 = this.profileSelectionInteractor) != null) {
            Intrinsics.checkNotNullExpressionValue(value, "it");
            profileSelectionInteractor2.joinToUjin(value);
        }
    }

    public final void editProfile() {
        ProfileRemoteRepository profileRemoteRepository = new ProfileRemoteRepository();
        profileRemoteRepository.requestUpdateProfile(this.surname, this.name, this.patronymic, "", this.email, "", "").doOnSubscribe(new ProfileSelectionVM$editProfile$$inlined$also$lambda$1(this)).doOnComplete(new ProfileSelectionVM$editProfile$$inlined$also$lambda$2(this)).doOnError(new ProfileSelectionVM$editProfile$$inlined$also$lambda$3(this)).observeOn(AndroidSchedulers.mainThread()).subscribe(new ProfileSelectionVM$editProfile$$inlined$also$lambda$4(profileRemoteRepository, this));
    }
}
