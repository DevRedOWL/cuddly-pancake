package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.authorization.SendingCodeDataResponse;
import p035ru.unicorn.ujin.data.api.response.authorization.SendingCodeResponse;
import p035ru.unicorn.ujin.viewModel.events.profile.SendCodeProviderEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/api/response/authorization/SendingCodeResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$providerGetNewCode$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$providerGetNewCode$1<T> implements Consumer<SendingCodeResponse> {
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$providerGetNewCode$1(ProfileRemoteRepository profileRemoteRepository) {
        this.this$0 = profileRemoteRepository;
    }

    public final void accept(SendingCodeResponse sendingCodeResponse) {
        PublishSubject<SendCodeProviderEvent> sendCodeProviderSubject = this.this$0.getSendCodeProviderSubject();
        boolean z = sendingCodeResponse.getError() == 0;
        String message = sendingCodeResponse.getMessage();
        SendingCodeDataResponse data = sendingCodeResponse.getData();
        sendCodeProviderSubject.onNext(new SendCodeProviderEvent(z, message, data != null ? Boolean.valueOf(data.isNewUser()) : null));
    }
}
