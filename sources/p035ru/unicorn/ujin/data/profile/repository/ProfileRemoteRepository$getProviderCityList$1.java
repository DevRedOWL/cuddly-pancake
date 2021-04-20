package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.CitiesListProviderResponse;
import p035ru.unicorn.ujin.viewModel.events.profile.CitiesProviderEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/CitiesListProviderResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$getProviderCityList$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$getProviderCityList$1<T> implements Consumer<CitiesListProviderResponse> {
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$getProviderCityList$1(ProfileRemoteRepository profileRemoteRepository) {
        this.this$0 = profileRemoteRepository;
    }

    public final void accept(CitiesListProviderResponse citiesListProviderResponse) {
        ProfileRemoteRepository profileRemoteRepository = this.this$0;
        if (citiesListProviderResponse.getError() == 0) {
            profileRemoteRepository.getRealm().executeTransaction(new C5736x26a4062d(citiesListProviderResponse));
            profileRemoteRepository.getCitiesProviderSubject().onNext(new CitiesProviderEvent(true, ""));
            return;
        }
        profileRemoteRepository.getCitiesProviderSubject().onNext(new CitiesProviderEvent(false, citiesListProviderResponse.getMessage()));
    }
}
