package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.authorization.ValidateCodeDataResponse;
import p035ru.unicorn.ujin.data.api.response.authorization.ValidateCodeResponse;
import p035ru.unicorn.ujin.viewModel.events.profile.ValidateSmsProviderEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/authorization/ValidateCodeResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$providerValidateSms$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$providerValidateSms$1<T> implements Consumer<ValidateCodeResponse> {
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$providerValidateSms$1(ProfileRemoteRepository profileRemoteRepository) {
        this.this$0 = profileRemoteRepository;
    }

    public final void accept(ValidateCodeResponse validateCodeResponse) {
        ProfileRemoteRepository profileRemoteRepository = this.this$0;
        String str = null;
        if (validateCodeResponse.getError() == 0) {
            profileRemoteRepository.getRealm().executeTransaction(new C5737xa9b4c1eb(profileRemoteRepository, validateCodeResponse));
            PublishSubject<ValidateSmsProviderEvent> validateSmsProviderSubject = profileRemoteRepository.getValidateSmsProviderSubject();
            ValidateCodeDataResponse data = validateCodeResponse.getData();
            Boolean valueOf = data != null ? Boolean.valueOf(data.getSuccess()) : null;
            ValidateCodeDataResponse data2 = validateCodeResponse.getData();
            if (data2 != null) {
                str = data2.getToken();
            }
            validateSmsProviderSubject.onNext(new ValidateSmsProviderEvent(true, "", valueOf, str));
            return;
        }
        profileRemoteRepository.getValidateSmsProviderSubject().onNext(new ValidateSmsProviderEvent(false, validateCodeResponse.getMessage(), (Boolean) null, (String) null));
    }
}
