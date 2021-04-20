package p035ru.unicorn.ujin.view.fragments.profileselection.domain;

import java.util.List;
import kotlin.Metadata;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessBuildings;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.BusinessCenterDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.CityDTO;
import p035ru.unicorn.ujin.view.fragments.profileselection.data.SearchBuildingDTO;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\u0001\u001cJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\fH&¨\u0006\u001d"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/domain/ProfileSelectionInteractor;", "", "chooseBusinessCenter", "", "center", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessCenterDTO;", "chooseCity", "cityDTO", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityDTO;", "chooseCityForUk", "join", "busCenter", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessBuildings;", "joinToUjin", "apartmentTitle", "", "joinUk", "buildingId", "", "apartmentNumber", "loadBusCenters", "loadCities", "loadCitiesWithUk", "loadUks", "searchBuildings", "query", "selectBusinessCenterAddress", "address", "Callback", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractor */
/* compiled from: ProfileSelectionInteractor.kt */
public interface ProfileSelectionInteractor {

    @Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&J\u0018\u0010\n\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH&J\u0018\u0010\f\u001a\u00020\u00032\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u000fH&¨\u0006\u0017"}, mo51343d2 = {"Lru/unicorn/ujin/view/fragments/profileselection/domain/ProfileSelectionInteractor$Callback;", "", "errorMessage", "", "messageError", "", "onBCLoad", "bc", "", "Lru/unicorn/ujin/view/fragments/profileselection/data/BusinessCenterDTO;", "onBuildingsLoad", "Lru/unicorn/ujin/view/fragments/profileselection/data/SearchBuildingDTO;", "onCityLoad", "cities", "", "Lru/unicorn/ujin/view/fragments/profileselection/data/CityDTO;", "onJoin", "onJoinUjin", "onJoinUk", "updateBCData", "listOfBC", "updateCityData", "currentCityDTO", "app_kortrosRelease"}, mo51344k = 1, mo51345mv = {1, 4, 1})
    /* renamed from: ru.unicorn.ujin.view.fragments.profileselection.domain.ProfileSelectionInteractor$Callback */
    /* compiled from: ProfileSelectionInteractor.kt */
    public interface Callback {
        void errorMessage(String str);

        void onBCLoad(List<? extends BusinessCenterDTO> list);

        void onBuildingsLoad(List<? extends SearchBuildingDTO> list);

        void onCityLoad(List<CityDTO> list);

        void onJoin();

        void onJoinUjin();

        void onJoinUk();

        void updateBCData(BusinessCenterDTO businessCenterDTO);

        void updateCityData(CityDTO cityDTO);
    }

    void chooseBusinessCenter(BusinessCenterDTO businessCenterDTO);

    void chooseCity(CityDTO cityDTO);

    void chooseCityForUk(CityDTO cityDTO);

    void join(BusinessBuildings businessBuildings);

    void joinToUjin(String str);

    void joinUk(int i, String str);

    void loadBusCenters();

    void loadCities();

    void loadCitiesWithUk();

    void loadUks();

    void searchBuildings(String str);

    void selectBusinessCenterAddress(BusinessBuildings businessBuildings);
}
