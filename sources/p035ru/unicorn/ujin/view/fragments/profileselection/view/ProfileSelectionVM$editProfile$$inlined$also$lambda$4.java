package p035ru.unicorn.ujin.view.fragments.profileselection.view;

import kotlin.Metadata;
import p035ru.unicorn.ujin.data.api.response.SimpleResponse;
import p035ru.unicorn.ujin.data.profile.repository.ProfileRemoteRepository;
import p035ru.unicorn.ujin.viewModel.events.UpdateEvent;
import p046io.reactivex.functions.Consumer;

@Metadata(mo51341bv = {1, 0, 3}, mo51342d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo51343d2 = {"<anonymous>", "", "data", "Lru/unicorn/ujin/data/api/response/SimpleResponse;", "kotlin.jvm.PlatformType", "accept", "ru/unicorn/ujin/view/fragments/profileselection/view/ProfileSelectionVM$editProfile$1$4"}, mo51344k = 3, mo51345mv = {1, 4, 1})
/* renamed from: ru.unicorn.ujin.view.fragments.profileselection.view.ProfileSelectionVM$editProfile$$inlined$also$lambda$4 */
/* compiled from: ProfileSelectionVM.kt */
final class ProfileSelectionVM$editProfile$$inlined$also$lambda$4<T> implements Consumer<SimpleResponse> {
    final /* synthetic */ ProfileRemoteRepository $it;
    final /* synthetic */ ProfileSelectionVM this$0;

    ProfileSelectionVM$editProfile$$inlined$also$lambda$4(ProfileRemoteRepository profileRemoteRepository, ProfileSelectionVM profileSelectionVM) {
        this.$it = profileRemoteRepository;
        this.this$0 = profileSelectionVM;
    }

    public final void accept(SimpleResponse simpleResponse) {
        ProfileSelectionVM profileSelectionVM = this.this$0;
        boolean z = true;
        profileSelectionVM.getProfileUpdateLiveData().postValue(new UpdateEvent(simpleResponse.getError() == 0, simpleResponse.getMessage()));
        ProfileRemoteRepository profileRemoteRepository = this.$it;
        if (profileSelectionVM.getSelectedApartmentNumber().getValue() != null) {
            z = false;
        }
        profileRemoteRepository.requestUser(z);
    }
}
