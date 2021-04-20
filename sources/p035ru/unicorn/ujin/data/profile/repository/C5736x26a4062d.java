package p035ru.unicorn.ujin.data.profile.repository;

import java.util.Iterator;
import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.CitiesListProviderResponse;
import p035ru.unicorn.ujin.data.realm.ProviderCity;
import p046io.realm.Realm;
import p046io.realm.RealmModel;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "it", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "execute", "ru/unicorn/ujin/data/profile/repository/ProfileRemoteRepository$getProviderCityList$1$1$1"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$getProviderCityList$1$$special$$inlined$run$lambda$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class C5736x26a4062d implements Realm.Transaction {
    final /* synthetic */ CitiesListProviderResponse $response$inlined;

    C5736x26a4062d(CitiesListProviderResponse citiesListProviderResponse) {
        this.$response$inlined = citiesListProviderResponse;
    }

    public final void execute(Realm realm) {
        realm.delete(ProviderCity.class);
        Iterator<ProviderCity> it = this.$response$inlined.getData().iterator();
        while (it.hasNext()) {
            realm.insertOrUpdate((RealmModel) it.next());
        }
    }
}
