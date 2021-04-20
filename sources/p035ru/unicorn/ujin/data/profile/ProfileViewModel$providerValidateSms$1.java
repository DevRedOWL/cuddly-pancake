package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.profile.repository.ProfileLocalRepository;
import p035ru.unicorn.ujin.viewModel.events.profile.ValidateSmsProviderEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/viewModel/events/profile/ValidateSmsProviderEvent;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$providerValidateSms$1 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$providerValidateSms$1<T> implements Consumer<ValidateSmsProviderEvent> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$providerValidateSms$1(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void accept(ValidateSmsProviderEvent validateSmsProviderEvent) {
        ProfileViewModel profileViewModel = this.this$0;
        ProfileLocalRepository access$getLocalRepository$p = profileViewModel.getLocalRepository();
        String token = validateSmsProviderEvent.getToken();
        if (token == null) {
            token = "";
        }
        access$getLocalRepository$p.subscribeUser(token);
        profileViewModel.getShowProgressLiveData().setValue(false);
        profileViewModel.getValidateSmsProviderLiveData().setValue(validateSmsProviderEvent);
    }
}
