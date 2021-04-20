package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.authorization.LoginProviderResponse;
import p035ru.unicorn.ujin.data.api.response.authorization.LoginProviderResponseData;
import p035ru.unicorn.ujin.viewModel.events.profile.AuthProviderEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/authorization/LoginProviderResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$providerAuthorize$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$providerAuthorize$1<T> implements Consumer<LoginProviderResponse> {
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$providerAuthorize$1(ProfileRemoteRepository profileRemoteRepository) {
        this.this$0 = profileRemoteRepository;
    }

    public final void accept(LoginProviderResponse loginProviderResponse) {
        PublishSubject<AuthProviderEvent> authProviderSubject = this.this$0.getAuthProviderSubject();
        boolean z = loginProviderResponse.getError() == 0;
        String message = loginProviderResponse.getMessage();
        LoginProviderResponseData data = loginProviderResponse.getData();
        authProviderSubject.onNext(new AuthProviderEvent(z, message, data != null ? data.getUser() : null));
    }
}
