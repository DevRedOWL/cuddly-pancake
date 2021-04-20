package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.profile.event.RegisterEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "event", "Lru/unicorn/ujin/data/profile/event/RegisterEvent;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$rentRegisterByPhoneCorona$1 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$rentRegisterByPhoneCorona$1<T> implements Consumer<RegisterEvent> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$rentRegisterByPhoneCorona$1(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void accept(RegisterEvent registerEvent) {
        ProfileViewModel profileViewModel = this.this$0;
        profileViewModel.getShowProgressLiveData().setValue(false);
        profileViewModel.getRentRegisterByPhoneLiveData().setValue(registerEvent);
    }
}
