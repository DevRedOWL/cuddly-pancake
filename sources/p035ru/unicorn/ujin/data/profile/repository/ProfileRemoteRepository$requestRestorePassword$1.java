package p035ru.unicorn.ujin.data.profile.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p035ru.unicorn.ujin.data.login.LoginResponse;
import p035ru.unicorn.ujin.data.login.LoginResponseData;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;
import p046io.reactivex.subjects.PublishSubject;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "response", "Lru/unicorn/ujin/data/login/LoginResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository$requestRestorePassword$1 */
/* compiled from: ProfileRemoteRepository.kt */
final class ProfileRemoteRepository$requestRestorePassword$1<T> implements Consumer<LoginResponse> {
    final /* synthetic */ ProfileRemoteRepository this$0;

    ProfileRemoteRepository$requestRestorePassword$1(ProfileRemoteRepository profileRemoteRepository) {
        this.this$0 = profileRemoteRepository;
    }

    public final void accept(LoginResponse loginResponse) {
        User user;
        ProfileRemoteRepository profileRemoteRepository = this.this$0;
        Intrinsics.checkNotNullExpressionValue(loginResponse, "response");
        LoginResponseData data = loginResponse.getData();
        boolean z = false;
        if (!(data == null || (user = data.getUser()) == null)) {
            profileRemoteRepository.requestUser(user.getToken(), false);
        }
        PublishSubject<UpdateEvent> passwordRestoreProviderSubject = profileRemoteRepository.getPasswordRestoreProviderSubject();
        if (loginResponse.getError() == 0) {
            z = true;
        }
        String message = loginResponse.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "response.message");
        passwordRestoreProviderSubject.onNext(new UpdateEvent(z, message));
    }
}
