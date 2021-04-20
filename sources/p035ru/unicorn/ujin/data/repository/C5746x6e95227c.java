package p035ru.unicorn.ujin.data.repository;

import java.util.Iterator;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.CitiesListResponse;
import p035ru.unicorn.ujin.data.realm.City;
import p035ru.unicorn.ujin.data.realm.CityTitle;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, mo51343d2 = {"<anonymous>", "", "realm", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute", "ru/unicorn/ujin/data/repository/RealmRepository$requestUpdateCityList$1$1$2$1", "ru/unicorn/ujin/data/repository/RealmRepository$requestUpdateCityList$1$$special$$inlined$let$lambda$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.repository.RealmRepository$requestUpdateCityList$1$$special$$inlined$run$lambda$1 */
/* compiled from: RealmRepository.kt */
final class C5746x6e95227c implements Realm.Transaction {
    final /* synthetic */ CitiesListResponse $response$inlined;
    final /* synthetic */ RealmRepository $this_run$inlined;

    C5746x6e95227c(RealmRepository realmRepository, CitiesListResponse citiesListResponse) {
        this.$this_run$inlined = realmRepository;
        this.$response$inlined = citiesListResponse;
    }

    public final void execute(Realm realm) {
        realm.delete(City.class);
        Iterator<City> it = this.$response$inlined.getData().getCityList().iterator();
        while (it.hasNext()) {
            realm.insertOrUpdate((RealmModel) it.next());
        }
        if (this.$response$inlined.getData().getMapTitle() != null) {
            CityTitle cityTitle = new CityTitle();
            cityTitle.setTitle(this.$response$inlined.getData().getMapTitle());
            realm.insertOrUpdate((RealmModel) cityTitle);
        }
    }
}
