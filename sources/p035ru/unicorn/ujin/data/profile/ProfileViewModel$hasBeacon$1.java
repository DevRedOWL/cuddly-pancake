package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$hasBeacon$1 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$hasBeacon$1<T> implements Consumer<Boolean> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$hasBeacon$1(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void accept(Boolean bool) {
        this.this$0.getHasBeconMutableLiveData().setValue(bool);
    }
}
