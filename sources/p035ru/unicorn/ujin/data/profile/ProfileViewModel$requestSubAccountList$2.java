package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import p046io.reactivex.functions.Action;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo51343d2 = {"<anonymous>", "", "run"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$requestSubAccountList$2 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$requestSubAccountList$2 implements Action {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$requestSubAccountList$2(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void run() {
        this.this$0.getShowProgressLiveData().postValue(false);
    }
}
