package p035ru.unicorn.ujin.data.profile;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "kotlin.jvm.PlatformType", "accept"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.data.profile.ProfileViewModel$requestUpdateProfile$4 */
/* compiled from: ProfileViewModel.kt */
final class ProfileViewModel$requestUpdateProfile$4<T> implements Consumer<SimpleResponse> {
    final /* synthetic */ ProfileViewModel this$0;

    ProfileViewModel$requestUpdateProfile$4(ProfileViewModel profileViewModel) {
        this.this$0 = profileViewModel;
    }

    public final void accept(SimpleResponse simpleResponse) {
        this.this$0.getProfileUpdateLiveData().postValue(new UpdateEvent(simpleResponse.getError() == 0, simpleResponse.getMessage()));
        this.this$0.requestUser();
    }
}
