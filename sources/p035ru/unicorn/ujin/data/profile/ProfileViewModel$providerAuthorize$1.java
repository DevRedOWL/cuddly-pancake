package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import kotlin.Unit;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.data.realm.profile.User;
import p035ru.unicorn.ujin.viewModel.events.profile.AuthProviderEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/profile/AuthProviderEvent;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$providerAuthorize$1 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$providerAuthorize$1<T> implements Consumer<AuthProviderEvent> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$providerAuthorize$1(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void accept(AuthProviderEvent authProviderEvent) {
        User user;
        ProfileViewModel profileViewModel = this.this$0;
        int i = 0;
        profileViewModel.getShowProgressLiveData().setValue(false);
        if (authProviderEvent.getSuccess() && (user = authProviderEvent.getUser()) != null) {
            ProfileLocalRepository access$getLocalRepository$p = profileViewModel.getLocalRepository();
            user.setUserLoggenIn(true);
            user.setStage(3);
            if (user.getId() == 80) {
                i = 1;
            }
            user.setDemo(i);
            user.setDemoToken(user.getId() == 80 ? user.getToken() : "");
            Unit unit = Unit.INSTANCE;
            access$getLocalRepository$p.saveUserProfile(user);
        }
        profileViewModel.getAuthProviderLiveData().setValue(authProviderEvent);
    }
}
